package com.tencent.mm.compatible.e;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import com.tencent.mm.sdk.platformtools.x;

final class i
  implements d.a
{
  public static d.a.a fL(int paramInt)
  {
    d.a.a locala = new d.a.a();
    locala.ddt = null;
    try
    {
      locala.ddt = Camera.open(paramInt);
      if (locala.ddt == null) {
        return null;
      }
      locala.bYE = 0;
      x.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.hasVRInfo " + q.deM.dcR);
      x.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRFaceRotate " + q.deM.dcS);
      x.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRFaceDisplayOrientation " + q.deM.dcT);
      x.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRBackRotate " + q.deM.dcU);
      x.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRBackDisplayOrientation " + q.deM.dcV);
      if (getNumberOfCameras() > 1) {
        try
        {
          Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
          Camera.getCameraInfo(paramInt, localCameraInfo);
          x.d("CameraUtilImplConfig", "info.facing " + localCameraInfo.facing);
          if (localCameraInfo.facing == 1)
          {
            if ((q.deM.dcR) && (q.deM.dcS != -1)) {
              locala.bYE = q.deM.dcS;
            }
            if ((q.deM.dcR) && (q.deM.dcT != -1)) {
              locala.ddt.setDisplayOrientation(q.deM.dcT);
            }
          }
          else
          {
            if ((q.deM.dcR) && (q.deM.dcU != -1)) {
              locala.bYE = q.deM.dcU;
            }
            if ((q.deM.dcR) && (q.deM.dcV != -1)) {
              locala.ddt.setDisplayOrientation(q.deM.dcV);
            }
          }
        }
        catch (Exception localException2)
        {
          x.printErrStackTrace("CameraUtilImplConfig", localException2, "", new Object[0]);
        }
      }
      if ((q.deM.dcR) && (q.deM.dcU != -1)) {
        locala.bYE = q.deM.dcU;
      }
      if ((q.deM.dcR) && (q.deM.dcV != -1)) {
        locala.ddt.setDisplayOrientation(q.deM.dcV);
      }
    }
    catch (Exception localException1)
    {
      return null;
    }
    return localException1;
  }
  
  public static int getNumberOfCameras()
  {
    int i;
    if ((q.deM.dcX) && (q.deM.dcW != -1))
    {
      i = q.deM.dcW;
      x.d("CameraUtilImplConfig", "mVRCameraNum " + i);
    }
    int j;
    do
    {
      return i;
      j = d.getNumberOfCameras();
      x.d("CameraUtilImplConfig", "getNumberOfCameras " + j);
      i = j;
    } while (j > 1);
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/compatible/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */