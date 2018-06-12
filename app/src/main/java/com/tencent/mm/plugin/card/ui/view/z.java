package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.ui.MMActivity;

public final class z
  extends i
{
  private View hIp;
  
  public final void azI()
  {
    if (this.hIp != null) {
      this.hIp.setVisibility(8);
    }
  }
  
  public final void initView() {}
  
  public final void update()
  {
    if (this.hIp == null) {
      this.hIp = ((ViewStub)findViewById(a.d.card_third_field_layout_stub)).inflate();
    }
    pr localpr = this.hHF.ayu().awn().rnh;
    if (this.hIp != null)
    {
      ((TextView)this.hIp.findViewById(a.d.thid_field_title)).setText(localpr.title);
      ((TextView)this.hIp.findViewById(a.d.thid_field_sub_title)).setText(localpr.huX);
      if ((this.hHF.ayz().azb()) && (this.hHF.ayz().azc())) {
        break label153;
      }
    }
    label153:
    for (int i = 1; i != 0; i = 0)
    {
      ((LinearLayout.LayoutParams)((LinearLayout)this.hIp).getLayoutParams()).bottomMargin = 0;
      return;
    }
    ((LinearLayout.LayoutParams)((LinearLayout)this.hIp).getLayoutParams()).bottomMargin = this.hHF.ayx().getResources().getDimensionPixelSize(a.b.SettingCatalogPadding);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */