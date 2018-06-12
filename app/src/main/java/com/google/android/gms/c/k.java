package com.google.android.gms.c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;

public final class k
{
  public static Bitmap g(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    int j = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    int k;
    if (j >= i)
    {
      j = (i - j) / 2;
      k = 0;
    }
    for (;;)
    {
      Bitmap localBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint = new Paint(1);
      localPaint.setColor(-16777216);
      localCanvas.drawCircle(i / 2, i / 2, i / 2, localPaint);
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localCanvas.drawBitmap(paramBitmap, j, k, localPaint);
      return localBitmap;
      k = (j - i) / 2;
      i = j;
      j = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */