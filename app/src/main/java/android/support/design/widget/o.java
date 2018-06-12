package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.design.a.c;
import android.support.v7.c.a.a;

final class o
  extends a
{
  static final double gk = Math.cos(Math.toRadians(45.0D));
  float cY;
  final Paint gl;
  final Paint gm;
  final RectF gn;
  float go;
  Path gp;
  float gq;
  float gr;
  float gs;
  float gt;
  private boolean gu = true;
  private final int gv;
  private final int gw;
  private final int gx;
  boolean gy = true;
  private boolean gz = false;
  
  public o(Resources paramResources, Drawable paramDrawable, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramDrawable);
    this.gv = paramResources.getColor(a.c.design_fab_shadow_start_color);
    this.gw = paramResources.getColor(a.c.design_fab_shadow_mid_color);
    this.gx = paramResources.getColor(a.c.design_fab_shadow_end_color);
    this.gl = new Paint(5);
    this.gl.setStyle(Paint.Style.FILL);
    this.go = Math.round(paramFloat1);
    this.gn = new RectF();
    this.gm = new Paint(this.gl);
    this.gm.setAntiAlias(false);
    o(paramFloat2, paramFloat3);
  }
  
  public static float c(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (float)(1.5F * paramFloat1 + (1.0D - gk) * paramFloat2);
    }
    return 1.5F * paramFloat1;
  }
  
  public static float d(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1;
    if (paramBoolean) {
      f = (float)(paramFloat1 + (1.0D - gk) * paramFloat2);
    }
    return f;
  }
  
  private static int n(float paramFloat)
  {
    int j = Math.round(paramFloat);
    int i = j;
    if (j % 2 == 1) {
      i = j - 1;
    }
    return i;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    float f1;
    float f2;
    float f3;
    int i;
    int k;
    if (this.gu)
    {
      Object localObject = getBounds();
      f1 = this.gr * 1.5F;
      this.gn.set(((Rect)localObject).left + this.gr, ((Rect)localObject).top + f1, ((Rect)localObject).right - this.gr, ((Rect)localObject).bottom - f1);
      this.mDrawable.setBounds((int)this.gn.left, (int)this.gn.top, (int)this.gn.right, (int)this.gn.bottom);
      localObject = new RectF(-this.go, -this.go, this.go, this.go);
      RectF localRectF = new RectF((RectF)localObject);
      localRectF.inset(-this.gs, -this.gs);
      if (this.gp == null)
      {
        this.gp = new Path();
        this.gp.setFillType(Path.FillType.EVEN_ODD);
        this.gp.moveTo(-this.go, 0.0F);
        this.gp.rLineTo(-this.gs, 0.0F);
        this.gp.arcTo(localRectF, 180.0F, 90.0F, false);
        this.gp.arcTo((RectF)localObject, 270.0F, -90.0F, false);
        this.gp.close();
        f1 = -localRectF.top;
        if (f1 > 0.0F)
        {
          f2 = this.go / f1;
          f3 = (1.0F - f2) / 2.0F;
          localPaint = this.gl;
          i = this.gv;
          j = this.gw;
          k = this.gx;
          Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
          localPaint.setShader(new RadialGradient(0.0F, 0.0F, f1, new int[] { 0, i, j, k }, new float[] { 0.0F, f2, f2 + f3, 1.0F }, localTileMode));
        }
        Paint localPaint = this.gm;
        f1 = ((RectF)localObject).top;
        f2 = localRectF.top;
        i = this.gv;
        j = this.gw;
        k = this.gx;
        localObject = Shader.TileMode.CLAMP;
        localPaint.setShader(new LinearGradient(0.0F, f1, 0.0F, f2, new int[] { i, j, k }, new float[] { 0.0F, 0.5F, 1.0F }, (Shader.TileMode)localObject));
        this.gm.setAntiAlias(false);
        this.gu = false;
      }
    }
    else
    {
      k = paramCanvas.save();
      paramCanvas.rotate(this.cY, this.gn.centerX(), this.gn.centerY());
      f1 = -this.go - this.gs;
      f2 = this.go;
      if (this.gn.width() - 2.0F * f2 <= 0.0F) {
        break label1061;
      }
      i = 1;
      label535:
      if (this.gn.height() - 2.0F * f2 <= 0.0F) {
        break label1067;
      }
    }
    label1061:
    label1067:
    for (int j = 1;; j = 0)
    {
      float f6 = this.gt;
      float f7 = this.gt;
      f3 = this.gt;
      float f8 = this.gt;
      float f4 = this.gt;
      float f5 = this.gt;
      f3 = f2 / (f3 - f8 * 0.5F + f2);
      f6 = f2 / (f6 - f7 * 0.25F + f2);
      f4 = f2 / (f2 + (f4 - f5 * 1.0F));
      int m = paramCanvas.save();
      paramCanvas.translate(this.gn.left + f2, this.gn.top + f2);
      paramCanvas.scale(f3, f6);
      paramCanvas.drawPath(this.gp, this.gl);
      if (i != 0)
      {
        paramCanvas.scale(1.0F / f3, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.gn.width() - 2.0F * f2, -this.go, this.gm);
      }
      paramCanvas.restoreToCount(m);
      m = paramCanvas.save();
      paramCanvas.translate(this.gn.right - f2, this.gn.bottom - f2);
      paramCanvas.scale(f3, f4);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.gp, this.gl);
      if (i != 0)
      {
        paramCanvas.scale(1.0F / f3, 1.0F);
        f5 = this.gn.width();
        f7 = -this.go;
        paramCanvas.drawRect(0.0F, f1, f5 - 2.0F * f2, this.gs + f7, this.gm);
      }
      paramCanvas.restoreToCount(m);
      i = paramCanvas.save();
      paramCanvas.translate(this.gn.left + f2, this.gn.bottom - f2);
      paramCanvas.scale(f3, f4);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.gp, this.gl);
      if (j != 0)
      {
        paramCanvas.scale(1.0F / f4, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.gn.height() - 2.0F * f2, -this.go, this.gm);
      }
      paramCanvas.restoreToCount(i);
      i = paramCanvas.save();
      paramCanvas.translate(this.gn.right - f2, this.gn.top + f2);
      paramCanvas.scale(f3, f6);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.gp, this.gl);
      if (j != 0)
      {
        paramCanvas.scale(1.0F / f6, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.gn.height() - 2.0F * f2, -this.go, this.gm);
      }
      paramCanvas.restoreToCount(i);
      paramCanvas.restoreToCount(k);
      super.draw(paramCanvas);
      return;
      this.gp.reset();
      break;
      i = 0;
      break label535;
    }
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    int i = (int)Math.ceil(c(this.gr, this.go, this.gy));
    int j = (int)Math.ceil(d(this.gr, this.go, this.gy));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  final void o(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 < 0.0F) || (paramFloat2 < 0.0F)) {
      throw new IllegalArgumentException("invalid shadow size");
    }
    float f = n(paramFloat1);
    paramFloat2 = n(paramFloat2);
    paramFloat1 = f;
    if (f > paramFloat2)
    {
      if (!this.gz) {
        this.gz = true;
      }
      paramFloat1 = paramFloat2;
    }
    if ((this.gt == paramFloat1) && (this.gr == paramFloat2)) {
      return;
    }
    this.gt = paramFloat1;
    this.gr = paramFloat2;
    this.gs = Math.round(paramFloat1 * 1.5F);
    this.gq = paramFloat2;
    this.gu = true;
    invalidateSelf();
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    this.gu = true;
  }
  
  public final void setAlpha(int paramInt)
  {
    super.setAlpha(paramInt);
    this.gl.setAlpha(paramInt);
    this.gm.setAlpha(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/design/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */