package com.tencent.mm.plugin.ipcall.a;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ar.j;
import com.tencent.mm.ar.k;
import com.tencent.mm.ar.m;
import com.tencent.mm.ar.n;
import com.tencent.mm.ar.r;
import com.tencent.mm.model.au;
import com.tencent.mm.storage.aa.a;

public final class d
  implements e
{
  private static d kol = null;
  private boolean dFt = false;
  com.tencent.mm.sdk.b.c kom = new d.1(this);
  private int retryCount = 0;
  
  public static d aXf()
  {
    if (kol == null) {
      kol = new d();
    }
    return kol;
  }
  
  private static void aXg()
  {
    Object localObject = r.Qp().ik(26);
    if ((localObject != null) && (localObject.length > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = new k(bool);
      au.DF().a((l)localObject, 0);
      return;
    }
  }
  
  private void aXh()
  {
    this.dFt = false;
    this.retryCount = 0;
    long l = System.currentTimeMillis();
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sQQ, Long.valueOf(l));
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.dFt) });
    if (!this.dFt) {
      return;
    }
    if ((paramInt1 != 0) && (paramInt2 != 0)) {}
    for (boolean bool = false;; bool = true)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, isSuccess: %b", new Object[] { Boolean.valueOf(bool) });
      if (paraml.getType() == 159)
      {
        if (bool)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "get package list success, start download");
          paramString = r.Qp().ik(26);
          if ((paramString == null) || (paramString.length == 0))
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "do not exist package info");
            aXh();
            return;
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "infos.length: %d", new Object[] { Integer.valueOf(paramString.length) });
          paramString = paramString[0];
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "stored info type: %d, id: %d, version: %d, status: %d, name: %s", new Object[] { Integer.valueOf(paramString.bPh), Integer.valueOf(paramString.id), Integer.valueOf(paramString.version), Integer.valueOf(paramString.status), paramString.Ql() });
          if (paramString.status == 3)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "downloading this package, ignore");
            return;
          }
          if (paramString.status != 5)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "already download this package");
            c.aXb().fM(true);
            aXh();
            return;
          }
          paramString = new j(paramString.id, 26);
          au.DF().a(paramString, 0);
          return;
        }
        if (this.retryCount < 3)
        {
          this.retryCount += 1;
          aXg();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "retry get package list, retryCount: %d", new Object[] { Integer.valueOf(this.retryCount) });
          return;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.IPCallCoutryConfigUpdater", "reach retry limit");
        return;
      }
      if ((paraml.getType() != 160) || (!bool)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "download package success");
      c.aXb().fM(true);
      aXh();
      return;
    }
  }
  
  public final void fN(boolean paramBoolean)
  {
    if (!au.HX())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, acc not ready");
      return;
    }
    if (this.dFt)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate updating");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallCoutryConfigUpdater", "tryupdate, isForce: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      au.HU();
      long l1 = ((Long)com.tencent.mm.model.c.DT().get(aa.a.sQQ, Long.valueOf(0L))).longValue();
      long l2 = System.currentTimeMillis();
      if ((l1 != 0L) && (Math.abs(l2 - l1) < 86400000L))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, not reach the update time limit");
        return;
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallCoutryConfigUpdater", "try update now");
    this.dFt = true;
    au.DF().a(159, this);
    au.DF().a(160, this);
    aXg();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */