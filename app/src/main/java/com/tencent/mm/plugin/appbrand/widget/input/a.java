package com.tencent.mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Method;

public final class a
{
  public static final boolean gGe;
  public final Activity activity;
  public boolean gGf = false;
  public int gGg = 0;
  
  static
  {
    if (Build.VERSION.SDK_INT < 20) {}
    for (boolean bool = true;; bool = false)
    {
      gGe = bool;
      return;
    }
  }
  
  public a(Activity paramActivity)
  {
    this.activity = paramActivity;
  }
  
  public static boolean cO(Context paramContext)
  {
    paramContext = paramContext.getResources();
    int i = paramContext.getIdentifier("config_showNavigationBar", "bool", "android");
    if (i > 0) {}
    for (boolean bool1 = paramContext.getBoolean(i);; bool1 = false)
    {
      try
      {
        paramContext = Class.forName("android.os.SystemProperties");
        paramContext = (String)paramContext.getMethod("get", new Class[] { String.class }).invoke(paramContext, new Object[] { "qemu.hw.mainkeys" });
        if ("1".equals(paramContext)) {
          return false;
        }
        boolean bool2 = "0".equals(paramContext);
        if (bool2) {
          return true;
        }
      }
      catch (Exception paramContext) {}
      return bool1;
    }
  }
  
  public final void a(l paraml)
  {
    Point localPoint = new Point();
    this.activity.getWindowManager().getDefaultDisplay().getSize(localPoint);
    int j = e.eL(this.activity);
    int k = localPoint.y;
    if ((this.activity.getWindow() != null) && ((this.activity.getWindow().getAttributes().flags & 0x400) > 0)) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        j = 0;
      }
      i = k - j;
      x.i("MicroMsg.AppBrandFixInputIssuesActivityHelper", "fixLayoutHeightBelow20 forceHeight %d", new Object[] { Integer.valueOf(i) });
      paraml.setForceHeight(i);
      return;
    }
  }
  
  public final void apf()
  {
    if ((!this.gGf) || (this.activity.isFinishing())) {}
    while (!gGe) {
      return;
    }
    l locall = l.m(this.activity);
    if (locall == null)
    {
      x.w("MicroMsg.AppBrandFixInputIssuesActivityHelper", "fixLayoutHeightIfNeed get null rootLayout");
      return;
    }
    a(locall);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */