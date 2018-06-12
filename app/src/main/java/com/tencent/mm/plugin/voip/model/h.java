package com.tencent.mm.plugin.voip.model;

import java.io.InputStream;
import java.io.OutputStream;

final class h
{
  protected e oJg = new e();
  int oJh;
  private InputStream oJi;
  private int oJj;
  private int oJk;
  private final OutputStream oJl;
  private int[] oJm = new int[8];
  int oJn;
  
  public h(InputStream paramInputStream)
  {
    this.oJi = paramInputStream;
    this.oJl = null;
    this.oJj = paramInputStream.read();
    this.oJk = paramInputStream.read();
  }
  
  public h(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    this.oJi = paramInputStream;
    this.oJl = paramOutputStream;
    this.oJj = paramInputStream.read();
    this.oJk = paramInputStream.read();
  }
  
  private int bJD()
  {
    int j = 0;
    int i = 0;
    while (iM(true) == 0) {
      i += 1;
    }
    if (i > 0)
    {
      long l = yo(i);
      j = (int)((1 << i) - 1 + l);
    }
    return j;
  }
  
  private void bJG()
  {
    int i = this.oJm[0];
    int j = this.oJm[1];
    int k = this.oJm[2];
    int m = this.oJm[3];
    int n = this.oJm[4];
    int i1 = this.oJm[5];
    int i2 = this.oJm[6];
    int i3 = this.oJm[7];
    this.oJl.write(i << 7 | j << 6 | k << 5 | m << 4 | n << 3 | i1 << 2 | i2 << 1 | i3);
  }
  
  private int iM(boolean paramBoolean)
  {
    int i = -1;
    if (this.oJh == 8)
    {
      this.oJj = this.oJk;
      this.oJk = this.oJi.read();
      this.oJh = 0;
      if (this.oJj != -1) {}
    }
    int j;
    do
    {
      do
      {
        return i;
        j = this.oJj >> 7 - this.oJh & 0x1;
        this.oJh += 1;
        i = j;
      } while (!paramBoolean);
      i = j;
    } while (this.oJl == null);
    ys(j);
    return j;
  }
  
  private long yo(int paramInt)
  {
    if (paramInt > 64) {
      throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }
    long l = 0L;
    int i = 0;
    while (i < paramInt)
    {
      l = l << 1 | iM(true);
      i += 1;
    }
    return l;
  }
  
  public final void A(long paramLong, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      ys((int)(paramLong >> paramInt - i - 1) & 0x1);
      i += 1;
    }
  }
  
  public final long bJC()
  {
    long l = yo(8);
    return l;
  }
  
  public final int bJE()
  {
    int i = bJD();
    return i;
  }
  
  public final void bJF()
  {
    int i = 0;
    while (iM(true) == 0) {
      i += 1;
    }
    if (i > 0) {
      yp(i);
    }
  }
  
  public final void flush()
  {
    int i = this.oJn;
    while (i < 8)
    {
      this.oJm[i] = 0;
      i += 1;
    }
    this.oJn = 0;
    bJG();
  }
  
  public final boolean iL(boolean paramBoolean)
  {
    return iM(paramBoolean) == 1;
  }
  
  public final void iN(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ys(i);
      return;
    }
  }
  
  public final void yp(int paramInt)
  {
    if (paramInt > 64) {
      throw new IllegalArgumentException("Can not skip more then 64 bit");
    }
    int i = 0;
    while (i < paramInt)
    {
      iM(true);
      i += 1;
    }
  }
  
  public final void yq(int paramInt)
  {
    yp(paramInt);
  }
  
  public final void yr(int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    int k = 0;
    int m = 8;
    int i = 8;
    if (k < paramInt)
    {
      int j = m;
      if (m != 0)
      {
        j = bJD();
        j = ((j & 0x1) + (j >> 1)) * (((j & 0x1) << 1) - 1);
        j = (j + i + 256) % 256;
      }
      if (j == 0) {}
      for (;;)
      {
        arrayOfInt[k] = i;
        i = arrayOfInt[k];
        k += 1;
        m = j;
        break;
        i = j;
      }
    }
  }
  
  public final void ys(int paramInt)
  {
    if (this.oJn == 8)
    {
      this.oJn = 0;
      bJG();
    }
    int[] arrayOfInt = this.oJm;
    int i = this.oJn;
    this.oJn = (i + 1);
    arrayOfInt[i] = paramInt;
  }
  
  public final void yt(int paramInt)
  {
    int i = 0;
    int j = 0;
    if (i < 15) {
      if (paramInt >= (1 << i) + j) {}
    }
    for (;;)
    {
      A(0L, i);
      ys(1);
      A(paramInt - j, i);
      return;
      j += (1 << i);
      i += 1;
      break;
      i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */