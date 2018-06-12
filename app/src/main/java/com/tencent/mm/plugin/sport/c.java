package com.tencent.mm.plugin.sport;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.b.b;
import com.tencent.mm.plugin.sport.b.e;
import com.tencent.mm.plugin.sport.c.d;
import com.tencent.mm.plugin.sport.c.f;
import com.tencent.mm.plugin.sport.c.h;
import com.tencent.mm.plugin.sport.c.i;
import com.tencent.mm.plugin.sport.c.l;
import com.tencent.mm.plugin.sport.c.m;
import com.tencent.mm.plugin.sport.c.n;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public final class c
  implements b
{
  public final List<e> B(long paramLong1, long paramLong2)
  {
    l locall = ((PluginSport)g.n(PluginSport.class)).getSportStepManager();
    x.i("MicroMsg.Sport.SportStepManager", "getSportItemListByPeriod: begin=%s end=%s", new Object[] { locall.opl.format(new Date(paramLong1)), locall.opl.format(new Date(paramLong2)) });
    ((PluginSport)g.n(PluginSport.class)).getSportStepStorage();
    return m.C(paramLong1, paramLong2);
  }
  
  public final void J(int paramInt, long paramLong)
  {
    i.N(paramInt, paramLong);
  }
  
  public final void a(long paramLong1, long paramLong2, com.tencent.mm.plugin.sport.b.c paramc)
  {
    l locall = ((PluginSport)g.n(PluginSport.class)).getSportStepManager();
    x.i("MicroMsg.Sport.SportStepManager", "updateSportStepFromServer: begin=%s end=%s", new Object[] { locall.opl.format(new Date(paramLong1)), locall.opl.format(new Date(paramLong2)) });
    paramc = new d(paramLong1, paramLong2, paramc);
    g.DF().a(1734, locall.dKj);
    g.DF().a(paramc, 0);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    paramString1 = new f(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, 1);
    g.DF().a(paramString1, 0);
  }
  
  public final void bFu()
  {
    com.tencent.mm.plugin.sport.c.a locala = ((PluginSport)g.n(PluginSport.class)).getDeviceStepManager();
    x.i("MicroMsg.Sport.DeviceStepManager", "uploadDeviceStep");
    locala.bFE();
    locala.fs(locala.bFD());
  }
  
  public final boolean bFv()
  {
    return n.bFv();
  }
  
  public final void bFw()
  {
    com.tencent.mm.plugin.sport.a.a locala;
    if (ad.cic())
    {
      ((PluginSport)g.n(PluginSport.class)).getSportFileStorage().reset();
      locala = ((PluginSport)g.n(PluginSport.class)).getDeviceStepManager().ooN;
      if (locala == null) {}
    }
    try
    {
      locala.bFB();
      new File(com.tencent.mm.plugin.sport.b.a.ooH).delete();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void bFx()
  {
    if (n.opq != null)
    {
      n.opq.dismiss();
      n.opq = null;
    }
  }
  
  public final e bFy()
  {
    ((PluginSport)g.n(PluginSport.class)).getSportStepManager();
    ((PluginSport)g.n(PluginSport.class)).getSportStepStorage();
    return m.bFy();
  }
  
  public final void d(Activity paramActivity, String paramString)
  {
    ah.A(new c.1(this, paramActivity, paramString));
  }
  
  public final boolean ei(Context paramContext)
  {
    return n.ei(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sport/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */