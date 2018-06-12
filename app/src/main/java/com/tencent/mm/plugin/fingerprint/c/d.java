package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fingerprint.a;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.soter.c.b;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends i
  implements com.tencent.mm.network.k
{
  public d()
  {
    HashMap localHashMap = new HashMap();
    Object localObject = b.bFh();
    String str = ((c)localObject).onE;
    localObject = ((c)localObject).onF;
    localHashMap.put("cpu_id", str);
    localHashMap.put("uid", localObject);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1597;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    h.mEJ.h(13686, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      e.fa(false);
      x.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi success!");
      return;
    }
    x.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi failed!");
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt == 0) {
      if (paramJSONObject == null) {
        break label46;
      }
    }
    label46:
    for (paramInt = paramJSONObject.optInt("clear_rsa_key_level", 0);; paramInt = 0)
    {
      a.aMW();
      a.aMX();
      ((com.tencent.mm.pluginsdk.k)g.l(com.tencent.mm.pluginsdk.k.class)).aNp();
      return;
      x.e("MicroMsg.NetSceneTenpayCloseTouchPay", "do close fingerprint cgi failed!");
      return;
    }
  }
  
  public final int aBO()
  {
    return 116;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/closetouchpay";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */