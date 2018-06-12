package com.tencent.mm.wallet_core.c;

import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends i
{
  public String uXa;
  
  public f(String paramString)
  {
    this.uXa = paramString;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("crt_no", p.encode(paramString));
    localHashMap1.put("deviceid", q.getDeviceID(ad.getContext()));
    F(localHashMap1);
    aC(localHashMap2);
  }
  
  public final int If()
  {
    return 1568;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneDeletedigitalcert", "onGYNetEnd %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public final int aBO()
  {
    return 1568;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/deletedigitalcert";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */