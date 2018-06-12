package com.tencent.mm.sdk.platformtools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class ac
{
  protected static char[] buX = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected static ThreadLocal<MessageDigest> sGw = new ThreadLocal()
  {
    private static MessageDigest tK()
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        return localMessageDigest;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new RuntimeException("Initialize MD5 failed.", localNoSuchAlgorithmException);
      }
    }
  };
  
  public static String ce(String paramString)
  {
    return t(paramString.getBytes());
  }
  
  public static String t(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ((MessageDigest)sGw.get()).digest(paramArrayOfByte);
    int j = paramArrayOfByte.length;
    StringBuffer localStringBuffer = new StringBuffer(j * 2);
    int i = 0;
    while (i < j + 0)
    {
      int k = paramArrayOfByte[i];
      char c1 = buX[((k & 0xF0) >> 4)];
      char c2 = buX[(k & 0xF)];
      localStringBuffer.append(c1);
      localStringBuffer.append(c2);
      i += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */