package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.mm.plugin.licence.model.CardInfo;
import com.tencent.mm.plugin.licence.model.LibCardRecog;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends b
{
  private final int klc;
  private final Object lock = new Object();
  private Bitmap mNN;
  public Bitmap mNO;
  private boolean[] mNg = new boolean[4];
  private boolean mNh = false;
  private boolean mNj = false;
  
  public k(b.a parama, int paramInt)
  {
    super(parama);
    this.klc = paramInt;
  }
  
  private static void btl()
  {
    x.i("MicroMsg.ScanLicenceDecoder", "lib release");
    try
    {
      LibCardRecog.recognizeCardRelease();
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ScanLicenceDecoder", "lib release, exp = %s", new Object[] { localException });
    }
  }
  
  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect)
  {
    x.d("MicroMsg.ScanLicenceDecoder", "smoothie, decode, resolution = %s, coverage = %s, data.length = %d", new Object[] { paramPoint, paramRect, Integer.valueOf(paramArrayOfByte.length) });
    int i;
    int j;
    long l;
    CardInfo localCardInfo;
    int k;
    int m;
    synchronized (this.lock)
    {
      if ((this.mNN != null) && (!this.mNN.isRecycled()))
      {
        x.d("MicroMsg.ScanLicenceDecoder", "[smoothie] recycle last bitmap");
        this.mNN.recycle();
      }
      x.d("MicroMsg.ScanLicenceDecoder", "resolution:%s, coverage:%s", new Object[] { paramPoint, paramRect });
      if (!this.mNh) {
        break label573;
      }
      x.d("MicroMsg.ScanLicenceDecoder", "recognize id succeed, no need more handle");
      return false;
      while (i < 4)
      {
        this.mNg[i] = false;
        i += 1;
      }
      float f = Math.min(Math.min(paramPoint.x / paramRect.width(), paramPoint.y / paramRect.height()), 1.0F);
      i = paramRect.width();
      j = paramRect.height();
      x.d("MicroMsg.ScanLicenceDecoder", "rate:%f, cropWidth:%d, cropHeight:%d", new Object[] { Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(j) });
      if (!this.mNj) {
        x.d("MicroMsg.ScanLicenceDecoder", "init param:%d, %d, %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramRect.width()), Integer.valueOf(paramRect.height()) });
      }
    }
    label472:
    while (i < 4)
    {
      this.mNg[i] = false;
      i += 1;
    }
    x.d("MicroMsg.ScanLicenceDecoder", "image is not enough clear");
    return false;
    for (;;)
    {
      if (i < 4)
      {
        this.mNg[i] = true;
        i += 1;
      }
      else
      {
        this.mNN = BitmapFactory.decodeByteArray(localCardInfo.bitmapData, 0, localCardInfo.bitmapLen);
        this.mNO = this.mNN.copy(Bitmap.Config.ARGB_8888, true);
        this.mNh = true;
        return true;
        label573:
        i = 0;
        break;
        if (1 != i)
        {
          i = 0;
          break label472;
        }
        i = 0;
      }
    }
  }
  
  public final void bsU()
  {
    this.mNh = false;
  }
  
  public final boolean[] btk()
  {
    synchronized (this.lock)
    {
      boolean[] arrayOfBoolean = this.mNg;
      return arrayOfBoolean;
    }
  }
  
  public final void ll()
  {
    if ((this.mNN != null) && (!this.mNN.isRecycled())) {
      this.mNN.recycle();
    }
    btl();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */