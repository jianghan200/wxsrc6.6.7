package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.mm.plugin.appbrand.s.e;

public final class a
{
  public static int cM(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels) {
      return paramContext.getResources().getDimensionPixelSize(s.e.DefaultActionbarHeightLand);
    }
    return paramContext.getResources().getDimensionPixelSize(s.e.DefaultActionbarHeightPort);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */