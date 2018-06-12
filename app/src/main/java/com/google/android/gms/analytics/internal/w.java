package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.d;
import com.google.android.gms.c.ah.1;
import com.google.android.gms.c.ah.a;
import com.google.android.gms.c.ai;
import com.google.android.gms.c.ak;
import com.google.android.gms.c.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class w
  extends o
{
  private final u aGG;
  private final h aGH;
  private final g aGI;
  private final t aGJ;
  private long aGK;
  private final ae aGL;
  private final ae aGM;
  private final j aGN;
  long aGO;
  private boolean aGP;
  private boolean mg;
  
  protected w(q paramq, r paramr)
  {
    super(paramq);
    com.google.android.gms.common.internal.w.ah(paramr);
    this.aGK = Long.MIN_VALUE;
    this.aGI = new g(paramq);
    this.aGG = new u(paramq);
    this.aGH = new h(paramq);
    this.aGJ = r.d(paramq);
    this.aGN = new j(this.aFn.aFC);
    this.aGL = new ae(paramq)
    {
      public final void run()
      {
        w localw = w.this;
        localw.b(new w.4(localw));
      }
    };
    this.aGM = new w.2(this, paramq);
  }
  
  private void a(s params, ak paramak)
  {
    com.google.android.gms.common.internal.w.ah(params);
    com.google.android.gms.common.internal.w.ah(paramak);
    Object localObject1 = new com.google.android.gms.analytics.c(this.aFn);
    Object localObject2 = params.aGm;
    com.google.android.gms.common.internal.w.bg((String)localObject2);
    Object localObject3 = d.ba((String)localObject2);
    Object localObject4 = ((com.google.android.gms.analytics.c)localObject1).qn().listIterator();
    while (((ListIterator)localObject4).hasNext()) {
      if (((Uri)localObject3).equals(((ai)((ListIterator)localObject4).next()).ok())) {
        ((ListIterator)localObject4).remove();
      }
    }
    ((com.google.android.gms.analytics.c)localObject1).qn().add(new d(((com.google.android.gms.analytics.c)localObject1).aHe, (String)localObject2));
    ((com.google.android.gms.analytics.c)localObject1).aIm = params.aGn;
    localObject1 = ((com.google.android.gms.analytics.c)localObject1).oj();
    localObject2 = (com.google.android.gms.c.h)((com.google.android.gms.c.ae)localObject1).e(com.google.android.gms.c.h.class);
    ((com.google.android.gms.c.h)localObject2).aWn = "data";
    ((com.google.android.gms.c.h)localObject2).aWs = true;
    ((com.google.android.gms.c.ae)localObject1).b(paramak);
    localObject3 = (com.google.android.gms.c.g)((com.google.android.gms.c.ae)localObject1).e(com.google.android.gms.c.g.class);
    localObject4 = (com.google.android.gms.c.aj)((com.google.android.gms.c.ae)localObject1).e(com.google.android.gms.c.aj.class);
    Iterator localIterator = params.aFa.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject5 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject5).getKey();
      localObject5 = (String)((Map.Entry)localObject5).getValue();
      if ("an".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).aEV = ((String)localObject5);
      }
      else if ("av".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).aEW = ((String)localObject5);
      }
      else if ("aid".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).aYu = ((String)localObject5);
      }
      else if ("aiid".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).aYv = ((String)localObject5);
      }
      else if ("uid".equals(str))
      {
        ((com.google.android.gms.c.h)localObject2).aWo = ((String)localObject5);
      }
      else
      {
        str = com.google.android.gms.c.g.br(str);
        ((com.google.android.gms.c.g)localObject3).aFa.put(str, localObject5);
      }
    }
    b("Sending installation campaign to", params.aGm, paramak);
    ((com.google.android.gms.c.ae)localObject1).aYb = nn().mR();
    params = ((com.google.android.gms.c.ae)localObject1).aXY.aYi;
    if (((com.google.android.gms.c.ae)localObject1).aYf) {
      throw new IllegalStateException("Measurement prototype can't be submitted");
    }
    if (((com.google.android.gms.c.ae)localObject1).aXZ) {
      throw new IllegalStateException("Measurement can only be submitted once");
    }
    paramak = ((com.google.android.gms.c.ae)localObject1).ql();
    paramak.aYc = paramak.aFC.elapsedRealtime();
    if (paramak.aYb != 0L) {}
    for (paramak.aYa = paramak.aYb;; paramak.aYa = paramak.aFC.currentTimeMillis())
    {
      paramak.aXZ = true;
      params.aYo.execute(new ah.1(params, paramak));
      return;
    }
  }
  
  private boolean aW(String paramString)
  {
    return this.aFn.mContext.checkCallingOrSelfPermission(paramString) == 0;
  }
  
  private long nC()
  {
    com.google.android.gms.c.ah.nx();
    np();
    try
    {
      long l = this.aGG.nC();
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      g("Failed to get min/max hit times from local store", localSQLiteException);
    }
    return 0L;
  }
  
  private void nI()
  {
    if (this.aGP) {}
    do
    {
      long l;
      do
      {
        do
        {
          return;
        } while ((!ac.nU()) || (this.aGJ.isConnected()));
        l = ((Long)aj.aIf.get()).longValue();
      } while (!this.aGN.Y(l));
      this.aGN.start();
      aO("Connecting to service");
    } while (!this.aGJ.connect());
    aO("Connected to service");
    this.aGN.aFD = 0L;
    onServiceConnected();
  }
  
  private boolean nJ()
  {
    int j = 1;
    com.google.android.gms.c.ah.nx();
    np();
    aO("Dispatching a batch of local hits");
    int i;
    if ((!this.aGJ.isConnected()) && (!com.google.android.gms.common.internal.f.aNr))
    {
      i = 1;
      if (this.aGH.mO()) {
        break label66;
      }
    }
    for (;;)
    {
      if ((i == 0) || (j == 0)) {
        break label71;
      }
      aO("No network or service available. Will retry later");
      return false;
      i = 0;
      break;
      label66:
      j = 0;
    }
    label71:
    long l3 = Math.max(ac.nY(), ac.nZ());
    ArrayList localArrayList = new ArrayList();
    long l1 = 0L;
    try
    {
      for (;;)
      {
        this.aGG.beginTransaction();
        localArrayList.clear();
        try
        {
          localList = this.aGG.aa(l3);
          if (localList.isEmpty())
          {
            aO("Store is empty, nothing to dispatch");
            nM();
            try
            {
              this.aGG.setTransactionSuccessful();
              this.aGG.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException1)
            {
              g("Failed to commit local dispatch transaction", localSQLiteException1);
              nM();
              return false;
            }
          }
          d("Hits loaded from store. count", Integer.valueOf(localList.size()));
          localObject2 = localList.iterator();
          for (;;)
          {
            if (((Iterator)localObject2).hasNext()) {
              if (((c)((Iterator)localObject2).next()).aFc == l1)
              {
                d("Database contains successfully uploaded hit", Long.valueOf(l1), Integer.valueOf(localList.size()));
                nM();
                try
                {
                  this.aGG.setTransactionSuccessful();
                  this.aGG.endTransaction();
                  return false;
                }
                catch (SQLiteException localSQLiteException2)
                {
                  g("Failed to commit local dispatch transaction", localSQLiteException2);
                  nM();
                  return false;
                }
              }
            }
          }
        }
        catch (SQLiteException localSQLiteException3)
        {
          List localList;
          Object localObject2;
          f("Failed to read hits from persisted store", localSQLiteException3);
          nM();
          try
          {
            this.aGG.setTransactionSuccessful();
            this.aGG.endTransaction();
            return false;
          }
          catch (SQLiteException localSQLiteException4)
          {
            g("Failed to commit local dispatch transaction", localSQLiteException4);
            nM();
            return false;
          }
          long l2 = l1;
          if (this.aGJ.isConnected())
          {
            l2 = l1;
            if (!com.google.android.gms.common.internal.f.aNr)
            {
              aO("Service connected, sending hits to the service");
              for (;;)
              {
                l2 = l1;
                if (!localList.isEmpty())
                {
                  localObject2 = (c)localList.get(0);
                  l2 = l1;
                  if (this.aGJ.d((c)localObject2))
                  {
                    l1 = Math.max(l1, ((c)localObject2).aFc);
                    localList.remove(localObject2);
                    e("Hit sent do device AnalyticsService for delivery", localObject2);
                    try
                    {
                      this.aGG.ab(((c)localObject2).aFc);
                      localSQLiteException4.add(Long.valueOf(((c)localObject2).aFc));
                    }
                    catch (SQLiteException localSQLiteException5)
                    {
                      g("Failed to remove hit that was send for delivery", localSQLiteException5);
                      nM();
                      try
                      {
                        this.aGG.setTransactionSuccessful();
                        this.aGG.endTransaction();
                        return false;
                      }
                      catch (SQLiteException localSQLiteException6)
                      {
                        g("Failed to commit local dispatch transaction", localSQLiteException6);
                        nM();
                        return false;
                      }
                    }
                  }
                }
              }
            }
          }
          l1 = l2;
          if (this.aGH.mO())
          {
            localObject2 = this.aGH.s(localList);
            Iterator localIterator = ((List)localObject2).iterator();
            for (l1 = l2; localIterator.hasNext(); l1 = Math.max(l1, ((Long)localIterator.next()).longValue())) {}
            localList.removeAll((Collection)localObject2);
          }
          try
          {
            this.aGG.u((List)localObject2);
            localSQLiteException6.addAll((Collection)localObject2);
            boolean bool = localSQLiteException6.isEmpty();
            if (bool) {
              try
              {
                this.aGG.setTransactionSuccessful();
                this.aGG.endTransaction();
                return false;
              }
              catch (SQLiteException localSQLiteException7)
              {
                g("Failed to commit local dispatch transaction", localSQLiteException7);
                nM();
                return false;
              }
            }
          }
          catch (SQLiteException localSQLiteException8)
          {
            g("Failed to remove successfully uploaded hits", localSQLiteException8);
            nM();
            try
            {
              this.aGG.setTransactionSuccessful();
              this.aGG.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException9)
            {
              g("Failed to commit local dispatch transaction", localSQLiteException9);
              nM();
              return false;
            }
            try
            {
              this.aGG.setTransactionSuccessful();
              this.aGG.endTransaction();
            }
            catch (SQLiteException localSQLiteException10)
            {
              g("Failed to commit local dispatch transaction", localSQLiteException10);
              nM();
              return false;
            }
          }
        }
      }
      return false;
    }
    finally
    {
      try
      {
        this.aGG.setTransactionSuccessful();
        this.aGG.endTransaction();
        throw ((Throwable)localObject1);
      }
      catch (SQLiteException localSQLiteException11)
      {
        g("Failed to commit local dispatch transaction", localSQLiteException11);
        nM();
      }
    }
  }
  
  private void nL()
  {
    ag localag = nm();
    if (!localag.aHo) {}
    long l;
    do
    {
      do
      {
        return;
      } while (localag.aHp);
      l = nC();
    } while ((l == 0L) || (Math.abs(this.aFn.aFC.currentTimeMillis() - l) > ((Long)aj.aHE.get()).longValue()));
    d("Dispatch alarm scheduled (ms)", Long.valueOf(ac.nX()));
    localag.oh();
  }
  
  private void nM()
  {
    if (this.aGL.of()) {
      aO("All hits dispatched or no network/service. Going to power save mode");
    }
    this.aGL.cancel();
    ag localag = nm();
    if (localag.aHp) {
      localag.cancel();
    }
  }
  
  private long nN()
  {
    long l;
    if (this.aGK != Long.MIN_VALUE) {
      l = this.aGK;
    }
    do
    {
      return l;
      l = ((Long)aj.aHz.get()).longValue();
    } while (!this.aFn.nv().ne());
    return this.aFn.nv().nf() * 1000L;
  }
  
  private void nO()
  {
    np();
    q.nx();
    this.aGP = true;
    this.aGJ.disconnect();
    nK();
  }
  
  public final void aX(String paramString)
  {
    com.google.android.gms.common.internal.w.bg(paramString);
    q.nx();
    nl();
    ak localak = k.a(this.aFn.nr(), paramString);
    if (localak == null) {
      f("Parsing failed. Ignoring invalid campaign data", paramString);
    }
    for (;;)
    {
      return;
      String str = nn().mV();
      if (paramString.equals(str))
      {
        aR("Ignoring duplicate install campaign");
        return;
      }
      if (!TextUtils.isEmpty(str))
      {
        d("Ignoring multiple install campaigns. original, new", str, paramString);
        return;
      }
      nn().aK(paramString);
      if (nn().mS().Y(ac.oe()))
      {
        f("Campaign received too late, ignoring", localak);
        return;
      }
      e("Received installation campaign", localak);
      paramString = this.aGG.nD().iterator();
      while (paramString.hasNext()) {
        a((s)paramString.next(), localak);
      }
    }
  }
  
  public final void b(ah paramah)
  {
    long l2 = this.aGO;
    com.google.android.gms.c.ah.nx();
    np();
    long l1 = -1L;
    long l3 = nn().mT();
    if (l3 != 0L) {
      l1 = Math.abs(this.aFn.aFC.currentTimeMillis() - l3);
    }
    e("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l1));
    if (!com.google.android.gms.common.internal.f.aNr) {
      nI();
    }
    try
    {
      nJ();
      nn().mU();
      nK();
      if (paramah != null) {
        paramah.mB();
      }
      if (this.aGO != l2)
      {
        Object localObject = this.aGI;
        if (Build.VERSION.SDK_INT > 10)
        {
          localObject = ((g)localObject).aFn.mContext;
          Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
          localIntent.addCategory(((Context)localObject).getPackageName());
          localIntent.putExtra(g.aFm, true);
          ((Context)localObject).sendOrderedBroadcast(localIntent, null);
        }
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      do
      {
        g("Local dispatch failed", localThrowable);
        nn().mU();
        nK();
      } while (paramah == null);
      paramah.mB();
    }
  }
  
  public final void c(c paramc)
  {
    com.google.android.gms.common.internal.w.ah(paramc);
    com.google.android.gms.c.ah.nx();
    np();
    if (this.aGP) {
      aP("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
    }
    Object localObject2;
    while (!TextUtils.isEmpty(paramc.l("_m", "")))
    {
      localObject2 = paramc;
      nI();
      if (!this.aGJ.d((c)localObject2)) {
        break label364;
      }
      aP("Hit sent to the device AnalyticsService for delivery");
      return;
      d("Delivering hit", paramc);
    }
    Object localObject1 = nn().aFz;
    long l = ((i.a)localObject1).mX();
    if (l == 0L)
    {
      l = 0L;
      label103:
      if (l >= ((i.a)localObject1).aFA) {
        break label258;
      }
      localObject1 = null;
    }
    for (;;)
    {
      localObject2 = paramc;
      if (localObject1 == null) {
        break;
      }
      localObject2 = (Long)((Pair)localObject1).second;
      localObject1 = (String)((Pair)localObject1).first;
      localObject1 = localObject2 + ":" + (String)localObject1;
      localObject2 = new HashMap(paramc.aFa);
      ((Map)localObject2).put("_m", localObject1);
      localObject2 = new c(this, (Map)localObject2, paramc.aFd, paramc.aFf, paramc.aFc, paramc.aFe, paramc.aFb);
      break;
      l = Math.abs(l - ((i.a)localObject1).aFB.aFn.aFC.currentTimeMillis());
      break label103;
      label258:
      if (l > ((i.a)localObject1).aFA * 2L)
      {
        ((i.a)localObject1).mW();
        localObject1 = null;
      }
      else
      {
        localObject2 = ((i.a)localObject1).aFB.aFw.getString(((i.a)localObject1).na(), null);
        l = ((i.a)localObject1).aFB.aFw.getLong(((i.a)localObject1).mZ(), 0L);
        ((i.a)localObject1).mW();
        if ((localObject2 == null) || (l <= 0L)) {
          localObject1 = null;
        } else {
          localObject1 = new Pair(localObject2, Long.valueOf(l));
        }
      }
    }
    label364:
    if (com.google.android.gms.common.internal.f.aNr)
    {
      this.aFn.nr().a((c)localObject2, "Service unavailable on package side");
      return;
    }
    try
    {
      this.aGG.e((c)localObject2);
      nK();
      return;
    }
    catch (SQLiteException paramc)
    {
      g("Delivery failed to save hit to a database", paramc);
      this.aFn.nr().a((c)localObject2, "deliver: failed to insert hit to database");
    }
  }
  
  protected final void c(s params)
  {
    q.nx();
    e("Sending first hit to property", params.aGm);
    if (nn().mS().Y(ac.oe())) {}
    do
    {
      return;
      localObject = nn().mV();
    } while (TextUtils.isEmpty((CharSequence)localObject));
    Object localObject = k.a(this.aFn.nr(), (String)localObject);
    e("Found relevant installation campaign", localObject);
    a(params, (ak)localObject);
  }
  
  public final long d(s params)
  {
    com.google.android.gms.common.internal.w.ah(params);
    np();
    q.nx();
    try
    {
      this.aGG.beginTransaction();
      this.aGG.b(params.aGk, params.aGl);
      long l = this.aGG.a(params.aGk, params.aGl, params.aGm);
      params.aGo = (1L + l);
      this.aGG.b(params);
      this.aGG.setTransactionSuccessful();
      try
      {
        this.aGG.endTransaction();
        return l;
      }
      catch (SQLiteException params)
      {
        g("Failed to end transaction", params);
        return l;
      }
      try
      {
        this.aGG.endTransaction();
        throw params;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          g("Failed to end transaction", localSQLiteException);
        }
      }
    }
    catch (SQLiteException params)
    {
      params = params;
      g("Failed to update Analytics property", params);
      try
      {
        this.aGG.endTransaction();
        return -1L;
      }
      catch (SQLiteException params)
      {
        for (;;)
        {
          g("Failed to end transaction", params);
        }
      }
    }
    finally {}
  }
  
  protected final void mE()
  {
    this.aGG.nq();
    this.aGH.nq();
    this.aGJ.nq();
  }
  
  protected final void nH()
  {
    np();
    nn().mR();
    if (!aW("android.permission.ACCESS_NETWORK_STATE"))
    {
      aS("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      nO();
    }
    if (!aW("android.permission.INTERNET"))
    {
      aS("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      nO();
    }
    if (AnalyticsService.ab(this.aFn.mContext)) {
      aO("AnalyticsService registered in the app manifest and enabled");
    }
    for (;;)
    {
      if ((!this.aGP) && (!com.google.android.gms.common.internal.f.aNr) && (!this.aGG.isEmpty())) {
        nI();
      }
      nK();
      return;
      if (com.google.android.gms.common.internal.f.aNr) {
        aS("Device AnalyticsService not registered! Hits will not be delivered reliably.");
      } else {
        aR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
  
  public final void nK()
  {
    long l3 = 0L;
    q.nx();
    np();
    if ((!this.aGP) && ((!com.google.android.gms.common.internal.f.aNr) || (this.aFn.aFV.nT())) && (nN() > 0L)) {}
    for (int i = 1; i == 0; i = 0)
    {
      this.aGI.unregister();
      nM();
      return;
    }
    if (this.aGG.isEmpty())
    {
      this.aGI.unregister();
      nM();
      return;
    }
    Object localObject;
    boolean bool;
    label257:
    long l1;
    if (!((Boolean)aj.aIa.get()).booleanValue())
    {
      localObject = this.aGI;
      ((g)localObject).mN();
      if (!((g)localObject).aFo)
      {
        Context localContext = ((g)localObject).aFn.mContext;
        localContext.registerReceiver((BroadcastReceiver)localObject, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter localIntentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        localIntentFilter.addCategory(localContext.getPackageName());
        localContext.registerReceiver((BroadcastReceiver)localObject, localIntentFilter);
        ((g)localObject).aFp = ((g)localObject).mO();
        ((g)localObject).aFn.nr().d("Registering connectivity change receiver. Network connected", Boolean.valueOf(((g)localObject).aFp));
        ((g)localObject).aFo = true;
      }
      localObject = this.aGI;
      if (!((g)localObject).aFo) {
        ((g)localObject).aFn.nr().aR("Connectivity unknown. Receiver not registered");
      }
      bool = ((g)localObject).aFp;
      if (!bool) {
        break label537;
      }
      nL();
      l2 = nN();
      l1 = nn().mT();
      if (l1 == 0L) {
        break label406;
      }
      l1 = l2 - Math.abs(this.aFn.aFC.currentTimeMillis() - l1);
      if (l1 <= 0L) {
        break label394;
      }
      label313:
      d("Dispatch scheduled (ms)", Long.valueOf(l1));
      if (!this.aGL.of()) {
        break label528;
      }
      localObject = this.aGL;
      if (((ae)localObject).aHl != 0L) {
        break label418;
      }
    }
    label394:
    label406:
    label418:
    for (long l2 = 0L;; l2 = Math.abs(((ae)localObject).aFn.aFC.currentTimeMillis() - ((ae)localObject).aHl))
    {
      l1 = Math.max(1L, l1 + l2);
      localObject = this.aGL;
      if (!((ae)localObject).of()) {
        break;
      }
      if (l1 >= 0L) {
        break label445;
      }
      ((ae)localObject).cancel();
      return;
      bool = true;
      break label257;
      l1 = Math.min(ac.nW(), l2);
      break label313;
      l1 = Math.min(ac.nW(), l2);
      break label313;
    }
    label445:
    l1 -= Math.abs(((ae)localObject).aFn.aFC.currentTimeMillis() - ((ae)localObject).aHl);
    if (l1 < 0L) {
      l1 = l3;
    }
    for (;;)
    {
      ((ae)localObject).getHandler().removeCallbacks(((ae)localObject).aHk);
      if (((ae)localObject).getHandler().postDelayed(((ae)localObject).aHk, l1)) {
        break;
      }
      ((ae)localObject).aFn.nr().g("Failed to adjust delayed post. time", Long.valueOf(l1));
      return;
      label528:
      this.aGL.ac(l1);
      return;
      label537:
      nM();
      nL();
      return;
    }
  }
  
  public final void nj()
  {
    com.google.android.gms.c.ah.nx();
    np();
    aO("Service disconnected");
  }
  
  protected final void onServiceConnected()
  {
    
    if (!com.google.android.gms.common.internal.f.aNr)
    {
      com.google.android.gms.c.ah.nx();
      np();
      nl();
      if (!ac.nU()) {
        aR("Service client disabled. Can't dispatch local hits to device AnalyticsService");
      }
      if (this.aGJ.isConnected()) {
        break label50;
      }
      aO("Service not connected");
    }
    label50:
    while (this.aGG.isEmpty()) {
      return;
    }
    aO("Dispatching local hits to device AnalyticsService");
    for (;;)
    {
      try
      {
        List localList = this.aGG.aa(ac.nY());
        if (!localList.isEmpty()) {
          break label126;
        }
        nK();
        return;
      }
      catch (SQLiteException localSQLiteException1)
      {
        g("Failed to read hits from store", localSQLiteException1);
        nM();
        return;
      }
      label107:
      Object localObject;
      localSQLiteException1.remove(localObject);
      try
      {
        this.aGG.ab(((c)localObject).aFc);
        label126:
        if (!localSQLiteException1.isEmpty())
        {
          localObject = (c)localSQLiteException1.get(0);
          if (this.aGJ.d((c)localObject)) {
            break label107;
          }
          nK();
          return;
        }
      }
      catch (SQLiteException localSQLiteException2)
      {
        g("Failed to remove hit that was send for delivery", localSQLiteException2);
        nM();
      }
    }
  }
  
  final void start()
  {
    np();
    boolean bool;
    Context localContext;
    if (!this.mg)
    {
      bool = true;
      com.google.android.gms.common.internal.w.d(bool, "Analytics backend already started");
      this.mg = true;
      if (!com.google.android.gms.common.internal.f.aNr)
      {
        localContext = this.aFn.mContext;
        if (AnalyticsReceiver.aa(localContext)) {
          break label91;
        }
        aR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        label53:
        if (CampaignTrackingReceiver.aa(localContext)) {
          break label108;
        }
        aR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
    for (;;)
    {
      this.aFn.ns().d(new Runnable()
      {
        public final void run()
        {
          w.this.nH();
        }
      });
      return;
      bool = false;
      break;
      label91:
      if (AnalyticsService.ab(localContext)) {
        break label53;
      }
      aS("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
      break label53;
      label108:
      if (!CampaignTrackingService.ab(localContext)) {
        aR("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/analytics/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */