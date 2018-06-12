package com.tencent.tinker.loader.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;

public class DefaultApplicationLike
  extends ApplicationLike
{
  private static final String TAG = "Tinker.DefaultAppLike";
  
  public DefaultApplicationLike(Application paramApplication, int paramInt, boolean paramBoolean, long paramLong1, long paramLong2, Intent paramIntent)
  {
    super(paramApplication, paramInt, paramBoolean, paramLong1, paramLong2, paramIntent);
  }
  
  public void onBaseContextAttached(Context paramContext) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    new StringBuilder("onConfigurationChanged:").append(paramConfiguration.toString());
  }
  
  public void onCreate() {}
  
  public void onLowMemory() {}
  
  public void onTerminate() {}
  
  public void onTrimMemory(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/app/DefaultApplicationLike.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */