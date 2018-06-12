package com.tencent.magicbrush.handler;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.tencent.magicbrush.handler.image.b;

public class MBImageHandlerJNI
{
  private static b sProxy;
  
  @Keep
  public static Bitmap getBitmap(int paramInt1, int paramInt2)
  {
    if (sProxy == null) {
      throw new IllegalStateException("ImageHandler not impl");
    }
    return sProxy.getBitmap(paramInt1, paramInt2);
  }
  
  @Keep
  public static void init()
  {
    sProxy.init();
  }
  
  @Keep
  public static void loadBitmapAsync(String paramString)
  {
    if (sProxy == null) {
      throw new IllegalStateException("ImageHandler not impl");
    }
    sProxy.loadBitmapAsync(paramString);
  }
  
  @Keep
  public static Bitmap loadBitmapSync(String paramString)
  {
    if (sProxy == null) {
      throw new IllegalStateException("ImageHandler not impl");
    }
    return sProxy.loadBitmapSync(paramString);
  }
  
  public static void register(b paramb)
  {
    sProxy = paramb;
  }
  
  @Keep
  public static void release()
  {
    sProxy.release();
  }
  
  @Keep
  public static void releaseBitmap(Bitmap paramBitmap)
  {
    if (sProxy == null) {
      throw new IllegalStateException("ImageHandler not impl");
    }
    sProxy.releaseBitmap(paramBitmap);
  }
  
  @Keep
  public static String toDataURL(Bitmap paramBitmap, String paramString, float paramFloat)
  {
    if (sProxy == null) {
      throw new IllegalStateException("ImageHandler not impl");
    }
    return sProxy.toDataURL(paramBitmap, paramString, paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/magicbrush/handler/MBImageHandlerJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */