package com.tencent.magicbrush.handler.image;

import android.graphics.Bitmap;

public abstract interface b
{
  public abstract Bitmap getBitmap(int paramInt1, int paramInt2);
  
  public abstract void init();
  
  public abstract void loadBitmapAsync(String paramString);
  
  public abstract Bitmap loadBitmapSync(String paramString);
  
  public abstract void release();
  
  public abstract void releaseBitmap(Bitmap paramBitmap);
  
  public abstract String toDataURL(Bitmap paramBitmap, String paramString, float paramFloat);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/handler/image/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */