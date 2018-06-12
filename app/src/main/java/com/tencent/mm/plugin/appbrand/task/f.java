package com.tencent.mm.plugin.appbrand.task;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

class f
{
  final String gtP;
  final Class gtQ;
  private final Class gtR;
  final LinkedHashMap<String, Integer> gtS = new LinkedHashMap();
  final LinkedHashMap<String, AppBrandRemoteTaskController> gtT = new LinkedHashMap();
  
  f(Class paramClass1, Class paramClass2)
  {
    this.gtP = paramClass1.getName();
    this.gtQ = paramClass1;
    this.gtR = paramClass2;
  }
  
  final void Fo()
  {
    if (this.gtR == null) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ad.getContext(), this.gtR);
    ad.getContext().sendBroadcast(localIntent);
  }
  
  void a(String paramString, int paramInt, AppBrandRemoteTaskController paramAppBrandRemoteTaskController)
  {
    this.gtS.put(paramString, Integer.valueOf(paramInt));
    this.gtT.put(paramString, paramAppBrandRemoteTaskController);
  }
  
  void amU()
  {
    if (!this.gtS.isEmpty()) {}
    for (;;)
    {
      return;
      Object localObject2 = (ActivityManager)ad.getContext().getSystemService("activity");
      Object localObject1 = ad.getContext().getPackageManager();
      if ((localObject2 != null) && (localObject1 != null)) {
        try
        {
          localObject1 = ((PackageManager)localObject1).getActivityInfo(new ComponentName(ad.getContext(), this.gtQ), 128).processName;
          localObject2 = ((ActivityManager)localObject2).getRunningAppProcesses();
          if (localObject2 != null)
          {
            localObject2 = ((List)localObject2).iterator();
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
            do
            {
              if (!((Iterator)localObject2).hasNext()) {
                break;
              }
              localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
            } while (!localRunningAppProcessInfo.processName.equals(localObject1));
            Process.killProcess(localRunningAppProcessInfo.pid);
            return;
          }
        }
        catch (Exception localException) {}
      }
    }
  }
  
  final AppBrandRemoteTaskController vE(String paramString)
  {
    return (AppBrandRemoteTaskController)this.gtT.get(paramString);
  }
  
  void vu(String paramString)
  {
    this.gtS.remove(paramString);
    this.gtT.remove(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */