package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;
import java.util.HashMap;
import java.util.List;

public final class f
{
  public static void a(Context paramContext, List<Bankcard> paramList, Bankcard paramBankcard, String paramString1, String paramString2, n.d paramd)
  {
    d locald = new d(paramContext, 2, true);
    locald.ofp = new f.1(paramList, paramContext, new HashMap(), locald);
    locald.ofq = paramd;
    locald.uKi = true;
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.wallet_balance_fetch_bankcard_bottomsheet_header, null);
    if (!bi.oW(paramString1)) {
      ((TextView)paramContext.findViewById(a.f.bfbh_header_title_tv)).setText(paramString1);
    }
    if (!bi.oW(paramString2)) {
      ((TextView)paramContext.findViewById(a.f.bfbh_header_desc_tv)).setText(paramString2);
    }
    locald.dS(paramContext);
    if (paramBankcard != null)
    {
      int i = 0;
      while (i < paramList.size())
      {
        if (((Bankcard)paramList.get(i)).field_bindSerial.equals(paramBankcard.field_bindSerial)) {
          locald.uKk = i;
        }
        i += 1;
      }
    }
    locald.bXO();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */