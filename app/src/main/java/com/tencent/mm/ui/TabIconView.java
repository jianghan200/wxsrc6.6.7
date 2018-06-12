package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.c;

public class TabIconView
  extends ImageView
{
  private Paint fBa;
  private Bitmap tqE;
  private Bitmap tqF;
  private Bitmap tqG;
  private Rect tqH;
  private Rect tqI;
  private Rect tqJ;
  private int tqK = 0;
  
  public TabIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public TabIconView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void g(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.tqE = c.CW(paramInt1);
      this.tqF = c.CW(paramInt3);
    }
    for (this.tqG = c.CW(paramInt2);; this.tqG = c.CV(paramInt2))
    {
      this.tqH = new Rect(0, 0, this.tqE.getWidth(), this.tqE.getHeight());
      this.tqI = new Rect(0, 0, this.tqF.getWidth(), this.tqF.getHeight());
      this.tqJ = new Rect(0, 0, this.tqG.getWidth(), this.tqG.getHeight());
      this.fBa = new Paint(1);
      return;
      this.tqE = c.CV(paramInt1);
      this.tqF = c.CV(paramInt3);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.fBa == null) {
      return;
    }
    if (this.tqK < 128)
    {
      this.fBa.setAlpha(255 - this.tqK * 2);
      paramCanvas.drawBitmap(this.tqF, null, this.tqI, this.fBa);
      this.fBa.setAlpha(this.tqK * 2);
      paramCanvas.drawBitmap(this.tqG, null, this.tqJ, this.fBa);
      return;
    }
    this.fBa.setAlpha(255 - this.tqK * 2);
    paramCanvas.drawBitmap(this.tqG, null, this.tqJ, this.fBa);
    this.fBa.setAlpha(this.tqK * 2);
    paramCanvas.drawBitmap(this.tqE, null, this.tqH, this.fBa);
  }
  
  public void setFocusAlpha(int paramInt)
  {
    this.tqK = paramInt;
    invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/TabIconView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */