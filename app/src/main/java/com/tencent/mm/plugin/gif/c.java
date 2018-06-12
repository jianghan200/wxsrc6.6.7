package com.tencent.mm.plugin.gif;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.plugin.n.a.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;

public final class c
  extends a
{
  private final Paint cN = new Paint(6);
  private int dYK;
  private ag ioW = new ag();
  boolean khD = false;
  private volatile long khE;
  private AssetFileDescriptor khF = null;
  private final int[] khG = new int[6];
  private float khH = 1.0F;
  private float khI = 1.0F;
  private boolean khJ;
  private int[] khK;
  private int khL = 0;
  private int khM = -1;
  private long khN = 0L;
  private long khO = 0L;
  private long khP = 0L;
  private long khQ = 0L;
  private long khR;
  private long khS = 0L;
  private int khT;
  private boolean khU = false;
  int khV = 0;
  private int khW = 0;
  h khX;
  private final Runnable khY = new Runnable()
  {
    public final void run() {}
  };
  final Runnable khZ = new c.2(this);
  private final Runnable kia = new Runnable()
  {
    public final void run()
    {
      MMGIFJNI.restoreRemainder(c.d(c.this));
      c.a(c.this, c.e(c.this), c.f(c.this));
    }
  };
  private final Runnable kib = new c.4(this);
  private final Runnable kic = new c.5(this);
  private final Runnable kid = new Runnable()
  {
    public final void run()
    {
      if (c.g(c.this))
      {
        x.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
        return;
      }
      long l = System.currentTimeMillis();
      if (c.b(c.this) + 1 > c.h(c.this) - 1) {
        c.a(c.this, -1);
      }
      c.a(c.this, c.b(c.this) + 1);
      if (MMGIFJNI.drawFramePixels(c.d(c.this), c.i(c.this), c.j(c.this))) {
        c.k(c.this);
      }
      c.b(c.this, System.currentTimeMillis() - l);
      boolean bool;
      int i;
      if (c.l(c.this) != 0L)
      {
        c.c(c.this, c.l(c.this) - c.m(c.this) - c.n(c.this));
        if (c.f(c.this) < 0L)
        {
          x.d("MicroMsg.GIF.MMGIFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(c.m(c.this)), Long.valueOf(c.n(c.this)), Long.valueOf(c.f(c.this)), Long.valueOf(c.l(c.this)), Integer.valueOf(c.j(c.this)[5]) });
          com.tencent.mm.plugin.report.service.h.mEJ.a(401L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.mEJ.a(401L, 1L, Math.abs(c.f(c.this)), false);
          if (c.f(c.this) < -100L)
          {
            if ((!HardCoderJNI.hcGifEnable) && (!HardCoderJNI.hcGifFrameEnable)) {
              break label458;
            }
            bool = true;
            HardCoderJNI.stopPerformace(bool, c.o(c.this));
            localc = c.this;
            bool = HardCoderJNI.hcGifFrameEnable;
            int j = HardCoderJNI.hcGifFrameDelay;
            int k = HardCoderJNI.hcGifFrameCPU;
            int m = HardCoderJNI.hcGifFrameIO;
            if (!HardCoderJNI.hcGifFrameThr) {
              break label464;
            }
            i = Process.myTid();
            label361:
            c.b(localc, HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcGifFrameTimeout, 602, HardCoderJNI.hcGifFrameAction, "MicroMsg.GIF.MMGIFDrawable"));
          }
        }
      }
      c localc = c.this;
      Runnable localRunnable = c.e(c.this);
      if (c.f(c.this) > 0L) {}
      for (l = c.f(c.this);; l = 0L)
      {
        c.a(localc, localRunnable, l);
        if (c.j(c.this)[2] != 1) {
          break label475;
        }
        c.d(c.this, 5000L);
        return;
        label458:
        bool = false;
        break;
        label464:
        i = 0;
        break label361;
      }
      label475:
      c.d(c.this, c.j(c.this)[4]);
    }
  };
  private float mDensity;
  boolean mIsRunning = true;
  private final Rect rD = new Rect();
  
  private c(AssetFileDescriptor paramAssetFileDescriptor)
  {
    if (paramAssetFileDescriptor == null) {
      throw new NullPointerException("assert file Descriptor is null.");
    }
    boolean bool = HardCoderJNI.hcGifEnable;
    int j = HardCoderJNI.hcGifDelay;
    int k = HardCoderJNI.hcGifCPU;
    int m = HardCoderJNI.hcGifIO;
    if (HardCoderJNI.hcGifThr) {
      i = Process.myTid();
    }
    this.dYK = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcGifTimeout, 602, HardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.khF = paramAssetFileDescriptor;
    this.khE = MMGIFJNI.openByFileDescroptor(this.khF.getFileDescriptor(), paramAssetFileDescriptor.getStartOffset(), this.khG);
    init();
  }
  
  public c(Resources paramResources, int paramInt)
  {
    this(paramResources.openRawResourceFd(paramInt));
  }
  
  public c(InputStream paramInputStream)
  {
    if (paramInputStream == null) {
      throw new NullPointerException("input stream is null.");
    }
    boolean bool = HardCoderJNI.hcGifEnable;
    int j = HardCoderJNI.hcGifDelay;
    int k = HardCoderJNI.hcGifCPU;
    int m = HardCoderJNI.hcGifIO;
    if (HardCoderJNI.hcGifThr) {
      i = Process.myTid();
    }
    this.dYK = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcGifTimeout, 602, HardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.khE = MMGIFJNI.openByInputStrem(paramInputStream, this.khG);
    init();
  }
  
  public c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new NullPointerException("file path is null.");
    }
    boolean bool = HardCoderJNI.hcGifEnable;
    int j = HardCoderJNI.hcGifDelay;
    int k = HardCoderJNI.hcGifCPU;
    int m = HardCoderJNI.hcGifIO;
    if (HardCoderJNI.hcGifThr) {
      i = Process.myTid();
    }
    this.dYK = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcGifTimeout, 602, HardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.khE = MMGIFJNI.openByFilePath(paramString, this.khG);
    init();
  }
  
  public c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("bytes is null.");
    }
    boolean bool = HardCoderJNI.hcGifEnable;
    int j = HardCoderJNI.hcGifDelay;
    int k = HardCoderJNI.hcGifCPU;
    int m = HardCoderJNI.hcGifIO;
    if (HardCoderJNI.hcGifThr) {
      i = Process.myTid();
    }
    this.dYK = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcGifTimeout, 602, HardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.khE = MMGIFJNI.openByByteArray(paramArrayOfByte, this.khG);
    init();
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
  
  private void init()
  {
    x.i("MicroMsg.GIF.MMGIFDrawable", "gif info pointer:%d", new Object[] { Long.valueOf(this.khE) });
    this.khL = this.khG[2];
    this.khT = com.tencent.mm.bp.a.ad(ad.getContext(), a.c.emoji_view_image_size);
    if ((this.khG[0] > 1024) || (this.khG[1] > 1024))
    {
      x.w("MicroMsg.GIF.MMGIFDrawable", "emoji width or height over size. Width:%d Height:%d", new Object[] { Integer.valueOf(this.khG[0]), Integer.valueOf(this.khG[1]) });
      this.khK = new int[this.khT * this.khT];
      this.khU = true;
      com.tencent.mm.plugin.report.service.h.mEJ.a(401L, 2L, 1L, false);
      return;
    }
    this.khK = new int[this.khG[0] * this.khG[1]];
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (this.khJ)
    {
      this.rD.set(getBounds());
      this.khH = (this.rD.width() / this.khG[0]);
      this.khI = (this.rD.height() / this.khG[1]);
      this.khJ = false;
    }
    if (this.cN.getShader() == null)
    {
      if (this.khQ == 0L) {
        this.khQ = System.currentTimeMillis();
      }
      paramCanvas.scale(this.khH, this.khI);
      int[] arrayOfInt = this.khK;
      if (arrayOfInt != null) {
        if (arrayOfInt.length == this.khG[0] * this.khG[1]) {
          paramCanvas.drawBitmap(arrayOfInt, 0, this.khG[0], 0.0F, 0.0F, this.khG[0], this.khG[1], true, this.cN);
        }
      }
      for (;;)
      {
        this.khR = (System.currentTimeMillis() - this.khQ);
        if ((this.khU) || (this.khG[2] <= 0)) {
          break label315;
        }
        if (this.khG[4] < 0) {
          x.i("MicroMsg.GIF.MMGIFDrawable", "current index error. start first frame");
        }
        if ((this.khV == 0) || (this.khW <= this.khV - 1)) {
          break;
        }
        f(this.khY, 0L);
        return;
        paramCanvas.drawRGB(230, 230, 230);
        x.w("MicroMsg.GIF.MMGIFDrawable", "colors is not equal width*height. length:%d width:%d height:%d", new Object[] { Integer.valueOf(arrayOfInt.length), Integer.valueOf(this.khG[0]), Integer.valueOf(this.khG[1]) });
        continue;
        x.e("MicroMsg.GIF.MMGIFDrawable", "colors is null.");
      }
      com.tencent.mm.aj.a.c(this.kid, 0L);
      return;
      label315:
      x.e("MicroMsg.GIF.MMGIFDrawable", "framecount:%d errorcode:%d no post and oversize:%b", new Object[] { Integer.valueOf(this.khG[2]), Integer.valueOf(this.khG[4]), Boolean.valueOf(this.khU) });
      return;
    }
    x.i("MicroMsg.GIF.MMGIFDrawable", "colors drawRect ");
    paramCanvas.drawRect(this.rD, this.cN);
  }
  
  final void f(Runnable paramRunnable, long paramLong)
  {
    this.khS = (SystemClock.uptimeMillis() + paramLong);
    if (this.ioW != null) {
      this.ioW.postAtTime(paramRunnable, this.khS);
    }
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
      super.finalize();
    }
  }
  
  public final int getIntrinsicHeight()
  {
    return (int)(this.khG[1] * getEmojiDensityScale());
  }
  
  public final int getIntrinsicWidth()
  {
    return (int)(this.khG[0] * getEmojiDensityScale());
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
    x.d("MicroMsg.GIF.MMGIFDrawable", "recycle");
    this.khD = true;
    this.mIsRunning = false;
    long l = this.khE;
    this.khE = 0L;
    MMGIFJNI.recycle(l);
    this.khK = null;
    if (this.khF != null) {}
    try
    {
      this.khF.close();
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void reset()
  {
    this.khD = false;
    this.mIsRunning = true;
    com.tencent.mm.aj.a.c(this.kib, 300L);
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
    boolean bool2 = true;
    x.d("MicroMsg.GIF.MMGIFDrawable", "stop");
    this.mIsRunning = false;
    if (this.dYK != 0)
    {
      x.i("MicroMsg.GIF.MMGIFDrawable", "summerhardcoder stopPerformace startPerformance:%x ", new Object[] { Integer.valueOf(this.dYK) });
      bool1 = bool2;
      if (!HardCoderJNI.hcGifEnable) {
        if (!HardCoderJNI.hcGifFrameEnable) {
          break label86;
        }
      }
    }
    label86:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      HardCoderJNI.stopPerformace(bool1, this.dYK);
      this.dYK = 0;
      com.tencent.mm.aj.a.c(this.kic, 300L);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/gif/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */