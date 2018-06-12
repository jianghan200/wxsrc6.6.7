package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

class TbsLinuxToolsJni
{
  private static boolean a = false;
  private static boolean b = false;
  
  public TbsLinuxToolsJni(Context paramContext)
  {
    a(paramContext);
  }
  
  private native int ChmodInner(String paramString1, String paramString2);
  
  private void a(Context paramContext)
  {
    label37:
    label158:
    try
    {
      if (b) {
        return;
      }
      b = true;
    }
    finally {}
    try
    {
      if (TbsShareManager.isThirdPartyApp(paramContext))
      {
        localObject1 = TbsShareManager.a();
        if (localObject1 != null) {
          break label187;
        }
        localObject1 = TbsShareManager.c(paramContext);
      }
    }
    catch (Throwable paramContext)
    {
      a = false;
      break label158;
      break label37;
    }
    for (Object localObject1 = new File((String)localObject1);; localObject1 = an.a().q(paramContext))
    {
      if (localObject1 != null)
      {
        Object localObject2 = localObject1;
        if (!new File(((File)localObject1).getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so").exists())
        {
          localObject2 = localObject1;
          if (!TbsShareManager.isThirdPartyApp(paramContext)) {
            localObject2 = an.a().p(paramContext);
          }
        }
        if (localObject2 != null)
        {
          System.load(((File)localObject2).getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
          a = true;
        }
      }
      ChmodInner("/checkChmodeExists", "700");
      return;
    }
  }
  
  public int a(String paramString1, String paramString2)
  {
    if (!a)
    {
      TbsLog.e("TbsLinuxToolsJni", "jni not loaded!", true);
      return -1;
    }
    return ChmodInner(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/smtt/sdk/TbsLinuxToolsJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */