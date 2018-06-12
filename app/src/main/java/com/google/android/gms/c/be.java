package com.google.android.gms.c;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class be
{
  protected volatile int baj = -1;
  
  public static final <T extends be> T a(T paramT, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new aw(paramArrayOfByte, paramInt);
      paramT.a(paramArrayOfByte);
      paramArrayOfByte.dz(0);
      return paramT;
    }
    catch (bd paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] c(be parambe)
  {
    byte[] arrayOfByte = new byte[parambe.qS()];
    int i = arrayOfByte.length;
    try
    {
      ax localax = ax.p(arrayOfByte, i);
      parambe.a(localax);
      if (localax.aZX.remaining() != 0) {
        throw new IllegalStateException("Did not write as much data as expected.");
      }
    }
    catch (IOException parambe)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", parambe);
    }
    return arrayOfByte;
  }
  
  public abstract be a(aw paramaw);
  
  public void a(ax paramax) {}
  
  protected int pU()
  {
    return 0;
  }
  
  public be qH()
  {
    return (be)super.clone();
  }
  
  public final int qR()
  {
    if (this.baj < 0) {
      qS();
    }
    return this.baj;
  }
  
  public final int qS()
  {
    int i = pU();
    this.baj = i;
    return i;
  }
  
  public String toString()
  {
    return bf.d(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */