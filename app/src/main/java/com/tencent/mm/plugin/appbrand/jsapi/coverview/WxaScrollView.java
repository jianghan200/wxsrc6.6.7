package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.tencent.mm.plugin.appbrand.jsapi.o.e;

public class WxaScrollView
  extends FrameLayout
  implements o, p, e
{
  private float cQ;
  private int doi;
  private float fPH;
  private int fPI;
  private Paint fPJ = new Paint();
  private FrameLayout fPR;
  private ScrollView fPS;
  private m fPT;
  private boolean fPU = true;
  private boolean fPV = true;
  
  public WxaScrollView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public WxaScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public WxaScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.fPS = new WxaScrollView.1(this, getContext());
    this.fPR = new FrameLayout(getContext());
    super.addView(this.fPS, 0, new ViewGroup.LayoutParams(-1, -1));
    this.fPS.addView(this.fPR, 0, new ViewGroup.LayoutParams(-1, -2));
    this.fPJ.setStyle(Paint.Style.STROKE);
    this.fPJ.setAntiAlias(true);
    setWillNotDraw(false);
  }
  
  public void addView(View paramView, int paramInt)
  {
    this.fPR.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.fPR.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getActionMasked() == 0)
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      double d1;
      float f3;
      float f4;
      double d2;
      int i;
      if (this.fPH > 0.0F)
      {
        d1 = Math.pow(this.fPH, 2.0D);
        f3 = getWidth();
        f4 = getHeight();
        if (f1 < this.fPH) {
          if (f2 < this.fPH)
          {
            d2 = Math.pow(this.fPH - f1, 2.0D);
            if (Math.pow(this.fPH - f2, 2.0D) + d2 <= d1) {
              break label315;
            }
            i = 0;
          }
        }
      }
      while (i == 0)
      {
        return false;
        if (f2 > f4 - this.fPH)
        {
          d2 = Math.pow(this.fPH - f1, 2.0D);
          if (Math.pow(this.fPH + f2 - f4, 2.0D) + d2 > d1)
          {
            i = 0;
            continue;
            if (f1 > f3 - this.fPH) {
              if (f2 < this.fPH)
              {
                d2 = Math.pow(f1 + this.fPH - f3, 2.0D);
                if (Math.pow(this.fPH - f2, 2.0D) + d2 > d1) {
                  i = 0;
                }
              }
              else if (f2 > f4 - this.fPH)
              {
                d2 = Math.pow(f1 + this.fPH - f3, 2.0D);
                if (Math.pow(this.fPH + f2 - f4, 2.0D) + d2 > d1)
                {
                  i = 0;
                  continue;
                }
              }
            }
          }
        }
        label315:
        i = 1;
      }
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void draw(Canvas paramCanvas)
  {
    float f2 = 0.0F;
    int i;
    if (this.fPH > 0.0F)
    {
      i = 1;
      if (i != 0)
      {
        paramCanvas.save();
        localPath = new Path();
        localPath.addRoundRect(new RectF(0.0F, 0.0F, getWidth(), getHeight()), this.fPH, this.fPH, Path.Direction.CW);
        paramCanvas.clipPath(localPath);
      }
      if (this.doi != 0) {
        paramCanvas.drawColor(this.doi);
      }
      if (this.cQ <= 0.0F) {
        break label293;
      }
      float f1 = this.cQ / 2.0F;
      paramCanvas.drawRoundRect(new RectF(f1, f1, getWidth() - f1, getHeight() - f1), this.fPH, this.fPH, this.fPJ);
      if (i != 0) {
        paramCanvas.restore();
      }
      paramCanvas.save();
      Path localPath = new Path();
      f1 = f2;
      if (this.fPH > 0.0F)
      {
        f1 = f2;
        if (this.fPH - this.cQ > 0.0F) {
          f1 = this.fPH - this.cQ;
        }
      }
      localPath.addRoundRect(new RectF(this.cQ, this.cQ, getWidth() - this.cQ, getHeight() - this.cQ), f1, f1, Path.Direction.CW);
      paramCanvas.clipPath(localPath);
      i = 1;
    }
    label293:
    for (;;)
    {
      int j = paramCanvas.save();
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(j);
      if (i != 0) {
        paramCanvas.restore();
      }
      return;
      i = 0;
      break;
    }
  }
  
  public ViewGroup getTargetView()
  {
    return this.fPR;
  }
  
  public int getTargetViewChildCount()
  {
    return this.fPR.getChildCount();
  }
  
  public void removeView(View paramView)
  {
    this.fPR.removeView(paramView);
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    this.fPS.scrollTo(paramInt1, paramInt2);
    invalidate();
  }
  
  public void setBgColor(int paramInt)
  {
    this.doi = paramInt;
  }
  
  public void setBorderColor(int paramInt)
  {
    this.fPI = paramInt;
    this.fPJ.setColor(paramInt);
  }
  
  public void setBorderRadius(float paramFloat)
  {
    this.fPH = paramFloat;
  }
  
  public void setBorderWidth(float paramFloat)
  {
    this.cQ = paramFloat;
    this.fPJ.setStrokeWidth(paramFloat);
  }
  
  public void setOnScrollChangedListener(m paramm)
  {
    this.fPT = paramm;
  }
  
  public void setScrollHorizontal(boolean paramBoolean)
  {
    this.fPV = paramBoolean;
  }
  
  public void setScrollVertical(boolean paramBoolean)
  {
    this.fPU = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/coverview/WxaScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */