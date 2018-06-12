package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class e
  extends d
{
  e(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  e(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }
  
  protected final Drawable a(Drawable.ConstantState paramConstantState, Resources paramResources)
  {
    return paramConstantState.newDrawable(paramResources);
  }
  
  final d.a bE()
  {
    return new a(this.rx);
  }
  
  private static final class a
    extends d.a
  {
    a(d.a parama)
    {
      super();
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new e(this, paramResources);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */