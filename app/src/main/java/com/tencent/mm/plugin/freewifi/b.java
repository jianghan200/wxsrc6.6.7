package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class b
{
  private WifiManager bnh;
  Condition bvW;
  private Context context;
  private long dJH = 15000L;
  boolean jhA = false;
  boolean jhB = false;
  private BroadcastReceiver jhC;
  Lock jhz;
  String ssid;
  
  public b(String paramString, Context paramContext)
  {
    this.ssid = paramString;
    this.jhz = new ReentrantLock();
    this.bvW = this.jhz.newCondition();
    this.bnh = ((WifiManager)paramContext.getSystemService("wifi"));
    this.context = paramContext;
  }
  
  private void aNO()
  {
    try
    {
      this.context.unregisterReceiver(this.jhC);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
  }
  
  public final int aNP()
  {
    if ((((ConnectivityManager)this.context.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (this.ssid.equals(d.aOC()))) {
      return 0;
    }
    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
      throw new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
    }
    this.jhC = new b.1(this);
    try
    {
      this.jhz.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      this.context.registerReceiver(this.jhC, localIntentFilter);
      if (!this.bnh.isWifiEnabled())
      {
        i = new f(this.context).aNQ();
        x.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "enable ret = " + i);
        if (i != 0) {
          return i;
        }
      }
      int i = d.BZ(this.ssid);
      if (i != 0)
      {
        aNO();
        return i;
      }
      boolean bool1 = false;
      boolean bool2;
      for (;;)
      {
        try
        {
          if (this.jhA)
          {
            bool2 = bool1;
            if (this.jhB) {
              break;
            }
          }
          long l = System.currentTimeMillis();
          bool1 = this.bvW.await(this.dJH, TimeUnit.MILLISECONDS);
          bool2 = bool1;
          if (!bool1) {
            break;
          }
          l = System.currentTimeMillis() - l;
          this.dJH -= l;
          x.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "costMillis=" + l + "; left timeout=" + this.dJH);
          if (this.dJH > 0L)
          {
            l = this.dJH;
            this.dJH = l;
          }
          else
          {
            l = 3000L;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          x.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { localInterruptedException.getMessage() });
          return -17;
        }
      }
      if (!bool2) {
        return -16;
      }
      return 0;
    }
    finally
    {
      aNO();
      this.jhz.unlock();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */