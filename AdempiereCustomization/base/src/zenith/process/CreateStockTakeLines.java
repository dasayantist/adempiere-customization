package zenith.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.compiere.model.MStorage;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import zenith.model.X_hms_stock_take_header;
import zenith.model.hms_stock_take;

public class CreateStockTakeLines extends SvrProcess
{

	int headerID = 0;

	@Override
	protected void prepare()
	{
		X_hms_stock_take_header head = new X_hms_stock_take_header(getCtx(), getRecord_ID(), get_TrxName());
		headerID = head.gethms_stock_take_header_ID();
	}

	@Override
	protected String doIt() throws Exception
	{
		String sql = "SELECT M_Product_ID FROM adempiere.M_Product WHERE producttype='I' ORDER BY name ";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try
		{
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next())
			{
				int M_Product_ID = rs.getInt(1);
				getStorage(M_Product_ID);
			}

		} catch (Exception ex)
		{

		} finally
		{
			stm.close();
			rs.close();
			stm = null;
			rs = null;
		}
		return null;
	}

	private void getStorage(int M_Product_ID) throws Exception
	{

		String sql = "SELECT * FROM adempiere.M_Storage WHERE M_Product_ID =" + M_Product_ID;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try
		{
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next())
			{
				MStorage storage = new MStorage(getCtx(), rs, get_TrxName());
				createNonStorageLine(storage);
			}

		} catch (Exception ex)
		{
			ex.printStackTrace();
		} finally
		{
			stm.close();
			rs.close();
			stm = null;
			rs = null;
		}
	}

	private void createNonStorageLine(MStorage s)
	{
		hms_stock_take line = new hms_stock_take(getCtx(), 0, get_TrxName());
		line.setM_Product_ID(s.getM_Product_ID());
		line.setM_Locator_ID(s.getM_Locator_ID());
		line.setM_AttributeSetInstance_ID(s.getM_AttributeSetInstance_ID());
		line.sethms_stock_take_header_ID(headerID);
		line.setQty(s.getQtyOnHand());
		line.setphysical_qty(s.getQtyOnHand());
		line.save();
	}
}
