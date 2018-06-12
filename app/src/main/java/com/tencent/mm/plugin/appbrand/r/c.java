package com.tencent.mm.plugin.appbrand.r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.e.i;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public final class c
{
  private static volatile ah dJt;
  private static final Set<Object> fEy = new HashSet();
  private static final Object gBw = new Object();
  private static final char[] gBx = { 60, 62, 34, 39, 38, 32, 39 };
  private static final String[] gBy = { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&nbsp;", "&#39;" };
  
  public static ah Em()
  {
    if (dJt == null) {}
    synchronized (gBw)
    {
      if (dJt == null)
      {
        dJt = new ah("SubCoreAppBrand#WorkerThread");
        g.a("SubCoreAppBrand#WorkerThread", new h(dJt.lnJ.getLooper(), "SubCoreAppBrand#WorkerThread"));
      }
      return dJt;
    }
  }
  
  public static void aov()
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    ad.getContext().sendBroadcast(localIntent);
  }
  
  public static long aow()
  {
    return bi.VE();
  }
  
  public static void aox()
  {
    if (dJt == null) {
      return;
    }
    synchronized (gBw)
    {
      if (dJt != null)
      {
        g.abF("SubCoreAppBrand#WorkerThread");
        dJt.lnJ.quit();
        dJt = null;
      }
      return;
    }
  }
  
  public static void az(Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    fEy.remove(paramObject);
  }
  
  public static String b(ComponentName paramComponentName)
  {
    if (paramComponentName == null) {}
    for (;;)
    {
      return "[UNKNOWN]";
      PackageManager localPackageManager = ad.getContext().getPackageManager();
      if (localPackageManager != null) {
        try
        {
          paramComponentName = localPackageManager.getActivityInfo(paramComponentName, 128);
          if (paramComponentName != null)
          {
            paramComponentName = paramComponentName.taskAffinity;
            return paramComponentName;
          }
        }
        catch (Exception paramComponentName)
        {
          x.e("MicroMsg.AppBrandUtil", "getActivityTaskAffinity e = %s", new Object[] { paramComponentName });
        }
      }
    }
    return "[UNKNOWN]";
  }
  
  public static <T> T br(T paramT)
  {
    if (paramT != null) {
      fEy.add(paramT);
    }
    return paramT;
  }
  
  public static int c(Context paramContext, float paramFloat)
  {
    return Math.round(paramContext.getResources().getDisplayMetrics().density * paramFloat);
  }
  
  public static String getMMString(int paramInt, Object... paramVarArgs)
  {
    return ad.getResources().getString(paramInt, paramVarArgs);
  }
  
  public static void m(Map paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      Object localObject1 = ((Map.Entry)localObject2).getKey();
      localObject2 = ((Map.Entry)localObject2).getValue();
      if (((localObject1 instanceof String)) && ((localObject2 instanceof Map)))
      {
        m((Map)localObject2);
        paramMap.put(localObject1, new JSONObject((Map)localObject2));
      }
    }
  }
  
  public static void runOnUiThread(Runnable paramRunnable)
  {
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      ah.A(paramRunnable);
      return;
    }
    paramRunnable.run();
  }
  
  public static String vS(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int m = paramString.length();
    int i = 0;
    while (i < m)
    {
      int j = 0;
      while (j < gBx.length)
      {
        String str = gBy[j];
        int k = 0;
        while ((k < str.length()) && (i + k < m) && (str.charAt(k) == paramString.charAt(i + k))) {
          k += 1;
        }
        if (k == str.length()) {
          break;
        }
        j += 1;
      }
      if (j != gBx.length)
      {
        localStringBuffer.append(gBx[j]);
        i = gBy[j].length() + i;
      }
      else
      {
        localStringBuffer.append(paramString.charAt(i));
        i += 1;
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String vT(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.replace(' ', '\n').replace(' ', '\n');
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */