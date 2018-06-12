package com.tencent.liteav.basic.e;

import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

public final class a
{
  private static String a = "RSA";
  
  public static PrivateKey a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new PKCS8EncodedKeySpec(paramArrayOfByte);
    return KeyFactory.getInstance(a).generatePrivate(paramArrayOfByte);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, PrivateKey paramPrivateKey)
  {
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(2, paramPrivateKey);
    int j = paramArrayOfByte.length;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    if (j - i > 0)
    {
      if (j - i >= localCipher.getBlockSize()) {}
      for (paramPrivateKey = localCipher.doFinal(paramArrayOfByte, i, localCipher.getBlockSize());; paramPrivateKey = localCipher.doFinal(paramArrayOfByte, i, j - i))
      {
        localByteArrayOutputStream.write(paramPrivateKey);
        i = localCipher.getBlockSize() + i;
        break;
      }
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    return paramArrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/basic/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */