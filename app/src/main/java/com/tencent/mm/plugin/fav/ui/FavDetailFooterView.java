package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mm.plugin.fav.a.g;

public class FavDetailFooterView
  extends TextView
{
  public FavDetailFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public FavDetailFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D(g paramg)
  {
    if (paramg == null) {
      return;
    }
    if (paramg.field_edittime > 0L)
    {
      setText(getContext().getString(m.i.favorite_edit_prefix) + i.f(getContext(), paramg.field_edittime * 1000L));
      return;
    }
    setText(getContext().getString(m.i.favorite_time_prefix) + i.f(getContext(), paramg.field_updateTime));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavDetailFooterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */