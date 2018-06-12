package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.tencent.mm.modelappbrand.b.b.f;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.page.o;

final class j
  implements g
{
  public final Bitmap a(String paramString1, String paramString2, Rect paramRect, g.a parama)
  {
    if (paramRect != null) {}
    for (a locala = new a(paramRect.left, paramRect.top, paramRect.width(), paramRect.height());; locala = null)
    {
      if (paramString2.startsWith("wxfile://"))
      {
        paramString1 = AppBrandLocalMediaObjectManager.getItemByLocalId(paramString1, paramString2);
        if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.dDG))) {
          return null;
        }
        paramString2 = paramString1.dDG;
        paramString1 = paramString2;
        if (!paramString2.startsWith("file://")) {
          paramString1 = "file://" + paramString2;
        }
        paramString1 = com.tencent.mm.modelappbrand.b.b.Ka().a(paramString1, locala);
      }
      for (;;)
      {
        return paramString1;
        if ((paramString2.startsWith("https://")) || (paramString2.startsWith("http://")))
        {
          paramRect = com.tencent.mm.modelappbrand.b.b.Ka().a(paramString2, locala);
          if (paramRect == null)
          {
            com.tencent.mm.modelappbrand.b.b.Ka().a(new j.1(this, parama, paramString1, paramString2), paramString2, null, locala);
            paramString1 = paramRect;
          }
        }
        else
        {
          paramString2 = o.j(com.tencent.mm.plugin.appbrand.a.pY(paramString1), paramString2);
          paramString1 = paramString2;
          if (paramRect == null) {
            continue;
          }
          paramString1 = new b(paramRect.left, paramRect.top, paramRect.width(), paramRect.height()).o(paramString2);
          continue;
        }
        paramString1 = paramRect;
      }
    }
  }
  
  public final Bitmap a(String paramString1, String paramString2, g.a parama)
  {
    return a(paramString1, paramString2, null, parama);
  }
  
  public final Bitmap aY(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */