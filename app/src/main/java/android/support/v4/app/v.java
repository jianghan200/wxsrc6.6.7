package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.b;

public final class v
{
  private static final a pk = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      pk = new c();
      return;
    }
  }
  
  public static Intent a(Context paramContext, ComponentName paramComponentName)
  {
    String str = b(paramContext, paramComponentName);
    if (str == null) {
      return null;
    }
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    if (b(paramContext, paramComponentName) == null) {
      return b.makeMainActivity(paramComponentName);
    }
    return new Intent().setComponent(paramComponentName);
  }
  
  public static boolean a(Activity paramActivity, Intent paramIntent)
  {
    return pk.a(paramActivity, paramIntent);
  }
  
  public static Intent b(Activity paramActivity)
  {
    return pk.b(paramActivity);
  }
  
  public static String b(Context paramContext, ComponentName paramComponentName)
  {
    paramComponentName = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    return pk.a(paramContext, paramComponentName);
  }
  
  public static void b(Activity paramActivity, Intent paramIntent)
  {
    pk.b(paramActivity, paramIntent);
  }
  
  public static String c(Activity paramActivity)
  {
    try
    {
      paramActivity = b(paramActivity, paramActivity.getComponentName());
      return paramActivity;
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
      throw new IllegalArgumentException(paramActivity);
    }
  }
  
  static abstract interface a
  {
    public abstract String a(Context paramContext, ActivityInfo paramActivityInfo);
    
    public abstract boolean a(Activity paramActivity, Intent paramIntent);
    
    public abstract Intent b(Activity paramActivity);
    
    public abstract void b(Activity paramActivity, Intent paramIntent);
  }
  
  static class b
    implements v.a
  {
    public String a(Context paramContext, ActivityInfo paramActivityInfo)
    {
      if (paramActivityInfo.metaData == null) {
        paramActivityInfo = null;
      }
      String str;
      do
      {
        return paramActivityInfo;
        str = paramActivityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (str == null) {
          return null;
        }
        paramActivityInfo = str;
      } while (str.charAt(0) != '.');
      return paramContext.getPackageName() + str;
    }
    
    public boolean a(Activity paramActivity, Intent paramIntent)
    {
      paramActivity = paramActivity.getIntent().getAction();
      return (paramActivity != null) && (!paramActivity.equals("android.intent.action.MAIN"));
    }
    
    public Intent b(Activity paramActivity)
    {
      String str = v.c(paramActivity);
      if (str == null) {
        return null;
      }
      ComponentName localComponentName = new ComponentName(paramActivity, str);
      try
      {
        if (v.b(paramActivity, localComponentName) == null) {
          return b.makeMainActivity(localComponentName);
        }
        paramActivity = new Intent().setComponent(localComponentName);
        return paramActivity;
      }
      catch (PackageManager.NameNotFoundException paramActivity)
      {
        new StringBuilder("getParentActivityIntent: bad parentActivityName '").append(str).append("' in manifest");
      }
      return null;
    }
    
    public void b(Activity paramActivity, Intent paramIntent)
    {
      paramIntent.addFlags(67108864);
      paramActivity.startActivity(paramIntent);
      paramActivity.finish();
    }
  }
  
  static final class c
    extends v.b
  {
    public final String a(Context paramContext, ActivityInfo paramActivityInfo)
    {
      String str2 = paramActivityInfo.parentActivityName;
      String str1 = str2;
      if (str2 == null) {
        str1 = super.a(paramContext, paramActivityInfo);
      }
      return str1;
    }
    
    public final boolean a(Activity paramActivity, Intent paramIntent)
    {
      return paramActivity.shouldUpRecreateTask(paramIntent);
    }
    
    public final Intent b(Activity paramActivity)
    {
      Intent localIntent2 = paramActivity.getParentActivityIntent();
      Intent localIntent1 = localIntent2;
      if (localIntent2 == null) {
        localIntent1 = super.b(paramActivity);
      }
      return localIntent1;
    }
    
    public final void b(Activity paramActivity, Intent paramIntent)
    {
      paramActivity.navigateUpTo(paramIntent);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */