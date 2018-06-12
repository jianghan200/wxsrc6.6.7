package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends View
{
  public int cA;
  private Paint cN = new Paint();
  private RectF gMn;
  private Matrix mMatrix;
  private int mRotateAngle;
  public int oTO;
  public int oTP;
  public int oTQ;
  private int oTR;
  private int oTS;
  private int oTT;
  private int oTU;
  private boolean oTV;
  
  public f(Context paramContext)
  {
    super(paramContext);
    this.cN.setStyle(Paint.Style.STROKE);
    this.cN.setColor(-65536);
    this.cN.setStrokeWidth(a.fromDPToPix(getContext(), 3));
    this.mMatrix = new Matrix();
  }
  
  private static int dR(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramInt1 > paramInt2) {
        return paramInt2;
      }
      return paramInt1;
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if (this.gMn != null)
    {
      paramCanvas.save();
      paramCanvas.rotate(0.0F);
      paramCanvas.drawRect(this.gMn, this.cN);
      paramCanvas.restore();
    }
  }
  
  public final void setFaceLocation(int[] paramArrayOfInt)
  {
    int m;
    int n;
    int i1;
    int i2;
    int i;
    int j;
    if (paramArrayOfInt != null)
    {
      this.oTR = paramArrayOfInt[0];
      this.oTS = paramArrayOfInt[1];
      this.oTT = paramArrayOfInt[2];
      this.oTU = paramArrayOfInt[3];
      if ((this.oTP != 0) && (this.oTQ != 0) && (this.cA != 0) && (this.oTO != 0))
      {
        m = this.oTT;
        n = this.oTR;
        i1 = this.oTU;
        i2 = this.oTS;
        x.d("MicroMsg.FaceRectView", "mLeftTopX:%d, mLeftTopY:%d, mRightBottomX:%d, mRightBottomY:%d", new Object[] { Integer.valueOf(this.oTR), Integer.valueOf(this.oTS), Integer.valueOf(this.oTT), Integer.valueOf(this.oTT) });
        x.d("MicroMsg.FaceRectView", "mPicWidth:%d, mPicHeight:%d, mirror:%b, angle:%d", new Object[] { Integer.valueOf(this.oTP), Integer.valueOf(this.oTQ), Boolean.valueOf(this.oTV), Integer.valueOf(this.mRotateAngle) });
        i = (this.oTT + this.oTR) / 2;
        j = (this.oTU + this.oTS) / 2;
        if ((this.mRotateAngle != 90) && (this.mRotateAngle != 270)) {
          break label542;
        }
      }
    }
    for (;;)
    {
      x.d("MicroMsg.FaceRectView", "centerX:%d, centerY:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      float f2;
      if ((this.mRotateAngle == 90) || (this.mRotateAngle == 270)) {
        f2 = this.cA / this.oTP;
      }
      for (float f1 = this.oTO / this.oTQ;; f1 = this.cA / this.oTQ)
      {
        f1 = Math.max(f2, f1);
        f2 = (int)((m - n) * f1);
        float f3 = (int)((i1 - i2) * f1);
        j = (int)(j * f1);
        i = (int)(i * f1);
        this.oTR = dR((int)(j - f2 / 2.0F), this.oTO);
        this.oTS = dR((int)(i - f3 / 2.0F), this.cA);
        this.oTT = dR((int)(j + f2 / 2.0F), this.oTO);
        this.oTU = dR((int)(i + f3 / 2.0F), this.cA);
        this.gMn = new RectF(this.oTR, this.oTS, this.oTT, this.oTU);
        x.d("MicroMsg.FaceRectView", "after translate, mLeftTopX:%.2f, mLeftTopY:%.2f, mRightBottomX:%.2f, mRightBottomY:%.2f", new Object[] { Float.valueOf(this.gMn.left), Float.valueOf(this.gMn.top), Float.valueOf(this.gMn.right), Float.valueOf(this.gMn.bottom) });
        return;
        f2 = this.oTO / this.oTP;
      }
      label542:
      int k = i;
      i = j;
      j = k;
    }
  }
  
  public final void setMirror(boolean paramBoolean)
  {
    this.oTV = paramBoolean;
  }
  
  public final void setRotateAngle(int paramInt)
  {
    this.mRotateAngle = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/video/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */