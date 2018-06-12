package com.tencent.mm.svg;

import android.graphics.Canvas;
import com.tencent.mm.svg.b.b;

public class WeChatSVG
{
  static
  {
    if (b.com())
    {
      System.loadLibrary("wechatsvg");
      nativeInit();
    }
  }
  
  public static native float[] getViewPort(long paramLong);
  
  private static native void nativeInit();
  
  public static native long parse(String paramString);
  
  public static native void release(long paramLong);
  
  public static native int render(long paramLong, Canvas paramCanvas);
  
  public static native int renderViewPort(long paramLong, Canvas paramCanvas, float paramFloat1, float paramFloat2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/svg/WeChatSVG.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */