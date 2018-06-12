package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.view.SubMenu;

public final class a
  extends f
{
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = (h)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    c localc = new c(this.mContext, this, paramCharSequence);
    paramCharSequence.b(localc);
    return localc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/design/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */