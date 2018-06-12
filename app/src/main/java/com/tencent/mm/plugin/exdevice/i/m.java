package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.service.o;
import com.tencent.mm.plugin.exdevice.service.p.a;
import junit.framework.Assert;

public final class m
  extends p.a
{
  private n izQ = null;
  l izR = null;
  
  public m(com.tencent.mm.plugin.exdevice.b.c paramc, c paramc1)
  {
    Assert.assertNotNull(paramc);
    Assert.assertNotNull(paramc1);
    this.izQ = new n(paramc);
    this.izR = new l(paramc1);
  }
  
  public final o aHC()
  {
    Assert.assertNotNull(this.izQ);
    return this.izQ;
  }
  
  public final com.tencent.mm.plugin.exdevice.service.l aHD()
  {
    Assert.assertNotNull(this.izR);
    return this.izR;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */