package com.tencent.mm.compatible.util;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import com.tencent.mm.compatible.a.a;

public final class a
{
  public static int h(Activity paramActivity)
  {
    if ((paramActivity instanceof AppCompatActivity))
    {
      if (((AppCompatActivity)paramActivity).getSupportActionBar() != null) {
        return ((AppCompatActivity)paramActivity).getSupportActionBar().getHeight();
      }
    }
    else if (paramActivity.getActionBar() != null) {
      return paramActivity.getActionBar().getHeight();
    }
    return i(paramActivity);
  }
  
  public static int i(Activity paramActivity)
  {
    TypedValue localTypedValue = new TypedValue();
    if (paramActivity.getTheme().resolveAttribute(a.a.actionBarSize, localTypedValue, true)) {
      return TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramActivity.getResources().getDisplayMetrics());
    }
    if (paramActivity.getTheme().resolveAttribute(16843499, localTypedValue, true)) {
      return TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramActivity.getResources().getDisplayMetrics());
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */