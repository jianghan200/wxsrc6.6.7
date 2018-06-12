package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public final class y
  extends i
{
  private MMActivity gKS;
  private View hIo;
  private b htQ;
  
  public final void azI()
  {
    if (this.hIo != null) {
      this.hIo.setVisibility(8);
    }
  }
  
  public final void initView()
  {
    this.gKS = this.hHF.ayx();
  }
  
  public final void update()
  {
    this.htQ = this.hHF.ayu();
    if (this.hIo == null) {
      this.hIo = ((ViewStub)findViewById(a.d.card_status_layout_stub)).inflate();
    }
    if (this.htQ.avV()) {
      this.hIo.setBackgroundDrawable(l.A(this.gKS, this.gKS.getResources().getColor(a.a.card_bottom_container_normal_color)));
    }
    TextView localTextView = (TextView)this.hIo.findViewById(a.d.card_status_tv);
    if (this.htQ.awn() == null)
    {
      x.e("MicroMsg.CardStatusView", "updateState() mCardInfo.getDataInfo() == null");
      localTextView.setVisibility(8);
      return;
    }
    localTextView.setVisibility(0);
    localTextView.setTextColor(this.gKS.getResources().getColor(a.a.grey_background_text_color));
    if (!TextUtils.isEmpty(this.htQ.awm().roe))
    {
      localTextView.setText(this.htQ.awm().roe);
      return;
    }
    m.b(localTextView, this.htQ.awn().status);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */