package com.tencent.mm.ui.e.a;

import android.widget.ImageView;

public final class a
{
  private static b uta = null;
  
  public static void a(ImageView paramImageView, String paramString)
  {
    if (uta != null) {
      uta.a(paramImageView, paramString);
    }
  }
  
  public static void a(b paramb)
  {
    uta = paramb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */