package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.plugin.appbrand.s.a;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.ui.base.o;

public final class e
  extends AutoFillListPopupWindowBase
{
  private final Context mContext;
  
  e(Context paramContext)
  {
    super(paramContext, null, 0);
    this.mContext = paramContext;
    this.eZB.setInputMethodMode(2);
    paramContext = paramContext.getResources().getDrawable(s.f.abc_popup_background_mtrl_mult);
    this.eZB.setBackgroundDrawable(paramContext);
    this.Qf = true;
    this.eZB.setFocusable(false);
    this.PR = false;
    this.PS = true;
    int i = s.a.appbrand_autofill_dropdown;
    this.eZB.setAnimationStyle(i);
  }
  
  public final void show()
  {
    super.show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */