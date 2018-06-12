package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.mm.bp.a;

public class t
{
  private static int sFQ = -1;
  public static int sFR = -1;
  private static boolean sFS = false;
  private static int sFT = -1;
  private static int sFU = -1;
  
  public static int S(Activity paramActivity)
  {
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    return localRect.top;
  }
  
  public static final boolean ak(Context paramContext, int paramInt)
  {
    if (sFQ == paramInt) {
      return true;
    }
    if (!fB(paramContext)) {
      return false;
    }
    if (paramInt < 0) {
      return false;
    }
    sFQ = paramInt;
    x.d("MicroMsg.KeyBordUtil", "save keybord: %d", new Object[] { Integer.valueOf(paramInt) });
    return ad.chZ().edit().putInt("com.tencent.mm.compatible.util.keybord.height", paramInt).commit();
  }
  
  public static final int al(Context paramContext, int paramInt)
  {
    int k = fz(paramContext);
    int i;
    int j;
    if (!fC(paramContext))
    {
      i = (int)(k / 1.5D);
      j = db(paramContext)[0];
      paramInt = i;
      if (i > j / 2) {
        paramInt = j / 2;
      }
    }
    do
    {
      return paramInt;
      i = paramInt;
      if (paramInt <= 0) {
        i = s(paramContext, true);
      }
      j = fy(paramContext);
      paramInt = j;
    } while (i > j);
    if (i < k) {
      return k;
    }
    return i;
  }
  
  public static void chB()
  {
    sFS = false;
  }
  
  public static int[] db(Context paramContext)
  {
    if (paramContext == null) {
      paramContext = ad.getContext();
    }
    for (;;)
    {
      int[] arrayOfInt = new int[2];
      if ((paramContext instanceof Activity))
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        arrayOfInt[0] = localDisplayMetrics.widthPixels;
        arrayOfInt[1] = localDisplayMetrics.heightPixels;
        return arrayOfInt;
      }
      paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = paramContext.getWidth();
      arrayOfInt[1] = paramContext.getHeight();
      return arrayOfInt;
    }
  }
  
  public static final int fA(Context paramContext)
  {
    return al(paramContext, -1);
  }
  
  private static final boolean fB(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    return localContext != null;
  }
  
  public static boolean fC(Context paramContext)
  {
    paramContext = db(paramContext);
    if (paramContext[0] < paramContext[1]) {}
    for (int i = 1; i == 1; i = 2) {
      return true;
    }
    return false;
  }
  
  public static final int fx(Context paramContext)
  {
    if (!sFS)
    {
      if (!fB(paramContext)) {
        return ad.chZ().getInt("com.tencent.mm.compatible.util.keybord.height", 690);
      }
      int i = ad.chZ().getInt("com.tencent.mm.compatible.util.keybord.height", a.fromDPToPix(paramContext, 230));
      sFQ = i;
      return i;
    }
    return fz(paramContext);
  }
  
  public static final int fy(Context paramContext)
  {
    if (!sFS)
    {
      if (sFT > 0) {
        return sFT;
      }
      if (!fB(paramContext)) {
        return 1140;
      }
      int i = a.fromDPToPix(paramContext, 380);
      sFT = i;
      return i;
    }
    return fz(paramContext);
  }
  
  public static final int fz(Context paramContext)
  {
    if (sFU > 0) {
      return sFU;
    }
    if (!fB(paramContext)) {
      return sFU * 3;
    }
    int i = a.fromDPToPix(paramContext, 230);
    sFU = i;
    return i;
  }
  
  public static final int s(Context paramContext, boolean paramBoolean)
  {
    if (!sFS)
    {
      if ((sFQ > 0) && (paramBoolean)) {
        return sFQ;
      }
      return fx(paramContext);
    }
    return fz(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */