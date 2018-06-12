package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mm.bp.a;

public class CardTagTextView
  extends TextView
{
  private int fillColor = 0;
  private int hAy = 3;
  private RectF hIU = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
  private Paint hIV = new Paint();
  private int hIW = 9;
  private int hIX = 0;
  
  public CardTagTextView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.hAy = Math.round(a.getDensity(getContext()) * 0.5F);
    this.hIW = a.fromDPToPix(getContext(), 3);
    this.hIX = getCurrentTextColor();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.hIU.left = this.hIW;
    this.hIU.top = this.hAy;
    this.hIU.right = (getWidth() - this.hIW);
    this.hIU.bottom = (getHeight() - this.hAy);
    if (this.fillColor != 0)
    {
      this.hIV.setColor(this.fillColor);
      this.hIV.setStyle(Paint.Style.FILL);
      paramCanvas.drawRoundRect(this.hIU, getHeight() / 2 - this.hAy, getHeight() / 2 - this.hAy, this.hIV);
    }
    this.hIV.setColor(this.hIX);
    this.hIV.setStrokeWidth(this.hAy);
    this.hIV.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRoundRect(this.hIU, getHeight() / 2 - this.hAy, getHeight() / 2 - this.hAy, this.hIV);
    super.onDraw(paramCanvas);
  }
  
  public void setFillColor(int paramInt)
  {
    this.fillColor = paramInt;
  }
  
  public void setTextColor(int paramInt)
  {
    this.hIX = paramInt;
    super.setTextColor(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/widget/CardTagTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */