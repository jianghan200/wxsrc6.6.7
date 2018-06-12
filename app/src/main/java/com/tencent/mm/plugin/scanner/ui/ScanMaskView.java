package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.compatible.util.d;

public class ScanMaskView
  extends View
{
  private Paint cN;
  private Bitmap mJC = null;
  private Bitmap mJD = null;
  private Bitmap mJE = null;
  private Bitmap mJF = null;
  int mJG = 0;
  int mJH = 0;
  private boolean mJI = false;
  private Rect mJJ = new Rect();
  private Rect mJK = new Rect();
  private Rect mJL = new Rect();
  private Rect mJM = new Rect();
  private Rect mJN = new Rect();
  private Rect mJO = new Rect();
  private Rect mJP = new Rect();
  private Rect mJQ = new Rect();
  private Rect mJR = new Rect();
  private Path mJS = new Path();
  Rect mJT;
  private PorterDuffXfermode mJU;
  private int mJV = R.e.scan_mask_bg_color;
  private long mJW = 0L;
  boolean mJX = false;
  Rect mJY;
  private final long mJZ = 200L;
  float mKa = 0.0F;
  float mKb = 0.0F;
  float mKc = 0.0F;
  float mKd = 0.0F;
  private Paint mKe;
  ValueAnimator mKf = null;
  
  public ScanMaskView(Context paramContext, Rect paramRect)
  {
    super(paramContext);
    this.mJT = paramRect;
    getDrawingRect(this.mJJ);
    this.cN = new Paint();
    this.mJC = a.decodeResource(getResources(), R.g.scanqr1);
    this.mJD = a.decodeResource(getResources(), R.g.scanqr2);
    this.mJE = a.decodeResource(getResources(), R.g.scanqr3);
    this.mJF = a.decodeResource(getResources(), R.g.scanqr4);
    this.mJG = this.mJC.getWidth();
    this.mJH = this.mJC.getHeight();
    this.mKe = new Paint();
    this.mJU = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
  }
  
  public ScanMaskView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void bsL()
  {
    this.mJI = true;
    if (this.mJC != null)
    {
      this.mJC.recycle();
      this.mJC = null;
    }
    if (this.mJD != null)
    {
      this.mJD.recycle();
      this.mJD = null;
    }
    if (this.mJE != null)
    {
      this.mJE.recycle();
      this.mJE = null;
    }
    if (this.mJF != null)
    {
      this.mJF.recycle();
      this.mJF = null;
    }
  }
  
  public long getMaskAnimDuration()
  {
    return 200L;
  }
  
  public Rect getMaskRect()
  {
    return this.mJT;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.mJT == null) || (this.mJI)) {
      return;
    }
    System.currentTimeMillis();
    System.currentTimeMillis();
    int i = paramCanvas.save();
    this.cN.reset();
    if (d.fS(18))
    {
      this.mJO.left = 0;
      this.mJO.top = this.mJT.top;
      this.mJO.right = this.mJT.left;
      this.mJO.bottom = this.mJT.bottom;
      this.mJP.left = this.mJT.left;
      this.mJP.top = 0;
      this.mJP.right = this.mJT.right;
      this.mJP.bottom = this.mJT.top;
      this.mJQ.left = this.mJT.right;
      this.mJQ.top = this.mJT.top;
      this.mJQ.right = getWidth();
      this.mJQ.bottom = this.mJT.bottom;
      this.mJR.left = this.mJT.left;
      this.mJR.top = this.mJT.bottom;
      this.mJR.right = this.mJT.right;
      this.mJR.bottom = getHeight();
      this.mJK.left = 0;
      this.mJK.top = 0;
      this.mJK.right = this.mJT.left;
      this.mJK.bottom = this.mJT.top;
      this.mJL.left = this.mJT.right;
      this.mJL.top = 0;
      this.mJL.right = getWidth();
      this.mJL.bottom = this.mJT.top;
      this.mJM.left = 0;
      this.mJM.top = this.mJT.bottom;
      this.mJM.right = this.mJT.left;
      this.mJM.bottom = getHeight();
      this.mJN.left = this.mJT.right;
      this.mJN.top = this.mJT.bottom;
      this.mJN.right = getWidth();
      this.mJN.bottom = getHeight();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJO, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJP, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJQ, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJR, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJK, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJL, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJM, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.mJN, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
      paramCanvas.restore();
    }
    for (;;)
    {
      System.currentTimeMillis();
      System.currentTimeMillis();
      paramCanvas.restoreToCount(i);
      this.cN.reset();
      this.cN.setStyle(Paint.Style.STROKE);
      this.cN.setStrokeWidth(1.0F);
      this.cN.setColor(-3355444);
      this.cN.setAntiAlias(true);
      paramCanvas.drawRect(this.mJT, this.cN);
      System.currentTimeMillis();
      System.currentTimeMillis();
      paramCanvas.drawBitmap(this.mJC, this.mJT.left, this.mJT.top, this.mKe);
      paramCanvas.drawBitmap(this.mJD, this.mJT.right - this.mJG, this.mJT.top, this.mKe);
      paramCanvas.drawBitmap(this.mJE, this.mJT.left, this.mJT.bottom - this.mJH, this.mKe);
      paramCanvas.drawBitmap(this.mJF, this.mJT.right - this.mJG, this.mJT.bottom - this.mJH, this.mKe);
      System.currentTimeMillis();
      super.onDraw(paramCanvas);
      System.currentTimeMillis();
      return;
      paramCanvas.clipRect(this.mJT, Region.Op.DIFFERENCE);
      paramCanvas.drawColor(getResources().getColor(this.mJV));
    }
  }
  
  public void setMaskColorRsid(int paramInt)
  {
    this.mJV = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/ScanMaskView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */