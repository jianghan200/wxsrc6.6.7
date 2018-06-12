package com.tencent.mm.plugin.appbrand.game.c;

import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Random;

public enum i
{
  public ah fCb = null;
  public final f fCc = new f();
  public final g fCd = new g();
  public final h fCe = new h();
  public e fCf;
  public Boolean fCg = null;
  public boolean fCh = false;
  public volatile boolean fCi = false;
  public long fCj;
  public String mAppId;
  
  private i() {}
  
  public static boolean b(int paramInt, double paramDouble)
  {
    x.i("MicroMsg.WAGamePerfManager", "WAGamePerfManager.shouldEnableReport gamePercentage = [%f]", new Object[] { Double.valueOf(paramDouble) });
    double d = new Random(paramInt ^ System.nanoTime()).nextDouble();
    if (d <= paramDouble) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.WAGamePerfManager", "shouldEnableReport() returned: [%b], localRandom = [%f] serverPercent = [%f]", new Object[] { Boolean.valueOf(bool), Double.valueOf(d), Double.valueOf(paramDouble) });
      return bool;
    }
  }
  
  public final h agv()
  {
    synchronized (fCa)
    {
      if (this.fCi)
      {
        h localh = this.fCe;
        return localh;
      }
      return null;
    }
  }
  
  public final f agw()
  {
    synchronized (fCa)
    {
      if ((this.fCi) && (this.fCh))
      {
        f localf = this.fCc;
        return localf;
      }
      return null;
    }
  }
  
  public final g agx()
  {
    synchronized (fCa)
    {
      if (this.fCi)
      {
        g localg = this.fCd;
        return localg;
      }
      return null;
    }
  }
  
  public final ah agy()
  {
    if (this.fCb == null) {
      this.fCb = new ah("WAGamePerfManager_thread");
    }
    return this.fCb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */