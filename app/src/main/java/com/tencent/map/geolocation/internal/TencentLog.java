package com.tencent.map.geolocation.internal;

import org.eclipse.jdt.annotation.NonNull;

public abstract interface TencentLog
{
  public static final String LOGNAME = "txwatchdog";
  public static final String PREFIX = "txwatchdog_";
  
  public abstract String getDirString();
  
  public abstract void println(String paramString1, int paramInt, @NonNull String paramString2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/map/geolocation/internal/TencentLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */