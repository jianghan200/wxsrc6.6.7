package com.tencent.mm.ui.base;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.MotionEvent;

public final class f
{
  private static boolean J(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (crf())
    {
      bool1 = bool2;
      if (paramMotionEvent.getPointerCount() >= 2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static float K(MotionEvent paramMotionEvent)
  {
    float f1 = i(paramMotionEvent, 0) - i(paramMotionEvent, 1);
    float f2 = j(paramMotionEvent, 0) - j(paramMotionEvent, 1);
    return (float)Math.sqrt(f1 * f1 + f2 * f2);
  }
  
  public static int L(MotionEvent paramMotionEvent)
  {
    if (crf())
    {
      new e();
      return paramMotionEvent.getPointerCount();
    }
    return 1;
  }
  
  public static void a(PointF paramPointF, Bitmap paramBitmap)
  {
    if ((paramPointF == null) || (paramBitmap == null)) {
      return;
    }
    paramPointF.set(paramBitmap.getWidth() / 2.0F, paramBitmap.getHeight() / 2.0F);
  }
  
  public static void a(PointF paramPointF, MotionEvent paramMotionEvent)
  {
    if ((paramPointF == null) || (paramMotionEvent == null)) {
      return;
    }
    float f1 = i(paramMotionEvent, 0);
    float f2 = i(paramMotionEvent, 1);
    float f3 = j(paramMotionEvent, 0);
    float f4 = j(paramMotionEvent, 1);
    paramPointF.set((f1 + f2) / 2.0F, (f3 + f4) / 2.0F);
  }
  
  public static void c(KeyEvent paramKeyEvent)
  {
    if (crf())
    {
      new e();
      paramKeyEvent.startTracking();
    }
  }
  
  public static boolean crf()
  {
    return Build.VERSION.SDK_INT >= 5;
  }
  
  public static boolean d(KeyEvent paramKeyEvent)
  {
    if (crf())
    {
      new e();
      return paramKeyEvent.isTracking();
    }
    return false;
  }
  
  public static boolean e(KeyEvent paramKeyEvent)
  {
    if (crf())
    {
      new e();
      return paramKeyEvent.isCanceled();
    }
    return false;
  }
  
  public static float i(MotionEvent paramMotionEvent, int paramInt)
  {
    if (J(paramMotionEvent))
    {
      new e();
      return paramMotionEvent.getX(paramInt);
    }
    return paramMotionEvent.getX();
  }
  
  public static float j(MotionEvent paramMotionEvent, int paramInt)
  {
    if (J(paramMotionEvent))
    {
      new e();
      return paramMotionEvent.getY(paramInt);
    }
    return paramMotionEvent.getY();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */