package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.f;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.b.e;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class f
{
  private MMActivity gKS;
  private ImageView[] hEA = new ImageView[3];
  private ImageView hEB;
  private int hEv;
  private View hEw;
  private TextView hEx;
  private TextView hEy;
  private ImageView hEz;
  View hyK;
  private b hzM;
  
  public f(MMActivity paramMMActivity, View paramView, int paramInt, b paramb)
  {
    this.gKS = paramMMActivity;
    this.hyK = paramView;
    this.hEv = paramInt;
    this.hzM = paramb;
    this.hEw = this.hyK.findViewById(a.d.card_home_page_item_layout);
    this.hEx = ((TextView)this.hyK.findViewById(a.d.card_home_page_item_title));
    this.hEy = ((TextView)this.hyK.findViewById(a.d.card_home_page_item_tips));
    this.hEz = ((ImageView)this.hyK.findViewById(a.d.card_home_page_item_type_icon));
    this.hEA[0] = ((ImageView)this.hyK.findViewById(a.d.card_home_page_item_icon_1));
    this.hEA[1] = ((ImageView)this.hyK.findViewById(a.d.card_home_page_item_icon_2));
    this.hEA[2] = ((ImageView)this.hyK.findViewById(a.d.card_home_page_item_icon_3));
    this.hEB = ((ImageView)this.hyK.findViewById(a.d.card_red_dot_img));
    if (this.hEv == 1)
    {
      this.hEx.setText(this.gKS.getString(a.g.card_member_card_count_title, new Object[] { Integer.valueOf(0) }));
      this.hEz.setImageResource(a.f.card_home_member_card_icon);
    }
    do
    {
      return;
      if (this.hEv == 2)
      {
        this.hEx.setText(a.g.card_share_card_title);
        this.hEz.setImageResource(a.f.card_home_friend_ticket_icon);
        return;
      }
    } while (this.hEv != 3);
    this.hEx.setText(a.g.card_ticket_title);
    this.hEz.setImageResource(a.f.card_home_my_ticket_icon);
  }
  
  public final void aL()
  {
    if (this.hEv == 2)
    {
      localObject = (l)am.axn().getValue("key_share_card_layout_data");
      if (localObject == null) {
        x.w("MicroMsg.CardHomePageItemController", "updateShareCardView data is null");
      }
    }
    while (this.hEv != 3)
    {
      return;
      if (bi.oW(((l)localObject).hyz)) {
        this.hEy.setVisibility(8);
      }
      while (bi.cX(((l)localObject).hyy))
      {
        i = 0;
        while (i < 3)
        {
          this.hEA[i].setVisibility(8);
          i += 1;
        }
        this.hEy.setVisibility(0);
        this.hEy.setText(((l)localObject).hyz);
      }
      int i = 0;
      if (i < 3)
      {
        if (i < ((l)localObject).hyy.size())
        {
          this.hEA[i].setVisibility(0);
          int j = this.gKS.getResources().getDimensionPixelSize(a.b.LargerPadding);
          m.a(this.hEA[i], (String)((l)localObject).hyy.get(i), j, a.c.my_card_package_defaultlogo, false);
        }
        for (;;)
        {
          i += 1;
          break;
          this.hEA[i].setVisibility(8);
        }
      }
      if ((!bi.cX(((l)localObject).hyy)) && (((l)localObject).hyy.size() == 1) && (((l)localObject).cal) && (!((l)localObject).cam))
      {
        this.hEB.setVisibility(0);
        return;
      }
      this.hEB.setVisibility(8);
      return;
    }
    this.hEx.setText(a.g.card_ticket_title);
    this.hyK.findViewById(a.d.card_home_page_item_extra_relative).setVisibility(8);
    Object localObject = (String)am.axn().getValue("key_card_entrance_tips");
    if (!bi.oW((String)localObject))
    {
      this.hEy.setText((CharSequence)localObject);
      this.hEy.setVisibility(0);
      return;
    }
    this.hEy.setVisibility(8);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.hEw.setOnClickListener(paramOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */