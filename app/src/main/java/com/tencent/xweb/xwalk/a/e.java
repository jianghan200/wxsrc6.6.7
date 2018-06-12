package com.tencent.xweb.xwalk.a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Process;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xwalk.core.NetworkUtil;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkUpdater;

public final class e
  extends AsyncTask<String, Integer, Integer>
{
  private static String vFH = "0";
  static XWalkUpdater vFj;
  private HashMap<String, String> vFG;
  
  public e(XWalkUpdater paramXWalkUpdater, HashMap<String, String> paramHashMap)
  {
    vFj = paramXWalkUpdater;
    this.vFG = paramHashMap;
    if (paramHashMap != null)
    {
      paramXWalkUpdater = (String)paramHashMap.get("UpdaterCheckType");
      vFH = paramXWalkUpdater;
      if ((paramXWalkUpdater == null) || (!vFH.equals("1"))) {
        break label74;
      }
      c.cJo().cJs();
    }
    for (;;)
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkUpdateChecker notify received !! mNotifyType = " + vFH);
      return;
      label74:
      vFH = "0";
    }
  }
  
  public static void Iy(int paramInt)
  {
    cJz();
    c.Iy(paramInt);
  }
  
  private static boolean b(c.a parama)
  {
    if (cJx()) {}
    do
    {
      do
      {
        return false;
      } while (!NetworkUtil.isNetworkAvailable());
      if ((!parama.vFq) && (!NetworkUtil.isWifiAvailable()))
      {
        XWalkInitializer.addXWalkInitializeLog("current network is not wifi , this scheduler not support mobile data");
        return false;
      }
    } while (!vFj.updateXWalkRuntime(parama.cJw()));
    cJy();
    return true;
  }
  
  static void c(c.a parama)
  {
    if (parama != null)
    {
      if (XWalkEnvironment.hasAvailableVersion()) {
        break label21;
      }
      XWalkInitializer.addXWalkInitializeLog("no availableversion installed, do start download ");
      b(parama);
    }
    label21:
    while (parama.vFA > System.currentTimeMillis()) {
      return;
    }
    b(parama);
  }
  
  public static void cJA()
  {
    XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    cJz();
    c.a(null);
  }
  
  public static boolean cJx()
  {
    int i = XWalkEnvironment.getSharedPreferencesForUpdateConfig().getInt("UpdatingProcessId", -1);
    if (i == Process.myPid())
    {
      XWalkInitializer.addXWalkInitializeLog("current process is in updating progress");
      return true;
    }
    if (i < 0) {
      return false;
    }
    Object localObject = (ActivityManager)XWalkEnvironment.getApplicationContext().getSystemService("activity");
    Process.myPid();
    int j = Process.myUid();
    localObject = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if (localRunningAppProcessInfo.pid == i) {
        if (localRunningAppProcessInfo.uid == j)
        {
          XWalkInitializer.addXWalkInitializeLog("some process is in updating progress");
          return true;
        }
      }
    }
    cJz();
    return false;
  }
  
  public static void cJy()
  {
    int i = Process.myPid();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.putInt("UpdatingProcessId", i);
    localEditor.commit();
    XWalkInitializer.addXWalkInitializeLog("start updating progress");
  }
  
  public static void cJz()
  {
    Process.myPid();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.remove("UpdatingProcessId");
    localEditor.commit();
    XWalkInitializer.addXWalkInitializeLog("finish updating progress");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/xwalk/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */