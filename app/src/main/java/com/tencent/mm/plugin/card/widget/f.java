package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.c.la;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;

public final class f
  extends a
{
  protected TextView eCm;
  private View hJF;
  private ImageView hJG;
  private TextView hJH;
  private TextView hJI;
  private View hJJ;
  private TextView hJK;
  private TextView hJL;
  private ImageView hJM;
  private TextView hJN;
  public ArrayList<la> htW;
  
  public f(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void aAa()
  {
    label124:
    label205:
    StringBuilder localStringBuilder;
    pr localpr1;
    if ((this.htQ.awm().roi != null) && (!TextUtils.isEmpty(this.htQ.awm().roi.title)))
    {
      this.hJd.setText(this.htQ.awm().roi.title);
      if ((this.htQ.awm().roi == null) || (TextUtils.isEmpty(this.htQ.awm().roi.huX))) {
        break label598;
      }
      this.eCm.setText(this.htQ.awm().roi.huX);
      this.eCm.setVisibility(0);
      x.i("MicroMsg.CardWidgetTicket", "updateContentView()");
      if (bi.oW(this.htQ.awm().rnO)) {
        break label619;
      }
      int i = this.mContext.getResources().getDimensionPixelSize(a.b.card_ticket_widget_logo_size);
      m.a(this.mContext, this.hJG, this.htQ.awm().rnO, i, a.c.card_ticket_normal_icon, l.xV(this.htQ.awm().dxh));
      localObject = new StringBuilder();
      localStringBuilder = new StringBuilder();
      if ((this.htQ.awm().rnG == null) || (this.htQ.awm().rnG.size() < 2)) {
        break label647;
      }
      x.i("MicroMsg.CardWidgetTicket", "primary_fields length is >= 2");
      localpr1 = (pr)this.htQ.awm().rnG.get(0);
      pr localpr2 = (pr)this.htQ.awm().rnG.get(1);
      ((StringBuilder)localObject).append(localpr1.title).append(" - ").append(localpr2.title);
      if ((!TextUtils.isEmpty(localpr1.huY)) && (!TextUtils.isEmpty(localpr2.huY)))
      {
        localStringBuilder.append(localpr1.huY).append(" ").append(localpr1.huX);
        localStringBuilder.append(" - ");
        localStringBuilder.append(localpr2.huY).append(" ").append(localpr2.huX);
      }
      label402:
      if (TextUtils.isEmpty(((StringBuilder)localObject).toString())) {
        break label732;
      }
      this.hJH.setText(((StringBuilder)localObject).toString());
      label423:
      if (TextUtils.isEmpty(localStringBuilder.toString())) {
        break label744;
      }
      x.i("MicroMsg.CardWidgetTicket", "sub_title_builder is not empty!");
      this.hJI.setText(localStringBuilder.toString());
      this.hJI.setVisibility(0);
    }
    for (;;)
    {
      x.e("MicroMsg.CardWidgetTicket", "updateShopView(), shop_count:" + this.htQ.awm().rnK);
      if (this.htQ.awm().rnK > 0) {
        break label811;
      }
      this.hJJ.setVisibility(8);
      this.hJN.setVisibility(8);
      if (!this.htQ.awl()) {
        break label1187;
      }
      this.hJF.setVisibility(8);
      return;
      if (!TextUtils.isEmpty(this.htQ.awm().hwh))
      {
        this.hJd.setText(this.htQ.awm().hwh);
        break;
      }
      this.hJd.setText("");
      break;
      label598:
      this.eCm.setText("");
      this.eCm.setVisibility(8);
      break label124;
      label619:
      m.a(this.hJG, a.c.card_ticket_normal_icon, l.xV(this.htQ.awm().dxh));
      break label205;
      label647:
      if ((this.htQ.awm().rnG == null) || (this.htQ.awm().rnG.size() != 1)) {
        break label402;
      }
      x.i("MicroMsg.CardWidgetTicket", "primary_fields length is == 1");
      localpr1 = (pr)this.htQ.awm().rnG.get(0);
      ((StringBuilder)localObject).append(localpr1.title);
      localStringBuilder.append(localpr1.huX);
      break label402;
      label732:
      this.hJH.setText("");
      break label423;
      label744:
      if (!TextUtils.isEmpty(this.htQ.awm().rnW))
      {
        x.i("MicroMsg.CardWidgetTicket", "primary_sub_title is not empty!");
        this.hJI.setText(this.htQ.awm().rnW);
        this.hJI.setVisibility(0);
      }
      else
      {
        this.hJI.setVisibility(8);
      }
    }
    label811:
    this.hJJ.setVisibility(0);
    this.hJJ.setOnClickListener(this.eZF);
    m.a(this.hJM, a.c.card_ticket_place_icon, l.xV(this.htQ.awm().dxh));
    if ((this.htW != null) && (this.htW.size() > 0)) {}
    for (Object localObject = (la)this.htW.get(0);; localObject = null)
    {
      if ((this.htQ.awm().rnK == 1) && (localObject != null))
      {
        this.hJK.setText(((la)localObject).name);
        this.hJL.setText(this.mContext.getString(a.g.card_shop_distance_address, new Object[] { l.f(this.mContext, ((la)localObject).rnu), ((la)localObject).dRH }));
        this.hJN.setVisibility(8);
        this.hJJ.setTag(((la)localObject).name);
        break;
      }
      if ((this.htQ.awm().rnK > 1) && (localObject != null))
      {
        this.hJK.setText(((la)localObject).name);
        this.hJL.setText(this.mContext.getString(a.g.card_shop_distance_address, new Object[] { l.f(this.mContext, ((la)localObject).rnu), ((la)localObject).dRH }));
        this.hJN.setVisibility(0);
        this.hJN.setOnClickListener(this.eZF);
        this.hJJ.setTag(((la)localObject).name);
        break;
      }
      if (this.htQ.awm().rnK <= 0) {
        break;
      }
      this.hJK.setText(a.g.card_check_all_adapted_stores);
      this.hJL.setText(this.mContext.getString(a.g.card_total_adapted_stores, new Object[] { Integer.valueOf(this.htQ.awm().rnK) }));
      this.hJN.setVisibility(8);
      this.hJN.setOnClickListener(null);
      this.hJJ.setTag(this.mContext.getString(a.g.card_check_all_adapted_stores));
      break;
      label1187:
      this.hJF.setVisibility(0);
      return;
    }
  }
  
  protected final void azZ()
  {
    this.eCm = ((TextView)azY().findViewById(a.d.card_title));
    this.hJF = azY().findViewById(a.d.card_bottom_dash_divider);
    this.hJG = ((ImageView)azY().findViewById(a.d.ticket_icon));
    this.hJH = ((TextView)azY().findViewById(a.d.ticket_content_title));
    this.hJI = ((TextView)azY().findViewById(a.d.ticket_content_sub_title));
    this.hJJ = azY().findViewById(a.d.ticket_shop_layout);
    this.hJK = ((TextView)azY().findViewById(a.d.ticket_shop_title));
    this.hJL = ((TextView)azY().findViewById(a.d.ticket_shop_sub_title));
    this.hJM = ((ImageView)azY().findViewById(a.d.ticket_place_icon));
    this.hJN = ((TextView)azY().findViewById(a.d.ticket_check_more_adapted_stores));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */