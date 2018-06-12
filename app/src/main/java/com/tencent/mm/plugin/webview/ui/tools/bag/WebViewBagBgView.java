package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.mm.sdk.platformtools.x;

public class WebViewBagBgView
  extends View
{
  private Paint cN = new Paint();
  private RectF cP;
  int mDuration;
  long mStartTime;
  int ouh;
  private int qcd = -7829368;
  private int qce = -65536;
  private float qcf = 0.0F;
  private float qcg;
  private float qch;
  private int qci;
  private int qcj;
  boolean qck;
  
  public WebViewBagBgView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cN.setAntiAlias(true);
    this.qcj = -1;
  }
  
  final void fE(long paramLong)
  {
    if (this.qcj < 0)
    {
      x.i("MicroMsg.WebViewBagBgView", "doUpdateAngryInfo not measured, mDiameter:%d", new Object[] { Integer.valueOf(this.qcj) });
      return;
    }
    this.qcf = (this.qcj * 2 / (this.mDuration / this.ouh));
    if (paramLong - this.mStartTime <= 0L)
    {
      f = this.qcj;
      this.qcg = f;
      if (this.qcj - this.qcg >= this.qci) {
        break label173;
      }
    }
    label173:
    for (float f = this.qcj;; f = this.qcg + this.qci)
    {
      this.qch = f;
      return;
      int i = (int)((float)(paramLong - this.mStartTime) / this.ouh);
      this.qcg = (this.qcj - (i + 1) * this.qcf);
      if (this.qcg < -this.qci)
      {
        f = -this.qci;
        break;
      }
      f = this.qcg;
      break;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = this.qcg;
    float f2 = this.qch;
    int i = this.qcd;
    int j = this.qce;
    Object localObject = Shader.TileMode.CLAMP;
    localObject = new LinearGradient(0.0F, f1, 0.0F, f2, new int[] { i, j }, null, (Shader.TileMode)localObject);
    this.cN.setShader((Shader)localObject);
    paramCanvas.drawOval(this.cP, this.cN);
    if ((this.qck) && (this.qch > 0.0F))
    {
      this.qcg -= this.qcf;
      if (this.qcg >= -this.qci) {
        break label178;
      }
      f1 = -this.qci;
      this.qcg = f1;
      if (this.qcj - this.qcg >= this.qci) {
        break label186;
      }
    }
    label178:
    label186:
    for (f1 = this.qcj;; f1 = this.qcg + this.qci)
    {
      this.qch = f1;
      postInvalidateDelayed(this.ouh);
      return;
      f1 = this.qcg;
      break;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.qcj = View.MeasureSpec.getSize(paramInt1);
    this.cP = new RectF(0.0F, 0.0F, this.qcj, this.qcj);
    this.qci = (this.qcj / 2);
    fE(System.currentTimeMillis());
  }
  
  public void setAngryColor(int paramInt)
  {
    this.qce = paramInt;
  }
  
  public void setStartColor(int paramInt)
  {
    this.qcd = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBagBgView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */