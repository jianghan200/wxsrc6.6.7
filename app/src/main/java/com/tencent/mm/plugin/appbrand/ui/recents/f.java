package com.tencent.mm.plugin.appbrand.ui.recents;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.e;
import com.tencent.mm.plugin.appbrand.appusage.e.b;
import com.tencent.mm.plugin.appbrand.compat.a.a;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import java.util.Set;

final class f
  extends h
  implements e.b, d.b
{
  Activity ftd;
  private a gAm = new a((byte)0);
  d gAn;
  private boolean gAo = false;
  private View.OnClickListener gAp = null;
  volatile boolean mFinished = false;
  
  f(Activity paramActivity, ViewGroup paramViewGroup)
  {
    this.gAn = new d(paramViewGroup, s.j.app_brand_launcher_head_wxagame);
    this.gAn.gzB = this;
    this.ftd = paramActivity;
  }
  
  private static Integer vL(String paramString)
  {
    try
    {
      int i = Color.parseColor(paramString);
      return Integer.valueOf(i);
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public final void a(int paramInt, View paramView)
  {
    if ((paramInt == 0) || (paramInt == d.c.gzO) || (paramInt == d.c.gzN)) {
      x.v("MicroMsg.AppBrandListRecentsListWAGameHeader", "onClick ");
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramInt == d.c.gzQ)
          {
            this.gAn.aoi();
            e.acM().refresh();
            return;
          }
        } while ((paramInt != d.c.gzP) || (this.gAp == null));
        this.gAp.onClick(paramView);
      } while (!this.gAo);
      paramView = this.gAn;
    } while (paramView.gzD.gzV == null);
    paramView.gzD.gzV.animate().alpha(0.0F).setDuration(200L).start();
  }
  
  public final void acN()
  {
    x.i("MicroMsg.AppBrandListRecentsListWAGameHeader", "AppBrandListRecentsListWAGameHeader.onWAGameDataUpdate");
    e.acM();
    if (!e.enabled()) {}
    View localView;
    do
    {
      do
      {
        return;
      } while (this.mFinished);
      localView = this.gAn.gzD.SU;
    } while (localView == null);
    localView.post(new Runnable()
    {
      public final void run()
      {
        if ((f.this.mFinished) || (f.this.gAn.gzD.SU == null)) {
          return;
        }
        f.a(f.this);
      }
    });
  }
  
  final void aog()
  {
    e locale = e.acM();
    df(e.enabled());
    if (!e.enabled()) {
      return;
    }
    if (this != null) {}
    synchronized (locale.mLock)
    {
      locale.flk.add(this);
      locale.refresh();
      this.gAn.aoi();
      this.mFinished = false;
      return;
    }
  }
  
  final View aoh()
  {
    return this.gAn.gzD.SU;
  }
  
  final void onDetached()
  {
    this.mFinished = true;
    e locale = e.acM();
    if (this != null) {
      synchronized (locale.mLock)
      {
        locale.flk.remove(this);
        return;
      }
    }
  }
  
  final void onResume() {}
  
  private static final class a
  {
    String gAt;
    Integer gAu;
    List<String> gAv;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */