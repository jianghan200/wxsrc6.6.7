package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.af;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.u;
import java.util.List;

public final class f
  extends d
  implements com.tencent.mm.plugin.fts.a.l
{
  private ag giD = new ag();
  private j jsk;
  private String jso;
  private com.tencent.mm.plugin.fts.a.a.a jsw;
  private u jwq;
  
  public f(e parame, String paramString)
  {
    super(parame);
    this.jso = paramString;
    if (s.fq(paramString)) {
      this.jwq = ((b)g.l(b.class)).Ga().ih(paramString);
    }
  }
  
  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    return false;
  }
  
  protected final void aQx()
  {
    clearCache();
    if (this.jsw != null) {
      ((n)g.n(n.class)).cancelSearchTask(this.jsw);
    }
    i locali = new i();
    locali.bWm = this.bWm;
    locali.jso = this.jso;
    locali.jsu = com.tencent.mm.plugin.fts.a.c.e.jsX;
    locali.jsv = this;
    locali.handler = this.giD;
    locali.jsn = 3;
    this.jsw = ((n)g.n(n.class)).search(3, locali);
    x.i("MicroMSsg.FTS.FTSChattingConvAdapter", "do search %s", new Object[] { this.bWm });
  }
  
  public final void b(j paramj)
  {
    switch (paramj.bjW)
    {
    default: 
      return;
    case 0: 
      this.jsk = paramj;
      setCount(paramj.jsx.size());
      notifyDataSetChanged();
      J(getCount(), true);
      return;
    }
    setCount(0);
    notifyDataSetChanged();
    J(getCount(), true);
  }
  
  public final void finish()
  {
    super.finish();
    if (this.jsw != null) {
      ((n)g.n(n.class)).cancelSearchTask(this.jsw);
    }
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a qh(int paramInt)
  {
    com.tencent.mm.plugin.fts.ui.a.d locald = new com.tencent.mm.plugin.fts.ui.a.d(paramInt);
    locald.fyJ = ((com.tencent.mm.plugin.fts.a.a.l)this.jsk.jsx.get(paramInt));
    locald.jrx = this.jsk.jrx;
    locald.jtk = -14;
    locald.jwq = this.jwq;
    locald.jtl = paramInt;
    locald.pageType = 6;
    if (locald.position == getCount() - 1) {
      locald.jtj = true;
    }
    return locald;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */