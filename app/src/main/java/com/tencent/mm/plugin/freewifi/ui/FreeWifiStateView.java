package com.tencent.mm.plugin.freewifi.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.ag;

public class FreeWifiStateView
  extends ImageView
{
  private int bottom = -1;
  private Paint cN;
  private ag dvh;
  int iCE = 2;
  private int iCF = -1;
  private Runnable iCG = new Runnable()
  {
    public final void run()
    {
      FreeWifiStateView.this.invalidate();
    }
  };
  private int left = -1;
  private Context mContext;
  private int right = -1;
  private int state;
  private int top = -1;
  
  public FreeWifiStateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FreeWifiStateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.cN = new Paint();
    this.cN.setAntiAlias(true);
    this.cN.setStyle(Paint.Style.STROKE);
    this.left = a.fromDPToPix(this.mContext, 2);
    this.top = this.left;
    this.iCF = a.fromDPToPix(this.mContext, 3);
    this.dvh = new ag(Looper.getMainLooper());
  }
  
  private void pi(int paramInt)
  {
    this.dvh.removeCallbacks(this.iCG);
    this.dvh.postDelayed(this.iCG, paramInt);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.state == 1)
    {
      int i = getWidth() / 2;
      this.cN.setARGB(255, 103, 209, 79);
      this.cN.setStrokeWidth(this.iCF);
      if (this.right == -1) {
        this.right = (i * 2 - this.left);
      }
      if (this.bottom == -1) {
        this.bottom = this.right;
      }
      paramCanvas.drawArc(new RectF(this.left, this.top, this.right, this.bottom), 270.0F, this.iCE, false, this.cN);
      this.iCE += 5;
      if (this.iCE > 365) {
        this.iCE = 0;
      }
      pi(100);
    }
  }
  
  public void setState(int paramInt)
  {
    this.state = paramInt;
    pi(10);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiStateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */