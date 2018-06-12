package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.plugin.wallet_core.model.b.b;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.LinkedList;

public final class i
{
  public static c a(Context paramContext, b paramb, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing())) {
      return null;
    }
    if ((paramb == null) || ((TextUtils.isEmpty(paramb.plA)) && ((paramb.plB == null) || (paramb.plB.isEmpty()))))
    {
      x.w("MicroMsg.WalletDialogHelper", "show showBalanceFetchAlert alert fail");
      return null;
    }
    c.a locala = new c.a(paramContext);
    locala.mF(false);
    locala.Gu(a.i.app_cancel).b(paramOnClickListener2);
    if (paramBoolean) {
      locala.Gt(a.i.wallet_balance_fetch_all_btn).a(paramOnClickListener1);
    }
    for (;;)
    {
      paramOnClickListener1 = View.inflate(paramContext, a.g.wallet_fetch_info_dialog, null);
      if ((paramb.plB == null) || (paramb.plB.isEmpty())) {
        break;
      }
      paramOnClickListener2 = (LinearLayout)paramOnClickListener1.findViewById(a.f.container);
      paramOnClickListener2.removeAllViews();
      int i = 0;
      while ((i < paramb.plB.size()) && (i < paramb.plB.size()))
      {
        View localView = View.inflate(paramContext, a.g.wallet_fetch_fee_list_item, null);
        TextView localTextView1 = (TextView)localView.findViewById(a.f.title);
        TextView localTextView2 = (TextView)localView.findViewById(a.f.subtitle);
        localTextView1.setText(((b.b)paramb.plB.get(i)).aAL);
        localTextView2.setText(((b.b)paramb.plB.get(i)).value);
        paramOnClickListener2.addView(localView, i);
        i += 1;
      }
      locala.Gq(a.i.wallet_balance_fetch_dialog_title);
      locala.Gt(a.i.wallet_balance_fetch_go_on_btn).a(paramOnClickListener1);
    }
    x.e("MicroMsg.WalletDialogHelper", "fetch itemsList is empty");
    ((TextView)paramOnClickListener1.findViewById(a.f.title)).setText(paramb.plA);
    if (paramBoolean)
    {
      paramb = (TextView)paramOnClickListener1.findViewById(a.f.tips);
      paramb.setVisibility(0);
      paramb.setText(paramContext.getString(a.i.wallet_balance_fetch_all_tips));
    }
    locala.dR(paramOnClickListener1);
    paramb = locala.anj();
    paramb.show();
    h.a(paramContext, paramb);
    return paramb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */