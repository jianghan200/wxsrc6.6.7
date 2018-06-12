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

public final class q
  extends i
{
  public boolean dDR = false;
  public String fFG;
  public boolean hUE = false;
  public int hUF;
  public int hUG;
  public int hUH;
  public int hUI;
  public List<h> hUJ = new ArrayList();
  public long hUf;
  private int limit;
  
  public q(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    this.limit = paramInt2;
    this.hUG = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("direction_flag", "0");
    localHashMap.put("num", String.valueOf(paramInt2));
    localHashMap.put("choose_flag", String.valueOf(paramInt3));
    F(localHashMap);
  }
  
  public q(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.hUE = true;
    this.limit = paramInt3;
    this.hUG = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("direction_flag", String.valueOf(paramInt2));
    localHashMap.put("num", String.valueOf(paramInt3));
    localHashMap.put("choose_flag", String.valueOf(paramInt4));
    localHashMap.put("try_num", String.valueOf(paramInt5));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1993;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "json: %s", new Object[] { paramJSONObject.toString() });
    this.hUF = paramJSONObject.optInt("choose_flag", 0);
    this.hUf = paramJSONObject.optLong("from_timestamp", -1L);
    this.hUH = paramJSONObject.optInt("finish_flag", 0);
    this.hUI = paramJSONObject.optInt("try_num", 0);
    this.fFG = paramJSONObject.optString("retmsg", "");
    paramString = paramJSONObject.optJSONArray("records");
    if ((paramString == null) || (paramString.length() <= 0))
    {
      x.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "empty records");
      if (this.hUH == 1)
      {
        x.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "finish query");
        this.dDR = true;
      }
      return;
    }
    paramInt = 0;
    while (paramInt < paramString.length()) {
      try
      {
        paramJSONObject = paramString.getJSONObject(paramInt);
        h localh = new h();
        localh.type = paramJSONObject.optInt("type", 0);
        localh.hUf = paramJSONObject.optLong("from_timestamp", 0L);
        localh.hUg = paramJSONObject.optInt("total_num", 0);
        localh.hUh = paramJSONObject.optInt("total_amt", 0);
        this.hUJ.add(localh);
        paramInt += 1;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NetSceneTenpayF2fHistoryRecordList", paramJSONObject, "", new Object[0]);
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
    return "/cgi-bin/mmpay-bin/f2frcvrcdhissta";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/collect/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */