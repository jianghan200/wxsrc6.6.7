package com.tencent.magicbrush.engine;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.tencent.magicbrush.a.b;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;

class MBNativeHandlerJNI
{
  static
  {
    b.loadLibrary("mmv8");
    b.loadLibrary("magicbrush");
  }
  
  @Keep
  static native MBCanvasContentHolder nativeCaptureCanvasSnapshot(int paramInt);
  
  @Keep
  static native MBCanvasContentHolder nativeCaptureScreenshot();
  
  @Keep
  static native void nativeOnImageDecoded(String paramString, Bitmap paramBitmap);
  
  @Keep
  static native void nativeSetSDCardPath(boolean paramBoolean1, boolean paramBoolean2, String paramString);
  
  @Keep
  static native void nativeSetSecureCanvasModeEnable(boolean paramBoolean);
  
  @Keep
  static native void nativeSetV8Debug(boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/magicbrush/engine/MBNativeHandlerJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */