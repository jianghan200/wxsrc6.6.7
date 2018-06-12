package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.view.View;
import android.widget.AbsListView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.a.h;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i
  extends d
  implements e.b
{
  private boolean eMT;
  private int jtk;
  private ag jvE = new ag(Looper.getMainLooper());
  private com.tencent.mm.plugin.fts.a.d.e jwC;
  private com.tencent.mm.plugin.fts.ui.c.a jwD;
  private boolean jwE;
  private ag jwF = new i.1(this, Looper.getMainLooper());
  private boolean jwG;
  private boolean jww;
  
  public i(e parame, int paramInt1, int paramInt2)
  {
    super(parame);
    this.jtk = paramInt1;
    parame = getContext();
    int j = -1;
    int i = j;
    switch (paramInt1)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      x.i("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | uiLogicType=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
      HashSet localHashSet = new HashSet();
      localHashSet.add(Integer.valueOf(i));
      this.jwC = ((com.tencent.mm.plugin.fts.a.d.e)((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).createFTSUIUnitList(localHashSet, parame, this, paramInt2).get(0));
      this.jwD = new com.tencent.mm.plugin.fts.ui.c.a();
      return;
      i = 4112;
      continue;
      i = 4128;
      continue;
      i = 4176;
      continue;
      i = 4144;
      continue;
      i = 4192;
      continue;
      i = 4208;
      continue;
      i = 4224;
      continue;
      i = 4240;
      continue;
      i = 4160;
    }
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    if (paramString.equals(this.bWm)) {
      this.eMT = false;
    }
    setCount(parame.qg(0));
    notifyDataSetChanged();
    J(getCount(), true);
    this.jwD.jyY = System.currentTimeMillis();
    paramString = this.jwD;
    parame = ((a)parame).jvp.iterator();
    while (parame.hasNext())
    {
      e.a locala = (e.a)parame.next();
      int i = paramString.jyZ;
      paramString.jyZ = (locala.jte.size() + i);
    }
  }
  
  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    this.jwC.a(paramView, parama, paramBoolean);
    if (parama.jts)
    {
      x.d("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", new Object[] { Integer.valueOf(parama.jtk), Integer.valueOf(parama.jsZ), Integer.valueOf(parama.jtl), Integer.valueOf(parama.jtm), parama.jtn, Long.valueOf(parama.jto) });
      if (!this.jww)
      {
        k.c(this.bWm, true, aQg(), parama.jtk);
        this.jww = true;
      }
      k.a(parama, this.jwD);
    }
    while (!(parama instanceof h)) {
      return false;
    }
    this.jwG = true;
    k.a(parama, this.jwD);
    return false;
  }
  
  protected final int aQg()
  {
    return this.jwC.aQg();
  }
  
  protected final void aQx()
  {
    this.eMT = true;
    this.jww = false;
    this.jwD.reset();
    this.jwC.a(this.bWm, this.jvE, new HashSet());
  }
  
  protected final void clearCache()
  {
    super.clearCache();
    this.jwC.acV();
    this.jwC.aQe();
    this.jwF.removeMessages(1);
  }
  
  public final void finish()
  {
    if (!this.jww)
    {
      this.jww = true;
      if (!this.jwG) {
        k.c(this.bWm, false, aQg(), this.jtk);
      }
    }
    this.jwD.reset();
    super.finish();
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
    {
      this.jwE = true;
      ((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).getFTSImageLoader().aPM();
      com.tencent.mm.plugin.sns.b.n.nkx.pause();
      x.d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is false");
    }
    do
    {
      return;
      this.jwE = false;
    } while (((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).getFTSImageLoader().aPN());
    this.jwF.removeMessages(1);
    this.jwF.sendEmptyMessageDelayed(1, 200L);
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a qh(int paramInt)
  {
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.jwC.qh(paramInt);
    if (locala != null)
    {
      locala.jtl = paramInt;
      locala.pageType = 2;
    }
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */