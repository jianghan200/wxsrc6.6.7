package com.tencent.mm.plugin.topstory.ui.a;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.topstory.a.b;
import com.tencent.mm.plugin.topstory.a.f;
import com.tencent.mm.plugin.topstory.ui.b.d;
import com.tencent.mm.plugin.topstory.ui.video.e;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.bnq;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import java.io.IOException;
import java.util.LinkedList;

public final class d
  extends c
{
  public TextView jzq;
  public TextView jzr;
  public View oCX;
  public View oCY;
  public View oCZ;
  public View oDa;
  public View oDb;
  
  public d(View paramView, com.tencent.mm.plugin.topstory.ui.video.a parama)
  {
    super(paramView, parama);
  }
  
  private void aQV()
  {
    if (this.ozj.rBV.size() > 0)
    {
      bnq localbnq = (bnq)this.ozj.rBV.get(0);
      this.jzq.setTag(localbnq);
      this.jzq.setText(localbnq.bSc);
      this.jzq.setVisibility(0);
      this.jzq.setOnClickListener(this.mtE);
      this.oDa.setVisibility(0);
      this.oCX.setVisibility(0);
      if (this.ozj.rBV.size() <= 1) {
        break label204;
      }
      localbnq = (bnq)this.ozj.rBV.get(1);
      this.jzr.setTag(localbnq);
      this.jzr.setText(localbnq.bSc);
      this.jzr.setOnClickListener(this.mtE);
      this.jzr.setVisibility(0);
      this.oDb.setVisibility(0);
    }
    for (;;)
    {
      this.oCZ.post(new d.1(this));
      return;
      this.oDa.setVisibility(8);
      this.jzq.setVisibility(8);
      this.oCX.setVisibility(8);
      break;
      label204:
      this.oDb.setVisibility(8);
      this.jzr.setVisibility(8);
    }
  }
  
  protected final void aL()
  {
    super.aL();
    aQV();
  }
  
  public final void cX(View paramView)
  {
    super.cX(paramView);
    this.oCZ = paramView.findViewById(b.d.bottom_layout);
    this.oCX = paramView.findViewById(b.d.bottom_tag_layout);
    this.oCY = paramView.findViewById(b.d.bottom_info_layout);
    this.oDa = paramView.findViewById(b.d.tag_1_ll);
    this.oDb = paramView.findViewById(b.d.tag_2_ll);
    this.jzq = ((TextView)paramView.findViewById(b.d.tag_1_tv));
    this.jzr = ((TextView)paramView.findViewById(b.d.tag_2_tv));
  }
  
  protected final void cY(View paramView)
  {
    super.cY(paramView);
    bth localbth;
    Intent localIntent;
    if ((paramView.getId() == this.jzq.getId()) || (paramView.getId() == this.jzr.getId()))
    {
      this.oAb.bHR().ozV = true;
      this.oAb.bHS().stopPlay();
      this.oCJ.bIn();
      paramView = (bnq)paramView.getTag();
      localbth = com.tencent.mm.plugin.topstory.a.g.a(this.oAb.bHT());
      localbth.sqA = p.zK(localbth.scene);
      localbth.sqH = this.ozj.sqS;
      localbth.sqL = paramView.slJ;
      localbth.sqM = null;
      localbth.sqN = paramView;
      localbth.sqP = this.oAb.bHR().ozV;
      localIntent = new Intent();
    }
    try
    {
      localIntent.putExtra("key_context", localbth.toByteArray());
      p.d(this.oAb.baA(), ".ui.video.TopStoryVideoStreamUI", localIntent);
      com.tencent.mm.plugin.websearch.api.a.a.kB(28);
      ((b)com.tencent.mm.kernel.g.n(b.class)).getReporter().a(this.oAb.bHT(), this.ozj, this.position, 4, paramView.bSc + ":" + paramView.id);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public final void z(n paramn)
  {
    super.z(paramn);
    aQV();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */