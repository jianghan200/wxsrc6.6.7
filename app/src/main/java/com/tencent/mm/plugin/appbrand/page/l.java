package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.i;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.g.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class l
  extends SwipeBackLayout
  implements SwipeBackLayout.a, g.a
{
  private View FU;
  private n fcz;
  private boolean gmD;
  public boolean mSwiping = false;
  
  public l(Context paramContext, n paramn)
  {
    super(paramContext);
    this.fcz = paramn;
    setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
    init();
    setNeedRequestActivityTranslucent(false);
    mC(true);
    this.FU = agB();
    paramContext = new ViewGroup.LayoutParams(-1, -1);
    ((ViewGroup)this.FU).addView(agC(), paramContext);
    addView(getContentView());
    setContentView(getContentView());
    setSwipeGestureDelegate(this);
  }
  
  private void a(String paramString, aa paramaa)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("path", com.tencent.mm.plugin.appbrand.q.l.vP(getCurrentUrl()));
    localHashMap.put("query", com.tencent.mm.plugin.appbrand.q.l.vQ(getCurrentUrl()));
    if (paramaa != null) {
      localHashMap.put("openType", paramaa.toString());
    }
    com.tencent.mm.plugin.appbrand.r.c.m(localHashMap);
    getCurrentPageView().a(paramString, new JSONObject(localHashMap).toString(), null);
  }
  
  protected static boolean d(int[] paramArrayOfInt, int paramInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return true;
    }
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label35;
      }
      if (paramArrayOfInt[i] == paramInt) {
        break;
      }
      i += 1;
    }
    label35:
    return false;
  }
  
  private View getContentView()
  {
    return this.FU;
  }
  
  public final void a(aa paramaa)
  {
    a("onAppRoute", paramaa);
    x.i("MicroMsg.AppBrandPage", "onAppRoute: %s, %s", new Object[] { paramaa.toString(), getCurrentUrl() });
  }
  
  public View agB()
  {
    return new com.tencent.mm.ui.statusbar.b(getContext());
  }
  
  public abstract View agC();
  
  public void agD()
  {
    x.d("MicroMsg.AppBrandPage", "onPageDestroy: %s", new Object[] { getCurrentUrl() });
  }
  
  public void agE()
  {
    x.d("MicroMsg.AppBrandPage", "onPageForeground: %s", new Object[] { getCurrentUrl() });
    com.tencent.mm.ui.widget.g.b(this);
    this.uIg = false;
    setEnableGesture(this.fcz.agM());
    onSwipe(1.0F);
    this.gmD = false;
    setVisibility(0);
    agG();
  }
  
  public void agF()
  {
    x.d("MicroMsg.AppBrandPage", "onPageBackground: %s", new Object[] { getCurrentUrl() });
    com.tencent.mm.ui.widget.g.a(this);
    this.gmD = true;
  }
  
  public void agG()
  {
    Object localObject = getPageConfig();
    p localp = getCurrentPageView();
    String str = ((a.d)localObject).fpj;
    localObject = ((a.d)localObject).fpg;
    if (!localp.gnv) {
      localp.gnw = j.aO(str, localp.gnw);
    }
    if (!localp.gnx) {
      localp.gny = ((String)localObject);
    }
    localp.O(localp.gnw, localp.gny);
  }
  
  public void agH()
  {
    a.d locald = getPageConfig();
    getCurrentPageView().sZ(locald.fpf);
    getCurrentPageView().q(locald.fph);
    getCurrentPageView().sY(locald.fpj);
    getCurrentPageView().q(locald.fph);
    getCurrentPageView().ta(locald.fpg);
    getCurrentPageView().gnn.dk(true);
    getCurrentPageView().cE(locald.fpo);
    getCurrentPageView().bm(locald.fpp, locald.fpc);
    p localp;
    String str1;
    String str2;
    boolean bool;
    if (com.tencent.mm.plugin.appbrand.permission.c.b(getCurrentPageView(), b.b.gmi))
    {
      localp = getCurrentPageView();
      str1 = locald.fpk;
      str2 = locald.fpl;
      bool = locald.fpm;
      if (localp != null) {}
    }
    else
    {
      return;
    }
    if ((bi.oW(str1)) && (bi.oW(str2)) && (!bool))
    {
      localp.gnn.aoZ();
      return;
    }
    b.a(localp, bool);
  }
  
  public void agI() {}
  
  public final void alJ()
  {
    a("onAppRouteDone", null);
    x.i("MicroMsg.AppBrandPage", "onAppRouteDone: %s", new Object[] { getCurrentUrl() });
  }
  
  public abstract void b(String paramString1, String paramString2, int[] paramArrayOfInt);
  
  public void cleanup()
  {
    com.tencent.mm.ui.widget.g.b(this);
  }
  
  public boolean forceRemoveNoMatchOnPath()
  {
    return false;
  }
  
  public String getAppId()
  {
    return this.fcz.getAppId();
  }
  
  public n getContainer()
  {
    return this.fcz;
  }
  
  public abstract p getCurrentPageView();
  
  public abstract String getCurrentUrl();
  
  public a.d getPageConfig()
  {
    return this.fcz.getAppConfig().rG(com.tencent.mm.plugin.appbrand.q.l.vP(getCurrentUrl()));
  }
  
  public final void hide()
  {
    if (this.gmD) {
      setVisibility(4);
    }
  }
  
  public abstract void loadUrl(String paramString);
  
  public void onCancel()
  {
    this.mSwiping = false;
  }
  
  public void onDrag()
  {
    this.mSwiping = true;
  }
  
  public void onSettle(boolean paramBoolean, int paramInt)
  {
    long l = 110L;
    if (paramBoolean)
    {
      localView = getContentView();
      if (paramInt > 0) {}
      for (;;)
      {
        i.a(localView, l, 0.0F, null);
        return;
        l = 220L;
      }
    }
    View localView = getContentView();
    if (paramInt > 0) {}
    for (;;)
    {
      i.a(localView, l, getContentView().getWidth() * -1 / 4, null);
      return;
      l = 220L;
    }
  }
  
  public void onSwipe(float paramFloat)
  {
    if (this.gmD)
    {
      if (paramFloat == 1.0F) {
        break label35;
      }
      setVisibility(0);
    }
    while (Float.compare(1.0F, paramFloat) <= 0)
    {
      i.n(getContentView(), 0.0F);
      return;
      label35:
      hide();
    }
    float f = getContentView().getWidth() / 4;
    i.n(getContentView(), f * (1.0F - paramFloat) * -1.0F);
  }
  
  public void onSwipeBack()
  {
    Object localObject = this.fcz;
    ((n)localObject).runOnUiThread(new n.18((n)localObject, this));
    com.tencent.mm.plugin.appbrand.report.a.a(getAppId(), getCurrentUrl(), 23, null, bi.VE(), 1, 0);
    localObject = getContainer().getRuntime().fcq;
    if ((localObject != null) && (((MMActivity)localObject).isFinishing())) {
      ((MMActivity)localObject).onSwipeBack();
    }
  }
  
  public abstract boolean sV(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */