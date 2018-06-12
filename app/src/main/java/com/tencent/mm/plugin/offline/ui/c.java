package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Vibrator;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.offline.a.e;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.plugin.offline.a.s.b;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class c
{
  Vibrator hni;
  a lKZ;
  com.tencent.mm.plugin.wallet_core.ui.o lLa;
  float lLb = 0.0F;
  int lLc = 20000;
  Activity mActivity;
  
  public c(Activity paramActivity, a parama)
  {
    this.mActivity = paramActivity;
    this.lKZ = parama;
  }
  
  public static boolean ble()
  {
    k.bkO();
    return k.bkP().lKw != null;
  }
  
  public final void a(l paraml, int paramInt, String paramString)
  {
    a(paraml, paramInt, paramString, null);
  }
  
  public final void a(l paraml, int paramInt, String paramString1, String paramString2)
  {
    x.i("MicroMsg.OfflineLogicMgr", "handleErrorEvent errCode :" + paramInt + " msg:" + paramString1);
    bld();
    if (paramInt == 409)
    {
      x.i("MicroMsg.OfflineLogicMgr", "goLimitChangeUI msg:" + paramString1);
      com.tencent.mm.ui.base.h.a(this.mActivity, paramString1, "", getString(a.i.wallet_wx_offline_promote_coin_purse_limit_fee), getString(a.i.app_cancel), new c.18(this), new c.2(this));
    }
    do
    {
      return;
      if (paramInt == 410)
      {
        x.i("MicroMsg.OfflineLogicMgr", "showBindNewBankcardDialog msg:" + paramString1);
        com.tencent.mm.ui.base.h.a(this.mActivity, paramString1, "", getString(a.i.wallet_pay_bankcard_add), getString(a.i.app_cancel), new c.16(this), new c.17(this));
        return;
      }
      if (paramInt == 413)
      {
        x.i("MicroMsg.OfflineLogicMgr", "goChangeBankcard msg:" + paramString1);
        com.tencent.mm.ui.base.h.a(this.mActivity, paramString1, "", getString(a.i.wallet_wx_offline_change_pay_method), getString(a.i.app_cancel), new c.3(this), new c.4(this));
        return;
      }
      if (paramInt == 411)
      {
        if ((com.tencent.mm.plugin.wallet_core.model.o.bOW().bPp()) || (com.tencent.mm.plugin.wallet_core.model.o.bOW().bPt()))
        {
          x.i("MicroMsg.OfflineLogicMgr", "is unreg or simplereg");
          return;
        }
        if ((k.lJx) && ((this.mActivity instanceof WalletOfflineCoinPurseUI)))
        {
          paraml = (WalletOfflineCoinPurseUI)this.mActivity;
          paraml.lLB.setVisibility(4);
          paraml.lLQ.a(paraml.lLt, new WalletOfflineCoinPurseUI.25(paraml), 6);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(135L, 1L, 1L, true);
          return;
          com.tencent.mm.plugin.offline.c.a.c(this.mActivity, paramString1);
        }
      }
      if (!(this.mActivity instanceof WalletBaseUI)) {
        break;
      }
    } while (com.tencent.mm.wallet_core.d.h.a((WalletBaseUI)this.mActivity, paraml, 1000, paramInt, paramString1));
    Activity localActivity = this.mActivity;
    if (TextUtils.isEmpty(paramString1)) {}
    for (paraml = localActivity.getString(a.i.wallet_unknown_err);; paraml = paramString1)
    {
      if (!bi.oW(paramString2))
      {
        x.i("MicroMsg.OfflineErrorHelper", "error_detail_url is not null ");
        com.tencent.mm.ui.base.h.a(localActivity, paraml, null, localActivity.getResources().getString(a.i.wallet_err_alert_btn_err_detail_text), localActivity.getResources().getString(a.i.app_ok), true, new b.2(paramString2, localActivity), new b.3());
        return;
      }
      b.b(localActivity, paraml);
      return;
      b.b(this.mActivity, paramString1);
      return;
    }
  }
  
  public final void a(s.b paramb)
  {
    if (paramb == null) {}
    do
    {
      return;
      x.i("MicroMsg.OfflineLogicMgr", "showFreeMsg");
    } while (!"1".equals(paramb.lKA));
    com.tencent.mm.ui.base.h.a(this.mActivity, false, paramb.lKC, "", getString(a.i.wallet_wx_offline_freeze_btn_text), getString(a.i.app_cancel), new c.5(this), new c.6(this));
  }
  
  public final void bld()
  {
    if (this.lLa != null)
    {
      this.lLa.dismiss();
      this.lLa = null;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool = false;
    x.i("MicroMsg.OfflineLogicMgr", "errType:" + paramInt1 + "  errCode" + paramInt2 + " errMsg:" + paramString + " cgi type:" + paraml.getType());
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof e))
      {
        paramString = (e)paraml;
        localObject = paramString.lJJ;
        bld();
        if ((paramString.lJK != 0) || (TextUtils.isEmpty((CharSequence)localObject))) {
          break label138;
        }
        com.tencent.mm.plugin.offline.c.a.a(this.mActivity, (String)localObject, paraml);
        this.mActivity.setResult(-1);
        this.mActivity.finish();
        bool = true;
      }
    }
    label138:
    while (!(paraml instanceof e))
    {
      return bool;
      if ((paramString.lJK != 0) && (paramString.hUm != 0) && (paramString.lJM == 1))
      {
        x.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
        a(paramString, paramString.lJK, paramString.lJL);
      }
      return true;
    }
    Object localObject = (e)paraml;
    bld();
    if (((e)localObject).lJM == 1)
    {
      x.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
      a(paraml, paramInt2, paramString);
    }
    return true;
  }
  
  final String getString(int paramInt)
  {
    return this.mActivity.getString(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */