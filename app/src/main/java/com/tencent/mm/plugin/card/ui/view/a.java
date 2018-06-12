package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

public final class a
  extends i
{
  private View hHm;
  
  public final void azI()
  {
    this.hHm.setVisibility(8);
  }
  
  public final void initView()
  {
    this.hHm = findViewById(a.d.card_accept_header_layout);
  }
  
  public final void update()
  {
    Object localObject = this.hHF.ayz();
    b localb = this.hHF.ayu();
    MMActivity localMMActivity = this.hHF.ayx();
    e.a locala = this.hHF.ayB();
    f localf = this.hHF.ayC();
    if (((com.tencent.mm.plugin.card.ui.a.g)localObject).azs())
    {
      this.hHm.setVisibility(0);
      findViewById(a.d.accept_header_from_username_container).setVisibility(0);
      localObject = (ImageView)findViewById(a.d.accept_header_from_username_avatar);
      TextView localTextView1 = (TextView)findViewById(a.d.accept_header_from_username_tv);
      TextView localTextView2 = (TextView)findViewById(a.d.accept_ui_title);
      if (locala.hBD != null) {
        localTextView1.setText(j.a(localMMActivity, ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(locala.hBD).BK(), localTextView1.getTextSize()));
      }
      if (locala.hop == 23) {
        if (!TextUtils.isEmpty(localb.awm().rog)) {
          localTextView2.setText(localb.awm().rog);
        }
      }
      for (;;)
      {
        a.b.a((ImageView)localObject, locala.hBD, 0.15F, false);
        ((ImageView)localObject).setOnClickListener(this.hHF.ayy());
        return;
        if (!TextUtils.isEmpty(localb.awm().hwg))
        {
          localTextView2.setText(localMMActivity.getString(a.g.card_recommend_tips, new Object[] { localb.awm().hwg }));
        }
        else
        {
          localTextView2.setText(localMMActivity.getString(a.g.card_recommend_tips, new Object[] { localf.getTitle() }));
          continue;
          if ((localb.awo() != null) && (!TextUtils.isEmpty(localb.awo().sli))) {
            localTextView2.setText(localb.awo().sli);
          } else if (!TextUtils.isEmpty(localb.awm().hwg)) {
            localTextView2.setText(localMMActivity.getString(a.g.card_gift_tips, new Object[] { localb.awm().hwg }));
          } else {
            localTextView2.setText(localMMActivity.getString(a.g.card_gift_tips, new Object[] { localf.getTitle() }));
          }
        }
      }
    }
    if (((com.tencent.mm.plugin.card.ui.a.g)localObject).azt())
    {
      if (!TextUtils.isEmpty(localb.awm().rog))
      {
        this.hHm.setVisibility(0);
        findViewById(a.d.accept_header_from_username_container).setVisibility(8);
        ((TextView)findViewById(a.d.accept_ui_title)).setText(localb.awm().rog);
        return;
      }
      this.hHm.setVisibility(8);
      return;
    }
    azI();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */