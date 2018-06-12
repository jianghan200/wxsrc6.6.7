package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class e
{
  private Activity activity;
  private WifiManager bnh;
  Condition bvW;
  private BroadcastReceiver jhC;
  private int jhL;
  Lock jhz;
  
  public e(Activity paramActivity)
  {
    this.activity = paramActivity;
    this.jhz = new ReentrantLock();
    this.bvW = this.jhz.newCondition();
    this.bnh = ((WifiManager)ad.getContext().getSystemService("wifi"));
    this.jhL = 10;
  }
  
  public final void aNO()
  {
    try
    {
      this.activity.unregisterReceiver(this.jhC);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
  }
  
  public final int aNQ()
  {
    if (3 == this.bnh.getWifiState()) {
      return 0;
    }
    this.jhC = new e.1(this);
    try
    {
      this.jhz.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      this.activity.registerReceiver(this.jhC, localIntentFilter);
      this.bnh.setWifiEnabled(true);
      boolean bool = this.bvW.await(this.jhL, TimeUnit.SECONDS);
      if (bool)
      {
        aNO();
        this.jhz.unlock();
        return 0;
      }
      aNO();
      this.jhz.unlock();
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException = localInterruptedException;
      aNO();
      this.jhz.unlock();
      return 2;
    }
    finally
    {
      localObject = finally;
      aNO();
      this.jhz.unlock();
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */