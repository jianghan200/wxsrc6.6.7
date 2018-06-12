package com.tencent.mm.plugin.wallet_core.model;

import android.util.Base64;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.security.PublicKey;
import javax.crypto.Cipher;

public final class l
{
  static l pom;
  private PublicKey pon = null;
  
  public final String aW(byte[] paramArrayOfByte)
  {
    try
    {
      this.pon = com.tencent.mm.a.l.p(ad.getContext(), "lbs_rsa_public_key.pem");
      x.i("MicroMsg.LocationEncrypt", "getPemPublickKeyFromAsset23 done2");
      PublicKey localPublicKey = this.pon;
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      localCipher.init(1, localPublicKey);
      paramArrayOfByte = new String(Base64.encode(localCipher.doFinal(paramArrayOfByte), 0));
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("MicroMsg.LocationEncrypt", "encry publicKey error %s", new Object[] { paramArrayOfByte.getMessage() });
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */