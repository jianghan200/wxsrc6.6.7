package com.tencent.mm.plugin.appbrand.widget.picker;

import android.text.Editable;
import android.text.Editable.Factory;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.tencent.mm.compatible.loader.c;

final class f
{
  static void a(NumberPicker paramNumberPicker)
  {
    if (paramNumberPicker == null) {}
    for (;;)
    {
      return;
      try
      {
        paramNumberPicker = (EditText)new c(paramNumberPicker, "mInputText", null).get();
        if (paramNumberPicker != null)
        {
          paramNumberPicker.setEditableFactory(new Editable.Factory()
          {
            public final Editable newEditable(CharSequence paramAnonymousCharSequence)
            {
              return new f.1.1(this, paramAnonymousCharSequence);
            }
          });
          return;
        }
      }
      catch (Exception paramNumberPicker) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */