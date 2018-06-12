package com.tencent.mm.view.b;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.tencent.mm.b.d;
import com.tencent.mm.b.d.1;
import com.tencent.mm.b.d.2;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends a
{
  private d uUu = new d(this);
  private PointF uUv = new PointF();
  private float uUw = 0.0F;
  private float uUx = 0.0F;
  private boolean uUy = false;
  public boolean uUz = false;
  
  public b(Context paramContext, com.tencent.mm.bi.b paramb)
  {
    super(paramContext, paramb);
  }
  
  private void translate(float paramFloat1, float paramFloat2)
  {
    RectF localRectF = getCurImageRect();
    float f2 = paramFloat1 - this.uUv.x;
    float f1 = paramFloat2 - this.uUv.y;
    if (f2 > 0.0F) {
      if (getBoardRect().left <= localRectF.left)
      {
        paramFloat1 = f2 * 0.5F;
        if (f1 <= 0.0F) {
          break label261;
        }
        if (getBoardRect().top > localRectF.top) {
          break label216;
        }
        paramFloat2 = f1 * 0.5F;
      }
    }
    for (;;)
    {
      getMainMatrix().postTranslate(paramFloat1, paramFloat2);
      return;
      paramFloat1 = f2;
      if (Math.abs(f2) <= Math.abs(localRectF.left - getBoardRect().left)) {
        break;
      }
      paramFloat1 = getBoardRect().left - localRectF.left;
      break;
      if (getBoardRect().right >= localRectF.right)
      {
        paramFloat1 = f2 * 0.5F;
        break;
      }
      paramFloat1 = f2;
      if (Math.abs(f2) <= Math.abs(getBoardRect().right - localRectF.right)) {
        break;
      }
      paramFloat1 = getBoardRect().right - localRectF.right;
      break;
      label216:
      paramFloat2 = f1;
      if (Math.abs(f1) > Math.abs(localRectF.top - getBoardRect().top))
      {
        paramFloat2 = getBoardRect().top - localRectF.top;
        continue;
        label261:
        if (getBoardRect().bottom >= localRectF.bottom)
        {
          paramFloat2 = f1 * 0.5F;
        }
        else
        {
          paramFloat2 = f1;
          if (Math.abs(f1) > Math.abs(getBoardRect().bottom - localRectF.bottom)) {
            paramFloat2 = getBoardRect().bottom - localRectF.bottom;
          }
        }
      }
    }
  }
  
  protected final void R(MotionEvent paramMotionEvent)
  {
    float f4 = paramMotionEvent.getX(paramMotionEvent.getPointerCount() - 1);
    float f5 = paramMotionEvent.getY(paramMotionEvent.getPointerCount() - 1);
    RectF localRectF;
    Rect localRect;
    float f2;
    float f1;
    float f6;
    float f7;
    float f3;
    label308:
    int i;
    label326:
    int j;
    switch (paramMotionEvent.getActionMasked())
    {
    case 3: 
    case 4: 
    default: 
    case 0: 
    case 1: 
      do
      {
        do
        {
          for (;;)
          {
            this.uUv.x = f4;
            this.uUv.y = f5;
            return;
            this.uUv.set(f4, f5);
            this.uUw = 0.0F;
            this.uUx = getCurScale();
            paramMotionEvent = this.uUu;
            x.d("MicroMsg.StickRoundAnim", "[cancel]");
            if ((paramMotionEvent.bwg != null) && ((paramMotionEvent.bwg.isRunning()) || (paramMotionEvent.bwg.isStarted()))) {
              paramMotionEvent.bwg.cancel();
            }
            this.uUz = false;
          }
          this.uUw = 0.0F;
        } while (!this.uUz);
        paramMotionEvent = this.uUu;
      } while (!paramMotionEvent.bwt);
      x.d("MicroMsg.StickRoundAnim", "[play] start");
      localRectF = paramMotionEvent.bwB.getCurImageRect();
      localRect = paramMotionEvent.bwB.getBoardRect();
      paramMotionEvent.bwC = localRectF.centerX();
      paramMotionEvent.bwD = localRectF.centerY();
      f2 = localRect.centerY() - localRectF.centerY();
      f1 = localRect.centerX() - localRectF.centerX();
      f6 = paramMotionEvent.bwB.getCurScale();
      f7 = paramMotionEvent.bwB.getMaxScale();
      f3 = paramMotionEvent.bwB.getMinScale();
      if (f6 > f7)
      {
        paramMotionEvent.dD = f7;
        paramMotionEvent.bwE = true;
        if (localRect.height() >= localRectF.height()) {
          break label631;
        }
        i = 1;
        if (localRect.width() >= localRectF.width()) {
          break label637;
        }
        j = 1;
        label344:
        if (i != 0) {
          f2 = 0.0F;
        }
        if (j != 0) {
          f1 = 0.0F;
        }
        if ((localRectF.top <= localRect.top) || (i == 0)) {
          break label643;
        }
        f2 = localRect.top - localRectF.top;
      }
      break;
    }
    label391:
    label425:
    label631:
    label637:
    label643:
    label722:
    label982:
    for (;;)
    {
      if ((localRectF.left > localRect.left) && (j != 0))
      {
        f3 = localRect.left - localRectF.left;
        x.d("MicroMsg.StickRoundAnim", "%s %s ", new Object[] { Float.valueOf(f3), Float.valueOf(f2) });
        if (f6 <= f7) {
          break label722;
        }
      }
      for (paramMotionEvent.bwF = true;; paramMotionEvent.bwF = false)
      {
        paramMotionEvent.bwg = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, f2 }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, f3 }), PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, 80.0F }) });
        paramMotionEvent.bwg.addUpdateListener(new d.1(paramMotionEvent, f6));
        paramMotionEvent.bwg.addListener(new d.2(paramMotionEvent));
        paramMotionEvent.bwg.setInterpolator(new LinearInterpolator());
        paramMotionEvent.bwg.setDuration(80L);
        paramMotionEvent.bwg.start();
        break;
        if (f6 < f3)
        {
          paramMotionEvent.dD = f3;
          paramMotionEvent.bwE = true;
          break label308;
        }
        paramMotionEvent.bwE = false;
        break label308;
        i = 0;
        break label326;
        j = 0;
        break label344;
        if ((localRectF.bottom >= localRect.bottom) || (i == 0)) {
          break label982;
        }
        f2 = localRect.bottom - localRectF.bottom;
        break label391;
        f3 = f1;
        if (localRectF.right >= localRect.right) {
          break label425;
        }
        f3 = f1;
        if (j == 0) {
          break label425;
        }
        f3 = localRect.right - localRectF.right;
        break label425;
      }
      this.uUw = 0.0F;
      this.uUx = getCurScale();
      break;
      this.uUw = 0.0F;
      this.uUy = true;
      break;
      if (this.uUy)
      {
        this.uUy = false;
        return;
      }
      if (paramMotionEvent.getPointerCount() == 2)
      {
        this.uUz = true;
        f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
        f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
        f1 = (float)Math.sqrt(f1 * f1 + f2 * f2);
        if (this.uUw == 0.0F)
        {
          this.uUw = f1;
          break;
        }
        f2 = f1 / this.uUw * this.uUx;
        if (this.uUl * 0.5F <= f2)
        {
          f1 = f2;
          if (f2 > this.uUk)
          {
            f1 = this.uUk;
            f1 = (f2 - this.uUk) * 0.2F + f1;
          }
          getMainMatrix().postScale(f1 / getCurScale(), f1 / getCurScale(), f4, f5);
        }
        this.uUu.bwt = true;
        translate(f4, f5);
        postInvalidate();
        break;
      }
      if ((paramMotionEvent.getPointerCount() != 1) || (!cCf())) {
        break;
      }
      this.uUz = true;
      this.uUu.bwt = true;
      translate(f4, f5);
      postInvalidate();
      break;
    }
  }
  
  public final boolean cCg()
  {
    return true;
  }
  
  public final float getMinScale()
  {
    if (getPresenter().cfR().vE() == com.tencent.mm.d.a.bBk)
    {
      float f1 = getBoardRect().width() / getCurImageRect().width();
      float f2 = getBoardRect().height() / getCurImageRect().height();
      if (f1 > f2) {}
      for (;;)
      {
        return f1 * getCurScale();
        f1 = f2;
      }
    }
    return super.getMinScale();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    paramCanvas.setMatrix(getMainMatrix());
    paramCanvas.save();
    paramCanvas.clipRect(getAliveRect());
    Bitmap localBitmap = getPresenter().cfS();
    if ((localBitmap != null) && (!localBitmap.isRecycled())) {
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    }
    paramCanvas.restore();
    getPresenter().onDraw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/view/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */