package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.ui.base.HorizontalListView;
import com.tencent.mm.ui.base.o;

public final class p
{
  public static o a(Context paramContext, View paramView, String[] paramArrayOfString, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    View localView = View.inflate(paramContext, a.g.popup_menu, null);
    HorizontalListView localHorizontalListView = (HorizontalListView)localView.findViewById(a.f.suggest_alias_lv);
    paramArrayOfString = new a(paramContext, paramArrayOfString);
    localHorizontalListView.setAdapter(paramArrayOfString);
    localHorizontalListView.setOnItemClickListener(paramOnItemClickListener);
    localHorizontalListView.setBackgroundResource(a.e.signup_chose_bg);
    paramOnItemClickListener = new o(localView);
    paramOnItemClickListener.setHeight(com.tencent.mm.bp.a.fromDPToPix(paramContext, 120));
    int i = 0;
    int j = 0;
    while (i < paramArrayOfString.getCount())
    {
      localView = paramArrayOfString.getView(i, null, localHorizontalListView);
      localView.measure(0, 0);
      j += localView.getMeasuredWidth();
      i += 1;
    }
    paramOnItemClickListener.setWidth(com.tencent.mm.bp.a.fromDPToPix(paramContext, 20) + j);
    paramOnItemClickListener.showAsDropDown(paramView, (paramView.getWidth() - (com.tencent.mm.bp.a.fromDPToPix(paramContext, 20) + j)) / 2, 0);
    return paramOnItemClickListener;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/ui/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */