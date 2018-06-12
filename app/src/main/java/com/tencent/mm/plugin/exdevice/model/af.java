package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.tq;
import com.tencent.mm.g.a.tq.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.b.k.f;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.service.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class af
  implements e
{
  com.tencent.mm.sdk.b.c cXu = new com.tencent.mm.sdk.b.c()
  {
    private boolean a(tq paramAnonymoustq)
    {
      boolean bool = true;
      if ((paramAnonymoustq instanceof tq)) {
        switch (paramAnonymoustq.cfq.bIH)
        {
        }
      }
      do
      {
        return false;
        x.i("MicroMsg.WearHardDeviceLogic", "receive register deviceId=%s", new Object[] { paramAnonymoustq.cfq.byN });
        i.ivn.a(com.tencent.mm.sdk.platformtools.ad.getContext(), new af.1.1(this, paramAnonymoustq));
        return false;
        b localb = ad.aHe().Al(paramAnonymoustq.cfq.byN);
        paramAnonymoustq = paramAnonymoustq.cfq;
        if (localb != null) {}
        for (;;)
        {
          paramAnonymoustq.bLW = bool;
          return false;
          bool = false;
        }
        x.i("MicroMsg.WearHardDeviceLogic", "receive send deviceId=%s", new Object[] { paramAnonymoustq.cfq.byN });
        au.DF().a(538, af.this);
        paramAnonymoustq = new w(0L, paramAnonymoustq.cfq.bKv, paramAnonymoustq.cfq.byN, k.f.aGI(), bi.VF(), paramAnonymoustq.cfq.data, 1);
        au.DF().a(paramAnonymoustq, 0);
        return false;
        au.DF().a(541, af.this);
        paramAnonymoustq = new r("AndroidWear", paramAnonymoustq.cfq.bKv, paramAnonymoustq.cfq.byN, 1, new byte[0]);
        au.DF().a(paramAnonymoustq, 0);
        return false;
      } while (bi.bs(com.tencent.mm.sdk.platformtools.ad.getContext(), com.tencent.mm.sdk.platformtools.ad.getPackageName() + ":exdevice"));
      d.de(com.tencent.mm.sdk.platformtools.ad.getContext());
      return false;
    }
  };
  
  public af()
  {
    a.sFg.b(this.cXu);
  }
  
  private static void ak(String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.WearHardDeviceLogic", "publish auth response deviceId=%s | isSuccess=%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    tq localtq = new tq();
    localtq.cfq.bIH = 8;
    localtq.cfq.bLW = paramBoolean;
    localtq.cfq.byN = paramString;
    a.sFg.m(localtq);
  }
  
  private static void al(String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.WearHardDeviceLogic", "publish send response deviceId=%s | isSuccess=%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    tq localtq = new tq();
    localtq.cfq.bIH = 5;
    localtq.cfq.bLW = paramBoolean;
    localtq.cfq.byN = paramString;
    a.sFg.m(localtq);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof r))
    {
      au.DF().b(541, this);
      paramString = (r)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        ak(paramString.ivE, true);
      }
    }
    while (!(paraml instanceof w))
    {
      return;
      ak(paramString.ivE, false);
      return;
    }
    au.DF().b(538, this);
    paramString = (w)paraml;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      al(paramString.ivG, true);
      return;
    }
    al(paramString.ivG, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */