package com.tencent.mm.c;

import java.io.InputStream;

public final class e
{
  public static final boolean a(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1;
      if (i >= paramInt) {
        bool1 = true;
      }
      int j;
      do
      {
        return bool1;
        j = paramInputStream.read(paramArrayOfByte, i + 0, paramInt - i);
        bool1 = bool2;
      } while (j < 0);
      i += j;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */