package com.tencent.mm.plugin.wallet_core.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.widget.a.c.a;

public final class a
{
  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, h.b paramb, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing())) {
      return null;
    }
    c.a locala = new c.a(paramContext);
    locala.mF(false);
    locala.mG(true);
    locala.Gu(a.i.app_cancel).b(paramOnClickListener);
    locala.abt(paramString1);
    paramString1 = View.inflate(paramContext, a.g.wallet_alert_input_with_mmedittext, null);
    paramOnClickListener = (EditText)paramString1.findViewById(a.f.edittext);
    if (!bi.oW(paramString2)) {
      paramOnClickListener.append(j.a(paramContext, paramString2, paramOnClickListener.getTextSize()));
    }
    paramString2 = (TextView)paramString1.findViewById(a.f.tips_tv);
    if (bi.oW(paramString3)) {
      paramString2.setVisibility(8);
    }
    for (;;)
    {
      locala.Gt(a.i.app_ok).a(false, new a.1(paramb, paramOnClickListener, paramContext));
      if (paramInt > 0) {
        com.tencent.mm.ui.tools.a.c.d(paramOnClickListener).Gi(paramInt).a(null);
      }
      locala.dR(paramString1);
      paramString2 = locala.anj();
      paramString2.show();
      if ((paramContext instanceof MMActivity)) {
        ((MMActivity)paramContext).addDialog(paramString2);
      }
      if ((paramContext instanceof MMActivity)) {
        paramString1.post(new a.2(paramContext));
      }
      return paramString2;
      paramString2.setText(paramString3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */