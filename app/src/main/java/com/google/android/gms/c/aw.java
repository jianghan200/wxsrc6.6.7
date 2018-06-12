package com.google.android.gms.c;

public final class aw
{
  int aZO;
  int aZP;
  private int aZQ;
  int aZR;
  private int aZS;
  private int aZT = Integer.MAX_VALUE;
  private int aZU;
  private int aZV = 64;
  private int aZW = 67108864;
  final byte[] buffer;
  
  aw(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.aZO = 0;
    this.aZP = (paramInt + 0);
    this.aZR = 0;
  }
  
  private void dF(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.qL();
    }
    if (this.aZR + paramInt > this.aZT)
    {
      dF(this.aZT - this.aZR);
      throw bd.qK();
    }
    if (paramInt <= this.aZP - this.aZR)
    {
      this.aZR += paramInt;
      return;
    }
    throw bd.qK();
  }
  
  private void qC()
  {
    this.aZP += this.aZQ;
    int i = this.aZP;
    if (i > this.aZT)
    {
      this.aZQ = (i - this.aZT);
      this.aZP -= this.aZQ;
      return;
    }
    this.aZQ = 0;
  }
  
  private byte qE()
  {
    if (this.aZR == this.aZP) {
      throw bd.qK();
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.aZR;
    this.aZR = (i + 1);
    return arrayOfByte[i];
  }
  
  public final void a(be parambe)
  {
    int i = qz();
    if (this.aZU >= this.aZV) {
      throw bd.qQ();
    }
    i = dB(i);
    this.aZU += 1;
    parambe.a(this);
    dz(0);
    this.aZU -= 1;
    dC(i);
  }
  
  public final boolean dA(int paramInt)
  {
    switch (bh.dO(paramInt))
    {
    default: 
      throw bd.qP();
    case 0: 
      qz();
      return true;
    case 1: 
      qB();
      return true;
    case 2: 
      dF(qz());
      return true;
    case 3: 
      int i;
      do
      {
        i = qw();
      } while ((i != 0) && (dA(i)));
      dz(bh.aC(bh.dP(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    qA();
    return true;
  }
  
  public final int dB(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.qL();
    }
    paramInt = this.aZR + paramInt;
    int i = this.aZT;
    if (paramInt > i) {
      throw bd.qK();
    }
    this.aZT = paramInt;
    qC();
    return i;
  }
  
  public final void dC(int paramInt)
  {
    this.aZT = paramInt;
    qC();
  }
  
  public final void dD(int paramInt)
  {
    if (paramInt > this.aZR - this.aZO) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.aZR - this.aZO));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    this.aZR = (this.aZO + paramInt);
  }
  
  public final byte[] dE(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.qL();
    }
    if (this.aZR + paramInt > this.aZT)
    {
      dF(this.aZT - this.aZR);
      throw bd.qK();
    }
    if (paramInt <= this.aZP - this.aZR)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.aZR, arrayOfByte, 0, paramInt);
      this.aZR += paramInt;
      return arrayOfByte;
    }
    throw bd.qK();
  }
  
  public final void dz(int paramInt)
  {
    if (this.aZS != paramInt) {
      throw bd.qO();
    }
  }
  
  public final int getPosition()
  {
    return this.aZR - this.aZO;
  }
  
  public final int qA()
  {
    return qE() & 0xFF | (qE() & 0xFF) << 8 | (qE() & 0xFF) << 16 | (qE() & 0xFF) << 24;
  }
  
  public final long qB()
  {
    int i = qE();
    int j = qE();
    int k = qE();
    int m = qE();
    int n = qE();
    int i1 = qE();
    int i2 = qE();
    int i3 = qE();
    long l = i;
    return (j & 0xFF) << 8 | l & 0xFF | (k & 0xFF) << 16 | (m & 0xFF) << 24 | (n & 0xFF) << 32 | (i1 & 0xFF) << 40 | (i2 & 0xFF) << 48 | (i3 & 0xFF) << 56;
  }
  
  public final int qD()
  {
    if (this.aZT == Integer.MAX_VALUE) {
      return -1;
    }
    int i = this.aZR;
    return this.aZT - i;
  }
  
  public final int qw()
  {
    if (this.aZR == this.aZP) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.aZS = 0;
      return 0;
    }
    this.aZS = qz();
    if (this.aZS == 0) {
      throw bd.qN();
    }
    return this.aZS;
  }
  
  public final long qx()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = qE();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw bd.qM();
  }
  
  public final boolean qy()
  {
    return qz() != 0;
  }
  
  public final int qz()
  {
    int i = qE();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = qE();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = qE();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = qE();
      if (k >= 0) {
        return i | k << 21;
      }
      j = qE();
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
      if (qE() >= 0) {
        break;
      }
      j += 1;
    }
    label133:
    throw bd.qM();
  }
  
  public final String readString()
  {
    int i = qz();
    if ((i <= this.aZP - this.aZR) && (i > 0))
    {
      String str = new String(this.buffer, this.aZR, i, "UTF-8");
      this.aZR = (i + this.aZR);
      return str;
    }
    return new String(dE(i), "UTF-8");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/c/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */