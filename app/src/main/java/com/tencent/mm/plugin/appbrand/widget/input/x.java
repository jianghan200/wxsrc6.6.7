package com.tencent.mm.plugin.appbrand.widget.input;

import android.os.Looper;
import android.text.Editable;
import android.widget.EditText;
import com.tencent.mm.plugin.appbrand.widget.input.a.b;
import com.tencent.mm.sdk.platformtools.ag;

public final class x
{
  public b gIR;
  final Runnable gIS = new x.1(this);
  final ag guJ;
  private final EditText im;
  
  public x(EditText paramEditText)
  {
    this.im = paramEditText;
    this.guJ = new ag(Looper.getMainLooper());
  }
  
  public final Editable c(Editable paramEditable)
  {
    paramEditable.setSpan(new x.2(this), 0, paramEditable.length(), 18);
    paramEditable.setSpan(new x.3(this), 0, paramEditable.length(), 18);
    return paramEditable;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */