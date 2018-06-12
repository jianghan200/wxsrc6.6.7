package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends a
{
  private final Paint cN = new Paint(6);
  private ag ioW = new ag(Looper.getMainLooper());
  public int irJ = 0;
  private float khH = 1.0F;
  private float khI = 1.0F;
  private boolean khJ;
  private long khS = 0L;
  private final Runnable khY = new d.2(this);
  private final Runnable khZ = new d.1(this);
  private volatile boolean kif = false;
  private int kig;
  private int kih;
  private int[] kii;
  private Bitmap kij = null;
  private boolean kik = false;
  public boolean kil = true;
  private String kim;
  public int kin = 0;
  private h kio;
  private Context mContext;
  private int mHeight;
  public boolean mIsPlaying = true;
  private Resources mResources;
  private int mWidth;
  private final Rect rD = new Rect();
  
  public d(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, int paramInt, int[] paramArrayOfInt, String paramString)
  {
    this.mContext = paramContext;
    this.mResources = this.mContext.getResources();
    this.kik = false;
    this.mIsPlaying = paramBoolean1;
    this.kil = paramBoolean2;
    this.kim = paramString;
    this.kih = paramInt;
    this.kii = paramArrayOfInt;
    if (!paramBoolean1)
    {
      this.kij = rf(EB(paramString));
      this.mWidth = this.kij.getWidth();
      this.mHeight = this.kij.getHeight();
      if (this.kii.length != 3) {
        break label244;
      }
    }
    label244:
    for (this.kig = 300;; this.kig = 100)
    {
      this.kin = 0;
      return;
      this.kij = rf(this.kii[0]);
      break;
    }
  }
  
  private int EB(String paramString)
  {
    paramString = paramString.split("\\.")[0];
    return this.mResources.getIdentifier(paramString, "drawable", this.mContext.getPackageName());
  }
  
  private void f(Runnable paramRunnable, long paramLong)
  {
    this.khS = (SystemClock.uptimeMillis() + paramLong);
    if (this.ioW != null) {
      this.ioW.postDelayed(paramRunnable, paramLong);
    }
  }
  
  private Bitmap rf(int paramInt)
  {
    return BitmapFactory.decodeResource(this.mResources, paramInt);
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
      paramCanvas.scale(this.khH, this.khI);
      if (this.kik)
      {
        this.kij = rf(this.kih);
        if ((this.kij != null) && (!this.kij.isRecycled())) {
          paramCanvas.drawBitmap(this.kij, 0.0F, 0.0F, this.cN);
        }
      }
      do
      {
        return;
        if (this.mIsPlaying) {
          break;
        }
        this.kij = rf(EB(this.kim));
      } while ((this.kij == null) || (this.kij.isRecycled()));
      paramCanvas.drawBitmap(this.kij, 0.0F, 0.0F, this.cN);
      return;
      this.kij = rf(this.kii[this.irJ]);
      if ((this.kij != null) && (!this.kij.isRecycled())) {
        paramCanvas.drawBitmap(this.kij, 0.0F, 0.0F, this.cN);
      }
      this.irJ += 1;
      if (this.kin < 3)
      {
        if (this.irJ >= this.kii.length)
        {
          this.irJ = 0;
          if (this.kil) {
            break label296;
          }
        }
        label296:
        for (this.kin = 0;; this.kin += 1)
        {
          f(this.khZ, this.kig);
          return;
        }
      }
      this.mIsPlaying = false;
      f(this.khZ, this.kig);
      f(this.khY, 0L);
      return;
    }
    x.i("MicroMsg.GIF.MMGIFGameDrawable", "shader is not null.");
    paramCanvas.drawRect(this.rD, this.cN);
  }
  
  protected final void finalize()
  {
    this.kio = null;
    super.finalize();
  }
  
  public final int getIntrinsicHeight()
  {
    return this.mHeight;
  }
  
  public final int getIntrinsicWidth()
  {
    return this.mWidth;
  }
  
  public final int getOpacity()
  {
    return -2;
  }
  
  public final boolean isRunning()
  {
    return this.kif;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.khJ = true;
  }
  
  public final void recycle() {}
  
  public final void reset() {}
  
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
    this.kif = true;
    this.ioW.post(this.khZ);
  }
  
  public final void stop()
  {
    this.kif = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/gif/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */