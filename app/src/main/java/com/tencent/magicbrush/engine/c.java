package com.tencent.magicbrush.engine;

import android.graphics.Bitmap;
import android.os.Environment;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;
import java.io.File;

public final class c
{
  public static String bnC = Environment.getExternalStorageDirectory().getAbsolutePath();
  public static String bnD = "/tencent/MicroMsg/AppBrandGame";
  public static String bnE = bnC + bnD;
  
  public static void aC(boolean paramBoolean)
  {
    MBNativeHandlerJNI.nativeSetV8Debug(paramBoolean);
  }
  
  public static void b(String paramString, Bitmap paramBitmap)
  {
    MBNativeHandlerJNI.nativeOnImageDecoded(paramString, paramBitmap);
  }
  
  public static MBCanvasContentHolder ek(int paramInt)
  {
    return MBNativeHandlerJNI.nativeCaptureCanvasSnapshot(paramInt);
  }
  
  public static MBCanvasContentHolder tc()
  {
    return MBNativeHandlerJNI.nativeCaptureScreenshot();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/magicbrush/engine/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */