package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.sd;
import java.util.LinkedList;

public final class k
  extends i
{
  private View hHG;
  
  public final void azI()
  {
    if (this.hHG != null) {
      this.hHG.setVisibility(8);
    }
  }
  
  public final void initView() {}
  
  public final void update()
  {
    if (this.hHG == null) {
      this.hHG = ((ViewStub)findViewById(a.d.card_detail_field_stub)).inflate();
    }
    this.hHG.setOnClickListener(this.hHF.ayy());
    Object localObject1 = this.hHF.ayu().awm().rnY;
    if (!TextUtils.isEmpty(((sd)localObject1).detail))
    {
      ((TextView)findViewById(a.d.card_detail_desc)).setText(((sd)localObject1).detail);
      findViewById(a.d.card_detail_desc_layout).setVisibility(0);
    }
    ImageView localImageView;
    for (;;)
    {
      localImageView = (ImageView)findViewById(a.d.card_detail_field_pic);
      if ((((sd)localObject1).rvz == null) || (((sd)localObject1).rvz.size() <= 0) || (TextUtils.isEmpty((CharSequence)((sd)localObject1).rvz.get(0)))) {
        break;
      }
      localObject1 = (String)((sd)localObject1).rvz.get(0);
      localImageView.setVisibility(0);
      Object localObject2 = new c.a();
      ((c.a)localObject2).dXB = e.bnE;
      o.Pk();
      ((c.a)localObject2).dXU = null;
      ((c.a)localObject2).dXA = m.xr((String)localObject1);
      ((c.a)localObject2).dXy = true;
      ((c.a)localObject2).dXW = false;
      ((c.a)localObject2).dXw = true;
      localObject2 = ((c.a)localObject2).Pt();
      o.Pj().a((String)localObject1, localImageView, (c)localObject2);
      return;
      findViewById(a.d.card_detail_desc_layout).setVisibility(8);
    }
    localImageView.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */