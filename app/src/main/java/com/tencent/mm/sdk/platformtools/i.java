package com.tencent.mm.sdk.platformtools;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.nio.channels.FileChannel;

public final class i
  extends FilterInputStream
{
  private long eey = 0L;
  
  public i(FileInputStream paramFileInputStream)
  {
    super(paramFileInputStream);
  }
  
  public final void mark(int paramInt)
  {
    try
    {
      this.eey = ((FileInputStream)this.in).getChannel().position();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.FileSeekingInputStream", localException, "Failed seeking FileChannel.", new Object[0]);
    }
  }
  
  public final boolean markSupported()
  {
    return true;
  }
  
  public final void reset()
  {
    ((FileInputStream)this.in).getChannel().position(this.eey);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */