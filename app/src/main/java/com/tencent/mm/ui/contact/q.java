package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.contact.a.c;
import com.tencent.mm.ui.contact.a.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q
  extends m
{
  private String bWm;
  private int count = 0;
  private ag handler = new ag(Looper.getMainLooper());
  private com.tencent.mm.plugin.fts.a.a.g jrx;
  private com.tencent.mm.plugin.fts.a.a.a jsw;
  private List<com.tencent.mm.plugin.fts.a.a.l> juW = null;
  private List<com.tencent.mm.plugin.fts.a.a.l> laD = null;
  private int uhP = Integer.MAX_VALUE;
  private int uhQ = Integer.MAX_VALUE;
  protected com.tencent.mm.plugin.fts.a.l ukA = new q.2(this);
  private List<String> uko;
  private int ukp = Integer.MAX_VALUE;
  private int ukq = Integer.MAX_VALUE;
  private int ukr = Integer.MAX_VALUE;
  private boolean uks = true;
  private int ukt = Integer.MAX_VALUE;
  private boolean uku = true;
  private int ukv = Integer.MAX_VALUE;
  private List<com.tencent.mm.plugin.fts.a.a.l> ukw = null;
  private List<com.tencent.mm.plugin.fts.a.a.l> ukx = null;
  private List<Integer> uky;
  private com.tencent.mm.plugin.fts.a.l ukz = new com.tencent.mm.plugin.fts.a.l()
  {
    public final void b(j paramAnonymousj)
    {
      switch (paramAnonymousj.bjW)
      {
      }
      do
      {
        do
        {
          return;
        } while ((q.a(q.this) == null) || (!q.a(q.this).equals(q.a(q.this))));
        q.b(q.this);
        q.a(q.this, paramAnonymousj.jrx);
        q.a(q.this, paramAnonymousj.jsx);
        q.b(q.this, paramAnonymousj.jsx);
        com.tencent.mm.plugin.fts.a.d.bj(paramAnonymousj.jsx);
        boolean bool = q.c(q.this);
        q.a(q.this, paramAnonymousj.joH.bWm, bool);
        return;
      } while (!paramAnonymousj.joH.bWm.equals(q.d(q.this)));
      q.c(q.this);
    }
  };
  
  public q(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramBoolean, paramInt);
    this.uko = paramList;
    this.uky = new ArrayList();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMSearchContactAdapter", "Create!");
    Wj();
  }
  
  private void Wj()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMSearchContactAdapter", "initData!");
    this.bWm = null;
    cyy();
    clearTask();
    clearCache();
  }
  
  private void clearTask()
  {
    if (this.jsw != null)
    {
      ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(this.jsw);
      this.jsw = null;
    }
  }
  
  private void cyy()
  {
    this.ukq = Integer.MAX_VALUE;
    this.ukr = Integer.MAX_VALUE;
    this.uks = true;
    this.ukt = Integer.MAX_VALUE;
    this.uhP = Integer.MAX_VALUE;
    this.uku = true;
    this.ukv = Integer.MAX_VALUE;
    this.uhQ = Integer.MAX_VALUE;
    this.ukw = null;
    this.laD = null;
    this.juW = null;
    this.ukx = null;
    this.jrx = null;
    clearCache();
    notifyDataSetChanged();
  }
  
  private static int dS(List<? extends Object> paramList)
  {
    if (paramList == null) {
      return 0;
    }
    return paramList.size();
  }
  
  private com.tencent.mm.ui.contact.a.a fa(int paramInt1, int paramInt2)
  {
    com.tencent.mm.ui.contact.a.g localg = new com.tencent.mm.ui.contact.a.g(paramInt2);
    localg.jyx = this.ujW.getActivity().getResources().getString(paramInt1);
    return localg;
  }
  
  private void h(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = dS(this.ukw);
    int m = dS(this.laD);
    int k = dS(this.juW);
    int j = dS(this.ukx);
    if (i > 0)
    {
      this.ukq = 0;
      i = i + 1 + 0;
      if (m <= 0) {
        break label303;
      }
      this.ukr = i;
      if ((m <= 3) || ((k <= 0) && (j <= 0))) {
        break label285;
      }
      if (!this.uks) {
        break label261;
      }
      i += 4;
      this.ukt = i;
      i += 1;
      label106:
      if ((this.jrx.jrX.length <= 1) || (bwq())) {
        break label312;
      }
      this.ukp = i;
      i += 1;
      label137:
      if (k <= 0) {
        break label363;
      }
      this.uhP = i;
      if ((k <= 3) || (j <= 0)) {
        break label345;
      }
      if (!this.uku) {
        break label321;
      }
      i += 4;
      this.ukv = i;
      i += 1;
      label184:
      if (j <= 0) {
        break label372;
      }
      this.uhQ = i;
      i += j + 1;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMSearchContactAdapter", "setCount %d", new Object[] { Integer.valueOf(i) });
      this.count = i;
      if (paramBoolean2) {
        bA(paramString, paramBoolean1);
      }
      clearCache();
      notifyDataSetChanged();
      return;
      this.ukq = Integer.MAX_VALUE;
      i = 0;
      break;
      label261:
      i += m + 1;
      this.ukt = i;
      i += 1;
      break label106;
      label285:
      this.ukt = Integer.MAX_VALUE;
      i += m + 1;
      break label106;
      label303:
      this.ukr = Integer.MAX_VALUE;
      break label106;
      label312:
      this.ukp = Integer.MAX_VALUE;
      break label137;
      label321:
      i += k + 1;
      this.ukv = i;
      i += 1;
      break label184;
      label345:
      this.ukv = Integer.MAX_VALUE;
      i += k + 1;
      break label184;
      label363:
      this.uhP = Integer.MAX_VALUE;
      break label184;
      label372:
      this.uhQ = Integer.MAX_VALUE;
    }
  }
  
  private static com.tencent.mm.ui.contact.a.a u(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    com.tencent.mm.ui.contact.a.i locali = new com.tencent.mm.ui.contact.a.i(paramInt2);
    locali.jxE = paramInt1;
    locali.jxF = paramBoolean;
    return locali;
  }
  
  public final boolean FN(int paramInt)
  {
    paramInt -= this.ujW.getContentLV().getHeaderViewsCount();
    if (paramInt == this.ukt)
    {
      if (this.uks)
      {
        paramInt = this.ujW.getContentLV().getSelectedItemPosition();
        this.uks = false;
        h(this.bWm, true, false);
        this.ujW.getContentLV().setSelection(paramInt);
        return true;
      }
      this.uks = true;
      h(this.bWm, true, false);
      this.ujW.getContentLV().setSelection(this.ukt);
      return true;
    }
    if (paramInt == this.ukv)
    {
      if (this.uku)
      {
        paramInt = this.ujW.getContentLV().getSelectedItemPosition();
        this.uku = false;
        h(this.bWm, true, false);
        this.ujW.getContentLV().setSelection(paramInt);
        return true;
      }
      this.uku = true;
      h(this.bWm, true, false);
      this.ujW.getContentLV().setSelection(this.ukv);
      return true;
    }
    com.tencent.mm.ui.contact.a.a locala = FM(paramInt);
    if ((locala != null) && (locala.djH) && (this.ukp != Integer.MAX_VALUE))
    {
      if (locala.position == this.ukp)
      {
        x.FO(1);
        return false;
      }
      x.FO(0);
    }
    return false;
  }
  
  public void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    clearTask();
    this.bWm = paramString;
    this.uky.clear();
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = paramArrayOfInt[i];
      this.uky.add(Integer.valueOf(k));
      i += 1;
    }
    HashSet localHashSet = new HashSet();
    if (!paramBoolean) {
      localHashSet.add("filehelper");
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMSearchContactAdapter", "doSearch: query=%s", new Object[] { this.bWm });
    com.tencent.mm.plugin.fts.a.a.i locali = new com.tencent.mm.plugin.fts.a.a.i();
    locali.bWm = paramString;
    locali.jsq = paramArrayOfInt;
    locali.jss = 3;
    locali.jsv = this.ukz;
    locali.handler = this.handler;
    locali.scene = 1;
    locali.jst = localHashSet;
    this.jsw = ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.fts.a.n.class)).search(1, locali);
  }
  
  public final void acV()
  {
    Wj();
  }
  
  public void bA(String paramString, boolean paramBoolean)
  {
    if (this.ujV != null) {
      this.ujV.q(paramString, getCount(), paramBoolean);
    }
  }
  
  protected boolean c(com.tencent.mm.ui.contact.a.a parama)
  {
    int j = parama.position;
    int k = this.ukq;
    int m = this.ukr;
    int n = this.uhP;
    int i1 = this.uhQ;
    int i = 0;
    while (i < 4)
    {
      if (j + 1 == new int[] { k, m, n, i1 }[i]) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public void finish()
  {
    super.finish();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMSearchContactAdapter", "finish!");
    Wj();
  }
  
  public int getCount()
  {
    return this.count;
  }
  
  public com.tencent.mm.ui.contact.a.a iW(int paramInt)
  {
    Object localObject;
    if (paramInt == this.ukp)
    {
      localObject = new f(paramInt);
      ((f)localObject).djH = true;
    }
    for (;;)
    {
      if (localObject != null)
      {
        ((com.tencent.mm.ui.contact.a.a)localObject).bWm = this.bWm;
        ((com.tencent.mm.ui.contact.a.a)localObject).jrx = this.jrx;
        ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
      }
      return (com.tencent.mm.ui.contact.a.a)localObject;
      if (paramInt == this.ukq)
      {
        localObject = fa(a.h.fts_header_top_hits, paramInt);
      }
      else if (paramInt == this.ukr)
      {
        localObject = fa(a.h.fts_header_contact, paramInt);
      }
      else if (paramInt == this.uhP)
      {
        localObject = fa(a.h.fts_header_chatroom, paramInt);
      }
      else if (paramInt == this.uhQ)
      {
        localObject = fa(a.h.fts_header_biz, paramInt);
      }
      else if (paramInt == this.ukt)
      {
        localObject = u(a.h.fts_header_contact, paramInt, this.uks);
      }
      else if (paramInt == this.ukv)
      {
        localObject = u(a.h.fts_header_chatroom, paramInt, this.uku);
      }
      else
      {
        int i;
        if (paramInt > this.uhQ)
        {
          i = paramInt - this.uhQ - 1;
          localObject = new com.tencent.mm.ui.contact.a.d(paramInt);
          ((com.tencent.mm.ui.contact.a.d)localObject).fyJ = ((com.tencent.mm.plugin.fts.a.a.l)this.ukx.get(i));
          ((com.tencent.mm.ui.contact.a.a)localObject).ujX = bwq();
          ((com.tencent.mm.ui.contact.a.d)localObject).djH = true;
          ((com.tencent.mm.ui.contact.a.d)localObject).jtl = (i + 1);
          ((com.tencent.mm.ui.contact.a.d)localObject).cF(((com.tencent.mm.ui.contact.a.d)localObject).fyJ.type, ((com.tencent.mm.ui.contact.a.d)localObject).fyJ.jru);
        }
        else if (paramInt > this.uhP)
        {
          i = paramInt - this.uhP - 1;
          localObject = new c(paramInt);
          ((c)localObject).fyJ = ((com.tencent.mm.plugin.fts.a.a.l)this.juW.get(i));
          ((com.tencent.mm.ui.contact.a.a)localObject).ujX = bwq();
          ((c)localObject).djH = true;
          ((c)localObject).jtl = (i + 1);
          ((c)localObject).cF(((c)localObject).fyJ.type, ((c)localObject).fyJ.jru);
        }
        else if (paramInt > this.ukr)
        {
          i = paramInt - this.ukr - 1;
          localObject = new com.tencent.mm.ui.contact.a.d(paramInt);
          ((com.tencent.mm.ui.contact.a.d)localObject).fyJ = ((com.tencent.mm.plugin.fts.a.a.l)this.laD.get(i));
          ((com.tencent.mm.ui.contact.a.a)localObject).ujX = bwq();
          ((com.tencent.mm.ui.contact.a.d)localObject).djH = true;
          ((com.tencent.mm.ui.contact.a.d)localObject).jtl = (i + 1);
          ((com.tencent.mm.ui.contact.a.d)localObject).cF(((com.tencent.mm.ui.contact.a.d)localObject).fyJ.type, ((com.tencent.mm.ui.contact.a.d)localObject).fyJ.jru);
        }
        else if (paramInt > this.ukq)
        {
          i = paramInt - this.ukq - 1;
          com.tencent.mm.plugin.fts.a.a.l locall = (com.tencent.mm.plugin.fts.a.a.l)this.ukw.get(i);
          if ((locall.type == 131072) || (locall.type == 131076))
          {
            localObject = new com.tencent.mm.ui.contact.a.d(paramInt);
            ((com.tencent.mm.ui.contact.a.d)localObject).fyJ = locall;
            ((com.tencent.mm.ui.contact.a.a)localObject).ujX = bwq();
            ((com.tencent.mm.ui.contact.a.d)localObject).ump = true;
            ((com.tencent.mm.ui.contact.a.d)localObject).djH = true;
            ((com.tencent.mm.ui.contact.a.d)localObject).jtl = (i + 1);
            ((com.tencent.mm.ui.contact.a.d)localObject).cF(((com.tencent.mm.ui.contact.a.d)localObject).fyJ.type, ((com.tencent.mm.ui.contact.a.d)localObject).fyJ.jru);
          }
          else if (locall.type == 131075)
          {
            localObject = new c(paramInt);
            ((c)localObject).fyJ = locall;
            ((com.tencent.mm.ui.contact.a.a)localObject).ujX = bwq();
            ((c)localObject).ump = true;
            ((c)localObject).djH = true;
            ((c)localObject).jtl = (i + 1);
            ((c)localObject).cF(((c)localObject).fyJ.type, ((c)localObject).fyJ.jru);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMSearchContactAdapter", "createTopHitsDataItem return unkown type %d", new Object[] { Integer.valueOf(locall.type) });
            localObject = null;
          }
        }
        else
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMSearchContactAdapter", "unkown position=%d", new Object[] { Integer.valueOf(paramInt) });
          localObject = null;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/contact/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */