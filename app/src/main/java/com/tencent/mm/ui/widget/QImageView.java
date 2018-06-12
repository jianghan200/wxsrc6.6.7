package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RemoteViews.RemoteView;
import com.tencent.mm.sdk.platformtools.x;

@RemoteViews.RemoteView
public class QImageView
  extends View
{
  private static final a[] uHJ = { a.uHL, a.uHM, a.uHN, a.uHO, a.uHP, a.uHQ, a.uHR, a.uHS };
  private static final Matrix.ScaleToFit[] uHK = { Matrix.ScaleToFit.FILL, Matrix.ScaleToFit.START, Matrix.ScaleToFit.CENTER, Matrix.ScaleToFit.END };
  private int AA = 255;
  private boolean OQ = false;
  private Uri aMJ;
  private int gg = Integer.MAX_VALUE;
  private ColorFilter jN;
  private Context mContext;
  private Drawable mDrawable = null;
  private Matrix mMatrix;
  private int qMj = Integer.MAX_VALUE;
  private int[] uHA = null;
  private boolean uHB = false;
  private int uHC = 0;
  private int uHD;
  private int uHE;
  private Matrix uHF = null;
  private final RectF uHG = new RectF();
  private final RectF uHH = new RectF();
  private boolean uHI;
  private int uHu = 0;
  private a uHv;
  private boolean uHw = false;
  private boolean uHx = false;
  private int uHy = 256;
  private boolean uHz = false;
  
  public QImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.mContext = paramContext;
    cAA();
  }
  
  public QImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    cAA();
    this.OQ = false;
    setAdjustViewBounds(false);
    setMaxWidth(Integer.MAX_VALUE);
    setMaxHeight(Integer.MAX_VALUE);
    this.uHI = false;
  }
  
  private static int am(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt3);
    paramInt3 = View.MeasureSpec.getSize(paramInt3);
    switch (i)
    {
    default: 
      return paramInt1;
    case 0: 
      return Math.min(paramInt1, paramInt2);
    case -2147483648: 
      return Math.min(Math.min(paramInt1, paramInt3), paramInt2);
    }
    return paramInt3;
  }
  
  private void cAA()
  {
    this.mMatrix = new Matrix();
    this.uHv = a.uHO;
  }
  
  private void cAB()
  {
    Object localObject1 = null;
    if (this.mDrawable != null) {}
    Object localObject2;
    do
    {
      return;
      localObject2 = getResources();
    } while (localObject2 == null);
    if (this.uHu != 0) {}
    while (this.aMJ != null)
    {
      try
      {
        localObject2 = ((Resources)localObject2).getDrawable(this.uHu);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.w("ImageView", "Unable to find resource: " + this.uHu, new Object[] { localException });
          this.aMJ = null;
        }
      }
      u((Drawable)localObject1);
      return;
    }
  }
  
  private void cAC()
  {
    Drawable localDrawable = this.mDrawable;
    if (localDrawable != null)
    {
      int j = localDrawable.getIntrinsicWidth();
      int i = j;
      if (j < 0) {
        i = this.uHD;
      }
      int k = localDrawable.getIntrinsicHeight();
      j = k;
      if (k < 0) {
        j = this.uHE;
      }
      if ((i != this.uHD) || (j != this.uHE))
      {
        this.uHD = i;
        this.uHE = j;
        requestLayout();
      }
    }
  }
  
  private void cAD()
  {
    if ((this.mDrawable == null) || (!this.uHw)) {
      return;
    }
    int j = this.uHD;
    int k = this.uHE;
    int m = getWidth() - getPaddingLeft() - getPaddingRight();
    int n = getHeight() - getPaddingTop() - getPaddingBottom();
    if (((j < 0) || (m == j)) && ((k < 0) || (n == k))) {}
    for (int i = 1; (j <= 0) || (k <= 0) || (a.uHM == this.uHv); i = 0)
    {
      this.mDrawable.setBounds(0, 0, m, n);
      this.uHF = null;
      return;
    }
    this.mDrawable.setBounds(0, 0, j, k);
    if (a.uHL == this.uHv)
    {
      if (this.mMatrix.isIdentity())
      {
        this.uHF = null;
        return;
      }
      this.uHF = this.mMatrix;
      return;
    }
    if (i != 0)
    {
      this.uHF = null;
      return;
    }
    if (a.uHQ == this.uHv)
    {
      this.uHF = this.mMatrix;
      this.uHF.setTranslate((int)((m - j) * 0.5F + 0.5F), (int)((n - k) * 0.5F + 0.5F));
      return;
    }
    float f3;
    float f2;
    float f1;
    if (a.uHR == this.uHv)
    {
      this.uHF = this.mMatrix;
      if (j * n > m * k)
      {
        f3 = n / k;
        f2 = (m - j * f3) * 0.5F;
        f1 = 0.0F;
      }
      for (;;)
      {
        this.uHF.setScale(f3, f3);
        this.uHF.postTranslate((int)(f2 + 0.5F), (int)(f1 + 0.5F));
        return;
        f3 = m / j;
        f1 = (n - k * f3) * 0.5F;
        f2 = 0.0F;
      }
    }
    if (a.uHS == this.uHv)
    {
      this.uHF = this.mMatrix;
      if ((j <= m) && (k <= n)) {}
      for (f1 = 1.0F;; f1 = Math.min(m / j, n / k))
      {
        f2 = (int)((m - j * f1) * 0.5F + 0.5F);
        f3 = (int)((n - k * f1) * 0.5F + 0.5F);
        this.uHF.setScale(f1, f1);
        this.uHF.postTranslate(f2, f3);
        return;
      }
    }
    this.uHG.set(0.0F, 0.0F, j, k);
    this.uHH.set(0.0F, 0.0F, m, n);
    this.uHF = this.mMatrix;
    Matrix localMatrix = this.uHF;
    RectF localRectF1 = this.uHG;
    RectF localRectF2 = this.uHH;
    a locala = this.uHv;
    localMatrix.setRectToRect(localRectF1, localRectF2, uHK[(locala.uHT - 1)]);
  }
  
  private void cAE()
  {
    if ((this.mDrawable != null) && (this.uHz))
    {
      this.mDrawable = this.mDrawable.mutate();
      this.mDrawable.setColorFilter(this.jN);
      this.mDrawable.setAlpha(this.AA * this.uHy >> 8);
    }
  }
  
  private void u(Drawable paramDrawable)
  {
    if (this.mDrawable != null)
    {
      this.mDrawable.setCallback(null);
      unscheduleDrawable(this.mDrawable);
    }
    this.mDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (paramDrawable.isStateful()) {
        paramDrawable.setState(getDrawableState());
      }
      paramDrawable.setLevel(this.uHC);
      this.uHD = paramDrawable.getIntrinsicWidth();
      this.uHE = paramDrawable.getIntrinsicHeight();
      cAE();
      cAD();
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.mDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  public int getBaseline()
  {
    if (this.OQ) {
      return getMeasuredHeight();
    }
    return -1;
  }
  
  public Drawable getDrawable()
  {
    return this.mDrawable;
  }
  
  public Matrix getImageMatrix()
  {
    return this.mMatrix;
  }
  
  public a getScaleType()
  {
    return this.uHv;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.mDrawable)
    {
      invalidate();
      return;
    }
    super.invalidateDrawable(paramDrawable);
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    if (this.uHA == null) {
      return super.onCreateDrawableState(paramInt);
    }
    if (!this.uHB) {
      return this.uHA;
    }
    return mergeDrawableStates(super.onCreateDrawableState(this.uHA.length + paramInt), this.uHA);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    super.onDraw(paramCanvas);
    if (this.mDrawable == null) {}
    while ((this.uHD == 0) || (this.uHE == 0)) {
      return;
    }
    if ((this.uHF == null) && (getPaddingTop() == 0) && (getPaddingLeft() == 0))
    {
      this.mDrawable.draw(paramCanvas);
      return;
    }
    int i = paramCanvas.getSaveCount();
    paramCanvas.save();
    if (this.uHI)
    {
      int j = getScrollX();
      int k = getScrollY();
      paramCanvas.clipRect(getPaddingLeft() + j, getPaddingTop() + k, j + getRight() - getLeft() - getPaddingRight(), k + getBottom() - getTop() - getPaddingBottom());
    }
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    if (this.uHF != null) {
      paramCanvas.concat(this.uHF);
    }
    this.mDrawable.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.uHw = true;
    cAD();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    cAB();
    float f = 0.0F;
    int k = 0;
    int m = 0;
    int j;
    int i;
    if (this.mDrawable == null)
    {
      this.uHD = -1;
      this.uHE = -1;
      j = 0;
      i = 0;
    }
    label178:
    label291:
    label319:
    label380:
    label391:
    label394:
    label405:
    for (;;)
    {
      int i2 = getPaddingLeft();
      int i3 = getPaddingRight();
      int n = getPaddingTop();
      int i1 = getPaddingBottom();
      if ((k != 0) || (m != 0))
      {
        paramInt1 = am(i + i2 + i3, this.gg, paramInt1);
        paramInt2 = am(j + n + i1, this.qMj, paramInt2);
        if ((f == 0.0F) || (Math.abs((paramInt1 - i2 - i3) / (paramInt2 - n - i1) - f) <= 1.0E-7D)) {
          break label394;
        }
        i = 0;
        if (k == 0) {
          break label391;
        }
        j = (int)((paramInt2 - n - i1) * f) + i2 + i3;
        if (j > paramInt1) {
          break label391;
        }
        i = 1;
        paramInt1 = j;
        if ((i != 0) || (m == 0)) {
          break label380;
        }
        i = (int)((paramInt1 - i2 - i3) / f) + n + i1;
        if (i > paramInt2) {
          break label380;
        }
        paramInt2 = paramInt1;
        paramInt1 = i;
      }
      for (;;)
      {
        setMeasuredDimension(paramInt2, paramInt1);
        return;
        j = this.uHD;
        n = this.uHE;
        i = j;
        if (j <= 0) {
          i = 1;
        }
        j = n;
        if (n <= 0) {
          j = 1;
        }
        if (!this.uHx) {
          break label405;
        }
        k = View.MeasureSpec.getMode(paramInt1);
        m = View.MeasureSpec.getMode(paramInt2);
        if (k != 1073741824)
        {
          k = 1;
          if (m == 1073741824) {
            break label319;
          }
        }
        for (m = 1;; m = 0)
        {
          f = i / j;
          break;
          k = 0;
          break label291;
        }
        i = Math.max(i2 + i3 + i, getSuggestedMinimumWidth());
        j = Math.max(j + (n + i1), getSuggestedMinimumHeight());
        i = resolveSize(i, paramInt1);
        paramInt1 = resolveSize(j, paramInt2);
        paramInt2 = i;
        continue;
        i = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = i;
        continue;
        break label178;
        i = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = i;
      }
    }
  }
  
  protected boolean onSetAlpha(int paramInt)
  {
    if (getBackground() == null)
    {
      paramInt = (paramInt >> 7) + paramInt;
      if (this.uHy != paramInt)
      {
        this.uHy = paramInt;
        this.uHz = true;
        cAE();
      }
      return true;
    }
    return false;
  }
  
  public void setAdjustViewBounds(boolean paramBoolean)
  {
    this.uHx = paramBoolean;
    if (paramBoolean) {
      setScaleType(a.uHO);
    }
  }
  
  public void setAlpha(int paramInt)
  {
    paramInt &= 0xFF;
    if (this.AA != paramInt)
    {
      this.AA = paramInt;
      this.uHz = true;
      cAE();
      invalidate();
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setColorFilter(int paramInt)
  {
    setColorFilter(new PorterDuffColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP));
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.jN != paramColorFilter)
    {
      this.jN = paramColorFilter;
      this.uHz = true;
      cAE();
      invalidate();
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    setImageDrawable(new BitmapDrawable(this.mContext.getResources(), paramBitmap));
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    if (this.mDrawable != paramDrawable)
    {
      this.uHu = 0;
      this.aMJ = null;
      u(paramDrawable);
      invalidate();
    }
  }
  
  public void setImageLevel(int paramInt)
  {
    this.uHC = paramInt;
    if (this.mDrawable != null)
    {
      this.mDrawable.setLevel(paramInt);
      cAC();
    }
  }
  
  public void setImageMatrix(Matrix paramMatrix)
  {
    Matrix localMatrix = paramMatrix;
    if (paramMatrix != null)
    {
      localMatrix = paramMatrix;
      if (paramMatrix.isIdentity()) {
        localMatrix = null;
      }
    }
    if (((localMatrix == null) && (!this.mMatrix.isIdentity())) || ((localMatrix != null) && (!this.mMatrix.equals(localMatrix))))
    {
      this.mMatrix.set(localMatrix);
      cAD();
      invalidate();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    if ((this.aMJ != null) || (this.uHu != paramInt))
    {
      u(null);
      this.uHu = paramInt;
      this.aMJ = null;
      cAB();
      invalidate();
    }
  }
  
  public void setImageURI(Uri paramUri)
  {
    if ((this.uHu != 0) || ((this.aMJ != paramUri) && ((paramUri == null) || (this.aMJ == null) || (!paramUri.equals(this.aMJ)))))
    {
      u(null);
      this.uHu = 0;
      this.aMJ = paramUri;
      cAB();
      invalidate();
    }
  }
  
  @TargetApi(11)
  public void setLayerType(int paramInt, Paint paramPaint)
  {
    if (((getDrawable() instanceof PictureDrawable)) && (paramInt != 1)) {
      return;
    }
    super.setLayerType(paramInt, paramPaint);
  }
  
  public void setMaxHeight(int paramInt)
  {
    this.qMj = paramInt;
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.gg = paramInt;
  }
  
  public void setScaleType(a parama)
  {
    if (parama == null) {
      throw new NullPointerException();
    }
    if (this.uHv != parama)
    {
      this.uHv = parama;
      if (this.uHv != a.uHQ) {
        break label51;
      }
    }
    label51:
    for (boolean bool = true;; bool = false)
    {
      setWillNotCacheDrawing(bool);
      requestLayout();
      invalidate();
      return;
    }
  }
  
  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    cAC();
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (this.mDrawable == paramDrawable) || (super.verifyDrawable(paramDrawable));
  }
  
  public static enum a
  {
    final int uHT;
    
    private a(int paramInt)
    {
      this.uHT = paramInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/widget/QImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */