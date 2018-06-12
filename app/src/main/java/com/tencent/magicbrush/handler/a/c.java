package com.tencent.magicbrush.handler.a;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;

public abstract interface c
{
  public abstract boolean checkAndFlushClearSignal();
  
  public abstract int[] checkAndFlushDirtySignal();
  
  public abstract FloatBuffer drawText(String paramString);
  
  public abstract void enableStroke(boolean paramBoolean);
  
  public abstract Bitmap getBitmapAtlas();
  
  public abstract float getTextLineHeight(String paramString);
  
  public abstract void init(int paramInt1, int paramInt2);
  
  public abstract String loadFont(String paramString);
  
  public abstract float measureText(String paramString);
  
  public abstract void release();
  
  public abstract void setStrokeWidth(float paramFloat);
  
  public abstract void useFont(String paramString, float paramFloat, boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/magicbrush/handler/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */