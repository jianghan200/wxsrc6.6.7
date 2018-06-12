package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;

public final class l
  extends d
  implements e.b
{
  private ag giD = new ag();
  private boolean jww;
  private com.tencent.mm.plugin.fts.ui.d.l jxr;
  
  public l(e parame, String paramString, int paramInt)
  {
    super(parame);
    this.jxr = new com.tencent.mm.plugin.fts.ui.d.l(parame.getContext(), this, paramInt);
    this.jxr.jsp = paramString;
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    setCount(parame.qg(0));
    notifyDataSetChanged();
    J(getCount(), true);
  }
  
  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    paramBoolean = this.jxr.a(paramView, parama, paramBoolean);
    if ((parama.jts) && (!this.jww))
    {
      this.jww = true;
      k.c(this.bWm, true, this.jxr.aQw(), -2);
    }
    if (paramBoolean)
    {
      clearCache();
      setCount(this.jxr.qg(0));
      notifyDataSetChanged();
      J(getCount(), true);
    }
    return paramBoolean;
  }
  
  protected final int aQg()
  {
    return this.jxr.aQw();
  }
  
  protected final void aQx()
  {
    this.jww = false;
    this.jxr.a(this.bWm, this.giD, new HashSet());
  }
  
  public final void finish()
  {
    super.finish();
    if (!this.jww)
    {
      this.jww = true;
      k.c(this.bWm, false, this.jxr.aQw(), -2);
    }
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a qh(int paramInt)
  {
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.jxr.qh(paramInt);
    if (locala != null) {
      locala.pageType = 3;
    }
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */