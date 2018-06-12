package com.tencent.mm.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import com.tencent.mm.br.e;
import com.tencent.mm.plugin.n.a.d;
import com.tencent.mm.plugin.n.a.e;
import com.tencent.mm.plugin.n.a.f;
import com.tencent.mm.plugin.n.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.y;
import com.tencent.mm.view.f.a;

public final class d
  extends b
{
  public int uTO = 1;
  private ImageView uTP;
  private ImageView uTQ;
  
  public d(Context paramContext, a parama)
  {
    super(paramContext, parama);
  }
  
  public final void aI(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {
      if (this.uTP != null)
      {
        if (paramFloat > 0.01F) {
          break label57;
        }
        this.uTP.setVisibility(4);
      }
    }
    for (;;)
    {
      if (this.uTQ != null)
      {
        if (paramFloat < 0.99F) {
          break;
        }
        this.uTQ.setVisibility(4);
      }
      return;
      label57:
      this.uTP.setVisibility(0);
      this.uTP.setImageAlpha((int)(255.0F * paramFloat));
    }
    this.uTQ.setVisibility(0);
    this.uTQ.setImageAlpha((int)((1.0F - paramFloat) * 255.0F));
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == this.jZk * this.uTJ - 5)
    {
      View localView = y.gq(this.mContext).inflate(a.f.smiley_grid_item_cross_fade, null);
      localView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
      this.uTP = ((ImageView)localView.findViewById(a.e.art_emoji_icon_origin));
      this.uTQ = ((ImageView)localView.findViewById(a.e.art_emoji_icon_delete));
      paramInt = GR(paramInt);
      paramView = e.cjH().mg(paramInt);
      this.uTP.setImageDrawable(paramView);
      paramViewGroup = e.cjH().getText(paramInt);
      paramView = paramViewGroup;
      if (bi.oW(paramViewGroup)) {
        paramView = localView.getResources().getString(a.h.emoji_store_title);
      }
      this.uTP.setContentDescription(paramView);
      this.uTQ.setImageResource(a.d.del_btn);
      this.uTQ.setContentDescription(this.mContext.getString(a.h.delete_btn));
      aI(this.uTO);
      return localView;
    }
    return super.getView(paramInt, paramView, paramViewGroup);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/view/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */