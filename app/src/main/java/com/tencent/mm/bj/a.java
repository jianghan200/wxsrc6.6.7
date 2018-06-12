package com.tencent.mm.bj;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  public static boolean e(Context paramContext, String... paramVarArgs)
  {
    if (paramContext == null) {
      return false;
    }
    paramContext = fd(paramContext);
    int i = 0;
    while (i < 8)
    {
      String str = paramVarArgs[i];
      Integer localInteger = (Integer)paramContext.get(str);
      if (localInteger != null)
      {
        x.i("MicroMsg.ProcessOperator", "killProcess(pid : %s, process : %s)", new Object[] { localInteger, str });
        Process.killProcess(localInteger.intValue());
      }
      i += 1;
    }
    return true;
  }
  
  private static Map<String, Integer> fd(Context paramContext)
  {
    localHashMap = new HashMap();
    if (paramContext != null) {
      try
      {
        paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (paramContext.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
          localHashMap.put(localRunningAppProcessInfo.processName, Integer.valueOf(localRunningAppProcessInfo.pid));
        }
        return localHashMap;
      }
      catch (Exception paramContext)
      {
        x.printErrStackTrace("MicroMsg.ProcessOperator", paramContext, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/bj/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */