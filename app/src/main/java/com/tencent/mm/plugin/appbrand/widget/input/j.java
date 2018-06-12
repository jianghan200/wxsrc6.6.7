package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.p.d;
import com.tencent.mm.plugin.appbrand.page.p.e;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;

final class j
  implements p.d, p.e
{
  final WeakReference<p> gGm;
  
  j(p paramp)
  {
    this.gGm = new WeakReference(paramp);
    paramp.a(this);
    paramp.a(this);
  }
  
  public final void agK()
  {
    p localp = (p)this.gGm.get();
    if (localp != null) {
      m.n(localp);
    }
  }
  
  public final void onDestroy()
  {
    p localp = (p)this.gGm.get();
    if (localp != null)
    {
      if ((localp.mContext instanceof MMActivity)) {
        ((MMActivity)localp.mContext).YC();
      }
      m.n(localp);
      m.p(localp);
      localp.b(this);
      localp.b(this);
      if (localp.gns != null) {
        g.apm().n(localp.gns);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */