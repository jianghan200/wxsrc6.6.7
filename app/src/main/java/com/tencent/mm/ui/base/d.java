package com.tencent.mm.ui.base;

import android.content.Context;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Queue;

public abstract class d
  extends u
{
  public Context context;
  private Queue<View> tsm;
  private int tsn = 0;
  
  public d(Context paramContext)
  {
    this.context = paramContext;
    this.tsm = new LinkedList();
  }
  
  public abstract View a(View paramView, ViewGroup paramViewGroup, int paramInt);
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (View)paramObject;
    paramViewGroup.removeView((View)paramObject);
    this.tsm.add(paramObject);
    tO(paramInt);
    x.d("MicroMsg.CustomPagerAdapter", "recycle queue size %d", new Object[] { Integer.valueOf(this.tsm.size()) });
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return paramView.equals(paramObject);
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    long l = System.currentTimeMillis();
    View localView = a((View)this.tsm.poll(), paramViewGroup, paramInt);
    if (localView.getLayoutParams() == null) {
      localView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }
    paramViewGroup.addView(localView);
    x.v("MicroMsg.CustomPagerAdapter", "instantiateItem usetime: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    return localView;
  }
  
  public abstract int biD();
  
  public final int k(Object paramObject)
  {
    if (this.tsn > 0)
    {
      this.tsn -= 1;
      return -2;
    }
    return super.k(paramObject);
  }
  
  public final void notifyDataSetChanged()
  {
    this.tsn = biD();
    super.notifyDataSetChanged();
  }
  
  public abstract void tO(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/base/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */