package com.tencent.mm.pluginsdk.location;

public final class b
{
  public int bSz;
  public float dRS;
  public float dRT;
  public long qyC;
  public int scene;
  
  public b(long paramLong, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    this.dRS = paramFloat1;
    this.dRT = paramFloat2;
    this.bSz = paramInt1;
    this.scene = paramInt2;
    this.qyC = paramLong;
  }
  
  public final String toString()
  {
    return String.format("%d-%d-%d", new Object[] { Integer.valueOf((int)(this.dRS * 1000000.0F)), Integer.valueOf((int)(this.dRT * 1000000.0F)), Integer.valueOf(this.bSz) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/location/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */