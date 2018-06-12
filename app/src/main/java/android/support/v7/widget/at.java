package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class at
{
  private static Method XD;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    try
    {
      Method localMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
      XD = localMethod;
      if (!localMethod.isAccessible()) {
        XD.setAccessible(true);
      }
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
  }
  
  public static void a(View paramView, Rect paramRect1, Rect paramRect2)
  {
    if (XD != null) {}
    try
    {
      XD.invoke(paramView, new Object[] { paramRect1, paramRect2 });
      return;
    }
    catch (Exception paramView) {}
  }
  
  public static boolean bv(View paramView)
  {
    return z.I(paramView) == 1;
  }
  
  public static void bw(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    try
    {
      Method localMethod = paramView.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
      if (!localMethod.isAccessible()) {
        localMethod.setAccessible(true);
      }
      localMethod.invoke(paramView, new Object[0]);
      return;
    }
    catch (IllegalAccessException paramView) {}catch (InvocationTargetException paramView) {}catch (NoSuchMethodException paramView) {}
  }
  
  public static int combineMeasuredStates(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */