package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.ui.MMActivity;

public final class d
  extends i
{
  private View hHu;
  private TextView hHv;
  private TextView hHw;
  private TextView hzs;
  
  public final void azI()
  {
    this.hHu.setVisibility(8);
  }
  
  public final void initView()
  {
    this.hHu = findViewById(a.d.advertise_layout);
    this.hHv = ((TextView)findViewById(a.d.advertise_text));
    this.hzs = ((TextView)findViewById(a.d.share_detail_tv));
    this.hHw = ((TextView)findViewById(a.d.card_private_setting_tv));
    this.hHv.setOnClickListener(this.hHF.ayy());
    this.hHu.setVisibility(8);
  }
  
  public final void update()
  {
    b localb = this.hHF.ayu();
    Object localObject1 = this.hHF.ayx();
    this.hHu.setVisibility(0);
    if (!TextUtils.isEmpty(localb.awm().rnR))
    {
      this.hHv.setVisibility(0);
      this.hHv.setText(localb.awm().rnR);
      if ((localb.avS()) || ((localb.avR()) && (localb.avU()))) {
        this.hHv.setTextColor(((MMActivity)localObject1).getResources().getColor(a.a.white));
      }
    }
    Object localObject2;
    for (;;)
    {
      localObject2 = this.hHu.findViewById(a.d.card_setting_layout_container);
      if (!this.hHF.ayz().azF()) {
        break label528;
      }
      ((View)localObject2).setVisibility(0);
      this.hHw.setText(((MMActivity)localObject1).getString(a.g.card_share_card_private_setting));
      this.hHw.setTextColor(((MMActivity)localObject1).getResources().getColor(a.a.white));
      int i = ((MMActivity)localObject1).getResources().getDimensionPixelOffset(a.b.NormalPadding);
      localObject2 = (Button)this.hHu.findViewById(a.d.card_private_setting_btn);
      ShapeDrawable localShapeDrawable1 = l.e((Context)localObject1, ((MMActivity)localObject1).getResources().getColor(a.a.white), i);
      ShapeDrawable localShapeDrawable2 = l.cm(((MMActivity)localObject1).getResources().getColor(a.a.white), i);
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable2);
      localStateListDrawable.addState(new int[0], localShapeDrawable1);
      ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
      i = l.xV(localb.awm().dxh);
      int j = ((MMActivity)localObject1).getResources().getColor(a.a.white);
      ((Button)localObject2).setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j }));
      ((Button)localObject2).setOnClickListener(this.hHF.ayy());
      localObject1 = this.hHu.findViewById(a.d.middle_divider);
      localObject2 = this.hHu.findViewById(a.d.card_hongbao_layout);
      if (localb.awm().rof != 1) {
        break;
      }
      ((View)localObject1).setVisibility(0);
      ((View)localObject2).setVisibility(0);
      return;
      if ((localb.avR()) && (localb.avT()))
      {
        this.hHv.setTextColor(((MMActivity)localObject1).getResources().getColor(a.a.card_advertise_text_color));
        this.hHu.setBackgroundColor(((MMActivity)localObject1).getResources().getColor(a.a.card_bg_color));
      }
      else
      {
        this.hHv.setTextColor(((MMActivity)localObject1).getResources().getColor(a.a.white));
        continue;
        this.hHv.setVisibility(8);
      }
    }
    ((View)localObject1).setVisibility(8);
    ((View)localObject2).setVisibility(8);
    return;
    label528:
    ((View)localObject2).setVisibility(8);
  }
  
  public final void xL(String paramString)
  {
    this.hHw.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */