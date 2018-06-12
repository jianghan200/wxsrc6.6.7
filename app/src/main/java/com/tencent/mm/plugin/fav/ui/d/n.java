package com.tencent.mm.plugin.fav.ui.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.ui.k;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.protocal.c.wn;

public final class n
  extends a
{
  public n(k paramk)
  {
    super(paramk);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, g paramg)
  {
    return new View(paramViewGroup.getContext());
  }
  
  public final void a(View paramView, wn paramwn)
  {
    if (paramView != null) {
      Toast.makeText(paramView.getContext(), m.i.favorite_unknown_type, 0).show();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */