package com.tencent.mm.plugin.card.ui;

import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class h
  implements a
{
  private g hEY;
  
  public h(g paramg)
  {
    this.hEY = paramg;
  }
  
  public final void Ij()
  {
    if (this.hEY != null) {
      this.hEY.notifyDataSetChanged();
    }
  }
  
  public final void onCreate()
  {
    this.hEY.notifyDataSetChanged();
  }
  
  public final void onDestroy()
  {
    if (this.hEY != null)
    {
      g localg = this.hEY;
      localg.hzI.release();
      localg.hzI = null;
      localg.hzT.clear();
      localg.mContext = null;
      localg.hEW = null;
      this.hEY = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */