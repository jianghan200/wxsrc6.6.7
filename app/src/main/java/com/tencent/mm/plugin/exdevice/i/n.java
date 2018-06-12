package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.service.o.a;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class n
  extends o.a
{
  private c izu = null;
  
  public n(c paramc)
  {
    Assert.assertNotNull(paramc);
    this.izu = paramc;
  }
  
  public final int aHA()
  {
    return this.izu.isC;
  }
  
  public final int aHB()
  {
    return this.izu.aGB();
  }
  
  public final long aHx()
  {
    x.i("MicroMsg.exdevice.RemoteExDeviceTaskRequest", "getDeviceId : " + this.izu.hjj);
    return this.izu.hjj;
  }
  
  public final byte[] aHy()
  {
    return this.izu.aGC();
  }
  
  public final int aHz()
  {
    return this.izu.aGA();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */