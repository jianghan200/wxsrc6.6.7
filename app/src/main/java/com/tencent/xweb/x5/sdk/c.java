package com.tencent.xweb.x5.sdk;

import android.content.Context;

public abstract interface c
{
  public abstract boolean getCanReboot();
  
  public abstract String getCrashExtraMessage(Context paramContext);
  
  public abstract int getTbsCoreVersion(Context paramContext);
  
  public abstract int getTbsSDKVersion(Context paramContext);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/xweb/x5/sdk/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */