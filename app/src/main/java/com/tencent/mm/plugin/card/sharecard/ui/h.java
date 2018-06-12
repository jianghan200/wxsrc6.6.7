package com.tencent.mm.plugin.card.sharecard.ui;

import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class h
  implements a
{
  private g hzU;
  
  public h(g paramg)
  {
    this.hzU = paramg;
  }
  
  public final void Ij()
  {
    if (this.hzU != null) {
      this.hzU.notifyDataSetChanged();
    }
  }
  
  public final b nE(int paramInt)
  {
    if (this.hzU != null) {
      return this.hzU.nE(paramInt);
    }
    return null;
  }
  
  public final void onCreate()
  {
    this.hzU.notifyDataSetChanged();
  }
  
  public final void onDestroy()
  {
    if (this.hzU != null)
    {
      g localg = this.hzU;
      localg.hzI.release();
      localg.hzI = null;
      localg.hzT.clear();
      localg.mContext = null;
      this.hzU = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */