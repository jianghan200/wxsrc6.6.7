package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;

public class HoneyPayCardLayout
  extends LinearLayout
{
  private ImageView hVP;
  private String kkc;
  private TextView kku;
  private TextView kkv;
  private WalletTextView kkw;
  private TextView kkx;
  private CdnImageView kky;
  
  public HoneyPayCardLayout(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public HoneyPayCardLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public HoneyPayCardLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    View localView = inflate(getContext(), a.g.honey_pay_card_layout, this);
    this.hVP = ((ImageView)localView.findViewById(a.f.hpcl_avatar_iv));
    this.kkw = ((WalletTextView)localView.findViewById(a.f.hpcl_quota_tv));
    this.kku = ((TextView)localView.findViewById(a.f.hpcl_username_tv));
    this.kkv = ((TextView)localView.findViewById(a.f.hpcl_remain_tv));
    this.kkx = ((TextView)localView.findViewById(a.f.hpcl_card_type_tv));
    this.kky = ((CdnImageView)localView.findViewById(a.f.hpcl_card_type_iv));
    this.kkw.setPrefix(v.cDm());
  }
  
  public void setCardRecord(amn paramamn)
  {
    long l1 = 0L;
    this.kkc = paramamn.rIw;
    this.kkx.setText(paramamn.hwg);
    if (!bi.oW(paramamn.bWP)) {
      this.kky.cS(paramamn.bWP, c.rh(paramamn.huV));
    }
    a.b.a(this.hVP, paramamn.rrW, 0.06F, false);
    e.f(this.kku, paramamn.rrW);
    this.kkw.setText(c.dK(paramamn.ruW));
    if (paramamn.rPk == 0)
    {
      this.kkv.setTextColor(Color.parseColor("#FA9D3B"));
      this.kkv.setText(a.i.honey_pay_waiting_for_receive);
      return;
    }
    long l2;
    if (paramamn.rPk == 1) {
      if (paramamn.rPm == 0L)
      {
        l2 = paramamn.rPl;
        if (l2 >= 0L) {
          break label254;
        }
        x.w("MicroMsg.HoneyPayCardLayout", "unused quota wrong: %s", new Object[] { Long.valueOf(l2) });
      }
    }
    for (;;)
    {
      this.kkv.setText(getContext().getString(a.i.honey_pay_used_month, new Object[] { v.cDm() + c.dK(l1) }));
      return;
      x.i("MicroMsg.HoneyPayCardLayout", "show check detail");
      this.kkv.setText("");
      return;
      x.w("MicroMsg.HoneyPayCardLayout", "unknown rcvd: %s", new Object[] { Integer.valueOf(paramamn.rPk) });
      return;
      label254:
      l1 = l2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */