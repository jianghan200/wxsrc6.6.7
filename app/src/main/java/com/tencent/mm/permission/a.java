package com.tencent.mm.permission;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ar.j;
import com.tencent.mm.ar.k;
import com.tencent.mm.ar.m;
import com.tencent.mm.ar.r;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
  implements e
{
  private static a euX;
  private boolean euY = false;
  private int mRetryTimes = 3;
  
  private static void Qk()
  {
    if (!au.HX()) {
      return;
    }
    au.HU();
    c.DT().set(327944, Long.valueOf(bi.VF()));
  }
  
  public static a Vj()
  {
    if (euX == null) {
      euX = new a();
    }
    return euX;
  }
  
  private void release()
  {
    this.euY = false;
    au.DF().b(159, this);
    au.DF().b(160, this);
  }
  
  public final void Vk()
  {
    if (!au.HX()) {}
    long l;
    do
    {
      return;
      if (!this.euY)
      {
        au.HU();
        if (c.isSDCardAvailable()) {}
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PermissionConfigUpdater", "not to update, isUpdating: %s", new Object[] { Boolean.valueOf(this.euY) });
        return;
      }
      au.HU();
      l = ((Long)c.DT().get(327944, Long.valueOf(0L))).longValue();
    } while (bi.VF() - l < 86400000L);
    release();
    this.euY = true;
    k localk = new k(23);
    au.DF().a(localk, 0);
    au.DF().a(159, this);
    au.DF().a(160, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((!(paraml instanceof com.tencent.mm.ab.n)) || (((com.tencent.mm.ab.n)paraml).Lf() != 23)) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PermissionConfigUpdater", "another scene");
    }
    int i;
    do
    {
      return;
      i = paraml.getType();
      if (159 == i)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          Qk();
          paramString = r.Qp().ik(23);
          if ((paramString == null) || (paramString.length == 0))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PermissionConfigUpdater", "error no pkg found.");
            release();
            return;
          }
          paramString = paramString[0];
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PermissionConfigUpdater", "permission, pkgId: %d, version: %d, status: %d, type: %d", new Object[] { Integer.valueOf(paramString.id), Integer.valueOf(paramString.version), Integer.valueOf(paramString.status), Integer.valueOf(paramString.bPh) });
          if (5 != paramString.status)
          {
            release();
            return;
          }
          paramString = new j(paramString.id, 23);
          au.DF().a(paramString, 0);
          return;
        }
        paramInt1 = this.mRetryTimes - 1;
        this.mRetryTimes = paramInt1;
        if (paramInt1 <= 0)
        {
          if (au.HX())
          {
            au.HU();
            c.DT().set(327944, Long.valueOf(bi.VF() - 86400000L + 3600000L));
          }
          this.mRetryTimes = 3;
        }
        release();
        return;
      }
    } while (160 != i);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      Qk();
    }
    release();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/permission/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */