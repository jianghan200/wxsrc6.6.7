package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class r
  extends p
{
  public r(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void apx()
  {
    af.cg(this).restartInput(this);
  }
  
  public final View getInputPanel()
  {
    return u.cb(this);
  }
  
  public final void setPasswordMode(boolean paramBoolean)
  {
    apP();
    int i = getInputType() | 0x1;
    if (paramBoolean) {
      i |= 0x80;
    }
    for (;;)
    {
      setInputType(i);
      super.setPasswordMode(paramBoolean);
      apQ();
      return;
      i &= 0xFF7F;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */