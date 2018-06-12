package com.tencent.mm.ui.statusbar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public final class a
{
  public static int aa(Activity paramActivity)
  {
    if (!c.uuT) {}
    while (paramActivity == null) {
      return 0;
    }
    return c.ab(paramActivity).uuW;
  }
  
  public static void c(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramView == null) {}
    do
    {
      do
      {
        return;
      } while (!c.uuT);
      b localb = dQ(paramView);
      if (localb != null)
      {
        localb.ar(paramInt, paramBoolean);
        return;
      }
      paramView = d.cJ(paramView.getContext());
    } while (paramView == null);
    paramView.getWindow().setStatusBarColor(paramInt);
    d.a(paramView.getWindow(), paramBoolean);
  }
  
  private static b dQ(View paramView)
  {
    if (paramView == null)
    {
      return null;
      paramView = (View)paramView;
    }
    for (;;)
    {
      if ((paramView instanceof b)) {
        return (b)paramView;
      }
      paramView = paramView.getParent();
      if ((paramView != null) && ((paramView instanceof ViewGroup))) {
        break;
      }
      return null;
    }
  }
  
  public static void u(View paramView, boolean paramBoolean)
  {
    paramView = dQ(paramView);
    if (paramView != null) {
      paramView.dl(paramBoolean);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/statusbar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */