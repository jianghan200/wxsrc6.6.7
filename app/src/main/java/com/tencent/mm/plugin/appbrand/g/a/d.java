package com.tencent.mm.plugin.appbrand.g.a;

import com.eclipsesource.v8.V8Object;

final class d
  extends b
{
  public d()
  {
    super("console");
  }
  
  protected final void a(f paramf, V8Object paramV8Object)
  {
    paramV8Object.registerJavaMethod(new d.1(this), "log");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */