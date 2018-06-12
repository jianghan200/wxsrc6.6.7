package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class aq
{
  public static int gs(Context paramContext)
  {
    if (gt(paramContext))
    {
      int i = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
      if (i > 0) {
        return Resources.getSystem().getDimensionPixelSize(i);
      }
    }
    return 0;
  }
  
  @TargetApi(17)
  public static boolean gt(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    localDisplay.getSize(localPoint);
    paramContext = gu(paramContext);
    int i = Math.max(localPoint.y, localPoint.x);
    return Math.max(paramContext.y, paramContext.x) > i;
  }
  
  private static Point gu(Context paramContext)
  {
    Point localPoint = new Point();
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17)
    {
      paramContext.getRealSize(localPoint);
      return localPoint;
    }
    if (Build.VERSION.SDK_INT >= 14) {}
    try
    {
      Method localMethod = Display.class.getMethod("getRawHeight", new Class[0]);
      localPoint.x = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(paramContext, new Object[0])).intValue();
      localPoint.y = ((Integer)localMethod.invoke(paramContext, new Object[0])).intValue();
      return localPoint;
    }
    catch (NoSuchMethodException paramContext)
    {
      return localPoint;
      paramContext.getSize(localPoint);
      return localPoint;
    }
    catch (InvocationTargetException paramContext)
    {
      return localPoint;
    }
    catch (IllegalAccessException paramContext) {}
    return localPoint;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */