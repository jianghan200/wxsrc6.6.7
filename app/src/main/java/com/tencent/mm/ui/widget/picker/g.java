package com.tencent.mm.ui.widget.picker;

import android.widget.NumberPicker.Formatter;
import java.util.Formatter;
import java.util.Locale;

final class g
  implements NumberPicker.Formatter
{
  final StringBuilder mBuilder = new StringBuilder();
  final Object[] uLB = new Object[1];
  char uLC;
  Formatter uLD;
  
  g()
  {
    d(Locale.getDefault());
  }
  
  private void d(Locale paramLocale)
  {
    this.uLD = new Formatter(this.mBuilder, paramLocale);
    this.uLC = '0';
  }
  
  public final String format(int paramInt)
  {
    Locale localLocale = Locale.getDefault();
    if (this.uLC != '0') {
      d(localLocale);
    }
    this.uLB[0] = Integer.valueOf(paramInt);
    this.mBuilder.delete(0, this.mBuilder.length());
    this.uLD.format("%02d", this.uLB);
    return this.uLD.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/widget/picker/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */