package com.tencent.mm.modelappbrand.b;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.c;

public final class f
  implements b.f
{
  public static final f dGr = new f();
  
  public final String Ke()
  {
    return "WxaIcon";
  }
  
  public final Bitmap o(Bitmap paramBitmap)
  {
    if ((paramBitmap.getWidth() <= 0) || (paramBitmap.getHeight() <= 0)) {
      return paramBitmap;
    }
    return c.a(paramBitmap, false, paramBitmap.getWidth() / 2, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelappbrand/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */