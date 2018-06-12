package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.ui.MMActivity;

public final class u
  extends i
{
  private View hIa;
  
  public final void azI()
  {
    if (this.hIa != null) {
      this.hIa.setVisibility(8);
    }
  }
  
  public final void initView() {}
  
  public final void update()
  {
    if (this.hIa == null) {
      this.hIa = ((ViewStub)findViewById(a.d.card_operate_field_layout_stub)).inflate();
    }
    b localb = this.hHF.ayu();
    MMActivity localMMActivity = this.hHF.ayx();
    Object localObject = localb.awn().rnk;
    TextView localTextView1;
    TextView localTextView2;
    LinearLayout localLinearLayout;
    LinearLayout.LayoutParams localLayoutParams1;
    LinearLayout.LayoutParams localLayoutParams2;
    if (this.hIa != null)
    {
      localTextView1 = (TextView)this.hIa.findViewById(a.d.card_operate_field_title_tv);
      localTextView1.setText(((pr)localObject).title);
      localTextView1.setTextColor(l.xV(localb.awm().dxh));
      localTextView2 = (TextView)this.hIa.findViewById(a.d.card_operate_field_aux_title_tv);
      localLinearLayout = (LinearLayout)this.hIa.findViewById(a.d.card_widget_operate_field_layout);
      localLayoutParams1 = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
      if (!localb.avT()) {
        break label418;
      }
      localLayoutParams2 = (LinearLayout.LayoutParams)localTextView1.getLayoutParams();
      if (TextUtils.isEmpty(((pr)localObject).huY)) {
        break label393;
      }
      localTextView2.setText(((pr)localObject).huY);
      localTextView2.setVisibility(0);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(a.b.card_member_operate_field_layout_height_with_aux_title);
      localLayoutParams2.bottomMargin = localMMActivity.getResources().getDimensionPixelSize(a.b.BasicPaddingSize);
      localObject = (LinearLayout.LayoutParams)localTextView2.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = localMMActivity.getResources().getDimensionPixelSize(a.b.BasicPaddingSize);
      localTextView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localTextView2.invalidate();
    }
    for (;;)
    {
      localLayoutParams2.height = localMMActivity.getResources().getDimensionPixelSize(a.b.card_member_operate_field_title_height);
      localTextView1.setLayoutParams(localLayoutParams2);
      localTextView1.invalidate();
      int i = localMMActivity.getResources().getDimensionPixelSize(a.b.card_member_widget_bg_round_radius);
      localTextView1.setBackgroundDrawable(l.g(localMMActivity, localb.awm().dxh, i));
      localTextView1.setTextColor(l.ad(localMMActivity, localb.awm().dxh));
      localLinearLayout.setBackgroundDrawable(null);
      localTextView1.setOnClickListener(this.hHF.ayy());
      localLinearLayout.setLayoutParams(localLayoutParams1);
      localLinearLayout.invalidate();
      this.hIa.invalidate();
      if (localb.avT()) {
        localLinearLayout.getLayoutParams();
      }
      return;
      label393:
      localTextView2.setVisibility(8);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(a.b.card_member_operate_field_layout_height_with_no_aux_title);
    }
    label418:
    if (!TextUtils.isEmpty(((pr)localObject).huY))
    {
      localTextView2.setText(((pr)localObject).huY);
      localTextView2.setVisibility(0);
    }
    for (localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(a.b.card_operate_field_layout_height_with_aux_title);; localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(a.b.card_operate_field_layout_height_with_no_aux_title))
    {
      localLinearLayout.setOnClickListener(this.hHF.ayy());
      break;
      localTextView2.setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */