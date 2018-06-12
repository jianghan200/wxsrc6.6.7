package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;

public final class a
  extends View
{
  private c nCA;
  
  public a(Context paramContext, c paramc)
  {
    super(paramContext);
    this.nCA = paramc;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int k = getHeight();
    int i = getWidth();
    int j = (int)(Math.min(k, i) / 2.0F * 0.8D);
    i = (int)(i / 2.0F);
    k = (int)(k / 2.0F);
    Bitmap localBitmap = this.nCA.nCi;
    if (localBitmap != null)
    {
      j = (int)(j * 2 + this.nCA.nCj * 2.0F);
      int m = localBitmap.getWidth() * j / localBitmap.getHeight();
      paramCanvas.drawBitmap(Bitmap.createScaledBitmap(localBitmap, m, j, false), i - (m >>> 1), k - (j >>> 1), null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */