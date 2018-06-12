package com.tencent.mm.plugin.fav;

import com.tencent.mm.g.c.ff;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.fav.a.aa;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.l;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.a.s;
import com.tencent.mm.plugin.fav.a.t;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.protocal.c.wd;
import com.tencent.mm.protocal.c.wo;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;
import java.util.Map;

public class PluginFav
  extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, ae
{
  private a iUX;
  private com.tencent.mm.plugin.fav.a.x iUY;
  private q iUZ;
  private aa iVa;
  private t iVb;
  private s iVc;
  private l iVd;
  private com.tencent.mm.plugin.fav.b.d.e iVe;
  private com.tencent.mm.plugin.fav.b.d.d iVf;
  private com.tencent.mm.plugin.fav.b.d.a iVg;
  private com.tencent.mm.plugin.fav.b.d.b iVh;
  private com.tencent.mm.plugin.fav.b.d.c iVi;
  private com.tencent.mm.plugin.fav.b.b.a iVj = new com.tencent.mm.plugin.fav.b.b.a();
  private com.tencent.mm.plugin.fav.b.b.b iVk = new com.tencent.mm.plugin.fav.b.b.b();
  private com.tencent.mm.sdk.b.c iVl = new PluginFav.4(this);
  
  private static void checkDir()
  {
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.aKW());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.PluginFav", "fav root dir not exists, try to make it");
      localb.mkdirs();
    }
    localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.aKO());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.PluginFav", "fav web dir not exists, try to make it");
      localb.mkdirs();
    }
    localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.aKV());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.PluginFav", "fav attach dir not exists, try to make it");
      localb.mkdirs();
    }
    localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.aKX());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.PluginFav", "fav voice dir not exists, try to make it");
      localb.mkdirs();
    }
  }
  
  public void checkFavItem(wo paramwo)
  {
    com.tencent.mm.sdk.platformtools.ah.A(new PluginFav.3(this, new com.tencent.mm.plugin.fav.b.c.a(paramwo)));
  }
  
  public void checkFavItem(List<wd> paramList)
  {
    com.tencent.mm.sdk.platformtools.ah.A(new PluginFav.2(this, new com.tencent.mm.plugin.fav.b.c.a(paramList)));
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public com.tencent.mm.plugin.fav.b.d.b getCheckCdnService()
  {
    return this.iVh;
  }
  
  public com.tencent.mm.plugin.fav.b.d.c getEditService()
  {
    return this.iVi;
  }
  
  public com.tencent.mm.plugin.fav.b.d.a getFavCdnService()
  {
    return this.iVg;
  }
  
  public q getFavCdnStorage()
  {
    return this.iUZ;
  }
  
  public s getFavConfigStorage()
  {
    return this.iVc;
  }
  
  public t getFavEditInfoStorage()
  {
    return this.iVb;
  }
  
  public com.tencent.mm.plugin.fav.a.x getFavItemInfoStorage()
  {
    return this.iUY;
  }
  
  public aa getFavSearchStorage()
  {
    return this.iVa;
  }
  
  public l getFavTagSetMgr()
  {
    return this.iVd;
  }
  
  public com.tencent.mm.plugin.fav.b.d.d getModService()
  {
    return this.iVf;
  }
  
  public ac getSendService()
  {
    return this.iVe;
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    this.iUX = new a();
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("uploadfavitem", this.iUX);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("resendfavitem", this.iUX);
    this.iUY = new com.tencent.mm.plugin.fav.b.e.d(ff.xa());
    this.iUZ = new com.tencent.mm.plugin.fav.b.e.a(ff.xa());
    this.iVa = new com.tencent.mm.plugin.fav.b.e.e(ff.xa());
    this.iVb = new com.tencent.mm.plugin.fav.b.e.c(ff.xa());
    this.iVc = new com.tencent.mm.plugin.fav.b.e.b(ff.xa());
    this.iVe = new com.tencent.mm.plugin.fav.b.d.e();
    this.iVf = new com.tencent.mm.plugin.fav.b.d.d();
    this.iVg = new com.tencent.mm.plugin.fav.b.d.a();
    this.iVh = new com.tencent.mm.plugin.fav.b.d.b();
    this.iVi = new com.tencent.mm.plugin.fav.b.d.c();
    this.iVd = new l();
    ((n)com.tencent.mm.kernel.g.n(n.class)).getFTSTaskDaemon().a(-86016, new PluginFav.1(this));
    this.iVl.cht();
    this.iVj.cht();
    this.iVk.cht();
    checkDir();
  }
  
  public void onAccountRelease()
  {
    this.iVl.dead();
    this.iVj.dead();
    this.iVk.dead();
    com.tencent.mm.plugin.fav.a.ah.aLL();
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterIndexStorage(256);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterNativeLogic(6);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("uploadfavitem", this.iUX);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("resendfavitem", this.iUX);
    this.iUX = null;
    this.iUY = null;
    this.iUZ = null;
    this.iVa = null;
    this.iVb = null;
    this.iVc = null;
    this.iVd = null;
    Object localObject;
    if (this.iVe != null)
    {
      localObject = this.iVe;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavSendService", "stop");
      ((com.tencent.mm.plugin.fav.b.d.e)localObject).wx();
      ((com.tencent.mm.plugin.fav.b.d.e)localObject).bFo.SO();
      ((com.tencent.mm.plugin.fav.b.d.e)localObject).bFj = 0;
      com.tencent.mm.kernel.g.DF().b(401, (com.tencent.mm.ab.e)localObject);
      this.iVe = null;
    }
    if (this.iVf != null)
    {
      localObject = this.iVf;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavModService", "stop");
      ((com.tencent.mm.plugin.fav.b.d.d)localObject).wx();
      ((com.tencent.mm.plugin.fav.b.d.d)localObject).bFo.SO();
      ((com.tencent.mm.plugin.fav.b.d.d)localObject).bFj = 0;
      com.tencent.mm.kernel.g.DF().b(426, (com.tencent.mm.ab.e)localObject);
      this.iVf = null;
    }
    if (this.iVg != null)
    {
      localObject = this.iVg;
      ((com.tencent.mm.plugin.fav.b.d.a)localObject).wx();
      ((com.tencent.mm.plugin.fav.b.d.a)localObject).bFo.SO();
      ((com.tencent.mm.plugin.fav.b.d.a)localObject).bFj = 0;
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().b(((com.tencent.mm.plugin.fav.b.d.a)localObject).dOT);
      this.iVg = null;
    }
    if (this.iVh != null)
    {
      localObject = this.iVh;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavCheckCdnService", "stop");
      ((com.tencent.mm.plugin.fav.b.d.b)localObject).wx();
      ((com.tencent.mm.plugin.fav.b.d.b)localObject).bFo.SO();
      com.tencent.mm.kernel.g.DF().b(404, (com.tencent.mm.ab.e)localObject);
      com.tencent.mm.kernel.g.Eh().b(((com.tencent.mm.plugin.fav.b.d.b)localObject).dOT);
      this.iVh = null;
    }
    if (this.iVi != null)
    {
      localObject = this.iVi;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavEditService", "stop");
      com.tencent.mm.kernel.g.DF().b(426, (com.tencent.mm.ab.e)localObject);
      com.tencent.mm.kernel.g.DF().b(401, (com.tencent.mm.ab.e)localObject);
      ((com.tencent.mm.plugin.fav.b.d.c)localObject).iXL.clear();
      this.iVi = null;
    }
  }
  
  public void parallelsDependency() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/PluginFav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */