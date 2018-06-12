package com.tencent.mm.plugin.notification.d;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.al;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class f
  implements ar
{
  private static f lHY = null;
  com.tencent.mm.plugin.notification.c.c lHZ = null;
  com.tencent.mm.plugin.notification.c.c lIa = null;
  private com.tencent.mm.plugin.notification.a.a lIb = null;
  private boolean lIc = false;
  private com.tencent.mm.sdk.b.c lId = new f.1(this);
  private com.tencent.mm.sdk.b.c lIe = new f.2(this);
  private com.tencent.mm.sdk.b.c lIf = new f.3(this);
  private com.tencent.mm.sdk.b.c lIg = new f.4(this);
  private com.tencent.mm.sdk.b.c lIh = new f.5(this);
  private com.tencent.mm.sdk.b.c lIi = new f.6(this);
  
  private f()
  {
    b.init();
    if (this.lIa == null) {
      this.lIa = new e();
    }
    if (this.lHZ == null) {
      this.lHZ = new d();
    }
  }
  
  public static ArrayList<Long> X(bd parambd)
  {
    if (parambd == null) {
      return null;
    }
    au.HU();
    com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
    Object localObject = ((i)g.l(i.class)).bcY().bdg();
    parambd = new ArrayList();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      parambd.add(Long.valueOf(((bd)((Iterator)localObject).next()).field_msgId));
    }
    return parambd;
  }
  
  public static f bky()
  {
    if (lHY == null)
    {
      lHY = new f();
      au.HN().a("plugin.notification", lHY);
    }
    return lHY;
  }
  
  public static boolean bkz()
  {
    return bky().lIc;
  }
  
  public static FailSendMsgNotification uh(int paramInt)
  {
    if ((paramInt == 2) && (bky().lIa != null))
    {
      x.d("MicroMsg.SubCoreNotification", "get sns notificaiton");
      return bky().lIa.bkk();
    }
    if ((paramInt == 1) && (bky().lHZ != null))
    {
      x.d("MicroMsg.SubCoreNotification", "get msg notificaiton");
      return bky().lHZ.bkk();
    }
    return null;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.lHZ.bkt();
    this.lHZ.bku();
    this.lIa.bkt();
    this.lIa.bku();
    if (this.lIb == null) {
      this.lIb = new com.tencent.mm.plugin.notification.a.a();
    }
    com.tencent.mm.plugin.notification.a.a locala = this.lIb;
    if (!au.HX()) {
      x.e("MicroMsg.NotificationObserver", "account not ready!");
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.sFg.b(this.lId);
      com.tencent.mm.sdk.b.a.sFg.b(this.lIe);
      com.tencent.mm.sdk.b.a.sFg.b(this.lIf);
      com.tencent.mm.sdk.b.a.sFg.b(this.lIg);
      com.tencent.mm.sdk.b.a.sFg.b(this.lIh);
      com.tencent.mm.sdk.b.a.sFg.b(this.lIi);
      com.tencent.mm.k.f.AN();
      au.getNotification().fq(com.tencent.mm.k.f.AQ());
      au.getNotification().aS(false);
      x.d("MicroMsg.SubCoreNotification", "onAccountPostReset");
      return;
      x.d("MicroMsg.NotificationObserver", "added");
      try
      {
        au.HU();
        com.tencent.mm.model.c.FW().a(locala);
        locala.lHj = true;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.NotificationObserver", "exception:%s", new Object[] { bi.i(localException) });
      }
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    this.lHZ.bkv();
    this.lHZ.bkw();
    this.lIa.bkv();
    this.lIa.bkw();
    com.tencent.mm.plugin.notification.a.a locala;
    if (this.lIb != null)
    {
      locala = this.lIb;
      if (!au.HX()) {}
    }
    try
    {
      au.HU();
      com.tencent.mm.model.c.FW().b(locala);
      com.tencent.mm.sdk.b.a.sFg.c(this.lId);
      com.tencent.mm.sdk.b.a.sFg.c(this.lIe);
      com.tencent.mm.sdk.b.a.sFg.c(this.lIf);
      com.tencent.mm.sdk.b.a.sFg.c(this.lIg);
      com.tencent.mm.sdk.b.a.sFg.c(this.lIh);
      com.tencent.mm.sdk.b.a.sFg.c(this.lIi);
      au.getNotification().fq(0);
      au.getNotification().aS(true);
      x.d("MicroMsg.SubCoreNotification", "onAccountRelease");
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.NotificationObserver", "exception:%s", new Object[] { bi.i(localException) });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/notification/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */