package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.ui.r;

public abstract class a<T>
  extends r<T>
  implements AbsListView.OnScrollListener
{
  private static final String TAG = "MicroMsg." + a.class.getName();
  protected boolean iKs;
  
  public a(Context paramContext, T paramT)
  {
    super(paramContext, paramT);
    lB(true);
  }
  
  public abstract boolean ayQ();
  
  public abstract int ayR();
  
  public abstract int bpU();
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    this.iKs = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/readerapp/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */