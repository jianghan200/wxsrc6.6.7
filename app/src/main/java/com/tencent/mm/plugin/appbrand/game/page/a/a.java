package com.tencent.mm.plugin.appbrand.game.page.a;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.Window;
import com.tencent.mm.plugin.appbrand.config.a.a;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.game.page.d;
import com.tencent.mm.plugin.appbrand.page.a.c;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b;

public final class a
  implements c
{
  private final d fDa;
  public int fDb = 0;
  
  public a(d paramd)
  {
    this.fDa = paramd;
  }
  
  private void cG(boolean paramBoolean)
  {
    if (!(this.fDa.mContext instanceof Activity)) {
      return;
    }
    Window localWindow = ((Activity)this.fDa.mContext).getWindow();
    if (paramBoolean)
    {
      j.c(localWindow, true);
      return;
    }
    j.c(localWindow, false);
  }
  
  public final void agE()
  {
    if (this.fDb == 0) {
      if (!this.fDa.fdO.fcv.foR.foW) {
        break label69;
      }
    }
    label69:
    for (int i = c.a.gpo;; i = c.a.gpp)
    {
      this.fDb = i;
      switch (a.1.fDc[(this.fDb - 1)])
      {
      default: 
        return;
      }
    }
    ahh();
    return;
    ahi();
  }
  
  public final void ahh()
  {
    this.fDb = c.a.gpo;
    cG(false);
    if ((Build.VERSION.SDK_INT >= 21) && ((this.fDa.mContext instanceof Activity)))
    {
      Window localWindow = ((Activity)this.fDa.mContext).getWindow();
      if (localWindow != null)
      {
        localWindow.addFlags(Integer.MIN_VALUE);
        localWindow.setStatusBarColor(0);
        ((b)this.fDa.gnn).dl(false);
      }
    }
  }
  
  public final void ahi()
  {
    this.fDb = c.a.gpp;
    cG(true);
    ((b)this.fDa.gnn).dl(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/page/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */