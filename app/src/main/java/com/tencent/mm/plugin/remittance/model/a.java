package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.protocal.c.ch;
import com.tencent.mm.protocal.c.jc;
import com.tencent.mm.protocal.c.xb;
import com.tencent.mm.protocal.c.xc;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  public static JSONObject a(ch paramch)
  {
    if (paramch == null) {
      return new JSONObject();
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("channel", paramch.bVU);
      localJSONObject.put("favor_compose_info", a(paramch.rcG));
      localJSONObject.put("f2f_id", paramch.rcD);
      localJSONObject.put("payok_checksign", paramch.rcF);
      localJSONObject.put("receiver_openid", paramch.myl);
      localJSONObject.put("receiver_username", paramch.rcH);
      localJSONObject.put("scan_scene", paramch.mwQ);
      localJSONObject.put("scene", paramch.scene);
      localJSONObject.put("total_amount", paramch.rcI);
      localJSONObject.put("trans_id", paramch.rcE);
      return localJSONObject;
    }
    catch (Exception paramch)
    {
      x.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramch, "", new Object[0]);
    }
    return localJSONObject;
  }
  
  public static JSONObject a(jc paramjc)
  {
    if (paramjc == null) {
      return new JSONObject();
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      LinkedList localLinkedList = paramjc.rkt;
      new xc();
      localJSONObject.put("favor_info_list", bU(localLinkedList));
      localLinkedList = paramjc.rku;
      new xb();
      localJSONObject.put("favor_compose_result_list", bV(localLinkedList));
      localJSONObject.put("default_fav_compose_id", paramjc.rkv);
      localJSONObject.put("favor_resp_sign", paramjc.rkw);
      localJSONObject.put("no_compose_wording", paramjc.rkx);
      return localJSONObject;
    }
    catch (Exception paramjc)
    {
      x.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramjc, "", new Object[0]);
    }
    return localJSONObject;
  }
  
  public static JSONObject a(xb paramxb)
  {
    if (paramxb == null) {
      return new JSONObject();
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("favor_compose_id", paramxb.rCs);
      LinkedList localLinkedList = paramxb.rkt;
      new xc();
      localJSONObject.put("favor_info_list,", bU(localLinkedList));
      localJSONObject.put("show_favor_amount,", paramxb.rCt);
      localJSONObject.put("show_pay_amount,", paramxb.rCu);
      localJSONObject.put("total_favor_amount,", paramxb.rCv);
      localJSONObject.put("favor_desc", paramxb.mwP);
      localJSONObject.put("compose_sort_flag", paramxb.rCw);
      localJSONObject.put("extend_str", paramxb.rqo);
      return localJSONObject;
    }
    catch (Exception paramxb)
    {
      x.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramxb, "", new Object[0]);
    }
    return localJSONObject;
  }
  
  private static JSONObject a(xc paramxc)
  {
    if (paramxc == null) {
      return new JSONObject();
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("fav_type", paramxc.rCx);
      localJSONObject.put("fav_sub_type", paramxc.rCy);
      localJSONObject.put("fav_property", paramxc.rCz);
      localJSONObject.put("favor_type_desc", paramxc.rCA);
      localJSONObject.put("fav_id", paramxc.rCB);
      localJSONObject.put("fav_name", paramxc.rCC);
      localJSONObject.put("fav_desc", paramxc.rCD);
      localJSONObject.put("favor_use_manual", paramxc.rCE);
      localJSONObject.put("favor_remarks", paramxc.rCF);
      localJSONObject.put("fav_price", paramxc.rCG);
      localJSONObject.put("real_fav_fee", paramxc.rCH);
      localJSONObject.put("fav_scope_type", paramxc.rCI);
      localJSONObject.put("business_receipt_no", paramxc.rCJ);
      localJSONObject.put("unavailable", paramxc.rCK);
      return localJSONObject;
    }
    catch (Exception paramxc)
    {
      x.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramxc, "", new Object[0]);
    }
    return localJSONObject;
  }
  
  private static JSONArray bU(List<xc> paramList)
  {
    if (paramList == null) {
      return new JSONArray();
    }
    localJSONArray = new JSONArray();
    try
    {
      paramList = paramList.iterator();
      int i = 0;
      while (paramList.hasNext())
      {
        localJSONArray.put(i, a((xc)paramList.next()));
        i += 1;
      }
      return localJSONArray;
    }
    catch (Exception paramList)
    {
      x.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramList, "", new Object[0]);
    }
  }
  
  private static JSONArray bV(List<xb> paramList)
  {
    if (paramList == null) {
      return new JSONArray();
    }
    localJSONArray = new JSONArray();
    try
    {
      paramList = paramList.iterator();
      int i = 0;
      while (paramList.hasNext())
      {
        localJSONArray.put(i, a((xb)paramList.next()));
        i += 1;
      }
      return localJSONArray;
    }
    catch (Exception paramList)
    {
      x.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramList, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */