package com.tencent.mm.compatible.e;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  implements d.a
{
  public static d.a.a s(Context paramContext, int paramInt)
  {
    d.a.a locala = new d.a.a();
    locala.ddt = null;
    try
    {
      l = bi.VG();
      x.i("MicroMsg.CameraUtil", "ashu::begin to try Call Camera.open cameraID %d", new Object[] { Integer.valueOf(paramInt) });
      locala.ddt = Camera.open(paramInt);
      x.i("MicroMsg.CameraUtil", "ashu::Call Camera.open back, use %dms", new Object[] { Long.valueOf(bi.bI(l)) });
      if (locala.ddt == null)
      {
        x.e("MicroMsg.CameraUtil", "open camera error, not exception, but camera null");
        return null;
      }
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.CameraUtil", "open camera error %s", new Object[] { paramContext.getMessage() });
      x.printErrStackTrace("MicroMsg.CameraUtil", paramContext, "", new Object[0]);
      return null;
    }
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    long l = bi.VG();
    x.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.getCameraInfo cameraID %d", new Object[] { Integer.valueOf(paramInt) });
    Camera.getCameraInfo(paramInt, localCameraInfo);
    x.i("MicroMsg.CameraUtil", "ashu::Call Camera.getCameraInfo back, use %dms", new Object[] { Long.valueOf(bi.bI(l)) });
    switch (((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getRotation())
    {
    default: 
      paramInt = 0;
      if (localCameraInfo.facing != 1) {
        break;
      }
    }
    for (paramInt = (360 - localCameraInfo.orientation % 360) % 360;; paramInt = (localCameraInfo.orientation - paramInt + 360) % 360)
    {
      l = bi.VG();
      x.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.setDisplayOrientation %d", new Object[] { Integer.valueOf(paramInt) });
      locala.ddt.setDisplayOrientation(paramInt);
      x.i("MicroMsg.CameraUtil", "ashu::Call Camera.setDisplayOrientation back, use %dms", new Object[] { Long.valueOf(bi.bI(l)) });
      locala.bYE = localCameraInfo.orientation;
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
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/compatible/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */