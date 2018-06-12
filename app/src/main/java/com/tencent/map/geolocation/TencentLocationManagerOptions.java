package com.tencent.map.geolocation;

import android.text.TextUtils;

public class TencentLocationManagerOptions
{
  private static boolean a = true;
  private static String b = "";
  
  public static String getKey()
  {
    return b;
  }
  
  public static boolean isLoadLibraryEnabled()
  {
    return a;
  }
  
  public static boolean setKey(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    b = paramString;
    return true;
  }
  
  public static void setLoadLibraryEnabled(boolean paramBoolean)
  {
    a = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/map/geolocation/TencentLocationManagerOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */