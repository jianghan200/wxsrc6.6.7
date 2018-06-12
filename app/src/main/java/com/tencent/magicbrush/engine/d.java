package com.tencent.magicbrush.engine;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class d
{
  public MBRendererJNI bnF = new MBRendererJNI();
  
  public final void a(b paramb, Context paramContext, String paramString)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    this.bnF.Created(paramContext.getAssets(), paramString, localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels, localDisplayMetrics.density, true, paramb.bnA);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/engine/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */