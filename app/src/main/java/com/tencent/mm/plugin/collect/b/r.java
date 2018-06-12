package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
  extends i
{
  public boolean dDR = false;
  public List<a> hUJ = new ArrayList();
  public long hUf;
  public int hUg;
  public int hUh;
  private int limit;
  public int type;
  
  public r(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    this.limit = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("last_bill_id", paramString);
    localHashMap.put("num", String.valueOf(paramInt2));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1963;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.hUg = paramJSONObject.optInt("total_num");
    this.hUh = paramJSONObject.optInt("total_amt");
    this.hUf = paramJSONObject.optLong("from_timestamp", 0L);
    this.type = paramJSONObject.optInt("type", 0);
    paramString = paramJSONObject.optJSONArray("records");
    if ((paramString == null) || (paramString.length() <= 0))
    {
      x.i("MicroMsg.NetSceneTenpayF2fRecordList", "empty records");
      if (this.hUJ.size() < this.limit)
      {
        x.i("MicroMsg.NetSceneTenpayF2fRecordList", "finish query");
        this.dDR = true;
      }
      return;
    }
    paramInt = 0;
    while (paramInt < paramString.length()) {
      try
      {
        paramJSONObject = paramString.getJSONObject(paramInt);
        a locala = new a();
        locala.hTH = paramJSONObject.optString("bill_id");
        locala.hTI = paramJSONObject.optString("trans_id");
        locala.timestamp = paramJSONObject.optLong("timestamp", 0L);
        locala.desc = paramJSONObject.optString("desc");
        locala.fee = paramJSONObject.optInt("fee", 0);
        this.hUJ.add(locala);
        paramInt += 1;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NetSceneTenpayF2fRecordList", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/f2frcvdlist";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/collect/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */