package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

final class h
{
  public static int version()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      new StringBuilder("Invalid version number: ").append(Build.VERSION.SDK);
      m.rb();
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/tagmanager/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */