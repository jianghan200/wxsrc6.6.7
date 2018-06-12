package com.tencent.mm.plugin.appbrand.game;

import android.content.Context;
import android.os.HandlerThread;
import com.tencent.magicbrush.a.c.a;
import com.tencent.magicbrush.a.c.f;
import com.tencent.magicbrush.engine.MBRendererJNI;
import com.tencent.magicbrush.engine.d;
import com.tencent.magicbrush.handler.MBFontManagerJNI;
import com.tencent.magicbrush.handler.MBImageHandlerJNI;
import com.tencent.magicbrush.handler.MBJavaHandler;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.game.b.a.1;
import com.tencent.mm.plugin.appbrand.game.b.a.2;
import com.tencent.mm.plugin.appbrand.game.b.b.2;
import com.tencent.mm.plugin.appbrand.game.b.b.3;
import com.tencent.mm.plugin.appbrand.game.b.b.a;
import com.tencent.mm.plugin.appbrand.game.b.b.b;
import com.tencent.mm.plugin.appbrand.game.b.b.c;
import com.tencent.mm.plugin.appbrand.game.b.b.d;
import com.tencent.mm.plugin.appbrand.game.b.b.e;
import com.tencent.mm.plugin.appbrand.game.b.d.1;
import com.tencent.mm.plugin.appbrand.game.b.d.2;
import com.tencent.mm.plugin.appbrand.game.c.e;
import com.tencent.mm.plugin.appbrand.game.c.e.1;
import com.tencent.mm.plugin.appbrand.game.c.f.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class b
  implements GameGLSurfaceView.n, c
{
  volatile boolean dti = false;
  com.tencent.mm.plugin.appbrand.g fdO;
  k fzI;
  boolean fzJ = false;
  private boolean fzK = false;
  private d fzL;
  k.b fzM;
  private long fzN = -1L;
  private long fzO = System.currentTimeMillis();
  private boolean gnI = false;
  private Context mContext;
  
  public b(k paramk)
  {
    this.fzI = paramk;
    this.mContext = this.fzI.getContext();
    this.fdO = this.fzI.getRuntime();
    this.fzL = new d();
    MBJavaHandler.setCallbackProxy(new b.1(this));
    MBFontManagerJNI.registerFontManager(new a.1(this.fdO), new a.2());
    paramk = this.fdO;
    Object localObject = new b.3(new com.tencent.mm.plugin.appbrand.game.b.b.1(this), new b.2());
    ((com.tencent.magicbrush.handler.image.a)localObject).a(new b.c((byte)0), false);
    ((com.tencent.magicbrush.handler.image.a)localObject).a(new b.b((byte)0), false);
    ((com.tencent.magicbrush.handler.image.a)localObject).a(new b.d(paramk, (byte)0), true);
    ((com.tencent.magicbrush.handler.image.a)localObject).boJ = new b.a();
    com.tencent.magicbrush.a.a.a(new b.e((byte)0));
    MBImageHandlerJNI.register((com.tencent.magicbrush.handler.image.b)localObject);
    c.f.a(new d.1());
    c.a.a(new d.2());
    if ((this.fzI.getRuntime() != null) && (this.fzI.getRuntime().fcu != null))
    {
      paramk = this.fzI.getRuntime().fcu;
      localObject = com.tencent.mm.plugin.appbrand.game.c.i.fCa;
      String str = paramk.appId;
      x.i("MicroMsg.WAGamePerfManager", "init() called with: appId = [%s]", new Object[] { str });
      ((com.tencent.mm.plugin.appbrand.game.c.i)localObject).mAppId = str;
      if (((com.tencent.mm.plugin.appbrand.game.c.i)localObject).fCb != null)
      {
        ((com.tencent.mm.plugin.appbrand.game.c.i)localObject).fCb.lnJ.quit();
        ((com.tencent.mm.plugin.appbrand.game.c.i)localObject).fCb = null;
      }
      if (com.tencent.mm.plugin.appbrand.game.c.i.b(paramk.uin, paramk.frn.fpW))
      {
        com.tencent.mm.plugin.appbrand.game.c.i.fCa.fCh = true;
        localObject = com.tencent.mm.plugin.appbrand.game.c.i.fCa;
        int i = paramk.frn.fpX;
        x.i("MicroMsg.WAGamePerfManager", "WAGamePerfManager.enableReport interval = [%d]", new Object[] { Integer.valueOf(i) });
        ((com.tencent.mm.plugin.appbrand.game.c.i)localObject).fCf = new e(((com.tencent.mm.plugin.appbrand.game.c.i)localObject).mAppId, i);
      }
    }
  }
  
  public final void afS()
  {
    x.i("MicroMsg.GameRenderer", "onSurfaceCreated mInitialized:%s", new Object[] { Boolean.valueOf(this.dti) });
    if (!this.dti)
    {
      ??? = j.fAf.fAg;
      if (??? == null) {
        throw new IllegalStateException("There is no mainJsContext here.");
      }
      this.fzL.a(((f)???).fzY, this.mContext, this.fdO.mAppId);
      x.i("MicroMsg.GameRenderer", "hy: created.");
      this.fzN = bi.VG();
      this.dti = true;
    }
    if (this.fzM != null) {
      this.fzM.afZ();
    }
    com.tencent.mm.plugin.appbrand.game.c.i locali = com.tencent.mm.plugin.appbrand.game.c.i.fCa;
    x.i("MicroMsg.WAGamePerfManager", "WAGamePerfManager.gameStart");
    synchronized (com.tencent.mm.plugin.appbrand.game.c.i.fCa)
    {
      locali.fCi = true;
      Object localObject3;
      al localal;
      long l;
      if (locali.fCh)
      {
        localObject3 = locali.fCc;
        ((com.tencent.mm.plugin.appbrand.game.c.f)localObject3).eVk = new al(locali.agy().lnJ.getLooper(), new f.a((com.tencent.mm.plugin.appbrand.game.c.f)localObject3, (byte)0), true);
        localal = ((com.tencent.mm.plugin.appbrand.game.c.f)localObject3).eVk;
        l = ((com.tencent.mm.plugin.appbrand.game.c.f)localObject3).fBR;
        localal.J(l, l);
      }
      locali.fCe.fBZ = com.tencent.mm.plugin.appbrand.game.c.h.b(com.tencent.mm.plugin.appbrand.game.c.h.agu());
      if (locali.fCf != null)
      {
        localObject3 = locali.fCf;
        ((e)localObject3).eOf = new al(locali.agy().lnJ.getLooper(), new e.1((e)localObject3), true);
        localal = ((e)localObject3).eOf;
        l = ((e)localObject3).fBz * 1000;
        localal.J(l, l);
      }
      locali.fCj = System.currentTimeMillis();
      return;
    }
  }
  
  public final void afT()
  {
    x.i("MicroMsg.GameRenderer", "onFinalize ");
    if (!this.gnI)
    {
      this.gnI = true;
      if (this.fzL != null) {
        this.fzL.bnF.Finalize();
      }
      Object localObject1 = com.tencent.mm.plugin.appbrand.game.c.i.fCa;
      x.i("MicroMsg.WAGamePerfManager", "WAGamePerfManager.gameDestroy");
      synchronized (com.tencent.mm.plugin.appbrand.game.c.i.fCa)
      {
        ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCi = false;
        x.i("MicroMsg.WAGamePerfManager", "release() called");
        if (((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCb != null)
        {
          ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCb.lnJ.quit();
          ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCb = null;
        }
        if (((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCf != null)
        {
          ??? = ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCf;
          if (((e)???).eOf != null) {
            ((e)???).eOf.SO();
          }
          ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCf = null;
        }
        ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCd.fBY = true;
        if (!((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCh) {}
      }
      synchronized (((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCc)
      {
        if (((com.tencent.mm.plugin.appbrand.game.c.f)???).eVk != null) {
          ((com.tencent.mm.plugin.appbrand.game.c.f)???).eVk.SO();
        }
        ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCh = false;
        ((com.tencent.mm.plugin.appbrand.game.c.i)localObject1).fCe.fBZ = Integer.MAX_VALUE;
        localObject1 = j.fAf;
        x.i("MicroMsg.V8JsVmManager", "GameRenderer.disposeJsVm start");
        ??? = ((j)localObject1).fAi.entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          Object localObject5 = (Map.Entry)((Iterator)???).next();
          if (((j)localObject1).fAg != ((Map.Entry)localObject5).getValue())
          {
            localObject5 = (com.tencent.mm.plugin.appbrand.g.a)((Map.Entry)localObject5).getValue();
            if (localObject5 != null)
            {
              ((com.tencent.mm.plugin.appbrand.g.a)localObject5).destroy();
              continue;
              localObject2 = finally;
              throw ((Throwable)localObject2);
            }
          }
        }
      }
      ((j)localObject3).fAi.clear();
      if (((j)localObject3).fAg != null)
      {
        ((j)localObject3).fAg.destroy();
        ((j)localObject3).fAg = null;
      }
      x.i("MicroMsg.V8JsVmManager", "GameRenderer.disposeJsVm finished");
      return;
    }
    x.w("MicroMsg.GameRenderer", "hy: called onFinalize multiple times! ");
  }
  
  public final void bI(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.GameRenderer", "[alex] WindowSize onSurfaceChanged width = [%d], height = [%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.fzL != null) {
      this.fzL.bnF.Changed(paramInt1, paramInt2);
    }
    m.fAw.bJ(paramInt1, paramInt2);
    if (this.fdO != null)
    {
      com.tencent.mm.plugin.appbrand.g localg = this.fdO;
      com.tencent.mm.plugin.appbrand.page.k localk = localg.fcK;
      x.i("MicroMsg.AppBrandOnWindowSizeChangedEvent", "hy: on resizeWindow");
      localk.a(localg.fcy).ahM();
    }
  }
  
  public final void cC(boolean paramBoolean)
  {
    if (this.fzL == null) {}
    com.tencent.mm.plugin.appbrand.game.c.g localg;
    label123:
    label165:
    do
    {
      return;
      boolean bool = this.fzL.bnF.Render();
      if (!paramBoolean)
      {
        if (!bool) {
          break label123;
        }
        if (!this.fzJ)
        {
          x.w("MicroMsg.GameRenderer", "hy: onDrawFrame mFirstFrameRendered. using %d ms", new Object[] { Long.valueOf(bi.bI(this.fzN)) });
          this.fzJ = true;
          this.fzI.agj();
        }
      }
      for (;;)
      {
        this.fzI.setSwapNow(bool);
        localg = com.tencent.mm.plugin.appbrand.game.c.i.fCa.fCd;
        if (localg.fBY) {
          break;
        }
        if (localg.fBV > 0L) {
          break label165;
        }
        l = System.currentTimeMillis();
        localg.fBV = l;
        localg.fBT = l;
        return;
        if (!this.fzK)
        {
          this.fzK = true;
          if (this.fdO != null) {
            this.fdO.fcJ.o(9, System.currentTimeMillis() - this.fzO);
          }
        }
      }
      localg.fBU += 1;
    } while (localg.fBU % 20 > 0);
    long l = System.currentTimeMillis();
    localg.fBW = (20000.0D / (l - localg.fBT));
    if (localg.fBX <= 0.0D) {
      localg.fBX = localg.fBW;
    }
    for (;;)
    {
      localg.fBT = l;
      return;
      if (localg.fBW < localg.fBX) {
        localg.fBX = localg.fBW;
      }
    }
  }
  
  public final void e(Runnable paramRunnable)
  {
    if (this.fzI != null) {
      this.fzI.queueEvent(paramRunnable);
    }
  }
  
  public final void onCreateEglSurface()
  {
    x.i("MicroMsg.GameRenderer", "onCreateEglSurface ");
    if (this.fzL != null) {
      this.fzL.bnF.onCreateEglSurface();
    }
  }
  
  public final void onPause()
  {
    x.i("MicroMsg.GameRenderer", "onPause ");
    if (this.fzL != null) {
      this.fzL.bnF.Pause();
    }
  }
  
  public final void onResume()
  {
    x.i("MicroMsg.GameRenderer", "onResume ");
    if (this.fzL != null) {
      this.fzL.bnF.Resume();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */