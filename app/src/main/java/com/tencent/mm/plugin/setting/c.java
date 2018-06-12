package com.tencent.mm.plugin.setting;

import android.annotation.SuppressLint;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.protocal.c.bay;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.HashMap;

public final class c
  implements ar
{
  private bv.a mOA = new c.2(this);
  private n mOB = new c.3(this);
  private bv.a mOC = new c.4(this);
  private n mOD = new c.5(this);
  private m.b mOz = new m.b()
  {
    public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
    {
      if (paramAnonymousInt == 2)
      {
        paramAnonymousm = (String)paramAnonymousObject;
        paramAnonymousObject = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yb(paramAnonymousm);
        if ((paramAnonymousObject != null) && (!com.tencent.mm.l.a.gd(((ai)paramAnonymousObject).field_type)) && (((ab)paramAnonymousObject).By()) && (!((ab)paramAnonymousObject).Bz())) {
          com.tencent.mm.kernel.g.Em().h(new c.1.1(this, paramAnonymousm), 5000L);
        }
      }
    }
  };
  
  public c()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreSetting", "SubCoreSetting constructor: " + System.currentTimeMillis());
  }
  
  static void btp()
  {
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sWZ, Long.valueOf(0L));
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sXa, "");
    com.tencent.mm.s.c.Cp().v(262157, false);
  }
  
  @SuppressLint({"UseSparseArrays"})
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset: " + System.currentTimeMillis());
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("redpointinfo", this.mOA, true);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("crowdtest", this.mOC, true);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("showtrustedfriends", this.mOB);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("DeviceProtectRedSpot", this.mOD);
    int i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWY, Integer.valueOf(d.qVN))).intValue();
    long l = ((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWZ, Long.valueOf(0L))).longValue();
    if ((i <= d.qVN) || (l < System.currentTimeMillis())) {
      btp();
    }
    if (paramBoolean)
    {
      i = q.GQ();
      com.tencent.mm.kernel.g.Ei().DT().set(34, Integer.valueOf(i & 0xFFEFFFFF & 0xFFBFFFFF));
      bay localbay = new bay();
      localbay.raB = 1048576;
      localbay.sdm = 0;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(39, localbay));
      localbay = new bay();
      localbay.raB = 4194304;
      localbay.sdm = 0;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(39, localbay));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreSetting", "set void default open");
    }
    if ((com.tencent.mm.k.g.AT().getInt("ShowTurnOnFriendVerificationSysmsgSwitch", 0) == 1) && ((q.GJ() & 0x20) == 0)) {
      ((i)com.tencent.mm.kernel.g.l(i.class)).FR().a(this.mOz);
    }
  }
  
  public final void bo(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreSetting", "SubCoreSetting onSdcardMount: " + System.currentTimeMillis());
  }
  
  public final void gi(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreSetting", "SubCoreSetting clearPluginData: " + System.currentTimeMillis());
  }
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountRelease: " + System.currentTimeMillis());
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("redpointinfo", this.mOA, true);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("crowdtest", this.mOC, true);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("showtrustedfriends", this.mOB);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("DeviceProtectRedSpot", this.mOD);
    ((i)com.tencent.mm.kernel.g.l(i.class)).FR().b(this.mOz);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */