package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class m
{
  private static final Object aOv = new Object();
  private static m aOw;
  
  public static m aj(Context paramContext)
  {
    synchronized (aOv)
    {
      if (aOw == null) {
        aOw = new n(paramContext.getApplicationContext());
      }
      return aOw;
    }
  }
  
  public abstract void a(ComponentName paramComponentName, ServiceConnection paramServiceConnection);
  
  public abstract void a(String paramString1, String paramString2, ServiceConnection paramServiceConnection);
  
  public abstract boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/common/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */