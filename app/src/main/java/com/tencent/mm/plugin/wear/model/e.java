package com.tencent.mm.plugin.wear.model;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  com.tencent.mm.sdk.b.c cYt = new e.11(this);
  al eOf = new al(Looper.getMainLooper(), new e.7(this), true);
  f.a iJe = new e.2(this);
  com.tencent.mm.sdk.b.c kRJ = new e.3(this);
  com.tencent.mm.sdk.b.c ocR = new com.tencent.mm.sdk.b.c() {};
  private PowerManager pJg;
  private KeyguardManager pJh;
  com.tencent.mm.sdk.b.c pJi = new e.4(this);
  com.tencent.mm.sdk.b.c pJj = new e.5(this);
  com.tencent.mm.sdk.b.c pJk = new e.6(this);
  com.tencent.mm.sdk.b.c pJl = new e.8(this);
  com.tencent.mm.sdk.b.c pJm = new e.9(this);
  com.tencent.mm.sdk.b.c pJn = new e.10(this);
  
  public e()
  {
    x.i("MicroMsg.Wear.WearLogic", "Create!");
    this.ocR.cht();
    this.pJi.cht();
    this.pJj.cht();
    this.pJk.cht();
    this.pJl.cht();
    this.pJm.cht();
    this.pJn.cht();
    this.cYt.cht();
    this.kRJ.cht();
    this.eOf.J(1800000L, 1800000L);
    this.pJg = ((PowerManager)ad.getContext().getSystemService("power"));
    this.pJh = ((KeyguardManager)ad.getContext().getSystemService("keyguard"));
    au.HU();
    com.tencent.mm.model.c.FT().a(this.iJe, null);
  }
  
  public static void m(String paramString, int paramInt, boolean paramBoolean)
  {
    a.bSl().pIS.a(new com.tencent.mm.plugin.wear.model.f.j(paramString, paramInt, paramBoolean));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */