package com.tencent.mm.plugin.appbrand.q;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.mm.sdk.platformtools.ad;

public final class m
{
  private static DisplayMetrics gBr = ad.getContext().getResources().getDisplayMetrics();
  
  public static int aos()
  {
    if (gBr == null) {
      return 16;
    }
    return (int)(gBr.density * 16.0F);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */