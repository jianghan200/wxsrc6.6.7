package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.c;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends i
{
  private boolean caB = true;
  
  public f(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("code_ver", paramString1);
    localHashMap.put("cn", paramString2);
    x.i("MicroMsg.NetSceneOfflineVerifyToken", "reqtoken ver %s cn: %s", new Object[] { paramString1, paramString2 });
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1686;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneOfflineVerifyToken", "respone %d errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      x.i("MicroMsg.NetSceneOfflineVerifyToken", "NetSceneOfflineVerifyToken succ");
      h.mEJ.a(135L, 22L, 1L, true);
      return;
    }
    x.i("MicroMsg.NetSceneOfflineVerifyToken", "NetSceneOfflineVerifyToken fail.errCode = %d ;errMsg = ", new Object[] { Integer.valueOf(paramInt), paramString });
    h.mEJ.a(135L, 23L, 1L, true);
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    if ((paramc.uWZ == 0) && (paramc.errType != 0)) {}
    for (this.caB = false;; this.caB = true)
    {
      x.i("MicroMsg.NetSceneOfflineVerifyToken", "onGYNetEnd2 isBlock %s", new Object[] { Boolean.valueOf(this.caB) });
      return;
    }
  }
  
  public final int aBO()
  {
    return 1686;
  }
  
  public final boolean bkU()
  {
    return this.caB;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlineverifytoken";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/offline/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */