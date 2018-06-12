package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.support.v4.view.d;
import android.support.v4.view.m.e;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class a
  implements b
{
  private final int Hm;
  private final int Hn;
  private final int Ho;
  private CharSequence Hp;
  private Intent Hq;
  private char Hr;
  private char Hs;
  private Drawable Ht;
  private int Hu = 0;
  private MenuItem.OnMenuItemClickListener Hv;
  private Context mContext;
  private final int mId;
  private int rJ = 16;
  private CharSequence sn;
  
  public a(Context paramContext, CharSequence paramCharSequence)
  {
    this.mContext = paramContext;
    this.mId = 16908332;
    this.Hm = 0;
    this.Hn = 0;
    this.Ho = 0;
    this.sn = paramCharSequence;
  }
  
  public final b a(d paramd)
  {
    throw new UnsupportedOperationException();
  }
  
  public final b a(m.e parame)
  {
    return this;
  }
  
  public final d bJ()
  {
    return null;
  }
  
  public final boolean collapseActionView()
  {
    return false;
  }
  
  public final boolean expandActionView()
  {
    return false;
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }
  
  public final View getActionView()
  {
    return null;
  }
  
  public final char getAlphabeticShortcut()
  {
    return this.Hs;
  }
  
  public final int getGroupId()
  {
    return this.Hm;
  }
  
  public final Drawable getIcon()
  {
    return this.Ht;
  }
  
  public final Intent getIntent()
  {
    return this.Hq;
  }
  
  public final int getItemId()
  {
    return this.mId;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final char getNumericShortcut()
  {
    return this.Hr;
  }
  
  public final int getOrder()
  {
    return this.Ho;
  }
  
  public final SubMenu getSubMenu()
  {
    return null;
  }
  
  public final CharSequence getTitle()
  {
    return this.sn;
  }
  
  public final CharSequence getTitleCondensed()
  {
    if (this.Hp != null) {
      return this.Hp;
    }
    return this.sn;
  }
  
  public final boolean hasSubMenu()
  {
    return false;
  }
  
  public final boolean isActionViewExpanded()
  {
    return false;
  }
  
  public final boolean isCheckable()
  {
    return (this.rJ & 0x1) != 0;
  }
  
  public final boolean isChecked()
  {
    return (this.rJ & 0x2) != 0;
  }
  
  public final boolean isEnabled()
  {
    return (this.rJ & 0x10) != 0;
  }
  
  public final boolean isVisible()
  {
    return (this.rJ & 0x8) == 0;
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.Hs = paramChar;
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int j = this.rJ;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.rJ = (i | j & 0xFFFFFFFE);
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    int j = this.rJ;
    if (paramBoolean) {}
    for (int i = 2;; i = 0)
    {
      this.rJ = (i | j & 0xFFFFFFFD);
      return this;
    }
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int j = this.rJ;
    if (paramBoolean) {}
    for (int i = 16;; i = 0)
    {
      this.rJ = (i | j & 0xFFFFFFEF);
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    this.Hu = paramInt;
    this.Ht = android.support.v4.content.a.f(this.mContext, paramInt);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.Ht = paramDrawable;
    this.Hu = 0;
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    this.Hq = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    this.Hr = paramChar;
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.Hv = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.Hr = paramChar1;
    this.Hs = paramChar2;
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {}
  
  public final MenuItem setTitle(int paramInt)
  {
    this.sn = this.mContext.getResources().getString(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.sn = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.Hp = paramCharSequence;
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    int j = this.rJ;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      this.rJ = (i | j & 0x8);
      return this;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */