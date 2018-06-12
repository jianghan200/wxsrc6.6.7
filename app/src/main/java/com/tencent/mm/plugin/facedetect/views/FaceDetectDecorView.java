package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.sdk.platformtools.x;

public class FaceDetectDecorView
  extends View
{
  public boolean iTB = false;
  public boolean iTC = false;
  public boolean iTD = false;
  public RectF iTE = null;
  private Paint iTF = null;
  
  public FaceDetectDecorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FaceDetectDecorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.iTF.setColor(getResources().getColor(a.b.black));
    this.iTF.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    setLayerType(1, null);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    x.i("MicroMsg.FaceDetectDecorView", "mTargetCoverMode: %b, mIsInCoverMode: %b, %s", new Object[] { Boolean.valueOf(this.iTC), Boolean.valueOf(this.iTB), this.iTE });
    if ((this.iTC != this.iTB) || (this.iTD))
    {
      if (!this.iTC) {
        break label103;
      }
      paramCanvas.drawColor(getResources().getColor(a.b.face_cover));
      paramCanvas.drawRect(this.iTE, this.iTF);
    }
    for (;;)
    {
      this.iTB = this.iTC;
      return;
      label103:
      paramCanvas.drawColor(getResources().getColor(a.b.transparent));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/facedetect/views/FaceDetectDecorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */