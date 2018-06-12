package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.widget.ListView;

public abstract interface af
{
  public abstract void EV(int paramInt);
  
  public abstract void EW(int paramInt);
  
  public abstract void Y(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void addHeaderView(View paramView);
  
  public abstract void avj();
  
  public abstract void bg(int paramInt);
  
  public abstract void c(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener);
  
  public abstract void ctY();
  
  public abstract void cuc();
  
  public abstract void cue();
  
  public abstract void dismissDialog();
  
  public abstract void eX(int paramInt1, int paramInt2);
  
  public abstract View getChildAt(int paramInt);
  
  public abstract int getFirstVisiblePosition();
  
  public abstract int getHeaderViewsCount();
  
  public abstract int getLastVisiblePosition();
  
  public abstract ListView getListView();
  
  public abstract boolean hideVKB();
  
  public abstract void lT(boolean paramBoolean);
  
  public abstract boolean removeOptionMenu(int paramInt);
  
  public abstract void setKeepScreenOn(boolean paramBoolean);
  
  public abstract void showOptionMenu(int paramInt, boolean paramBoolean);
  
  public abstract void showOptionMenu(boolean paramBoolean);
  
  public abstract void showVKB();
  
  public abstract void updateOptionMenuIcon(int paramInt1, int paramInt2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */