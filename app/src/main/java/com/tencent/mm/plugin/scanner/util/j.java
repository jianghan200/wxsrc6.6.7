package com.tencent.mm.plugin.scanner.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qbar.QbarNative;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class j
  extends b
{
  private Object dMd = new Object();
  private byte[] fOM;
  private boolean jAi = false;
  public boolean lhy = true;
  private boolean mJI = false;
  private float mKP = 1.0F;
  private final int mNE = 25;
  private boolean mNF = false;
  private final int mNG = 1;
  private int mNH = 0;
  private boolean mNI;
  private volatile boolean mNJ;
  public volatile boolean mNK;
  private long mNL;
  private int outHeight;
  private int outWidth;
  private int quality = 50;
  
  public j(b.a parama, int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parama);
    this.quality = paramInt;
    this.mKP = paramFloat;
    this.lhy = paramBoolean2;
    this.mNI = paramBoolean1;
    x.i("MicroMsg.scanner.ScanImageDecoder", "quality = [%s], scaleRate = [%s], needRotate = [%s], ocrMode=[%s]", new Object[] { Integer.valueOf(paramInt), Float.valueOf(paramFloat), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
  }
  
  private static int a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      return -1;
    }
    if (paramInt3 == 1) {
      return QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 6, 140);
    }
    if (paramInt3 == 2) {
      return QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 8, 120);
    }
    if (paramInt3 == 4) {
      return QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 13, 80);
    }
    if (paramInt3 == 5) {
      return QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 15, 65);
    }
    return QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 10, 100);
  }
  
  private static int vI(int paramInt)
  {
    int i;
    if (paramInt > 0)
    {
      i = paramInt;
      if (paramInt <= 5) {}
    }
    else
    {
      i = 3;
    }
    return i;
  }
  
  @TargetApi(8)
  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect)
  {
    if (this.jAi)
    {
      x.e("MicroMsg.scanner.ScanImageDecoder", "decode() is decoding, return false");
      return false;
    }
    this.jAi = true;
    if ((paramArrayOfByte == null) || (paramPoint == null) || (paramRect == null))
    {
      boolean bool1;
      boolean bool2;
      if (paramArrayOfByte == null)
      {
        bool1 = true;
        if (paramPoint != null) {
          break label102;
        }
        bool2 = true;
        label47:
        if (paramRect != null) {
          break label108;
        }
      }
      label102:
      label108:
      for (boolean bool3 = true;; bool3 = false)
      {
        x.e("MicroMsg.scanner.ScanImageDecoder", "decode() data null:[%s], resolution null:[%s], coverage null:[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        this.jAi = false;
        return false;
        bool1 = false;
        break;
        bool2 = false;
        break label47;
      }
    }
    Rect localRect;
    int i;
    int j;
    try
    {
      if (this.mNH <= 0)
      {
        this.mNH += 1;
        this.jAi = false;
        return false;
      }
      synchronized (this.dMd)
      {
        localRect = new Rect();
        if ((!com.tencent.mm.compatible.e.d.zf()) && (!this.lhy)) {
          break label312;
        }
        i = paramRect.width();
        j = paramRect.height();
        localRect.left = paramRect.left;
        paramRect.right -= i % 4;
        localRect.top = paramRect.top;
        paramRect.bottom -= j % 4;
        if ((localRect.right > localRect.left) && (localRect.bottom > localRect.top)) {
          break label548;
        }
        this.jAi = false;
        return false;
      }
      this.mMF = null;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("MicroMsg.scanner.ScanImageDecoder", " Exception in decode(): [%s]", new Object[] { paramArrayOfByte.toString() });
      x.printErrStackTrace("MicroMsg.scanner.ScanImageDecoder", paramArrayOfByte, "", new Object[0]);
    }
    for (;;)
    {
      this.jAi = false;
      return false;
      label312:
      localRect.left = (paramPoint.x / 2 - paramRect.height());
      localRect.right = (paramPoint.x / 2 + paramRect.height());
      localRect.top = (paramPoint.y / 2 - paramRect.width() / 2);
      localRect.bottom = (paramPoint.y / 2 + paramRect.width() / 2);
      if (localRect.left < 0) {
        localRect.left = 0;
      }
      if (localRect.right > paramPoint.x - 1) {
        localRect.right = (paramPoint.x - 1);
      }
      if (localRect.top < 0) {
        localRect.top = 0;
      }
      if (localRect.bottom > paramPoint.y - 1) {
        localRect.bottom = (paramPoint.y - 1);
      }
      i = localRect.width() % 4;
      j = localRect.height() % 4;
      if (i != 0) {
        localRect.right -= i;
      }
      if (j != 0) {
        localRect.bottom -= j;
      }
      if ((localRect.right <= localRect.left) || (localRect.bottom <= localRect.top))
      {
        this.jAi = false;
        return false;
      }
      label548:
      paramArrayOfByte = new c(paramArrayOfByte, paramPoint.x, paramPoint.y, localRect);
      if ((paramArrayOfByte.height == 0) || (paramArrayOfByte.width == 0))
      {
        this.jAi = false;
        return false;
      }
      if (this.mJI)
      {
        x.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 1");
        return false;
      }
      paramPoint = paramArrayOfByte.bsW();
      if (paramPoint == null)
      {
        this.jAi = false;
        return false;
      }
      if (!this.mNF)
      {
        if (!com.tencent.mm.compatible.e.d.zf())
        {
          i = a(localRect.height(), localRect.width(), this.mNI, vI(q.deM.dda));
          x.d("MicroMsg.scanner.ScanImageDecoder", "Focus init params1=[%s] params2=[%s] params3=[%s], focusThreshold=[%s]", new Object[] { Integer.valueOf(localRect.height()), Integer.valueOf(localRect.width()), Boolean.valueOf(this.mNI), Integer.valueOf(q.deM.dda) });
        }
        while (i == -1)
        {
          x.e("MicroMsg.scanner.ScanImageDecoder", "error in Focus init = [%s]", new Object[] { Integer.valueOf(i) });
          return false;
          i = a(localRect.width(), localRect.height(), this.mNI, vI(q.deM.dda));
          x.d("MicroMsg.scanner.ScanImageDecoder", "Focus init Landscape params1=[%s] params2=[%s] params3=[%s], focusThreshold=[%s]", new Object[] { Integer.valueOf(localRect.width()), Integer.valueOf(localRect.height()), Boolean.valueOf(this.mNI), Integer.valueOf(q.deM.dda) });
        }
        this.mNF = true;
      }
      paramRect = new boolean[2];
      long l = bi.VG();
      QbarNative.FocusPro(paramPoint, com.tencent.mm.compatible.e.d.zf(), paramRect);
      x.d("MicroMsg.scanner.ScanImageDecoder", "is best:%s, need focus:%s, cost:%s", new Object[] { Boolean.valueOf(paramRect[0]), Boolean.valueOf(paramRect[1]), Long.valueOf(bi.bI(l)) });
      this.mNJ = paramRect[0];
      this.mNK = paramRect[1];
      if (this.mNL == 0L) {
        this.mNL = System.currentTimeMillis();
      }
      if ((!this.mNK) && (System.currentTimeMillis() - this.mNL > 9000L))
      {
        x.d("MicroMsg.scanner.ScanImageDecoder", "reach focus interfal");
        this.mNK = true;
        this.mNL = System.currentTimeMillis();
      }
      if (this.mNJ == true)
      {
        if (this.mJI)
        {
          x.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 2");
          return false;
        }
        this.outWidth = paramArrayOfByte.width;
        this.outHeight = paramArrayOfByte.height;
        i = 0;
        j = 0;
        if (!com.tencent.mm.compatible.e.d.zf())
        {
          i = 1;
          this.outWidth = paramArrayOfByte.height;
          this.outHeight = paramArrayOfByte.width;
        }
        if (this.mKP < 0.9D)
        {
          j = 1;
          this.outWidth /= 2;
          this.outHeight /= 2;
        }
        if (this.fOM == null)
        {
          this.fOM = new byte[this.outWidth * this.outHeight * 3 / 2];
          x.v("MicroMsg.scanner.ScanImageDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(this.outWidth * this.outHeight * 3 / 2) });
        }
        for (;;)
        {
          int k = QbarNative.a(this.fOM, paramPoint, this.outWidth, this.outHeight, j);
          x.d("MicroMsg.scanner.ScanImageDecoder", "decode() imgRet = [%s], outWidth = [%s], outHeight = [%s], imgRotate=[%s], imgScale=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(this.outWidth), Integer.valueOf(this.outHeight), Integer.valueOf(i), Integer.valueOf(j) });
          if (k == 1) {
            break;
          }
          this.mMF = null;
          this.jAi = false;
          return false;
          if (this.fOM.length != this.outWidth * this.outHeight * 3 / 2)
          {
            this.fOM = null;
            this.fOM = new byte[this.outWidth * this.outHeight * 3 / 2];
            x.v("MicroMsg.scanner.ScanImageDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(this.outWidth * this.outHeight * 3 / 2) });
          }
        }
        if (this.mJI)
        {
          x.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 3");
          return false;
        }
        if (com.tencent.mm.compatible.util.d.fR(8)) {
          com.tencent.mm.compatible.a.a.a(8, new j.1(this));
        }
        for (;;)
        {
          x.i("MicroMsg.scanner.ScanImageDecoder", "decode() finish greyData.length = [%s]", new Object[] { Integer.valueOf(this.mMF.length) });
          this.jAi = false;
          return true;
          x.d("MicroMsg.scanner.ScanImageDecoder", "decode() compress jpeg by PlanarYUVLuminanceSource");
          paramPoint = new c(this.fOM, this.outWidth, this.outHeight, new Rect(0, 0, this.outWidth, this.outHeight));
          paramRect = new int[paramPoint.width * paramPoint.height];
          QbarNative.a(paramPoint.bYC, paramRect, paramPoint.mML, paramPoint.mMM, paramPoint.left, paramPoint.top, paramPoint.width, paramPoint.height);
          QbarNative.nativeRelease();
          paramArrayOfByte = Bitmap.createBitmap(paramPoint.width, paramPoint.height, Bitmap.Config.ARGB_8888);
          paramArrayOfByte.setPixels(paramRect, 0, paramPoint.width, 0, 0, paramPoint.width, paramPoint.height);
          paramPoint = new ByteArrayOutputStream();
          paramArrayOfByte.compress(Bitmap.CompressFormat.JPEG, this.quality, paramPoint);
          this.mMF = paramPoint.toByteArray();
          paramPoint.close();
          if (af.exa) {
            com.tencent.mm.sdk.platformtools.c.a(paramArrayOfByte, this.quality, Bitmap.CompressFormat.JPEG, h.getExternalStorageDirectory().getAbsolutePath() + "/_scanImage_.JPEG", false);
          }
          paramArrayOfByte.recycle();
        }
      }
    }
  }
  
  public final void bsU()
  {
    if (this.mNF) {
      ll();
    }
    this.jAi = false;
    this.mJI = false;
    this.mNF = false;
  }
  
  public final void ll()
  {
    x.d("MicroMsg.scanner.ScanImageDecoder", "releaseDecoder start");
    this.mJI = true;
    if (this.dMd != null) {}
    synchronized (this.dMd)
    {
      if (this.mNF)
      {
        x.d("sizepara", "ImgProcessScan.FocusRelease() = [%s]", new Object[] { Integer.valueOf(0) });
        this.mNF = false;
        x.d("MicroMsg.scanner.ScanImageDecoder", "ImgProcessScan.Release() = [%s]", new Object[] { Integer.valueOf(QbarNative.FocusRelease()) });
      }
      this.fOM = null;
      c.bsV();
      x.d("MicroMsg.scanner.ScanImageDecoder", "releaseDecoder done");
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */