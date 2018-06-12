package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public final class a
  extends h
{
  private SparseArray<View> tBD = new SparseArray();
  
  public a(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    super(paramContext, paramSharedPreferences);
  }
  
  public final View a(int paramInt, ListView paramListView)
  {
    if ((paramInt > paramListView.getLastVisiblePosition()) || (paramInt < paramListView.getFirstVisiblePosition())) {
      return null;
    }
    return (View)this.tBD.get(paramInt);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    this.tBD.put(paramInt, paramView);
    return paramView;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/preference/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */