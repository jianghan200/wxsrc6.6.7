package com.tencent.mm.modelsfs;

public final class d
  extends SFSInputStream
{
  private a eex;
  
  public d(long paramLong1, long paramLong2)
  {
    super(paramLong1);
    this.eex = new a(paramLong2);
  }
  
  public final void close()
  {
    super.close();
    if (this.eex != null) {
      this.eex.free();
    }
  }
  
  public final void mark(int paramInt)
  {
    super.mark(paramInt);
    this.eex.QF();
  }
  
  public final int read()
  {
    return super.read();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 < 0) {
      return paramInt1;
    }
    this.eex.y(paramArrayOfByte, paramInt2);
    return paramInt1;
  }
  
  public final void reset()
  {
    super.reset();
    this.eex.reset();
  }
  
  public final long skip(long paramLong)
  {
    long l = super.skip(paramLong);
    this.eex.seek(paramLong);
    return l;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */