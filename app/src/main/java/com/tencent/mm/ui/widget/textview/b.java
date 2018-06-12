package com.tencent.mm.ui.widget.textview;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.DisplayMetrics;

public final class b
{
  static boolean a(Layout paramLayout, int paramInt)
  {
    return (paramInt > 0) && (paramLayout.getLineForOffset(paramInt) == paramLayout.getLineForOffset(paramInt - 1) + 1);
  }
  
  public static int getScreenWidth(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().widthPixels;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/widget/textview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */