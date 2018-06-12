package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.c.a.b;
import android.support.v4.view.d;
import android.support.v4.view.d.b;
import android.support.v4.view.m.e;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import java.util.ArrayList;

public final class h
  implements b
{
  static String IL;
  static String IM;
  static String IN;
  static String IO;
  private final int Hm;
  private final int Hn;
  final int Ho;
  private CharSequence Hp;
  private Intent Hq;
  private char Hr;
  private char Hs;
  private Drawable Ht;
  private int Hu = 0;
  private MenuItem.OnMenuItemClickListener Hv;
  private p IC;
  private Runnable IE;
  int IF = 0;
  private View IG;
  public d IH;
  private m.e II;
  private boolean IJ = false;
  ContextMenu.ContextMenuInfo IK;
  f bq;
  private final int mId;
  private int rJ = 16;
  private CharSequence sn;
  
  h(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.bq = paramf;
    this.mId = paramInt2;
    this.Hm = paramInt1;
    this.Hn = paramInt3;
    this.Ho = paramInt4;
    this.sn = paramCharSequence;
    this.IF = paramInt5;
  }
  
  private void L(boolean paramBoolean)
  {
    int j = this.rJ;
    int k = this.rJ;
    if (paramBoolean) {}
    for (int i = 2;; i = 0)
    {
      this.rJ = (i | k & 0xFFFFFFFD);
      if (j != this.rJ) {
        this.bq.p(false);
      }
      return;
    }
  }
  
  private b aJ(View paramView)
  {
    this.IG = paramView;
    this.IH = null;
    if ((paramView != null) && (paramView.getId() == -1) && (this.mId > 0)) {
      paramView.setId(this.mId);
    }
    this.bq.dM();
    return this;
  }
  
  public final void K(boolean paramBoolean)
  {
    int j = this.rJ;
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      this.rJ = (i | j & 0xFFFFFFFB);
      return;
    }
  }
  
  final boolean M(boolean paramBoolean)
  {
    boolean bool = false;
    int j = this.rJ;
    int k = this.rJ;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      this.rJ = (i | k & 0xFFFFFFF7);
      paramBoolean = bool;
      if (j != this.rJ) {
        paramBoolean = true;
      }
      return paramBoolean;
    }
  }
  
  public final void N(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.rJ |= 0x20;
      return;
    }
    this.rJ &= 0xFFFFFFDF;
  }
  
  public final void O(boolean paramBoolean)
  {
    this.IJ = paramBoolean;
    this.bq.p(false);
  }
  
  public final b a(d paramd)
  {
    if (this.IH != null)
    {
      d locald = this.IH;
      locald.ue = null;
      locald.ud = null;
    }
    this.IG = null;
    this.IH = paramd;
    this.bq.p(true);
    if (this.IH != null) {
      this.IH.a(new d.b()
      {
        public final void ca()
        {
          h.i(h.this).dL();
        }
      });
    }
    return this;
  }
  
  public final b a(m.e parame)
  {
    this.II = parame;
    return this;
  }
  
  final CharSequence a(m.a parama)
  {
    if ((parama != null) && (parama.M())) {
      return getTitleCondensed();
    }
    return getTitle();
  }
  
  public final void b(p paramp)
  {
    this.IC = paramp;
    paramp.setHeaderTitle(getTitle());
  }
  
  public final d bJ()
  {
    return this.IH;
  }
  
  public final boolean collapseActionView()
  {
    if ((this.IF & 0x8) == 0) {}
    do
    {
      return false;
      if (this.IG == null) {
        return true;
      }
    } while ((this.II != null) && (!this.II.onMenuItemActionCollapse(this)));
    return this.bq.h(this);
  }
  
  public final boolean dR()
  {
    if ((this.Hv != null) && (this.Hv.onMenuItemClick(this))) {}
    do
    {
      do
      {
        return true;
      } while (this.bq.b(this.bq.dQ(), this));
      if (this.IE != null)
      {
        this.IE.run();
        return true;
      }
      if (this.Hq != null) {
        try
        {
          this.bq.mContext.startActivity(this.Hq);
          return true;
        }
        catch (ActivityNotFoundException localActivityNotFoundException) {}
      }
    } while ((this.IH != null) && (this.IH.onPerformDefaultAction()));
    return false;
  }
  
  final char dS()
  {
    if (this.bq.dH()) {
      return this.Hs;
    }
    return this.Hr;
  }
  
  final boolean dT()
  {
    return (this.bq.dI()) && (dS() != 0);
  }
  
  public final boolean dU()
  {
    return (this.rJ & 0x4) != 0;
  }
  
  public final boolean dV()
  {
    return (this.rJ & 0x20) == 32;
  }
  
  public final boolean dW()
  {
    return (this.IF & 0x1) == 1;
  }
  
  public final boolean dX()
  {
    return (this.IF & 0x2) == 2;
  }
  
  public final boolean dY()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((this.IF & 0x8) != 0)
    {
      if ((this.IG == null) && (this.IH != null)) {
        this.IG = this.IH.onCreateActionView(this);
      }
      bool1 = bool2;
      if (this.IG != null) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean expandActionView()
  {
    if (!dY()) {}
    while ((this.II != null) && (!this.II.onMenuItemActionExpand(this))) {
      return false;
    }
    return this.bq.g(this);
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public final View getActionView()
  {
    if (this.IG != null) {
      return this.IG;
    }
    if (this.IH != null)
    {
      this.IG = this.IH.onCreateActionView(this);
      return this.IG;
    }
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
    if (this.Ht != null) {
      return this.Ht;
    }
    if (this.Hu != 0)
    {
      Drawable localDrawable = android.support.v7.widget.h.eJ().a(this.bq.mContext, this.Hu, false);
      this.Hu = 0;
      this.Ht = localDrawable;
      return localDrawable;
    }
    return null;
  }
  
  public final Intent getIntent()
  {
    return this.Hq;
  }
  
  @ViewDebug.CapturedViewProperty
  public final int getItemId()
  {
    return this.mId;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.IK;
  }
  
  public final char getNumericShortcut()
  {
    return this.Hr;
  }
  
  public final int getOrder()
  {
    return this.Hn;
  }
  
  public final SubMenu getSubMenu()
  {
    return this.IC;
  }
  
  @ViewDebug.CapturedViewProperty
  public final CharSequence getTitle()
  {
    return this.sn;
  }
  
  public final CharSequence getTitleCondensed()
  {
    if (this.Hp != null) {}
    for (CharSequence localCharSequence = this.Hp;; localCharSequence = this.sn)
    {
      Object localObject = localCharSequence;
      if (Build.VERSION.SDK_INT < 18)
      {
        localObject = localCharSequence;
        if (localCharSequence != null)
        {
          localObject = localCharSequence;
          if (!(localCharSequence instanceof String)) {
            localObject = localCharSequence.toString();
          }
        }
      }
      return (CharSequence)localObject;
    }
  }
  
  public final boolean hasSubMenu()
  {
    return this.IC != null;
  }
  
  public final boolean isActionViewExpanded()
  {
    return this.IJ;
  }
  
  public final boolean isCheckable()
  {
    return (this.rJ & 0x1) == 1;
  }
  
  public final boolean isChecked()
  {
    return (this.rJ & 0x2) == 2;
  }
  
  public final boolean isEnabled()
  {
    return (this.rJ & 0x10) != 0;
  }
  
  public final boolean isVisible()
  {
    if ((this.IH != null) && (this.IH.overridesItemVisibility())) {
      if (((this.rJ & 0x8) != 0) || (!this.IH.isVisible())) {}
    }
    while ((this.rJ & 0x8) == 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.Hs == paramChar) {
      return this;
    }
    this.Hs = Character.toLowerCase(paramChar);
    this.bq.p(false);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int j = this.rJ;
    int k = this.rJ;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.rJ = (i | k & 0xFFFFFFFE);
      if (j != this.rJ) {
        this.bq.p(false);
      }
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    if ((this.rJ & 0x4) != 0)
    {
      f localf = this.bq;
      int j = getGroupId();
      int k = localf.bA.size();
      int i = 0;
      if (i < k)
      {
        h localh = (h)localf.bA.get(i);
        if ((localh.getGroupId() == j) && (localh.dU()) && (localh.isCheckable())) {
          if (localh != this) {
            break label100;
          }
        }
        label100:
        for (paramBoolean = true;; paramBoolean = false)
        {
          localh.L(paramBoolean);
          i += 1;
          break;
        }
      }
    }
    else
    {
      L(paramBoolean);
    }
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (this.rJ |= 0x10;; this.rJ &= 0xFFFFFFEF)
    {
      this.bq.p(false);
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    this.Ht = null;
    this.Hu = paramInt;
    this.bq.p(false);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.Hu = 0;
    this.Ht = paramDrawable;
    this.bq.p(false);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    this.Hq = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    if (this.Hr == paramChar) {
      return this;
    }
    this.Hr = paramChar;
    this.bq.p(false);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.Hv = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.Hr = paramChar1;
    this.Hs = Character.toLowerCase(paramChar2);
    this.bq.p(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    default: 
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    this.IF = paramInt;
    this.bq.dM();
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    return setTitle(this.bq.mContext.getString(paramInt));
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.sn = paramCharSequence;
    this.bq.p(false);
    if (this.IC != null) {
      this.IC.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.Hp = paramCharSequence;
    this.bq.p(false);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    if (M(paramBoolean)) {
      this.bq.dL();
    }
    return this;
  }
  
  public final String toString()
  {
    if (this.sn != null) {
      return this.sn.toString();
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */