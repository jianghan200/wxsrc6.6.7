package com.tencent.mm.plugin.appbrand.ui.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import com.tencent.mm.memory.l;
import com.tencent.mm.modelappbrand.b.b.f;
import com.tencent.mm.sdk.platformtools.c;

public final class a
  implements b.f
{
  private final int gzI;
  private final int gzK;
  private final int gzL;
  
  public a(int paramInt1, int paramInt2)
  {
    this.gzI = paramInt1;
    this.gzK = paramInt2;
    this.gzL = -1;
  }
  
  public final String Ke()
  {
    return "WxaNearbyShowcaseIcon";
  }
  
  public final Bitmap o(Bitmap paramBitmap)
  {
    Bitmap localBitmap = c.a(paramBitmap, false, paramBitmap.getWidth() / 2, false);
    paramBitmap = Bitmap.createScaledBitmap(localBitmap, this.gzI, this.gzI, false);
    if (localBitmap != paramBitmap) {
      l.Fu().l(localBitmap);
    }
    localBitmap = Bitmap.createBitmap(this.gzI + this.gzK * 2, this.gzI + this.gzK * 2, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap, this.gzK, this.gzK, new Paint());
    l.Fu().l(paramBitmap);
    paramBitmap = new Paint();
    paramBitmap.setColor(this.gzL);
    paramBitmap.setAntiAlias(true);
    paramBitmap.setStyle(Paint.Style.STROKE);
    paramBitmap.setStrokeWidth(this.gzK);
    localCanvas.drawCircle(this.gzI / 2 + this.gzK, this.gzI / 2 + this.gzK, this.gzI / 2, paramBitmap);
    return localBitmap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */