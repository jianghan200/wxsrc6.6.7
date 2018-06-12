package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class i
{
  private static Method fa;
  private static boolean fb;
  private static Field fc;
  private static boolean fd;
  
  static boolean a(DrawableContainer paramDrawableContainer, Drawable.ConstantState paramConstantState)
  {
    if (!fb) {}
    try
    {
      Method localMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[] { DrawableContainer.DrawableContainerState.class });
      fa = localMethod;
      localMethod.setAccessible(true);
      fb = true;
      if (fa != null) {
        try
        {
          fa.invoke(paramDrawableContainer, new Object[] { paramConstantState });
          return true;
        }
        catch (Exception paramDrawableContainer) {}
      }
      return false;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  static boolean b(DrawableContainer paramDrawableContainer, Drawable.ConstantState paramConstantState)
  {
    if (!fd) {}
    try
    {
      Field localField = DrawableContainer.class.getDeclaredField("mDrawableContainerStateField");
      fc = localField;
      localField.setAccessible(true);
      fd = true;
      if (fc != null) {
        try
        {
          fc.set(paramDrawableContainer, paramConstantState);
          return true;
        }
        catch (Exception paramDrawableContainer) {}
      }
      return false;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/android/support/design/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */