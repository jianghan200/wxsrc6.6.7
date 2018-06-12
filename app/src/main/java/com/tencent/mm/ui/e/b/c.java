package com.tencent.mm.ui.e.b;

import android.graphics.drawable.Drawable;

public final class c
{
  private static b utb = null;
  
  public static void a(b paramb)
  {
    utb = paramb;
  }
  
  public static Drawable gj(String paramString1, String paramString2)
  {
    if (utb != null)
    {
      paramString1 = utb.cq(paramString1, paramString2);
      if ((paramString1 instanceof Drawable)) {
        return (Drawable)paramString1;
      }
      return null;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/e/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */