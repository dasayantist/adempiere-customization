/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package zenith.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for hms_request_consumables
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_hms_request_consumables extends PO implements I_hms_request_consumables, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170521L;

    /** Standard Constructor */
    public X_hms_request_consumables (Properties ctx, int hms_request_consumables_ID, String trxName)
    {
      super (ctx, hms_request_consumables_ID, trxName);
      /** if (hms_request_consumables_ID == 0)
        {
			sethms_request_consumables_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Load Constructor */
    public X_hms_request_consumables (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_hms_request_consumables[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set actual_qty.
		@param actual_qty actual_qty	  */
	public void setactual_qty (BigDecimal actual_qty)
	{
		set_Value (COLUMNNAME_actual_qty, actual_qty);
	}

	/** Get actual_qty.
		@return actual_qty	  */
	public BigDecimal getactual_qty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_actual_qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set available_qty.
		@param available_qty available_qty	  */
	public void setavailable_qty (BigDecimal available_qty)
	{
		set_Value (COLUMNNAME_available_qty, available_qty);
	}

	/** Get available_qty.
		@return available_qty	  */
	public BigDecimal getavailable_qty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_available_qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException
    {
		return (org.compiere.model.I_C_Order)MTable.get(getCtx(), org.compiere.model.I_C_Order.Table_Name)
			.getPO(getC_Order_ID(), get_TrxName());	}

	/** Set Order.
		@param C_Order_ID 
		Order
	  */
	public void setC_Order_ID (int C_Order_ID)
	{
		if (C_Order_ID < 1) 
			set_Value (COLUMNNAME_C_Order_ID, null);
		else 
			set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
	}

	/** Get Order.
		@return Order
	  */
	public int getC_Order_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set hms_request_consumables ID.
		@param hms_request_consumables_ID hms_request_consumables ID	  */
	public void sethms_request_consumables_ID (int hms_request_consumables_ID)
	{
		if (hms_request_consumables_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_hms_request_consumables_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_hms_request_consumables_ID, Integer.valueOf(hms_request_consumables_ID));
	}

	/** Get hms_request_consumables ID.
		@return hms_request_consumables ID	  */
	public int gethms_request_consumables_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_hms_request_consumables_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

//	public I_hms_specimen_requests gethms_specimen_requests() throws RuntimeException
//    {
//		return (I_hms_specimen_requests)MTable.get(getCtx(), I_hms_specimen_requests.Table_Name)
//			.getPO(gethms_specimen_requests_ID(), get_TrxName());	}

	/** Set hms_specimen_requests ID.
		@param hms_specimen_requests_ID hms_specimen_requests ID	  */
	public void sethms_specimen_requests_ID (int hms_specimen_requests_ID)
	{
		if (hms_specimen_requests_ID < 1) 
			set_Value (COLUMNNAME_hms_specimen_requests_ID, null);
		else 
			set_Value (COLUMNNAME_hms_specimen_requests_ID, Integer.valueOf(hms_specimen_requests_ID));
	}

	/** Get hms_specimen_requests ID.
		@return hms_specimen_requests ID	  */
	public int gethms_specimen_requests_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_hms_specimen_requests_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_hms_test gethms_test() throws RuntimeException
    {
		return (I_hms_test)MTable.get(getCtx(), I_hms_test.Table_Name)
			.getPO(gethms_test_ID(), get_TrxName());	}

	/** Set hms_test ID.
		@param hms_test_ID hms_test ID	  */
	public void sethms_test_ID (int hms_test_ID)
	{
		if (hms_test_ID < 1) 
			set_Value (COLUMNNAME_hms_test_ID, null);
		else 
			set_Value (COLUMNNAME_hms_test_ID, Integer.valueOf(hms_test_ID));
	}

	/** Get hms_test ID.
		@return hms_test ID	  */
	public int gethms_test_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_hms_test_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set std_qty.
		@param std_qty std_qty	  */
	public void setstd_qty (BigDecimal std_qty)
	{
		set_Value (COLUMNNAME_std_qty, std_qty);
	}

	/** Get std_qty.
		@return std_qty	  */
	public BigDecimal getstd_qty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_std_qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}