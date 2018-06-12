package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;

public final class f
{
  public static c dd(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    WXRTEditText localWXRTEditText1 = (WXRTEditText)paramView.findViewById(R.h.rte_text);
    WXRTEditText localWXRTEditText2 = (WXRTEditText)paramView.findViewById(R.h.btnPrev);
    paramView = (WXRTEditText)paramView.findViewById(R.h.btnNext);
    if (localWXRTEditText1 != null) {
      paramView = new c(localWXRTEditText1);
    }
    for (;;)
    {
      return paramView;
      if ((localWXRTEditText2 != null) && (paramView != null)) {
        paramView = new c(localWXRTEditText2, paramView);
      } else {
        paramView = null;
      }
    }
  }
  
  public static View g(RecyclerView paramRecyclerView, int paramInt)
  {
    if (paramRecyclerView == null) {
      return null;
    }
    try
    {
      paramRecyclerView = paramRecyclerView.getLayoutManager();
      if ((paramRecyclerView instanceof LinearLayoutManager))
      {
        paramRecyclerView = ((LinearLayoutManager)paramRecyclerView).be(paramInt);
        return paramRecyclerView;
      }
    }
    catch (Exception paramRecyclerView)
    {
      for (;;)
      {
        paramRecyclerView = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */