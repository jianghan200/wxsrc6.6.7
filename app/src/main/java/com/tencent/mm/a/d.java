package com.tencent.mm.a;

import android.util.Base64;
import com.tencent.mm.sdk.platformtools.x;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class d
{
  private Cipher bwa;
  private Cipher bwb;
  
  public d(String paramString)
  {
    try
    {
      paramString = new DESKeySpec(paramString.getBytes("UTF8"));
      paramString = SecretKeyFactory.getInstance("DES").generateSecret(paramString);
      IvParameterSpec localIvParameterSpec = new IvParameterSpec("manifest".getBytes("UTF8"));
      this.bwa = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.bwa.init(1, paramString, localIvParameterSpec);
      this.bwb = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.bwb.init(2, paramString, localIvParameterSpec);
      return;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.DESUtil", paramString, "", new Object[0]);
    }
  }
  
  public final String cl(String paramString)
  {
    try
    {
      Object localObject = Base64.decode(paramString, 0);
      localObject = new String(this.bwb.doFinal((byte[])localObject), "UTF8");
      return (String)localObject;
    }
    catch (Exception localException)
    {
      return "[des]" + paramString + "|" + localException.toString();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */