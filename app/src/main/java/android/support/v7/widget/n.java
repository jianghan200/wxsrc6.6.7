package android.support.v7.widget;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

final class n
  implements q
{
  public final float a(o paramo)
  {
    return ((ae)paramo.getBackground()).To;
  }
  
  public final void a(o paramo, float paramFloat)
  {
    paramo = (ae)paramo.getBackground();
    if (paramFloat != paramo.Tl)
    {
      paramo.Tl = paramFloat;
      paramo.h(null);
      paramo.invalidateSelf();
    }
  }
  
  public final void a(o paramo, int paramInt)
  {
    paramo = (ae)paramo.getBackground();
    paramo.cN.setColor(paramInt);
    paramo.invalidateSelf();
  }
  
  public final void a(o paramo, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramo.setBackgroundDrawable(new ae(paramInt, paramFloat1));
    paramContext = (View)paramo;
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    b(paramo, paramFloat3);
  }
  
  public final float b(o paramo)
  {
    return d(paramo) * 2.0F;
  }
  
  public final void b(o paramo, float paramFloat)
  {
    ae localae = (ae)paramo.getBackground();
    boolean bool1 = paramo.getUseCompatPadding();
    boolean bool2 = paramo.getPreventCornerOverlap();
    if ((paramFloat != localae.To) || (localae.Tp != bool1) || (localae.Tq != bool2))
    {
      localae.To = paramFloat;
      localae.Tp = bool1;
      localae.Tq = bool2;
      localae.h(null);
      localae.invalidateSelf();
    }
    if (!paramo.getUseCompatPadding())
    {
      paramo.d(0, 0, 0, 0);
      return;
    }
    paramFloat = a(paramo);
    float f = d(paramo);
    int i = (int)Math.ceil(af.d(paramFloat, f, paramo.getPreventCornerOverlap()));
    int j = (int)Math.ceil(af.c(paramFloat, f, paramo.getPreventCornerOverlap()));
    paramo.d(i, j, i, j);
  }
  
  public final float c(o paramo)
  {
    return d(paramo) * 2.0F;
  }
  
  public final void c(o paramo, float paramFloat)
  {
    ((View)paramo).setElevation(paramFloat);
  }
  
  public final float d(o paramo)
  {
    return ((ae)paramo.getBackground()).Tl;
  }
  
  public final float e(o paramo)
  {
    return ((View)paramo).getElevation();
  }
  
  public final void eN() {}
  
  public final void f(o paramo)
  {
    b(paramo, a(paramo));
  }
  
  public final void g(o paramo)
  {
    b(paramo, a(paramo));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/android/support/v7/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */