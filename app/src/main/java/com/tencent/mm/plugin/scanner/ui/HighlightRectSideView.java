package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.R.g;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

public class HighlightRectSideView
  extends View
{
  private al eOf = new al(new HighlightRectSideView.1(this), true);
  private Paint kx;
  private boolean[] mIp;
  private Rect mIq;
  private int mIr;
  private int mIs;
  private int mIt;
  private int mIu = 0;
  
  public HighlightRectSideView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = a.decodeResource(getResources(), R.g.scanqr1);
    this.mIr = paramContext.getWidth();
    this.mIs = paramContext.getHeight();
    if (this.mIs != this.mIr) {
      x.e("MicroMsg.HighlightRectSideView", "width is not same as height");
    }
    this.mIt = (this.mIr * 6 / 24);
    this.mIp = new boolean[4];
    this.kx = new Paint();
    this.kx.setColor(6676738);
    this.kx.setAlpha(255);
    this.kx.setStrokeWidth(this.mIt);
    this.kx.setStyle(Paint.Style.STROKE);
    this.eOf.J(300L, 300L);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.eOf != null)
    {
      this.eOf.SO();
      this.eOf = null;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = 0;
    if (i < 4) {
      if (this.mIp[i] != 0) {}
    }
    for (i = 0;; i = 1)
    {
      int j = this.mIt / 2;
      if ((this.mIp[0] != 0) && ((1 == i) || (this.mIu % 2 == 0))) {
        paramCanvas.drawLine(this.mIq.left + j, this.mIq.top + this.mIs, this.mIq.left + j, this.mIq.bottom - this.mIs, this.kx);
      }
      if ((this.mIp[1] != 0) && ((1 == i) || (this.mIu % 2 == 0))) {
        paramCanvas.drawLine(this.mIq.right - j, this.mIq.top + this.mIs, this.mIq.right - j, this.mIq.bottom - this.mIs, this.kx);
      }
      if ((this.mIp[2] != 0) && ((1 == i) || (this.mIu % 3 == 0))) {
        paramCanvas.drawLine(this.mIq.left + this.mIr, this.mIq.top + j, this.mIq.right - this.mIr, this.mIq.top + j, this.kx);
      }
      if ((this.mIp[3] != 0) && ((1 == i) || (this.mIu % 3 == 0))) {
        paramCanvas.drawLine(this.mIq.left + this.mIr, this.mIq.bottom - j, this.mIq.right - this.mIr, this.mIq.bottom - j, this.kx);
      }
      return;
      i += 1;
      break;
    }
  }
  
  public void setMaskRect(Rect paramRect)
  {
    this.mIq = paramRect;
    x.d("MicroMsg.HighlightRectSideView", "rect:%s", new Object[] { paramRect });
  }
  
  public void setShowRectEdges(boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    if ((paramArrayOfBoolean == null) || (4 != paramArrayOfBoolean.length)) {
      return;
    }
    x.d("MicroMsg.HighlightRectSideView", "%s, %s, %s, %s", new Object[] { Boolean.valueOf(paramArrayOfBoolean[0]), Boolean.valueOf(paramArrayOfBoolean[1]), Boolean.valueOf(paramArrayOfBoolean[2]), Boolean.valueOf(paramArrayOfBoolean[3]) });
    while (i < 4)
    {
      this.mIp[i] = paramArrayOfBoolean[i];
      i += 1;
    }
    invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/HighlightRectSideView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */