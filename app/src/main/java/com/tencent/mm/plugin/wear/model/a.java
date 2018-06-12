package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.plugin.wear.model.e.h;
import com.tencent.mm.plugin.wear.model.e.k;
import com.tencent.mm.plugin.wear.model.e.l;
import com.tencent.mm.plugin.wear.model.e.m;
import com.tencent.mm.plugin.wear.model.e.n;
import com.tencent.mm.plugin.wear.model.e.o;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.util.HashMap;

public final class a
  implements ar
{
  q pIK;
  public r pIL;
  public d pIM;
  private e pIN;
  public g pIO;
  public b pIP;
  private WearMessageLogic pIQ;
  private i pIR;
  public j pIS;
  public com.tencent.mm.plugin.wear.model.g.a pIT;
  private com.tencent.mm.ab.d pIU;
  
  public a()
  {
    x.i("MicroMsg.Wear.SubCoreWear", "Create SubCore, classLoader=%s", new Object[] { getClass().getClassLoader() });
  }
  
  public static a bSl()
  {
    au.HN();
    a locala2 = (a)bs.iK("plugin.wear");
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a();
      au.HN().a("plugin.wear", locala1);
    }
    return locala1;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.pluginsdk.o.h.qyk = new c();
    x.i("MicroMsg.Wear.SubCoreWear", "onAccountPostReset, updated=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.pIK = new q();
    this.pIL = new r();
    this.pIS = new j();
    this.pIN = new e();
    this.pIO = new g();
    this.pIP = new b();
    this.pIM = new d();
    this.pIQ = new WearMessageLogic();
    this.pIR = new i();
    this.pIT = new com.tencent.mm.plugin.wear.model.g.a();
    this.pIU = new com.tencent.mm.plugin.wear.model.g.b();
    d.c.a(Integer.valueOf(63), this.pIU);
    this.pIK.a(this.pIM.pJc);
    this.pIK.a(this.pIM.pJd);
    this.pIK.a(this.pIM.pJe);
    this.pIK.a(new h());
    this.pIK.a(new com.tencent.mm.plugin.wear.model.e.g());
    this.pIK.a(new com.tencent.mm.plugin.wear.model.e.d());
    this.pIK.a(new com.tencent.mm.plugin.wear.model.e.c());
    this.pIK.a(new com.tencent.mm.plugin.wear.model.e.e());
    this.pIK.a(new com.tencent.mm.plugin.wear.model.e.f());
    this.pIK.a(new k());
    this.pIK.a(new m());
    this.pIK.a(new o());
    this.pIK.a(new n());
    this.pIK.a(new l());
    this.pIS.a(new a.1(this));
    j localj = this.pIS;
    Object localObject = new a.2(this);
    if (localj.giD != null)
    {
      localObject = localj.giD.obtainMessage(0, localObject);
      localj.giD.sendMessageDelayed((Message)localObject, 5000L);
    }
  }
  
  public final void bo(boolean paramBoolean)
  {
    x.i("MicroMsg.Wear.SubCoreWear", "onSdcardMount, mounted=%b", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public final void gi(int paramInt)
  {
    x.i("MicroMsg.Wear.SubCoreWear", "clearPluginData, pluginFlag=%d", new Object[] { Integer.valueOf(paramInt) });
  }
  
  public final void onAccountRelease()
  {
    d.c.b(Integer.valueOf(63), this.pIU);
    this.pIU = null;
    x.i("MicroMsg.Wear.SubCoreWear", "onAccountRelease");
    this.pIK.pKf.clear();
    this.pIK = null;
    this.pIL = null;
    Object localObject = this.pIN;
    ((e)localObject).eOf.SO();
    ((e)localObject).ocR.dead();
    ((e)localObject).pJi.dead();
    ((e)localObject).pJj.dead();
    ((e)localObject).pJk.dead();
    ((e)localObject).pJl.dead();
    ((e)localObject).pJm.dead();
    ((e)localObject).pJn.dead();
    ((e)localObject).cYt.dead();
    ((e)localObject).kRJ.dead();
    au.HU();
    com.tencent.mm.model.c.FT().a(((e)localObject).iJe);
    this.pIN = null;
    this.pIO = null;
    localObject = this.pIP;
    com.tencent.mm.sdk.b.a.sFg.c(((b)localObject).pIX);
    au.HU();
    com.tencent.mm.model.c.FR().b(((b)localObject).jtB);
    ((b)localObject).pIY.SO();
    this.pIP = null;
    localObject = this.pIM;
    ((d)localObject).pJb.finish();
    ((d)localObject).pJf.reset();
    this.pIM = null;
    localObject = this.pIQ;
    ad.getContext().unregisterReceiver((BroadcastReceiver)localObject);
    this.pIQ = null;
    localObject = this.pIS;
    if (((j)localObject).handlerThread != null) {
      ((j)localObject).handlerThread.quit();
    }
    this.pIS = null;
    localObject = this.pIR;
    ((i)localObject).daT = null;
    ((i)localObject).bSs();
    ad.getContext().unregisterReceiver(((i)localObject).pJG);
    this.pIR = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wear/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */