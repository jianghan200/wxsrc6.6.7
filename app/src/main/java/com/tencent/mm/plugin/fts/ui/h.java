package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.d.g;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;

public final class h
  extends d
  implements e.b
{
  private ag giD = new ag();
  private boolean jww;
  private g jwz;
  
  public h(e parame, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    super(parame);
    this.jwz = new g(parame.getContext(), this, paramInt1);
    this.jwz.jsp = paramString2;
    this.jwz.talker = paramString1;
    this.jwz.jso = paramString3;
    this.jwz.showType = paramInt2;
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    setCount(parame.qg(0));
    notifyDataSetChanged();
    J(getCount(), true);
  }
  
  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    paramBoolean = this.jwz.a(paramView, parama, paramBoolean);
    if ((parama.jts) && (!this.jww))
    {
      this.jww = true;
      k.c(this.bWm, true, this.jwz.aQw(), -2);
    }
    if (paramBoolean)
    {
      clearCache();
      setCount(this.jwz.qg(0));
      notifyDataSetChanged();
      J(getCount(), true);
    }
    return paramBoolean;
  }
  
  protected final int aQg()
  {
    return this.jwz.aQw();
  }
  
  protected final void aQx()
  {
    this.jww = false;
    this.jwz.a(this.bWm, this.giD, new HashSet());
  }
  
  public final void finish()
  {
    super.finish();
    if (!this.jww)
    {
      this.jww = true;
      k.c(this.bWm, false, this.jwz.aQw(), -2);
    }
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a qh(int paramInt)
  {
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.jwz.qh(paramInt);
    if (locala != null) {
      locala.pageType = 5;
    }
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */