package com.tencent.recovery;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryData;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.service.RecoveryHandleService;
import com.tencent.recovery.service.RecoveryReportService;
import com.tencent.recovery.service.RecoveryUploadService;
import com.tencent.recovery.util.Util;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecoveryLogic
{
  public static Field vhh = null;
  public static int vhi = 17;
  
  public static void a(Context paramContext, ArrayList<RecoveryHandleItem> paramArrayList, String paramString)
  {
    RecoveryLog.i("Recovery.RecoveryLogic", "startReportService %s", new Object[] { "HandleStatus" });
    Intent localIntent = new Intent(paramContext, RecoveryReportService.class);
    localIntent.putExtra("KeyReportType", "HandleStatus");
    localIntent.putExtra("KeyReportUploadClassName", paramString);
    localIntent.putParcelableArrayListExtra("KeyReportItem", paramArrayList);
    paramContext.startService(localIntent);
  }
  
  public static boolean a(Context paramContext, CommonOptions paramCommonOptions, RecoveryContext paramRecoveryContext)
  {
    if (paramCommonOptions.vhz == null)
    {
      RecoveryLog.i("Recovery.RecoveryLogic", "startRecoveryProcess not set handle service", new Object[0]);
      return false;
    }
    RecoveryLog.i("Recovery.RecoveryLogic", "startHandleService %s", new Object[] { Util.hm(paramContext) });
    String str1;
    if (Util.oW(paramCommonOptions.vhA))
    {
      str1 = RecoveryUploadService.class.getName();
      if (!Util.oW(paramCommonOptions.vhz)) {
        break label185;
      }
    }
    label185:
    for (String str2 = RecoveryHandleService.class.getName();; str2 = paramCommonOptions.vhz)
    {
      RecoveryData localRecoveryData = new RecoveryData();
      localRecoveryData.processName = Util.hm(paramContext);
      localRecoveryData.fMk = paramCommonOptions.fMk;
      localRecoveryData.vhv = paramCommonOptions.vhv;
      localRecoveryData.vhw = paramRecoveryContext.vhg;
      localRecoveryData.clientVersion = paramCommonOptions.clientVersion;
      paramRecoveryContext = new Intent();
      paramRecoveryContext.setClassName(paramContext, paramCommonOptions.vhz);
      paramRecoveryContext.putExtra("KeyReportUploadClassName", str1);
      paramRecoveryContext.putExtra("KeyReportHandleClassName", str2);
      paramRecoveryContext.putExtra("KeyRecoveryData", localRecoveryData);
      paramContext.startService(paramRecoveryContext);
      return true;
      str1 = paramCommonOptions.vhA;
      break;
    }
  }
  
  public static int bG(Context paramContext, String paramString)
  {
    if (vhi != 17) {
      return vhi;
    }
    vhi = 16;
    if (vhh == null) {}
    try
    {
      vhh = ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
      if (vhh != null) {
        paramContext = (ActivityManager)paramContext.getSystemService("activity");
      }
      for (;;)
      {
        Iterator localIterator2;
        try
        {
          paramContext = paramContext.getRunningAppProcesses();
          if ((paramContext == null) || (paramContext.isEmpty()))
          {
            RecoveryLog.i("Recovery.RecoveryLogic", "can not get running app process", new Object[0]);
            return vhi;
          }
        }
        catch (Exception paramContext)
        {
          paramContext = null;
          continue;
          localIterator2 = paramContext.iterator();
        }
        do
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
          do
          {
            if (!localIterator2.hasNext()) {
              break;
            }
            localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator2.next();
          } while ((localRunningAppProcessInfo == null) || (localRunningAppProcessInfo.importance != 100) || (localRunningAppProcessInfo.importanceReasonCode != 0));
          try
          {
            int i = vhh.getInt(localRunningAppProcessInfo);
            localObject1 = Integer.valueOf(i);
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              Object localObject1;
              localIterator1 = null;
            }
            paramString = new StringBuffer();
            Iterator localIterator1 = paramContext.iterator();
            while (localIterator1.hasNext())
            {
              localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator1.next();
              if (localRunningAppProcessInfo != null) {
                paramString.append(localRunningAppProcessInfo.processName + ":" + localRunningAppProcessInfo.importance + " ");
              }
            }
            RecoveryLog.i("Recovery.RecoveryLogic", "foregroundInfo is null %s %s", new Object[] { Integer.valueOf(paramContext.size()), paramString.toString() });
          }
        } while ((localObject1 == null) || (((Integer)localObject1).intValue() != 2));
        localObject1 = localRunningAppProcessInfo;
        if (localObject1 != null)
        {
          RecoveryLog.i("Recovery.RecoveryLogic", "%s %s", new Object[] { paramString, ((ActivityManager.RunningAppProcessInfo)localObject1).processName });
          if (!paramString.equals(((ActivityManager.RunningAppProcessInfo)localObject1).processName)) {
            continue;
          }
          vhi = 1;
        }
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        continue;
        Object localObject2 = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/RecoveryLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */