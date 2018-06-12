package com.tencent.mm.plugin.appbrand.b;

import com.tencent.mm.plugin.appbrand.report.d;

abstract class g
  extends d
{
  private final h fjL;
  
  g(h paramh)
  {
    this.fjL = paramh;
  }
  
  public void enter()
  {
    super.enter();
    this.fjL.a(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */