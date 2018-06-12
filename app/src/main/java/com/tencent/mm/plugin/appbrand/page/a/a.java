package com.tencent.mm.plugin.appbrand.page.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.tencent.mm.plugin.appbrand.config.a.b;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b;

@TargetApi(21)
public final class a
  implements c
{
  private int fDb;
  final p fNZ;
  
  public a(p paramp)
  {
    this.fNZ = paramp;
    this.fDb = c.a.gpo;
  }
  
  private void cY(boolean paramBoolean)
  {
    this.fDb = c.a.gpo;
    boolean bool = this.fNZ.fdO.fcv.foN.adV();
    com.tencent.mm.ui.statusbar.a.u(this.fNZ.getContentView(), bool);
    if ((this.fNZ.gnn instanceof b))
    {
      localObject = new a.1(this);
      if (!paramBoolean) {
        break label105;
      }
      this.fNZ.getContentView().post((Runnable)localObject);
    }
    for (;;)
    {
      if ((this.fNZ.mContext instanceof Activity))
      {
        localObject = ((Activity)this.fNZ.mContext).getWindow();
        if (localObject != null) {
          break;
        }
      }
      return;
      label105:
      ((Runnable)localObject).run();
    }
    ((Window)localObject).clearFlags(1024);
    Object localObject = ((Window)localObject).getDecorView();
    ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() & 0xFBFF);
  }
  
  public final void agE()
  {
    switch (2.fDc[(this.fDb - 1)])
    {
    default: 
      return;
    case 1: 
      cY(true);
      return;
    }
    ahi();
  }
  
  public final void ahh()
  {
    cY(false);
  }
  
  public final void ahi()
  {
    this.fDb = c.a.gpp;
    com.tencent.mm.ui.statusbar.a.u(this.fNZ.getContentView(), true);
    if ((this.fNZ.gnn instanceof b)) {
      ((b)this.fNZ.gnn).dl(true);
    }
    if ((this.fNZ.mContext instanceof Activity))
    {
      localObject = ((Activity)this.fNZ.mContext).getWindow();
      if (localObject != null) {}
    }
    else
    {
      return;
    }
    ((Window)localObject).addFlags(1024);
    Object localObject = ((Window)localObject).getDecorView();
    ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() | 0x400 | 0x100);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */