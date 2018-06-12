package com.tencent.matrix.iocanary.a;

public final class a
{
  public static final a bqL;
  public final int bqM;
  public final int bqN;
  private final int bqO;
  public final int bqP;
  private final int mask;
  
  static
  {
    a locala = new a();
    bqL = new a(locala.bpd, locala.bqQ, locala.bqR, locala.bqS, locala.bqT, (byte)0);
  }
  
  private a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.mask = paramInt1;
    this.bqM = paramInt2;
    this.bqO = paramInt4;
    this.bqN = paramInt3;
    this.bqP = paramInt5;
  }
  
  public final boolean el(int paramInt)
  {
    return (this.mask & paramInt) > 0;
  }
  
  public final String toString()
  {
    return String.format("[IOCanary.IOConfig;mask=%d]", new Object[] { Integer.valueOf(this.mask) });
  }
  
  public static final class a
  {
    int bpd = -1;
    int bqQ = 500;
    int bqR = 4096;
    int bqS = 20;
    int bqT = 5;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/iocanary/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */