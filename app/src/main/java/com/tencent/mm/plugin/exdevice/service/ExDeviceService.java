package com.tencent.mm.plugin.exdevice.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.Process;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public class ExDeviceService
  extends Service
{
  private h.a iyD = null;
  
  private static boolean aHv()
  {
    PackageManager localPackageManager = ad.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    x.i("MicroMsg.exdevice.ExDeviceService", "isInstallWearApp %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    x.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onBind");
    if (this.iyD == null) {
      this.iyD = new y();
    }
    return this.iyD;
  }
  
  public void onCreate()
  {
    x.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onCreate");
    super.onCreate();
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onDestroy");
    Java2CExDevice.closeBluetoothAccessoryLib();
    super.onDestroy();
    if (!aHv())
    {
      x.i("MicroMsg.exdevice.ExDeviceService", "kill exdevice process now");
      Process.killProcess(Process.myPid());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/service/ExDeviceService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */