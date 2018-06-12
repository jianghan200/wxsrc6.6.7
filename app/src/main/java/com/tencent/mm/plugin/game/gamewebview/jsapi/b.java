package com.tencent.mm.plugin.game.gamewebview.jsapi;

import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public class b
{
  private String fEC;
  private Integer jGr;
  private Integer jGs;
  
  public b()
  {
    Assert.assertTrue("Must declare NAME and CTRL_BYTE in subclasses", true);
  }
  
  private Integer aSt()
  {
    c localc;
    if (this.jGr == null) {
      localc = new c(this, "CTRL_BYTE", null);
    }
    try
    {
      this.jGr = ((Integer)localc.get());
      return this.jGr;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.GameBaseJsApii", "getCtrlByte exp = %s", new Object[] { bi.i(localException) });
      }
    }
  }
  
  private Integer aSv()
  {
    c localc;
    if (this.jGs == null) {
      localc = new c(this, "DO_IN_ENV", null);
    }
    try
    {
      this.jGs = ((Integer)localc.get());
      return this.jGs;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.jGs = null;
      }
    }
  }
  
  public final int aSs()
  {
    return bi.a(aSt(), -1);
  }
  
  public final int aSu()
  {
    return bi.a(aSv(), 0);
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
        x.e("MicroMsg.GameBaseJsApii", "getName exp = %s", new Object[] { bi.i(localException) });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */