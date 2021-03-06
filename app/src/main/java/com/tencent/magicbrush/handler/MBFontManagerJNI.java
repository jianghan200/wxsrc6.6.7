package com.tencent.magicbrush.handler;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.tencent.magicbrush.handler.a.a;
import com.tencent.magicbrush.handler.a.b;
import com.tencent.magicbrush.handler.a.c;
import com.tencent.magicbrush.handler.a.i;
import java.nio.FloatBuffer;

public class MBFontManagerJNI
{
  private static c sMBFontManager;
  
  @Keep
  public static boolean checkAndFlushClearSignal()
  {
    if (sMBFontManager == null) {
      return false;
    }
    sMBFontManager.checkAndFlushClearSignal();
    return true;
  }
  
  @Keep
  public static int[] checkAndFlushDirtySignal()
  {
    if (sMBFontManager == null) {
      return null;
    }
    return sMBFontManager.checkAndFlushDirtySignal();
  }
  
  @Keep
  public static FloatBuffer drawText(String paramString)
  {
    if (sMBFontManager == null) {
      return null;
    }
    return sMBFontManager.drawText(paramString);
  }
  
  @Keep
  public static void enableStroke(boolean paramBoolean)
  {
    if (sMBFontManager == null) {
      return;
    }
    sMBFontManager.enableStroke(paramBoolean);
  }
  
  @Keep
  public static Bitmap getBitmapAtlas()
  {
    if (sMBFontManager == null) {
      return null;
    }
    return sMBFontManager.getBitmapAtlas();
  }
  
  @Keep
  public static float getTextLineHeight(String paramString)
  {
    if (sMBFontManager == null) {
      return 0.0F;
    }
    return sMBFontManager.getTextLineHeight(paramString);
  }
  
  @Keep
  public static void init(int paramInt1, int paramInt2)
  {
    if (sMBFontManager == null) {
      return;
    }
    sMBFontManager.init(paramInt1, paramInt2);
  }
  
  @Keep
  public static String loadFont(String paramString)
  {
    if (sMBFontManager == null) {
      return null;
    }
    return sMBFontManager.loadFont(paramString);
  }
  
  @Keep
  public static float measureText(String paramString)
  {
    if (sMBFontManager == null) {
      return 0.0F;
    }
    return sMBFontManager.measureText(paramString);
  }
  
  public static void registerFontManager(b paramb, a parama)
  {
    sMBFontManager = new i(paramb, parama);
  }
  
  @Keep
  public static void release()
  {
    if (sMBFontManager == null) {
      return;
    }
    sMBFontManager.release();
  }
  
  @Keep
  public static void setStrokeWidth(float paramFloat)
  {
    if (sMBFontManager == null) {
      return;
    }
    sMBFontManager.setStrokeWidth(paramFloat);
  }
  
  @Keep
  public static void useFont(String paramString, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (sMBFontManager == null) {
      return;
    }
    sMBFontManager.useFont(paramString, paramFloat, paramBoolean1, paramBoolean2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/magicbrush/handler/MBFontManagerJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */