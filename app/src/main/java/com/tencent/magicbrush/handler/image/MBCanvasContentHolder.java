package com.tencent.magicbrush.handler.image;

import android.graphics.Bitmap;
import android.support.annotation.Keep;

@Keep
public class MBCanvasContentHolder
{
  public Bitmap content;
  public int height;
  public int width;
  
  @Keep
  public MBCanvasContentHolder(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    this.content = paramBitmap;
    this.width = paramInt1;
    this.height = paramInt2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/magicbrush/handler/image/MBCanvasContentHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */