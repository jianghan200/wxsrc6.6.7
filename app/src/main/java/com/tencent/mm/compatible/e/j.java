package com.tencent.mm.compatible.e;

import android.hardware.Camera;
import android.os.Build;
import com.tencent.mm.sdk.platformtools.bi;

final class j
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
      if (Build.DISPLAY.startsWith("Flyme"))
      {
        locala.bYE = 90;
        locala.ddt.setDisplayOrientation(90);
      }
      label150:
      for (;;)
      {
        return locala;
        int i;
        if (!Build.MODEL.equals("M9")) {
          i = -1;
        }
        for (;;)
        {
          if (i < 7093) {
            break label150;
          }
          locala.bYE = 90;
          locala.ddt.setDisplayOrientation(180);
          break;
          Object localObject = Build.DISPLAY;
          if (((String)localObject).substring(0, 0).equals("1"))
          {
            i = -1;
          }
          else
          {
            localObject = ((String)localObject).split("-");
            if ((localObject == null) || (localObject.length < 2)) {
              i = -1;
            } else {
              i = bi.getInt(localObject[1], 0);
            }
          }
        }
      }
      return null;
    }
    catch (Exception localException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/compatible/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */