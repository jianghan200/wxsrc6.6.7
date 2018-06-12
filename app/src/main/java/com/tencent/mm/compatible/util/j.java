package com.tencent.mm.compatible.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.tencent.mm.sdk.platformtools.t;

@Deprecated
public final class j
  extends t
{
  public static final int Ag()
  {
    return sFR;
  }
  
  @TargetApi(11)
  public static final void j(Activity paramActivity)
  {
    if (paramActivity == null) {
      return;
    }
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    int j = a.h(paramActivity);
    sFR = paramActivity.getResources().getDisplayMetrics().heightPixels - j - i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/util/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */