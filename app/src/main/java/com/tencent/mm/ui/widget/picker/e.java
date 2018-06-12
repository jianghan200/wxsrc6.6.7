package com.tencent.mm.ui.widget.picker;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.tencent.mm.ui.aj;
import java.lang.reflect.Field;

public final class e
{
  public static void a(NumberPicker paramNumberPicker, Drawable paramDrawable)
  {
    if (paramNumberPicker != null) {
      try
      {
        paramNumberPicker = new aj(paramNumberPicker, "mSelectionDivider");
        paramNumberPicker.prepare();
        if (paramNumberPicker.dfG == null) {
          throw new NoSuchFieldException();
        }
        paramNumberPicker.dfG.set(paramNumberPicker.obj, paramDrawable);
        return;
      }
      catch (Exception paramNumberPicker) {}
    }
  }
  
  public static EditText b(NumberPicker paramNumberPicker)
  {
    if (paramNumberPicker == null) {
      return null;
    }
    try
    {
      paramNumberPicker = (EditText)new aj(paramNumberPicker, "mInputText").get();
      return paramNumberPicker;
    }
    catch (NoSuchFieldException paramNumberPicker)
    {
      return null;
    }
    catch (IllegalAccessException paramNumberPicker)
    {
      for (;;) {}
    }
  }
  
  public static void c(NumberPicker paramNumberPicker)
  {
    if (paramNumberPicker == null) {
      return;
    }
    paramNumberPicker.setDescendantFocusability(393216);
  }
  
  public static void d(NumberPicker paramNumberPicker)
  {
    if (paramNumberPicker == null) {}
    for (;;)
    {
      return;
      try
      {
        paramNumberPicker = (EditText)new aj(paramNumberPicker, "mInputText").get();
        if (paramNumberPicker != null)
        {
          paramNumberPicker.setFilters(new InputFilter[0]);
          return;
        }
      }
      catch (IllegalAccessException paramNumberPicker) {}catch (NoSuchFieldException paramNumberPicker) {}
    }
  }
  
  public static void e(NumberPicker paramNumberPicker)
  {
    if (paramNumberPicker == null) {}
    for (;;)
    {
      return;
      try
      {
        Runnable localRunnable = (Runnable)new aj(paramNumberPicker, "mSetSelectionCommand").get();
        if (localRunnable != null)
        {
          paramNumberPicker.removeCallbacks(localRunnable);
          return;
        }
      }
      catch (IllegalAccessException paramNumberPicker) {}catch (NoSuchFieldException paramNumberPicker) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/widget/picker/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */