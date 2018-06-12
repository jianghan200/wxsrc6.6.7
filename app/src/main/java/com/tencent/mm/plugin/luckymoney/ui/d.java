package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import com.tencent.mm.plugin.luckymoney.b.i;
import java.util.LinkedList;
import java.util.List;

public abstract class d
  extends BaseAdapter
{
  protected LayoutInflater Bc;
  protected List<i> kLz = new LinkedList();
  protected Context mContext;
  
  public d(Context paramContext)
  {
    this.mContext = paramContext;
    this.Bc = LayoutInflater.from(paramContext);
  }
  
  public final void a(i parami)
  {
    this.kLz.remove(parami);
  }
  
  public final void bw(List<i> paramList)
  {
    if (paramList == null) {}
    for (this.kLz = new LinkedList();; this.kLz = paramList)
    {
      notifyDataSetChanged();
      return;
    }
  }
  
  public int getCount()
  {
    return this.kLz.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final i sm(int paramInt)
  {
    return (i)this.kLz.get(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */