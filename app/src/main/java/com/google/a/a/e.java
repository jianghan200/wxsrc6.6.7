package com.google.a.a;

import java.io.IOException;

public abstract class e
{
  public volatile int bfP = -1;
  
  public static <T extends e> T a(T paramT, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new a(paramArrayOfByte, paramInt);
      paramT.a(paramArrayOfByte);
      paramArrayOfByte.dT(0);
      return paramT;
    }
    catch (d paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] b(e parame)
  {
    byte[] arrayOfByte = new byte[parame.sk()];
    int i = arrayOfByte.length;
    try
    {
      b localb = new b(arrayOfByte, i);
      parame.a(localb);
      if (localb.limit - localb.position != 0) {
        throw new IllegalStateException("Did not write as much data as expected.");
      }
    }
    catch (IOException parame)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", parame);
    }
    return arrayOfByte;
  }
  
  public abstract e a(a parama);
  
  public void a(b paramb) {}
  
  public final int sk()
  {
    int i = sl();
    this.bfP = i;
    return i;
  }
  
  public int sl()
  {
    return 0;
  }
  
  public String toString()
  {
    return f.c(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */