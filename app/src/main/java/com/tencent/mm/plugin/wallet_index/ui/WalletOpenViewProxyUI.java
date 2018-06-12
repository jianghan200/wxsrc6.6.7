package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.wallet.balance.a.a.q;
import com.tencent.mm.plugin.wallet_core.c.u;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.c.ayf;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class WalletOpenViewProxyUI
  extends WalletBaseUI
{
  private Map<String, String> pDK = new HashMap();
  
  private void PB(String paramString)
  {
    if (!bi.oW(paramString))
    {
      paramString = (String)this.pDK.get("openview");
      if ("open_wcpay_biz_view".equals(paramString))
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open mall_index_ui");
        d.A(this.mController.tml, "mall", ".ui.MallIndexUI");
      }
    }
    for (;;)
    {
      paramString = new Intent();
      paramString.putExtra("closeWebView", (String)this.pDK.get("closeWebView"));
      setResult(-1, paramString);
      finish();
      return;
      if ("open_wcpay_balance_view".equals(paramString))
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open wallet_balance_manager_ui");
        com.tencent.mm.pluginsdk.wallet.h.ab(this.mController.tml, 0);
      }
      else if ("open_wcpay_order_detail_view".equals(paramString))
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open mall_order_transaction_info_ui");
        paramString = new Intent();
        paramString.putExtra("trans_id", (String)this.pDK.get("trans_id"));
        paramString.putExtra("scene", 1);
        if (this.pDK.containsKey("bill_id")) {
          paramString.putExtra("bill_id", (String)this.pDK.get("bill_id"));
        }
        d.b(this.mController.tml, "order", ".ui.MallOrderTransactionInfoUI", paramString);
      }
      else if ("open_wcpay_f2f_receive_detail".equals(paramString))
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open open_wcpay_f2f_receive_detail");
        paramString = new Intent();
        paramString.putExtra("key_timestamp", bi.getLong((String)this.pDK.get("fromtimestamp"), 0L));
        paramString.putExtra("key_from_scene", 1);
        d.b(this.mController.tml, "collect", ".ui.CollectBillUI", paramString);
        com.tencent.mm.plugin.report.service.h.mEJ.h(13944, new Object[] { Integer.valueOf(2) });
      }
      else if ("open_wcpay_grouppay_detail".equals(paramString))
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open open_wcpay_grouppay_detail");
        paramString = new Intent();
        paramString.putExtra("bill_no", (String)this.pDK.get("billno"));
        paramString.putExtra("chatroom", (String)this.pDK.get("groupid"));
        paramString.putExtra("key_sign", (String)this.pDK.get("sign"));
        paramString.putExtra("key_ver", (String)this.pDK.get("ver"));
        paramString.putExtra("enter_scene", 5);
        d.b(this.mController.tml, "aa", ".ui.PaylistAAUI", paramString);
      }
      else if ("open_wcpay_t2bc_detail".equals(paramString))
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "do open_wcpay_t2bc_detail");
        paramString = new Intent();
        paramString.putExtra("key_transfer_bill_id", (String)this.pDK.get("transfer_bill_id"));
        paramString.putExtra("key_enter_scene", 1);
        d.b(this.mController.tml, "remittance", ".bankcard.ui.BankRemitDetailUI", paramString);
      }
      else if ("open_honey_pay_home".equals(paramString))
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "do open honey pay view");
        paramString = new Intent();
        d.b(this.mController.tml, "honey_pay", ".ui.HoneyPayMainUI", paramString);
      }
      else
      {
        x.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] invalid target view : " + paramString);
        continue;
        x.w("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] packageExt null or nil");
      }
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.WalletOpenViewProxyUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
        PB(getIntent().getStringExtra("packageExt"));
        return true;
      }
      if ((paraml instanceof u))
      {
        PB(getIntent().getStringExtra("packageExt"));
        return true;
      }
      if ((paraml instanceof q))
      {
        paramString = ((q)paraml).oZB;
        x.i("MicroMsg.WalletOpenViewProxyUI", "on open lqb account scene end, retcode: %s, regmsg: %s", new Object[] { Integer.valueOf(paramString.hwV), paramString.hwW });
        if (paramString.hwV == 0)
        {
          paramString = new Intent();
          paramString.putExtra("key_account_type", 2);
          d.b(this.mController.tml, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", paramString);
          setResult(-1);
        }
        for (;;)
        {
          finish();
          return true;
          Toast.makeText(this, paramString.hwW, 1).show();
          setResult(0);
        }
      }
    }
    else
    {
      setResult(0);
      finish();
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(8);
    paramBundle = getIntent().getStringExtra("packageExt");
    this.pDK = new HashMap();
    if (!bi.oW(paramBundle))
    {
      paramBundle = paramBundle.split("&");
      if ((paramBundle != null) && (paramBundle.length > 0))
      {
        int i = 0;
        while (i < paramBundle.length)
        {
          if (!bi.oW(paramBundle[i]))
          {
            localObject = paramBundle[i].split("=");
            if ((localObject.length == 2) && (!bi.oW(localObject[0]))) {
              this.pDK.put(localObject[0], localObject[1]);
            }
          }
          i += 1;
        }
      }
    }
    jr(2996);
    jr(580);
    jr(385);
    if (getIntent() == null)
    {
      x.d("MicroMsg.WalletOpenViewProxyUI", "func[doCheckPayNetscene] intent null");
      setResult(0);
      finish();
      return;
    }
    paramBundle = (String)this.pDK.get("openview");
    Object localObject = getIntent().getStringExtra("appId");
    String str1 = getIntent().getStringExtra("timeStamp");
    String str2 = getIntent().getStringExtra("nonceStr");
    String str3 = getIntent().getStringExtra("packageExt");
    String str4 = getIntent().getStringExtra("paySignature");
    if ("open_wcpay_f2f_receive_detail".equals(paramBundle))
    {
      a(new u((String)localObject, str1, str2, str3, str4), true, false);
      return;
    }
    if ("open_wcpay_grouppay_detail".equals(paramBundle))
    {
      PB(str3);
      return;
    }
    if ("open_wcpay_lqt_detail".equals(paramBundle))
    {
      x.i("MicroMsg.WalletOpenViewProxyUI", "open lqt detail ui");
      if (this.pDK != null)
      {
        new Intent().putExtra("key_account_type", 1);
        localObject = (String)this.pDK.get("ecardtype");
        str1 = (String)this.pDK.get("extradata");
        paramBundle = (String)this.pDK.get("need_open_lqb");
        x.i("MicroMsg.WalletOpenViewProxyUI", "open lqt detail ui, ecardtype: %s, extradata: %s, need_open_lqb: %s", new Object[] { localObject, str1, paramBundle });
        if (bi.getInt(paramBundle, 0) == 1)
        {
          paramBundle = (Bundle)localObject;
          if (bi.oW((String)localObject)) {
            paramBundle = "WEB_DEBIT";
          }
          a(new q(paramBundle, str1), true, false);
        }
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(663L, 18L, 1L, false);
        return;
        d.A(this.mController.tml, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
        setResult(-1);
        finish();
        continue;
        d.A(this.mController.tml, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
        setResult(-1);
        finish();
      }
    }
    a(new com.tencent.mm.plugin.wallet_core.c.a((String)localObject, str1, str2, str3, getIntent().getStringExtra("signtype"), str4, getIntent().getStringExtra("url"), 4, "openWCPaySpecificView", getIntent().getIntExtra("pay_channel", 0)), true, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(580);
    js(385);
    js(2996);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */