package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.n.a.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends a
{
  private final Paint cN = new Paint(6);
  private ag ioW = new ag();
  private boolean khD = false;
  private int[] khG = new int[4];
  private float khH = 1.0F;
  private float khI = 1.0F;
  private boolean khJ;
  private int khL = 0;
  private int khM = -1;
  private long khN = 0L;
  private long khO = 0L;
  private long khP = 0L;
  private long khQ = 0L;
  private long khR;
  private long khS = 0L;
  private final Runnable khZ = new f.1(this);
  private final Runnable kia = new f.2(this);
  private final Runnable kid = new f.3(this);
  private volatile long kiq;
  private int[] kir = new int[4];
  private Bitmap kis;
  private boolean kit = false;
  private float mDensity;
  private int mHeight;
  private boolean mIsRunning = false;
  private int mWidth;
  private final Rect rD = new Rect();
  
  public f(String paramString)
  {
    this(e.e(paramString, 0, e.cm(paramString)));
  }
  
  public f(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("bytes is null.");
    }
    this.kiq = MMWXGFJNI.nativeInitWxAMDecoder();
    if ((this.kiq == 0L) || (this.kiq == -901L))
    {
      x.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan init wxam decoder failed. mWXGFJNIHandle:%d", new Object[] { Long.valueOf(this.kiq) });
      if (this.kiq == -901L) {
        h.mEJ.a(711L, 5L, 1L, false);
      }
      h.mEJ.a(711L, 4L, 1L, false);
      throw new MMGIFException(201);
    }
    int i = MMWXGFJNI.nativeDecodeBufferHeader(this.kiq, paramArrayOfByte, paramArrayOfByte.length);
    if (i != 0)
    {
      x.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF decode buffer header failed. result:%d", new Object[] { Integer.valueOf(i) });
      if (i == 64632) {
        h.mEJ.a(711L, 8L, 1L, false);
      }
      for (;;)
      {
        throw new MMGIFException(i);
        h.mEJ.a(711L, 3L, 1L, false);
      }
    }
    i = MMWXGFJNI.nativeGetOption(this.kiq, paramArrayOfByte, paramArrayOfByte.length, this.khG);
    if (i != 0)
    {
      x.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d", new Object[] { Integer.valueOf(i) });
      if (i == 64633) {
        h.mEJ.a(711L, 7L, 1L, false);
      }
      for (;;)
      {
        throw new MMGIFException(i);
        h.mEJ.a(711L, 3L, 1L, false);
      }
    }
    this.khL = this.khG[0];
    this.mWidth = this.khG[1];
    this.mHeight = this.khG[2];
    if ((this.mWidth == 0) || (this.mHeight == 0))
    {
      i = com.tencent.mm.bp.a.ad(ad.getContext(), a.c.emoji_view_image_size);
      this.mHeight = i;
      this.mWidth = i;
    }
    this.kis = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
  }
  
  private float getEmojiDensityScale()
  {
    if (this.mDensity == 0.0F)
    {
      this.mDensity = (com.tencent.mm.bp.a.getDensity(ad.getContext()) / 2.0F);
      if (this.mDensity >= 1.0F) {
        break label40;
      }
      this.mDensity = 1.0F;
    }
    for (;;)
    {
      return this.mDensity;
      label40:
      if (this.mDensity > 2.0F) {
        this.mDensity = 2.0F;
      }
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (this.khJ)
    {
      this.rD.set(getBounds());
      this.khH = (this.rD.width() / this.mWidth);
      this.khI = (this.rD.height() / this.mHeight);
      this.khJ = false;
    }
    if (this.cN.getShader() == null)
    {
      if (this.khQ == 0L) {
        this.khQ = System.currentTimeMillis();
      }
      paramCanvas.scale(this.khH, this.khI);
      if ((this.kis != null) && (!this.kis.isRecycled()) && (!this.khD)) {
        paramCanvas.drawBitmap(this.kis, 0.0F, 0.0F, null);
      }
      for (;;)
      {
        this.khR = (System.currentTimeMillis() - this.khQ);
        com.tencent.mm.aj.a.c(this.kid, 0L);
        return;
        x.e("MicroMsg.GIF.MMWXGFDrawable", "Cpan draw bitmap failed. Bitmap buffer is null or recycle");
      }
    }
    paramCanvas.drawRect(this.rD, this.cN);
  }
  
  protected final void finalize()
  {
    try
    {
      recycle();
      return;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.GIF.MMWXGFDrawable", localThrowable, "", new Object[0]);
      super.finalize();
    }
  }
  
  public final int getIntrinsicHeight()
  {
    return (int)(this.mHeight * getEmojiDensityScale());
  }
  
  public final int getIntrinsicWidth()
  {
    return (int)(this.mWidth * getEmojiDensityScale());
  }
  
  public final int getOpacity()
  {
    return -2;
  }
  
  public final boolean isRunning()
  {
    return this.mIsRunning;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.khJ = true;
  }
  
  public final void recycle()
  {
    try
    {
      x.v("MicroMsg.GIF.MMWXGFDrawable", "Cpan recycle decode handle:%d", new Object[] { Long.valueOf(this.kiq) });
      this.khD = true;
      this.mIsRunning = false;
      long l = this.kiq;
      this.kiq = 0L;
      this.ioW.removeCallbacks(this.khZ);
      int i = MMWXGFJNI.nativeUninit(l);
      if (i == 64630) {
        h.mEJ.a(401L, 10L, 1L, false);
      }
      x.d("MicroMsg.GIF.MMWXGFDrawable", "nativeUninit result:%d mWXGFJNIHandle:%s mIsRender:%b", new Object[] { Integer.valueOf(i), Long.valueOf(l), Boolean.valueOf(this.kit) });
      if ((l != 0L) && (i == 0) && (this.kis != null)) {
        this.kis.isRecycled();
      }
      this.kis = null;
      return;
    }
    finally {}
  }
  
  public final void reset()
  {
    this.mIsRunning = true;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.cN.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.cN.setColorFilter(paramColorFilter);
  }
  
  public final void start()
  {
    this.mIsRunning = true;
    com.tencent.mm.aj.a.c(this.kia, 0L);
  }
  
  public final void stop()
  {
    this.mIsRunning = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/gif/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */