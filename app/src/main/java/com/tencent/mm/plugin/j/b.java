package com.tencent.mm.plugin.j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.bm;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.u;
import com.tencent.mm.platformtools.u.a;
import com.tencent.mm.plugin.j.a.d;
import com.tencent.mm.plugin.j.c.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import java.util.HashSet;

public final class b
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.b.c
{
  private static HashMap<Integer, h.d> hsC;
  private static b hsF;
  private f.a dYI = new b.10(this);
  private com.tencent.mm.plugin.j.b.b hsD;
  private u.a hsE;
  private ah hsG;
  private com.tencent.mm.plugin.j.c.c hsH = null;
  public HashSet<Long> hsI = new HashSet();
  public boolean hsJ = false;
  private boolean hsK = false;
  public com.tencent.mm.plugin.j.c.c hsL = null;
  com.tencent.mm.plugin.j.c.b hsM = null;
  private HashMap<Integer, com.tencent.mm.plugin.j.a.a> hsN = new HashMap();
  private c.a hsO = new b.6(this);
  private c.a hsP = new b.9(this);
  private com.tencent.mm.sdk.b.c<cd> hsQ = new b.11(this);
  private boolean hsR = false;
  private boolean hsS = true;
  private BroadcastReceiver hsT;
  private Runnable hsU;
  private boolean hsV = false;
  private com.tencent.mm.sdk.b.c<bm> hsW = new b.3(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    hsC = localHashMap;
    localHashMap.put(Integer.valueOf("WXFILEINDEX_TABLE".hashCode()), new b.1());
  }
  
  private void atI()
  {
    j(new b.8(this));
  }
  
  public static b avr()
  {
    try
    {
      if (hsF == null) {
        hsF = new b();
      }
      b localb = hsF;
      return localb;
    }
    finally {}
  }
  
  public static long avt()
  {
    long l2 = ((Long)g.Ei().DT().get(aa.a.sYj, Long.valueOf(-1L))).longValue();
    long l1 = l2;
    if (l2 <= -1L)
    {
      l1 = ((i)g.l(i.class)).bcY().He("message");
      g.Ei().DT().a(aa.a.sYj, Long.valueOf(l1));
    }
    return l1;
  }
  
  public static long avw()
  {
    return ((Long)g.Ei().DT().get(aa.a.sYi, Long.valueOf(0L))).longValue();
  }
  
  public static int avx()
  {
    return ((Integer)g.Ei().DT().get(aa.a.sYh, Integer.valueOf(5))).intValue();
  }
  
  public static void p(int paramInt, long paramLong)
  {
    int i = 30;
    if (paramLong <= 1000L)
    {
      paramInt += 5;
      if (paramInt <= 30) {
        break label111;
      }
      paramInt = i;
    }
    label111:
    for (;;)
    {
      i = paramInt;
      if (paramInt < 5) {
        i = 5;
      }
      g.Ei().DT().a(aa.a.sYh, Integer.valueOf(i));
      paramInt = ((Integer)h.a(i, new int[] { 5, 10, 20, 25, 30 }, 10, 15)).intValue();
      h.mEJ.a(664L, paramInt, 1L, false);
      return;
      paramInt -= 5;
      break;
    }
  }
  
  public final void K(bd parambd)
  {
    if (parambd == null) {}
    for (;;)
    {
      return;
      try
      {
        com.tencent.mm.plugin.j.a.a locala = (com.tencent.mm.plugin.j.a.a)this.hsN.get(Integer.valueOf(parambd.getType()));
        if (locala != null)
        {
          locala.L(parambd);
          return;
        }
      }
      catch (Exception parambd)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CalcWxService", parambd, "", new Object[0]);
        h.mEJ.a(664L, 5L, 1L, false);
      }
    }
  }
  
  public final com.tencent.mm.plugin.j.b.b avs()
  {
    if (this.hsD == null) {
      this.hsD = new com.tencent.mm.plugin.j.b.b(this.hsE);
    }
    return this.hsD;
  }
  
  public final boolean avu()
  {
    long l1 = avt();
    long l2 = avw();
    if (l2 >= l1) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CalcWxService", "%d scan finish [%d %d %b]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool) });
      if ((bool) && (((Long)g.Ei().DT().get(aa.a.sYm, Long.valueOf(0L))).longValue() <= 0L)) {
        g.Ei().DT().a(aa.a.sYm, Long.valueOf(bi.VE()));
      }
      return bool;
    }
  }
  
  public final void avv()
  {
    this.hsJ = false;
    this.hsI.clear();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CalcWxService", "%d unlock msg change [%s]", new Object[] { Integer.valueOf(hashCode()), bi.cjd() });
  }
  
  public final String avy()
  {
    return hashCode();
  }
  
  public final void cc(long paramLong)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CalcWxService", "%d update scan msgid[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(paramLong) });
    g.Ei().DT().a(aa.a.sYi, Long.valueOf(paramLong));
  }
  
  public final void dN(boolean paramBoolean)
  {
    boolean bool = false;
    String str = avy();
    if (this.hsL != null) {
      bool = true;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CalcWxService", "%s manual scan now manualScanTask[%b] uiClick[%b]", new Object[] { str, Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
    j(new b.4(this, paramBoolean));
  }
  
  public final void j(Runnable paramRunnable)
  {
    if (this.hsG != null)
    {
      this.hsG.H(paramRunnable);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CalcWxService", "%s post runnable but thread is null ", new Object[] { avy() });
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CalcWxService", "%s CalcWxService Initialized", new Object[] { avy() });
    if (this.hsG == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CalcWxService", "%s init calc wx thread", new Object[] { avy() });
      this.hsG = new ah("calc-wx");
    }
    paramc = g.Ei().cachePath + "WxFileIndex.db";
    this.hsE = u.a(hashCode(), paramc, hsC, true);
    this.hsN.put(Integer.valueOf(43), new com.tencent.mm.plugin.j.a.e());
    this.hsN.put(Integer.valueOf(62), new com.tencent.mm.plugin.j.a.e());
    this.hsN.put(Integer.valueOf(44), new com.tencent.mm.plugin.j.a.e());
    this.hsN.put(Integer.valueOf(34), new com.tencent.mm.plugin.j.a.f());
    this.hsN.put(Integer.valueOf(3), new d());
    this.hsN.put(Integer.valueOf(49), new com.tencent.mm.plugin.j.a.c());
    this.hsN.put(Integer.valueOf(268435505), new com.tencent.mm.plugin.j.a.b());
    avt();
    ((i)g.l(i.class)).bcY().a(this.dYI, null);
    com.tencent.mm.sdk.b.a.sFg.a(this.hsQ);
    paramc = ad.getContext();
    Object localObject = paramc.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool;
    if (localObject != null)
    {
      int i = ((Intent)localObject).getIntExtra("status", -1);
      if ((i == 2) || (i == 5)) {
        bool = true;
      }
    }
    for (this.hsR = bool;; this.hsR = false)
    {
      this.hsS = ((PowerManager)paramc.getSystemService("power")).isScreenOn();
      this.hsT = new b.2(this);
      localObject = new IntentFilter();
      ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_CONNECTED");
      ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      paramc.registerReceiver(this.hsT, (IntentFilter)localObject);
      com.tencent.mm.sdk.b.a.sFg.a(this.hsW);
      if (this.hsV) {
        com.tencent.mm.sdk.b.a.sFg.m(new bm());
      }
      return;
      bool = false;
      break;
    }
  }
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CalcWxService", "CalcWxService Release");
    this.hsI.clear();
    this.hsJ = false;
    if (this.hsE != null)
    {
      this.hsE.iQ(hashCode());
      this.hsE = null;
    }
    ((i)g.l(i.class)).bcY().a(this.dYI);
    com.tencent.mm.sdk.b.a.sFg.c(this.hsQ);
    this.hsN.clear();
    if (this.hsT != null)
    {
      ad.getContext().unregisterReceiver(this.hsT);
      this.hsT = null;
    }
    if (this.hsU != null)
    {
      au.Em();
      ah.M(this.hsU);
      this.hsU = null;
    }
    atI();
    if (this.hsG != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CalcWxService", "%s quit calc wx thread", new Object[] { avy() });
      this.hsG.lnJ.quit();
    }
    this.hsG = null;
    com.tencent.mm.sdk.b.a.sFg.c(this.hsW);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */