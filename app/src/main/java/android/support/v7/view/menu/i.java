package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.support.v4.view.m.e;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@TargetApi(14)
public class i
  extends c<b>
  implements MenuItem
{
  public Method IQ;
  
  i(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  a a(ActionProvider paramActionProvider)
  {
    return new a(this.mContext, paramActionProvider);
  }
  
  public boolean collapseActionView()
  {
    return ((b)this.HM).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((b)this.HM).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    android.support.v4.view.d locald = ((b)this.HM).bJ();
    if ((locald instanceof a)) {
      return ((a)locald).IR;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView2 = ((b)this.HM).getActionView();
    View localView1 = localView2;
    if ((localView2 instanceof b)) {
      localView1 = (View)((b)localView2).IT;
    }
    return localView1;
  }
  
  public char getAlphabeticShortcut()
  {
    return ((b)this.HM).getAlphabeticShortcut();
  }
  
  public int getGroupId()
  {
    return ((b)this.HM).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((b)this.HM).getIcon();
  }
  
  public Intent getIntent()
  {
    return ((b)this.HM).getIntent();
  }
  
  public int getItemId()
  {
    return ((b)this.HM).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((b)this.HM).getMenuInfo();
  }
  
  public char getNumericShortcut()
  {
    return ((b)this.HM).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((b)this.HM).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return a(((b)this.HM).getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return ((b)this.HM).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((b)this.HM).getTitleCondensed();
  }
  
  public boolean hasSubMenu()
  {
    return ((b)this.HM).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((b)this.HM).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((b)this.HM).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((b)this.HM).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((b)this.HM).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((b)this.HM).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    b localb = (b)this.HM;
    if (paramActionProvider != null) {}
    for (paramActionProvider = a(paramActionProvider);; paramActionProvider = null)
    {
      localb.a(paramActionProvider);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((b)this.HM).setActionView(paramInt);
    View localView = ((b)this.HM).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((b)this.HM).setActionView(new b(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new b(paramView);
    }
    ((b)this.HM).setActionView((View)localObject);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((b)this.HM).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((b)this.HM).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((b)this.HM).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((b)this.HM).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((b)this.HM).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((b)this.HM).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((b)this.HM).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((b)this.HM).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    b localb = (b)this.HM;
    if (paramOnActionExpandListener != null) {}
    for (paramOnActionExpandListener = new c(paramOnActionExpandListener);; paramOnActionExpandListener = null)
    {
      localb.a(paramOnActionExpandListener);
      return this;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    b localb = (b)this.HM;
    if (paramOnMenuItemClickListener != null) {}
    for (paramOnMenuItemClickListener = new d(paramOnMenuItemClickListener);; paramOnMenuItemClickListener = null)
    {
      localb.setOnMenuItemClickListener(paramOnMenuItemClickListener);
      return this;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((b)this.HM).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((b)this.HM).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((b)this.HM).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((b)this.HM).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((b)this.HM).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((b)this.HM).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((b)this.HM).setVisible(paramBoolean);
  }
  
  class a
    extends android.support.v4.view.d
  {
    final ActionProvider IR;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super();
      this.IR = paramActionProvider;
    }
    
    public final boolean hasSubMenu()
    {
      return this.IR.hasSubMenu();
    }
    
    public final View onCreateActionView()
    {
      return this.IR.onCreateActionView();
    }
    
    public final boolean onPerformDefaultAction()
    {
      return this.IR.onPerformDefaultAction();
    }
    
    public final void onPrepareSubMenu(SubMenu paramSubMenu)
    {
      this.IR.onPrepareSubMenu(i.this.a(paramSubMenu));
    }
  }
  
  static final class b
    extends FrameLayout
    implements android.support.v7.view.c
  {
    final CollapsibleActionView IT;
    
    b(View paramView)
    {
      super();
      this.IT = ((CollapsibleActionView)paramView);
      addView(paramView);
    }
    
    public final void onActionViewCollapsed()
    {
      this.IT.onActionViewCollapsed();
    }
    
    public final void onActionViewExpanded()
    {
      this.IT.onActionViewExpanded();
    }
  }
  
  private final class c
    extends d<MenuItem.OnActionExpandListener>
    implements m.e
  {
    c(MenuItem.OnActionExpandListener paramOnActionExpandListener)
    {
      super();
    }
    
    public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.HM).onMenuItemActionCollapse(i.this.f(paramMenuItem));
    }
    
    public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.HM).onMenuItemActionExpand(i.this.f(paramMenuItem));
    }
  }
  
  private final class d
    extends d<MenuItem.OnMenuItemClickListener>
    implements MenuItem.OnMenuItemClickListener
  {
    d(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
      super();
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnMenuItemClickListener)this.HM).onMenuItemClick(i.this.f(paramMenuItem));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */