package com.tencent.mm.plugin.messenger.a;

import android.view.View;
import com.tencent.mm.pluginsdk.ui.d.n;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class a
  extends n
{
  private long lbJ = -1L;
  
  public a()
  {
    super(1, null);
  }
  
  public void onClick(View paramView)
  {
    if (bi.bI(this.lbJ) > 1000L)
    {
      super.onClick(paramView);
      onClickImp(paramView);
    }
    for (;;)
    {
      this.lbJ = bi.VG();
      return;
      x.w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
      this.lmQ = false;
    }
  }
  
  public abstract void onClickImp(View paramView);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/messenger/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */