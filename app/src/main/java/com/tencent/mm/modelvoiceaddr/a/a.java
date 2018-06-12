package com.tencent.mm.modelvoiceaddr.a;

public final class a
{
  int eqX = 0;
  int eqY = 0;
  int eqZ = 0;
  short[] era;
  
  public a(int paramInt)
  {
    int i = paramInt;
    if (paramInt <= 1) {
      i = 512;
    }
    this.era = new short[i];
  }
  
  final int c(short[] paramArrayOfShort, int paramInt)
  {
    if (paramInt > paramArrayOfShort.length) {
      paramInt = paramArrayOfShort.length;
    }
    for (;;)
    {
      if (paramInt == 0) {
        return 0;
      }
      int i = this.era.length;
      if (paramInt < this.eqZ)
      {
        if (paramInt > i - this.eqX) {
          break label96;
        }
        System.arraycopy(this.era, this.eqX, paramArrayOfShort, 0, paramInt);
        this.eqX += paramInt;
        if (this.eqX < i) {}
      }
      label96:
      int j;
      for (this.eqX = 0;; this.eqX = j)
      {
        this.eqZ -= paramInt;
        return paramInt;
        paramInt = this.eqZ;
        break;
        i -= this.eqX;
        System.arraycopy(this.era, this.eqX, paramArrayOfShort, 0, i);
        j = paramInt - i;
        System.arraycopy(this.era, 0, paramArrayOfShort, i, j);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelvoiceaddr/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */