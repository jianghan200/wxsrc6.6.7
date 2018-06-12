package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class p
  extends f
  implements SubMenu
{
  public f Jk;
  private h Jl;
  
  public p(Context paramContext, f paramf, h paramh)
  {
    super(paramContext);
    this.Jk = paramf;
    this.Jl = paramh;
  }
  
  public final void a(f.a parama)
  {
    this.Jk.a(parama);
  }
  
  final boolean b(f paramf, MenuItem paramMenuItem)
  {
    return (super.b(paramf, paramMenuItem)) || (this.Jk.b(paramf, paramMenuItem));
  }
  
  public final String dG()
  {
    if (this.Jl != null) {}
    for (int i = this.Jl.getItemId(); i == 0; i = 0) {
      return null;
    }
    return super.dG() + ":" + i;
  }
  
  public final boolean dH()
  {
    return this.Jk.dH();
  }
  
  public final boolean dI()
  {
    return this.Jk.dI();
  }
  
  public final f dQ()
  {
    return this.Jk;
  }
  
  public final boolean g(h paramh)
  {
    return this.Jk.g(paramh);
  }
  
  public MenuItem getItem()
  {
    return this.Jl;
  }
  
  public final boolean h(h paramh)
  {
    return this.Jk.h(paramh);
  }
  
  public SubMenu setHeaderIcon(int paramInt)
  {
    super.k(a.f(this.mContext, paramInt));
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.k(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt)
  {
    super.g(this.mContext.getResources().getString(paramInt));
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.g(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView)
  {
    super.a(null, null, paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt)
  {
    this.Jl.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable)
  {
    this.Jl.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.Jk.setQwertyMode(paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */