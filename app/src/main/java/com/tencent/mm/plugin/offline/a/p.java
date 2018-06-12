package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.compatible.e.q;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends i
{
  public p(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("device_id", q.zz());
    localHashMap.put("passwd", paramString);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 51;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/offline/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */