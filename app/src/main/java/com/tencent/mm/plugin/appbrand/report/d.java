package com.tencent.mm.plugin.appbrand.report;

import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.platformtools.x;

public abstract class d
  extends c
{
  public void enter()
  {
    super.enter();
    x.i("MicroMsg.LoggerState", getName() + " [ENTERING]");
  }
  
  public void exit()
  {
    super.exit();
    x.i("MicroMsg.LoggerState", getName() + " [EXITING]");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */