package com.google.android.exoplayer2.i;

public final class k
{
  private int aCp;
  private int aCq;
  private int aCr;
  private byte[] data;
  
  public k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    k(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private boolean dc(int paramInt)
  {
    return (2 <= paramInt) && (paramInt < this.aCr) && (this.data[paramInt] == 3) && (this.data[(paramInt - 2)] == 0) && (this.data[(paramInt - 1)] == 0);
  }
  
  private void md()
  {
    if ((this.aCp >= 0) && ((this.aCp < this.aCr) || ((this.aCp == this.aCr) && (this.aCq == 0)))) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      return;
    }
  }
  
  public final void cX(int paramInt)
  {
    int i = this.aCp;
    int j = paramInt / 8;
    this.aCp += j;
    this.aCq = (paramInt - j * 8 + this.aCq);
    if (this.aCq > 7)
    {
      this.aCp += 1;
      this.aCq -= 8;
    }
    for (paramInt = i + 1; paramInt <= this.aCp; paramInt = i + 1)
    {
      i = paramInt;
      if (dc(paramInt))
      {
        this.aCp += 1;
        i = paramInt + 2;
      }
    }
    md();
  }
  
  public final int cY(int paramInt)
  {
    int j = 2;
    this.aCq += paramInt;
    int i = 0;
    if (this.aCq > 8)
    {
      this.aCq -= 8;
      k = i | (this.data[this.aCp] & 0xFF) << this.aCq;
      m = this.aCp;
      if (dc(this.aCp + 1)) {}
      for (i = 2;; i = 1)
      {
        this.aCp = (i + m);
        i = k;
        break;
      }
    }
    int k = this.data[this.aCp];
    int m = this.aCq;
    int n;
    if (this.aCq == 8)
    {
      this.aCq = 0;
      n = this.aCp;
      if (!dc(this.aCp + 1)) {
        break label180;
      }
    }
    for (;;)
    {
      this.aCp = (n + j);
      md();
      return (i | (k & 0xFF) >> 8 - m) & -1 >>> 32 - paramInt;
      label180:
      j = 1;
    }
  }
  
  public final boolean db(int paramInt)
  {
    int m = this.aCp;
    int j = paramInt / 8;
    int i = this.aCp + j;
    int k = this.aCq + paramInt - j * 8;
    paramInt = i;
    j = k;
    if (k > 7)
    {
      paramInt = i + 1;
      j = k - 8;
    }
    i = m + 1;
    while ((i <= paramInt) && (paramInt < this.aCr))
    {
      k = paramInt;
      m = i;
      if (dc(i))
      {
        k = paramInt + 1;
        m = i + 2;
      }
      i = m + 1;
      paramInt = k;
    }
    return (paramInt < this.aCr) || ((paramInt == this.aCr) && (j == 0));
  }
  
  public final void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.data = paramArrayOfByte;
    this.aCp = paramInt1;
    this.aCr = paramInt2;
    this.aCq = 0;
    md();
  }
  
  public final boolean mb()
  {
    if ((this.data[this.aCp] & 128 >> this.aCq) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      mk();
      return bool;
    }
  }
  
  public final void mk()
  {
    int i = this.aCq + 1;
    this.aCq = i;
    int j;
    if (i == 8)
    {
      this.aCq = 0;
      j = this.aCp;
      if (!dc(this.aCp + 1)) {
        break label55;
      }
    }
    label55:
    for (i = 2;; i = 1)
    {
      this.aCp = (i + j);
      md();
      return;
    }
  }
  
  public final boolean ml()
  {
    int k = this.aCp;
    int m = this.aCq;
    int i = 0;
    while ((this.aCp < this.aCr) && (!mb())) {
      i += 1;
    }
    if (this.aCp == this.aCr) {}
    for (int j = 1;; j = 0)
    {
      this.aCp = k;
      this.aCq = m;
      if ((j != 0) || (!db(i * 2 + 1))) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public final int mm()
  {
    int j = mn();
    if (j % 2 == 0) {}
    for (int i = -1;; i = 1) {
      return i * ((j + 1) / 2);
    }
  }
  
  public final int mn()
  {
    int j = 0;
    int i = 0;
    while (!mb()) {
      i += 1;
    }
    if (i > 0) {
      j = cY(i);
    }
    return (1 << i) - 1 + j;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/i/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */