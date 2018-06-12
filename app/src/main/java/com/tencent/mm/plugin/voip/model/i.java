package com.tencent.mm.plugin.voip.model;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.al;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.as;
import com.tencent.mm.model.au;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.ui.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;

public final class i
  implements ar
{
  private r oJo = null;
  private n oJp = new n();
  g oJq;
  private com.tencent.mm.plugin.voip.a oJr = new com.tencent.mm.plugin.voip.a();
  
  private static i bJH()
  {
    au.HN();
    i locali2 = (i)bs.iK("plugin.voip");
    i locali1 = locali2;
    if (locali2 == null)
    {
      locali1 = new i();
      au.HN().a("plugin.voip", locali1);
    }
    return locali1;
  }
  
  public static r bJI()
  {
    if (!au.HX()) {
      throw new b();
    }
    if (bJH().oJo == null) {
      bJH().oJo = new r();
    }
    return bJH().oJo;
  }
  
  public static g bJJ()
  {
    if (!au.HX()) {
      throw new b();
    }
    if (bJH().oJq == null) {
      bJH().oJq = new g();
    }
    return bJH().oJq;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(50), this.oJp);
    bJI();
    r.bKZ();
    com.tencent.mm.sdk.b.a.sFg.b(this.oJr);
    au.getNotification().cancel(40);
    au.HU();
    paramBoolean = ((Boolean)c.DT().get(73217, Boolean.valueOf(true))).booleanValue();
    au.HU();
    boolean bool2 = ((Boolean)c.DT().get(73218, Boolean.valueOf(true))).booleanValue();
    boolean bool1 = com.tencent.mm.k.a.Am();
    au.HU();
    boolean bool3 = ((Boolean)c.DT().get(aa.a.sZP, Boolean.valueOf(false))).booleanValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVoip", "voipSound: %s, voipAudioSound: %s, msgSound: %s, hasReport: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
    if (!bool3)
    {
      if ((!paramBoolean) && (!bool2)) {
        break label219;
      }
      paramBoolean = true;
      if (paramBoolean != bool1)
      {
        if ((!paramBoolean) || (bool1)) {
          break label224;
        }
        h.mEJ.a(500L, 13L, 1L, false);
      }
    }
    for (;;)
    {
      au.HU();
      c.DT().a(aa.a.sZP, Boolean.valueOf(true));
      as.ha(1);
      return;
      label219:
      paramBoolean = false;
      break;
      label224:
      if ((!paramBoolean) && (bool1)) {
        h.mEJ.a(500L, 14L, 1L, false);
      }
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    if (this.oJq != null) {
      ah.A(new i.1(this));
    }
    d.c.b(Integer.valueOf(50), this.oJp);
    bJI();
    r.bLa();
    com.tencent.mm.sdk.b.a.sFg.c(this.oJr);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */