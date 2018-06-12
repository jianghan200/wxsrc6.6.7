package com.tencent.map.geolocation;

import android.content.Context;
import c.t.m.g.eg;
import c.t.m.g.ei;

public class TencentLocationUtils
{
  private TencentLocationUtils()
  {
    throw new UnsupportedOperationException();
  }
  
  public static boolean contains(TencentLocation paramTencentLocation1, double paramDouble, TencentLocation paramTencentLocation2)
  {
    if ((paramTencentLocation1 == null) || (paramTencentLocation2 == null)) {
      throw new NullPointerException();
    }
    return distanceBetween(paramTencentLocation1, paramTencentLocation2) <= paramDouble;
  }
  
  public static double distanceBetween(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    return ei.a(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }
  
  public static double distanceBetween(TencentLocation paramTencentLocation1, TencentLocation paramTencentLocation2)
  {
    if ((paramTencentLocation1 == null) || (paramTencentLocation2 == null)) {
      throw new NullPointerException();
    }
    return ei.a(paramTencentLocation1.getLatitude(), paramTencentLocation1.getLongitude(), paramTencentLocation2.getLatitude(), paramTencentLocation2.getLongitude());
  }
  
  public static boolean isFromGps(TencentLocation paramTencentLocation)
  {
    if (paramTencentLocation == null) {
      return false;
    }
    return "gps".equals(paramTencentLocation.getProvider());
  }
  
  public static boolean isFromNetwork(TencentLocation paramTencentLocation)
  {
    if (paramTencentLocation == null) {
      return false;
    }
    return "network".equals(paramTencentLocation.getProvider());
  }
  
  public static boolean isSupportGps(Context paramContext)
  {
    if (paramContext == null) {
      throw new NullPointerException();
    }
    eg.a();
    return (eg.a(paramContext) & 0x10) == 0;
  }
  
  public static boolean wgs84ToGcj02(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if ((paramArrayOfDouble1 == null) || (paramArrayOfDouble2 == null) || (paramArrayOfDouble1.length != 2) || (paramArrayOfDouble2.length != 2)) {
      return false;
    }
    return ei.a(paramArrayOfDouble1, paramArrayOfDouble2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/map/geolocation/TencentLocationUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */