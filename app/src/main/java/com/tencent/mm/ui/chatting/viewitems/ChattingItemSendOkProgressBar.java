package com.tencent.mm.ui.chatting.viewitems;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.ad;
import java.lang.ref.SoftReference;

public class ChattingItemSendOkProgressBar
  extends ProgressBar
{
  private static SoftReference<Bitmap> udF = null;
  private static SoftReference<Bitmap> udG = null;
  private static SoftReference<Bitmap> udH = null;
  private static int udN = a.fromDPToPix(ad.getContext(), 1);
  private static int udO = a.fromDPToPix(ad.getContext(), 6);
  private boolean dRn = false;
  private float rotation = 0.0F;
  private int udB = 0;
  private int udC = 0;
  private boolean udD = false;
  private boolean udE = false;
  private Bitmap udI = null;
  private Bitmap udJ = null;
  private Bitmap udK = null;
  private boolean udL = false;
  private a udM = null;
  
  public ChattingItemSendOkProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ChattingItemSendOkProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public a getDrawListener()
  {
    return this.udM;
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    if (!this.udL)
    {
      super.onDraw(paramCanvas);
      return;
    }
    paramCanvas.saveLayerAlpha(new RectF(0.0F, 0.0F, this.udI.getWidth(), this.udI.getHeight()), 255, 31);
    if (this.dRn)
    {
      if (!this.udD)
      {
        if (((int)(this.rotation - 270.0F) % 360 == 0) && (this.udE))
        {
          this.udD = true;
          invalidate();
          return;
        }
        localObject1 = new Matrix();
        ((Matrix)localObject1).setRotate(this.rotation, this.udI.getWidth() / 2, this.udI.getHeight() / 2);
        paramCanvas.drawBitmap(this.udI, (Matrix)localObject1, null);
        this.rotation += 6.0F;
        invalidate();
        return;
      }
      if (this.udB <= this.udJ.getWidth())
      {
        localObject1 = new Matrix();
        this.rotation += 6.0F;
        ((Matrix)localObject1).setRotate(this.rotation, this.udI.getWidth() / 2, this.udI.getHeight() / 2);
        int j = (int)this.rotation % 360;
        int i = j;
        if (j < 270) {
          i = j + 360;
        }
        if ((i >= 270) && (i < 450))
        {
          localObject2 = new Paint();
          ((Paint)localObject2).setColor(-16776961);
          paramCanvas.drawBitmap(this.udI, (Matrix)localObject1, (Paint)localObject2);
          ((Paint)localObject2).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
          paramCanvas.drawRect(0.0F, 0.0F, this.udI.getWidth(), this.udI.getHeight() / 2, (Paint)localObject2);
        }
        localObject1 = new Rect(0, 0, this.udB, this.udJ.getHeight());
        localObject2 = new Rect(udN, udO, this.udB + udN, this.udJ.getHeight() + udO);
        paramCanvas.drawBitmap(this.udJ, (Rect)localObject1, (Rect)localObject2, null);
        this.udB += 2;
        invalidate();
        return;
      }
      localObject1 = new Rect(0, 0, this.udJ.getWidth(), this.udJ.getHeight());
      localObject2 = new Rect(udN, udO, this.udJ.getWidth() + udN, this.udJ.getHeight() + udO);
      paramCanvas.drawBitmap(this.udJ, (Rect)localObject1, (Rect)localObject2, null);
      if (this.udC < 255)
      {
        Paint localPaint = new Paint();
        localPaint.setAlpha(this.udC);
        paramCanvas.drawBitmap(this.udK, (Rect)localObject1, (Rect)localObject2, localPaint);
        this.udC += 20;
        invalidate();
        return;
      }
      paramCanvas.drawBitmap(this.udK, (Rect)localObject1, (Rect)localObject2, null);
      this.dRn = false;
      this.rotation = 0.0F;
      this.udB = 0;
      this.udC = 0;
      this.udE = false;
      this.udD = false;
      return;
    }
    Object localObject1 = new Rect(0, 0, this.udK.getWidth(), this.udK.getHeight());
    Object localObject2 = new Rect(udN, udO, this.udK.getWidth() + udN, this.udK.getHeight() + udO);
    paramCanvas.drawBitmap(this.udK, (Rect)localObject1, (Rect)localObject2, null);
  }
  
  public void setDrawListener(a parama)
  {
    this.udM = parama;
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/ChattingItemSendOkProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */