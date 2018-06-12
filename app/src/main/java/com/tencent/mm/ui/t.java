package com.tencent.mm.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.view.f.a;
import android.support.v7.view.g;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.mm.ui.b.a;
import com.tencent.mm.ui.b.a.a;
import com.tencent.mm.ui.b.b.a;

public final class t
  extends s
  implements b.a
{
  private ActionBar mActionBar;
  public x tnu = null;
  public com.tencent.mm.ui.b.b tnv;
  
  protected final String aYS()
  {
    if (this.tnu != null) {
      return this.tnu.getIdentityString();
    }
    return null;
  }
  
  public final boolean c(Menu paramMenu)
  {
    if (this.tnu != null) {
      this.tnu.onPrepareOptionsMenu(paramMenu);
    }
    return true;
  }
  
  protected final boolean cpZ()
  {
    return false;
  }
  
  public final boolean d(Menu paramMenu)
  {
    x localx = this.tnu;
    com.tencent.mm.ui.b.b localb = this.tnv;
    ActionBar localActionBar;
    if (localb.gh == null)
    {
      localActionBar = localb.getSupportActionBar();
      if (localActionBar == null) {
        break label55;
      }
    }
    label55:
    for (localb.gh = new g(localActionBar.getThemedContext());; localb.gh = new g(localb.mActivity))
    {
      localx.onCreateOptionsMenu(paramMenu, localb.gh);
      return true;
    }
  }
  
  protected final void dealContentView(View paramView)
  {
    if (this.tnu != null) {
      this.tnu.dealContentView(paramView);
    }
  }
  
  protected final String getClassName()
  {
    return this.tnu.getClass().getName();
  }
  
  protected final int getLayoutId()
  {
    if (this.tnu != null) {
      return this.tnu.getLayoutId();
    }
    return -1;
  }
  
  protected final View getLayoutView()
  {
    if (this.tnu != null) {
      return this.tnu.getLayoutView();
    }
    return null;
  }
  
  public final ActionBar getSupportActionBar()
  {
    if (this.mActionBar == null) {
      this.mActionBar = this.tnv.cqY();
    }
    return this.mActionBar;
  }
  
  public final boolean interceptSupportInvalidateOptionsMenu()
  {
    return true;
  }
  
  public final boolean j(MenuItem paramMenuItem)
  {
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected final void onCreateBeforeSetContentView()
  {
    if (this.tnu != null) {
      this.tnu.onCreateBeforeSetContentView();
    }
  }
  
  public final void onKeyboardStateChanged()
  {
    if (this.tnu != null) {
      this.tnu.onKeyboardStateChanged();
    }
  }
  
  public final ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    Object localObject = this.tnv;
    paramCallback = new f.a(((a)localObject).mActivity, paramCallback);
    if (((a)localObject).Ez != null) {
      ((a)localObject).Ez.finish();
    }
    a.a locala = new a.a((a)localObject, paramCallback);
    ActionBar localActionBar = ((a)localObject).getSupportActionBar();
    if (localActionBar != null) {
      ((a)localObject).Ez = localActionBar.a(locala);
    }
    localObject = ((a)localObject).Ez;
    if (localObject != null) {
      return paramCallback.b((android.support.v7.view.b)localObject);
    }
    return null;
  }
  
  public final void supportInvalidateOptionsMenu()
  {
    this.tnv.supportInvalidateOptionsMenu();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */