package com.tencent.magicbrush.handler;

import com.tencent.magicbrush.a.c.f;
import java.io.UnsupportedEncodingException;

final class d
{
  static String decodeString(byte[] paramArrayOfByte, String paramString)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, paramString);
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      c.f.d("MicroMsg.MBStringCharsetHandler", "UnsupportedDecoding [" + paramString + "] " + paramArrayOfByte.getMessage(), new Object[0]);
    }
    return null;
  }
  
  static byte[] encodeString(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    try
    {
      paramString1 = paramString1.getBytes(paramString2);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      c.f.d("MicroMsg.MBStringCharsetHandler", "UnsupportedEncoding [" + paramString2 + "] " + paramString1.getMessage(), new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/magicbrush/handler/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */