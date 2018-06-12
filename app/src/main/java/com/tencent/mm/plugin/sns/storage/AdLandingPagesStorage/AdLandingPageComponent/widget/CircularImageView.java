package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.tencent.mm.plugin.sns.i.l;

public class CircularImageView
  extends ImageView
{
  private static final String TAG = CircularImageView.class.getSimpleName();
  private int borderWidth;
  private boolean eQK;
  private Paint fBa = new Paint();
  private boolean nHR;
  private boolean nHS;
  private int nHT;
  private int nHU;
  private boolean nHV;
  private float nHW;
  private float nHX;
  private float nHY;
  private BitmapShader nHZ;
  private Bitmap nIa;
  private Paint nIb;
  private Paint nIc;
  private ColorFilter nId;
  private int shadowColor;
  
  public CircularImageView(Context paramContext)
  {
    this(paramContext, null, i.l.CircularImageViewStyle_circularImageViewDefault);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i.l.CircularImageViewStyle_circularImageViewDefault);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.fBa.setAntiAlias(true);
    this.nIb = new Paint();
    this.nIb.setAntiAlias(true);
    this.nIb.setStyle(Paint.Style.STROKE);
    this.nIc = new Paint();
    this.nIc.setAntiAlias(true);
    if (Build.VERSION.SDK_INT >= 11) {
      setLayerType(1, null);
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, i.l.CircularImageView, paramInt, 0);
    this.nHR = paramAttributeSet.getBoolean(i.l.CircularImageView_civ_border, false);
    this.nHS = paramAttributeSet.getBoolean(i.l.CircularImageView_civ_selector, false);
    this.nHV = paramAttributeSet.getBoolean(i.l.CircularImageView_civ_shadow, false);
    if (this.nHR)
    {
      paramInt = (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F);
      setBorderWidth(paramAttributeSet.getDimensionPixelOffset(i.l.CircularImageView_civ_borderWidth, paramInt));
      setBorderColor(paramAttributeSet.getColor(i.l.CircularImageView_civ_borderColor, -1));
    }
    if (this.nHS)
    {
      paramInt = (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F);
      setSelectorColor(paramAttributeSet.getColor(i.l.CircularImageView_civ_selectorColor, 0));
      setSelectorStrokeWidth(paramAttributeSet.getDimensionPixelOffset(i.l.CircularImageView_civ_selectorStrokeWidth, paramInt));
      setSelectorStrokeColor(paramAttributeSet.getColor(i.l.CircularImageView_civ_selectorStrokeColor, -16776961));
    }
    if (this.nHV)
    {
      this.nHW = paramAttributeSet.getFloat(i.l.CircularImageView_civ_shadowRadius, 4.0F);
      this.nHX = paramAttributeSet.getFloat(i.l.CircularImageView_civ_shadowDx, 0.0F);
      this.nHY = paramAttributeSet.getFloat(i.l.CircularImageView_civ_shadowDy, 2.0F);
      this.shadowColor = paramAttributeSet.getColor(i.l.CircularImageView_civ_shadowColor, -16777216);
      setShadowEnabled(true);
    }
    paramAttributeSet.recycle();
  }
  
  private void bAy()
  {
    if (this.nIa == null) {}
    do
    {
      return;
      this.nHZ = new BitmapShader(this.nIa, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    } while ((this.nHT == this.nIa.getWidth()) && (this.nHT == this.nIa.getHeight()));
    Matrix localMatrix = new Matrix();
    float f = this.nHT / this.nIa.getWidth();
    localMatrix.setScale(f, f);
    this.nHZ.setLocalMatrix(localMatrix);
  }
  
  private static Bitmap q(Drawable paramDrawable)
  {
    if (paramDrawable == null) {}
    int i;
    int j;
    do
    {
      return null;
      if ((paramDrawable instanceof BitmapDrawable)) {
        return ((BitmapDrawable)paramDrawable).getBitmap();
      }
      i = paramDrawable.getIntrinsicWidth();
      j = paramDrawable.getIntrinsicHeight();
    } while ((i <= 0) || (j <= 0));
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
      paramDrawable.draw(localCanvas);
      return localBitmap;
    }
    catch (OutOfMemoryError paramDrawable) {}
    return null;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!isClickable())
    {
      this.eQK = false;
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      invalidate();
      return super.dispatchTouchEvent(paramMotionEvent);
      this.eQK = true;
      continue;
      this.eQK = false;
    }
  }
  
  public boolean isSelected()
  {
    return this.eQK;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    int j = 0;
    if (this.nIa == null) {}
    while ((this.nIa.getHeight() == 0) || (this.nIa.getWidth() == 0)) {
      return;
    }
    int k = this.nHT;
    int i;
    if (getWidth() < getHeight())
    {
      i = getWidth();
      this.nHT = i;
      if (k != this.nHT) {
        bAy();
      }
      this.fBa.setShader(this.nHZ);
      i = this.nHT / 2;
      if ((!this.nHS) || (!this.eQK)) {
        break label199;
      }
      j = this.nHU;
      i = (this.nHT - j * 2) / 2;
      this.fBa.setColorFilter(this.nId);
      paramCanvas.drawCircle(i + j, i + j, (this.nHT - j * 2) / 2 + j - 4.0F, this.nIc);
    }
    for (;;)
    {
      paramCanvas.drawCircle(i + j, i + j, (this.nHT - j * 2) / 2, this.fBa);
      return;
      i = getHeight();
      break;
      label199:
      if (this.nHR)
      {
        j = this.borderWidth;
        i = (this.nHT - j * 2) / 2;
        this.fBa.setColorFilter(null);
        paramCanvas.drawArc(new RectF(j / 2 + 0, j / 2 + 0, this.nHT - j / 2, this.nHT - j / 2), 360.0F, 360.0F, false, this.nIb);
      }
      else
      {
        this.fBa.setColorFilter(null);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i == 1073741824)
    {
      i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (i != 1073741824) {
        break label58;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2 + 2);
      return;
      if (i == Integer.MIN_VALUE) {
        break;
      }
      paramInt1 = this.nHT;
      break;
      label58:
      if (i != Integer.MIN_VALUE) {
        paramInt2 = this.nHT;
      }
    }
  }
  
  public void setBorderColor(int paramInt)
  {
    if (this.nIb != null) {
      this.nIb.setColor(paramInt);
    }
    invalidate();
  }
  
  public void setBorderWidth(int paramInt)
  {
    this.borderWidth = paramInt;
    if (this.nIb != null) {
      this.nIb.setStrokeWidth(paramInt);
    }
    requestLayout();
    invalidate();
  }
  
  public void setIconModeEnabled(boolean paramBoolean) {}
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    this.nIa = paramBitmap;
    if (this.nHT > 0) {
      bAy();
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    this.nIa = q(getDrawable());
    if (this.nHT > 0) {
      bAy();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    super.setImageResource(paramInt);
    this.nIa = q(getDrawable());
    if (this.nHT > 0) {
      bAy();
    }
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    this.nIa = q(getDrawable());
    if (this.nHT > 0) {
      bAy();
    }
  }
  
  public void setSelectorColor(int paramInt)
  {
    this.nId = new PorterDuffColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    invalidate();
  }
  
  public void setSelectorStrokeColor(int paramInt)
  {
    if (this.nIc != null) {
      this.nIc.setColor(paramInt);
    }
    invalidate();
  }
  
  public void setSelectorStrokeWidth(int paramInt)
  {
    this.nHU = paramInt;
    requestLayout();
    invalidate();
  }
  
  public void setShadowEnabled(boolean paramBoolean)
  {
    this.nHV = paramBoolean;
    if (this.nHV) {}
    for (float f = this.nHW;; f = 0.0F)
    {
      this.nIb.setShadowLayer(f, this.nHX, this.nHY, this.shadowColor);
      this.nIc.setShadowLayer(f, this.nHX, this.nHY, this.shadowColor);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/CircularImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */