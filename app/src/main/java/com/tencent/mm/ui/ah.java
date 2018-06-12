package com.tencent.mm.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.ad;

public final class ah
{
  private static float scale = 0.0F;
  
  public static float fe(Context paramContext)
  {
    float f = paramContext.getSharedPreferences(ad.chY(), 0).getFloat("text_size_scale_key", 1.0F);
    scale = f;
    return f;
  }
  
  public static void g(Context paramContext, float paramFloat)
  {
    paramContext = paramContext.getSharedPreferences(ad.chY(), 0).edit();
    paramContext.putFloat("text_size_scale_key", paramFloat);
    paramContext.commit();
    scale = paramFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */