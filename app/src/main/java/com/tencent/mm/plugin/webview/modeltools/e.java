package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.bc;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.g.a.ty;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.plugin.webview.fts.h.a;
import com.tencent.mm.plugin.webview.fts.i;
import com.tencent.mm.plugin.webview.fts.i.a;
import com.tencent.mm.plugin.webview.fts.i.b;
import com.tencent.mm.plugin.webview.model.ac;
import com.tencent.mm.plugin.webview.model.ae;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.plugin.webview.model.am;
import com.tencent.mm.plugin.webview.modelcache.d.a;
import com.tencent.mm.plugin.webview.modelcache.q.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.xwalk.core.XWalkEnvironment;

public final class e
  implements ar
{
  private static final HashMap<Integer, h.d> cVM;
  private bv.a hdi = new e.15(this);
  private com.tencent.mm.network.n jkm = new e.9(this);
  private com.tencent.mm.sdk.b.c<bc> jul = new e.7(this);
  private com.tencent.mm.plugin.webview.model.ad pTR;
  private ae pTS;
  private ac pTT;
  private h pTU;
  private com.tencent.mm.plugin.webview.model.e pTV;
  private ag pTW;
  private com.tencent.mm.plugin.webview.b.e pTX;
  private i pTY;
  private com.tencent.mm.plugin.webview.fts.c pTZ;
  private com.tencent.mm.plugin.webview.fts.d pUa;
  private com.tencent.mm.plugin.webview.c.a pUb;
  private final com.tencent.mm.plugin.webview.modelcache.n pUc = new com.tencent.mm.plugin.webview.modelcache.n();
  com.tencent.mm.sdk.b.c pUd = new e.16(this);
  final com.tencent.mm.sdk.b.c<ty> pUe = new com.tencent.mm.sdk.b.c() {};
  com.tencent.mm.sdk.b.c pUf = new e.2(this);
  com.tencent.mm.sdk.b.c pUg = new e.3(this);
  com.tencent.mm.sdk.b.c pUh = new e.4(this);
  com.tencent.mm.sdk.b.c pUi = new e.5(this);
  com.tencent.mm.sdk.b.c pUj = new e.6(this);
  private com.tencent.mm.sdk.b.c pUk = new com.tencent.mm.sdk.b.c() {};
  
  static
  {
    Object localObject = new HashMap();
    cVM = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("WebViewHostsFilterTable".hashCode()), new e.1());
    localObject = new LinkedList();
    ((List)localObject).add(com.tencent.mm.plugin.webview.modelcache.a.bUD());
    ((List)localObject).addAll(com.tencent.mm.plugin.webview.modelcache.k.bUH());
    ((List)localObject).add(com.tencent.mm.plugin.webview.modelcache.h.bUD());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      d.a locala = (d.a)((Iterator)localObject).next();
      cVM.put(Integer.valueOf(locala.id), locala);
    }
    cVM.put(Integer.valueOf("WEBVIEW_JSLOG_BLOCK_LIST_TABLE".hashCode()), new e.10());
    cVM.put(Integer.valueOf("WEBVIEW_LOCAL_DATA".hashCode()), new e.11());
    cVM.put(Integer.valueOf("WEBVIEW_DATA".hashCode()), new e.12());
    cVM.put(Integer.valueOf("WEBVIEW_HISTORY_DATA".hashCode()), new e.13());
  }
  
  public static e bUR()
  {
    au.HN();
    e locale2 = (e)bs.iK("plugin.webview");
    e locale1 = locale2;
    if (locale2 == null)
    {
      locale1 = new e();
      x.e("MicroMsg.SubCoreTools", "new SubCoreTools add to subCore:%d", new Object[] { Integer.valueOf(locale1.hashCode()) });
      au.HN().a("plugin.webview", locale1);
    }
    return locale1;
  }
  
  public static com.tencent.mm.plugin.webview.c.a bUS()
  {
    if (bUR().pUb == null) {
      bUR().pUb = new com.tencent.mm.plugin.webview.c.a();
    }
    return bUR().pUb;
  }
  
  public static com.tencent.mm.plugin.webview.fts.c bUT()
  {
    if (bUR().pTZ == null) {
      bUR().pTZ = new com.tencent.mm.plugin.webview.fts.c();
    }
    return bUR().pTZ;
  }
  
  public static com.tencent.mm.plugin.webview.fts.d bUU()
  {
    if (bUR().pUa == null) {
      bUR().pUa = new com.tencent.mm.plugin.webview.fts.d();
    }
    return bUR().pUa;
  }
  
  public static i bUV()
  {
    if (bUR().pTY == null) {
      bUR().pTY = new i();
    }
    return bUR().pTY;
  }
  
  public static com.tencent.mm.plugin.webview.model.ad bUW()
  {
    if (bUR().pTR == null) {
      bUR().pTR = new com.tencent.mm.plugin.webview.model.ad();
    }
    return bUR().pTR;
  }
  
  public static ae bUX()
  {
    if (bUR().pTS == null) {
      bUR().pTS = ae.bUk();
    }
    return bUR().pTS;
  }
  
  public static h bUY()
  {
    if (bUR().pTU == null)
    {
      e locale = bUR();
      au.HU();
      locale.pTU = new h(com.tencent.mm.model.c.FO());
    }
    return bUR().pTU;
  }
  
  public static com.tencent.mm.plugin.webview.model.e bUZ()
  {
    if (bUR().pTV == null)
    {
      e locale = bUR();
      au.HU();
      locale.pTV = new com.tencent.mm.plugin.webview.model.e(com.tencent.mm.model.c.FO());
    }
    return bUR().pTV;
  }
  
  public static ag bVa()
  {
    if (bUR().pTW == null)
    {
      e locale = bUR();
      au.HU();
      locale.pTW = new ag(com.tencent.mm.model.c.FO());
    }
    return bUR().pTW;
  }
  
  public static com.tencent.mm.plugin.webview.b.e bVb()
  {
    if (bUR().pTX == null)
    {
      e locale = bUR();
      g.Ek();
      locale.pTX = new com.tencent.mm.plugin.webview.b.e(g.Ei().dqq);
    }
    return bUR().pTX;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreTools", "onAccountPostReset hc:%d", new Object[] { Integer.valueOf(hashCode()) });
    au.HN();
    if ((e)bs.iK("plugin.webview") == null)
    {
      localObject = new e();
      au.HN().a("plugin.webview", (ar)localObject);
      x.e("MicroMsg.SubCoreTools", "getCore, should not be here:%d", new Object[] { Integer.valueOf(localObject.hashCode()) });
    }
    com.tencent.mm.sdk.b.a.sFg.b(this.pUf);
    com.tencent.mm.sdk.b.a.sFg.b(this.pUh);
    com.tencent.mm.sdk.b.a.sFg.b(this.pUi);
    com.tencent.mm.sdk.b.a.sFg.b(this.pUj);
    com.tencent.mm.sdk.b.a.sFg.b(this.pUd);
    com.tencent.mm.sdk.b.a.sFg.b(this.pUk);
    com.tencent.mm.sdk.b.a.sFg.b(this.jul);
    com.tencent.mm.sdk.b.a.sFg.b(this.pUg);
    au.getSysCmdMsgExtension().a("hijackconfig", this.hdi, true);
    au.a(this.jkm);
    Object localObject = this.pUc;
    com.tencent.mm.plugin.webview.modelcache.n.bUJ();
    com.tencent.mm.plugin.webview.modelcache.q localq = q.a.bUL();
    com.tencent.mm.sdk.b.a.sFg.b(localq.pTk);
    com.tencent.mm.sdk.b.a.sFg.b(localq.pTl);
    au.getSysCmdMsgExtension().a("webcache", ((com.tencent.mm.plugin.webview.modelcache.n)localObject).pTc, true);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.webview.modelcache.n)localObject).pTd);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.webview.modelcache.n)localObject).pTe);
    com.tencent.mm.plugin.ah.c.nbP.a(new am());
    this.pUe.cht();
    g.b.a(new e.14(this));
    XWalkEnvironment.init(com.tencent.mm.sdk.platformtools.ad.getContext());
    g.Eg();
    XWalkEnvironment.setGrayValueByUserId(com.tencent.mm.kernel.a.Df());
    com.tencent.mm.plugin.webview.fts.h.bTK();
    com.tencent.mm.plugin.webview.fts.h.start();
    g.a(com.tencent.mm.plugin.webview.d.a.class, new com.tencent.mm.plugin.webview.ui.tools.bag.k());
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.i("MicroMsg.SubCoreTools", "onAccountRelease hc:%d", new Object[] { Integer.valueOf(hashCode()) });
    com.tencent.mm.sdk.b.a.sFg.c(this.pUf);
    com.tencent.mm.sdk.b.a.sFg.c(this.pUh);
    com.tencent.mm.sdk.b.a.sFg.c(this.pUi);
    com.tencent.mm.sdk.b.a.sFg.c(this.pUj);
    com.tencent.mm.sdk.b.a.sFg.c(this.pUd);
    com.tencent.mm.sdk.b.a.sFg.c(this.pUk);
    com.tencent.mm.sdk.b.a.sFg.c(this.jul);
    com.tencent.mm.sdk.b.a.sFg.c(this.pUg);
    au.b(this.jkm);
    if (this.pTT != null)
    {
      localObject1 = this.pTT;
      if (((ac)localObject1).pRI != null)
      {
        com.tencent.mm.plugin.downloader.model.d.aCU();
        com.tencent.mm.plugin.downloader.model.b.b(((ac)localObject1).pRI);
      }
      if ((((ac)localObject1).pRJ != null) && (((ac)localObject1).pRJ.size() > 0))
      {
        localObject1 = ((ac)localObject1).pRJ.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Long)((Iterator)localObject1).next();
          x.i("MicroMsg.WebViewAutoDownloader", "remove download task : %d", new Object[] { localObject2 });
          com.tencent.mm.plugin.downloader.model.d.aCU().cl(((Long)localObject2).longValue());
        }
      }
    }
    if (this.pUa != null)
    {
      localObject1 = this.pUa;
      com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.webview.fts.d)localObject1).fIu);
      if (((com.tencent.mm.plugin.webview.fts.d)localObject1).pOz != null)
      {
        au.DF().b(1048, (com.tencent.mm.ab.e)localObject1);
        au.DF().c(((com.tencent.mm.plugin.webview.fts.d)localObject1).pOz);
        ((com.tencent.mm.plugin.webview.fts.d)localObject1).pOz = null;
      }
      this.pUa = null;
    }
    if (this.pTY != null)
    {
      localObject1 = this.pTY;
      ((i)localObject1).pPi.dead();
      ((i)localObject1).pPt.dead();
      localObject2 = ((i)localObject1).pPv;
      if (((i.a)localObject2).pPn != null) {
        au.DF().c(((i.a)localObject2).pPn);
      }
      if (((i.a)localObject2).pPB != null) {
        ((i.a)localObject2).pPB.gYf = true;
      }
      localObject2 = ((i)localObject1).pPw;
      if (((i.b)localObject2).pPD != null) {
        au.DF().b(((i.b)localObject2).pPD.getType(), ((i.b)localObject2).pPx);
      }
      if (((i)localObject1).jsw != null)
      {
        ((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(((i)localObject1).jsw);
        ((i)localObject1).jsw = null;
      }
      this.pTY = null;
    }
    if (this.pTZ != null)
    {
      localObject1 = this.pTZ;
      ((com.tencent.mm.plugin.webview.fts.c)localObject1).nll.dead();
      ((com.tencent.mm.plugin.webview.fts.c)localObject1).pOt.dead();
      com.tencent.mm.aa.q.KH().d((j.a)localObject1);
      this.pTZ = null;
    }
    au.getSysCmdMsgExtension().b("hijackconfig", this.hdi, true);
    if (this.pTV != null) {
      this.pTV.bTV();
    }
    Object localObject1 = this.pUc;
    au.getSysCmdMsgExtension().b("webcache", ((com.tencent.mm.plugin.webview.modelcache.n)localObject1).pTc, true);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.webview.modelcache.n)localObject1).pTd);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.webview.modelcache.n)localObject1).pTe);
    localObject1 = q.a.bUL();
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.webview.modelcache.q)localObject1).pTk);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.webview.modelcache.q)localObject1).pTl);
    ((com.tencent.mm.plugin.webview.modelcache.q)localObject1).release(true);
    this.pUe.dead();
    localObject1 = com.tencent.mm.plugin.webview.fts.h.bTK();
    Object localObject2 = ((com.tencent.mm.plugin.webview.fts.h)localObject1).pPb;
    if (((h.a)localObject2).pPn != null) {
      au.DF().c(((h.a)localObject2).pPn);
    }
    if (((h.a)localObject2).pPo != null) {
      ((h.a)localObject2).pPo.gYf = true;
    }
    ((com.tencent.mm.plugin.webview.fts.h)localObject1).pPi.dead();
    g.m(com.tencent.mm.plugin.webview.d.a.class);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */