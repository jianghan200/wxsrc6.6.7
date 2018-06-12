package com.tencent.tencentmap.mapsdk.a;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class w
{
  private static String a = "fdea30d4-c4f3-11e7-ae5f-6c0b84ab3a9e";
  
  public static final byte[] a(String paramString)
  {
    try
    {
      Mac localMac = Mac.getInstance("HmacSHA256");
      localMac.init(new SecretKeySpec(a.getBytes("UTF-8"), "HmacSHA256"));
      paramString = localMac.doFinal(paramString.getBytes());
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      i.a("sha256Encode failed with error:" + paramString.getMessage());
      return null;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      i.a("sha256Encode failed with error:" + paramString.getMessage());
      return null;
    }
    catch (InvalidKeyException paramString)
    {
      i.a("sha256Encode failed with error:" + paramString.getMessage());
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */