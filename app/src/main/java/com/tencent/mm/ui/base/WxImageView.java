package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.mm.graphics.ui.WxBaseImageView;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class WxImageView
  extends WxBaseImageView
  implements g
{
  protected Matrix aaA = new Matrix();
  private float aaO = 1.0F;
  private int iGn;
  private int iGo;
  private boolean lkO = false;
  protected ag mHandler = new ag();
  private float mKP;
  protected Bitmap nIa = null;
  private boolean nWI = true;
  private MultiTouchImageView.a nXf;
  private int orientation;
  private boolean tzA = false;
  private boolean tzB = false;
  private boolean tzC = false;
  private float tzD;
  private float tzE;
  private boolean tzG = false;
  private Drawable tzH;
  protected Matrix tzo = new Matrix();
  private final Matrix tzp = new Matrix();
  private final float[] tzq = new float[9];
  int tzr = -1;
  int tzs = -1;
  private float tzt = 0.0F;
  private float tzu = 0.0F;
  private float tzv = 0.0F;
  private boolean tzw = false;
  private float tzx = 2.0F;
  private float tzy = 0.75F;
  private float tzz = 20.0F;
  
  public WxImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WxImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void crZ()
  {
    boolean bool2 = true;
    int i = getImageWidth();
    int j = getImageHeight();
    this.tzD = (this.iGn / i);
    this.tzE = (this.iGo / j);
    boolean bool1;
    if (i > j * 2.2F)
    {
      bool1 = true;
      this.tzB = bool1;
      if (j <= i * 2.2F) {
        break label215;
      }
      bool1 = true;
      label79:
      this.tzC = bool1;
      if ((!this.tzB) || (i <= this.iGn)) {
        break label221;
      }
      bool1 = true;
      label104:
      this.tzB = bool1;
      if ((!this.tzC) || (j <= this.iGo)) {
        break label227;
      }
      bool1 = bool2;
      label130:
      this.tzC = bool1;
      float f3 = j / i;
      float f2 = 1.8F;
      float f1 = f2;
      if (this.iGn != 0)
      {
        f1 = f2;
        if (this.iGo != 0) {
          f1 = this.iGo / this.iGn;
        }
      }
      if ((f3 <= f1) || (f3 > 2.2D)) {
        break label233;
      }
    }
    label215:
    label221:
    label227:
    label233:
    for (this.mKP = this.tzE;; this.mKP = this.tzD)
    {
      setScaleRate(this.mKP);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label79;
      bool1 = false;
      break label104;
      bool1 = false;
      break label130;
    }
  }
  
  private void i(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat1 = (paramFloat1 - getScale()) / 128.0F;
    float f = getScale();
    long l = System.currentTimeMillis();
    this.mHandler.post(new WxImageView.1(this, l, f, paramFloat1, paramFloat2, paramFloat3));
  }
  
  public final void T(float paramFloat1, float paramFloat2)
  {
    crZ();
    i(this.mKP, paramFloat1, paramFloat2);
  }
  
  public final void U(float paramFloat1, float paramFloat2)
  {
    this.tzt = getDoubleTabScale();
    i(this.tzt, paramFloat1, paramFloat2);
  }
  
  public final void V(float paramFloat1, float paramFloat2)
  {
    x.d("MicroMsg.WxImageView", "alvinluo WxImageView postTranslate dx: %f, dy: %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    this.aaA.postTranslate(paramFloat1, paramFloat2);
  }
  
  public final boolean crk()
  {
    return this.tzB;
  }
  
  public final boolean crl()
  {
    return this.tzC;
  }
  
  public final void crm()
  {
    x.d("MicroMsg.WxImageView", "alvinluo adaptViewSize");
    this.aaA.reset();
    crZ();
    if (this.djD != null)
    {
      SubsamplingScaleImageView localSubsamplingScaleImageView = this.djD;
      localSubsamplingScaleImageView.a(localSubsamplingScaleImageView.aaK, new PointF(0.0F, 0.0F));
    }
    h(this.mKP, 0.0F, 0.0F);
  }
  
  public final void crn()
  {
    if ((this.tzA) && (0.0F == this.tzt)) {
      this.tzt = getDoubleTabScale();
    }
  }
  
  public int getContentLeft()
  {
    if (!this.lkO) {
      return 0;
    }
    float f1 = this.mKP;
    float f2 = this.imageWidth;
    int j = (int)((this.iGn - f1 * f2) / 2.0F);
    int i = j;
    if (j < 0) {
      i = 0;
    }
    x.i("MicroMsg.WxImageView", "alvinluo scaleRate: %f, imageWidth: %d, viewWidth: %d, left: %d", new Object[] { Float.valueOf(this.mKP), Integer.valueOf(this.imageWidth), Integer.valueOf(this.iGn), Integer.valueOf(i) });
    return i;
  }
  
  public int getContentTop()
  {
    if (!this.lkO) {
      return 0;
    }
    float f1 = this.mKP;
    float f2 = getImageHeight();
    int j = (int)((this.iGo - f1 * f2) / 2.0F);
    int i = j;
    if (j < 0) {
      i = 0;
    }
    x.i("MicroMsg.WxImageView", "alvinluo scaleRate: %f, imageHeight: %d, viewHeight: %d, top: %d", new Object[] { Float.valueOf(this.mKP), Integer.valueOf(getImageHeight()), Integer.valueOf(this.iGo), Integer.valueOf(i) });
    return i;
  }
  
  public float getDoubleTabScale()
  {
    float f1 = getScaleRate();
    if (getScaleWidth() * 0.7F > f1) {
      f1 = getScaleWidth();
    }
    for (;;)
    {
      float f2 = f1;
      if (f1 < 1.0D) {
        f2 = 1.0F;
      }
      f1 = f2;
      if (f2 > getMaxZoom()) {
        f1 = getMaxZoom();
      }
      return f1;
      if (getScaleHeight() * 0.7F > f1) {
        f1 = getScaleHeight();
      } else {
        f1 = getScaleRate() * this.tzx;
      }
    }
  }
  
  public int getImageHeight()
  {
    if ((this.orientation == 90) || (this.orientation == 270)) {
      return this.imageWidth;
    }
    return this.imageHeight;
  }
  
  public Matrix getImageMatrix()
  {
    this.tzp.set(this.tzo);
    this.tzp.postConcat(this.aaA);
    return this.tzp;
  }
  
  protected Matrix getImageViewMatrix()
  {
    this.tzp.set(this.tzo);
    this.tzp.postConcat(this.aaA);
    return this.tzp;
  }
  
  public int getImageWidth()
  {
    if ((this.orientation == 90) || (this.orientation == 270)) {
      return this.imageHeight;
    }
    return this.imageWidth;
  }
  
  public float getMaxZoom()
  {
    return this.tzu;
  }
  
  public float getMinZoom()
  {
    return this.tzv;
  }
  
  public float getScale()
  {
    return super.getScale();
  }
  
  public float getScaleHeight()
  {
    return this.tzE;
  }
  
  public float getScaleRate()
  {
    return this.mKP;
  }
  
  public float getScaleWidth()
  {
    return this.tzD;
  }
  
  public final void h(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    int j = 1;
    float f3 = getScale();
    float f1;
    label72:
    float f2;
    int i;
    label173:
    label180:
    RectF localRectF;
    if (this.tzA)
    {
      if (0.0F == this.tzt)
      {
        f1 = this.tzz * this.aaO;
        this.tzu = f1;
      }
    }
    else
    {
      if (paramFloat1 <= this.tzu * 2.0F) {
        break label365;
      }
      f1 = this.tzu * 2.0F + (paramFloat1 - this.tzu) * 0.1F;
      f2 = f1 / f3;
      x.d("MicroMsg.WxImageView", "alvinluo zoomTo mzdt=%f,mz=%f,scale=%f,oldScale=%f,deltaScale=%f", new Object[] { Float.valueOf(this.tzt), Float.valueOf(this.tzu), Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f2) });
      if (!this.tzG) {
        this.aaA.postScale(f2, f2, paramFloat2, paramFloat3);
      }
      if ((this.nWI) && (this.tzB)) {
        break label386;
      }
      i = 1;
      if (this.tzC) {
        break label392;
      }
      if ((this.tzH != null) || (!this.tzG))
      {
        Matrix localMatrix = getImageViewMatrix();
        if (!this.tzG) {
          break label398;
        }
        localRectF = new RectF(0.0F, 0.0F, this.tzH.getIntrinsicWidth(), this.tzH.getIntrinsicHeight());
        label234:
        localMatrix.mapRect(localRectF);
        paramFloat1 = localRectF.height();
        paramFloat2 = localRectF.width();
        if (j == 0) {
          break label471;
        }
        if (paramFloat1 >= this.iGo) {
          break label422;
        }
        paramFloat1 = (this.iGo - paramFloat1) / 2.0F - localRectF.top;
      }
    }
    for (;;)
    {
      label285:
      if (i != 0) {
        if (paramFloat2 < this.iGn) {
          paramFloat2 = (this.iGn - paramFloat2) / 2.0F - localRectF.left;
        }
      }
      for (;;)
      {
        label316:
        V(paramFloat2, paramFloat1);
        getImageViewMatrix().mapRect(localRectF);
        if (this.nXf != null)
        {
          if (f2 <= 1.0F) {
            break label618;
          }
          this.nXf.bDw();
        }
        label365:
        label386:
        label392:
        label398:
        label422:
        label471:
        label618:
        while (f2 >= 1.0F)
        {
          return;
          f1 = this.tzt;
          break;
          f1 = paramFloat1;
          if (paramFloat1 >= this.tzv) {
            break label72;
          }
          f1 = this.tzv;
          break label72;
          i = 0;
          break label173;
          j = 0;
          break label180;
          localRectF = new RectF(0.0F, 0.0F, this.imageWidth, this.imageHeight);
          break label234;
          if (localRectF.top > 0.0F)
          {
            paramFloat1 = -localRectF.top;
            break label285;
          }
          if (localRectF.bottom >= this.iGo) {
            break label640;
          }
          paramFloat1 = this.iGo - localRectF.bottom;
          break label285;
          if (localRectF.top > 0.0F)
          {
            paramFloat1 = -localRectF.top;
            break label285;
          }
          if (localRectF.bottom >= this.iGo) {
            break label640;
          }
          paramFloat1 = this.iGo - localRectF.bottom;
          break label285;
          if (localRectF.left > 0.0F)
          {
            paramFloat2 = -localRectF.left;
            break label316;
          }
          if (localRectF.right >= this.iGn) {
            break label635;
          }
          paramFloat2 = this.iGn - localRectF.right;
          break label316;
          if (localRectF.left > 0.0F)
          {
            paramFloat2 = -localRectF.left;
            break label316;
          }
          if (localRectF.right >= this.iGn) {
            break label635;
          }
          paramFloat2 = this.iGn - localRectF.right;
          break label316;
        }
        this.nXf.bDv();
        return;
        label635:
        paramFloat2 = 0.0F;
      }
      label640:
      paramFloat1 = 0.0F;
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2)) {
      this.lkO = false;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      f.c(paramKeyEvent);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (f.d(paramKeyEvent)) && (!f.e(paramKeyEvent)) && (getScale() > 1.0F))
    {
      h(1.0F, this.iGn / 2.0F, this.iGo / 2.0F);
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.iGn != View.MeasureSpec.getSize(paramInt1)) || (this.iGo != View.MeasureSpec.getSize(paramInt2))) {}
    for (this.tzw = true;; this.tzw = false)
    {
      this.iGn = View.MeasureSpec.getSize(paramInt1);
      this.iGo = View.MeasureSpec.getSize(paramInt2);
      x.d("MicroMsg.WxImageView", "alvinluo onMeasure viewWidth: %d, viewHeight: %d", new Object[] { Integer.valueOf(this.iGn), Integer.valueOf(this.iGo) });
      if (!this.lkO)
      {
        this.lkO = true;
        this.tzG = false;
        x.d("MicroMsg.WxImageView", "init screenWidth:" + this.iGn + " screenHeight :" + this.iGo);
        float f = getContext().getResources().getDisplayMetrics().widthPixels / 720.0F;
        if (f > 1.0F) {
          this.aaO = f;
        }
        crm();
      }
      if (this.tzw) {
        crm();
      }
      return;
    }
  }
  
  public void setDoubleTabScaleLimit(float paramFloat)
  {
    if (Float.compare(paramFloat, 0.0F) < 0)
    {
      x.w("MicroMsg.WxImageView", "double tab scale limit is less than 0.0, change nothing, return");
      return;
    }
    this.tzx = paramFloat;
  }
  
  public void setEnableHorLongBmpMode(boolean paramBoolean)
  {
    this.nWI = paramBoolean;
  }
  
  public void setImageHeight(int paramInt)
  {
    this.imageHeight = paramInt;
  }
  
  public void setImageWidth(int paramInt)
  {
    this.imageWidth = paramInt;
  }
  
  public void setMaxZoomDoubleTab(boolean paramBoolean)
  {
    this.tzA = paramBoolean;
  }
  
  public void setMaxZoomLimit(float paramFloat)
  {
    if (Float.compare(paramFloat, 1.0F) < 0)
    {
      x.w("MicroMsg.WxImageView", "max scale limit is less than 1.0, change nothing, return");
      return;
    }
    this.tzz = paramFloat;
  }
  
  public void setMinZoomLimit(float paramFloat)
  {
    if (Float.compare(paramFloat, 1.0F) > 0)
    {
      x.w("MicroMsg.WxImageView", "min scale limit is greater than 1.0, change nothing, return");
      return;
    }
    if (Float.compare(paramFloat, 0.0F) < 0)
    {
      x.w("MicroMsg.WxImageView", "min scale limit is less than 0.0, change nothing, return");
      return;
    }
    this.tzy = paramFloat;
  }
  
  public void setOrientation(int paramInt)
  {
    this.orientation = paramInt;
    crZ();
  }
  
  public final void translate(float paramFloat1, float paramFloat2)
  {
    float f1 = getTranslationX();
    float f2 = getTranslationY();
    setTranslationX(f1 + paramFloat1);
    setTranslationY(f2 + paramFloat2);
    x.i("MicroMsg.WxImageView", "alvinluo translate x: %f, y: %f, x + dx: %f, y + dy: %f", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f1 + paramFloat1), Float.valueOf(f2 + paramFloat2) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/base/WxImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */