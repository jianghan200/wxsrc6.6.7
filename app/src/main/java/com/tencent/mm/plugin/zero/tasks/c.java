package com.tencent.mm.plugin.zero.tasks;

import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.modelsfs.FileOp;

public final class c
  extends a
{
  public final void execute(g paramg)
  {
    FileOp.init(paramg.ES());
  }
  
  public final String name()
  {
    return "boot-sfs";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/zero/tasks/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */