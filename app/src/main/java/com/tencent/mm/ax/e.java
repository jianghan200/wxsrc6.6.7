package com.tencent.mm.ax;

import android.content.Context;
import com.tencent.mm.ay.d;
import com.tencent.mm.g.a.jr;
import com.tencent.mm.g.a.jr.b;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class e
{
  public static boolean SA()
  {
    return (d.elh != null) && (d.elh.SB());
  }
  
  public static boolean Sz()
  {
    jr localjr = new jr();
    localjr.bTt.action = 2;
    com.tencent.mm.sdk.b.a.sFg.m(localjr);
    return localjr.bTu.bTv;
  }
  
  public static c a(Context paramContext, int paramInt, Runnable paramRunnable)
  {
    paramContext = new c.a(paramContext);
    paramContext.Gq(a.h.app_tip);
    paramContext.Gr(paramInt);
    paramContext.Gt(a.h.app_i_known).a(new e.1(paramRunnable));
    paramContext.mF(true);
    paramContext.e(new e.2(paramRunnable));
    paramContext = paramContext.anj();
    paramContext.show();
    return paramContext;
  }
  
  public static boolean bw(Context paramContext)
  {
    return com.tencent.mm.p.a.bw(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ax/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */