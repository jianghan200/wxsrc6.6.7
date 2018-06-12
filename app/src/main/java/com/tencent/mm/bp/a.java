package com.tencent.mm.bp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private static float density = -1.0F;
  private static a sCx = null;
  private static SparseIntArray sCy = new SparseIntArray();
  private static float scale = 0.0F;
  
  public static ColorStateList ac(Context paramContext, int paramInt)
  {
    if (sCx == null)
    {
      if (paramContext == null)
      {
        x.e("MicroMsg.ResourceHelper", "get color state list, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        return null;
      }
      return paramContext.getResources().getColorStateList(paramInt);
    }
    return sCx.cgA();
  }
  
  public static int ad(Context paramContext, int paramInt)
  {
    float f1 = 1.625F;
    float f2 = scale;
    if (f2 > 1.625F) {}
    for (;;)
    {
      if (sCx == null)
      {
        if (paramContext == null)
        {
          x.e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
          return 0;
        }
        j = sCy.get(paramInt, 0);
        i = j;
        if (j == 0)
        {
          i = paramContext.getResources().getDimensionPixelSize(paramInt);
          sCy.put(paramInt, i);
        }
        return (int)(f1 * i);
      }
      int j = sCy.get(paramInt, 0);
      int i = j;
      if (j == 0)
      {
        i = sCx.cgC();
        sCy.put(paramInt, i);
      }
      return (int)(f1 * i);
      f1 = f2;
    }
  }
  
  public static int ae(Context paramContext, int paramInt)
  {
    int i = 0;
    if (sCx == null) {
      if (paramContext == null) {
        x.e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
      }
    }
    int j;
    do
    {
      do
      {
        return i;
        j = sCy.get(paramInt, 0);
        i = j;
      } while (j != 0);
      i = paramContext.getResources().getDimensionPixelSize(paramInt);
      sCy.put(paramInt, i);
      return i;
      j = sCy.get(paramInt, 0);
      i = j;
    } while (j != 0);
    i = sCx.cgC();
    sCy.put(paramInt, i);
    return i;
  }
  
  public static String af(Context paramContext, int paramInt)
  {
    if (sCx == null)
    {
      if (paramContext == null)
      {
        x.e("MicroMsg.ResourceHelper", "get string, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        return "";
      }
      return paramContext.getResources().getString(paramInt);
    }
    return sCx.cgD();
  }
  
  public static int ag(Context paramContext, int paramInt)
  {
    return Math.round(paramInt / getDensity(paramContext));
  }
  
  public static Drawable f(Context paramContext, int paramInt)
  {
    if (sCx == null)
    {
      if (paramContext == null)
      {
        x.e("MicroMsg.ResourceHelper", "get drawable, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        return null;
      }
      return paramContext.getResources().getDrawable(paramInt);
    }
    return sCx.cgB();
  }
  
  public static float fe(Context paramContext)
  {
    if (scale == 0.0F) {
      if (paramContext != null) {
        break label20;
      }
    }
    label20:
    for (scale = 1.0F;; scale = paramContext.getSharedPreferences(ad.chY(), 0).getFloat("text_size_scale_key", 1.0F)) {
      return scale;
    }
  }
  
  public static int ff(Context paramContext)
  {
    int j = 2;
    float f = fe(paramContext);
    int i;
    if (f == 0.875F) {
      i = 1;
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (f == 1.0F);
      if (f == 1.125F) {
        return 3;
      }
      if (f == 1.25F) {
        return 4;
      }
      if (f == 1.375F) {
        return 5;
      }
      if (f == 1.625F) {
        return 6;
      }
      if (f == 1.875F) {
        return 7;
      }
      i = j;
    } while (f != 2.025F);
    return 8;
  }
  
  public static float fg(Context paramContext)
  {
    float f = 1.0F;
    if (fi(paramContext)) {
      f = 1.3F;
    }
    return f;
  }
  
  public static float fh(Context paramContext)
  {
    float f = 1.0F;
    if (fi(paramContext)) {
      f = 1.2F;
    }
    return f;
  }
  
  public static boolean fi(Context paramContext)
  {
    float f = fe(paramContext);
    scale = f;
    return Float.compare(f, 1.125F) > 0;
  }
  
  public static boolean fj(Context paramContext)
  {
    float f = fe(paramContext);
    scale = f;
    return f == 0.875F;
  }
  
  public static int fk(Context paramContext)
  {
    if (sCx == null)
    {
      if (paramContext == null) {
        x.e("MicroMsg.ResourceHelper", "get widthPixels but context is null");
      }
    }
    else {
      return 0;
    }
    return paramContext.getResources().getDisplayMetrics().widthPixels;
  }
  
  public static int fl(Context paramContext)
  {
    if (sCx == null)
    {
      if (paramContext == null) {
        x.e("MicroMsg.ResourceHelper", "get heightPixels but context is null");
      }
    }
    else {
      return 0;
    }
    return paramContext.getResources().getDisplayMetrics().heightPixels;
  }
  
  public static int fromDPToPix(Context paramContext, int paramInt)
  {
    return Math.round(getDensity(paramContext) * paramInt);
  }
  
  public static int g(Context paramContext, int paramInt)
  {
    if (sCx == null)
    {
      if (paramContext == null)
      {
        x.e("MicroMsg.ResourceHelper", "get color, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        return 0;
      }
      return paramContext.getResources().getColor(paramInt);
    }
    return sCx.cgz();
  }
  
  public static void g(Context paramContext, float paramFloat)
  {
    paramContext = paramContext.getSharedPreferences(ad.chY(), 0).edit();
    paramContext.putFloat("text_size_scale_key", paramFloat);
    paramContext.commit();
    scale = paramFloat;
  }
  
  public static float getDensity(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    if (density < 0.0F) {
      density = localContext.getResources().getDisplayMetrics().density;
    }
    return density;
  }
  
  public static abstract interface a
  {
    public abstract ColorStateList cgA();
    
    public abstract Drawable cgB();
    
    public abstract int cgC();
    
    public abstract String cgD();
    
    public abstract int cgz();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bp/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */