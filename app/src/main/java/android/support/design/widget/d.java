package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.b.b;

class d
  extends Drawable
{
  final Paint cN = new Paint(1);
  final Rect cO = new Rect();
  final RectF cP = new RectF();
  float cQ;
  int cR;
  int cS;
  int cT;
  int cU;
  private ColorStateList cV;
  private int cW;
  boolean cX = true;
  float cY;
  
  public d()
  {
    this.cN.setStyle(Paint.Style.STROKE);
  }
  
  final void a(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null) {
      this.cW = paramColorStateList.getColorForState(getState(), this.cW);
    }
    this.cV = paramColorStateList;
    this.cX = true;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.cX)
    {
      localObject1 = this.cN;
      Object localObject2 = this.cO;
      copyBounds((Rect)localObject2);
      f1 = this.cQ / ((Rect)localObject2).height();
      int i = b.n(this.cR, this.cW);
      int j = b.n(this.cS, this.cW);
      int k = b.n(b.o(this.cS, 0), this.cW);
      int m = b.n(b.o(this.cU, 0), this.cW);
      int n = b.n(this.cU, this.cW);
      int i1 = b.n(this.cT, this.cW);
      float f2 = ((Rect)localObject2).top;
      float f3 = ((Rect)localObject2).bottom;
      localObject2 = Shader.TileMode.CLAMP;
      ((Paint)localObject1).setShader(new LinearGradient(0.0F, f2, 0.0F, f3, new int[] { i, j, k, m, n, i1 }, new float[] { 0.0F, f1, 0.5F, 0.5F, 1.0F - f1, 1.0F }, (Shader.TileMode)localObject2));
      this.cX = false;
    }
    float f1 = this.cN.getStrokeWidth() / 2.0F;
    Object localObject1 = this.cP;
    copyBounds(this.cO);
    ((RectF)localObject1).set(this.cO);
    ((RectF)localObject1).left += f1;
    ((RectF)localObject1).top += f1;
    ((RectF)localObject1).right -= f1;
    ((RectF)localObject1).bottom -= f1;
    paramCanvas.save();
    paramCanvas.rotate(this.cY, ((RectF)localObject1).centerX(), ((RectF)localObject1).centerY());
    paramCanvas.drawOval((RectF)localObject1, this.cN);
    paramCanvas.restore();
  }
  
  public int getOpacity()
  {
    if (this.cQ > 0.0F) {
      return -3;
    }
    return -2;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int i = Math.round(this.cQ);
    paramRect.set(i, i, i, i);
    return true;
  }
  
  public boolean isStateful()
  {
    return ((this.cV != null) && (this.cV.isStateful())) || (super.isStateful());
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.cX = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.cV != null)
    {
      int i = this.cV.getColorForState(paramArrayOfInt, this.cW);
      if (i != this.cW)
      {
        this.cX = true;
        this.cW = i;
      }
    }
    if (this.cX) {
      invalidateSelf();
    }
    return this.cX;
  }
  
  public void setAlpha(int paramInt)
  {
    this.cN.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.cN.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/android/support/design/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */