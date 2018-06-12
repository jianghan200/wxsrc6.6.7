package com.tencent.mm.plugin.facedetect.model;

import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public enum f
{
  private static ah iNw = new ah("face_process");
  public FaceDetectProcessService iNv = null;
  
  private f() {}
  
  public static void aJK()
  {
    iNw.cil().removeCallbacksAndMessages(null);
  }
  
  public static ag aJL()
  {
    return iNw.cil();
  }
  
  public static boolean aJM()
  {
    return ad.getContext().getPackageManager().hasSystemFeature("android.hardware.camera.front");
  }
  
  public static boolean aJN()
  {
    return o.aJW();
  }
  
  public static int aJQ()
  {
    return FaceProNative.engineVersion();
  }
  
  public static boolean eJ(boolean paramBoolean)
  {
    x.i("MicroMsg.FaceDetectManager", "alvinluo: face detect isCheckDynCfg: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    boolean bool1 = aJM();
    boolean bool2 = o.aJW();
    if (paramBoolean) {
      if (bi.getInt(((a)com.tencent.mm.kernel.g.l(a.class)).AT().getValue("BioSigFaceEntry"), 0) == 1)
      {
        paramBoolean = true;
        x.i("MicroMsg.FaceDetectManager", "hy: face config support: %b, hardware support: %b, isModelFileValid: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if ((!paramBoolean) || (!(bool1 & bool2))) {
          break label107;
        }
      }
    }
    label107:
    do
    {
      return true;
      paramBoolean = false;
      break;
      return false;
      x.i("MicroMsg.FaceDetectManager", "hy: hardware support: %b, isModelFileValid: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    } while ((bool2) && (bool1));
    return false;
  }
  
  public static void y(Runnable paramRunnable)
  {
    iNw.H(paramRunnable);
  }
  
  public final int aJO()
  {
    g localg = this.iNv.iPA;
    if (localg.iNy == null)
    {
      x.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
      return -3;
    }
    return localg.iNy.engineReleaseCurrMotion();
  }
  
  public final int aJP()
  {
    g localg = this.iNv.iPA;
    if (localg.iNy == null)
    {
      x.e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
      return -1;
    }
    return localg.iNy.engineGetCurrMotion();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */