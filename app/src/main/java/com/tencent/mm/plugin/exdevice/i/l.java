package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.service.l.a;
import com.tencent.mm.plugin.exdevice.service.p;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import junit.framework.Assert;

public final class l
  extends l.a
{
  private final long dJL = 15000L;
  private c izJ = null;
  boolean izK = false;
  boolean izL = false;
  Runnable izM = new Runnable()
  {
    public final void run()
    {
      l.a(l.this);
      if (l.b(l.this)) {
        return;
      }
      l.c(l.this).a(-1L, -1, -2, "TimeOut", null);
    }
    
    public final String toString()
    {
      return super.toString() + "|mAsyncTimeOut";
    }
  };
  
  public l(c paramc)
  {
    Assert.assertNotNull(paramc);
    this.izJ = paramc;
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
  {
    if (this.izL) {}
    while (this.izK) {
      return;
    }
    au.Em().cil().removeCallbacks(this.izM);
    au.Em().cil().post(new l.2(this, paramLong, paramInt1, paramInt2, paramString, paramp));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */