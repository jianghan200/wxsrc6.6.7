package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;

public abstract interface u
{
  public abstract void a(l.a parama, f.a parama1);
  
  public abstract void a(ai paramai);
  
  public abstract void a(Menu paramMenu, l.a parama);
  
  public abstract android.support.v4.view.ai c(int paramInt, long paramLong);
  
  public abstract void collapseActionView();
  
  public abstract void dismissPopupMenus();
  
  public abstract ViewGroup eQ();
  
  public abstract boolean ef();
  
  public abstract boolean eg();
  
  public abstract void eh();
  
  public abstract Context getContext();
  
  public abstract View getCustomView();
  
  public abstract int getDisplayOptions();
  
  public abstract int getHeight();
  
  public abstract Menu getMenu();
  
  public abstract int getNavigationMode();
  
  public abstract CharSequence getTitle();
  
  public abstract int getVisibility();
  
  public abstract boolean hasExpandedActionView();
  
  public abstract boolean hideOverflowMenu();
  
  public abstract boolean isOverflowMenuShowing();
  
  public abstract void setBackgroundDrawable(Drawable paramDrawable);
  
  public abstract void setCollapsible(boolean paramBoolean);
  
  public abstract void setCustomView(View paramView);
  
  public abstract void setDisplayOptions(int paramInt);
  
  public abstract void setIcon(int paramInt);
  
  public abstract void setIcon(Drawable paramDrawable);
  
  public abstract void setLogo(int paramInt);
  
  public abstract void setLogo(Drawable paramDrawable);
  
  public abstract void setNavigationContentDescription(int paramInt);
  
  public abstract void setVisibility(int paramInt);
  
  public abstract void setWindowCallback(Window.Callback paramCallback);
  
  public abstract void setWindowTitle(CharSequence paramCharSequence);
  
  public abstract boolean showOverflowMenu();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */