package com.tencent.mm.model;

import com.tencent.mm.a.h;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.c;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public byte[] dzX;
  public long dzY = -1L;
  
  public a()
  {
    if (FJ()) {
      ah.i(new Runnable()
      {
        public final void run()
        {
          try
          {
            if (a.FJ()) {
              f.mDy.a(226L, 1L, 1L, false);
            }
            return;
          }
          catch (Exception localException)
          {
            x.e("MicroMsg.AccInfoCacheInWorker", "init Exception:%s", new Object[] { bi.i(localException) });
          }
        }
      }, 5000L);
    }
  }
  
  public static boolean FJ()
  {
    if ((com.tencent.mm.kernel.a.Dr()) || (!g.Eg().Dx())) {
      return false;
    }
    int i = bi.getInt(((com.tencent.mm.plugin.zero.b.a)g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("AndroidUseWorkerAuthCache"), 0);
    g.Ek();
    g.Eg();
    int j = h.aM(com.tencent.mm.kernel.a.Df(), 100);
    boolean bool = com.tencent.mm.sdk.a.b.chp();
    g.Ek();
    g.Eg();
    x.i("MicroMsg.AccInfoCacheInWorker", "checkUse debug:%s dyVal:%s uin:%d  uinHash:%d init:%b", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(com.tencent.mm.kernel.a.Df()), Integer.valueOf(j), Boolean.valueOf(g.Eg().Dx()) });
    if (bool) {
      return true;
    }
    return i > j;
  }
  
  public static void FK()
  {
    if (!FJ()) {
      return;
    }
    long l2;
    try
    {
      g.Ek();
      a locala = g.Eg().dps;
      g.Ek();
      localObject = g.Eh().dpP.dJs.Lr();
      l2 = bi.VF();
      if (localObject == null)
      {
        x.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker  accinfo == null");
        f.mDy.a(226L, 2L, 1L, false);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      x.e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", new Object[] { bi.i(localThrowable) });
      return;
    }
    x.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker islogin:%b cache:%s", new Object[] { Boolean.valueOf(((c)localObject).Ln()), Integer.valueOf(localThrowable.FI()) });
    if (!((c)localObject).Ln())
    {
      f.mDy.a(226L, 3L, 1L, false);
      x.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker ERR: Is Not Login");
      return;
    }
    localThrowable.dzX = ((c)localObject).Lq();
    Object localObject = f.mDy;
    if (localThrowable.FI() > 0) {}
    for (long l1 = 4L;; l1 = 5L)
    {
      ((f)localObject).a(226L, l1, 1L, false);
      x.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker time:%s cache:%s useCacheCount:%s ", new Object[] { Long.valueOf(bi.bH(l2)), Integer.valueOf(localThrowable.FI()), Long.valueOf(localThrowable.dzY) });
      if (localThrowable.FI() <= 0) {
        break;
      }
      localObject = f.mDy;
      if (localThrowable.dzY > 5L) {}
      for (l1 = 5L;; l1 = localThrowable.dzY)
      {
        ((f)localObject).a(226L, 31L - l1, 1L, false);
        f.mDy.h(11098, new Object[] { Integer.valueOf(2000), Long.valueOf(localThrowable.dzY) });
        localThrowable.dzY = -1L;
        return;
      }
    }
  }
  
  public final int FI()
  {
    if (this.dzX == null) {
      return -1;
    }
    return this.dzX.length;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */