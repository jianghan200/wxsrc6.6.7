package com.samsung.android.sdk;

import android.os.Build;

public class SsdkVendorCheck
{
  private static String strBrand = Build.BRAND;
  private static String strManufacturer = Build.MANUFACTURER;
  
  public static boolean isSamsungDevice()
  {
    if ((strBrand == null) || (strManufacturer == null)) {}
    while ((strBrand.compareToIgnoreCase("Samsung") != 0) && (strManufacturer.compareToIgnoreCase("Samsung") != 0)) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/samsung/android/sdk/SsdkVendorCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */