package com.tencent.mm.bm.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qbar.QbarNative;
import java.util.Arrays;

public final class a
{
  public static Bitmap a(Context paramContext, Bitmap paramBitmap, byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = paramBitmap.getWidth();
    int k = BackwardSupportUtil.b.b(paramContext, 197.0F);
    int j = k;
    if (k < i) {
      j = i;
    }
    k = (int)(paramArrayOfInt[0] * 0.1D);
    j /= (paramArrayOfInt[0] + k * 2);
    if (j == 0) {
      j = 1;
    }
    for (;;)
    {
      int i5 = k * j;
      int m = j * (paramArrayOfInt[0] + k * 2);
      int n = paramArrayOfInt[1] * j + k * (j * 2);
      k = m;
      if (m < i) {
        k = i;
      }
      m = n;
      if (n < i) {
        m = i;
      }
      paramContext = Bitmap.createBitmap(k, m, Bitmap.Config.ARGB_8888);
      int[] arrayOfInt = new int[k * m];
      n = (k - i) / 2;
      int i2 = 0;
      int i1 = n;
      while ((i1 < k - n) && (i2 < i))
      {
        int i3 = 0;
        int i4 = n;
        while ((i4 < m - n) && (i3 < i))
        {
          arrayOfInt[(i1 * k + i4)] = paramBitmap.getPixel(i3, i2);
          i4 += 1;
          i3 += 1;
        }
        i2 += 1;
        i1 += 1;
      }
      i = 0;
      while (i < paramArrayOfInt[1])
      {
        n = 0;
        while (n < paramArrayOfInt[0])
        {
          if (paramArrayOfByte[(paramArrayOfInt[0] * i + n)] == 1)
          {
            i1 = 0;
            while (i1 < j)
            {
              i2 = 0;
              while (i2 < j)
              {
                if (arrayOfInt[((i * j + i5 + i1) * k + n * j + i5 + i2)] == 0) {
                  arrayOfInt[((i * j + i5 + i1) * k + n * j + i5 + i2)] = -16777216;
                }
                i2 += 1;
              }
              i1 += 1;
            }
          }
          i1 = 0;
          while (i1 < j)
          {
            i2 = 0;
            while (i2 < j)
            {
              if (arrayOfInt[((i * j + i5 + i1) * k + n * j + i5 + i2)] == 0) {
                arrayOfInt[((i * j + i5 + i1) * k + n * j + i5 + i2)] = -1;
              }
              i2 += 1;
            }
            i1 += 1;
          }
          n += 1;
        }
        i += 1;
      }
      paramContext.setPixels(arrayOfInt, 0, k, 0, 0, k, m);
      return paramContext;
    }
  }
  
  public static Bitmap b(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[40000];
    int[] arrayOfInt = new int[2];
    int n = QbarNative.a(arrayOfByte, arrayOfInt, paramString, paramInt1, paramInt2, "UTF-8");
    QbarNative.nativeRelease();
    int i;
    int j;
    if (n > 0)
    {
      paramContext = paramContext.getResources().getDisplayMetrics();
      paramInt2 = paramContext.widthPixels;
      i = paramContext.heightPixels;
      if (paramInt2 < i)
      {
        paramInt2 = (int)(paramInt2 * 0.8D);
        j = (int)(arrayOfInt[0] * 0.1D);
        if (paramInt1 != 0) {
          break label271;
        }
        paramInt2 /= (arrayOfInt[0] + j * 2);
        paramInt1 = paramInt2;
        if (paramInt2 == 0) {
          paramInt1 = 1;
        }
        i = paramInt1;
        paramInt2 = paramInt1;
        paramInt1 = i;
      }
    }
    for (;;)
    {
      label111:
      int i1 = j * paramInt2;
      int i2 = paramInt2 * (arrayOfInt[0] + j * 2);
      int i3 = arrayOfInt[1] * paramInt1 + j * (paramInt2 * 2);
      paramContext = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
      paramString = new int[i2 * i3];
      Arrays.fill(paramString, -1);
      i = 0;
      for (;;)
      {
        if (i >= arrayOfInt[1]) {
          break label407;
        }
        j = 0;
        for (;;)
        {
          if (j >= arrayOfInt[0]) {
            break label398;
          }
          int m;
          if (arrayOfByte[(arrayOfInt[0] * i + j)] == 1)
          {
            k = 0;
            for (;;)
            {
              if (k >= paramInt1) {
                break label389;
              }
              m = 0;
              for (;;)
              {
                if (m < paramInt2)
                {
                  paramString[((i * paramInt1 + i1 + k) * i2 + j * paramInt2 + i1 + m)] = -16777216;
                  m += 1;
                  continue;
                  paramInt2 = i;
                  break;
                  label271:
                  if (paramInt1 != 5) {
                    break label503;
                  }
                  paramInt2 /= (arrayOfInt[0] + j * 2);
                  paramInt1 = paramInt2;
                  if (paramInt2 == 0) {
                    paramInt1 = 1;
                  }
                  i = arrayOfInt[0] * paramInt1 / arrayOfInt[1];
                  paramInt2 = paramInt1;
                  paramInt1 = i;
                  break label111;
                }
              }
              k += 1;
            }
          }
          int k = 0;
          while (k < paramInt1)
          {
            m = 0;
            while (m < paramInt2)
            {
              paramString[((i * paramInt1 + i1 + k) * i2 + j * paramInt2 + i1 + m)] = -1;
              m += 1;
            }
            k += 1;
          }
          label389:
          j += 1;
        }
        label398:
        i += 1;
      }
      label407:
      paramContext.setPixels(paramString, 0, i2, 0, 0, i2, i3);
      if (paramContext == null) {
        x.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(n), bi.cjd().toString() });
      }
      for (;;)
      {
        return paramContext;
        x.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { paramContext });
      }
      x.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", new Object[] { Integer.valueOf(n), bi.cjd().toString() });
      return null;
      label503:
      paramInt1 = 0;
      paramInt2 = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/bm/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */