package com.tencent.tinker.a.b.a;

public final class h
  extends a
{
  public short[] vqb;
  
  public h(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("initSize < 0");
    }
    this.vqb = new short[paramInt];
  }
  
  public final void a(short paramShort1, short paramShort2, short paramShort3)
  {
    c(paramShort1);
    c(paramShort2);
    c(paramShort3);
  }
  
  public final void c(short paramShort)
  {
    int i = this.vpT;
    if (this.vqb.length - i <= 0)
    {
      short[] arrayOfShort = new short[this.vqb.length + (this.vqb.length >> 1)];
      System.arraycopy(this.vqb, 0, arrayOfShort, 0, i);
      this.vqb = arrayOfShort;
    }
    this.vqb[this.vpT] = paramShort;
    cGR();
  }
  
  public final void c(short paramShort1, short paramShort2)
  {
    c(paramShort1);
    c(paramShort2);
  }
  
  public final void writeInt(int paramInt)
  {
    c((short)paramInt);
    c((short)(paramInt >> 16));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tinker/a/b/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */