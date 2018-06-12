package com.google.android.gms.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ac
{
  private static final Method aXQ = ;
  private static final Method aXR = qh();
  private static final Method aXS = qi();
  private static final Method aXT = qj();
  private static final Method aXU = qk();
  
  private static int a(WorkSource paramWorkSource)
  {
    if (aXS != null) {
      try
      {
        int i = ((Integer)aXS.invoke(paramWorkSource, new Object[0])).intValue();
        return i;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
      }
    }
    return 0;
  }
  
  private static String a(WorkSource paramWorkSource, int paramInt)
  {
    if (aXU != null) {
      try
      {
        paramWorkSource = (String)aXU.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
        return paramWorkSource;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
      }
    }
    return null;
  }
  
  public static boolean at(Context paramContext)
  {
    return paramContext.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0;
  }
  
  public static List<String> b(WorkSource paramWorkSource)
  {
    int j = 0;
    if (paramWorkSource == null) {}
    Object localObject;
    for (int i = 0; i == 0; i = a(paramWorkSource))
    {
      localObject = Collections.EMPTY_LIST;
      return (List<String>)localObject;
    }
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      localObject = localArrayList;
      if (j >= i) {
        break;
      }
      localObject = a(paramWorkSource, j);
      if (!ab.bt((String)localObject)) {
        localArrayList.add(localObject);
      }
      j += 1;
    }
  }
  
  private static WorkSource d(int paramInt, String paramString)
  {
    WorkSource localWorkSource = new WorkSource();
    if (aXR != null)
    {
      str = paramString;
      if (paramString == null) {
        str = "";
      }
    }
    while (aXQ == null) {
      try
      {
        String str;
        aXR.invoke(localWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        return localWorkSource;
      }
      catch (Exception paramString)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
        return localWorkSource;
      }
    }
    try
    {
      aXQ.invoke(localWorkSource, new Object[] { Integer.valueOf(paramInt) });
      return localWorkSource;
    }
    catch (Exception paramString)
    {
      Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
    }
    return localWorkSource;
  }
  
  public static WorkSource m(Context paramContext, String paramString)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramString, 0);
        if (paramContext != null) {
          return d(paramContext.uid, paramString);
        }
      }
      catch (PackageManager.NameNotFoundException paramContext) {}
    }
    return null;
  }
  
  private static Method qg()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method qh()
  {
    Method localMethod = null;
    if (z.dx(18)) {}
    try
    {
      localMethod = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE, String.class });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method qi()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("size", new Class[0]);
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method qj()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("get", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method qk()
  {
    Method localMethod = null;
    if (z.dx(18)) {}
    try
    {
      localMethod = WorkSource.class.getMethod("getName", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/c/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */