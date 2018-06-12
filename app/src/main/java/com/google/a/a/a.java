package com.google.a.a;

public final class a
{
  private int bfG;
  private int bfH;
  private int bfI;
  private int bfJ;
  private int bfK = Integer.MAX_VALUE;
  private int bfL;
  private int bfM = 64;
  private int bfN = 67108864;
  private final byte[] buffer;
  private int bufferSize;
  
  a(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.bfG = 0;
    this.bufferSize = (paramInt + 0);
    this.bfI = 0;
  }
  
  private byte[] dY(int paramInt)
  {
    if (paramInt < 0) {
      throw d.se();
    }
    if (this.bfI + paramInt > this.bfK)
    {
      dZ(this.bfK - this.bfI);
      throw d.sd();
    }
    if (paramInt <= this.bufferSize - this.bfI)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.bfI, arrayOfByte, 0, paramInt);
      this.bfI += paramInt;
      return arrayOfByte;
    }
    throw d.sd();
  }
  
  private void dZ(int paramInt)
  {
    if (paramInt < 0) {
      throw d.se();
    }
    if (this.bfI + paramInt > this.bfK)
    {
      dZ(this.bfK - this.bfI);
      throw d.sd();
    }
    if (paramInt <= this.bufferSize - this.bfI)
    {
      this.bfI += paramInt;
      return;
    }
    throw d.sd();
  }
  
  private void sa()
  {
    this.bufferSize += this.bfH;
    int i = this.bufferSize;
    if (i > this.bfK)
    {
      this.bfH = (i - this.bfK);
      this.bufferSize -= this.bfH;
      return;
    }
    this.bfH = 0;
  }
  
  private byte sc()
  {
    if (this.bfI == this.bufferSize) {
      throw d.sd();
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.bfI;
    this.bfI = (i + 1);
    return arrayOfByte[i];
  }
  
  public final void a(e parame)
  {
    int i = rY();
    if (this.bfL >= this.bfM) {
      throw d.sj();
    }
    i = dV(i);
    this.bfL += 1;
    parame.a(this);
    dT(0);
    this.bfL -= 1;
    dW(i);
  }
  
  public final void dT(int paramInt)
  {
    if (this.bfJ != paramInt) {
      throw d.sh();
    }
  }
  
  public final boolean dU(int paramInt)
  {
    switch (g.ef(paramInt))
    {
    default: 
      throw d.si();
    case 0: 
      rY();
      return true;
    case 1: 
      sc();
      sc();
      sc();
      sc();
      sc();
      sc();
      sc();
      sc();
      return true;
    case 2: 
      dZ(rY());
      return true;
    case 3: 
      int i;
      do
      {
        i = rX();
      } while ((i != 0) && (dU(i)));
      dT(g.aJ(g.eg(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    sc();
    sc();
    sc();
    sc();
    return true;
  }
  
  public final int dV(int paramInt)
  {
    if (paramInt < 0) {
      throw d.se();
    }
    paramInt = this.bfI + paramInt;
    int i = this.bfK;
    if (paramInt > i) {
      throw d.sd();
    }
    this.bfK = paramInt;
    sa();
    return i;
  }
  
  public final void dW(int paramInt)
  {
    this.bfK = paramInt;
    sa();
  }
  
  public final void dX(int paramInt)
  {
    if (paramInt > this.bfI - this.bfG) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.bfI - this.bfG));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    this.bfI = (this.bfG + paramInt);
  }
  
  public final int getPosition()
  {
    return this.bfI - this.bfG;
  }
  
  public final int rX()
  {
    if (this.bfI == this.bufferSize) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.bfJ = 0;
      return 0;
    }
    this.bfJ = rY();
    if (this.bfJ == 0) {
      throw d.sg();
    }
    return this.bfJ;
  }
  
  public final int rY()
  {
    int i = sc();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = sc();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = sc();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = sc();
      if (k >= 0) {
        return i | k << 21;
      }
      j = sc();
      k = i | (k & 0x7F) << 21 | j << 28;
      i = k;
    } while (j >= 0);
    int j = 0;
    for (;;)
    {
      if (j >= 5) {
        break label133;
      }
      i = k;
      if (sc() >= 0) {
        break;
      }
      j += 1;
    }
    label133:
    throw d.sf();
  }
  
  public final long rZ()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = sc();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw d.sf();
  }
  
  public final byte[] readBytes()
  {
    int i = rY();
    if ((i <= this.bufferSize - this.bfI) && (i > 0))
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.bfI, arrayOfByte, 0, i);
      this.bfI = (i + this.bfI);
      return arrayOfByte;
    }
    return dY(i);
  }
  
  public final String readString()
  {
    int i = rY();
    if ((i <= this.bufferSize - this.bfI) && (i > 0))
    {
      String str = new String(this.buffer, this.bfI, i, "UTF-8");
      this.bfI = (i + this.bfI);
      return str;
    }
    return new String(dY(i), "UTF-8");
  }
  
  public final int sb()
  {
    if (this.bfK == Integer.MAX_VALUE) {
      return -1;
    }
    int i = this.bfI;
    return this.bfK - i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */