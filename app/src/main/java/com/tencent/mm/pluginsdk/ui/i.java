package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class i
  extends BitmapDrawable
  implements d.a
{
  protected static final Paint dvs;
  protected static final ag dvt = new ag(Looper.getMainLooper());
  private Runnable dvv;
  private Paint fBa = new Paint();
  protected final a lZs;
  protected boolean lkD = false;
  protected boolean qFD = false;
  private int qFE = 0;
  private int qFF = 0;
  protected boolean qFG;
  protected boolean qFH;
  protected float qFI = 1.0F;
  private PaintFlagsDrawFilter qFJ = new PaintFlagsDrawFilter(0, 3);
  private Path qFK;
  private Rect rect = new Rect();
  protected String tag;
  
  static
  {
    Paint localPaint = new Paint();
    dvs = localPaint;
    localPaint.setAntiAlias(true);
    dvs.setFilterBitmap(true);
  }
  
  public i(a parama, String paramString)
  {
    super(parama.uM());
    this.fBa.setStyle(Paint.Style.STROKE);
    this.fBa.setFlags(1);
    this.fBa.setAntiAlias(true);
    this.qFK = new Path();
    this.dvv = new Runnable()
    {
      public final void run()
      {
        i.this.invalidateSelf();
      }
    };
    this.lZs = parama;
    this.tag = paramString;
    this.lZs.a(this);
  }
  
  public i(a parama, String paramString, byte paramByte)
  {
    super(parama.uM());
    this.fBa.setStyle(Paint.Style.STROKE);
    this.fBa.setFlags(1);
    this.fBa.setAntiAlias(true);
    this.qFK = new Path();
    this.dvv = new Runnable()
    {
      public final void run()
      {
        i.this.invalidateSelf();
      }
    };
    this.lkD = false;
    this.lZs = parama;
    this.tag = paramString;
    this.lZs.a(this);
  }
  
  public final void Tw(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    while (paramString.equals(this.tag)) {
      return;
    }
    this.tag = paramString;
    dvt.post(this.dvv);
  }
  
  public final void cdg()
  {
    this.qFG = true;
  }
  
  public final void cdh()
  {
    if (!this.qFG) {}
    do
    {
      return;
      this.qFG = false;
    } while (!this.qFH);
    this.qFH = false;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap;
    if (this.qFD)
    {
      localBitmap = this.lZs.b(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight(), 1);
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        break label204;
      }
      localBitmap = this.lZs.uM();
      if (!this.qFG) {
        break label196;
      }
      this.qFH = true;
    }
    for (;;)
    {
      Rect localRect2 = getBounds();
      Rect localRect1 = null;
      if ((this.qFI > 1.0F) || (this.lkD))
      {
        int i = localBitmap.getHeight() / 15 / 2;
        int j = localBitmap.getWidth() / 15 / 2;
        localRect1 = new Rect(j, i, localBitmap.getWidth() - j, localBitmap.getHeight() - i);
      }
      paramCanvas.drawBitmap(localBitmap, localRect1, localRect2, dvs);
      return;
      if (this.qFG)
      {
        localBitmap = this.lZs.cK(this.tag);
        break;
      }
      localBitmap = this.lZs.cJ(this.tag);
      break;
      label196:
      this.qFH = false;
      continue;
      label204:
      this.qFH = false;
    }
  }
  
  public void jX(String paramString)
  {
    if ((paramString == null) || (!paramString.equals(this.tag))) {
      return;
    }
    x.v("MicroMsg.SDK.LazyBitmapDrawable", "notifyChanged :%s", new Object[] { paramString });
    dvt.post(this.dvv);
  }
  
  public final void kD(boolean paramBoolean)
  {
    this.qFD = paramBoolean;
  }
  
  public void onScrollStateChanged(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.qFG = true;
      return;
    }
    cdh();
  }
  
  public static abstract interface a
  {
    public abstract void a(i parami);
    
    public abstract Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract Bitmap cJ(String paramString);
    
    public abstract Bitmap cK(String paramString);
    
    public abstract Bitmap uM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */