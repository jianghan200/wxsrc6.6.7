package com.tencent.mm.plugin.game.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.mm.bp.a;

public class TextProgressBar
  extends ProgressBar
{
  private Paint cN;
  private String gEw;
  private int gbP;
  private Context mContext;
  private int pF;
  
  public TextProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  private void setText(int paramInt)
  {
    this.pF = paramInt;
    this.gEw = (String.valueOf(paramInt) + "%");
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      this.cN = new Paint();
      this.cN.setAntiAlias(true);
      this.cN.setColor(Color.rgb(69, 192, 26));
      this.cN.setTextSize(this.gbP);
      Object localObject = new Rect();
      this.cN.getTextBounds(this.gEw, 0, this.gEw.length(), (Rect)localObject);
      float f1 = getWidth() / 2 - ((Rect)localObject).centerX();
      float f2 = getHeight() / 2 - ((Rect)localObject).centerY();
      paramCanvas.drawText(this.gEw, f1, f2, this.cN);
      float f3 = this.pF / 100.0F * getWidth();
      if (f3 > f1)
      {
        localObject = new Paint();
        ((Paint)localObject).setColor(-1);
        ((Paint)localObject).setAntiAlias(true);
        ((Paint)localObject).setTextSize(this.gbP);
        RectF localRectF = new RectF(0.0F, 0.0F, f3, getHeight());
        paramCanvas.save();
        paramCanvas.clipRect(localRectF);
        paramCanvas.drawText(this.gEw, f1, f2, (Paint)localObject);
        paramCanvas.restore();
      }
      return;
    }
    finally {}
  }
  
  public void setProgress(int paramInt)
  {
    setText(paramInt);
    super.setProgress(paramInt);
  }
  
  public void setTextSize(int paramInt)
  {
    this.gbP = a.fromDPToPix(this.mContext, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/widget/TextProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */