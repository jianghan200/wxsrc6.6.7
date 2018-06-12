package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet.pay.a.b;
import com.tencent.mm.plugin.wallet_core.c.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletLoanRepaymentUI
  extends WalletBaseUI
{
  private String desc;
  private String eTo;
  private String lNV = "CNY";
  private double mxP;
  protected com.tencent.mm.plugin.wallet_core.ui.o oZD;
  private String pfG;
  private String pfH;
  private String pfI;
  private String pfJ;
  private String pfK;
  private String pfL;
  private String pfM;
  private String pfN;
  private int pfO;
  private String token;
  
  private void OR(String paramString)
  {
    a(new b(paramString), true, false);
  }
  
  private void a(Bankcard paramBankcard, double paramDouble, String paramString)
  {
    WalletLoanRepaymentUI.1 local1 = new WalletLoanRepaymentUI.1(this);
    WalletLoanRepaymentUI.2 local2 = new WalletLoanRepaymentUI.2(this);
    WalletLoanRepaymentUI.3 local3 = new WalletLoanRepaymentUI.3(this);
    this.pfN = paramBankcard.field_bindSerial;
    this.oZD = com.tencent.mm.plugin.wallet_core.ui.o.a(this, this.desc, paramDouble, paramString, paramBankcard, local1, local2, local3);
  }
  
  private void bNF()
  {
    x.i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard");
    startActivityForResult(new Intent(this, WalletChangeLoanRepayBankcardUI.class), 1);
  }
  
  protected final void bNG()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_bind_scene", 8);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putString("kreq_token", this.token);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.loan.a.class, localBundle, new WalletLoanRepaymentUI.6(this));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
        this.token = ((com.tencent.mm.plugin.wallet_core.c.a)paraml).blM();
        OR(this.token);
        return true;
      }
      if ((paraml instanceof b))
      {
        paramString = (b)paraml;
        this.lNV = paramString.lNV;
        this.mxP = paramString.mxP;
        this.desc = paramString.desc;
        paramString = com.tencent.mm.plugin.wallet_core.model.o.bOX();
        if (paramString.bPh())
        {
          paramString = paramString.bPi();
          if ((paramString != null) && (bi.oW(paramString.field_forbidWord))) {
            a(paramString, this.mxP, this.lNV);
          }
        }
        for (;;)
        {
          return true;
          bNF();
          continue;
          h.a(this, getResources().getString(a.i.wallet_loan_repayment_new_card_tip), "", getString(a.i.wallet_pay_bankcard_add), getString(a.i.app_cancel), new WalletLoanRepaymentUI.4(this), new WalletLoanRepaymentUI.5(this));
        }
      }
      if ((paraml instanceof s))
      {
        paramString = (s)paraml;
        if (paramString.bOk())
        {
          x.i("MicroMsg.WalletLoanRepaymentUI", "need free sms");
          paraml = new Bundle();
          paraml.putString("key_pwd1", this.eTo);
          paraml.putString("key_jsapi_token", this.token);
          paraml.putString("key_relation_key", paramString.pjx);
          paraml.putInt("key_verify_scene", 8);
          paraml.putString("key_mobile", paramString.pjw);
          com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet_core.ui.l.class, paraml);
        }
        for (;;)
        {
          return true;
          paraml = new Intent();
          paraml.putExtra("token", paramString.pju);
          paraml.putExtra("bind_serial", this.pfN);
          setResult(-1, paraml);
          finish();
        }
      }
    }
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        paramInt1 = paramIntent.getIntExtra("ret", 64536);
        if (paramInt1 == 64533)
        {
          x.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new card");
          bNG();
          return;
        }
        if (paramInt1 == 0)
        {
          x.i("MicroMsg.WalletLoanRepaymentUI", "change card ok");
          paramIntent = com.tencent.mm.plugin.wallet_core.model.o.bOX().OZ(paramIntent.getStringExtra("bindSerial"));
          if (paramIntent == null)
          {
            x.e("MicroMsg.WalletLoanRepaymentUI", "bankcard is null by getBankcardBySerialNo");
            finish();
            return;
          }
          a(paramIntent, this.mxP, this.lNV);
          return;
        }
        x.e("MicroMsg.WalletLoanRepaymentUI", "activity return unknow error");
        return;
      }
      paramIntent = com.tencent.mm.plugin.wallet_core.model.o.bOX();
      if (paramIntent.bPh())
      {
        paramIntent = paramIntent.bPi();
        if ((paramIntent != null) && (bi.oW(paramIntent.field_forbidWord)))
        {
          a(paramIntent, this.mxP, this.lNV);
          return;
        }
        finish();
        return;
      }
      x.e("MicroMsg.WalletLoanRepaymentUI", "onActivityResult hasRepaymentBankcard is false");
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.pfL = paramBundle.getStringExtra("appId");
    this.pfG = paramBundle.getStringExtra("timeStamp");
    this.pfH = paramBundle.getStringExtra("nonceStr");
    this.pfI = paramBundle.getStringExtra("packageExt");
    this.pfJ = paramBundle.getStringExtra("signtype");
    this.pfK = paramBundle.getStringExtra("paySignature");
    this.pfM = paramBundle.getStringExtra("url");
    this.pfO = paramBundle.getIntExtra("pay_channel", 0);
    jr(580);
    a(new com.tencent.mm.plugin.wallet_core.c.a(this.pfL, this.pfG, this.pfH, this.pfI, this.pfJ, this.pfK, this.pfM, 7, "getWebPayCheckoutCounterRequst", this.pfO), true, false);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    Object localObject = paramIntent.getExtras();
    x.i("MicroMsg.WalletLoanRepaymentUI", "onNewIntent");
    if (((Bundle)localObject).containsKey("intent_bind_end"))
    {
      x.i("MicroMsg.WalletLoanRepaymentUI", "back from bind card");
      OR(this.token);
      return;
    }
    if (((Bundle)localObject).containsKey("jsapi_verifycode_process_end"))
    {
      x.i("MicroMsg.WalletLoanRepaymentUI", "back from verify code");
      localObject = new Intent();
      ((Intent)localObject).putExtra("token", paramIntent.getStringExtra("token"));
      ((Intent)localObject).putExtra("bind_serial", this.pfN);
      setResult(-1, (Intent)localObject);
      finish();
      return;
    }
    x.i("MicroMsg.WalletLoanRepaymentUI", "need to deal with,finish");
    finish();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/ui/WalletLoanRepaymentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */