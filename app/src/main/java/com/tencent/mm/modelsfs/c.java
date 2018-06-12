package com.tencent.mm.modelsfs;

import java.io.File;
import java.io.FileOutputStream;

public final class c
  extends FileOutputStream
{
  private a eex;
  
  public c(File paramFile, long paramLong)
  {
    super(paramFile);
    this.eex = new a(paramLong);
  }
  
  public c(String paramString1, String paramString2)
  {
    super(paramString1);
    this.eex = new a(paramString2);
  }
  
  public final void close()
  {
    super.close();
    if (this.eex != null) {
      this.eex.free();
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.eex.y(paramArrayOfByte, paramInt2);
    super.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */