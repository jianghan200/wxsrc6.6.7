package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class n
{
  private static Field AX;
  
  static
  {
    try
    {
      Field localField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
      AX = localField;
      localField.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException) {}
  }
  
  static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    if (AX != null) {}
    try
    {
      AX.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
      return;
    }
    catch (IllegalAccessException paramPopupWindow) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */