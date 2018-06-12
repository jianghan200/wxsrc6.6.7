package com.tencent.mm.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.plugin.n.a.e;
import com.tencent.mm.plugin.n.a.f;
import com.tencent.mm.plugin.n.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.emotion.u;
import com.tencent.mm.ui.y;
import java.util.List;

public final class e
  extends a
{
  private List<u> uTR;
  
  public e(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    super(paramContext, parama);
  }
  
  public final int getCount()
  {
    int i;
    if (this.uTR == null) {
      i = 0;
    }
    int j;
    do
    {
      return i;
      j = this.uTJ * this.jZk;
      i = j;
    } while (j <= this.uTR.size());
    return this.uTR.size();
  }
  
  public final Object getItem(int paramInt)
  {
    if ((this.uTR != null) && (paramInt < this.uTR.size()) && (paramInt >= 0)) {
      return (u)this.uTR.get(paramInt);
    }
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = y.gq(this.mContext).inflate(a.f.smiley_grid_item_s, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      int i = paramInt;
      if (this.uTR != null)
      {
        i = paramInt;
        if (paramInt >= 0)
        {
          i = paramInt;
          if (paramInt < this.uTR.size()) {
            i = ((u)this.uTR.get(paramInt)).position;
          }
        }
      }
      Drawable localDrawable = com.tencent.mm.br.e.cjH().mg(i);
      paramViewGroup.gmn.setImageDrawable(localDrawable);
      String str2 = com.tencent.mm.br.e.cjH().getText(i);
      String str1 = str2;
      if (bi.oW(str2)) {
        str1 = paramView.getResources().getString(a.h.emoji_store_title);
      }
      paramViewGroup.gmn.setContentDescription(str1);
      if (localDrawable == null) {
        b.i("RecentSmileyAdapter", "drawable is null. realPosition:%d description:%s", new Object[] { Integer.valueOf(i), str1 });
      }
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void update()
  {
    this.uTR = this.uSM.uWI;
    notifyDataSetChanged();
  }
  
  final class a
  {
    ImageView gmn;
    
    public a(View paramView)
    {
      this.gmn = ((ImageView)paramView.findViewById(a.e.art_emoji_icon_iv));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/view/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */