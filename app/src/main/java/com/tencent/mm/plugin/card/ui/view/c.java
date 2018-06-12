package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.sd;

public final class c
  extends i
{
  private View hHs;
  private TextView hHt;
  
  public final void azI()
  {
    if (this.hHs != null) {
      this.hHs.setVisibility(8);
    }
  }
  
  public final void initView() {}
  
  public final void update()
  {
    if (this.hHs == null)
    {
      this.hHs = ((ViewStub)findViewById(a.d.card_ad_title_layout_stub)).inflate();
      this.hHt = ((TextView)this.hHs.findViewById(a.d.card_ad_title_tv));
    }
    this.hHs.setVisibility(0);
    this.hHs.setOnClickListener(this.hHF.ayy());
    b localb = this.hHF.ayu();
    if (!TextUtils.isEmpty(localb.awm().rnY.rvA))
    {
      this.hHt.setText(localb.awm().rnY.rvA);
      return;
    }
    this.hHt.setText(getString(a.g.card_membership_right_see_default_wording));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */