package com.tencent.mm.modelsfs;

import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public final class b
  extends FileInputStream
{
  private boolean eet = false;
  private a eex;
  private long eey = 0L;
  
  public b(String paramString, long paramLong)
  {
    super(paramString);
    this.eex = new a(paramLong);
  }
  
  public final void close()
  {
    super.close();
    if (this.eex != null) {
      this.eex.free();
    }
    x.i("MicroMsg.EncInputStream", "close  hashcode " + hashCode());
  }
  
  public final void mark(int paramInt)
  {
    this.eey = this.eex.QF();
  }
  
  public final boolean markSupported()
  {
    return true;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.eet) {
      x.i("MicroMsg.EncInputStream", "read buffer  hashcode " + hashCode() + " " + bi.cjd().toString());
    }
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 < 0) {
      return paramInt1;
    }
    this.eex.y(paramArrayOfByte, paramInt2);
    return paramInt1;
  }
  
  public final void reset()
  {
    getChannel().position(this.eey);
    this.eex.reset();
  }
  
  public final long skip(long paramLong)
  {
    long l = super.skip(paramLong);
    this.eex.seek(paramLong);
    return l;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */