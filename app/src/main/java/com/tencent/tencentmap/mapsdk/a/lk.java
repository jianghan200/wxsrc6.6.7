package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;

public class lk
  extends ImageView
{
  public lk(Context paramContext)
  {
    super(paramContext);
    setClickable(true);
  }
  
  public void a()
  {
    setClickable(false);
    Drawable localDrawable = getBackground();
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    setBackgroundDrawable(null);
  }
  
  public void a(Context paramContext, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    paramBitmap1 = new BitmapDrawable(paramContext.getResources(), paramBitmap1);
    paramContext = new BitmapDrawable(paramContext.getResources(), paramBitmap2);
    localStateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, paramContext);
    localStateListDrawable.addState(View.ENABLED_STATE_SET, paramBitmap1);
    setBackgroundDrawable(localStateListDrawable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */