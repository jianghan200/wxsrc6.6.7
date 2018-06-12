package com.tencent.mm.ui.b;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public abstract class a
{
  public b Ez = null;
  public MenuInflater gh;
  public ActionBar mActionBar;
  public final Activity mActivity;
  
  public a(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  abstract ActionBar cqY();
  
  public final ActionBar getSupportActionBar()
  {
    if (this.mActionBar == null) {
      this.mActionBar = cqY();
    }
    return this.mActionBar;
  }
  
  public final class a
    implements b.a
  {
    private b.a EU;
    
    public a(b.a parama)
    {
      this.EU = parama;
    }
    
    public final void a(b paramb)
    {
      this.EU.a(paramb);
      a.this.Ez = null;
    }
    
    public final boolean a(b paramb, Menu paramMenu)
    {
      return this.EU.a(paramb, paramMenu);
    }
    
    public final boolean a(b paramb, MenuItem paramMenuItem)
    {
      return this.EU.a(paramb, paramMenuItem);
    }
    
    public final boolean b(b paramb, Menu paramMenu)
    {
      return this.EU.b(paramb, paramMenu);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */