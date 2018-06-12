package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends i
{
  public String lJG;
  public int lJH;
  public String lJI;
  
  public d()
  {
    HashMap localHashMap = new HashMap();
    g.Ek();
    Object localObject = g.Ei().DT().get(aa.a.sXm, null);
    if (localObject != null) {
      localHashMap.put("ack_key", (String)localObject);
    }
    localHashMap.put("timestamp", System.currentTimeMillis());
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt == 0)
    {
      h.mEJ.a(135L, 56L, 1L, true);
      this.lJG = paramJSONObject.optString("appmsg");
      this.lJH = (paramJSONObject.optInt("poll_time") * 1000);
      this.lJI = paramJSONObject.optString("ack_key");
      if (this.lJH > 0)
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sXl, Integer.valueOf(this.lJH));
      }
      g.Ek();
      g.Ei().DT().a(aa.a.sXm, this.lJI);
      return;
    }
    h.mEJ.a(135L, 57L, 1L, true);
  }
  
  public final int aBO()
  {
    return 1981;
  }
  
  public final boolean bkT()
  {
    return false;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlinegetmsg";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/offline/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */