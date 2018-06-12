package com.tencent.mm.plugin.zero.tasks;

import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.b.g;
import com.tencent.wcdb.support.Log;

public final class a
  extends com.tencent.mm.kernel.a.c.a
{
  public final void execute(g paramg)
  {
    if (!k.fg("wcdb")) {
      k.b("wcdb", getClass().getClassLoader());
    }
    Log.setLogger(new a.1(this));
  }
  
  public final String name()
  {
    return "boot-db-prepare";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/zero/tasks/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */