package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.view.View;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;

public final class c
  extends d
  implements e.b
{
  private com.tencent.mm.plugin.fts.ui.d.a jvC = new com.tencent.mm.plugin.fts.ui.d.a(parame.getContext(), this, 0);
  protected boolean jvD;
  private ag jvE = new ag(Looper.getMainLooper());
  
  public c(e parame)
  {
    super(parame);
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    int i = this.jvC.qg(0);
    setCount(i);
    notifyDataSetChanged();
    J(i, true);
  }
  
  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    return false;
  }
  
  protected final int aQg()
  {
    return this.jvC.aQw();
  }
  
  protected final void aQx()
  {
    this.jvD = false;
    this.jvC.a(this.bWm, this.jvE, new HashSet());
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a qh(int paramInt)
  {
    return this.jvC.qh(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */