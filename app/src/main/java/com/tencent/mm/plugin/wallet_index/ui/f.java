package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.d.a.a.t;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.protocal.c.ann;
import com.tencent.mm.protocal.c.ayw;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.q;
import java.util.ArrayList;

public final class f
  implements b
{
  private d pDM = null;
  private com.tencent.mm.sdk.b.c pDN;
  private c pDc;
  
  public f(c paramc, com.tencent.mm.sdk.b.c paramc1)
  {
    this.pDc = paramc;
    this.pDN = paramc1;
    com.tencent.mm.sdk.b.a.sFg.b(this.pDN);
  }
  
  public final void a(MMActivity paramMMActivity, d paramd)
  {
    x.i("MicroMsg.WeiXinWallet", "[alex] WeiXinWallet launchPay");
    q.cDf();
    this.pDM = paramd;
    if (this.pDc.pDp)
    {
      if (this.pDc.pCQ != null)
      {
        paramd = new g();
        paramd.appId = this.pDc.pCQ.rQo.hva;
        paramd.timeStamp = this.pDc.pCQ.rQo.pnl;
        paramd.nonceStr = this.pDc.pCQ.rQo.hFm;
        paramd.packageExt = this.pDc.pCQ.rQo.sbE;
        paramd.signType = this.pDc.pCQ.rQo.hFk;
        paramd.bVW = this.pDc.pCQ.rQn;
        paramd.bVY = this.pDc.pCQ.bVY;
        h.a(paramMMActivity, paramd, 1, null);
        return;
      }
      x.e("MicroMsg.WeiXinWallet", "[alex] mIapData.iapWxPayData is null");
      return;
    }
    paramd = new PayInfo();
    paramd.bOd = this.pDc.pCQ.rQl;
    paramd.partnerId = this.pDc.pCQ.rQm;
    paramd.cdL = this.pDc.pCQ.rQn;
    paramd.bVY = 5;
    h.a(paramMMActivity, paramd, 1);
  }
  
  public final void a(MMActivity paramMMActivity, ArrayList<String> paramArrayList, d paramd, boolean paramBoolean)
  {
    if (paramd != null) {
      paramd.a(com.tencent.mm.plugin.wallet_index.c.a.aN(0, ""), new com.tencent.mm.plugin.wallet_index.b.a.c(this.pDc.iiv, this.pDc.pDh, this.pDc.pCK, this.pDc.pCL));
    }
  }
  
  public final boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramMMActivity = new StringBuilder("onPayEnd payResult : ").append(paramInt2).append(", data is null : ");
    boolean bool;
    if (paramIntent == null)
    {
      bool = true;
      x.d("MicroMsg.WeiXinWallet", bool);
      if (this.pDM != null)
      {
        if (paramInt2 != -1) {
          break label155;
        }
        if ((paramIntent == null) || (paramIntent.getIntExtra("key_jsapi_pay_err_code", 0) != 0)) {
          break label145;
        }
        paramMMActivity = com.tencent.mm.plugin.wallet_index.c.a.aN(0, "");
      }
    }
    for (;;)
    {
      x.i("MicroMsg.WeiXinWallet", "wxpay result : ");
      paramIntent = new com.tencent.mm.plugin.wallet_index.b.a.c(this.pDc.iiv, this.pDc.pDh, this.pDc.pCK, this.pDc.pCL);
      this.pDM.a(paramMMActivity, paramIntent);
      this.pDM = null;
      return true;
      bool = false;
      break;
      label145:
      paramMMActivity = com.tencent.mm.plugin.wallet_index.c.a.aN(5, "");
      continue;
      label155:
      if (paramInt2 == 0) {
        paramMMActivity = com.tencent.mm.plugin.wallet_index.c.a.aN(1, "");
      } else {
        paramMMActivity = com.tencent.mm.plugin.wallet_index.c.a.aN(6, "");
      }
    }
  }
  
  public final void b(MMActivity paramMMActivity, boolean paramBoolean)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", 0);
    localIntent.putExtra("key_err_msg", "");
    paramMMActivity.setResult(-1, localIntent);
    t.finish();
  }
  
  public final int bRd()
  {
    return 2;
  }
  
  public final void j(MMActivity paramMMActivity)
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.pDN);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */