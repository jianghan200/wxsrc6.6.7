package com.tencent.mm.modelsfs;

public final class e
  extends SFSOutputStream
{
  private a eex;
  
  public e(long paramLong, String paramString)
  {
    super(paramLong);
    this.eex = new a(paramString);
  }
  
  public final void close()
  {
    super.close();
    if (this.eex != null) {
      this.eex.free();
    }
  }
  
  protected final void finalize()
  {
    super.finalize();
  }
  
  public final void write(int paramInt)
  {
    super.write(paramInt);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.eex.y(paramArrayOfByte, paramInt2);
    super.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */