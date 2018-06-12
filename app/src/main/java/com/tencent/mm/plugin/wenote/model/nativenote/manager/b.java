package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.sdk.platformtools.ad;

public abstract class b
{
  private static float qpM = Float.MAX_VALUE;
  private static float qpN = Float.MAX_VALUE;
  private static int qpO = -1;
  public static float qpP = 48.0F;
  
  public static int Bt(int paramInt)
  {
    return Math.round(paramInt * bZB());
  }
  
  public static int Bu(int paramInt)
  {
    return Math.round(paramInt / bZB());
  }
  
  private static float bZA()
  {
    try
    {
      if (qpM == Float.MAX_VALUE) {
        qpM = getDisplayMetrics().density;
      }
      float f = qpM;
      return f;
    }
    finally {}
  }
  
  private static float bZB()
  {
    try
    {
      if (qpN == Float.MAX_VALUE) {
        qpN = getDisplayMetrics().density * ad.getContext().getResources().getConfiguration().fontScale;
      }
      float f = qpN;
      return f;
    }
    finally {}
  }
  
  public static int bZC()
  {
    if (qpO == -1) {
      qpO = Math.round(bZA() * 30.0F);
    }
    return qpO;
  }
  
  private static DisplayMetrics getDisplayMetrics()
  {
    Display localDisplay = ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static float getTextSize()
  {
    return qpP;
  }
  
  public static void setTextSize(float paramFloat)
  {
    qpP = paramFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/manager/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */