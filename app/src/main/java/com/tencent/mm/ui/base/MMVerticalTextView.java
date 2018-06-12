package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.mm.w.a.m;

public class MMVerticalTextView
  extends View
{
  private TextPaint dG = new TextPaint();
  private int direction;
  private String gEw;
  Rect tys = new Rect();
  
  public MMVerticalTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.dG.setAntiAlias(true);
    this.dG.setTextSize(15.0F);
    this.dG.setColor(-16777216);
    this.dG.setTextAlign(Paint.Align.CENTER);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.verticaltextview);
    int i = paramAttributeSet.getResourceId(a.m.verticaltextview_text, 0);
    if (i != 0) {
      this.gEw = paramContext.getString(i);
    }
    i = paramAttributeSet.getDimensionPixelOffset(a.m.verticaltextview_textSize, 15);
    if (i > 0) {
      this.dG.setTextSize(i);
    }
    this.dG.setColor(paramAttributeSet.getColor(a.m.verticaltextview_textColor, -16777216));
    this.direction = paramAttributeSet.getInt(a.m.verticaltextview_direction, 0);
    boolean bool = paramAttributeSet.getBoolean(a.m.verticaltextview_textBold, false);
    this.dG.setFakeBoldText(bool);
    paramAttributeSet.recycle();
    requestLayout();
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getHeight();
    Path localPath = new Path();
    int j;
    if (this.direction == 0)
    {
      j = (getWidth() >> 1) - (this.tys.height() >> 1);
      localPath.moveTo(j, 0.0F);
      localPath.lineTo(j, i);
    }
    for (;;)
    {
      paramCanvas.drawTextOnPath(this.gEw, localPath, 0.0F, 0.0F, this.dG);
      return;
      j = (getWidth() >> 1) + (this.tys.height() >> 1);
      localPath.moveTo(j, i);
      localPath.lineTo(j, 0.0F);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.dG.getTextBounds(this.gEw, 0, this.gEw.length(), this.tys);
    int j = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (j == 1073741824) {}
    for (;;)
    {
      j = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (j == 1073741824) {}
      int i;
      for (;;)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        return;
        i = this.tys.height();
        if (j != Integer.MIN_VALUE) {
          break label119;
        }
        paramInt1 = Math.min(i, paramInt1);
        break;
        i = this.tys.width();
        if (j == Integer.MIN_VALUE) {
          paramInt2 = Math.min(i, paramInt2);
        } else {
          paramInt2 = i;
        }
      }
      label119:
      paramInt1 = i;
    }
  }
  
  public void setText(String paramString)
  {
    this.gEw = paramString;
    requestLayout();
    invalidate();
  }
  
  public void setTextColor(int paramInt)
  {
    this.dG.setColor(paramInt);
    invalidate();
  }
  
  public void setTextSize(int paramInt)
  {
    this.dG.setTextSize(paramInt);
    requestLayout();
    invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/MMVerticalTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */