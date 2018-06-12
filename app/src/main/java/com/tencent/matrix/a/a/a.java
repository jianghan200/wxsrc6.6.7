package com.tencent.matrix.a.a;

public final class a
{
  public static final a boX = new a().th();
  public final int boY;
  public final int boZ;
  public final int bpa;
  public final int bpb;
  public final int bpc;
  private final int mask;
  
  private a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.mask = paramInt1;
    this.boY = paramInt2;
    this.boZ = paramInt3;
    this.bpa = paramInt4;
    this.bpb = paramInt5;
    this.bpc = paramInt6;
  }
  
  public final boolean el(int paramInt)
  {
    return (this.mask & paramInt) > 0;
  }
  
  public final String toString()
  {
    return String.format("[BatteryCanary.BatteryConfig;mask=%d]", new Object[] { Integer.valueOf(this.mask) });
  }
  
  public static final class a
  {
    private int bpd = 0;
    private int bpe = 120000;
    private int bpf = 20;
    private int bpg = 600000;
    private int bph = 20;
    private int bpi = 12;
    
    public final a em(int paramInt)
    {
      this.bpd |= paramInt;
      return this;
    }
    
    public final a th()
    {
      return new a(this.bpd, this.bpe, this.bpf, this.bpg, this.bph, this.bpi, (byte)0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */