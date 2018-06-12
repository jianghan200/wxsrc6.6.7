package com.tencent.mm.plugin.card.ui;

import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.model.am;

public final class d
  implements a
{
  private c hBt;
  
  public d(c paramc)
  {
    this.hBt = paramc;
  }
  
  public final void Ij()
  {
    if (this.hBt != null) {
      this.hBt.a(null, null);
    }
  }
  
  public final void onCreate()
  {
    if (this.hBt != null) {
      am.axi().c(this.hBt);
    }
  }
  
  public final void onDestroy()
  {
    if (this.hBt != null)
    {
      am.axi().d(this.hBt);
      this.hBt.release();
      this.hBt = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */