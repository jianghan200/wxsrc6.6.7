package com.tencent.mm.plugin.fingerprint.c;

import android.os.Build;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends i
  implements k
{
  public f(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("encrypted_open_info", URLEncoder.encode(paramString1));
    localHashMap.put("encrypted_rsa_sign", URLEncoder.encode(paramString2));
    localHashMap.put("passwd", paramString3);
    F(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("device_type", Build.MODEL);
    paramString1.put("open_scene", String.valueOf(paramInt));
    aC(paramString1);
  }
  
  public final int If()
  {
    return 1599;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      x.i("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay success");
      e.fa(true);
      return;
    }
    x.e("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay failed");
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 119;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/androidopentouch";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */