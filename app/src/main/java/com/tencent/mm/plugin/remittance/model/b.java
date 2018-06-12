package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.protocal.c.xb;
import com.tencent.mm.protocal.c.xc;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  public static LinkedList<xb> p(JSONArray paramJSONArray)
  {
    localLinkedList = new LinkedList();
    if (paramJSONArray == null) {}
    for (;;)
    {
      return localLinkedList;
      int i = 0;
      try
      {
        while (i < paramJSONArray.length())
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          xb localxb = new xb();
          localxb.rCs = localJSONObject.optString("favor_compose_id");
          localxb.rCt = localJSONObject.optLong("show_favor_amount");
          localxb.rCu = localJSONObject.optLong("show_pay_amount");
          localxb.rCv = localJSONObject.optString("total_favor_amount");
          localxb.mwP = localJSONObject.optString("favor_desc");
          localxb.rCw = localJSONObject.optLong("compose_sort_flag");
          localxb.rqo = localJSONObject.optString("extend_str");
          localxb.rkt = q(localJSONObject.optJSONArray("favor_info_list"));
          localLinkedList.add(localxb);
          i += 1;
        }
        return localLinkedList;
      }
      catch (Exception paramJSONArray)
      {
        x.printErrStackTrace("MicroMsg.BusiFavorInfoParser", paramJSONArray, "", new Object[0]);
      }
    }
  }
  
  public static LinkedList<xc> q(JSONArray paramJSONArray)
  {
    localLinkedList = new LinkedList();
    if (paramJSONArray == null) {}
    for (;;)
    {
      return localLinkedList;
      int i = 0;
      try
      {
        while (i < paramJSONArray.length())
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          xc localxc = new xc();
          localxc.rCJ = localJSONObject.optString("business_receipt_no");
          localxc.rqo = localJSONObject.optString("extend_str");
          localxc.rCD = localJSONObject.optString("fav_desc");
          localxc.rCB = localJSONObject.optLong("fav_id", 0L);
          localxc.rCC = localJSONObject.optString("fav_name");
          localxc.rCG = localJSONObject.optString("fav_price");
          localxc.rCz = localJSONObject.optLong("fav_property", 0L);
          localxc.rCI = localJSONObject.optInt("fav_scope_type", 0);
          localxc.rCy = localJSONObject.optLong("fav_sub_type", 0L);
          localxc.rCx = localJSONObject.optLong("fav_type", 0L);
          localxc.rCF = localJSONObject.optString("favor_remarks");
          localxc.rCA = localJSONObject.optString("favor_type_desc");
          localxc.rCE = localJSONObject.optString("favor_use_manual");
          localxc.rCH = localJSONObject.optString("real_fav_fee");
          localxc.rCK = localJSONObject.optInt("unavailable");
          localLinkedList.add(localxc);
          i += 1;
        }
        return localLinkedList;
      }
      catch (Exception paramJSONArray)
      {
        x.printErrStackTrace("MicroMsg.BusiFavorInfoParser", paramJSONArray, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */