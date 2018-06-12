package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.anm;
import com.tencent.mm.protocal.c.ann;
import com.tencent.mm.protocal.c.bbq;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.k;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(7)
public class WalletIapUI
  extends MMActivity
  implements e
{
  private Dialog gvJ;
  private com.tencent.mm.sdk.b.c lSI = new WalletIapUI.4(this);
  private boolean pDF = false;
  private b pDG;
  private d pDH = new WalletIapUI.2(this);
  private c pDc;
  private d pDe = new WalletIapUI.3(this);
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    c localc1 = null;
    boolean bool = true;
    x.i("MicroMsg.WalletIapUI", "onSceneEnd ErrType:" + paramInt1 + ", errCode:" + paramInt2 + ",errMsg:" + paramString);
    paramString = com.tencent.mm.plugin.wallet_index.c.a.aN(paramInt2, paramString);
    paramInt2 = paramString.kjf;
    paramString = paramString.kjg;
    x.i("MicroMsg.WalletIapUI", "onSceneEnd type:" + paraml.getType() + " errCode:" + paramInt2 + ",errMsg:" + paramString);
    paramInt1 = paraml.getType();
    switch (paramInt1)
    {
    default: 
      x.w("MicroMsg.WalletIapUI", "get a wrong sceneType : " + paramInt1);
      return;
    case 422: 
    case 1130: 
      c localc2 = this.pDc;
      com.tencent.mm.plugin.wallet_index.c.a locala = com.tencent.mm.plugin.wallet_index.c.a.aN(paramInt2, paramString);
      paramInt1 = locala.kjf;
      if ((paraml instanceof k))
      {
        paraml = (k)paraml;
        if (paramInt1 == 0)
        {
          if (!localc2.bRe()) {
            break label347;
          }
          paraml = (bbq)paraml.diG.dIE.dIL;
          if (paraml == null) {
            break label335;
          }
          paramString = new ann();
          paramString.rQl = paraml.sdO;
          paramString.rQm = paraml.sdP;
          paramString.bVY = 5;
          paramString.rQn = paraml.sdQ;
          x.d("MicroMsg.NetScenePreparePurchase", "get Sign4TenPay is " + paraml.sdQ);
          localc2.pCQ = paramString;
        }
      }
      for (;;)
      {
        if (locala.kjf != 0) {
          break label578;
        }
        this.pDG.a(this, this.pDH);
        return;
        label335:
        x.e("MicroMsg.NetScenePreparePurchase", "getIapWxPayData fail.");
        paramString = null;
        break;
        label347:
        bbq localbbq = (bbq)paraml.diG.dIE.dIL;
        if (localbbq != null)
        {
          paramString = new anm();
          paramString.rFe = paraml.pCK;
          paramString.lRl = paraml.iiv;
          paramString.lPj = paraml.pCL;
          paramString.rQh = localbbq.sdN;
          x.d("MicroMsg.NetScenePreparePurchase", "getIapGoogleData is " + localbbq.sdN);
        }
        for (;;)
        {
          localc2.pCP = paramString;
          break;
          x.e("MicroMsg.NetScenePreparePurchase", "getIapGoogleData fail.");
          paramString = localc1;
        }
        if ((paraml instanceof com.tencent.mm.plugin.wallet_index.c.d))
        {
          paramString = (com.tencent.mm.plugin.wallet_index.c.d)paraml;
          if ((paramInt1 == 0) && (paramString.errCode == 0))
          {
            localc2.pCQ = paramString.pCQ;
            localc2.pCP = paramString.pCP;
            if (localc2.bRe())
            {
              if (localc2.pCQ != null) {
                localc2.pDh = localc2.pCQ.rQh;
              } else {
                x.e("MicroMsg.IapData", "iapWxPayData is null");
              }
            }
            else if (localc2.pCP != null) {
              localc2.pDh = localc2.pCP.rQh;
            } else {
              x.e("MicroMsg.IapData", "iapGoogleData is null");
            }
          }
        }
      }
      label578:
      x.i("MicroMsg.WalletIapUI", "back to preview UI, reason: PreparePurchase fail , errCode: " + locala.kjf + " , errMsg: " + locala.kjg);
      paramString = new Intent();
      paramString.putExtra("key_err_code", locala.kjf);
      paramString.putExtra("key_err_msg", locala.kjg);
      paramString.putExtra("key_response_position", 1);
      setResult(-1, paramString);
      finish();
      return;
    }
    localc1 = this.pDc;
    if ((paraml instanceof com.tencent.mm.wallet_core.c.l))
    {
      paraml = (com.tencent.mm.wallet_core.c.l)paraml;
      localc1.iiv = paraml.iiv;
      localc1.pDm = paraml.iix;
      localc1.pDn = paraml.pDn;
      if (paraml.errCode == 0) {
        paramInt1 = 1;
      }
    }
    for (;;)
    {
      localc1.pDo.remove(localc1.iiv);
      if (paramInt1 != 0)
      {
        x.i("MicroMsg.IapData", "Verify " + localc1.iiv + " OK");
        localc1.pDk.add(localc1.iiv);
        localc1.pDl.add(localc1.pDm);
      }
      for (;;)
      {
        bool = false;
        for (;;)
        {
          if (!this.pDc.pDo.isEmpty()) {
            break label1041;
          }
          x.d("MicroMsg.WalletIapUI", "Verify All End... ");
          if (this.pDc.pDk.isEmpty()) {
            break label1113;
          }
          x.i("MicroMsg.WalletIapUI", "mResultProductIds size: " + this.pDc.pDk.size() + ", Consume ...");
          this.pDG.a(this, this.pDc.pDk, this.pDe, bool);
          return;
          paramInt1 = 0;
          break;
          if (!(paraml instanceof com.tencent.mm.plugin.wallet_index.c.g)) {
            break label1206;
          }
          paraml = (com.tencent.mm.plugin.wallet_index.c.g)paraml;
          localc1.iiv = paraml.bKk;
          if (paraml.errCode == 0)
          {
            paramInt1 = 1;
            break;
          }
          paramInt1 = 0;
          break;
          if (!localc1.iiv.startsWith("com.tencent.xin.wco")) {
            break label1078;
          }
          if (localc1.pDn <= 0) {
            break label1043;
          }
          localc1.pDk.add(localc1.iiv);
          localc1.pDl.add(localc1.pDm);
          x.i("MicroMsg.IapData", "Verify " + localc1.iiv + " fail and cosume");
        }
        label1041:
        break;
        label1043:
        x.i("MicroMsg.IapData", "Verify " + localc1.iiv + " fail");
        continue;
        label1078:
        x.i("MicroMsg.IapData", "Verify " + localc1.iiv + " fail");
      }
      label1113:
      x.i("MicroMsg.WalletIapUI", "back to preview UI, reason: VerifyPurchase fail , errCode: " + paramInt2 + " , errMsg: " + paramString);
      paraml = new Intent();
      paraml.putExtra("key_err_code", paramInt2);
      paraml.putExtra("key_err_msg", paramString);
      paraml.putExtra("key_response_position", 3);
      paraml.putExtra("key_launch_ts", a.pDd);
      setResult(-1, paraml);
      finish();
      return;
      label1206:
      paramInt1 = 0;
    }
  }
  
  public void finish()
  {
    x.i("MicroMsg.WalletIapUI", "finish");
    if ((this.gvJ != null) && (this.gvJ.isShowing()))
    {
      this.gvJ.dismiss();
      this.gvJ = null;
    }
    if (this.pDG != null) {
      this.pDG.j(this);
    }
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(422, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(414, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1130, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1306, this);
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.WalletIapUI", "onActivityResult resultCode : " + paramInt2);
    if (this.pDG != null)
    {
      this.pDG.a(this, paramInt1, paramInt2, paramIntent);
      x.d("MicroMsg.WalletIapUI", "onActivityResult handled by mWalletPay.");
      return;
    }
    x.e("MicroMsg.WalletIapUI", "havn't handle user action");
    paramIntent = new Intent();
    com.tencent.mm.plugin.wallet_index.c.a locala = com.tencent.mm.plugin.wallet_index.c.a.aN(6, "");
    paramIntent.putExtra("key_err_code", locala.kjf);
    paramIntent.putExtra("key_err_msg", locala.kjg);
    paramIntent.putExtra("key_launch_ts", a.pDd);
    setResult(-1, paramIntent);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.v("MicroMsg.WalletIapUI", "onCreate");
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(422, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(414, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1130, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1306, this);
    if (getIntent().getIntExtra("key_action_type", 200001) == 200001) {
      this.gvJ = com.tencent.mm.wallet_core.ui.g.a(this, getString(a.i.app_waiting), new WalletIapUI.1(this));
    }
    boolean bool = getIntent().getBooleanExtra("key_is_mini_program", false);
    this.pDc = new c();
    this.pDc.pDp = bool;
    if ((getIntent().getBooleanExtra("key_force_google", false)) || (q.GR())) {
      x.d("MicroMsg.WalletIapUI", "Pay use Google Wallet!");
    }
    for (this.pDG = new a(this, this.pDc, this.pDe);; this.pDG = new f(this.pDc, this.lSI))
    {
      this.pDc.lQa = this.pDG.bRd();
      return;
      x.d("MicroMsg.WalletIapUI", "Pay use WeiXin Wallet!");
    }
  }
  
  public void onDestroy()
  {
    x.d("MicroMsg.WalletIapUI", "onDestroy");
    if ((this.gvJ != null) && (this.gvJ.isShowing()))
    {
      this.gvJ.dismiss();
      this.gvJ = null;
    }
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.d("MicroMsg.WalletIapUI", "onNewIntent");
    super.onNewIntent(paramIntent);
  }
  
  public void onResume()
  {
    x.d("MicroMsg.WalletIapUI", "onResume");
    super.onResume();
    x.d("MicroMsg.WalletIapUI", "Handler jump");
    if (!this.pDF)
    {
      this.pDF = true;
      localObject1 = getIntent();
      if (((Intent)localObject1).getIntExtra("key_action_type", 200001) == 200002)
      {
        x.d("MicroMsg.WalletIapUI", "start to restore the purchase!");
        this.pDG.b(this, true);
      }
    }
    else
    {
      return;
    }
    Object localObject2 = this.pDc;
    String str1 = ((Intent)localObject1).getStringExtra("key_product_id");
    ((c)localObject2).iiv = str1;
    ((c)localObject2).pDo.add(str1);
    x.d("MicroMsg.IapData", "prepare pay product: " + str1);
    this.pDc.pCL = ((Intent)localObject1).getStringExtra("key_price");
    this.pDc.pCK = ((Intent)localObject1).getStringExtra("key_currency_type");
    str1 = ((Intent)localObject1).getStringExtra("key_ext_info");
    this.pDc.mCount = ((Intent)localObject1).getIntExtra("key_count", 1);
    String str2 = ((Intent)localObject1).getStringExtra("key_appid");
    String str3 = ((Intent)localObject1).getStringExtra("key_desc");
    String str4 = ((Intent)localObject1).getStringExtra("key_busiid");
    this.pDc.pDq = ((Intent)localObject1).getStringExtra("key_virtual_pay_sign");
    this.pDc.pDr = ((Intent)localObject1).getStringExtra("key_attach");
    com.tencent.mm.kernel.g.Ek();
    localObject2 = com.tencent.mm.kernel.g.Eh().dpP;
    Object localObject1 = this.pDc;
    int i = this.pDG.bRd();
    if (((c)localObject1).pDp) {}
    for (localObject1 = new com.tencent.mm.plugin.wallet_index.c.d(i, str2, ((c)localObject1).pCL, str3, ((c)localObject1).mCount, ((c)localObject1).pCK, str4, ((c)localObject1).pDq, ((c)localObject1).pDr);; localObject1 = new k(((c)localObject1).iiv, ((c)localObject1).pCL, ((c)localObject1).pCK, ((c)localObject1).mCount, i, str1))
    {
      ((o)localObject2).a((com.tencent.mm.ab.l)localObject1, 0);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/WalletIapUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */