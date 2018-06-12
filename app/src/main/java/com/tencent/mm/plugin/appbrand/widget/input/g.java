package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.e.a;
import android.view.View;
import com.tencent.mm.plugin.appbrand.page.t;

public final class g
{
  private static final g gGD = new g();
  private final a<t, Integer> gGC = new a();
  
  public static g apm()
  {
    return gGD;
  }
  
  final void n(t paramt)
  {
    if (paramt == null) {
      return;
    }
    this.gGC.remove(paramt);
    paramt.getView().setFocusable(true);
    paramt.getView().setFocusableInTouchMode(true);
  }
  
  public final void o(t paramt)
  {
    if (paramt == null) {
      return;
    }
    Integer localInteger2 = (Integer)this.gGC.get(paramt);
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    int i = localInteger1.intValue();
    this.gGC.put(paramt, Integer.valueOf(i + 1));
    paramt.getView().setFocusable(false);
    paramt.getView().setFocusableInTouchMode(false);
  }
  
  public final void p(t paramt)
  {
    if (paramt == null) {
      return;
    }
    Integer localInteger = (Integer)this.gGC.get(paramt);
    if (localInteger != null)
    {
      localInteger = Integer.valueOf(localInteger.intValue() - 1);
      if (localInteger.intValue() > 0) {}
    }
    else
    {
      n(paramt);
      return;
    }
    this.gGC.put(paramt, localInteger);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */