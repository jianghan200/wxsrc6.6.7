package com.samsung.android.sdk;

import android.content.Context;

public abstract interface SsdkInterface
{
  public abstract int getVersionCode();
  
  public abstract String getVersionName();
  
  public abstract void initialize(Context paramContext);
  
  public abstract boolean isFeatureEnabled(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/samsung/android/sdk/SsdkInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */