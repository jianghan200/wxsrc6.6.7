package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.k;

public abstract class b
  extends RecyclerView.k
{
  private int qve;
  
  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if (Math.abs(paramInt2) > this.qve)
    {
      paramInt1 = 1;
      if ((paramInt1 != 0) && (paramRecyclerView.canScrollVertically(-1)))
      {
        if (paramRecyclerView.canScrollVertically(1)) {
          break label43;
        }
        caY();
      }
    }
    label43:
    do
    {
      return;
      paramInt1 = 0;
      break;
      if (paramInt2 < 0)
      {
        caW();
        return;
      }
    } while (paramInt2 <= 0);
    caX();
  }
  
  public abstract void caW();
  
  public abstract void caX();
  
  public abstract void caY();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */