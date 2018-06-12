package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;

final class c
{
  al bAZ = new al(new al.a()
  {
    public final boolean vD()
    {
      c.this.bvj();
      return false;
    }
  }, false);
  View view;
  
  public c(View paramView)
  {
    this.view = paramView;
  }
  
  public final void bvj()
  {
    if (this.view != null) {
      this.view.setKeepScreenOn(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */