package com.tencent.mm.pluginsdk.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class d
  implements AbsListView.OnScrollListener
{
  private AbsListView.OnScrollListener qEM;
  private ArrayList<WeakReference<a>> qEN = new ArrayList();
  
  public d()
  {
    this(null);
  }
  
  public d(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.qEM = paramOnScrollListener;
  }
  
  private void kC(boolean paramBoolean)
  {
    int i = 0;
    if (i < this.qEN.size())
    {
      Object localObject = (WeakReference)this.qEN.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).onScrollStateChanged(paramBoolean);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        this.qEN.remove(i);
        continue;
        this.qEN.remove(i);
      }
    }
  }
  
  public final void a(a parama)
  {
    this.qEN.add(new WeakReference(parama));
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.qEM != null) {
      this.qEM.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2) {
      kC(true);
    }
    for (;;)
    {
      if (this.qEM != null) {
        this.qEM.onScrollStateChanged(paramAbsListView, paramInt);
      }
      return;
      kC(false);
    }
  }
  
  public static abstract interface a
  {
    public abstract void onScrollStateChanged(boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */