package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public abstract class b
{
  private String fEC;
  private Integer fED;
  
  public b()
  {
    Assert.assertTrue("Must declare NAME and CTRL_INDEX in subclasses", true);
  }
  
  private Integer ahJ()
  {
    c localc;
    if (this.fED == null) {
      localc = new c(this, "CTRL_INDEX", null);
    }
    try
    {
      this.fED = ((Integer)localc.get());
      return this.fED;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrand.BaseJsApi", "getCtrlIndex exp = %s", new Object[] { bi.i(localException) });
      }
    }
  }
  
  public final int ahI()
  {
    return bi.a(ahJ(), -1);
  }
  
  public final String getName()
  {
    c localc;
    if (bi.oW(this.fEC)) {
      localc = new c(this, "NAME", null);
    }
    try
    {
      this.fEC = ((String)localc.get());
      return this.fEC;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrand.BaseJsApi", "getName exp = %s", new Object[] { bi.i(localException) });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */