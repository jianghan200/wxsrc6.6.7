package com.tencent.recovery.option;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.recovery.ConstantsRecovery.DefaultProcessOptions;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.util.Util;

public class OptionFactory
{
  private static IOptionsCreator vhE;
  
  public static ProcessOptions dA(String paramString, int paramInt)
  {
    ProcessOptions localProcessOptions = null;
    if (vhE != null) {
      localProcessOptions = vhE.createProcessOptions(paramString, paramInt);
    }
    paramString = localProcessOptions;
    if (localProcessOptions == null)
    {
      RecoveryLog.i("Recovery.OptionFactory", "not found custom process options, use default %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt == 1) {
        paramString = ConstantsRecovery.DefaultProcessOptions.vgY;
      }
    }
    else
    {
      return paramString;
    }
    return ConstantsRecovery.DefaultProcessOptions.vgW;
  }
  
  public static CommonOptions hj(Context paramContext)
  {
    Object localObject1 = null;
    if (vhE != null) {
      localObject1 = vhE.createCommonOptions(paramContext);
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      RecoveryLog.i("Recovery.OptionFactory", "not found custom custom options, use default", new Object[0]);
      localObject1 = new CommonOptions.Builder();
      ((CommonOptions.Builder)localObject1).vhv = "";
      ((CommonOptions.Builder)localObject1).vhB = false;
      ((CommonOptions.Builder)localObject1).fMk = String.valueOf(Util.hl(paramContext));
    }
    try
    {
      ((CommonOptions.Builder)localObject1).clientVersion = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      ((CommonOptions.Builder)localObject1).vhC = 600000L;
      ((CommonOptions.Builder)localObject1).vhD = 600000L;
      localObject2 = ((CommonOptions.Builder)localObject1).cEZ();
      return (CommonOptions)localObject2;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/option/OptionFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */