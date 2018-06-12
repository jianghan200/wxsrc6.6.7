package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.plugin.appbrand.widget.k.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a
  extends RecyclerView.a<RecyclerView.t>
{
  private static ViewGroup.LayoutParams gPK = new ViewGroup.LayoutParams(-1, -2);
  RecyclerView.a QU;
  private ViewGroup gPL;
  private ViewGroup gPM;
  List<View> gPN = new LinkedList();
  private List<View> gPO = new LinkedList();
  b gPP;
  c gPQ;
  RecyclerView.c gPR = new a.1(this);
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    Iterator localIterator;
    if (paramInt == 2147483646)
    {
      if (this.gPL != null) {
        this.gPL.removeAllViews();
      }
      paramViewGroup = (ViewGroup)LayoutInflater.from(paramViewGroup.getContext()).inflate(k.c.support_footer_recycler_view_container, paramViewGroup, false);
      this.gPL = paramViewGroup;
      localIterator = this.gPO.iterator();
      while (localIterator.hasNext()) {
        paramViewGroup.addView((View)localIterator.next(), gPK);
      }
      return new a(paramViewGroup);
    }
    if (paramInt == Integer.MAX_VALUE)
    {
      if (this.gPM != null) {
        this.gPM.removeAllViews();
      }
      paramViewGroup = (ViewGroup)LayoutInflater.from(paramViewGroup.getContext()).inflate(k.c.support_footer_recycler_view_container, paramViewGroup, false);
      this.gPM = paramViewGroup;
      localIterator = this.gPN.iterator();
      while (localIterator.hasNext()) {
        paramViewGroup.addView((View)localIterator.next(), gPK);
      }
      return new a(paramViewGroup);
    }
    return this.QU.a(paramViewGroup, paramInt);
  }
  
  public final void a(final RecyclerView.t paramt, final int paramInt)
  {
    if ((!this.gPN.isEmpty()) && (paramInt == 0)) {
      break label16;
    }
    label16:
    while ((!this.gPO.isEmpty()) && (paramInt == getItemCount() - 1)) {
      return;
    }
    if (this.gPN.isEmpty()) {}
    for (int i = 0;; i = 1)
    {
      paramInt -= i;
      this.QU.a(paramt, paramInt);
      if (this.gPP != null) {
        paramt.SU.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            if (a.b(a.this) != null)
            {
              paramAnonymousView = a.b(a.this);
              View localView = paramt.SU;
              int i = paramInt;
              long l = paramt.SW;
              paramAnonymousView.ms(i);
            }
          }
        });
      }
      if (this.gPQ == null) {
        break;
      }
      paramt.SU.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          if (a.c(a.this) != null)
          {
            paramAnonymousView = a.c(a.this);
            View localView = paramt.SU;
            long l = paramt.SW;
            return paramAnonymousView.aqE();
          }
          return false;
        }
      });
      return;
    }
  }
  
  public final void a(RecyclerView.t paramt, int paramInt, List<Object> paramList)
  {
    if ((!this.gPN.isEmpty()) && (paramInt == 0)) {
      break label16;
    }
    label16:
    while ((!this.gPO.isEmpty()) && (paramInt == getItemCount() - 1)) {
      return;
    }
    if (this.gPN.isEmpty()) {}
    for (int i = 0;; i = 1)
    {
      paramInt -= i;
      this.QU.a(paramt, paramInt, paramList);
      if (this.gPP != null) {
        paramt.SU.setOnClickListener(new a.4(this, paramt, paramInt));
      }
      if (this.gPQ == null) {
        break;
      }
      paramt.SU.setOnLongClickListener(new a.5(this, paramt, paramInt));
      return;
    }
  }
  
  public final void addFooterView(View paramView)
  {
    this.gPO.add(paramView);
    X(getItemCount() - 1, 1);
  }
  
  public final int aqC()
  {
    return this.gPO.size();
  }
  
  public final void b(int paramInt, View paramView)
  {
    this.gPO.add(paramInt, paramView);
    X(getItemCount() - 1, 1);
  }
  
  public final void cj(View paramView)
  {
    this.gPO.remove(paramView);
    X(getItemCount() - 1, 1);
  }
  
  public final int getItemCount()
  {
    int j = this.QU.getItemCount();
    int i = j;
    if (!this.gPN.isEmpty()) {
      i = j + 1;
    }
    j = i;
    if (!this.gPO.isEmpty()) {
      j = i + 1;
    }
    return j;
  }
  
  public final long getItemId(int paramInt)
  {
    if (getItemViewType(paramInt) == Integer.MAX_VALUE) {
      return "MRecyclerHeaderView".hashCode();
    }
    if (getItemViewType(paramInt) == 2147483646) {
      return "MRecyclerFooterView".hashCode();
    }
    if (!this.QU.RS) {
      return paramInt;
    }
    RecyclerView.a locala = this.QU;
    if (this.gPN.isEmpty()) {}
    for (int i = 0;; i = 1) {
      return locala.getItemId(paramInt - i);
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    if ((!this.gPN.isEmpty()) && (paramInt == 0)) {
      return Integer.MAX_VALUE;
    }
    if ((!this.gPO.isEmpty()) && (paramInt == getItemCount() - 1)) {
      return 2147483646;
    }
    RecyclerView.a locala = this.QU;
    if (this.gPN.isEmpty()) {}
    for (int i = 0;; i = 1) {
      return locala.getItemViewType(paramInt - i);
    }
  }
  
  private static final class a
    extends RecyclerView.t
  {
    a(View paramView)
    {
      super();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recyclerview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */