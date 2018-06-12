package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.remittance.model.w;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@com.tencent.mm.ui.base.a(7)
public class RemittanceAdapterUI
  extends WalletBaseUI
{
  public String cYO = null;
  public int fdx;
  protected int kTw;
  public boolean myK = false;
  protected com.tencent.mm.plugin.wallet.a myL = null;
  
  public void brl()
  {
    w localw = new w(this.cYO, this.kTw);
    localw.dox = "RemittanceProcess";
    a(localw, false, false);
  }
  
  public void c(String paramString, int paramInt, Intent paramIntent)
  {
    x.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.fdx + ", name=" + paramString);
    if (paramIntent != null)
    {
      paramIntent = new Intent(paramIntent);
      com.tencent.mm.plugin.wallet.a.a(this.myL, paramIntent);
      if (paramIntent.getIntExtra("busi_type", 0) != 1) {
        break label138;
      }
      paramIntent.setClass(this, RemittanceBusiUI.class);
    }
    for (;;)
    {
      paramIntent.putExtra("receiver_name", paramString);
      paramIntent.putExtra("scene", this.fdx);
      paramIntent.putExtra("pay_scene", paramInt);
      paramIntent.putExtra("pay_channel", this.kTw);
      startActivity(paramIntent);
      setResult(-1);
      finish();
      return;
      paramIntent = new Intent();
      break;
      label138:
      paramIntent.setClass(this, RemittanceUI.class);
    }
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool = false;
    if ((paraml instanceof w)) {
      this.myK = false;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof w))
      {
        paramString = (w)paraml;
        paraml = paramString.myl;
        this.cYO = paramString.username;
        if ((bi.oW(this.cYO)) && (bi.oW(paraml)))
        {
          x.d("MicroMsg.RemittanceAdapterUI", "Username empty & fishsh. scene=" + this.fdx);
          finish();
          bool = true;
        }
      }
      label512:
      while (!(paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        return bool;
        if (this.fdx == 1)
        {
          if (paramString.scene == 33)
          {
            this.myL = com.tencent.mm.plugin.wallet.a.cp(this.cYO, 2);
            this.myL.aM(20, getIntent().getStringExtra("receiver_name"));
          }
        }
        else
        {
          paraml = new Intent();
          paraml.putExtra("fee", paramString.hUL);
          paraml.putExtra("desc", paramString.desc);
          paraml.putExtra("scan_remittance_id", paramString.myc);
          paraml.putExtra("receiver_true_name", e.abZ(paramString.myb));
          paraml.putExtra("receiver_true_name_busi", paramString.mxM);
          paraml.putExtra("receiver_tips", paramString.myd);
          paraml.putExtra("rcvr_new_desc", paramString.mye);
          paraml.putExtra("payer_desc", paramString.myf);
          paraml.putExtra("rcvr_open_id", paramString.myl);
          paraml.putExtra("mch_name", paramString.myi);
          paraml.putExtra("mch_info", paramString.myo);
          paraml.putExtra("mch_photo", paramString.myj);
          paraml.putExtra("mch_type", paramString.mym);
          paraml.putExtra("mch_time", paramString.myk);
          if (paramString.myh == 1)
          {
            paraml.putExtra("busi_type", paramString.myh);
            paraml.putExtra("rcvr_ticket", paramString.myg);
            paraml.putExtra("rcvr_open_id", paramString.myl);
            paraml.putExtra("get_pay_wifi", paramString.myn);
            if (paramString.myp != null) {
              paraml.putExtra("BusiRemittanceResp", paramString.myp);
            }
          }
          g.Ek();
          ab localab = ((i)g.l(i.class)).FR().Yf(this.cYO);
          com.tencent.mm.aa.c.J(this.cYO, 3);
          if ((localab == null) && (!this.cYO.equals(""))) {
            break label512;
          }
          c(this.cYO, paramString.scene, paraml);
        }
        for (;;)
        {
          return true;
          this.myL = com.tencent.mm.plugin.wallet.a.cp(this.cYO, 3);
          this.myL.aM(10, getIntent().getStringExtra("receiver_name"));
          break;
          x.d("MicroMsg.RemittanceAdapterUI", "Receiver in contactStg and try to get contact");
          long l = bi.VF();
          am.a.dBr.a(this.cYO, "", new RemittanceAdapterUI.1(this, l, paramString, paraml));
        }
      }
      f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
      c(null, 31, null);
      return true;
    }
    setResult(0);
    h.bA(this, paramString);
    finish();
    return true;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onBackPressed()
  {
    if (!this.myK)
    {
      x.d("MicroMsg.RemittanceAdapterUI", "back press not lock");
      finish();
      return;
    }
    x.d("MicroMsg.RemittanceAdapterUI", "back press but lock");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(8);
    this.fdx = getIntent().getIntExtra("scene", 0);
    this.cYO = getIntent().getStringExtra("receiver_name");
    this.kTw = getIntent().getIntExtra("pay_channel", -1);
    this.myL = com.tencent.mm.plugin.wallet.a.ac(getIntent());
    if (this.kTw == -1)
    {
      paramBundle = cDK();
      if (paramBundle != null) {
        this.kTw = paramBundle.jfZ.getInt("pay_channel", -1);
      }
    }
    if (this.fdx == 1)
    {
      this.myK = true;
      brl();
      return;
    }
    if (this.fdx == 3)
    {
      jr(580);
      if (getIntent() == null)
      {
        x.d("MicroMsg.RemittanceAdapterUI", "func[doCheckPayNetscene] intent null");
        setResult(0);
        finish();
        return;
      }
      paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3, "getTransferMoneyRequest", getIntent().getIntExtra("pay_channel", 0));
      paramBundle.dox = "RemittanceProcess";
      a(paramBundle, true, false);
      return;
    }
    if (this.fdx == 2)
    {
      if (bi.oW(this.cYO))
      {
        x.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.fdx);
        finish();
        return;
      }
      c(this.cYO, 31, null);
      return;
    }
    if ((this.fdx == 5) || (this.fdx == 6))
    {
      if (bi.oW(this.cYO))
      {
        x.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.fdx);
        finish();
        return;
      }
      paramBundle = this.cYO;
      x.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.fdx + ", name=" + paramBundle);
      Intent localIntent = new Intent();
      com.tencent.mm.plugin.wallet.a.a(this.myL, localIntent);
      localIntent.setClass(this, RemittanceOSRedirect.class);
      localIntent.putExtra("receiver_name", paramBundle);
      localIntent.putExtra("scene", this.fdx);
      localIntent.putExtra("pay_scene", 31);
      localIntent.putExtra("pay_channel", this.kTw);
      startActivity(localIntent);
      setResult(-1);
      finish();
      return;
    }
    c(null, 31, null);
  }
  
  public void onDestroy()
  {
    if (this.fdx == 3) {
      js(580);
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */