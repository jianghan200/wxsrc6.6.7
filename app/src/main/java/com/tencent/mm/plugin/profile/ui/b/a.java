package com.tencent.mm.plugin.profile.ui.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;

public final class a
  extends BitmapDrawable
  implements y.a
{
  private String url;
  
  public a(Resources paramResources, String paramString) {}
  
  public final void draw(Canvas paramCanvas)
  {
    Object localObject2 = y.a(new a.1(this));
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (!((Bitmap)localObject2).isRecycled()) {}
    }
    else
    {
      localObject1 = null;
    }
    localObject2 = getBounds();
    if (localObject1 != null) {
      paramCanvas.drawBitmap((Bitmap)localObject1, null, (Rect)localObject2, null);
    }
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if (this.url.equals(paramString)) {
      invalidateSelf();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */