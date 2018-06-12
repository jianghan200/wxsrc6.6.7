package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.i;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

abstract class f
  extends e
{
  final Window CS;
  final Window.Callback Ef;
  final Window.Callback Eg;
  final d Eh;
  boolean Ei;
  boolean Ej;
  boolean Ek;
  boolean El;
  boolean Em;
  boolean En;
  MenuInflater gh;
  ActionBar mActionBar;
  final Context mContext;
  CharSequence sn;
  
  f(Context paramContext, Window paramWindow, d paramd)
  {
    this.mContext = paramContext;
    this.CS = paramWindow;
    this.Eh = paramd;
    this.Ef = this.CS.getCallback();
    if ((this.Ef instanceof b)) {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    this.Eg = a(this.Ef);
    this.CS.setCallback(this.Eg);
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new b(paramCallback);
  }
  
  abstract void aE(int paramInt);
  
  abstract boolean aF(int paramInt);
  
  abstract b b(b.a parama);
  
  public boolean df()
  {
    return false;
  }
  
  abstract void dh();
  
  final Context di()
  {
    Context localContext = null;
    Object localObject = getSupportActionBar();
    if (localObject != null) {
      localContext = ((ActionBar)localObject).getThemedContext();
    }
    localObject = localContext;
    if (localContext == null) {
      localObject = this.mContext;
    }
    return (Context)localObject;
  }
  
  abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);
  
  abstract void f(CharSequence paramCharSequence);
  
  public final a.a getDrawerToggleDelegate()
  {
    return new a((byte)0);
  }
  
  public final MenuInflater getMenuInflater()
  {
    if (this.gh == null)
    {
      dh();
      if (this.mActionBar == null) {
        break label43;
      }
    }
    label43:
    for (Context localContext = this.mActionBar.getThemedContext();; localContext = this.mContext)
    {
      this.gh = new g(localContext);
      return this.gh;
    }
  }
  
  public final ActionBar getSupportActionBar()
  {
    dh();
    return this.mActionBar;
  }
  
  public void onDestroy()
  {
    this.En = true;
  }
  
  abstract boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent);
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.sn = paramCharSequence;
    f(paramCharSequence);
  }
  
  private final class a
    implements a.a
  {
    private a() {}
    
    public final void aD(int paramInt)
    {
      ActionBar localActionBar = f.this.getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.setHomeActionContentDescription(paramInt);
      }
    }
  }
  
  class b
    extends i
  {
    b(Window.Callback paramCallback)
    {
      super();
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (f.this.dispatchKeyEvent(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      return (super.dispatchKeyShortcutEvent(paramKeyEvent)) || (f.this.onKeyShortcut(paramKeyEvent.getKeyCode(), paramKeyEvent));
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof android.support.v7.view.menu.f))) {
        return false;
      }
      return super.onCreatePanelMenu(paramInt, paramMenu);
    }
    
    public boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      f.this.aF(paramInt);
      return true;
    }
    
    public void onPanelClosed(int paramInt, Menu paramMenu)
    {
      super.onPanelClosed(paramInt, paramMenu);
      f.this.aE(paramInt);
    }
    
    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      android.support.v7.view.menu.f localf;
      boolean bool1;
      if ((paramMenu instanceof android.support.v7.view.menu.f))
      {
        localf = (android.support.v7.view.menu.f)paramMenu;
        if ((paramInt != 0) || (localf != null)) {
          break label34;
        }
        bool1 = false;
      }
      label34:
      boolean bool2;
      do
      {
        return bool1;
        localf = null;
        break;
        if (localf != null) {
          localf.Iy = true;
        }
        bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
        bool1 = bool2;
      } while (localf == null);
      localf.Iy = false;
      return bool2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */