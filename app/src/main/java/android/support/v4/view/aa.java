package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;

final class aa
{
  private static Field vM;
  private static boolean vN;
  private static Field vO;
  private static boolean vP;
  
  static int S(View paramView)
  {
    if (!vN) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinWidth");
      vM = localField;
      localField.setAccessible(true);
      vN = true;
      if (vM != null) {
        try
        {
          int i = ((Integer)vM.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  static int T(View paramView)
  {
    if (!vP) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinHeight");
      vO = localField;
      localField.setAccessible(true);
      vP = true;
      if (vO != null) {
        try
        {
          int i = ((Integer)vO.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */