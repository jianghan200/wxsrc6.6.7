package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.modelappbrand.b.b;
import com.tencent.mm.modelappbrand.b.b.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.canvas.g;
import com.tencent.mm.plugin.appbrand.canvas.g.a;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;

final class c
  implements g
{
  public final Bitmap a(final String paramString1, final String paramString2, Rect paramRect, final g.a parama)
  {
    if (paramString2.startsWith("wxfile://"))
    {
      paramString1 = AppBrandLocalMediaObjectManager.getItemByLocalId(paramString1, paramString2);
      if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.dDG))) {
        paramRect = null;
      }
    }
    Bitmap localBitmap;
    do
    {
      return paramRect;
      paramString2 = paramString1.dDG;
      paramString1 = paramString2;
      if (!paramString2.startsWith("file://")) {
        paramString1 = "file://" + paramString2;
      }
      return b.Ka().a(paramString1, null);
      if ((!paramString2.startsWith("https://")) && (!paramString2.startsWith("http://"))) {
        break;
      }
      localBitmap = b.Ka().a(paramString2, null);
      paramRect = localBitmap;
    } while (localBitmap != null);
    b.Ka().a(new b.h()
    {
      public final void Kc() {}
      
      public final void Kd()
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("id", paramString1);
        localBundle.putInt("widgetState", 2103);
        f.a(i.aeT().sz(paramString1), localBundle, f.a.class, null);
      }
      
      public final String Ke()
      {
        return "WxaWidgetIcon";
      }
      
      public final void n(Bitmap paramAnonymousBitmap)
      {
        if ((parama == null) || (paramAnonymousBitmap == null) || (paramAnonymousBitmap.isRecycled())) {
          return;
        }
        parama.adn();
      }
    }, paramString2, null, null);
    return localBitmap;
    return a.aY(paramString1, paramString2);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */