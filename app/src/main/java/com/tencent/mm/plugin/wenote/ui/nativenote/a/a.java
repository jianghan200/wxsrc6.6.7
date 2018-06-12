package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.q;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.ad;

public final class a
  extends LinearLayoutManager
{
  private final int qvb = j.s(ad.getContext(), true);
  public int qvc = -1;
  public boolean qvd = false;
  
  protected final int a(RecyclerView.q paramq)
  {
    if (this.qvc > 0) {
      return this.qvc;
    }
    return 900;
  }
  
  public final int b(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    int k = 1;
    int j = 0;
    int i;
    if (!this.qvd)
    {
      i = super.b(paramInt, paramm, paramq);
      return i;
    }
    if (paramInt < 0) {
      if (k.aq(49.0F) <= Math.abs(paramInt)) {
        i = 1;
      }
    }
    for (;;)
    {
      label46:
      if (paramInt > 0) {
        if (this.qvb + k.aq(49.0F) < paramInt) {
          i = k;
        }
      }
      for (;;)
      {
        if (i != 0)
        {
          i = j;
          if (this.qvd) {
            break;
          }
        }
        try
        {
          paramInt = super.b(paramInt, paramm, paramq);
          return paramInt;
        }
        catch (Exception paramm)
        {
          return 0;
        }
        i = 0;
        break label46;
        i = 0;
      }
      i = 0;
    }
  }
  
  public final void c(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    try
    {
      super.c(paramm, paramq);
      return;
    }
    catch (Exception paramm) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */