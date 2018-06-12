package com.tencent.mm.ui.base.preference;

import android.widget.RadioButton;

final class b
{
  int id;
  CharSequence text;
  
  public b(CharSequence paramCharSequence, int paramInt)
  {
    this.text = paramCharSequence;
    this.id = paramInt;
  }
  
  public final void a(RadioButton paramRadioButton)
  {
    paramRadioButton.setText(this.text);
    paramRadioButton.setId(this.id);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/preference/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */