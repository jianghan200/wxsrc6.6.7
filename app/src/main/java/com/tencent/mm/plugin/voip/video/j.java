package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.c.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.x;

public final class j
{
  public static h oVo;
  public static int oVp = -1;
  public static int oVq = -1;
  public static int oVr = 0;
  public static int oVs = 0;
  public static int oVt = 0;
  public static boolean oVu = true;
  
  public static boolean bMl()
  {
    return (!q.deM.dcL) || (q.deM.dcK != 8);
  }
  
  private static boolean bMm()
  {
    try
    {
      if (Class.forName("android.hardware.Camera").getDeclaredMethod("getNumberOfCameras", null) == null)
      {
        x.d("GetfcMethod", "GetfcMethod is null");
        return false;
      }
      return true;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.CameraUtil", "find getNumberOfCameras failed: " + localException.getMessage());
    }
    return false;
  }
  
  private static void bMn()
  {
    oVo.dcI = Camera.getNumberOfCameras();
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < oVo.dcI)
        {
          Camera.getCameraInfo(i, localCameraInfo);
          if (localCameraInfo.facing == 1)
          {
            oVp = i;
            oVo.oUa = localCameraInfo.orientation;
            oVo.oTY = true;
          }
          else if (localCameraInfo.facing == 0)
          {
            oVq = i;
            oVo.oUb = localCameraInfo.orientation;
            oVo.oTZ = true;
          }
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.CameraUtil", "get camera info error: %s", new Object[] { localException.getMessage() });
        String str = System.getProperty("ro.media.enc.camera.platform", null);
        boolean bool;
        if (str == null)
        {
          bool = false;
          if ((oVo.oUa == 270) || ((bool) && (oVo.oUa == 0)))
          {
            oVr = 1;
            if ((oVo.oUb != 270) && ((!bool) || (oVo.oUb != 0))) {
              continue;
            }
            oVs = 1;
          }
        }
        else
        {
          bool = str.equalsIgnoreCase("Mediatek");
          continue;
        }
        oVr = 0;
        continue;
        oVs = 0;
        return;
      }
      i += 1;
    }
  }
  
  public static void eq(Context paramContext)
  {
    if (oVo != null) {
      return;
    }
    oVo = new h("*");
    boolean bool = bMm();
    oVu = bool;
    if ((bool) && (!q.deM.dcJ))
    {
      bMn();
      if (q.deM.anb) {
        oVt = q.deM.dcM;
      }
      x.i("MicroMsg.CameraUtil", "gCameraNum:" + oVo.dcI + "\ngIsHasFrontCamera:" + oVo.oTY + "\ngIsHasBackCamera:" + oVo.oTZ + "\ngFrontCameraId:" + oVp + "\ngBackCameraId:" + oVq + "\ngBackOrientation:" + oVo.oUb + "\ngFrontOrientation:" + oVo.oUa + "\ngBestFps:" + oVo.oTX + "\ngFacePreviewSize:" + oVo.oUc + "\ngNonFacePreviewSize:" + oVo.oUd + "\ngFaceCameraIsRotate180:" + oVr + "\ngMainCameraIsRotate180:" + oVs + "\ngCameraFormat:" + oVt + "\ngFaceNotRotate:SDK:" + Build.VERSION.SDK_INT + "\n");
      return;
    }
    if ((oVu) && (q.deM.dcJ)) {
      bMn();
    }
    if (q.deM.dcJ) {
      oVo.dcI = q.deM.dcI;
    }
    if (q.deM.dcQ)
    {
      if (q.deM.dcP.ddp != 0) {
        oVo.oTZ = true;
      }
    }
    else {
      label324:
      if (q.deM.dcO) {
        if (q.deM.dcN.ddp == 0) {
          break label700;
        }
      }
    }
    label700:
    for (oVo.oTY = true;; oVo.oTY = false)
    {
      if ((q.deM.dcO) && (q.deM.dcN.ddq >= 0))
      {
        oVo.oUa = q.deM.dcN.ddq;
        oVr = oVo.oUa;
      }
      if ((q.deM.dcQ) && (q.deM.dcP.ddq >= 0))
      {
        oVo.oUb = q.deM.dcP.ddq;
        oVs = oVo.oUb;
      }
      if (q.deM.dcO)
      {
        if (oVo.oUc == null) {
          oVo.oUc = new Point(0, 0);
        }
        oVo.oUc = new Point(q.deM.dcN.width, q.deM.dcN.height);
      }
      if (q.deM.dcQ)
      {
        if (oVo.oUd == null) {
          oVo.oUd = new Point(0, 0);
        }
        oVo.oUd = new Point(q.deM.dcP.width, q.deM.dcP.height);
      }
      if ((q.deM.dcQ) && (q.deM.dcP.fps != 0)) {
        oVo.oTX = q.deM.dcP.fps;
      }
      if ((q.deM.dcO) && (q.deM.dcN.fps != 0)) {
        oVo.oTX = q.deM.dcN.fps;
      }
      paramContext = paramContext.getPackageManager();
      if ((q.deM.dcJ) || (paramContext.hasSystemFeature("android.hardware.camera"))) {
        break;
      }
      oVo.dcI = 0;
      oVo.oTY = false;
      oVo.oTZ = false;
      break;
      oVo.oTZ = false;
      break label324;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/video/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */