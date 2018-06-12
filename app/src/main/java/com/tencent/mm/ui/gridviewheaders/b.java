package com.tencent.mm.ui.gridviewheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public abstract interface b
  extends ListAdapter
{
  public abstract int FW(int paramInt);
  
  public abstract View a(int paramInt, View paramView, ViewGroup paramViewGroup);
  
  public abstract int czk();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/gridviewheaders/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */