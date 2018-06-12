package com.tencent.mm.compatible.e;

import android.hardware.Camera;

final class e
  implements d.a
{
  public static d.a.a zg()
  {
    d.a.a locala = new d.a.a();
    try
    {
      locala.ddt = Camera.open();
      locala.bYE = 0;
      if (locala.ddt == null) {
        return null;
      }
      return locala;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/compatible/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */