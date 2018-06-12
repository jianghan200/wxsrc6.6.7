package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.ViewGroup;

abstract class o<_Data, _ViewHolder extends RecyclerView.t>
{
  public abstract _ViewHolder a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup);
  
  public boolean a(_ViewHolder param_ViewHolder, Object paramObject)
  {
    return false;
  }
  
  public abstract void b(_ViewHolder param_ViewHolder, _Data param_Data);
  
  public abstract long bn(_Data param_Data);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */