package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.ui.e;

public final class b
  extends i
  implements View.OnClickListener
{
  private int fdx = 0;
  protected View hyK;
  private View.OnClickListener mBI;
  
  private b(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  private b(Context paramContext, byte paramByte)
  {
    super(paramContext, a.j.mmpwddialog);
    paramByte = a.g.remittance_fee_tip_dialog;
    if (paramByte > 0) {
      this.hyK = View.inflate(paramContext, paramByte, null);
    }
    setContentView(this.hyK);
    ((Button)this.hyK.findViewById(a.f.cancel_btn)).setOnClickListener(this);
    ((Button)this.hyK.findViewById(a.f.iknow)).setOnClickListener(this);
  }
  
  public static b a(Context paramContext, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, View.OnClickListener paramOnClickListener)
  {
    x.i("RemittanceChargeDialog", "showCostDetail");
    b localb = new b(paramContext);
    localb.fdx = paramInt;
    if (paramDouble1 == 0.0D) {
      x.i("RemittanceChargeDialog", "showCostDetail ::: remian_fee = 0");
    }
    ((TextView)localb.findViewById(a.f.remittance_used_fee)).setText(e.B(paramDouble1));
    ((TextView)localb.findViewById(a.f.excess)).setText(e.B(paramDouble2));
    if (paramDouble3 == 0.0D) {
      x.e("RemittanceChargeDialog", "showCostDetail ::: transaction_costs = 0");
    }
    ((TextView)localb.findViewById(a.f.transaction_costs)).setText(e.B(paramDouble3));
    localb.findViewById(a.f.remittance_cost_detail_view).setVisibility(0);
    if (!bi.oW(paramString))
    {
      TextView localTextView = (TextView)localb.findViewById(a.f.remittance_explain);
      localTextView.setText(paramString);
      localTextView.setVisibility(0);
    }
    localb.findViewById(a.f.tip_pay_buttons).setVisibility(0);
    localb.mBI = paramOnClickListener;
    localb.findViewById(a.f.ok_btn).setOnClickListener(new b.1(localb));
    localb.show();
    com.tencent.mm.ui.base.h.a(paramContext, localb);
    if (paramInt == 1)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(10), Integer.valueOf(1) });
      return localb;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    return localb;
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, double paramDouble)
  {
    x.i("RemittanceChargeDialog", "showAlert");
    b localb = new b(paramContext);
    localb.fdx = paramInt;
    x.i("RemittanceChargeDialog", "showTips");
    TextView localTextView = (TextView)localb.findViewById(a.f.remittance_explain);
    if (bi.oW(paramString)) {
      x.e("RemittanceChargeDialog", "desc is null");
    }
    for (;;)
    {
      ((TextView)localb.findViewById(a.f.infomsg)).setText(paramContext.getResources().getString(a.i.remittance_free_limit, new Object[] { e.B(paramDouble) }));
      localb.findViewById(a.f.tip_button_know).setVisibility(0);
      localb.findViewById(a.f.infomsg_container).setVisibility(0);
      localb.show();
      com.tencent.mm.ui.base.h.a(paramContext, localb);
      return;
      localTextView.setText(paramString);
      localTextView.setVisibility(0);
    }
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getId() != a.f.ok_btn)
    {
      x.i("RemittanceChargeDialog", "click cancel");
      dismiss();
    }
    if (paramView.getId() == a.f.cancel_btn)
    {
      if (this.fdx == 1) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(11), Integer.valueOf(1) });
      }
    }
    else {
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */