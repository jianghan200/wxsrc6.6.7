package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

final class d
{
  private static Field yM;
  private static boolean yN;
  
  static Drawable a(CompoundButton paramCompoundButton)
  {
    if (!yN) {}
    try
    {
      Field localField = CompoundButton.class.getDeclaredField("mButtonDrawable");
      yM = localField;
      localField.setAccessible(true);
      yN = true;
      if (yM != null) {
        try
        {
          paramCompoundButton = (Drawable)yM.get(paramCompoundButton);
          return paramCompoundButton;
        }
        catch (IllegalAccessException paramCompoundButton)
        {
          yM = null;
        }
      }
      return null;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */