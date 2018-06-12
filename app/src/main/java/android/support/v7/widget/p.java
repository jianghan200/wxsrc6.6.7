package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

class p
  implements q
{
  final RectF Nx = new RectF();
  
  private void h(o paramo)
  {
    Rect localRect = new Rect();
    i(paramo).getPadding(localRect);
    paramo.E((int)Math.ceil(b(paramo)), (int)Math.ceil(c(paramo)));
    paramo.d(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  private static af i(o paramo)
  {
    return (af)paramo.getBackground();
  }
  
  public final float a(o paramo)
  {
    return i(paramo).gr;
  }
  
  public final void a(o paramo, float paramFloat)
  {
    af localaf = i(paramo);
    if (paramFloat < 0.0F) {
      throw new IllegalArgumentException("Invalid radius " + paramFloat + ". Must be >= 0");
    }
    paramFloat = (int)(0.5F + paramFloat);
    if (localaf.go != paramFloat)
    {
      localaf.go = paramFloat;
      localaf.gu = true;
      localaf.invalidateSelf();
    }
    h(paramo);
  }
  
  public final void a(o paramo, int paramInt)
  {
    paramo = i(paramo);
    paramo.cN.setColor(paramInt);
    paramo.invalidateSelf();
  }
  
  public final void a(o paramo, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = new af(paramContext.getResources(), paramInt, paramFloat1, paramFloat2, paramFloat3);
    paramContext.U(paramo.getPreventCornerOverlap());
    paramo.setBackgroundDrawable(paramContext);
    h(paramo);
  }
  
  public final float b(o paramo)
  {
    paramo = i(paramo);
    float f1 = Math.max(paramo.gr, paramo.go + paramo.Tr + paramo.gr / 2.0F);
    float f2 = paramo.gr;
    return (paramo.Tr + f2) * 2.0F + f1 * 2.0F;
  }
  
  public final void b(o paramo, float paramFloat)
  {
    af localaf = i(paramo);
    localaf.o(localaf.gt, paramFloat);
    h(paramo);
  }
  
  public final float c(o paramo)
  {
    paramo = i(paramo);
    float f1 = Math.max(paramo.gr, paramo.go + paramo.Tr + paramo.gr * 1.5F / 2.0F);
    float f2 = paramo.gr;
    return (paramo.Tr + f2 * 1.5F) * 2.0F + f1 * 2.0F;
  }
  
  public final void c(o paramo, float paramFloat)
  {
    paramo = i(paramo);
    paramo.o(paramFloat, paramo.gr);
  }
  
  public final float d(o paramo)
  {
    return i(paramo).go;
  }
  
  public final float e(o paramo)
  {
    return i(paramo).gt;
  }
  
  public void eN()
  {
    af.Ts = new af.a()
    {
      public final void a(Canvas paramAnonymousCanvas, RectF paramAnonymousRectF, float paramAnonymousFloat, Paint paramAnonymousPaint)
      {
        float f1 = 2.0F * paramAnonymousFloat;
        float f2 = paramAnonymousRectF.width() - f1 - 1.0F;
        float f3 = paramAnonymousRectF.height();
        if (paramAnonymousFloat >= 1.0F)
        {
          float f4 = paramAnonymousFloat + 0.5F;
          p.this.Nx.set(-f4, -f4, f4, f4);
          int i = paramAnonymousCanvas.save();
          paramAnonymousCanvas.translate(paramAnonymousRectF.left + f4, paramAnonymousRectF.top + f4);
          paramAnonymousCanvas.drawArc(p.this.Nx, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f2, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(p.this.Nx, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f3 - f1 - 1.0F, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(p.this.Nx, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f2, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(p.this.Nx, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.restoreToCount(i);
          paramAnonymousCanvas.drawRect(paramAnonymousRectF.left + f4 - 1.0F, paramAnonymousRectF.top, 1.0F + (paramAnonymousRectF.right - f4), paramAnonymousRectF.top + f4, paramAnonymousPaint);
          paramAnonymousCanvas.drawRect(paramAnonymousRectF.left + f4 - 1.0F, 1.0F + (paramAnonymousRectF.bottom - f4), 1.0F + (paramAnonymousRectF.right - f4), paramAnonymousRectF.bottom, paramAnonymousPaint);
        }
        f1 = paramAnonymousRectF.left;
        f2 = paramAnonymousRectF.top;
        paramAnonymousCanvas.drawRect(f1, Math.max(0.0F, paramAnonymousFloat - 1.0F) + f2, paramAnonymousRectF.right, 1.0F + (paramAnonymousRectF.bottom - paramAnonymousFloat), paramAnonymousPaint);
      }
    };
  }
  
  public final void f(o paramo) {}
  
  public final void g(o paramo)
  {
    i(paramo).U(paramo.getPreventCornerOverlap());
    h(paramo);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/v7/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */