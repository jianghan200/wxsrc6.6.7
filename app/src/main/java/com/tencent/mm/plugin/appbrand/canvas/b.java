package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.mm.modelappbrand.b.b.f;
import com.tencent.mm.sdk.platformtools.c;
import junit.framework.Assert;

final class b
  implements b.f
{
  private int fmL;
  private int fmM;
  private int mHeight;
  private int mWidth;
  
  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 == 0)
    {
      bool1 = true;
      Assert.assertFalse(bool1);
      if (paramInt4 != 0) {
        break label61;
      }
    }
    label61:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertFalse(bool1);
      this.fmL = paramInt1;
      this.fmM = paramInt2;
      this.mWidth = paramInt3;
      this.mHeight = paramInt4;
      return;
      bool1 = false;
      break;
    }
  }
  
  public final String Ke()
  {
    return String.format("Transformation_x%s_y%s_w%s_h%s", new Object[] { Integer.valueOf(this.fmL), Integer.valueOf(this.fmM), Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
  }
  
  public final Bitmap o(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      return paramBitmap;
    }
    int n = paramBitmap.getWidth();
    int m = paramBitmap.getHeight();
    int i = this.fmL;
    int j = this.fmM;
    label53:
    int i1;
    int k;
    if (this.fmL < 0)
    {
      i = 0;
      if (this.fmM >= 0) {
        break label147;
      }
      j = 0;
      int i2 = this.mWidth + this.fmL - i;
      i1 = this.mHeight + this.fmM - j;
      k = i2;
      if (i + i2 > n) {
        k = n - i;
      }
      if (j + i1 <= m) {
        break label221;
      }
      m -= j;
    }
    for (;;)
    {
      if ((k <= 0) || (m <= 0))
      {
        return c.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        if (this.fmL <= n) {
          break;
        }
        i = n;
        break;
        label147:
        if (this.fmM <= m) {
          break label53;
        }
        j = m;
        break label53;
      }
      Bitmap localBitmap = c.createBitmap(k, m, Bitmap.Config.ARGB_8888);
      new Canvas(localBitmap).drawBitmap(paramBitmap, new Rect(i, j, i + k, j + m), new Rect(0, 0, k, m), null);
      return localBitmap;
      label221:
      m = i1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */