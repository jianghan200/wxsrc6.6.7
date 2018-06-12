package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends View
{
  private Paint cN = new Paint();
  int mHeight;
  int mWidth;
  private Bitmap qbK;
  private Bitmap qbL;
  private Canvas qbM;
  private Paint qbN = new Paint();
  private Rect qbO;
  private RectF qbP;
  private int qbQ;
  int qbR;
  int qbS;
  int qbT;
  int qbU = -1;
  boolean qbV;
  private AnimatorListenerAdapter qbW;
  
  public i(Context paramContext, Bitmap paramBitmap)
  {
    super(paramContext);
    paramContext = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    this.qbN.setXfermode(paramContext);
    this.qbK = paramBitmap;
    this.mWidth = paramBitmap.getWidth();
    this.mHeight = paramBitmap.getHeight();
    this.qbO = new Rect(0, 0, this.mWidth, this.mHeight);
    this.qbL = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
    this.qbM = new Canvas(this.qbL);
    this.qbP = new RectF();
    this.qbP.left = 0.0F;
    this.qbP.top = 0.0F;
    this.qbP.right = this.mWidth;
    this.qbP.bottom = this.mHeight;
    x.i("MicroMsg.TransformToBagAniMask", String.format("init: mWidth:%d mHeight:%d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) }));
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if (this.qbV)
    {
      paramCanvas.save();
      paramCanvas.translate(this.qbQ, 0.0F);
    }
    paramCanvas.drawBitmap(this.qbK, this.qbO, this.qbO, this.cN);
    this.qbM.drawColor(0, PorterDuff.Mode.CLEAR);
    this.qbM.drawRoundRect(this.qbP, this.qbR, this.qbR, this.cN);
    paramCanvas.drawBitmap(this.qbL, this.qbO, this.qbO, this.qbN);
    if (this.qbV) {
      paramCanvas.restore();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.mWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824));
  }
  
  public final void setContentStartPosX(int paramInt)
  {
    this.qbU = paramInt;
  }
  
  public final void setListener(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    this.qbW = paramAnimatorListenerAdapter;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/bag/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */