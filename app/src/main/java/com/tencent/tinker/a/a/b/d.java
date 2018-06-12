package com.tencent.tinker.a.a.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class d
{
  public static byte[] c(InputStream paramInputStream, int paramInt)
  {
    int i = paramInt;
    if (paramInt <= 0) {
      i = 32768;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(i);
    byte[] arrayOfByte = new byte[' '];
    for (;;)
    {
      paramInt = paramInputStream.read(arrayOfByte);
      if (paramInt <= 0) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, paramInt);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static byte[] m(InputStream paramInputStream)
  {
    return c(paramInputStream, 32768);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tinker/a/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */