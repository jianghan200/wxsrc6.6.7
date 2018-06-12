package com.tencent.mm.ui.base.sortview;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public abstract class b
  extends BaseAdapter
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener
{
  protected Context mContext;
  public SparseArray<a> tDD;
  public Runnable tDE;
  
  public b(Context paramContext)
  {
    if (paramContext == null) {
      throw new NullPointerException("context is null.");
    }
    this.mContext = paramContext;
    this.tDD = new SparseArray();
    this.tDE = new b.1(this);
  }
  
  public int getCount()
  {
    return this.tDD.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    if (nx(paramInt) != null)
    {
      if (nx(paramInt) == null) {
        return 0;
      }
      return nx(paramInt).type;
    }
    x.d("MicroMsg.BaseMutilDataItemAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount(%d) , position(%d)", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    long l1 = System.currentTimeMillis();
    a locala = nx(paramInt);
    if (locala == null)
    {
      x.e("MicroMsg.BaseMutilDataItemAdapter", "DataItem is null.");
      return paramView;
    }
    long l2 = System.currentTimeMillis();
    a.b localb = locala.auQ();
    if (localb == null)
    {
      x.e("MicroMsg.BaseMutilDataItemAdapter", "ViewItem is null.");
      return paramView;
    }
    if (paramView == null)
    {
      paramView = localb.b(this.mContext, paramView);
      paramViewGroup = locala.auR();
      localb.a(paramView, paramViewGroup);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      Object[] arrayOfObject = nv(paramInt);
      Assert.assertNotNull(paramViewGroup);
      if (!locala.tDC) {
        locala.a(this.mContext, paramViewGroup, arrayOfObject);
      }
      long l3 = System.currentTimeMillis();
      localb.a(this.mContext, paramViewGroup, locala);
      x.d("MicroMsg.BaseMutilDataItemAdapter", "position %d, getItem %d, inflate %d, filling data %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(System.currentTimeMillis() - l3) });
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
    }
  }
  
  public int getViewTypeCount()
  {
    return 7;
  }
  
  public abstract a nu(int paramInt);
  
  public abstract Object[] nv(int paramInt);
  
  public a nx(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > getCount()))
    {
      x.e("MicroMsg.BaseMutilDataItemAdapter", "The given position(%d) is illegal.", new Object[] { Integer.valueOf(paramInt) });
      localObject = null;
    }
    a locala;
    do
    {
      return (a)localObject;
      locala = (a)this.tDD.get(paramInt);
      localObject = locala;
    } while (locala != null);
    Object localObject = nu(paramInt);
    this.tDD.put(paramInt, localObject);
    return (a)localObject;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = nx(paramInt);
    if (paramAdapterView == null) {}
    do
    {
      return;
      paramView = paramAdapterView.auQ();
    } while ((paramView == null) || (!paramView.a(this.mContext, paramAdapterView, nv(paramInt))));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/base/sortview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */