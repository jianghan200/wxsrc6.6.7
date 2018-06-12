package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class a
  implements g
{
  protected LayoutInflater Bc;
  private final String TAG = "MicroMsg.CardWidgetCouponBase";
  protected View.OnClickListener eZF;
  protected View hJb;
  protected ImageView hJc;
  protected TextView hJd;
  protected b htQ;
  protected Context mContext;
  
  public a(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private void aoV()
  {
    if ((this.htQ == null) || (this.htQ.awm() == null))
    {
      x.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
      return;
    }
    int i;
    if (!bi.oW(this.htQ.awm().huW))
    {
      i = this.mContext.getResources().getDimensionPixelSize(a.b.card_detail_ui_logo_height);
      if ((!this.htQ.avR()) || (!this.htQ.avU())) {
        break label167;
      }
      i = this.mContext.getResources().getDimensionPixelSize(a.b.card_coupon_widget_logo_size);
    }
    for (;;)
    {
      if (i > 0) {
        m.a(this.hJc, this.htQ.awm().huW, i, a.c.my_card_package_defaultlogo, true);
      }
      if (!bi.oW(this.htQ.awm().hwh)) {
        this.hJd.setText(this.htQ.awm().hwh);
      }
      aAa();
      return;
      label167:
      if ((this.htQ.avR()) && (this.htQ.avT())) {
        i = this.mContext.getResources().getDimensionPixelSize(a.b.card_member_widget_logo_size);
      } else if ((this.htQ.avR()) && (this.htQ.avV())) {
        i = this.mContext.getResources().getDimensionPixelSize(a.b.card_ticket_widget_logo_size);
      } else if (this.htQ.avX()) {
        i = 0;
      }
    }
  }
  
  public void a(ShapeDrawable paramShapeDrawable) {}
  
  protected abstract void aAa();
  
  public final View azX()
  {
    if ((this.htQ == null) || (this.htQ.awm() == null))
    {
      x.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
      return null;
    }
    this.Bc = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    LayoutInflater localLayoutInflater = this.Bc;
    int i;
    if (!this.htQ.avU()) {
      if (this.htQ.avV()) {
        i = a.e.card_ticket;
      }
    }
    for (;;)
    {
      this.hJb = localLayoutInflater.inflate(i, null);
      this.hJc = ((ImageView)this.hJb.findViewById(a.d.app_logo));
      this.hJd = ((TextView)this.hJb.findViewById(a.d.app_name));
      azZ();
      aoV();
      return this.hJb;
      if (this.htQ.avT()) {
        i = a.e.card_membership;
      } else if (this.htQ.avW()) {
        i = a.e.card_enterpricecash;
      } else if (this.htQ.avX()) {
        i = a.e.card_invoice;
      } else {
        i = a.e.card_coupon;
      }
    }
  }
  
  protected final View azY()
  {
    return this.hJb;
  }
  
  protected abstract void azZ();
  
  public void dV(boolean paramBoolean) {}
  
  public void dW(boolean paramBoolean) {}
  
  public final void f(b paramb)
  {
    this.htQ = paramb;
    aoV();
  }
  
  public final void k(b paramb)
  {
    this.htQ = paramb;
  }
  
  public void oc(int paramInt) {}
  
  public final void release()
  {
    this.eZF = null;
    this.mContext = null;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.eZF = paramOnClickListener;
  }
  
  public void v(boolean paramBoolean1, boolean paramBoolean2) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/card/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */