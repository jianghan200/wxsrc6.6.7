package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.view.View;
import com.tencent.mm.model.af;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.d.f;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;
import java.util.LinkedList;

public final class g
  extends d
  implements e.b
{
  private ag jvE = new ag(Looper.getMainLooper());
  private f jwv;
  private boolean jww;
  
  public g(e parame, String paramString, int paramInt)
  {
    super(parame);
    parame = parame.getContext();
    HashSet localHashSet = new HashSet();
    localHashSet.add(Integer.valueOf(160));
    parame = (f)((n)com.tencent.mm.kernel.g.n(n.class)).createFTSUIUnitList(localHashSet, parame, this, paramInt).get(0);
    parame.jso = paramString;
    if (s.fq(paramString)) {
      parame.jwq = ((b)com.tencent.mm.kernel.g.l(b.class)).Ga().ih(paramString);
    }
    this.jwv = parame;
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    setCount(parame.qg(0));
    notifyDataSetChanged();
    J(getCount(), true);
  }
  
  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    this.jwv.a(paramView, parama, paramBoolean);
    if ((parama.jts) && (!this.jww))
    {
      this.jww = true;
      k.c(this.bWm, true, this.jwv.aQw(), -2);
    }
    return false;
  }
  
  protected final int aQg()
  {
    return this.jwv.aQw();
  }
  
  protected final void aQx()
  {
    this.jww = false;
    this.jwv.a(this.bWm, this.jvE, new HashSet());
  }
  
  public final void finish()
  {
    super.finish();
    if (!this.jww)
    {
      this.jww = true;
      k.c(this.bWm, false, this.jwv.aQw(), -2);
    }
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a qh(int paramInt)
  {
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.jwv.qh(paramInt);
    if (locala != null)
    {
      locala.jtl = paramInt;
      locala.pageType = 4;
    }
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */