package com.tencent.mm.plugin.fav.ui.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.k;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wn;

public final class m
  extends a
{
  public m(k paramk)
  {
    super(paramk);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    paramViewGroup = paramViewGroup.getContext();
    View localView;
    if (paramView == null)
    {
      paramView = new a();
      localView = a(View.inflate(paramViewGroup, m.f.fav_listitem_text, null), paramView, paramg);
      paramView.hPq = ((TextView)localView.findViewById(m.e.fav_text));
      paramViewGroup = paramView;
    }
    for (;;)
    {
      a(paramViewGroup, paramg);
      if ((paramg.field_favProto.desc != null) && (paramg.field_favProto.desc.length() > 0)) {
        break;
      }
      paramViewGroup.hPq.setText("");
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
    paramViewGroup.hPq.setText(j.a(paramViewGroup.hPq.getContext(), paramg.field_favProto.desc, paramViewGroup.hPq.getTextSize()));
    return localView;
  }
  
  public final void a(View paramView, wn paramwn)
  {
    a locala = (a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.l(y.class)).a(paramView, locala.iWQ, paramwn);
  }
  
  public static final class a
    extends a.b
  {
    TextView hPq;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */