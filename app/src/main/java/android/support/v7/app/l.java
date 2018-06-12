package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.h;
import android.support.v7.a.a.j;
import android.support.v7.view.i;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.b;
import android.support.v7.widget.aq;
import android.support.v7.widget.u;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.ListAdapter;
import java.util.ArrayList;

final class l
  extends ActionBar
{
  private final Toolbar.b FA = new Toolbar.b()
  {
    public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      return l.this.Fu.onMenuItemSelected(0, paramAnonymousMenuItem);
    }
  };
  u Fs;
  boolean Ft;
  Window.Callback Fu;
  private boolean Fv;
  private boolean Fw;
  private ArrayList<Object> Fx = new ArrayList();
  e Fy;
  private final Runnable Fz = new Runnable()
  {
    public final void run()
    {
      l locall = l.this;
      Menu localMenu = locall.getMenu();
      if ((localMenu instanceof f)) {}
      for (localf = (f)localMenu;; localf = null)
      {
        if (localf != null) {
          localf.dJ();
        }
        try
        {
          localMenu.clear();
          if ((!locall.Fu.onCreatePanelMenu(0, localMenu)) || (!locall.Fu.onPreparePanel(0, null, localMenu))) {
            localMenu.clear();
          }
          return;
        }
        finally
        {
          if (localf == null) {
            break;
          }
          localf.dK();
        }
      }
    }
  };
  
  public l(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    this.Fs = new aq(paramToolbar, false);
    this.Fu = new d(paramCallback);
    this.Fs.setWindowCallback(this.Fu);
    paramToolbar.setOnMenuItemClickListener(this.FA);
    this.Fs.setWindowTitle(paramCharSequence);
  }
  
  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.Fs.getDisplayOptions();
    this.Fs.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public final void C(boolean paramBoolean) {}
  
  public final void D(boolean paramBoolean) {}
  
  public final void E(boolean paramBoolean)
  {
    if (paramBoolean == this.Fw) {}
    for (;;)
    {
      return;
      this.Fw = paramBoolean;
      int j = this.Fx.size();
      int i = 0;
      while (i < j)
      {
        this.Fx.get(i);
        i += 1;
      }
    }
  }
  
  public final void cZ()
  {
    setDisplayOptions(0, 2);
  }
  
  public final boolean collapseActionView()
  {
    if (this.Fs.hasExpandedActionView())
    {
      this.Fs.collapseActionView();
      return true;
    }
    return false;
  }
  
  public final void da()
  {
    setDisplayOptions(0, 8);
  }
  
  public final void db()
  {
    setDisplayOptions(16, 16);
  }
  
  public final boolean dc()
  {
    this.Fs.eQ().removeCallbacks(this.Fz);
    z.a(this.Fs.eQ(), this.Fz);
    return true;
  }
  
  public final View getCustomView()
  {
    return this.Fs.getCustomView();
  }
  
  public final int getDisplayOptions()
  {
    return this.Fs.getDisplayOptions();
  }
  
  public final int getHeight()
  {
    return this.Fs.getHeight();
  }
  
  final Menu getMenu()
  {
    if (!this.Fv)
    {
      this.Fs.a(new a((byte)0), new b((byte)0));
      this.Fv = true;
    }
    return this.Fs.getMenu();
  }
  
  public final Context getThemedContext()
  {
    return this.Fs.getContext();
  }
  
  public final CharSequence getTitle()
  {
    return this.Fs.getTitle();
  }
  
  public final void hide()
  {
    this.Fs.setVisibility(8);
  }
  
  public final boolean isShowing()
  {
    return this.Fs.getVisibility() == 0;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  final void onDestroy()
  {
    this.Fs.eQ().removeCallbacks(this.Fz);
  }
  
  public final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = getMenu();
    int i;
    if (localMenu != null)
    {
      if (paramKeyEvent == null) {
        break label56;
      }
      i = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
        break label61;
      }
    }
    label56:
    label61:
    for (boolean bool = true;; bool = false)
    {
      localMenu.setQwertyMode(bool);
      localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return true;
      i = -1;
      break;
    }
  }
  
  public final boolean requestFocus()
  {
    ViewGroup localViewGroup = this.Fs.eQ();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.Fs.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setCustomView(int paramInt)
  {
    setCustomView(LayoutInflater.from(this.Fs.getContext()).inflate(paramInt, this.Fs.eQ(), false));
  }
  
  public final void setCustomView(View paramView)
  {
    ActionBar.LayoutParams localLayoutParams = new ActionBar.LayoutParams();
    if (paramView != null) {
      paramView.setLayoutParams(localLayoutParams);
    }
    this.Fs.setCustomView(paramView);
  }
  
  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      setDisplayOptions(i, 4);
      return;
    }
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    setDisplayOptions(paramInt, -1);
  }
  
  public final void setElevation(float paramFloat)
  {
    z.g(this.Fs.eQ(), paramFloat);
  }
  
  public final void setHomeActionContentDescription(int paramInt)
  {
    this.Fs.setNavigationContentDescription(paramInt);
  }
  
  public final void setIcon(int paramInt)
  {
    this.Fs.setIcon(paramInt);
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    this.Fs.setLogo(paramDrawable);
  }
  
  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    this.Fs.setWindowTitle(paramCharSequence);
  }
  
  public final void show()
  {
    this.Fs.setVisibility(0);
  }
  
  private final class a
    implements android.support.v7.view.menu.l.a
  {
    private boolean EJ;
    
    private a() {}
    
    public final void a(f paramf, boolean paramBoolean)
    {
      if (this.EJ) {
        return;
      }
      this.EJ = true;
      l.this.Fs.dismissPopupMenus();
      if (l.this.Fu != null) {
        l.this.Fu.onPanelClosed(108, paramf);
      }
      this.EJ = false;
    }
    
    public final boolean d(f paramf)
    {
      if (l.this.Fu != null)
      {
        l.this.Fu.onMenuOpened(108, paramf);
        return true;
      }
      return false;
    }
  }
  
  private final class b
    implements f.a
  {
    private b() {}
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      return false;
    }
    
    public final void b(f paramf)
    {
      if (l.this.Fu != null)
      {
        if (!l.this.Fs.isOverflowMenuShowing()) {
          break label41;
        }
        l.this.Fu.onPanelClosed(108, paramf);
      }
      label41:
      while (!l.this.Fu.onPreparePanel(0, null, paramf)) {
        return;
      }
      l.this.Fu.onMenuOpened(108, paramf);
    }
  }
  
  private final class c
    implements android.support.v7.view.menu.l.a
  {
    private c() {}
    
    public final void a(f paramf, boolean paramBoolean)
    {
      if (l.this.Fu != null) {
        l.this.Fu.onPanelClosed(0, paramf);
      }
    }
    
    public final boolean d(f paramf)
    {
      if ((paramf == null) && (l.this.Fu != null)) {
        l.this.Fu.onMenuOpened(0, paramf);
      }
      return true;
    }
  }
  
  private final class d
    extends i
  {
    public d(Window.Callback paramCallback)
    {
      super();
    }
    
    public final View onCreatePanelView(int paramInt)
    {
      switch (paramInt)
      {
      }
      Menu localMenu;
      do
      {
        return super.onCreatePanelView(paramInt);
        localMenu = l.this.Fs.getMenu();
      } while ((!onPreparePanel(paramInt, null, localMenu)) || (!onMenuOpened(paramInt, localMenu)));
      l locall = l.this;
      f localf;
      Object localObject;
      Resources.Theme localTheme;
      if ((locall.Fy == null) && ((localMenu instanceof f)))
      {
        localf = (f)localMenu;
        localObject = locall.Fs.getContext();
        TypedValue localTypedValue = new TypedValue();
        localTheme = ((Context)localObject).getResources().newTheme();
        localTheme.setTo(((Context)localObject).getTheme());
        localTheme.resolveAttribute(a.a.actionBarPopupTheme, localTypedValue, true);
        if (localTypedValue.resourceId != 0) {
          localTheme.applyStyle(localTypedValue.resourceId, true);
        }
        localTheme.resolveAttribute(a.a.panelMenuListTheme, localTypedValue, true);
        if (localTypedValue.resourceId == 0) {
          break label261;
        }
        localTheme.applyStyle(localTypedValue.resourceId, true);
      }
      for (;;)
      {
        localObject = new ContextThemeWrapper((Context)localObject, 0);
        ((Context)localObject).getTheme().setTo(localTheme);
        locall.Fy = new e((Context)localObject, a.h.abc_list_menu_item_layout);
        locall.Fy.bp = new l.c(locall, (byte)0);
        localf.a(locall.Fy);
        if ((localMenu != null) && (locall.Fy != null)) {
          break;
        }
        return null;
        label261:
        localTheme.applyStyle(a.j.Theme_AppCompat_CompactMenu, true);
      }
      if (locall.Fy.getAdapter().getCount() > 0) {
        return (View)locall.Fy.e(locall.Fs.eQ());
      }
      return null;
    }
    
    public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
      if ((bool) && (!l.this.Ft))
      {
        l.this.Fs.eh();
        l.this.Ft = true;
      }
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */