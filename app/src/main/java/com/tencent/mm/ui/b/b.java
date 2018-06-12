package com.tencent.mm.ui.b;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.support.v7.widget.u;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

public final class b
  extends a
  implements f.a, l.a
{
  public ViewGroup CK;
  private boolean EE;
  private f bq;
  a tqW;
  boolean tqX;
  private final Runnable tqY = new Runnable()
  {
    public final void run()
    {
      b localb = b.this;
      Object localObject = localb.mActivity;
      ActionBar localActionBar = localb.getSupportActionBar();
      if (localActionBar != null) {
        localObject = localActionBar.getThemedContext();
      }
      localObject = new f((Context)localObject);
      ((f)localObject).a(localb);
      if (b.this.tqW != null)
      {
        b.this.tqW.d((Menu)localObject);
        b.this.tqW.c((Menu)localObject);
        b.a(b.this, (f)localObject);
      }
      for (;;)
      {
        ((f)localObject).p(true);
        b.this.tqX = false;
        return;
        b.a(b.this, null);
      }
    }
  };
  
  public b(Activity paramActivity, a parama)
  {
    super(paramActivity);
    this.tqW = parama;
  }
  
  public final void a(f paramf, boolean paramBoolean) {}
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    if (this.tqW != null) {
      return this.tqW.j(paramMenuItem);
    }
    return false;
  }
  
  public final void b(f paramf)
  {
    if (this.mActionBar != null)
    {
      u localu = ((d)this.mActionBar).Fs;
      if ((localu != null) && (localu.ef()))
      {
        if (!localu.isOverflowMenuShowing())
        {
          if (localu.getVisibility() == 0) {
            localu.showOverflowMenu();
          }
          return;
        }
        localu.hideOverflowMenu();
        return;
      }
    }
    paramf.close();
  }
  
  public final ActionBar cqY()
  {
    if (!this.EE)
    {
      this.EE = true;
      supportInvalidateOptionsMenu();
    }
    if (this.mActionBar == null) {
      this.mActionBar = new d(this.mActivity, this.CK);
    }
    return this.mActionBar;
  }
  
  public final boolean d(f paramf)
  {
    return false;
  }
  
  public final void supportInvalidateOptionsMenu()
  {
    if (!this.tqX)
    {
      this.tqX = true;
      this.tqY.run();
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean c(Menu paramMenu);
    
    public abstract boolean d(Menu paramMenu);
    
    public abstract boolean j(MenuItem paramMenuItem);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */