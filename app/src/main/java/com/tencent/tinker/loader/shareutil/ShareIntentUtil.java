package com.tencent.tinker.loader.shareutil;

import android.content.Intent;
import java.io.Serializable;
import java.util.HashMap;

public class ShareIntentUtil
{
  public static void a(Intent paramIntent, int paramInt)
  {
    paramIntent.putExtra("intent_return_code", paramInt);
  }
  
  public static void a(Intent paramIntent, long paramLong)
  {
    paramIntent.putExtra("intent_patch_cost_time", paramLong);
  }
  
  public static void a(Intent paramIntent, ClassLoader paramClassLoader)
  {
    try
    {
      paramIntent.setExtrasClassLoader(paramClassLoader);
      return;
    }
    catch (Throwable paramIntent) {}
  }
  
  public static int aE(Intent paramIntent)
  {
    return p(paramIntent, "intent_return_code");
  }
  
  public static long aF(Intent paramIntent)
  {
    return paramIntent.getLongExtra("intent_patch_cost_time", 0L);
  }
  
  public static Throwable aG(Intent paramIntent)
  {
    paramIntent = o(paramIntent, "intent_patch_exception");
    if (paramIntent != null) {
      return (Throwable)paramIntent;
    }
    return null;
  }
  
  public static Throwable aH(Intent paramIntent)
  {
    paramIntent = o(paramIntent, "intent_patch_interpret_exception");
    if (paramIntent != null) {
      return (Throwable)paramIntent;
    }
    return null;
  }
  
  public static HashMap<String, String> aI(Intent paramIntent)
  {
    paramIntent = o(paramIntent, "intent_patch_dexes_path");
    if (paramIntent != null) {
      return (HashMap)paramIntent;
    }
    return null;
  }
  
  public static HashMap<String, String> aJ(Intent paramIntent)
  {
    paramIntent = o(paramIntent, "intent_patch_libs_path");
    if (paramIntent != null) {
      return (HashMap)paramIntent;
    }
    return null;
  }
  
  public static HashMap<String, String> aK(Intent paramIntent)
  {
    paramIntent = o(paramIntent, "intent_patch_package_config");
    if (paramIntent != null) {
      return (HashMap)paramIntent;
    }
    return null;
  }
  
  public static String j(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      return null;
    }
    try
    {
      paramIntent = paramIntent.getStringExtra(paramString);
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      new StringBuilder("getStringExtra exception:").append(paramIntent.getMessage());
    }
    return null;
  }
  
  public static Serializable o(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      return null;
    }
    try
    {
      paramIntent = paramIntent.getSerializableExtra(paramString);
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      new StringBuilder("getSerializableExtra exception:").append(paramIntent.getMessage());
    }
    return null;
  }
  
  private static int p(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      return 55536;
    }
    try
    {
      int i = paramIntent.getIntExtra(paramString, 55536);
      return i;
    }
    catch (Exception paramIntent)
    {
      new StringBuilder("getIntExtra exception:").append(paramIntent.getMessage());
    }
    return 55536;
  }
  
  public static boolean q(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      return false;
    }
    try
    {
      boolean bool = paramIntent.getBooleanExtra(paramString, false);
      return bool;
    }
    catch (Exception paramIntent)
    {
      new StringBuilder("getBooleanExtra exception:").append(paramIntent.getMessage());
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/shareutil/ShareIntentUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */