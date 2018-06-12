package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class d
  extends a
{
  private View hJo;
  private TextView hJp;
  private TextView hJq;
  private View hJr;
  private TextView hJs;
  private TextView hJt;
  private View hJu;
  private View hJv;
  private View hJw;
  
  public d(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void aAa()
  {
    Object localObject3;
    Object localObject2;
    Object localObject1;
    if ((this.htQ.awm().rnG != null) && (this.htQ.awm().rnG.size() > 0))
    {
      localObject3 = this.htQ.awm().rnG;
      localObject2 = null;
      if (((LinkedList)localObject3).size() == 1)
      {
        localObject1 = (pr)((LinkedList)localObject3).get(0);
        if (localObject1 != null)
        {
          this.hJo.setVisibility(0);
          this.hJp.setText(((pr)localObject1).title);
          this.hJq.setText(((pr)localObject1).huX);
          if (!TextUtils.isEmpty(((pr)localObject1).roM)) {
            this.hJp.setTextColor(l.xV(((pr)localObject1).roM));
          }
          if (!TextUtils.isEmpty(((pr)localObject1).roN)) {
            this.hJq.setTextColor(l.xV(((pr)localObject1).roN));
          }
        }
        if (localObject2 != null)
        {
          this.hJr.setVisibility(0);
          this.hJs.setText(((pr)localObject2).title);
          this.hJt.setText(((pr)localObject2).huX);
          if (!TextUtils.isEmpty(((pr)localObject2).roM)) {
            this.hJs.setTextColor(l.xV(((pr)localObject2).roM));
          }
          if (!TextUtils.isEmpty(((pr)localObject2).roN)) {
            this.hJt.setTextColor(l.xV(((pr)localObject2).roN));
          }
        }
        label229:
        if ((!this.htQ.avR()) || (this.htQ.avX())) {
          break label348;
        }
        x.i("MicroMsg.CardWidgetInvoice", "is not invoice, don't updateCardSecondaryFieldListView");
        label260:
        if (!this.htQ.awi()) {
          break label876;
        }
        this.hJv.setVisibility(8);
      }
    }
    for (;;)
    {
      if ((this.htQ.awn().rnm != null) || (!this.htQ.awi())) {
        break label954;
      }
      this.hJw.setVisibility(0);
      return;
      localObject1 = (pr)((LinkedList)localObject3).get(0);
      localObject2 = (pr)((LinkedList)localObject3).get(1);
      break;
      x.i("MicroMsg.CardWidgetInvoice", "primary_fields is null");
      break label229;
      label348:
      if ((this.htQ.awn().rnd != null) && (this.htQ.awn().rnd.size() > 0))
      {
        if (this.hJu == null) {
          this.hJu = ((ViewStub)this.hJb.findViewById(a.d.card_secondary_field_list_stub)).inflate();
        }
        this.hJb.findViewById(a.d.card_bottom_dash_divider_2).setVisibility(8);
        localObject1 = this.hJu;
        localObject3 = this.htQ;
        localObject2 = this.eZF;
        localObject3 = ((b)localObject3).awn().rnd;
        if (((LinkedList)localObject3).size() == 1)
        {
          ((View)localObject1).findViewById(a.d.card_secondary_field_view_1).setVisibility(0);
          localObject3 = (pr)((LinkedList)localObject3).get(0);
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_title_1)).setText(((pr)localObject3).title);
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_1)).setText(((pr)localObject3).huX);
          ((View)localObject1).findViewById(a.d.card_secondary_field_view_1).setOnClickListener((View.OnClickListener)localObject2);
          if (!TextUtils.isEmpty(((pr)localObject3).roM)) {
            ((TextView)((View)localObject1).findViewById(a.d.secondary_field_title_1)).setTextColor(l.xV(((pr)localObject3).roM));
          }
          if (!TextUtils.isEmpty(((pr)localObject3).roN)) {
            ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_1)).setTextColor(l.xV(((pr)localObject3).roN));
          }
          ((View)localObject1).findViewById(a.d.card_secondary_field_view_2).setVisibility(8);
          break label260;
        }
        if (((LinkedList)localObject3).size() < 2) {
          break label260;
        }
        pr localpr = (pr)((LinkedList)localObject3).get(0);
        ((TextView)((View)localObject1).findViewById(a.d.secondary_field_title_1)).setText(localpr.title);
        ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_1)).setText(localpr.huX);
        if (!TextUtils.isEmpty(localpr.roM)) {
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_title_1)).setTextColor(l.xV(localpr.roM));
        }
        if (!TextUtils.isEmpty(localpr.roN)) {
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_1)).setTextColor(l.xV(localpr.roN));
        }
        localObject3 = (pr)((LinkedList)localObject3).get(1);
        ((TextView)((View)localObject1).findViewById(a.d.secondary_field_title_2)).setText(((pr)localObject3).title);
        ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_2)).setText(((pr)localObject3).huX);
        if (!TextUtils.isEmpty(((pr)localObject3).roM)) {
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_title_2)).setTextColor(l.xV(((pr)localObject3).roM));
        }
        if (!TextUtils.isEmpty(((pr)localObject3).roN)) {
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_2)).setTextColor(l.xV(((pr)localObject3).roN));
        }
        ((View)localObject1).findViewById(a.d.card_secondary_field_view_1).setOnClickListener((View.OnClickListener)localObject2);
        ((View)localObject1).findViewById(a.d.card_secondary_field_view_2).setOnClickListener((View.OnClickListener)localObject2);
        break label260;
      }
      if (this.hJu != null) {
        this.hJu.setVisibility(8);
      }
      this.hJb.findViewById(a.d.card_bottom_dash_divider_2).setVisibility(8);
      break label260;
      label876:
      this.hJv.setVisibility(0);
      localObject1 = (TextView)this.hJv.findViewById(a.d.card_status_tv);
      if (!TextUtils.isEmpty(this.htQ.awm().roe)) {
        ((TextView)localObject1).setText(this.htQ.awm().roe);
      } else {
        m.b((TextView)localObject1, this.htQ.awn().status);
      }
    }
    label954:
    this.hJw.setVisibility(8);
  }
  
  protected final void azZ()
  {
    this.hJo = this.hJb.findViewById(a.d.payer_layout);
    this.hJp = ((TextView)this.hJb.findViewById(a.d.payer_title));
    this.hJq = ((TextView)this.hJb.findViewById(a.d.payer_sub_title));
    this.hJr = this.hJb.findViewById(a.d.billto_layout);
    this.hJs = ((TextView)this.hJb.findViewById(a.d.billto_title));
    this.hJt = ((TextView)this.hJb.findViewById(a.d.billto_sub_title));
    this.hJv = this.hJb.findViewById(a.d.card_widget_status_layout);
    this.hJw = this.hJb.findViewById(a.d.card_bottom_dash_divider_2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */