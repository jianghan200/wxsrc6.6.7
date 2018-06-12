package com.tencent.matrix.resource.a.a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class a
{
  private static final char[] aca = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static String t(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      Object localObject;
      int i;
      try
      {
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramArrayOfByte);
        paramArrayOfByte = ((MessageDigest)localObject).digest();
        localObject = new StringBuilder();
        int j = paramArrayOfByte.length;
        i = 0;
        if (i < j)
        {
          int k = paramArrayOfByte[i];
          if ((k >= 0) && (k <= 15)) {
            ((StringBuilder)localObject).append('0').append(aca[k]);
          } else {
            ((StringBuilder)localObject).append(aca[(k >> 4 & 0xF)]).append(aca[(k & 0xF)]);
          }
        }
      }
      catch (NoSuchAlgorithmException paramArrayOfByte)
      {
        throw new IllegalStateException(paramArrayOfByte);
      }
      paramArrayOfByte = ((StringBuilder)localObject).toString();
      return paramArrayOfByte;
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */