package com.google.android.exoplayer2.i;

public final class i
{
  public int aCp;
  public int aCq;
  private int aCr;
  public byte[] data;
  
  public i() {}
  
  public i(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public i(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.aCr = paramInt;
  }
  
  public final void cX(int paramInt)
  {
    int i = paramInt / 8;
    this.aCp += i;
    this.aCq = (paramInt - i * 8 + this.aCq);
    if (this.aCq > 7)
    {
      this.aCp += 1;
      this.aCq -= 8;
    }
    md();
  }
  
  public final int cY(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    this.aCq += paramInt;
    int i = 0;
    while (this.aCq > 8)
    {
      this.aCq -= 8;
      byte[] arrayOfByte = this.data;
      j = this.aCp;
      this.aCp = (j + 1);
      i |= (arrayOfByte[j] & 0xFF) << this.aCq;
    }
    int j = this.data[this.aCp];
    int k = this.aCq;
    if (this.aCq == 8)
    {
      this.aCq = 0;
      this.aCp += 1;
    }
    md();
    return (i | (j & 0xFF) >> 8 - k) & -1 >>> 32 - paramInt;
  }
  
  public final int lZ()
  {
    return (this.aCr - this.aCp) * 8 - this.aCq;
  }
  
  public final void m(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.aCp = 0;
    this.aCq = 0;
    this.aCr = paramInt;
  }
  
  public final int ma()
  {
    if (this.aCq == 0) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      return this.aCp;
    }
  }
  
  public final boolean mb()
  {
    if ((this.data[this.aCp] & 128 >> this.aCq) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      int i = this.aCq + 1;
      this.aCq = i;
      if (i == 8)
      {
        this.aCq = 0;
        this.aCp += 1;
      }
      md();
      return bool;
    }
  }
  
  public final void mc()
  {
    if (this.aCq == 0) {
      return;
    }
    this.aCq = 0;
    this.aCp += 1;
    md();
  }
  
  public final void md()
  {
    if ((this.aCp >= 0) && ((this.aCp < this.aCr) || ((this.aCp == this.aCr) && (this.aCq == 0)))) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      return;
    }
  }
  
  public final void n(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.aCq == 0) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      System.arraycopy(this.data, this.aCp, paramArrayOfByte, 0, paramInt);
      this.aCp += paramInt;
      md();
      return;
    }
  }
  
  public final void setPosition(int paramInt)
  {
    this.aCp = (paramInt / 8);
    this.aCq = (paramInt - this.aCp * 8);
    md();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/i/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */