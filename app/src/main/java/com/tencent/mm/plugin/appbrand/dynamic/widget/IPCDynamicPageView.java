package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.modelappbrand.aa;
import com.tencent.mm.modelappbrand.ab;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.modelappbrand.r;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.w;
import com.tencent.mm.modelappbrand.y;
import com.tencent.mm.modelappbrand.z;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.a.f;
import com.tencent.mm.plugin.appbrand.dynamic.a.g;
import com.tencent.mm.plugin.appbrand.dynamic.b;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.h;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.widget.g;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;

public class IPCDynamicPageView
  extends LinearLayout
  implements l, com.tencent.mm.plugin.appbrand.canvas.widget.a, h
{
  public static ag fun;
  private static LinearLayout.LayoutParams fyk = new LinearLayout.LayoutParams(-1, -1);
  public String doU;
  private long fmZ;
  private g fut;
  private Bundle fyc;
  private com.tencent.mm.plugin.appbrand.dynamic.a fyd;
  public u fye;
  public volatile boolean fyf;
  public long fyg;
  private com.tencent.mm.plugin.appbrand.canvas.widget.a fyh;
  private Runnable fyi = new IPCDynamicPageView.1(this);
  private Runnable fyj = new IPCDynamicPageView.2(this);
  private volatile boolean mDetached;
  
  static
  {
    HandlerThread localHandlerThread = e.Xs("WxaWidget#UIActionThread");
    localHandlerThread.start();
    fun = new ag(localHandlerThread.getLooper());
  }
  
  public IPCDynamicPageView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public IPCDynamicPageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public IPCDynamicPageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.fyd = new com.tencent.mm.plugin.appbrand.dynamic.a(this);
    paramContext = c.bH(paramContext);
    addView(paramContext, fyk);
    this.fyh = ((com.tencent.mm.plugin.appbrand.canvas.widget.a)paramContext);
  }
  
  private void kf(int paramInt)
  {
    if (this.fye == null)
    {
      x.i("MicroMsg.IPCDynamicPageView", "publishOnWidgetStateChanged(id : %s, state : %d) failed, listener wrapper is null.", new Object[] { this.doU, Integer.valueOf(paramInt) });
      return;
    }
    com.tencent.mm.modelappbrand.f localf = this.fye.JX();
    if (localf == null)
    {
      x.i("MicroMsg.IPCDynamicPageView", "publishOnWidgetStateChanged(id : %s, state : %d) failed, listener is null.", new Object[] { this.doU, Integer.valueOf(paramInt) });
      return;
    }
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      localf.q(this, paramInt);
      return;
    }
    b.o(new IPCDynamicPageView.7(this, localf, paramInt));
  }
  
  public final boolean Y(String paramString1, String paramString2)
  {
    Object localObject = this.fyd;
    String str = this.doU;
    if ((((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).doU == null) || (((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).doU.length() == 0) || (paramString1 == null) || (paramString1.length() == 0)) {
      return false;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("id", str);
    ((Bundle)localObject).putString("event", paramString1);
    ((Bundle)localObject).putString("data", paramString2);
    paramString1 = (IPCBoolean)com.tencent.mm.ipcinvoker.f.a(i.aeT().sz(str), (Parcelable)localObject, a.f.class);
    if (paramString1 != null) {
      return paramString1.value;
    }
    return false;
  }
  
  public final void a(String paramString, r paramr)
  {
    if (this.fye == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    z localz = (z)this.fye.jr("openApp");
    if (localz == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    localz.jt(paramString);
  }
  
  public final void a(String paramString1, String paramString2, r paramr)
  {
    if (this.fye == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    t localt = (t)this.fye.jr("showPicker");
    if (localt == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    localt.a(paramString1, paramString2, paramr);
  }
  
  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    this.fyh.a(paramJSONArray, parama);
  }
  
  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, r paramr)
  {
    if (this.fye == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    y localy = (y)this.fye.jr("OnTapCallback");
    if (localy == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    localy.b(paramBoolean1, paramString, paramBoolean2);
  }
  
  public final void adk()
  {
    long l = System.currentTimeMillis() - this.fmZ;
    fun.removeCallbacks(this.fyi);
    if (l < 12L)
    {
      fun.postDelayed(this.fyi, l);
      return;
    }
    this.fyi.run();
  }
  
  public final void adl()
  {
    this.fyh.adl();
  }
  
  public final void adm()
  {
    this.fyh.adm();
  }
  
  public final void b(int paramInt, r paramr)
  {
    if (this.fye == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    ab localab = (ab)this.fye.jr("setWidgetSize");
    if (localab == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    localab.a(paramInt, paramr);
  }
  
  public final void b(String paramString, r paramr)
  {
    if (this.fye == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    w localw = (w)this.fye.jr("makePhoneCall");
    if (localw == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    localw.js(paramString);
  }
  
  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    this.fyh.b(paramJSONArray, parama);
  }
  
  public final void c(String paramString, r paramr)
  {
    if (this.fye == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    aa localaa = (aa)this.fye.jr("onSearchWAWidgetReloadData");
    if (localaa == null)
    {
      paramr.b(false, "listener is null", null);
      return;
    }
    localaa.ju(paramString);
  }
  
  public final void cleanup()
  {
    if (this.fut != null) {
      x.i("MicroMsg.IPCDynamicPageView", "cleanup(id : %s, %s, %s, %s)", new Object[] { this.doU, this.fut.field_id, this.fut.field_appId, this.fut.field_cacheKey });
    }
    for (;;)
    {
      adl();
      return;
      x.i("MicroMsg.IPCDynamicPageView", "cleanup(id : %s)", new Object[] { this.doU });
    }
  }
  
  public final void d(String paramString1, String paramString2, Bundle paramBundle)
  {
    fun.post(new IPCDynamicPageView.4(this, paramBundle, paramString1, paramString2));
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    return this.fyh.d(paramCanvas);
  }
  
  public final void detach()
  {
    if (Looper.myLooper() == fun.getLooper())
    {
      this.fyj.run();
      return;
    }
    fun.post(this.fyj);
  }
  
  public int getDrawActionCostTimeReportId()
  {
    return this.fyh.getDrawActionCostTimeReportId();
  }
  
  public com.tencent.mm.plugin.appbrand.canvas.f getDrawContext()
  {
    return this.fyh.getDrawContext();
  }
  
  public int getDrawCostTimeReportId()
  {
    return this.fyh.getDrawCostTimeReportId();
  }
  
  public Bundle getExtData()
  {
    return this.fyc;
  }
  
  public String getExtId()
  {
    return this.doU;
  }
  
  public String getSessionId()
  {
    return this.fyh.getSessionId();
  }
  
  public int getType()
  {
    return this.fyh.getType();
  }
  
  public final boolean isPaused()
  {
    return this.fyh.isPaused();
  }
  
  public final void ka(int paramInt)
  {
    kf(paramInt);
    detach();
  }
  
  public final void kg(int paramInt)
  {
    Object localObject = this.fyd;
    String str = this.doU;
    if ((((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).doU == null) || (((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).doU.length() == 0)) {
      return;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("id", str);
    ((Bundle)localObject).putInt("widgetState", paramInt);
    com.tencent.mm.ipcinvoker.f.a(i.aeT().sz(str), (Parcelable)localObject, f.a.class, null);
  }
  
  public final void m(Runnable paramRunnable)
  {
    this.fyh.m(paramRunnable);
  }
  
  public final void onPause()
  {
    x.v("MicroMsg.IPCDynamicPageView", "onPause(%s)", new Object[] { this.doU });
    this.fyh.onPause();
    fun.post(new IPCDynamicPageView.5(this));
  }
  
  public final void onResume()
  {
    x.v("MicroMsg.IPCDynamicPageView", "onResume(%s)", new Object[] { this.doU });
    this.fyh.onResume();
    fun.post(new IPCDynamicPageView.6(this));
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    x.i("MicroMsg.IPCDynamicPageView", "onSizeChanged(w : %d, h : %d, oldw : %d, oldh : %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    Bundle localBundle1 = new Bundle();
    localBundle1.putInt("__page_view_width", paramInt1);
    localBundle1.putInt("__page_view_height", paramInt2);
    String str = this.doU;
    Bundle localBundle2 = new Bundle();
    localBundle2.putString("id", str);
    localBundle2.putBundle("__env_args", localBundle1);
    com.tencent.mm.ipcinvoker.f.a(i.aeT().sz(str), localBundle2, a.g.class, null);
  }
  
  public void setId(String paramString)
  {
    this.fyh.setId(paramString);
  }
  
  public void setSessionId(String paramString)
  {
    this.fyh.setSessionId(paramString);
  }
  
  public void setStartTime(long paramLong)
  {
    this.fyh.setStartTime(paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/widget/IPCDynamicPageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */