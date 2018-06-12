package com.tencent.mm.plugin.appbrand.dynamic.h;

import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.wx_extension.b.b.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static final al fxt = new al(new b.1(), true);
  
  public static void aft()
  {
    if (!e.fC("com.tencent.mm:support"))
    {
      x.i("MicroMsg.DynamicProcessPerformance", "try to kill process failed, current process is not the support process.");
      return;
    }
    int i = b.a.CE().size();
    if (i != 0)
    {
      x.i("MicroMsg.DynamicProcessPerformance", "try to exit process, but has many tasks(%d) running. Abort it.", new Object[] { Integer.valueOf(i) });
      return;
    }
    x.i("MicroMsg.DynamicProcessPerformance", "post delayed(60s) to kill the support process.");
    fxt.J(60000L, 60000L);
  }
  
  public static void afu()
  {
    if (!e.fC("com.tencent.mm:support"))
    {
      x.i("MicroMsg.DynamicProcessPerformance", "try to kill process failed, current process is not the support process.");
      return;
    }
    x.i("MicroMsg.DynamicProcessPerformance", "kill support process");
    fxt.postDelayed(new b.2(), 500L);
  }
  
  public static void afv()
  {
    x.i("MicroMsg.DynamicProcessPerformance", "killAllProcess");
    if (g.fF("com.tencent.mm:tools")) {
      f.a("com.tencent.mm:tools", null, c.class, new b.3());
    }
    if (g.fF("com.tencent.mm:support")) {
      f.a("com.tencent.mm:support", null, c.class, new b.4());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */