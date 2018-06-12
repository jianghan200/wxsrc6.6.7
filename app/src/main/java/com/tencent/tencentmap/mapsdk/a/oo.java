package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.MeasureSpec;

public final class oo
{
  public static on a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    paramBitmap = kh.a(paramBitmap);
    no localno = new no(7);
    localno.a(paramBitmap);
    return new on(localno);
  }
  
  public static on a(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    try
    {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
      paramView.buildDrawingCache();
      Bitmap localBitmap = paramView.getDrawingCache();
      on localon = a(localBitmap);
      if (localBitmap != null) {
        localBitmap.recycle();
      }
      paramView.destroyDrawingCache();
      return localon;
    }
    catch (Exception paramView) {}
    return null;
  }
  
  public static on a(String paramString)
  {
    no localno = new no(2);
    localno.a(paramString);
    return new on(localno);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/oo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */