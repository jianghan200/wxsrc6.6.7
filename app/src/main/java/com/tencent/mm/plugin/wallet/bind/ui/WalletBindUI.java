package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(7)
public class WalletBindUI
  extends WalletBaseUI
{
  private com.tencent.mm.plugin.wallet_core.ui.q kZX = new com.tencent.mm.plugin.wallet_core.ui.q();
  private PayInfo mpb = new PayInfo();
  private boolean pds = false;
  private String pdt;
  private int pdu = -1;
  private com.tencent.mm.plugin.wallet_core.c.a pdv = null;
  private boolean pdw = false;
  com.tencent.mm.sdk.b.c pdx = new WalletBindUI.3(this);
  private String token = null;
  
  private void bNl()
  {
    this.mpb.bVZ = this.pdu;
    this.sy.putParcelable("key_pay_info", this.mpb);
    if (this.pdu == 2)
    {
      if (!bi.oW(this.pdt))
      {
        x.d("MicroMsg.WalletBindUI", "importKey " + this.pdt);
        a(new com.tencent.mm.plugin.wallet.bind.a.c(this.pdt, this.mpb), true, false);
        return;
      }
      zK("");
      return;
    }
    if (this.pdu == 4)
    {
      com.tencent.mm.wallet_core.c.p.GZ(4);
      if (getIntent() == null)
      {
        zK("");
        return;
      }
      String str1 = getIntent().getStringExtra("appId");
      String str2 = getIntent().getStringExtra("timeStamp");
      String str3 = getIntent().getStringExtra("nonceStr");
      String str4 = getIntent().getStringExtra("packageExt");
      String str5 = getIntent().getStringExtra("signtype");
      String str6 = getIntent().getStringExtra("paySignature");
      String str7 = getIntent().getStringExtra("url");
      int i = getIntent().getIntExtra("pay_channel", 0);
      if (this.pdu == 6) {}
      for (this.pdv = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, str5, str6, str7, 2, "getBrandWCPayCreateCreditCardRequest", i);; this.pdv = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, str5, str6, str7, 1, "getBrandWCPayBindCardRequest", i))
      {
        a(this.pdv, true, false);
        return;
      }
    }
    if (this.pdu == 6)
    {
      bNm();
      return;
    }
    zf(this.pdu);
  }
  
  private void bNm()
  {
    int i = 0;
    com.tencent.mm.plugin.wallet.a.p.bNp();
    if (com.tencent.mm.plugin.wallet.a.p.bNq().bPr())
    {
      a(new y(null, 12), true, false);
      return;
    }
    Object localObject1 = getIntent().getStringExtra("packageExt");
    Object localObject3 = ((String)localObject1).split("&");
    if ((!bi.oW((String)localObject1)) && (localObject3.length >= 2))
    {
      int j = localObject3.length;
      String str = null;
      localObject1 = null;
      Object localObject2;
      if (i < j)
      {
        Object localObject4 = localObject3[i];
        if (((String)localObject4).startsWith("bankType=")) {
          localObject2 = ((String)localObject4).replace("bankType=", "");
        }
        for (;;)
        {
          i += 1;
          localObject1 = localObject2;
          break;
          localObject2 = localObject1;
          if (((String)localObject4).startsWith("bankName="))
          {
            str = ((String)localObject4).replace("bankName=", "");
            localObject2 = localObject1;
          }
        }
      }
      if ((!bi.oW(str)) && (!bi.oW((String)localObject1)))
      {
        com.tencent.mm.plugin.wallet.a.p.bNp();
        if (com.tencent.mm.plugin.wallet.a.p.bNq().Pb((String)localObject1))
        {
          localObject2 = new Bundle();
          localObject3 = new Bankcard();
          ((Bankcard)localObject3).field_bankName = str;
          ((Bankcard)localObject3).field_bankcardType = ((String)localObject1);
          ((Bundle)localObject2).putParcelable("key_bankcard", (Parcelable)localObject3);
          ((Bundle)localObject2).putString("key_bank_type", ((Bankcard)localObject3).field_bankcardType);
          com.tencent.mm.wallet_core.a.a(this, "WXCreditOpenProcess", (Bundle)localObject2, null);
          return;
        }
      }
    }
    finish();
  }
  
  private void zK(String paramString)
  {
    String str = paramString;
    if (bi.oW(paramString)) {
      str = getString(a.i.wallet_unknown_err);
    }
    h.a(this, str, null, false, new WalletBindUI.7(this));
  }
  
  private void zf(int paramInt)
  {
    x.i("MicroMsg.WalletBindUI", "doBindCardForOtherScene " + bi.cjd().toString());
    Bundle localBundle = this.sy;
    localBundle.putParcelable("key_pay_info", this.mpb);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putString("key_custom_bind_tips", getIntent().getStringExtra("key_custom_bind_tips"));
    com.tencent.mm.plugin.wallet.a.p.bNp();
    if (com.tencent.mm.plugin.wallet.a.p.bNq().bPr())
    {
      x.i("MicroMsg.WalletBindUI", "user status invalid");
      if (paramInt == 4)
      {
        a(new y(null, 20), true, false);
        return;
      }
      a(new y(null, 12), true, false);
      return;
    }
    com.tencent.mm.plugin.wallet.a.p.bNp();
    if (com.tencent.mm.plugin.wallet.a.p.bNq().bPs())
    {
      x.i("MicroMsg.WalletBindUI", "user status reg");
      this.pds = true;
      this.mpb.bVZ = this.pdu;
      localBundle.putInt("key_bind_scene", this.mpb.bVZ);
      if (!bi.oW(this.token)) {
        localBundle.putString("kreq_token", this.token);
      }
      com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, null);
      return;
    }
    x.i("MicroMsg.WalletBindUI", "user status unreg");
    this.pds = true;
    if (this.pdu >= 0) {}
    for (this.mpb.bVZ = this.pdu;; this.mpb.bVZ = 1)
    {
      localBundle.putInt("key_bind_scene", this.mpb.bVZ);
      com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, null);
      return;
    }
  }
  
  public final boolean bbU()
  {
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet.bind.a.c)) {
      this.pds = true;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof y))
      {
        if (this.pdu == 6) {
          bNm();
        }
        for (;;)
        {
          return true;
          bNl();
        }
      }
      if ((paraml instanceof com.tencent.mm.plugin.wallet.bind.a.c))
      {
        paraml = (com.tencent.mm.plugin.wallet.bind.a.c)paraml;
        Bundle localBundle = this.sy;
        localBundle.putBoolean("key_is_import_bind", true);
        if ((paraml.oZG != null) && (paraml.oZG.size() > 0))
        {
          paramString = (Bankcard)paraml.oZG.get(0);
          if (!paramString.btA)
          {
            localBundle.putBoolean("key_need_bind_response", true);
            localBundle.putString("kreq_token", paraml.token);
            localBundle.putString("key_bank_username", paraml.pcv);
            localBundle.putString("key_recommand_desc", paraml.pcw);
            localBundle.putParcelable("key_import_bankcard", paramString);
            this.pds = true;
            localBundle.putInt("key_bind_scene", 2);
            com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, new WalletBindUI.4(this));
          }
        }
        for (;;)
        {
          return true;
          h.a(this, a.i.wallet_card_import_exist, 0, false, new WalletBindUI.5(this));
          continue;
          paraml = paramString;
          if (bi.oW(paramString)) {
            paraml = getString(a.i.wallet_bind_import_fail);
          }
          h.a(this, paraml, null, false, new WalletBindUI.6(this));
        }
      }
      if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        if ((this.pdv != null) && (this.pdv.equals(paraml)))
        {
          f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
          this.token = ((com.tencent.mm.plugin.wallet_core.c.a)paraml).blM();
          zf(4);
          return true;
        }
        com.tencent.mm.wallet_core.c.p.cDe();
      }
      return false;
    }
    zK(paramString);
    return true;
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
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1) {
        this.kZX.bcc();
      }
    }
    else {
      return;
    }
    this.kZX.cancel();
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = -1;
    super.onCreate(paramBundle);
    jr(580);
    this.kZX.pzb = new WalletBindUI.1(this);
    this.pdt = getIntent().getStringExtra("key_import_key");
    this.pdu = getIntent().getIntExtra("key_bind_scene", -1);
    if (getIntent() != null) {
      i = getIntent().getIntExtra("key_bind_scene", 13);
    }
    paramBundle = new sz();
    if (i == 4) {}
    for (paramBundle.cdR.scene = 20;; paramBundle.cdR.scene = 13)
    {
      paramBundle.bJX = new WalletBindUI.2(this);
      com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
      com.tencent.mm.sdk.b.a.sFg.b(this.pdx);
      com.tencent.mm.wallet_core.c.q.fu(6, 0);
      return;
    }
  }
  
  public void onDestroy()
  {
    js(580);
    com.tencent.mm.sdk.b.a.sFg.c(this.pdx);
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      x.e("MicroMsg.WalletBindUI", "onNewIntent intent null");
      setResult(0);
      finish();
      return;
    }
    super.onNewIntent(paramIntent);
    x.v("MicroMsg.WalletBindUI", "onNewIntent");
    setIntent(paramIntent);
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_bind_end", false)))
    {
      x.d("MicroMsg.WalletBindUI", "pay done... errCode:" + paramIntent.getBooleanExtra("intent_bind_end", false));
      setResult(-1, getIntent());
    }
    for (;;)
    {
      finish();
      return;
      x.i("MicroMsg.WalletBindUI", "pay cancel");
      setResult(0);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.kZX.onPause();
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    this.pds = paramBundle.getBoolean("key_is_jump", false);
  }
  
  public void onResume()
  {
    if (this.pds) {
      finish();
    }
    super.onResume();
    this.kZX.onResume();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("key_is_jump", this.pds);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/ui/WalletBindUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */