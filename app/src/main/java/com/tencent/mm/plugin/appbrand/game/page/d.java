package com.tencent.mm.plugin.appbrand.game.page;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;
import com.tencent.mm.modelappbrand.b.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.d.b;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.game.GameGLSurfaceView;
import com.tencent.mm.plugin.appbrand.game.GameGLSurfaceView.j;
import com.tencent.mm.plugin.appbrand.game.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandActionHeaderLayout;
import com.tencent.mm.plugin.appbrand.page.AppBrandActionSingleHeaderView;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

@SuppressLint({"ViewConstructor"})
public final class d
  extends p
  implements com.tencent.mm.plugin.appbrand.game.c
{
  private boolean Sx = true;
  private com.tencent.mm.plugin.appbrand.g.b fCG;
  WAGamePageViewContainerLayout fCH;
  public k fCI;
  ImageView fCJ;
  MBCanvasContentHolder fCK;
  boolean fCL = false;
  private u fCM;
  private final ConcurrentLinkedQueue<Runnable> fCN = new ConcurrentLinkedQueue();
  private Bitmap fCO = null;
  private final Object fCP = new Object();
  private String fCQ;
  private String mUrl;
  
  d(Context paramContext, g paramg)
  {
    a(paramContext, paramg);
    this.gnC.h(paramg);
    this.fCG = paramg.fcy.fdQ;
    if (ad.cia() != null) {
      bool = ad.cia().getBoolean("appbrandgame_open_v8debug", false);
    }
    com.tencent.magicbrush.engine.c.aC(bool);
  }
  
  private void agS()
  {
    synchronized (this.fCP)
    {
      if ((this.fCO != null) && (!this.fCO.isRecycled()))
      {
        x.i("AppBrandGame.WAGamePageView", "hy: recycling captured screen");
        this.fCO.recycle();
        this.fCO = null;
      }
      return;
    }
  }
  
  public final <T> T a(int paramInt, Bundle paramBundle, Object... paramVarArgs)
  {
    boolean bool = false;
    switch (paramInt)
    {
    default: 
      x.w("AppBrandGame.WAGamePageView", "hy: not support this command!! %d", new Object[] { Integer.valueOf(paramInt) });
    case 1: 
    case 2: 
      for (;;)
      {
        return (T)super.a(paramInt, paramBundle, paramVarArgs);
        x.i("AppBrandGame.WAGamePageView", "hy: got message beforeShare");
        if (paramBundle == null)
        {
          x.e("AppBrandGame.WAGamePageView", "hy: got message beforeShare data is null");
        }
        else
        {
          int i = paramBundle.getInt("canvasId", -1);
          MBCanvasContentHolder localMBCanvasContentHolder = com.tencent.mm.plugin.appbrand.game.e.a.fDd.kt(i);
          x.i("AppBrandGame.WAGamePageView", "hy: got message beforeShare end");
          if ((localMBCanvasContentHolder != null) && (localMBCanvasContentHolder.content != null))
          {
            synchronized (this.fCP)
            {
              this.fCO = localMBCanvasContentHolder.content;
            }
            if (paramBundle != null) {
              bool = paramBundle.getBoolean("needPortraitSnapshot", false);
            }
            if ((this.fCK != null) && (this.fCK.content != null))
            {
              this.fCK.content.recycle();
              this.fCK.content = null;
            }
            if (this.fCJ == null) {
              this.fCJ = new ImageView(this.mContext);
            }
            ??? = d.b.fpw;
            com.tencent.mm.plugin.appbrand.config.d.b(this.fdO.fcq);
            if (??? == com.tencent.mm.plugin.appbrand.config.d.cu(this.mContext))
            {
              this.fCK = com.tencent.mm.plugin.appbrand.game.e.a.fDd.ahj();
              this.fCH.setOnConfigurationChangedListener(new d.4(this));
            }
            else if (bool)
            {
              this.fCK = com.tencent.mm.plugin.appbrand.game.e.a.fDd.ahj();
              if ((this.fCK == null) || (this.fCK.content == null))
              {
                x.e("AppBrandGame.WAGamePageView", "hy: screenshot is null");
              }
              else
              {
                ah.A(new d.5(this));
                this.fCL = true;
                x.i("AppBrandGame.WAGamePageView", "hy: vertical game. isRedpackge isPortrait screenshot");
              }
            }
            else
            {
              x.i("AppBrandGame.WAGamePageView", "hy: vertical game. not need screenshot");
            }
          }
        }
      }
    }
    x.i("AppBrandGame.WAGamePageView", "got message doGetCanvasBitmap");
    if (paramBundle == null)
    {
      x.e("AppBrandGame.WAGamePageView", "got message doGetCanvasBitmap data is null");
      return null;
    }
    paramInt = paramBundle.getInt("canvasId", -1);
    bool = paramBundle.getBoolean("sync", true);
    if (paramInt == -1)
    {
      x.e("AppBrandGame.WAGamePageView", "got message doGetCanvasBitmap canvasId is illegal");
      return null;
    }
    x.i("AppBrandGame.WAGamePageView", "got message doGetCanvasBitmap canvasId:%d,sync:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
    if (bool) {
      paramBundle = com.tencent.mm.plugin.appbrand.game.e.a.fDd;
    }
    for (paramBundle = com.tencent.mm.plugin.appbrand.game.e.a.ku(paramInt);; paramBundle = com.tencent.mm.plugin.appbrand.game.e.a.fDd.kt(paramInt))
    {
      x.i("AppBrandGame.WAGamePageView", "got message doGetCanvasBitmap end");
      return paramBundle;
    }
  }
  
  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    this.fdO.fcy.j(paramString1, paramString2, hashCode());
  }
  
  public final com.tencent.mm.plugin.appbrand.g.b aaI()
  {
    return this.fCG;
  }
  
  final void agN()
  {
    if (!ah.isMainThread())
    {
      ah.A(new d.1(this));
      return;
    }
    this.fCI = new k(this.mContext, this.fdO, new d.2(this), new d.3(this));
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    this.fCH.addView(this.fCI, 0, localLayoutParams);
  }
  
  protected final void agO()
  {
    this.gnC.amF();
  }
  
  protected final void agP()
  {
    x.i("AppBrandGame.WAGamePageView", "hy: on perform foreground");
    this.gnC.agL();
    agS();
    ??? = this.fCI;
    x.i("MicroMsg.GameGLSurfaceView", "onResume");
    GameGLSurfaceView.j localj = ((GameGLSurfaceView)???).fyV;
    synchronized (GameGLSurfaceView.afI())
    {
      x.i("MicroMsg.GLThread", "onResume tid=" + localj.getId());
      localj.fzs = false;
      localj.fzu = false;
      localj.fzC = true;
      localj.fzE = false;
      GameGLSurfaceView.afI().notifyAll();
      for (;;)
      {
        if ((!localj.fzq) && (localj.fcO) && (!localj.fzE))
        {
          x.i("MicroMsg.GLThread", "onResume waiting for !mPaused.");
          try
          {
            GameGLSurfaceView.afI().wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
        }
      }
    }
    this.gnE.agE();
    ahd();
  }
  
  protected final void agQ()
  {
    x.i("AppBrandGame.WAGamePageView", "hy: on perform background");
    this.gnC.agK();
    ??? = this.fCI;
    x.i("MicroMsg.GameGLSurfaceView", "onPauseAlsoDraw");
    GameGLSurfaceView.j localj = ((GameGLSurfaceView)???).fyV;
    synchronized (GameGLSurfaceView.afI())
    {
      x.i("MicroMsg.GLThread", "onPauseAlsoDoDraw tid=" + localj.getId());
      localj.fzu = true;
      localj.fzs = true;
      GameGLSurfaceView.afI().notifyAll();
      for (;;)
      {
        if ((!localj.fzq) && (!localj.fcO))
        {
          x.i("MicroMsg.GLThread", "onPause waiting for mPaused.");
          try
          {
            GameGLSurfaceView.afI().wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
        }
      }
    }
    if (this.gnp != null) {
      this.gnp.dismiss();
    }
  }
  
  protected final void agR()
  {
    this.Sx = false;
    this.gnC.onDestroy();
    agS();
    k localk = this.fCI;
    x.i("MicroMsg.GameGLSurfaceView", "onDestroy");
    localk.fyV.afQ();
    com.tencent.mm.plugin.appbrand.game.c.d.release();
  }
  
  protected final void agT() {}
  
  public final u agU()
  {
    return this.fCM;
  }
  
  public final boolean agV()
  {
    return false;
  }
  
  public final String agW()
  {
    return null;
  }
  
  protected final void agX() {}
  
  public final void agY() {}
  
  public final void agZ() {}
  
  public final FrameLayout aha()
  {
    return this.fCH;
  }
  
  public final View ahb()
  {
    AppBrandActionHeaderLayout localAppBrandActionHeaderLayout = new AppBrandActionHeaderLayout(this.mContext);
    localAppBrandActionHeaderLayout.setAppId(this.mAppId);
    localAppBrandActionHeaderLayout.setActionHeaderStyle(this.gnz);
    int i = ((MMActivity)this.mContext).getRequestedOrientation();
    x.w("AppBrandGame.WAGamePageView", "getActionSheetHeader orientation:%d,mActionSheetTitleStrId:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.gnA) });
    if (i == 6)
    {
      if (this.gnA > 0) {
        localAppBrandActionHeaderLayout.setStatusId(this.gnA);
      }
      String str1 = this.fdO.fct.iconUrl;
      String str2 = this.fdO.fct.bKC;
      localAppBrandActionHeaderLayout.glR.setVisibility(0);
      localAppBrandActionHeaderLayout.glS.setVisibility(8);
      localAppBrandActionHeaderLayout.glT.setImageDrawable(com.tencent.mm.modelappbrand.b.a.JZ());
      com.tencent.mm.modelappbrand.b.b.Ka().a(localAppBrandActionHeaderLayout.glT.getImageView(), str1, null, f.dGr);
      localAppBrandActionHeaderLayout.glT.setTextViewText(str2);
      return localAppBrandActionHeaderLayout;
    }
    if (this.gnA > 0)
    {
      localAppBrandActionHeaderLayout.setStatusId(this.gnA);
      return localAppBrandActionHeaderLayout;
    }
    return null;
  }
  
  public final String ahc()
  {
    return this.mUrl;
  }
  
  final void ahd()
  {
    if (this.fCL)
    {
      this.fCL = false;
      this.fCJ.setVisibility(8);
      if ((this.fCK != null) && (this.fCK.content != null))
      {
        this.fCK.content.recycle();
        this.fCK.content = null;
      }
    }
  }
  
  public final Bitmap ahe()
  {
    x.i("AppBrandGame.WAGamePageView", "hy: jsapi enter wait");
    return null;
  }
  
  public final boolean ahf()
  {
    return com.tencent.mm.plugin.appbrand.config.d.cu(this.mContext) == d.b.fpw;
  }
  
  protected final com.tencent.mm.plugin.appbrand.page.a.c ahg()
  {
    return new com.tencent.mm.plugin.appbrand.game.page.a.a(this);
  }
  
  public final void bm(String paramString1, String paramString2) {}
  
  public final void cD(boolean paramBoolean) {}
  
  public final void cE(boolean paramBoolean) {}
  
  public final void cF(boolean paramBoolean) {}
  
  public final void e(Runnable paramRunnable)
  {
    p(paramRunnable);
  }
  
  public final View getContentView()
  {
    return this.fCH;
  }
  
  public final String getURL()
  {
    return this.fCQ;
  }
  
  public final void hide()
  {
    this.fCH.setVisibility(4);
  }
  
  protected final void initView()
  {
    x.i("AppBrandGame.WAGamePageView", "new Rendder GameView");
    initActionBar();
    this.fCH = new WAGamePageViewContainerLayout(this.mContext);
    agN();
    Object localObject = new FrameLayout(this.mContext);
    this.fCH.addView((View)localObject, new FrameLayout.LayoutParams(-1, -1));
    this.fCM = new a((ViewGroup)localObject);
    this.fCM.setFullscreenImpl(alO());
    float f = this.mContext.getResources().getDisplayMetrics().density;
    localObject = new FrameLayout.LayoutParams(-2, -2);
    ((FrameLayout.LayoutParams)localObject).gravity = 8388661;
    ((FrameLayout.LayoutParams)localObject).rightMargin = com.tencent.mm.bp.a.ae(this.mContext, s.e.app_brand_game_mode_icon_margin_right);
    ((FrameLayout.LayoutParams)localObject).topMargin = com.tencent.mm.bp.a.ae(this.mContext, s.e.app_brand_game_mode_icon_margin_top);
    this.fCH.addView(this.gnn.getActionView(), (ViewGroup.LayoutParams)localObject);
    D(com.tencent.mm.plugin.appbrand.menu.l.gjB, false);
    if (this.fdO.fcu.fqL)
    {
      localObject = com.tencent.mm.plugin.appbrand.game.c.d.ags();
      WAGamePageViewContainerLayout localWAGamePageViewContainerLayout = this.fCH;
      if (Looper.myLooper() != Looper.getMainLooper()) {
        throw new IllegalStateException("You can only init GameInspector in main thread.");
      }
      if (((com.tencent.mm.plugin.appbrand.game.c.d)localObject).mState == 0)
      {
        ((com.tencent.mm.plugin.appbrand.game.c.d)localObject).mContext = localWAGamePageViewContainerLayout.getContext();
        ((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBo = new com.tencent.mm.plugin.appbrand.game.c.c(((com.tencent.mm.plugin.appbrand.game.c.d)localObject).mContext);
        ((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBo.setBackground(((com.tencent.mm.plugin.appbrand.game.c.d)localObject).mContext.getResources().getDrawable(s.f.app_brand_game_action_icon_round_rect_background));
        ((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBp = new com.tencent.mm.plugin.appbrand.game.c.b(((com.tencent.mm.plugin.appbrand.game.c.d)localObject).mContext);
        localWAGamePageViewContainerLayout.setClipChildren(false);
        f = ((com.tencent.mm.plugin.appbrand.game.c.d)localObject).mContext.getResources().getDisplayMetrics().density;
        FrameLayout.LayoutParams localLayoutParams;
        if (((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBp != null)
        {
          localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
          localWAGamePageViewContainerLayout.addView(((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBp, localLayoutParams);
          localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
          localLayoutParams.gravity = 8388693;
          localLayoutParams.bottomMargin = ((int)(25.0F * f));
          int i = (int)(f * 15.0F);
          localLayoutParams.rightMargin = i;
          localLayoutParams.leftMargin = i;
          localWAGamePageViewContainerLayout.addView(((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBp.fBe, localLayoutParams);
        }
        if (((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBo != null)
        {
          localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
          localWAGamePageViewContainerLayout.addView(((com.tencent.mm.plugin.appbrand.game.c.d)localObject).fBo, localLayoutParams);
        }
        ((com.tencent.mm.plugin.appbrand.game.c.d)localObject).mState = 1;
      }
    }
    this.fCJ = new ImageView(this.mContext);
    this.fCH.addView(this.fCJ, new FrameLayout.LayoutParams(-1, -1));
  }
  
  public final boolean isFullScreen()
  {
    return ((com.tencent.mm.plugin.appbrand.game.page.a.a)this.gnE).fDb == c.a.gpp;
  }
  
  public final boolean isRunning()
  {
    return this.Sx;
  }
  
  public final void j(String paramString1, String paramString2, int paramInt)
  {
    x.d("AppBrandGame.WAGamePageView", "dispatch event %s, data %s, src %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
  }
  
  public final void kp(int paramInt) {}
  
  public final void kq(int paramInt) {}
  
  public final void kr(int paramInt) {}
  
  public final void ks(int paramInt)
  {
    this.gnA = paramInt;
  }
  
  final void p(Runnable paramRunnable)
  {
    if (this.fCI != null)
    {
      if (this.fCN.size() > 0)
      {
        synchronized (this.fCN)
        {
          if (this.fCN.size() <= 0) {
            break label116;
          }
          x.v("AppBrandGame.WAGamePageView", "hy: try to render %d", new Object[] { Integer.valueOf(this.fCN.size()) });
          Iterator localIterator = this.fCN.iterator();
          while (localIterator.hasNext())
          {
            Runnable localRunnable = (Runnable)localIterator.next();
            if (localRunnable != null) {
              this.fCI.queueEvent(localRunnable);
            }
          }
        }
        this.fCN.clear();
      }
      label116:
      if (paramRunnable != null) {
        this.fCI.queueEvent(paramRunnable);
      }
      return;
    }
    synchronized (this.fCN)
    {
      x.v("AppBrandGame.WAGamePageView", "hy: add to task first");
      if (paramRunnable != null) {
        this.fCN.add(paramRunnable);
      }
      return;
    }
  }
  
  public final void sX(String paramString)
  {
    this.gnC.vq(paramString);
    this.mUrl = paramString;
    this.fCQ = com.tencent.mm.plugin.appbrand.q.l.vP(paramString);
    x.i("AppBrandGame.WAGamePageView", "loadURL url : " + paramString);
  }
  
  public final void sY(String paramString) {}
  
  public final void sZ(String paramString) {}
  
  public final void show()
  {
    this.fCH.setVisibility(0);
  }
  
  public final void ta(String paramString) {}
  
  public final void tb(String paramString)
  {
    if ((this.mContext instanceof Activity))
    {
      Window localWindow = ((Activity)this.mContext).getWindow();
      if (localWindow != null) {
        j.a(localWindow, "black".equals(paramString));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/page/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */