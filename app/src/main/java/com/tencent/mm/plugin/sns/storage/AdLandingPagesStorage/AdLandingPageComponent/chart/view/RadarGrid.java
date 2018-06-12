package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView;
import java.util.ArrayList;
import java.util.List;

public class RadarGrid
  extends ChartGridView
{
  public static final Point nCB = new Point(0, 0);
  private Rect cO = new Rect();
  private Path ks = new Path();
  private c nCA;
  private int nCH = 80;
  private Point nCI = nCB;
  private Spannable[] nCK;
  private List<PointF> nCL;
  private int nCw = 4;
  private int nCx = 4;
  private float nCz = 1.0F;
  
  public RadarGrid(Context paramContext, int paramInt1, int paramInt2, float paramFloat, Spannable[] paramArrayOfSpannable, c paramc)
  {
    super(paramContext);
    this.nCz = paramFloat;
    this.nCw = paramInt1;
    this.nCx = paramInt2;
    this.nCz = paramFloat;
    this.nCK = paramArrayOfSpannable;
    this.nCA = paramc;
  }
  
  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    bzJ();
  }
  
  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    bzJ();
  }
  
  private List<PointF> at(float paramFloat)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < this.nCw)
    {
      PointF localPointF = new PointF();
      localPointF.set((float)(this.nCI.x - this.nCH * paramFloat * Math.sin(i * 2 * 3.141592653589793D / this.nCw)), (float)(this.nCI.y - this.nCH * paramFloat * Math.cos(i * 2 * 3.141592653589793D / this.nCw)));
      localArrayList.add(localPointF);
      i += 1;
    }
    return localArrayList;
  }
  
  private void bzJ()
  {
    setMinimumHeight(160);
    setMinimumWidth(160);
  }
  
  private int getGridDotRadius()
  {
    return this.nCA.nCl;
  }
  
  private Paint getPaintGLabelFont()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCA.nCc);
    localPaint.setTextSize(this.nCA.nCd);
    return localPaint;
  }
  
  private Paint getPaintGScaleFont()
  {
    Paint localPaint = new Paint();
    c localc = this.nCA;
    if (localc.nCf == -1) {}
    for (int i = localc.nCc;; i = localc.nCf)
    {
      localPaint.setColor(i);
      localPaint.setTextSize(this.nCA.nCg);
      return localPaint;
    }
  }
  
  private Paint getPaintGridBorder()
  {
    Paint localPaint = new Paint();
    c localc = this.nCA;
    int i;
    if (localc.nBX == -1)
    {
      i = localc.nBY;
      localPaint.setColor(i);
      localPaint.setStyle(Paint.Style.STROKE);
      localc = this.nCA;
      if (localc.nCb != -1.0F) {
        break label85;
      }
    }
    label85:
    for (float f = localc.nCa;; f = localc.nCb)
    {
      localPaint.setStrokeWidth(f);
      localPaint.setAntiAlias(true);
      return localPaint;
      i = localc.nBX;
      break;
    }
  }
  
  private Paint getPaintGridDot()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCA.nCk);
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setAntiAlias(true);
    return localPaint;
  }
  
  private Paint getPaintGridFill()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCA.backgroundColor);
    localPaint.setAntiAlias(true);
    return localPaint;
  }
  
  private Paint getPaintGridLatitude()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCA.nBY);
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(this.nCA.nCa);
    localPaint.setAntiAlias(true);
    return localPaint;
  }
  
  private Paint getPaintGridLongitude()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCA.nBZ);
    localPaint.setStrokeWidth(this.nCA.nCa);
    return localPaint;
  }
  
  private TextPaint getTextPaintGLabelFont()
  {
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setColor(this.nCA.nCc);
    localTextPaint.setTextSize(this.nCA.nCd);
    return localTextPaint;
  }
  
  protected final int bzG()
  {
    return this.nCH * 2;
  }
  
  protected final int bzH()
  {
    return this.nCH * 2;
  }
  
  public c getGridStyle()
  {
    return this.nCA;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int j = getHeight();
    int i = getWidth();
    this.nCH = ((int)(Math.min(j, i) / 2.0F * 0.8D));
    this.nCI.set((int)(i / 2.0F), (int)(j / 2.0F));
    if (this.nCA.nCm != null)
    {
      i = (int)(i / 2.0F);
      j = (int)(j / 2.0F);
      int k = (int)(this.nCH * 2 + this.nCA.nCj * 2.0F);
      int m = this.nCA.nCm.getWidth() * k / this.nCA.nCm.getHeight();
      if (this.nCA.nCm != null) {
        paramCanvas.drawBitmap(Bitmap.createScaledBitmap(this.nCA.nCm, m, k, false), i - (m >>> 1), j - (k >>> 1), null);
      }
    }
    if (this.nCA.nBT) {
      switch (this.nCA.nBS)
      {
      }
    }
    Object localObject;
    while (this.nCA.nBU)
    {
      this.nCL = at(1.0F);
      i = 0;
      while (i < this.nCw)
      {
        localObject = (PointF)this.nCL.get(i);
        paramCanvas.drawLine(this.nCI.x, this.nCI.y, ((PointF)localObject).x, ((PointF)localObject).y, getPaintGridLongitude());
        i += 1;
      }
      paramCanvas.drawCircle(this.nCI.x, this.nCI.y, this.nCH, getPaintGridFill());
      continue;
      this.nCL = at(1.0F);
      i = 0;
      if (i < this.nCw)
      {
        localObject = (PointF)this.nCL.get(i);
        if (i == 0) {
          this.ks.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
        }
        for (;;)
        {
          i += 1;
          break;
          this.ks.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
        }
      }
      this.ks.close();
      if ((this.nCA.backgroundColor != 0) && (this.nCA.nCm == null)) {
        paramCanvas.drawPath(this.ks, getPaintGridFill());
      }
    }
    if (this.nCA.nBT) {
      switch (this.nCA.nBS)
      {
      }
    }
    float f1;
    label872:
    float f2;
    for (;;)
    {
      if ((this.nCK != null) && (this.nCA.nBW)) {
        if (this.nCK.length != this.nCw)
        {
          throw new RuntimeException("Labels array length not matches longitude lines number.");
          paramCanvas.drawCircle(this.nCI.x, this.nCI.y, this.nCH, getPaintGridBorder());
          i = 1;
          while (i < this.nCx)
          {
            paramCanvas.drawCircle(this.nCI.x, this.nCI.y, this.nCH * (i * 1.0F / this.nCx), getPaintGridLatitude());
            i += 1;
          }
          paramCanvas.drawPath(this.ks, getPaintGridBorder());
          this.ks.reset();
          i = 1;
          while (i < this.nCx)
          {
            this.nCL = at(i * 1.0F / this.nCx);
            j = 0;
            if (j < this.nCw)
            {
              localObject = (PointF)this.nCL.get(j);
              if (j == 0) {
                this.ks.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
              }
              for (;;)
              {
                paramCanvas.drawCircle(((PointF)localObject).x, ((PointF)localObject).y, getGridDotRadius(), getPaintGridDot());
                j += 1;
                break;
                this.ks.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
              }
            }
            this.ks.close();
            paramCanvas.drawPath(this.ks, getPaintGridLatitude());
            this.ks.reset();
            i += 1;
          }
        }
        else
        {
          i = 0;
          if (i < this.nCw)
          {
            localObject = this.nCK[i];
            if (!localObject.equals(null))
            {
              if ((i != 0) && (i != this.nCw >>> 1)) {
                break label1056;
              }
              f1 = 0.5F;
              if (i != 0) {
                break label1082;
              }
              f2 = this.nCA.nCe;
            }
          }
        }
      }
    }
    for (;;)
    {
      localObject = new StaticLayout((CharSequence)localObject, getTextPaintGLabelFont(), 1000, Layout.Alignment.ALIGN_NORMAL, 0.0F, 0.0F, false);
      f1 = (float)(this.nCI.x - ((StaticLayout)localObject).getLineWidth(0) * f1 - (this.nCH + this.nCA.nCe) * Math.sin(6.283185307179586D - i * 2 * 3.141592653589793D / this.nCw));
      f2 = (float)(this.nCI.y - ((StaticLayout)localObject).getHeight() / 2 - (this.nCH + this.nCA.nCe) * Math.cos(6.283185307179586D - i * 2 * 3.141592653589793D / this.nCw) - f2);
      paramCanvas.save();
      paramCanvas.translate(f1, f2);
      ((StaticLayout)localObject).draw(paramCanvas);
      paramCanvas.restore();
      i += 1;
      break;
      label1056:
      if ((i > 0) && (i < this.nCw >>> 1))
      {
        f1 = 0.0F;
        break label872;
      }
      f1 = 1.0F;
      break label872;
      label1082:
      if (i == this.nCw >>> 1) {
        f2 = -this.nCA.nCe;
      } else {
        f2 = 0.0F;
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.nCA.backgroundColor = paramInt;
    invalidate();
  }
  
  public void setGridBorderColor(int paramInt)
  {
    this.nCA.nBX = paramInt;
    invalidate();
  }
  
  public void setGridBorderStrokeWidth(float paramFloat)
  {
    this.nCA.nCb = paramFloat;
    invalidate();
  }
  
  public void setGridChartType(int paramInt)
  {
    this.nCA.nBS = paramInt;
    invalidate();
  }
  
  public void setGridLabelColor(int paramInt)
  {
    this.nCA.nCc = paramInt;
    invalidate();
  }
  
  public void setGridLabelPadding(float paramFloat)
  {
    this.nCA.nCe = paramFloat;
    invalidate();
  }
  
  public void setGridLabelSize(float paramFloat)
  {
    this.nCA.nCd = paramFloat;
    invalidate();
  }
  
  public void setGridLatitudeColor(int paramInt)
  {
    this.nCA.nBY = paramInt;
    invalidate();
  }
  
  public void setGridLongitudeColor(int paramInt)
  {
    this.nCA.nBZ = paramInt;
    invalidate();
  }
  
  public void setGridScaleColor(int paramInt)
  {
    this.nCA.nCf = paramInt;
    invalidate();
  }
  
  public void setGridScaleLabelPadding(float paramFloat)
  {
    this.nCA.nCh = paramFloat;
    invalidate();
  }
  
  public void setGridScaleSize(float paramFloat)
  {
    this.nCA.nCg = paramFloat;
    invalidate();
  }
  
  public void setGridStrokeWidth(float paramFloat)
  {
    this.nCA.nCa = paramFloat;
    invalidate();
  }
  
  public void setGridStyle(c paramc)
  {
    this.nCA = paramc;
    invalidate();
  }
  
  public void setLabelsArray(Spannable[] paramArrayOfSpannable)
  {
    this.nCK = paramArrayOfSpannable;
    invalidate();
  }
  
  public void setLatNum(int paramInt)
  {
    this.nCx = paramInt;
    invalidate();
  }
  
  public void setLonNum(int paramInt)
  {
    this.nCw = paramInt;
    invalidate();
  }
  
  public void setMaxValue(float paramFloat)
  {
    this.nCz = paramFloat;
    invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/view/RadarGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */