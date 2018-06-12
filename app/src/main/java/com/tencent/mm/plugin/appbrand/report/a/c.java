package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.report.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public final class c
{
  final f gre;
  volatile String grf;
  public volatile long grg = 0L;
  volatile long grh = 0L;
  private final LinkedList<Runnable> gri = new LinkedList();
  volatile String mAppId;
  
  public c(int paramInt)
  {
    this.gre = new f("MicroMsg.AppBrandPageViewStatistics[" + paramInt + "]");
  }
  
  public final void agK()
  {
    this.gre.amE();
    if (this.gre.amC())
    {
      amG();
      return;
    }
    ah.A(new c.1(this));
  }
  
  public final void agL()
  {
    if (this.grg <= 0L) {
      return;
    }
    this.gre.amD();
    this.gri.clear();
  }
  
  public final void amF()
  {
    this.grh = (bi.VF() - this.grg);
  }
  
  final void amG()
  {
    while (!this.gri.isEmpty()) {
      ((Runnable)this.gri.pollFirst()).run();
    }
  }
  
  public final void h(g paramg)
  {
    this.mAppId = paramg.mAppId;
  }
  
  public final boolean iD()
  {
    return (this.grg > 0L) && (this.grh <= 0L);
  }
  
  public final void onDestroy()
  {
    this.gre.amE();
    f localf = this.gre;
    localf.quit();
    localf.mStopped = true;
  }
  
  public final void t(Runnable paramRunnable)
  {
    if (this.gre.amC())
    {
      paramRunnable.run();
      return;
    }
    this.gri.addLast(paramRunnable);
  }
  
  public final void vq(String paramString)
  {
    this.grg = bi.VF();
    this.gre.amD();
    this.grf = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */