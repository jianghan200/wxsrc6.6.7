package com.tencent.mm.app;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.mm.kernel.a.b;
import com.tencent.mm.kernel.b.h.6;
import com.tencent.mm.kernel.h.2;
import com.tencent.mm.kernel.h.3;
import com.tencent.mm.kernel.j;
import com.tencent.mm.model.at;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.splash.m.a;
import com.tencent.mm.splash.o.a;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.p;
import junit.framework.Assert;

public class WeChatSplashStartup
  implements m.a
{
  private Application app;
  com.tencent.mm.kernel.b.h profile;
  private String thisProcess;
  
  private void b(o.a parama)
  {
    com.tencent.mm.blink.a.fm(2);
    boolean bool;
    if (parama == null) {
      bool = true;
    }
    for (;;)
    {
      Object localObject1 = this.profile;
      ((com.tencent.mm.kernel.b.h)localObject1).dsT.a(new com.tencent.mm.kernel.b.h.1((com.tencent.mm.kernel.b.h)localObject1));
      localObject1 = new g();
      Object localObject2 = this.profile.dqh;
      Assert.assertNotNull(localObject1);
      com.tencent.mm.kernel.h.Eo().Ef().DM();
      ((com.tencent.mm.kernel.a.a)localObject2).drp = ((b)localObject1);
      if (!bool)
      {
        com.tencent.mm.splash.h.cjU();
        new WeChatSplashStartup.1(this, parama).cht();
      }
      localObject2 = com.tencent.mm.kernel.g.Ek();
      if (!bool)
      {
        if (i.byx == null) {
          i.byx = new i("initThread");
        }
        localObject1 = i.byx;
        ((i)localObject1).uW();
        com.tencent.mm.kernel.g.Ek().a(new WeChatSplashStartup.5(this, (i)localObject1));
        com.tencent.mm.kernel.a.c.Et().b(((i)localObject1).byy.getLooper());
        localObject1 = ((i)localObject1).byz;
        label168:
        localObject2 = ((com.tencent.mm.kernel.g)localObject2).dqL;
        j.ey("startup");
      }
      synchronized (((com.tencent.mm.kernel.h)localObject2).dre)
      {
        if (((com.tencent.mm.kernel.h)localObject2).drf)
        {
          com.tencent.mm.kernel.a.a.j("warning, mmskeleton has started up already.", new Object[0]);
          com.tencent.mm.splash.h.a(new com.tencent.mm.splash.d()
          {
            p bzr = new p();
            
            public final boolean a(Activity paramAnonymousActivity, int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
            {
              return this.bzr.a(paramAnonymousActivity, paramAnonymousInt, paramAnonymousArrayOfString, paramAnonymousArrayOfInt);
            }
            
            public final boolean a(Activity paramAnonymousActivity, Runnable paramAnonymousRunnable)
            {
              com.tencent.mm.kernel.g.Eg();
              boolean bool = com.tencent.mm.kernel.a.Dw();
              String str = at.dBv.I("login_user_name", "");
              int i;
              if ((!bool) && (str.equals("")))
              {
                i = 1;
                if (i != 0) {
                  break label49;
                }
              }
              label49:
              while (!e.sFE)
              {
                return false;
                i = 0;
                break;
              }
              return MMAppMgr.a(paramAnonymousActivity, new WeChatSplashStartup.2.1(this, paramAnonymousRunnable));
            }
            
            public final boolean b(Activity paramAnonymousActivity, Runnable paramAnonymousRunnable)
            {
              return this.bzr.c(paramAnonymousActivity, paramAnonymousRunnable);
            }
            
            public final boolean k(Intent paramAnonymousIntent)
            {
              if ((paramAnonymousIntent != null) && (s.a(paramAnonymousIntent, "absolutely_exit_pid", 0) == Process.myPid()))
              {
                x.i("MicroMsg.WeChatSplashStartup", "handle exit intent.");
                MMAppMgr.lE(s.a(paramAnonymousIntent, "kill_service", true));
                return true;
              }
              return false;
            }
          });
          com.tencent.mm.kernel.g.Ek().a(new WeChatSplashStartup.3(this, bool, parama));
          com.tencent.mm.kernel.g.Ek().a(new WeChatSplashStartup.4(this));
          return;
          bool = false;
          continue;
          localObject1 = null;
          break label168;
        }
        ??? = ((com.tencent.mm.kernel.h)localObject2).Ef().DM();
        long l1 = System.currentTimeMillis();
        com.tencent.mm.kernel.a.a.j("mmskeleton boot startup for process [%s]...", new Object[] { ((com.tencent.mm.kernel.b.g)???).dox });
        com.tencent.mm.kernel.a.a locala = ((com.tencent.mm.kernel.b.g)???).dqh;
        Assert.assertNotNull("You must call whichBootStep(BootStep defaultOne, BootStep ... bootSteps) to specify your BootStep instance first!", locala.drp);
        com.tencent.mm.vending.g.c localc = com.tencent.mm.vending.g.g.cBK().mI(true);
        com.tencent.mm.kernel.a.a.drr = SystemClock.elapsedRealtime();
        com.tencent.mm.kernel.a.a.j("hello WeChat.", new Object[0]);
        locala.drp.uQ();
        long l2 = System.currentTimeMillis();
        com.tencent.mm.kernel.a.a.j("boot install plugins...", new Object[0]);
        locala.drp.uR();
        locala.mConfigured = true;
        com.tencent.mm.kernel.a.a.j("boot all installed plugins : %s...", new Object[] { com.tencent.mm.kernel.h.Eo().Ee().DL() });
        com.tencent.mm.kernel.a.a.j("boot install plugins done in [%s].", new Object[] { com.tencent.mm.kernel.a.a.aQ(l2) });
        j.ey("installPlugins");
        l2 = System.currentTimeMillis();
        com.tencent.mm.kernel.a.a.j("boot make dependency of plugins...", new Object[0]);
        locala.drp.Er();
        com.tencent.mm.kernel.a.a.j("boot make dependency of done in [%s].", new Object[] { com.tencent.mm.kernel.a.a.aQ(l2) });
        l2 = System.currentTimeMillis();
        com.tencent.mm.kernel.a.a.j("boot configure plugins...", new Object[0]);
        locala.drp.a((com.tencent.mm.kernel.b.g)???);
        com.tencent.mm.kernel.a.a.j("boot configure plugins done in [%s].", new Object[] { com.tencent.mm.kernel.a.a.aQ(l2) });
        if (localObject1 != null) {
          localc.a((com.tencent.mm.vending.h.d)localObject1);
        }
        localc.c(new com.tencent.mm.kernel.h.1((com.tencent.mm.kernel.h)localObject2, locala, (com.tencent.mm.kernel.b.g)???));
        localc.c(new h.2((com.tencent.mm.kernel.h)localObject2, locala, (com.tencent.mm.kernel.b.g)???));
        localc.a(com.tencent.mm.vending.h.d.uRC, new h.3((com.tencent.mm.kernel.h)localObject2, l1));
      }
    }
  }
  
  public final void a(o.a parama)
  {
    b(parama);
  }
  
  public final void b(Application paramApplication, String paramString)
  {
    this.app = paramApplication;
    this.thisProcess = paramString;
    this.profile = q.bzn;
    com.tencent.mm.kernel.g.a(this.profile);
    paramApplication = this.profile;
    paramString = this.app;
    paramApplication.dsT.a(new h.6(paramApplication, paramString));
  }
  
  public final void vj()
  {
    b(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/app/WeChatSplashStartup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */