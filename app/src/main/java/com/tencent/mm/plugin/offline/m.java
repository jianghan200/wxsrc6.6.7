package com.tencent.mm.plugin.offline;

import android.content.Context;
import com.tencent.mm.g.a.to;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.plugin.offline.a.s.a;
import com.tencent.mm.plugin.offline.a.s.c;
import com.tencent.mm.plugin.offline.a.s.e;
import com.tencent.mm.plugin.offline.a.s.f;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

public final class m
  implements s.a
{
  c kRJ = new m.1(this);
  
  public m()
  {
    a.sFg.b(this.kRJ);
    k.bkO();
    k.bkP().a(this);
  }
  
  private static void ax(int paramInt, String paramString)
  {
    to localto = new to();
    localto.cfd.cff = paramInt;
    localto.cfd.action = 4;
    localto.cfd.content = paramString;
    a.sFg.m(localto);
  }
  
  public final boolean a(s.c paramc)
  {
    if (paramc.lKD == 6)
    {
      paramc = (s.f)paramc;
      if ((paramc.lKL.ppf != null) && (paramc.lKL.ppf.size() > 0))
      {
        paramc = (Orders.Commodity)paramc.lKL.ppf.get(0);
        ax(0, ad.getContext().getString(a.i.wallet_wear_pay_result_info, new Object[] { e.e(paramc.hUL, paramc.lNV) }));
      }
    }
    do
    {
      return false;
      ax(9, ad.getContext().getString(a.i.wallet_wear_pay_error));
      return false;
      if (paramc.lKD == 8)
      {
        ax(6, ad.getContext().getString(a.i.wallet_wear_pay_error));
        return false;
      }
      if (paramc.lKD == 5)
      {
        ax(7, bi.aG(((s.e)paramc).lKH, ""));
        return false;
      }
    } while (paramc.lKD != 4);
    ax(8, ad.getContext().getString(a.i.wallet_wear_pay_freeze_error));
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/offline/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */