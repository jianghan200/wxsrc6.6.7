package com.tencent.mm.plugin.scanner.util;

import android.graphics.Rect;
import com.tencent.mm.sdk.platformtools.x;
import g.a;

public final class c
  extends a
{
  public final byte[] bYC;
  public int height;
  public int left;
  final int mML;
  final int mMM;
  public int top;
  public int width;
  
  public c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect)
  {
    super(paramRect.width(), paramRect.height());
    x.v("MicroMsg.scanner.PlanarYUVLuminanceSource", "init yuvData.len: %d,  dataW: %d, dataH: %d, left: %d, top: %d, width: %d, height: %d ", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramRect.left), Integer.valueOf(paramRect.top), Integer.valueOf(paramRect.width()), Integer.valueOf(paramRect.height()) });
    this.bYC = paramArrayOfByte;
    this.mML = paramInt1;
    this.mMM = paramInt2;
    if ((paramRect.left < 0) || (paramRect.left >= paramInt1))
    {
      i = 0;
      this.left = i;
      i = j;
      if (paramRect.top >= 0)
      {
        if (paramRect.top < paramInt2) {
          break label270;
        }
        i = j;
      }
      label162:
      this.top = i;
      if (this.left + paramRect.width() <= paramInt1) {
        break label280;
      }
      i = paramInt1 - this.left;
      label190:
      this.width = i;
      if (this.top + paramRect.height() <= paramInt2) {
        break label290;
      }
    }
    label270:
    label280:
    label290:
    for (int i = paramInt2 - this.top;; i = paramRect.height())
    {
      this.height = i;
      if ((this.left + this.width <= paramInt1) && (this.top + this.height <= paramInt2)) {
        return;
      }
      throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
      i = paramRect.left;
      break;
      i = paramRect.top;
      break label162;
      i = paramRect.width();
      break label190;
    }
  }
  
  public static void bsV()
  {
    l locall = l.btm();
    if (locall.mNQ != null) {
      locall.mNQ = null;
    }
    if (locall.mNR != null) {
      locall.mNR = null;
    }
    System.gc();
  }
  
  public final byte[] bsW()
  {
    int i = 0;
    Object localObject1;
    if ((this.width == this.mML) && (this.height == this.mMM))
    {
      localObject1 = this.bYC;
      return (byte[])localObject1;
    }
    int k;
    byte[] arrayOfByte1;
    int j;
    for (;;)
    {
      try
      {
        k = this.width * this.height;
        localObject1 = l.btm();
        if (((l)localObject1).mNQ == null)
        {
          ((l)localObject1).mNQ = new byte[k];
          arrayOfByte1 = ((l)localObject1).mNQ;
          j = this.top * this.mML + this.left;
          if (this.width != this.mML) {
            break;
          }
          System.arraycopy(this.bYC, j, arrayOfByte1, 0, k);
          return arrayOfByte1;
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.scanner.PlanarYUVLuminanceSource", " yuvData.len:" + this.bYC.length + " dataWidth:" + this.mML + " dataHeight:" + this.mMM + " left:" + this.left + " top:" + this.top + " width:" + this.width + " height:" + this.height + " tStr:" + localException.toString());
        return null;
      }
      if (localException.mNQ.length != k)
      {
        localException.mNQ = null;
        localException.mNQ = new byte[k];
      }
    }
    byte[] arrayOfByte2 = this.bYC;
    for (;;)
    {
      Object localObject2 = arrayOfByte1;
      if (i >= this.height) {
        break;
      }
      System.arraycopy(arrayOfByte2, j, arrayOfByte1, this.width * i, this.width);
      k = this.mML;
      j += k;
      i += 1;
    }
  }
  
  public final byte[] bsX()
  {
    int i = 0;
    if ((this.width == this.mML) && (this.height == this.mMM))
    {
      byte[] arrayOfByte1 = this.bYC;
      return arrayOfByte1;
    }
    int k;
    byte[] arrayOfByte2;
    int j;
    try
    {
      k = this.width * this.height;
      arrayOfByte2 = new byte[k];
      j = this.top * this.mML + this.left;
      if (this.width == this.mML)
      {
        System.arraycopy(this.bYC, j, arrayOfByte2, 0, k);
        return arrayOfByte2;
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.scanner.PlanarYUVLuminanceSource", " yuvData.len:" + this.bYC.length + " dataWidth:" + this.mML + " dataHeight:" + this.mMM + " left:" + this.left + " top:" + this.top + " width:" + this.width + " height:" + this.height + " tStr:" + localException.toString());
      return null;
    }
    byte[] arrayOfByte3 = this.bYC;
    for (;;)
    {
      Object localObject = arrayOfByte2;
      if (i >= this.height) {
        break;
      }
      System.arraycopy(arrayOfByte3, j, arrayOfByte2, this.width * i, this.width);
      k = this.mML;
      j += k;
      i += 1;
    }
  }
  
  public final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    if ((paramInt < 0) || (paramInt >= this.height)) {
      throw new IllegalArgumentException("Requested row is outside the image: " + paramInt);
    }
    byte[] arrayOfByte;
    if (paramArrayOfByte != null)
    {
      arrayOfByte = paramArrayOfByte;
      if (paramArrayOfByte.length >= this.width) {}
    }
    else
    {
      arrayOfByte = new byte[this.width];
    }
    int i = this.top;
    int j = this.mML;
    int k = this.left;
    System.arraycopy(this.bYC, (i + paramInt) * j + k, arrayOfByte, 0, this.width);
    return arrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */