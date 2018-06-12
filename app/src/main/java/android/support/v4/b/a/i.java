package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class i
  extends Drawable
{
  public final Paint cN = new Paint(3);
  public float go;
  public final Bitmap mBitmap;
  private int rA = 119;
  public final BitmapShader rB;
  private final Matrix rC = new Matrix();
  final Rect rD = new Rect();
  private final RectF rE = new RectF();
  private boolean rF = true;
  public boolean rG;
  private int rH;
  private int rI;
  private int rz = 160;
  
  i(Resources paramResources, Bitmap paramBitmap)
  {
    if (paramResources != null) {
      this.rz = paramResources.getDisplayMetrics().densityDpi;
    }
    this.mBitmap = paramBitmap;
    if (this.mBitmap != null)
    {
      this.rH = this.mBitmap.getScaledWidth(this.rz);
      this.rI = this.mBitmap.getScaledHeight(this.rz);
      this.rB = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      return;
    }
    this.rI = -1;
    this.rH = -1;
    this.rB = null;
  }
  
  private void bI()
  {
    this.go = (Math.min(this.rI, this.rH) / 2);
  }
  
  public static boolean r(float paramFloat)
  {
    return paramFloat > 0.05F;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    throw new UnsupportedOperationException();
  }
  
  final void bG()
  {
    if (this.rF)
    {
      if (!this.rG) {
        break label220;
      }
      int i = Math.min(this.rH, this.rI);
      a(this.rA, i, i, getBounds(), this.rD);
      i = Math.min(this.rD.width(), this.rD.height());
      int j = Math.max(0, (this.rD.width() - i) / 2);
      int k = Math.max(0, (this.rD.height() - i) / 2);
      this.rD.inset(j, k);
      this.go = (i * 0.5F);
    }
    for (;;)
    {
      this.rE.set(this.rD);
      if (this.rB != null)
      {
        this.rC.setTranslate(this.rE.left, this.rE.top);
        this.rC.preScale(this.rE.width() / this.mBitmap.getWidth(), this.rE.height() / this.mBitmap.getHeight());
        this.rB.setLocalMatrix(this.rC);
        this.cN.setShader(this.rB);
      }
      this.rF = false;
      return;
      label220:
      a(this.rA, this.rH, this.rI, getBounds(), this.rD);
    }
  }
  
  public final void bH()
  {
    this.rG = true;
    this.rF = true;
    bI();
    this.cN.setShader(this.rB);
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = this.mBitmap;
    if (localBitmap == null) {
      return;
    }
    bG();
    if (this.cN.getShader() == null)
    {
      paramCanvas.drawBitmap(localBitmap, null, this.rD, this.cN);
      return;
    }
    paramCanvas.drawRoundRect(this.rE, this.go, this.go, this.cN);
  }
  
  public int getAlpha()
  {
    return this.cN.getAlpha();
  }
  
  public ColorFilter getColorFilter()
  {
    return this.cN.getColorFilter();
  }
  
  public int getIntrinsicHeight()
  {
    return this.rI;
  }
  
  public int getIntrinsicWidth()
  {
    return this.rH;
  }
  
  public int getOpacity()
  {
    if ((this.rA != 119) || (this.rG)) {}
    Bitmap localBitmap;
    do
    {
      return -3;
      localBitmap = this.mBitmap;
    } while ((localBitmap == null) || (localBitmap.hasAlpha()) || (this.cN.getAlpha() < 255) || (r(this.go)));
    return -1;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    if (this.rG) {
      bI();
    }
    this.rF = true;
  }
  
  public void setAlpha(int paramInt)
  {
    if (paramInt != this.cN.getAlpha())
    {
      this.cN.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.cN.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.cN.setDither(paramBoolean);
    invalidateSelf();
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.cN.setFilterBitmap(paramBoolean);
    invalidateSelf();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/v4/b/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */