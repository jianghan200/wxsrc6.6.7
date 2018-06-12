package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.c.a.b;
import android.support.v4.e.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class c<T>
  extends d<T>
{
  Map<b, MenuItem> HK;
  Map<android.support.v4.c.a.c, SubMenu> HL;
  final Context mContext;
  
  c(Context paramContext, T paramT)
  {
    super(paramT);
    this.mContext = paramContext;
  }
  
  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof android.support.v4.c.a.c))
    {
      android.support.v4.c.a.c localc = (android.support.v4.c.a.c)paramSubMenu;
      if (this.HL == null) {
        this.HL = new a();
      }
      SubMenu localSubMenu = (SubMenu)this.HL.get(localc);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = this.mContext;
        if (Build.VERSION.SDK_INT >= 14)
        {
          paramSubMenu = new q(paramSubMenu, localc);
          this.HL.put(localc, paramSubMenu);
        }
      }
      else
      {
        return paramSubMenu;
      }
      throw new UnsupportedOperationException();
    }
    return paramSubMenu;
  }
  
  final MenuItem f(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
    {
      b localb = (b)paramMenuItem;
      if (this.HK == null) {
        this.HK = new a();
      }
      MenuItem localMenuItem = (MenuItem)this.HK.get(paramMenuItem);
      paramMenuItem = localMenuItem;
      if (localMenuItem == null)
      {
        paramMenuItem = n.a(this.mContext, localb);
        this.HK.put(localb, paramMenuItem);
      }
      return paramMenuItem;
    }
    return paramMenuItem;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */