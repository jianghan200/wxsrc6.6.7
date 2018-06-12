package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.i.a;
import java.util.Arrays;

final class n
{
  private boolean anx;
  public int aoA;
  private final int aox;
  boolean aoy;
  public byte[] aoz;
  
  public n(int paramInt)
  {
    this.aox = paramInt;
    this.aoz = new byte[''];
    this.aoz[2] = 1;
  }
  
  public final void cB(int paramInt)
  {
    boolean bool2 = true;
    if (!this.anx)
    {
      bool1 = true;
      a.ap(bool1);
      if (paramInt != this.aox) {
        break label53;
      }
    }
    label53:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.anx = bool1;
      if (this.anx)
      {
        this.aoA = 3;
        this.aoy = false;
      }
      return;
      bool1 = false;
      break;
    }
  }
  
  public final boolean cC(int paramInt)
  {
    if (!this.anx) {
      return false;
    }
    this.aoA -= paramInt;
    this.anx = false;
    this.aoy = true;
    return true;
  }
  
  public final void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.anx) {
      return;
    }
    paramInt2 -= paramInt1;
    if (this.aoz.length < this.aoA + paramInt2) {
      this.aoz = Arrays.copyOf(this.aoz, (this.aoA + paramInt2) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.aoz, this.aoA, paramInt2);
    this.aoA = (paramInt2 + this.aoA);
  }
  
  public final void reset()
  {
    this.anx = false;
    this.aoy = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/c/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */