package com.tencent.mm.plugin.fingerprint.c;

import android.text.TextUtils;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends i
  implements k
{
  public String bQc = "";
  public String jgG = "";
  public String jha = "";
  
  public e(String paramString)
  {
    HashMap localHashMap = new HashMap();
    if (TextUtils.isEmpty(paramString)) {
      x.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is empty");
    }
    for (;;)
    {
      localHashMap.put("encrypted_cert_info", URLEncoder.encode(paramString));
      localHashMap.put("ver", "0x1.0");
      F(localHashMap);
      return;
      x.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is not empty");
    }
  }
  
  public final int If()
  {
    return 1598;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      this.jgG = paramJSONObject.optString("encrypted_device_info");
      this.bQc = paramJSONObject.optString("encrypted_rsa_sign");
      this.jha = paramJSONObject.optString("cert");
      if (!TextUtils.isEmpty(this.jgG)) {
        break label86;
      }
      x.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is empty");
      if (!TextUtils.isEmpty(this.bQc)) {
        break label96;
      }
      x.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is empty");
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.jha)) {
        break label106;
      }
      x.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is empty");
      return;
      label86:
      x.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is not empty");
      break;
      label96:
      x.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is not empty");
    }
    label106:
    x.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is not empty");
  }
  
  public final int aBO()
  {
    return 118;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getopentouchcert";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */