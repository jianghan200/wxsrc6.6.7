package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.sdk.platformtools.ag;

class SendDataToDeviceProgressBar
  extends ImageView
{
  private int bottom = -1;
  private Paint cN;
  private ag dvh;
  private int iCE = 2;
  private int iCF = -1;
  private Runnable iCG = new Runnable()
  {
    public final void run()
    {
      SendDataToDeviceProgressBar.this.invalidate();
    }
  };
  private int jZt = 10;
  private int left = -1;
  private Context mContext;
  private int right = -1;
  private int top = -1;
  
  public SendDataToDeviceProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SendDataToDeviceProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setImageResource(R.g.progressbar_background);
    this.mContext = paramContext;
    this.cN = new Paint();
    this.cN.setAntiAlias(true);
    this.cN.setStyle(Paint.Style.STROKE);
    this.left = this.mContext.getResources().getDimensionPixelSize(R.f.send_data_progress_bar_circle_margin);
    this.top = this.left;
    this.iCF = this.mContext.getResources().getDimensionPixelSize(R.f.send_data_progress_bar_circle_width);
    this.dvh = new ag(Looper.getMainLooper());
  }
  
  public final int getProgress()
  {
    return (int)(this.iCE / 360.0F * 100.0F);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getWidth() / 2;
    this.cN.setColor(this.mContext.getResources().getColor(R.e.progress_color));
    this.cN.setStrokeWidth(this.iCF);
    if (this.right == -1) {
      this.right = (i * 2 - this.left);
    }
    if (this.bottom == -1) {
      this.bottom = this.right;
    }
    RectF localRectF = new RectF(this.left, this.top, this.right, this.bottom);
    paramCanvas.drawArc(localRectF, 270.0F, this.iCE, false, this.cN);
    int j = this.iCE + 270;
    i = j;
    if (j > 360) {
      i = j - 360;
    }
    this.cN.setColor(this.mContext.getResources().getColor(R.e.progress_background));
    paramCanvas.drawArc(localRectF, i, 360 - this.iCE, false, this.cN);
  }
  
  public final void setProgress(int paramInt)
  {
    int i = paramInt;
    if (paramInt >= 100) {
      i = 100;
    }
    this.iCE = ((int)(i / 100.0F * 360.0F));
    this.dvh.removeCallbacks(this.iCG);
    this.dvh.postDelayed(this.iCG, 0L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/SendDataToDeviceProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */