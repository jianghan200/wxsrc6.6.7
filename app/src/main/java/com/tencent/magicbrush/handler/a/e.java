package com.tencent.magicbrush.handler.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;

final class e
{
  Bitmap bnH;
  d bnI = new l();
  Rect bnJ = new Rect();
  int[] bnK = new int[4];
  
  e(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 <= 0) {
      i = 512;
    }
    paramInt1 = paramInt2;
    if (paramInt2 <= 0) {
      paramInt1 = 512;
    }
    this.bnH = Bitmap.createBitmap(i, paramInt1, Bitmap.Config.ARGB_8888);
    this.bnI.init(i, paramInt1);
    this.bnJ.setEmpty();
  }
  
  final boolean b(int paramInt1, int paramInt2, Rect paramRect)
  {
    if (paramRect == null) {}
    do
    {
      return false;
      if ((paramInt1 <= 0) || (paramInt2 <= 0))
      {
        paramRect.setEmpty();
        return false;
      }
      this.bnI.a(paramInt1, paramInt2, paramRect);
    } while ((paramRect.left < 0) || (paramRect.right < 0) || (paramRect.width() <= 0) || (paramRect.height() <= 0));
    this.bnJ.union(paramRect);
    return true;
  }
  
  final int height()
  {
    if (this.bnH != null) {
      return this.bnH.getHeight();
    }
    return 0;
  }
  
  final int width()
  {
    if (this.bnH != null) {
      return this.bnH.getWidth();
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/magicbrush/handler/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */