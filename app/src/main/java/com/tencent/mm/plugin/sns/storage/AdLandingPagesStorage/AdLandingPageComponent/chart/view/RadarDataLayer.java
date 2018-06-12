package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RadarDataLayer
  extends DataLayerView
{
  public static final Point nCB = new Point(0, 0);
  private Path ks = new Path();
  private a nCC;
  private a nCD;
  private b nCE = new b();
  private ValueAnimator nCF;
  private boolean nCG = true;
  private int nCH = 80;
  private Point nCI = nCB;
  private int nCw = 4;
  private float nCz = 1.0F;
  
  public RadarDataLayer(Context paramContext, float paramFloat, a parama)
  {
    super(paramContext);
    this.nCz = paramFloat;
    this.nCE = parama.nBJ;
    this.nCw = parama.size();
    this.nCC = parama;
    paramContext = parama.nBK;
    long l = parama.duration;
    if (l > 0L)
    {
      this.nCF = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.nCD = new a();
      this.nCF.setDuration(l);
      this.nCF.setInterpolator(paramContext);
      this.nCF.addUpdateListener(new RadarDataLayer.1(this));
    }
  }
  
  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    bzJ();
  }
  
  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    bzJ();
  }
  
  private void bzJ()
  {
    setMinimumHeight(160);
    setMinimumWidth(160);
  }
  
  private Paint getPaintLayerBorder()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCE.nBM);
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(this.nCE.nBN);
    localPaint.setAntiAlias(true);
    return localPaint;
  }
  
  private Paint getPaintLayerDotPoint()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCE.nBQ);
    return localPaint;
  }
  
  private Paint getPaintLayerFilling()
  {
    Paint localPaint = new Paint();
    b localb = this.nCE;
    if (localb.nBO == -1) {}
    for (int i = localb.nBM;; i = localb.nBO)
    {
      localPaint.setColor(i);
      localPaint.setStyle(Paint.Style.FILL);
      localPaint.setAntiAlias(true);
      localPaint.setAlpha(this.nCE.nBP);
      return localPaint;
    }
  }
  
  private Paint getPaintLayerPoint()
  {
    Paint localPaint = new Paint();
    localPaint.setColor(this.nCE.nBM);
    localPaint.setStrokeWidth(this.nCE.nBN);
    return localPaint;
  }
  
  protected final int bzG()
  {
    return this.nCH * 2;
  }
  
  protected final int bzH()
  {
    return this.nCH * 2;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = getWidth();
    this.nCH = ((int)(Math.min(i, j) / 2.0F * 0.8D));
    this.nCI.set((int)(j / 2.0F), (int)(i / 2.0F));
    if (this.nCC == null) {
      throw new RuntimeException("Error: NullPointerException at data.");
    }
    if (this.nCC != null)
    {
      Object localObject;
      label108:
      float f1;
      float f2;
      if (this.nCD == null)
      {
        localObject = this.nCC.entrySet();
        localObject = ((Set)localObject).iterator();
        i = 0;
        if (!((Iterator)localObject).hasNext()) {
          break label320;
        }
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        f1 = (float)(this.nCI.x - ((Float)localEntry.getValue()).floatValue() / this.nCz * this.nCH * Math.sin(6.283185307179586D - i * 2 * 3.141592653589793D / this.nCw));
        f2 = (float)(this.nCI.y - ((Float)localEntry.getValue()).floatValue() / this.nCz * this.nCH * Math.cos(6.283185307179586D - i * 2 * 3.141592653589793D / this.nCw));
        if (i != 0) {
          break label308;
        }
        this.ks.moveTo(f1, f2);
      }
      for (;;)
      {
        if (this.nCG) {
          paramCanvas.drawCircle(f1, f2, this.nCE.nBR, getPaintLayerDotPoint());
        }
        i += 1;
        break label108;
        localObject = this.nCD.entrySet();
        break;
        label308:
        this.ks.lineTo(f1, f2);
      }
      label320:
      this.ks.close();
      paramCanvas.drawPath(this.ks, getPaintLayerFilling());
      paramCanvas.drawPath(this.ks, getPaintLayerBorder());
      this.ks.reset();
    }
  }
  
  public void setData(a parama)
  {
    this.nCC = parama;
    invalidate();
  }
  
  public void setGlobalMax(float paramFloat)
  {
    this.nCz = paramFloat;
    invalidate();
  }
  
  public void setLayerStyle(b paramb)
  {
    this.nCE = paramb;
    invalidate();
  }
  
  public void setMaxValue(float paramFloat)
  {
    this.nCz = paramFloat;
    invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/view/RadarDataLayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */