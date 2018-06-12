package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.bng;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;

public final class o
  extends i
{
  private View hHW;
  private ImageView hHX;
  private TextView hHY;
  private TextView hHZ;
  
  public final void azI()
  {
    this.hHW.setVisibility(8);
  }
  
  public final void initView()
  {
    this.hHW = findViewById(a.d.from_username_layout);
    this.hHX = ((ImageView)findViewById(a.d.from_username_avatar));
    this.hHY = ((TextView)findViewById(a.d.from_username_tv));
    this.hHZ = ((TextView)findViewById(a.d.from_username_tips));
    this.hHW.setVisibility(8);
  }
  
  public final void update()
  {
    b localb = this.hHF.ayu();
    MMActivity localMMActivity = this.hHF.ayx();
    e.a locala = this.hHF.ayB();
    this.hHW.setVisibility(0);
    this.hHY.setText(j.a(localMMActivity, ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(locala.hBD).BK(), this.hHY.getTextSize()));
    if ((localb.awo() != null) && (!TextUtils.isEmpty(localb.awo().sli))) {
      this.hHZ.setText(j.a(localMMActivity, localb.awo().sli, this.hHZ.getTextSize()));
    }
    for (;;)
    {
      a.b.a(this.hHX, locala.hBD);
      this.hHX.setOnClickListener(this.hHF.ayy());
      return;
      if (!TextUtils.isEmpty(localb.awm().hwg)) {
        this.hHZ.setText(localMMActivity.getString(a.g.card_gift_tips, new Object[] { localb.awm().hwg }));
      } else {
        this.hHZ.setText(localMMActivity.getString(a.g.card_gift_tips, new Object[] { this.hHF.ayC().getTitle() }));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */