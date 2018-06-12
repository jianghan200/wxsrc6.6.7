package com.tencent.mm.plugin.appbrand.s.e;

import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends g
  implements b
{
  private String gDb = "*";
  
  public final String aoO()
  {
    return this.gDb;
  }
  
  public final void vY(String paramString)
  {
    if (paramString == null)
    {
      x.i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
      return;
    }
    this.gDb = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */