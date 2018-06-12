package com.tencent.mm.plugin.facedetect.model;

import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
{
  public FaceProNative iNy = null;
  
  public final FaceProNative.FaceResult aJR()
  {
    if (this.iNy == null)
    {
      x.e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
      return null;
    }
    try
    {
      long l = bi.VG();
      FaceProNative.FaceResult localFaceResult = this.iNy.engineReleaseOut();
      x.i("MicroMsg.FaceDetectNativeManager", "hy: uninitialize result : %d, using: %d ms", new Object[] { Integer.valueOf(localFaceResult.result), Long.valueOf(bi.VG() - l) });
      this.iNy = null;
      return localFaceResult;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.FaceDetectNativeManager", localThrowable, "hy: face lib release crash!!!", new Object[0]);
      this.iNy.engineRelease();
      this.iNy = null;
    }
    return null;
  }
  
  public final int aJS()
  {
    if (this.iNy == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.v("MicroMsg.FaceDetectNativeManager", "alvinluo cutDown sFaceProNative == null: %b", new Object[] { Boolean.valueOf(bool) });
      if (this.iNy != null) {
        break;
      }
      x.e("MicroMsg.FaceDetectNativeManager", "hy: reelase not init");
      return -101;
    }
    int i = this.iNy.engineRelease();
    x.i("MicroMsg.FaceDetectNativeManager", "hy: cut down result: %d", new Object[] { Integer.valueOf(i) });
    this.iNy = null;
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */