package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends i
{
  public String hTH;
  public long hUf;
  public int hUg;
  public int hUh;
  public int type;
  
  public p(String paramString, int paramInt, long paramLong)
  {
    this.hTH = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bill_id", paramString);
    localHashMap.put("type", String.valueOf(paramInt));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1964;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.hUg = paramJSONObject.optInt("total_num", 0);
    this.hUh = paramJSONObject.optInt("total_amt", 0);
    this.type = paramJSONObject.optInt("type", 0);
    this.hUf = paramJSONObject.optLong("from_timestamp", 0L);
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/f2frmrcvdrcd";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/collect/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */