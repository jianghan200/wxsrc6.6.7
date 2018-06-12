package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.kz;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends i
{
  private View hHx;
  
  public final void azI()
  {
    if (this.hHx != null) {
      this.hHx.setVisibility(8);
    }
  }
  
  public final void initView() {}
  
  public final void update()
  {
    b localb = this.hHF.ayu();
    kz localkz = localb.awm().rnU;
    if (localkz != null)
    {
      x.i("MicroMsg.CardAnnoucementView", "card tp annoucement  endtime: " + localkz.mXw);
      x.i("MicroMsg.CardAnnoucementView", "card tp annoucement  text: " + localkz.text);
      x.i("MicroMsg.CardAnnoucementView", "card tp annoucement  thumb_url: " + localkz.rnt);
    }
    if ((localkz != null) && (!TextUtils.isEmpty(localkz.text)) && (localb.awk()))
    {
      if (this.hHx == null) {
        this.hHx = ((ViewStub)findViewById(a.d.card_annoucement_layout_stub)).inflate();
      }
      ((TextView)this.hHx.findViewById(a.d.public_notice)).setText(localkz.text);
      this.hHx.setOnClickListener(this.hHF.ayy());
    }
    while (this.hHx == null) {
      return;
    }
    this.hHx.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */