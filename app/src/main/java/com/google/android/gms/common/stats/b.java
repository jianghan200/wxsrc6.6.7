package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.c.aa;
import com.google.android.gms.c.j;
import com.google.android.gms.c.u;
import com.google.android.gms.common.internal.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static final Object aOv = new Object();
  private static b aPH;
  private static final ComponentName aPM = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
  private static Integer aPO;
  private final List<String> aPI;
  private final List<String> aPJ;
  private final List<String> aPK;
  private final List<String> aPL;
  private e aPN;
  
  private b()
  {
    if (getLogLevel() == d.LOG_LEVEL_OFF)
    {
      this.aPI = Collections.EMPTY_LIST;
      this.aPJ = Collections.EMPTY_LIST;
      this.aPK = Collections.EMPTY_LIST;
      this.aPL = Collections.EMPTY_LIST;
      return;
    }
    Object localObject = (String)c.a.aPR.get();
    if (localObject == null)
    {
      localObject = Collections.EMPTY_LIST;
      this.aPI = ((List)localObject);
      localObject = (String)c.a.aPS.get();
      if (localObject != null) {
        break label171;
      }
      localObject = Collections.EMPTY_LIST;
      label83:
      this.aPJ = ((List)localObject);
      localObject = (String)c.a.aPT.get();
      if (localObject != null) {
        break label184;
      }
      localObject = Collections.EMPTY_LIST;
      label106:
      this.aPK = ((List)localObject);
      localObject = (String)c.a.aPU.get();
      if (localObject != null) {
        break label197;
      }
    }
    label171:
    label184:
    label197:
    for (localObject = Collections.EMPTY_LIST;; localObject = Arrays.asList(((String)localObject).split(",")))
    {
      this.aPL = ((List)localObject);
      this.aPN = new e(((Long)c.a.aPV.get()).longValue());
      return;
      localObject = Arrays.asList(((String)localObject).split(","));
      break;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label83;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label106;
    }
  }
  
  private static ServiceInfo c(Context paramContext, Intent paramIntent)
  {
    paramContext = paramContext.getPackageManager().queryIntentServices(paramIntent, 128);
    if ((paramContext == null) || (paramContext.size() == 0))
    {
      String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), aa.dy(20) });
      return null;
    }
    if (paramContext.size() > 1)
    {
      String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), aa.dy(20) });
      paramIntent = paramContext.iterator();
      if (paramIntent.hasNext())
      {
        paramContext = ((ResolveInfo)paramIntent.next()).serviceInfo.name;
        return null;
      }
    }
    return ((ResolveInfo)paramContext.get(0)).serviceInfo;
  }
  
  private static int getLogLevel()
  {
    if (aPO == null) {}
    for (;;)
    {
      try
      {
        if (!u.qe()) {
          continue;
        }
        i = ((Integer)c.a.aPQ.get()).intValue();
        aPO = Integer.valueOf(i);
      }
      catch (SecurityException localSecurityException)
      {
        int i;
        aPO = Integer.valueOf(d.LOG_LEVEL_OFF);
        continue;
      }
      return aPO.intValue();
      i = d.LOG_LEVEL_OFF;
    }
  }
  
  public static b pG()
  {
    synchronized (aOv)
    {
      if (aPH == null) {
        aPH = new b();
      }
      return aPH;
    }
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
    a(paramContext, paramServiceConnection, null, null, 1);
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection, String paramString, Intent paramIntent, int paramInt)
  {
    if (!f.aNr) {
      return;
    }
    String str1 = String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramServiceConnection));
    int i = getLogLevel();
    label46:
    long l2;
    long l1;
    if ((i == d.LOG_LEVEL_OFF) || (this.aPN == null))
    {
      i = 0;
      if (i == 0) {
        break label343;
      }
      l2 = System.currentTimeMillis();
      paramServiceConnection = null;
      if ((getLogLevel() & d.aPZ) != 0) {
        paramServiceConnection = aa.dy(5);
      }
      l1 = 0L;
      if ((getLogLevel() & d.aQb) != 0) {
        l1 = Debug.getNativeHeapAllocatedSize();
      }
      if ((paramInt != 1) && (paramInt != 4)) {
        break label345;
      }
    }
    for (paramServiceConnection = new ConnectionEvent(l2, paramInt, null, null, null, null, paramServiceConnection, str1, SystemClock.elapsedRealtime(), l1);; paramServiceConnection = new ConnectionEvent(l2, paramInt, aa.as(paramContext), paramString, paramIntent.processName, paramIntent.name, paramServiceConnection, str1, SystemClock.elapsedRealtime(), l1))
    {
      paramContext.startService(new Intent().setComponent(aPM).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", paramServiceConnection));
      return;
      if ((paramInt == 4) || (paramInt == 1))
      {
        if (this.aPN.bl(str1))
        {
          i = 1;
          break label46;
        }
        i = 0;
        break label46;
      }
      Object localObject = c(paramContext, paramIntent);
      if (localObject == null)
      {
        String.format("Client %s made an invalid request %s", new Object[] { paramString, paramIntent.toUri(0) });
        i = 0;
        break label46;
      }
      paramServiceConnection = aa.as(paramContext);
      String str2 = ((ServiceInfo)localObject).processName;
      localObject = ((ServiceInfo)localObject).name;
      if ((this.aPI.contains(paramServiceConnection)) || (this.aPJ.contains(paramString)) || (this.aPK.contains(str2)) || (this.aPL.contains(localObject)) || ((str2.equals(paramServiceConnection)) && ((i & d.aQa) != 0)))
      {
        i = 0;
        break label46;
      }
      this.aPN.bk(str1);
      i = 1;
      break label46;
      label343:
      break;
      label345:
      paramIntent = c(paramContext, paramIntent);
    }
  }
  
  public final boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  public final boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    ComponentName localComponentName = paramIntent.getComponent();
    if ((localComponentName == null) || ((f.aNr) && ("com.google.android.gms".equals(localComponentName.getPackageName())))) {}
    for (boolean bool = false; bool; bool = u.l(paramContext, localComponentName.getPackageName())) {
      return false;
    }
    bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    if (bool) {
      a(paramContext, paramServiceConnection, paramString, paramIntent, 2);
    }
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/stats/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */