package com.tencent.mm.plugin.collect.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.collect.b.m;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.a;

public class CollectCreateQRCodeUI
  extends WalletBaseUI
{
  private String cZG = "";
  private WalletFormView hXD;
  private TextView hXE;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((paraml instanceof com.tencent.mm.plugin.collect.b.s))
    {
      bool1 = bool2;
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0)
        {
          paramString = (com.tencent.mm.plugin.collect.b.s)paraml;
          paraml = new Intent();
          paraml.putExtra("ftf_pay_url", paramString.hUK);
          paraml.putExtra("ftf_fixed_fee", paramString.hUL);
          paraml.putExtra("ftf_fixed_fee_type", paramString.bJg);
          paraml.putExtra("ftf_fixed_desc", paramString.desc);
          setResult(-1, paraml);
          finish();
          bool1 = true;
        }
      }
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paraml instanceof m));
      paramString = (m)paraml;
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break;
      }
      if (paramString.hUm == 0)
      {
        paraml = new Intent();
        paraml.putExtra("ftf_pay_url", paramString.hUo);
        paraml.putExtra("ftf_fixed_fee", paramString.cfh / 100.0D);
        paraml.putExtra("ftf_fixed_desc", paramString.desc);
        paraml.putExtra("key_currency_unit", paramString.hUx);
        setResult(-1, paraml);
        finish();
        return true;
      }
      if (paramString.hUp == 0)
      {
        h.b(this.mController.tml, paramString.hUn, paramString.hUq, false);
        return true;
      }
      bool1 = bool2;
    } while (paramString.hUp != 1);
    if ((!bi.oW(paramString.hUr)) && (!bi.oW(paramString.hUs))) {
      h.a(this.mController.tml, paramString.hUn, paramString.hUq, paramString.hUs, paramString.hUr, new CollectCreateQRCodeUI.5(this, paramString), new CollectCreateQRCodeUI.6(this));
    }
    return true;
    x.e("MicroMsg.CollectCreateQRCodeUI", "net error: %s", new Object[] { paramString });
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.collect_create_qrcode;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.collect_create_qrcode_title);
    setBackBtn(new CollectCreateQRCodeUI.1(this));
    this.hXD = ((WalletFormView)findViewById(a.f.money_ev));
    a.f(this.hXD);
    String str = getIntent().getStringExtra("key_currency_unit");
    if (!bi.oW(str)) {
      this.hXD.getTitleTv().setText(str);
    }
    for (;;)
    {
      this.hXD.a(new CollectCreateQRCodeUI.2(this));
      d(this.hXD, 2, false);
      ((Button)findViewById(a.f.next_btn)).setOnClickListener(new CollectCreateQRCodeUI.3(this));
      this.hXE = ((TextView)findViewById(a.f.collect_main_add_desc));
      this.hXE.setOnClickListener(new CollectCreateQRCodeUI.4(this));
      return;
      this.hXD.getTitleTv().setText(v.cDm());
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1335);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1335);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectCreateQRCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */