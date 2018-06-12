package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.b;
import com.google.android.gms.analytics.c;
import com.google.android.gms.c.ah;

public class q
{
  private static q aFT;
  public final com.google.android.gms.c.v aFC;
  final Context aFU;
  final ac aFV;
  final f aFW;
  private final ah aFX;
  private final m aFY;
  final ag aFZ;
  private final l aGa;
  final i aGb;
  private final com.google.android.gms.analytics.a aGc;
  private final y aGd;
  public final a aGe;
  public final v aGf;
  public final af aGg;
  final Context mContext;
  
  private q(r paramr)
  {
    Object localObject1 = paramr.aGi;
    com.google.android.gms.common.internal.w.j(localObject1, "Application context can't be null");
    com.google.android.gms.common.internal.w.e(localObject1 instanceof Application, "getApplicationContext didn't return the application");
    Object localObject2 = paramr.aGj;
    com.google.android.gms.common.internal.w.ah(localObject2);
    this.mContext = ((Context)localObject1);
    this.aFU = ((Context)localObject2);
    this.aFC = com.google.android.gms.c.w.qf();
    this.aFV = r.b(this);
    localObject2 = new f(this);
    ((f)localObject2).nq();
    this.aFW = ((f)localObject2);
    if (com.google.android.gms.common.internal.f.aNr) {
      nr().aQ("Google Analytics " + p.VERSION + " is starting up.");
    }
    for (;;)
    {
      localObject2 = r.f(this);
      ((i)localObject2).nq();
      this.aGb = ((i)localObject2);
      localObject2 = new l(this);
      ((l)localObject2).nq();
      this.aGa = ((l)localObject2);
      paramr = new m(this, paramr);
      localObject2 = r.a(this);
      Object localObject3 = new a(this);
      v localv = new v(this);
      af localaf = new af(this);
      localObject1 = ah.au((Context)localObject1);
      ((ah)localObject1).aYp = new q.1(this);
      this.aFX = ((ah)localObject1);
      localObject1 = new com.google.android.gms.analytics.a(this);
      ((y)localObject2).nq();
      this.aGd = ((y)localObject2);
      ((a)localObject3).nq();
      this.aGe = ((a)localObject3);
      localv.nq();
      this.aGf = localv;
      localaf.nq();
      this.aGg = localaf;
      localObject2 = r.e(this);
      ((ag)localObject2).nq();
      this.aFZ = ((ag)localObject2);
      paramr.nq();
      this.aFY = paramr;
      if (com.google.android.gms.common.internal.f.aNr) {
        nr().e("Device AnalyticsService version", p.VERSION);
      }
      localObject2 = ((c)localObject1).aHe.nv();
      if (((l)localObject2).nd()) {
        e.mL().setLogLevel(((l)localObject2).getLogLevel());
      }
      if (((l)localObject2).ng()) {
        ((com.google.android.gms.analytics.a)localObject1).aEK = ((l)localObject2).nh();
      }
      if (((l)localObject2).nd())
      {
        localObject3 = e.mL();
        if (localObject3 != null) {
          ((b)localObject3).setLogLevel(((l)localObject2).getLogLevel());
        }
      }
      ((com.google.android.gms.analytics.a)localObject1).aEH = true;
      this.aGc = ((com.google.android.gms.analytics.a)localObject1);
      paramr.aFJ.start();
      return;
      nr().aQ("Google Analytics " + p.VERSION + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
    }
  }
  
  public static void a(o paramo)
  {
    com.google.android.gms.common.internal.w.j(paramo, "Analytics service not created/initialized");
    com.google.android.gms.common.internal.w.e(paramo.isInitialized(), "Analytics service not initialized");
  }
  
  public static q ac(Context paramContext)
  {
    com.google.android.gms.common.internal.w.ah(paramContext);
    if (aFT == null) {}
    try
    {
      if (aFT == null)
      {
        com.google.android.gms.c.v localv = com.google.android.gms.c.w.qf();
        long l1 = localv.elapsedRealtime();
        paramContext = new q(new r(paramContext.getApplicationContext()));
        aFT = paramContext;
        com.google.android.gms.analytics.a.mD();
        l1 = localv.elapsedRealtime() - l1;
        long l2 = ((Long)aj.aIh.get()).longValue();
        if (l1 > l2) {
          paramContext.nr().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        }
      }
      return aFT;
    }
    finally {}
  }
  
  public static void nx() {}
  
  public final f nr()
  {
    a(this.aFW);
    return this.aFW;
  }
  
  public final ah ns()
  {
    com.google.android.gms.common.internal.w.ah(this.aFX);
    return this.aFX;
  }
  
  public final m nt()
  {
    a(this.aFY);
    return this.aFY;
  }
  
  public final com.google.android.gms.analytics.a nu()
  {
    com.google.android.gms.common.internal.w.ah(this.aGc);
    com.google.android.gms.analytics.a locala = this.aGc;
    if ((locala.aEH) && (!locala.aEI)) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.w.e(bool, "Analytics instance not initialized");
      return this.aGc;
    }
  }
  
  public final l nv()
  {
    a(this.aGa);
    return this.aGa;
  }
  
  public final y nw()
  {
    a(this.aGd);
    return this.aGd;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/analytics/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */