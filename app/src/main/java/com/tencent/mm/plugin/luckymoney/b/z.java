package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class z
  extends ab
{
  public String kRb;
  public h kRl;
  public List<String> kRm;
  public String kRn;
  public String kRo = null;
  
  public z(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("limit", String.valueOf(paramInt1));
    localHashMap.put("offset", String.valueOf(paramInt2));
    localHashMap.put("type", String.valueOf(paramInt3));
    localHashMap.put("year", paramString1);
    localHashMap.put("ver", paramString2);
    localHashMap.put("processContent", paramString3);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    try
    {
      paramString = new h();
      paramString.kQk = paramJSONObject.optInt("recTotalNum");
      paramString.kQl = paramJSONObject.optLong("recTotalAmount");
      paramString.kQm = paramJSONObject.optInt("sendTotalNum");
      paramString.kQn = paramJSONObject.optLong("sendTotalAmount");
      paramString.kPV = paramJSONObject.optInt("isContinue");
      paramString.jzh = paramJSONObject.optInt("gameCount");
      JSONArray localJSONArray = paramJSONObject.optJSONArray("record");
      LinkedList localLinkedList = new LinkedList();
      if (localJSONArray != null)
      {
        paramInt = 0;
        while (paramInt < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(paramInt);
          i locali = new i();
          locali.kQo = localJSONObject.optString("sendName");
          locali.kPM = localJSONObject.optString("sendHeadImg");
          locali.kQp = localJSONObject.optLong("receiveAmount");
          locali.kQq = localJSONObject.optString("receiveTime");
          locali.kPI = localJSONObject.optInt("hbType");
          locali.kQr = localJSONObject.optString("sendTitle");
          locali.kQs = localJSONObject.optString("sendTime");
          locali.kPR = localJSONObject.optLong("totalAmount");
          locali.kQt = localJSONObject.optLong("totalNum");
          locali.kPP = localJSONObject.optLong("recNum");
          locali.status = localJSONObject.optInt("status");
          locali.kQu = localJSONObject.optInt("thxCount");
          locali.kPS = localJSONObject.optString("receiveId");
          locali.kLZ = localJSONObject.optString("sendId");
          locali.kQd = localJSONObject.optInt("hbKind");
          localLinkedList.add(locali);
          paramInt += 1;
        }
      }
      paramString.kQe = localLinkedList;
      this.kRl = paramString;
      this.kRm = new ArrayList();
      paramString = paramJSONObject.optString("years");
      if (!bi.oW(paramString))
      {
        paramString = paramString.split("\\|");
        if (paramString != null)
        {
          paramInt = 0;
          while (paramInt < paramString.length)
          {
            this.kRm.add(paramString[paramInt]);
            paramInt += 1;
          }
        }
      }
      this.kRn = paramJSONObject.optString("recordYear");
      this.kRo = paramJSONObject.optString("clickedUrl");
      this.kRb = paramJSONObject.optString("processContent");
      return;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyNormalBase", paramString, "", new Object[0]);
    }
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/qrylistwxhb";
  }
  
  public final boolean baZ()
  {
    return (this.kRl == null) || (this.kRl.kPV == 1);
  }
  
  public final int getType()
  {
    return 1514;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */