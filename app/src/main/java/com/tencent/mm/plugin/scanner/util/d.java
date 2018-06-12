package com.tencent.mm.plugin.scanner.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.mm.plugin.scanner.a.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qbar.QbarNative;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class d
  extends b
{
  private Object dMd = new Object();
  private QbarNative fOK = new QbarNative();
  public boolean fOL = false;
  private byte[] fOM;
  private byte[] fON;
  public volatile boolean jAi = false;
  public boolean lhy = true;
  public boolean mJI = false;
  public Set<Integer> mLj;
  public int mMN;
  
  public d(b.a parama, int paramInt, boolean paramBoolean)
  {
    super(parama);
    this.mMN = paramInt;
    this.lhy = paramBoolean;
  }
  
  private boolean a(byte[] paramArrayOfByte, Point paramPoint)
  {
    long l1 = System.currentTimeMillis();
    x.i("MicroMsg.scanner.QBarDecoder", "decode() start");
    if (this.jAi)
    {
      x.e("MicroMsg.scanner.QBarDecoder", "is decoding, return false");
      return false;
    }
    if (this.mJI)
    {
      x.w("MicroMsg.scanner.QBarDecoder", "isReleasing, return false 1");
      return false;
    }
    if (paramArrayOfByte == null)
    {
      x.e("MicroMsg.scanner.QBarDecoder", "wrong args");
      return false;
    }
    synchronized (this.dMd)
    {
      this.jAi = true;
      this.mMG = null;
      this.bJs = 0;
      this.bJr = 0;
      l.mFT.bsd();
    }
    for (;;)
    {
      try
      {
        int i = this.mMN;
        if (!this.fOL)
        {
          localObject2 = vD(i);
          if ((!this.fOL) && (!((Set)localObject2).isEmpty()))
          {
            i = this.fOK.E(0, "ANY", "UTF-8");
            l.mFT.mGi = ((Set)localObject2).contains(Integer.valueOf(5));
            int j = h((Set)localObject2);
            x.i("MicroMsg.scanner.QBarDecoder", "QbarNative.Init = [%s], SetReaders = [%s], version = [%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), QbarNative.getVersion() });
            if ((i > 0) && (j > 0)) {
              this.fOL = true;
            }
          }
          else
          {
            bool = this.fOL;
            if (bool) {
              continue;
            }
            ll();
            this.jAi = false;
            return false;
            paramArrayOfByte = finally;
            throw paramArrayOfByte;
          }
          x.e("MicroMsg.scanner.QBarDecoder", "QbarNative failed, releaseDecoder 1");
          bool = false;
          continue;
        }
        else
        {
          bool = this.fOL;
          continue;
        }
        long l2 = System.currentTimeMillis();
        x.i("MicroMsg.scanner.QBarDecoder", "data len %d, image size %s", new Object[] { Integer.valueOf(paramArrayOfByte.length), paramPoint });
        i = this.fOK.u(paramArrayOfByte, paramPoint.x, paramPoint.y);
        l2 = System.currentTimeMillis() - l2;
        if (this.fOK.cEL() != 0)
        {
          bool = true;
          float f = this.fOK.cEK();
          x.i("MicroMsg.scanner.QBarDecoder", "after scanImage, result:%d,hasCode: %s, areaRatio: %f", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Float.valueOf(f) });
          if ((i <= 0) && (bool) && (this.mME != null) && (f < 0.1F))
          {
            paramArrayOfByte = new Bundle();
            paramArrayOfByte.putInt("zoom_action", 6);
            paramArrayOfByte.putInt("zoom_type", 1);
            paramArrayOfByte.putInt("zoom_scale", (int)(100.0D * Math.sqrt(0.1F / f)));
            this.mME.E(paramArrayOfByte);
          }
          l.mFT.dn(paramPoint.x, paramPoint.y);
          l.mFT.bse();
          long l3 = System.currentTimeMillis();
          l.mFT.es(l2);
          x.d("MicroMsg.scanner.QBarDecoder", "decode ScanImage %s, cost:%d", new Object[] { Integer.valueOf(i), Long.valueOf(l3 - l1) });
          if (i != 1)
          {
            this.jAi = false;
            return false;
          }
        }
        else
        {
          bool = false;
          continue;
        }
        l.mFT.bsc();
        l.mFT.et(l2);
        paramArrayOfByte = new StringBuilder();
        paramPoint = new StringBuilder();
        Object localObject2 = new StringBuilder();
        StringBuilder localStringBuilder = new StringBuilder();
        int[] arrayOfInt = new int[2];
        i = this.fOK.a(paramArrayOfByte, paramPoint, (StringBuilder)localObject2, localStringBuilder, arrayOfInt);
        if (i == 1)
        {
          x.d("MicroMsg.scanner.QBarDecoder", "decode type:%s, sCharset: %s, sBinaryMethod: %s, data:%s, gResult:%s", new Object[] { paramArrayOfByte.toString(), ((StringBuilder)localObject2).toString(), localStringBuilder.toString(), paramPoint.toString(), Integer.valueOf(i) });
          if (!bi.oW(paramPoint.toString()))
          {
            str = paramArrayOfByte.toString();
            if ((!str.equals("QR_CODE")) && (!str.equals("WX_CODE"))) {
              continue;
            }
            this.mMG = paramPoint.toString();
            mMH = 1;
          }
          this.bJr = p.KS(paramArrayOfByte.toString());
          this.bJs = arrayOfInt[0];
          this.mjh = Arrays.copyOf(this.fOK.data, this.fOK.vgD[1]);
        }
        l.mFT.a(paramArrayOfByte.toString(), this.mMG, ((StringBuilder)localObject2).toString(), arrayOfInt[0], arrayOfInt[1], localStringBuilder.toString());
      }
      catch (Exception paramArrayOfByte)
      {
        String str;
        x.printErrStackTrace("MicroMsg.scanner.QBarDecoder", paramArrayOfByte, "decodeInternal error", new Object[0]);
        continue;
        boolean bool = false;
        continue;
      }
      this.jAi = false;
      x.i("MicroMsg.scanner.QBarDecoder", "decode() finish, resultText = [%s], cost:%d", new Object[] { this.mMG, Long.valueOf(System.currentTimeMillis() - l1) });
      if (bi.oW(this.mMG)) {
        continue;
      }
      bool = true;
      return bool;
      this.mMG = (str + "," + paramPoint);
      mMH = 2;
    }
  }
  
  private byte[] a(byte[] paramArrayOfByte, Point paramPoint1, Rect paramRect, Point paramPoint2)
  {
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      long l;
      try
      {
        if (paramArrayOfByte.length <= 0)
        {
          x.w("MicroMsg.scanner.QBarDecoder", "prepareGrayData , data is null");
          paramArrayOfByte = null;
          return paramArrayOfByte;
        }
        l = System.currentTimeMillis();
        Object localObject = new Rect();
        int j;
        if ((com.tencent.mm.compatible.e.d.zf()) || (this.lhy))
        {
          i = paramRect.width();
          j = paramRect.height();
          ((Rect)localObject).left = paramRect.left;
          ((Rect)localObject).right = (paramRect.right - i % 4);
          ((Rect)localObject).top = paramRect.top;
          ((Rect)localObject).bottom = (paramRect.bottom - j % 4);
          if (((Rect)localObject).right <= ((Rect)localObject).left) {
            break label807;
          }
          if (((Rect)localObject).bottom <= ((Rect)localObject).top) {
            break label807;
          }
        }
        else
        {
          ((Rect)localObject).left = (paramPoint1.x / 2 - paramRect.height());
          ((Rect)localObject).right = (paramPoint1.x / 2 + paramRect.height());
          ((Rect)localObject).top = (paramPoint1.y / 2 - paramRect.width() / 2);
          ((Rect)localObject).bottom = (paramPoint1.y / 2 + paramRect.width() / 2);
          if (((Rect)localObject).left < 0) {
            ((Rect)localObject).left = 0;
          }
          if (((Rect)localObject).right > paramPoint1.x - 1) {
            ((Rect)localObject).right = (paramPoint1.x - 1);
          }
          if (((Rect)localObject).top < 0) {
            ((Rect)localObject).top = 0;
          }
          if (((Rect)localObject).bottom > paramPoint1.y - 1) {
            ((Rect)localObject).bottom = (paramPoint1.y - 1);
          }
          i = ((Rect)localObject).width() % 4;
          j = ((Rect)localObject).height() % 4;
          if (i != 0) {
            ((Rect)localObject).right -= i;
          }
          if (j != 0) {
            ((Rect)localObject).bottom -= j;
          }
          if ((((Rect)localObject).right <= ((Rect)localObject).left) || (((Rect)localObject).bottom <= ((Rect)localObject).top)) {
            break label812;
          }
        }
        paramRect = new c(paramArrayOfByte, paramPoint1.x, paramPoint1.y, (Rect)localObject);
        paramPoint2.x = paramRect.width;
        paramPoint2.y = paramRect.height;
        int i = 0;
        if (!com.tencent.mm.compatible.e.d.zf())
        {
          i = 90;
          paramPoint2.x = paramRect.height;
          paramPoint2.y = paramRect.width;
        }
        x.d("MicroMsg.scanner.QBarDecoder", "rotate angle: " + i);
        if (this.fOM == null)
        {
          this.fOM = new byte[paramRect.width * paramRect.height * 3 / 2];
          this.fON = new byte[paramRect.width * paramRect.height];
          x.d("MicroMsg.scanner.QBarDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(paramRect.width * paramRect.height * 3 / 2) });
          localObject = this.fOM;
          j = paramPoint2.x;
          int k = paramPoint2.y;
          int m = paramPoint1.x;
          int n = paramPoint1.y;
          int i1 = paramRect.left;
          int i2 = paramRect.top;
          int i3 = paramRect.width;
          int i4 = paramRect.height;
          i = QbarNative.a((byte[])localObject, new int[] { j, k }, paramArrayOfByte, m, n, i1, i2, i3, i4, i);
          if (i != 1)
          {
            x.e("MicroMsg.scanner.QBarDecoder", "decode pro_result %s", new Object[] { Integer.valueOf(i) });
            paramArrayOfByte = null;
          }
        }
        else
        {
          if (this.fOM.length == paramRect.width * paramRect.height * 3 / 2) {
            continue;
          }
          this.fOM = null;
          this.fOM = new byte[paramRect.width * paramRect.height * 3 / 2];
          this.fON = null;
          this.fON = new byte[paramRect.width * paramRect.height];
          x.d("MicroMsg.scanner.QBarDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(paramRect.width * paramRect.height * 3 / 2) });
          continue;
        }
        System.arraycopy(this.fOM, 0, this.fON, 0, this.fON.length);
      }
      finally {}
      x.d("MicroMsg.scanner.QBarDecoder", "decode, rotate and gray, cost:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      paramArrayOfByte = this.fON;
      continue;
      label807:
      paramArrayOfByte = null;
      continue;
      label812:
      paramArrayOfByte = null;
    }
  }
  
  public static Set<Integer> vD(int paramInt)
  {
    HashSet localHashSet = new HashSet();
    if (paramInt == 1)
    {
      localHashSet.add(Integer.valueOf(2));
      localHashSet.add(Integer.valueOf(3));
      localHashSet.add(Integer.valueOf(4));
      localHashSet.add(Integer.valueOf(5));
    }
    do
    {
      return localHashSet;
      if (paramInt == 2)
      {
        localHashSet.add(Integer.valueOf(0));
        localHashSet.add(Integer.valueOf(3));
        localHashSet.add(Integer.valueOf(4));
        return localHashSet;
      }
      if (paramInt == 0)
      {
        localHashSet.add(Integer.valueOf(2));
        localHashSet.add(Integer.valueOf(0));
        localHashSet.add(Integer.valueOf(3));
        localHashSet.add(Integer.valueOf(4));
        localHashSet.add(Integer.valueOf(5));
        return localHashSet;
      }
    } while (paramInt != 3);
    localHashSet.add(Integer.valueOf(2));
    localHashSet.add(Integer.valueOf(5));
    return localHashSet;
  }
  
  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect)
  {
    Point localPoint = new Point();
    paramArrayOfByte = a(paramArrayOfByte, paramPoint, paramRect, localPoint);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0)) {
      return a(paramArrayOfByte, localPoint);
    }
    return false;
  }
  
  public final byte[] a(byte[] paramArrayOfByte, Point paramPoint1, int paramInt, Rect paramRect, Point paramPoint2)
  {
    byte[] arrayOfByte1 = paramArrayOfByte;
    if (270 == paramInt) {}
    try
    {
      byte[] arrayOfByte2 = new byte[paramArrayOfByte.length];
      QbarNative.a(arrayOfByte2, paramArrayOfByte, paramPoint1.x, paramPoint1.y);
      arrayOfByte1 = new byte[paramArrayOfByte.length];
      QbarNative.a(arrayOfByte1, arrayOfByte2, paramPoint1.y, paramPoint1.x);
      QbarNative.nativeRelease();
      paramArrayOfByte = a(arrayOfByte1, paramPoint1, paramRect, paramPoint2);
      return paramArrayOfByte;
    }
    finally {}
  }
  
  public final void bsU()
  {
    if (this.fOL)
    {
      ll();
      this.fOL = false;
    }
    this.mJI = false;
    this.jAi = false;
    this.fOK = new QbarNative();
  }
  
  public final int h(Set<Integer> arg1)
  {
    if ((??? != null) && (!???.isEmpty()))
    {
      int[] arrayOfInt = new int[???.size()];
      ??? = ???.iterator();
      int i = 0;
      while (???.hasNext())
      {
        Integer localInteger = (Integer)???.next();
        if (localInteger != null)
        {
          arrayOfInt[i] = localInteger.intValue();
          i += 1;
        }
      }
      x.i("MicroMsg.scanner.QBarDecoder", "QBarNative.SetReaders, readers:%s", new Object[] { Arrays.toString(arrayOfInt) });
      synchronized (this.dMd)
      {
        if (this.fOK != null)
        {
          i = this.fOK.g(arrayOfInt, arrayOfInt.length);
          return i;
        }
        return 0;
      }
    }
    return 0;
  }
  
  public final void ll()
  {
    x.d("MicroMsg.scanner.QBarDecoder", "releaseDecoder() start, hasInitQBar = %s", new Object[] { Boolean.valueOf(this.fOL) });
    this.mJI = true;
    synchronized (this.dMd)
    {
      if (this.fOL)
      {
        int i = this.fOK.release();
        this.fOK = null;
        this.fOL = false;
        x.d("MicroMsg.scanner.QBarDecoder", "QbarNative.Release() = [%s]", new Object[] { Integer.valueOf(i) });
      }
      c.bsV();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */