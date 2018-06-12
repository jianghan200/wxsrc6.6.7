package com.tencent.mm.plugin.zero.tasks;

import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;

public final class b
  extends a
{
  public final void execute(g paramg)
  {
    k.b("wechatcommon", getClass().getClassLoader());
    MMBitmapFactory.init();
  }
  
  public final String name()
  {
    return "boot-load-wechatcommon-library";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/zero/tasks/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */