package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.honey_pay.a.k;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.btd;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public class HoneyPayCardBackUI
  extends HoneyPayBaseUI
{
  private CdnImageView kjX;
  private WalletTextView kjY;
  private TextView kjZ;
  private TextView kka;
  private TextView kkb;
  private String kkc;
  private btd kkd;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof k))
    {
      paramString = (k)paraml;
      paramString.a(new HoneyPayCardBackUI.4(this, paramString)).b(new HoneyPayCardBackUI.3(this)).c(new HoneyPayCardBackUI.2(this));
    }
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.honey_pay_card_back_ui;
  }
  
  protected final void initView()
  {
    this.kjX = ((CdnImageView)findViewById(a.f.hpcb_avatar_iv));
    this.kjY = ((WalletTextView)findViewById(a.f.hpcb_quota_remained_tv));
    this.kjZ = ((TextView)findViewById(a.f.hpcb_quota_tv));
    this.kka = ((TextView)findViewById(a.f.hpcb_card_type_name_tv));
    this.kkb = ((TextView)findViewById(a.f.hpcb_desc_tv));
    this.kjY.setPrefix(v.cDm());
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      x.i(this.TAG, "unbind success");
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.kjV = a.c.honey_pay_orange;
    super.onCreate(paramBundle);
    setMMTitle("");
    setBackBtn(new HoneyPayCardBackUI.1(this));
    jr(2851);
    this.kkc = getIntent().getStringExtra("key_card_no");
    initView();
    x.i(this.TAG, "do qry card detail: %s", new Object[] { this.kkc });
    paramBundle = new k(this.kkc);
    paramBundle.m(this);
    a(paramBundle, true, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2851);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardBackUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */