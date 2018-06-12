package com.google.android.gms.c;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class t
{
  private static Pattern aXL = null;
  
  public static boolean ar(Context paramContext)
  {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
  }
  
  public static int dv(int paramInt)
  {
    return paramInt / 1000;
  }
  
  public static boolean dw(int paramInt)
  {
    return paramInt % 1000 / 100 == 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/c/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */