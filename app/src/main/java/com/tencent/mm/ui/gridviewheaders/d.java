package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

public final class d
  extends BaseAdapter
  implements b
{
  private ListAdapter uuz;
  private DataSetObserver yY = new DataSetObserver()
  {
    public final void onChanged()
    {
      d.this.notifyDataSetChanged();
    }
    
    public final void onInvalidated()
    {
      d.this.notifyDataSetInvalidated();
    }
  };
  
  public d(ListAdapter paramListAdapter)
  {
    this.uuz = paramListAdapter;
    paramListAdapter.registerDataSetObserver(this.yY);
  }
  
  public final int FW(int paramInt)
  {
    return 0;
  }
  
  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return null;
  }
  
  public final int czk()
  {
    return 0;
  }
  
  public final int getCount()
  {
    return this.uuz.getCount();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.uuz.getItem(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return this.uuz.getItemId(paramInt);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.uuz.getView(paramInt, paramView, paramViewGroup);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/gridviewheaders/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */