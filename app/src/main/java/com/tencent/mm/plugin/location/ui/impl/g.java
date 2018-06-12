package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.o.a;
import com.tencent.mm.plugin.location.model.o.b;
import com.tencent.mm.plugin.location.ui.MyLocationButton;
import com.tencent.mm.plugin.location.ui.ShareHeader;
import com.tencent.mm.plugin.location.ui.TipSayingWidget;
import com.tencent.mm.plugin.location.ui.VolumeMeter;
import com.tencent.mm.plugin.location.ui.k;
import com.tencent.mm.plugin.location.ui.l.a;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.plugin.location.ui.m.a;
import com.tencent.mm.plugin.location.ui.n;
import com.tencent.mm.plugin.location_soso.ViewManager;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.apj;
import com.tencent.mm.protocal.c.bbe;
import com.tencent.mm.protocal.c.btp;
import com.tencent.mm.protocal.c.bxg;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.a.c.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class g
  extends i
  implements l.a
{
  private com.tencent.mm.modelgeo.a.a cXs = new g.4(this);
  private View kFL;
  private m.a kHi = new m.a() {};
  private Button kJI;
  MyLocationButton kJJ;
  private TipSayingWidget kJK;
  m kJL;
  com.tencent.mm.plugin.location.model.o kJM = com.tencent.mm.plugin.location.model.l.aZi();
  com.tencent.mm.plugin.location.ui.l kJN;
  k kJO;
  private com.tencent.mm.plugin.location.ui.i kJP;
  private com.tencent.mm.modelgeo.c kJQ = com.tencent.mm.modelgeo.c.OB();
  private ShareHeader kJR;
  private String kJS;
  private long kJT = 0L;
  private long kJU = 0L;
  private o.b kJV = new g.2(this);
  private o.a kJW = new o.a()
  {
    public final void aZt()
    {
      g localg = g.this;
      c.a locala = new c.a(localg.activity);
      locala.Gr(a.h.track_timeout);
      locala.Gt(a.h.app_ok).a(new g.9(localg));
      locala.anj().show();
    }
  };
  private HashMap<String, bxg> kJX = new HashMap();
  private PowerManager.WakeLock wakeLock;
  
  public g(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  private void bah()
  {
    YC();
    this.kJL.gk(false);
    this.kJM.stop();
    this.kJM.rP(3);
    k.aZL();
    this.kJM.kDQ = this.kHR.kEZ.getZoom();
    this.activity.finish();
  }
  
  public final void aZN()
  {
    this.kJM.kDQ = this.kHR.kEZ.getZoom();
    this.activity.finish();
  }
  
  public final void aZO()
  {
    this.kJL.gk(false);
    this.kJM.stop();
    this.kJM.rP(0);
    k.aZL();
    this.activity.finish();
  }
  
  public final void aZP()
  {
    Object localObject = this.kJL.kHa;
    if (localObject != null)
    {
      LocationInfo localLocationInfo = this.kHP;
      localLocationInfo.kCz = ((btp)localObject).sbw;
      localLocationInfo.kCx = ((btp)localObject).rji;
      localLocationInfo.kCw = ((btp)localObject).rjj;
      if (!TextUtils.isEmpty(((btp)localObject).sbw)) {
        break label146;
      }
      this.kKt.setText("");
    }
    for (;;)
    {
      this.kKt.b(this.kHP);
      localObject = this.kKt;
      ((n)localObject).mViewManager.updateViewLayout(((n)localObject).kHF, ((n)localObject).kCw, ((n)localObject).kCx, false);
      if (((n)localObject).kHI) {
        ((n)localObject).mViewManager.showInfoWindowByView(((n)localObject).kHF);
      }
      this.kHR.kEZ.getIController().animateTo(this.kHP.kCw, this.kHP.kCx);
      return;
      label146:
      this.kKt.setText(((btp)localObject).sbw);
    }
  }
  
  protected final void aZV()
  {
    super.aZV();
  }
  
  final void aZW()
  {
    super.aZW();
    this.wakeLock = ((PowerManager)this.activity.getSystemService("power")).newWakeLock(26, "Track Lock");
    if (this.kKt != null)
    {
      localObject1 = this.kKt;
      ((n)localObject1).kHG.setVisibility(4);
      ((n)localObject1).isVisible = false;
    }
    findViewById(a.e.header_bar).setVisibility(8);
    this.kJJ = ((MyLocationButton)findViewById(a.e.locate_to_my_position));
    this.kJJ.setProgressBar(this.kHR.kEZ);
    this.kJJ.aZy();
    this.kJJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        g.this.kJJ.aZy();
        g.this.kJL.kHb = true;
        g.this.kJL.a(g.this.kHR.kEZ);
        g.this.kJL.gj(false);
        h.mEJ.h(10997, new Object[] { "6", "", Integer.valueOf(0), Integer.valueOf(0) });
      }
    });
    this.kFL = findViewById(a.e.header_avatar_area);
    this.kJR = ((ShareHeader)findViewById(a.e.share_header));
    this.kJR.setVisibility(0);
    this.kJP = new com.tencent.mm.plugin.location.ui.i(this.activity, this.kJR.getHeaderBar(), this.kFL, this.kDN, this.kHR.kEZ);
    this.kJP.kFR = new g.6(this);
    this.kJM.kDP = this.kJW;
    if (this.kJL == null) {
      this.kJL = new m(this.activity, this.kHR.kEZ, true);
    }
    this.kJL.kHi = this.kHi;
    this.kJL.kGW = false;
    this.kJN = new com.tencent.mm.plugin.location.ui.l(this.activity, this);
    this.kJK = ((TipSayingWidget)findViewById(a.e.saying_tips));
    this.kJI = ((Button)findViewById(a.e.share_speak));
    this.kJI.setVisibility(0);
    this.kJO = new k(this.activity, this.kJI);
    this.kJO.kGF = this.kJP;
    this.kJR.setOnLeftClickListener(new g.7(this));
    this.kJR.setOnRightClickListener(new g.8(this));
    ((LocationManager)this.activity.getSystemService("location")).isProviderEnabled("gps");
    Object localObject1 = this.kJM;
    Object localObject2 = this.kHP;
    ((com.tencent.mm.plugin.location.model.o)localObject1).kDS = System.currentTimeMillis();
    ((com.tencent.mm.plugin.location.model.o)localObject1).dMm = com.tencent.mm.modelgeo.c.OB();
    ((com.tencent.mm.plugin.location.model.o)localObject1).dMm.b(((com.tencent.mm.plugin.location.model.o)localObject1).cXs, true);
    if (((com.tencent.mm.plugin.location.model.o)localObject1).kDF == null) {
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDF = com.tencent.mm.plugin.location.model.l.aZk();
    }
    ((com.tencent.mm.plugin.location.model.o)localObject1).kDF.a(((com.tencent.mm.plugin.location.model.o)localObject1).kDU);
    if (localObject2 != null) {
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDJ = ((LocationInfo)localObject2);
    }
    if (((com.tencent.mm.plugin.location.model.o)localObject1).bTv)
    {
      x.i("MicorMsg.TrackRefreshManager", "start location " + ((com.tencent.mm.plugin.location.model.o)localObject1).kDJ.kCw + " " + ((com.tencent.mm.plugin.location.model.o)localObject1).kDJ.kCx);
      localObject1 = this.kJM;
      localObject2 = this.kJV;
      Iterator localIterator = ((com.tencent.mm.plugin.location.model.o)localObject1).kDG.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localWeakReference = (WeakReference)localIterator.next();
      } while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((o.b)localWeakReference.get()).equals(localObject2)));
    }
    for (;;)
    {
      this.kJS = this.activity.getIntent().getStringExtra("fromWhereShare");
      x.d("MicroMsg.ShareMapUI", "fromWhere=%s", new Object[] { this.kJS });
      if (!this.kJM.aZn()) {
        break label817;
      }
      x.i("MicroMsg.ShareMapUI", "has join");
      this.kJL.gk(true);
      this.kJO.aZI();
      return;
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDH = 1;
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDI = new bxg();
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDI.stK = new bbe();
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDI.stK.rjj = -1000.0D;
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDI.stK.rji = -1000.0D;
      x.i("MicorMsg.TrackRefreshManager", "start location imp " + ((com.tencent.mm.plugin.location.model.o)localObject1).kDJ.kCw + " " + ((com.tencent.mm.plugin.location.model.o)localObject1).kDJ.kCx);
      com.tencent.mm.kernel.g.DF().a(492, (e)localObject1);
      com.tencent.mm.kernel.g.DF().a(490, (e)localObject1);
      com.tencent.mm.kernel.g.DF().a(491, (e)localObject1);
      ((com.tencent.mm.plugin.location.model.o)localObject1).bBc = false;
      ((com.tencent.mm.plugin.location.model.o)localObject1).bTv = true;
      break;
      ((com.tencent.mm.plugin.location.model.o)localObject1).kDG.add(new WeakReference(localObject2));
    }
    label817:
    localObject2 = this.kJM;
    localObject1 = this.kDN;
    int i;
    if (!bi.oW(this.kJS)) {
      if (this.kJS.equals("fromBanner"))
      {
        i = 0;
        x.i("MicorMsg.TrackRefreshManager", "track join %s", new Object[] { localObject1 });
        ((com.tencent.mm.plugin.location.model.o)localObject2).kDN = ((String)localObject1);
        localObject2 = q.GF();
        if (!((String)localObject1).contains("@chatroom")) {
          break label996;
        }
      }
    }
    for (;;)
    {
      localObject1 = new com.tencent.mm.plugin.location.model.a.b((String)localObject1);
      ((apj)((com.tencent.mm.plugin.location.model.a.b)localObject1).diG.dID.dIL).otY = i;
      com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject1, 0);
      return;
      if (!this.kJS.equals("fromPluginLocation"))
      {
        if (this.kJS.equals("fromPluginTalk"))
        {
          i = 2;
          break;
        }
        if (this.kJS.equals("fromTrackButton"))
        {
          i = 3;
          break;
        }
        if (this.kJS.equals("fromMessage"))
        {
          i = 4;
          break;
        }
      }
      i = 1;
      break;
      label996:
      if (((String)localObject2).compareTo((String)localObject1) > 0) {
        localObject1 = (String)localObject1 + (String)localObject2;
      } else {
        localObject1 = (String)localObject2 + (String)localObject1;
      }
    }
  }
  
  public final boolean aZX()
  {
    return true;
  }
  
  public final void bai()
  {
    super.bai();
    if (this.kJL != null)
    {
      this.kJL.kHb = false;
      this.kJL.gj(false);
      this.kJJ.aZz();
    }
  }
  
  protected final void baj()
  {
    super.baj();
    h.mEJ.h(10997, new Object[] { "1", "", Integer.valueOf(0), Integer.valueOf(0) });
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final void gi(boolean paramBoolean) {}
  
  public final void onBackPressed()
  {
    h.mEJ.h(10997, new Object[] { "11", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    this.kJN.aZM();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.ShareMapUI", "onCreate");
    this.kJT = System.currentTimeMillis();
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.kJM;
    o.b localb = this.kJV;
    Iterator localIterator = ((com.tencent.mm.plugin.location.model.o)localObject).kDG.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((o.b)localWeakReference.get()).equals(localb))) {
        ((com.tencent.mm.plugin.location.model.o)localObject).kDG.remove(localWeakReference);
      }
    }
    this.kJM.kDP = null;
    if (this.kJO != null)
    {
      localObject = this.kJO;
      ((k)localObject).kGE.b((com.tencent.mm.ax.d)localObject);
      localObject = ((k)localObject).kGr;
      ((VolumeMeter)localObject).kHk = true;
      ((VolumeMeter)localObject).dRn = false;
      if (((VolumeMeter)localObject).kHo != null)
      {
        ((VolumeMeter)localObject).kHo.getLooper().quit();
        ((VolumeMeter)localObject).kHo = null;
      }
    }
    if (this.kJL != null) {
      this.kJL.destroy();
    }
    if (this.kJJ != null)
    {
      localObject = this.kJJ;
      com.tencent.mm.modelgeo.c.OB().c(((MyLocationButton)localObject).cXs);
    }
    x.i("MicroMsg.ShareMapUI", "onDestory");
  }
  
  public final void onPause()
  {
    x.i("MicroMsg.ShareMapUI", "pause");
    super.onPause();
    this.wakeLock.release();
    com.tencent.mm.plugin.location.model.o localo = this.kJM;
    x.d("MicorMsg.TrackRefreshManager", "pause isShared:" + localo.kDK);
    if (!localo.kDK)
    {
      localo.dMm.c(localo.cXs);
      localo.kDF.b(localo.kDU);
      localo.kDL = true;
      localo.kDR = true;
    }
    localo = this.kJM;
    com.tencent.mm.plugin.r.d locald = this.kHR.kEZ;
    localo.kDM = localo.kDH;
    localo.kDH = 0;
    x.d("MicorMsg.TrackRefreshManager", "saveStatus pause_save_upload_status: " + localo.kDM);
    if (localo.aZs())
    {
      localo.kCw = (locald.getMapCenterX() * 1.0D / 1000000.0D);
      localo.kCx = (locald.getMapCenterY() * 1.0D / 1000000.0D);
      localo.kCy = locald.getZoom();
    }
    h.mEJ.h(10997, new Object[] { "17", Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis() - this.kJT) });
    this.kJT = System.currentTimeMillis();
    if (this.kJQ != null) {
      this.kJQ.c(this.cXs);
    }
    if (this.kJL != null) {
      this.kJL.onPause();
    }
  }
  
  public final void onResume()
  {
    x.i("MicroMsg.ShareMapUI", "resume");
    super.onResume();
    this.wakeLock.acquire();
    com.tencent.mm.plugin.location.model.o localo = this.kJM;
    x.d("MicorMsg.TrackRefreshManager", "resume isPuase:" + localo.kDL);
    if (localo.kDL)
    {
      localo.kDS = System.currentTimeMillis();
      localo.dMm.a(localo.cXs);
      localo.kDF.a(localo.kDU);
    }
    localo.kDL = false;
    localo.aZo();
    localo = this.kJM;
    com.tencent.mm.plugin.r.d locald = this.kHR.kEZ;
    localo.kDH = localo.kDM;
    x.d("MicorMsg.TrackRefreshManager", "resumeStatus upload_status  " + localo.kDH + " %f %f %d ", new Object[] { Double.valueOf(localo.kCw), Double.valueOf(localo.kCx), Integer.valueOf(localo.kCy) });
    if ((localo.kCw != -1000.0D) && (localo.kCx != -1000.0D) && (localo.kCy != -1))
    {
      locald.getIController().setCenter(localo.kCw, localo.kCx);
      locald.getIController().setZoom(localo.kCy);
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.kJJ.setAnimToSelf(false);
        this.kJJ.aZz();
        this.kJL.kHb = false;
        this.kJL.kGV = true;
      }
      localo = this.kJM;
      locald = this.kHR.kEZ;
      if (localo.kDQ != -1) {
        locald.getIController().setZoom(localo.kDQ);
      }
      if (this.kJQ != null) {
        this.kJQ.a(this.cXs);
      }
      if (this.kJL != null) {
        this.kJL.onResume();
      }
      return;
    }
  }
  
  public final void rS(int paramInt)
  {
    if (paramInt == 0)
    {
      h.mEJ.h(10997, new Object[] { "8", "", Integer.valueOf(0), Integer.valueOf(0) });
      bah();
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        h.mEJ.h(10997, new Object[] { "8", "", Integer.valueOf(0), Integer.valueOf(0) });
        bah();
        return;
      }
    } while (paramInt != 2);
    bah();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */