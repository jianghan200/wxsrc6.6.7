package com.tencent.mm.plugin.secinforeport;

import android.os.HandlerThread;
import com.tencent.mm.a.h;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.u.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class PluginSecInfoReport
  extends f
  implements b
{
  private static HandlerThread mOk = null;
  private static ag mOl = null;
  
  private void reportSecurityInfoAsync(final int paramInt)
  {
    if (mOl == null)
    {
      x.e("MicroMsg.PSIR", "[tomys] workerposter is null, give up doing rest ops.");
      return;
    }
    mOl.post(new Runnable()
    {
      public final void run()
      {
        for (;;)
        {
          int j;
          int k;
          try
          {
            if (com.tencent.mm.plugin.secinforeport.a.d.mOw.H(1, 86400000L))
            {
              i = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getInt("DisableRiskScanSdkProb", 0);
              j = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getInt("DisableInstalledPkgInfoReportProb", 0);
              com.tencent.mm.kernel.g.Eg();
              k = h.aM(com.tencent.mm.kernel.a.Df(), 101);
              if ((i > 0) && (k >= 0) && (k <= i))
              {
                i = 1;
                break label173;
                com.tencent.mm.plugin.secinforeport.a.d locald = com.tencent.mm.plugin.secinforeport.a.d.mOw;
                k = paramInt;
                if (i != 0) {
                  continue;
                }
                bool1 = true;
                break label191;
                locald.a(k, bool1, bool2, true);
              }
            }
            else
            {
              if (com.tencent.mm.plugin.secinforeport.a.d.mOw.H(2, 86400000L)) {
                com.tencent.mm.plugin.secinforeport.a.d.mOw.bto();
              }
              return;
            }
            int i = 0;
            break label173;
            j = 0;
            continue;
            boolean bool1 = false;
          }
          catch (Throwable localThrowable)
          {
            x.printErrStackTrace("MicroMsg.PSIR", localThrowable, "unexpected exception was thrown.", new Object[0]);
            return;
          }
          boolean bool2 = false;
          continue;
          label173:
          if ((j > 0) && (k >= 0) && (k <= j))
          {
            j = 1;
            continue;
            label191:
            if (j == 0) {
              bool2 = true;
            }
          }
        }
      }
    });
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.plugin.secinforeport.a.d.a(c.mOo);
    com.tencent.mm.plugin.secinforeport.a.a.a(a.mOi);
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    dependsOn(com.tencent.mm.plugin.report.c.class);
    dependsOn(com.tencent.mm.plugin.normsg.a.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (mOk == null) {}
    try
    {
      paramg = com.tencent.mm.sdk.f.e.Xs("SIRWorker");
      mOk = paramg;
      paramg.start();
      mOl = new ag(mOk.getLooper());
      com.tencent.mm.sdk.b.a.sFg.a(new PluginSecInfoReport.1(this));
      com.tencent.mm.sdk.b.a.sFg.a(new PluginSecInfoReport.2(this));
      ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new com.tencent.mm.plugin.auth.a.a()
      {
        public final void a(i.f paramAnonymousf, i.g paramAnonymousg, boolean paramAnonymousBoolean)
        {
          if (paramAnonymousBoolean) {}
          for (int i = 0;; i = 540999680)
          {
            PluginSecInfoReport.this.reportSecurityInfoAsync(i);
            return;
          }
        }
        
        public final void a(u.b paramAnonymousb, String paramAnonymousString1, int paramAnonymousInt1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt2)
        {
          PluginSecInfoReport.this.reportSecurityInfoAsync(540999681);
        }
      });
      return;
    }
    catch (Throwable paramg)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.PSIR", paramg, "[tomys] unexpected exception.", new Object[0]);
      }
    }
  }
  
  public void installed()
  {
    alias(b.class);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/secinforeport/PluginSecInfoReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */