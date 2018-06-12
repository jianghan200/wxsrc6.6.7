package com.tencent.mm.plugin.sport.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.a.a.a;
import com.tencent.mm.plugin.sport.service.SportService;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bn;
import java.util.Calendar;

public final class a
{
  public c<qt> ooJ = new a.1(this);
  public f ooK;
  private long ooL;
  long ooM;
  public com.tencent.mm.plugin.sport.a.a ooN;
  private ServiceConnection ooO = new ServiceConnection()
  {
    public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
    {
      x.i("MicroMsg.Sport.DeviceStepManager", "onServiceConnected %s", new Object[] { paramAnonymousComponentName.toShortString() });
      a.this.ooN = a.a.T(paramAnonymousIBinder);
    }
    
    public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
    {
      x.i("MicroMsg.Sport.DeviceStepManager", "onServiceDisconnected %s", new Object[] { paramAnonymousComponentName.toShortString() });
      a.this.ooN = null;
    }
  };
  
  public a()
  {
    this.ooJ.cht();
  }
  
  public final long bFC()
  {
    if (this.ooL == 0L) {
      this.ooL = i.L(4, 0L);
    }
    return this.ooL;
  }
  
  public final long bFD()
  {
    long l3 = System.currentTimeMillis();
    String str = "";
    if (this.ooN != null) {}
    for (;;)
    {
      try
      {
        l1 = this.ooN.bFz();
        str = "exdevice";
      }
      catch (RemoteException localRemoteException)
      {
        long l2;
        long l4;
        l1 = -1L;
        continue;
      }
      l2 = l1;
      if (l1 == -1L)
      {
        l1 = bi.ciZ() / 10000L;
        l4 = i.xS(202);
        l2 = i.xS(201);
        if (l4 == l1) {
          str = "mm";
        }
      }
      else
      {
        x.i("MicroMsg.Sport.DeviceStepManager", "get today step from %s process %d use time %d", new Object[] { str, Long.valueOf(l2), Long.valueOf(System.currentTimeMillis() - l3) });
        return l2;
      }
      str = "unknow";
      l2 = 0L;
      continue;
      long l1 = -1L;
    }
  }
  
  public final void bFE()
  {
    if (n.ei(ad.getContext()))
    {
      if (this.ooN != null)
      {
        x.i("MicroMsg.Sport.DeviceStepManager", "Not need bind");
        return;
      }
      x.i("MicroMsg.Sport.DeviceStepManager", "start to bind sport aidl");
      try
      {
        Intent localIntent1 = new Intent(ad.getContext(), SportService.class);
        localIntent1.setFlags(268435456);
        ad.getContext().bindService(localIntent1, this.ooO, 1);
        return;
      }
      catch (Exception localException1)
      {
        return;
      }
    }
    try
    {
      if (this.ooN != null) {
        ad.getContext().unbindService(this.ooO);
      }
      Intent localIntent2 = new Intent(ad.getContext(), SportService.class);
      ad.getContext().stopService(localIntent2);
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
    this.ooN = null;
  }
  
  public final boolean fs(long paramLong)
  {
    if (this.ooK != null) {
      g.DF().c(this.ooK);
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    long l1 = localCalendar.getTimeInMillis();
    long l2 = System.currentTimeMillis();
    x.i("MicroMsg.Sport.DeviceStepManager", "update device Step time: %s stepCount: %s", new Object[] { n.bx(l2), Long.valueOf(paramLong) });
    this.ooK = new f("", "gh_43f2581f6fd6", (int)(l1 / 1000L), (int)(l2 / 1000L), (int)paramLong, bn.cmZ(), 1);
    g.DF().a(this.ooK, 0);
    l1 = System.currentTimeMillis();
    this.ooM = l1;
    i.M(3, l1);
    this.ooL = paramLong;
    i.M(4, this.ooL);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sport/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */