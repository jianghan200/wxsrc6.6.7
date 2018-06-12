package com.tencent.mm.plugin.sport.service;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.os.Process;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.plugin.sport.a.a.a;
import com.tencent.mm.plugin.sport.c.c;
import com.tencent.mm.plugin.sport.c.h;
import com.tencent.mm.plugin.sport.c.i;
import com.tencent.mm.plugin.sport.c.k;
import com.tencent.mm.plugin.sport.c.n;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public class SportService
  extends Service
  implements c
{
  private SensorManager ejl;
  private k opr;
  private boolean ops = false;
  private final a.a opt = new a.a()
  {
    public final void K(int paramAnonymousInt, long paramAnonymousLong)
    {
      ((PluginSport)com.tencent.mm.kernel.g.n(PluginSport.class)).getSportFileStorage().setLong(paramAnonymousInt, paramAnonymousLong);
    }
    
    public final void Oe(String paramAnonymousString)
    {
      com.tencent.mm.plugin.sport.c.g.Of(paramAnonymousString);
      if (!SportService.this.bFT()) {
        SportService.this.stopSelf();
      }
    }
    
    public final void bFA() {}
    
    public final void bFB()
    {
      ((PluginSport)com.tencent.mm.kernel.g.n(PluginSport.class)).getSportFileStorage().reset();
      Process.killProcess(Process.myPid());
    }
    
    public final long bFz()
    {
      try
      {
        long l1 = bi.ciZ() / 10000L;
        long l2 = i.xS(202);
        long l3 = i.xS(201);
        long l4 = k.bFP();
        int i = (int)k.bFO();
        if (l4 == l1)
        {
          x.i("MicroMsg.Sport.SportService", "cacheTime %s cacheStep:%s", new Object[] { Long.valueOf(l4), Integer.valueOf(i) });
          return i;
        }
        if (l2 == l1)
        {
          x.i("MicroMsg.Sport.SportService", "saveTime %s saveStep:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l3) });
          return (int)l3;
        }
        x.i("MicroMsg.Sport.SportService", "getStepCount:0, new day");
        x.i("MicroMsg.Sport.SportService", "saveTime:%s, cacheTime: %S, beginOfToday:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l4), Long.valueOf(l1) });
        return 0L;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.Sport.SportService", localException, "exception in :exdevice getTodayDeviceStepCount", new Object[0]);
      }
      return 0L;
    }
    
    public final long getLong(int paramAnonymousInt, long paramAnonymousLong)
    {
      return ((PluginSport)com.tencent.mm.kernel.g.n(PluginSport.class)).getSportFileStorage().getLong(paramAnonymousInt, paramAnonymousLong);
    }
  };
  private Sensor sensor;
  
  private boolean bFR()
  {
    try
    {
      if (this.ejl == null) {
        this.ejl = ((SensorManager)getSystemService("sensor"));
      }
      if (this.opr == null)
      {
        this.opr = new k();
        this.opr.opk = this;
      }
      if ((this.ejl != null) && (getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter")))
      {
        this.sensor = this.ejl.getDefaultSensor(19);
        if (this.sensor == null)
        {
          x.i("MicroMsg.Sport.SportService", " TYPE_STEP_COUNTER sensor null");
          return false;
        }
        JSONObject localJSONObject = com.tencent.mm.plugin.sport.c.g.bFJ();
        boolean bool = this.ejl.registerListener(this.opr, this.sensor, localJSONObject.optInt("stepCounterRateUs", 60000));
        if (!bool) {
          bFS();
        }
        x.i("MicroMsg.Sport.SportService", "registerDetector() ok.(result : %s)", new Object[] { Boolean.valueOf(bool) });
        return bool;
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.Sport.SportService", "Exception in registerDetector %s", new Object[] { localException.getMessage() });
    }
    for (;;)
    {
      return false;
      x.i("MicroMsg.Sport.SportService", "no step sensor");
    }
  }
  
  private void bFS()
  {
    try
    {
      if (this.ejl == null) {
        this.ejl = ((SensorManager)getSystemService("sensor"));
      }
      this.ejl.unregisterListener(this.opr);
      x.i("MicroMsg.Sport.SportService", "unregisterDetector() success!");
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.Sport.SportService", "Exception in unregisterDetector %s", new Object[] { localException.getMessage() });
    }
  }
  
  public final void bFH()
  {
    bFS();
  }
  
  public final boolean bFT()
  {
    this.ops = n.ei(this);
    if (this.ops)
    {
      bFS();
      return bFR();
    }
    return false;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.opt;
  }
  
  public void onCreate()
  {
    super.onCreate();
    x.i("MicroMsg.Sport.SportService", "onCreate");
    this.ops = n.ei(this);
    x.i("MicroMsg.Sport.SportService", "isSupportDeviceStep %b", new Object[] { Boolean.valueOf(this.ops) });
    if (this.ops)
    {
      bFR();
      return;
    }
    x.i("MicroMsg.Sport.SportService", "stop self");
    stopSelf();
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.Sport.SportService", "onDestroy");
    if (this.ops) {
      bFS();
    }
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.Sport.SportService", "onStartCommand");
    try
    {
      if (this.ops)
      {
        if (this.opr != null) {
          this.opr.opk = this;
        }
        boolean bool = bFT();
        if (bool) {
          return 1;
        }
      }
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Sport.SportService", localException, "Exception onStartCommand %s", new Object[0]);
    }
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sport/service/SportService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */