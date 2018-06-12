package com.tencent.mm.plugin.i;

import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;

public final class c
  extends a
{
  public final void execute(g paramg)
  {
    k.b("tencentloc", getClass().getClassLoader());
  }
  
  public final String name()
  {
    return "boot-load-tencentloc-library";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */