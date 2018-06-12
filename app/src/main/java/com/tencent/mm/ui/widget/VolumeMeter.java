package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;

public class VolumeMeter
  extends ImageView
  implements Runnable
{
  private boolean dRn = false;
  private Paint fBa;
  private float kHA = 0.0F;
  private float kHB = 40.0F;
  private float kHC = 30.0F;
  private boolean kHk = false;
  private View kHl;
  private int kHm = -1;
  private int kHn = -1;
  private ag kHo = null;
  private float kHp;
  private float kHq;
  private float kHr;
  private float kHs;
  private int kHt = -6751336;
  private int kHu = 70;
  private float kHv = 0.5F;
  private float kHw = 0.001F;
  private int kHx = 20;
  private float kHy;
  private float kHz;
  private Context mContext;
  
  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
  }
  
  private void init()
  {
    this.fBa = new Paint();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    getWidth();
    getHeight();
    if ((this.kHl == null) || (this.kHl.getVisibility() == 4)) {}
    while ((this.kHm < 0) || (this.kHn < 0))
    {
      return;
      int[] arrayOfInt = new int[2];
      this.kHl.getLocationInWindow(arrayOfInt);
      if ((arrayOfInt[0] != 0) && (arrayOfInt[1] != 0))
      {
        int i = this.kHl.getWidth();
        int j = this.kHl.getHeight();
        if ((i != 0) && (j != 0))
        {
          int k = BackwardSupportUtil.b.b(this.mContext, 50.0F);
          this.kHm = (arrayOfInt[0] + i / 2);
          this.kHn = (arrayOfInt[1] + j / 2 - k / 2);
          this.kHz = (i / 2);
          this.kHy = (i / 2 * 2.0F);
        }
      }
    }
    this.fBa.setColor(this.kHt);
    this.fBa.setAlpha(this.kHu);
    float f2 = BackwardSupportUtil.b.b(this.mContext, this.kHA);
    float f1 = f2;
    if (f2 > this.kHy) {
      f1 = this.kHy;
    }
    f2 = f1;
    if (f1 < this.kHz) {
      f2 = this.kHz;
    }
    paramCanvas.drawCircle(this.kHm, this.kHn, f2, this.fBa);
  }
  
  public void run()
  {
    float f2;
    float f3;
    float f1;
    if (this.dRn)
    {
      f2 = this.kHr;
      if (this.kHq <= this.kHp) {
        break label137;
      }
      f3 = (this.kHq - this.kHp) / this.kHC;
      if (f3 <= this.kHv) {
        break label118;
      }
      f1 = this.kHv;
      f1 += f2;
    }
    for (;;)
    {
      this.kHr = f1;
      this.kHs = this.kHr;
      this.kHA = ((float)(260.0D * Math.sqrt(this.kHr) - 130.0F * this.kHr) / 1.5F);
      postInvalidate();
      this.kHo.postDelayed(this, this.kHx);
      return;
      label118:
      f1 = f3;
      if (f3 >= this.kHw) {
        break;
      }
      f1 = this.kHw;
      break;
      label137:
      if (this.kHq <= this.kHp)
      {
        f3 = (this.kHp - this.kHq) / this.kHB;
        if (f3 > this.kHv) {
          f1 = this.kHv;
        }
        for (;;)
        {
          f1 = f2 - f1;
          break;
          f1 = f3;
          if (f3 < this.kHw) {
            f1 = this.kHw;
          }
        }
      }
      f1 = f2;
    }
  }
  
  public void setArchView(View paramView)
  {
    this.kHl = paramView;
  }
  
  public void setVolume(float paramFloat)
  {
    this.kHp = this.kHq;
    this.kHq = paramFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/widget/VolumeMeter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */