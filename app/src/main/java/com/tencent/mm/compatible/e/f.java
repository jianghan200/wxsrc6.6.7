package com.tencent.mm.compatible.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

final class f
  implements d.a
{
  @TargetApi(8)
  public static d.a.a fL(int paramInt)
  {
    d.a.a locala = new d.a.a();
    try
    {
      locala.ddt = Camera.open();
      locala.bYE = 90;
      if (locala.ddt == null) {
        return null;
      }
      Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
      Camera.getCameraInfo(paramInt, localCameraInfo);
      switch (((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay().getRotation())
      {
      default: 
        paramInt = 0;
        if (localCameraInfo.facing != 1) {
          break;
        }
      }
      for (int i = (360 - (localCameraInfo.orientation + paramInt) % 360) % 360;; i = (localCameraInfo.orientation - paramInt + 360) % 360)
      {
        x.d("MicroMsg.CameraUtil.CameraUtilImpl22", "CameraUtilImpl22, open camera, info.orientation: %d, degrees: %d, result:%d", new Object[] { Integer.valueOf(localCameraInfo.orientation), Integer.valueOf(paramInt), Integer.valueOf(i) });
        locala.ddt.setDisplayOrientation(i);
        return locala;
        paramInt = 0;
        break;
        paramInt = 90;
        break;
        paramInt = 180;
        break;
        paramInt = 270;
        break;
      }
      return null;
    }
    catch (Exception localException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/compatible/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */