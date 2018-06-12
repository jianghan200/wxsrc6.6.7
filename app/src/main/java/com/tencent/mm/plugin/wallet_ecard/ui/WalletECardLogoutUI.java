package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_ecard.a.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import org.xwalk.core.Log;

public class WalletECardLogoutUI
  extends WalletECardBaseUI
{
  private TextView eBT;
  private TextView gsY;
  private CdnImageView kmk;
  private TextView pCv;
  private LinearLayout pCw;
  private View pCx;
  private Button pCy;
  private String pct;
  private String psA;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof g))
    {
      paramString = (g)paraml;
      paramString.a(new WalletECardLogoutUI.4(this, paramString)).b(new WalletECardLogoutUI.3(this)).c(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl) {}
      });
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.ecard_logout_ui;
  }
  
  protected final void initView()
  {
    this.gsY = ((TextView)findViewById(a.f.elu_title));
    this.pCv = ((TextView)findViewById(a.f.elu_tips_title));
    this.pCw = ((LinearLayout)findViewById(a.f.elu_tips_layout));
    this.eBT = ((TextView)findViewById(a.f.elu_bottom_link_tv));
    this.kmk = ((CdnImageView)findViewById(a.f.elu_icon_iv));
    this.pCx = findViewById(a.f.elu_mask_view);
    this.pCy = ((Button)findViewById(a.f.elu_logout_btn));
    this.pCy.setOnClickListener(new WalletECardLogoutUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(2931);
    initView();
    setMMTitle(a.i.ecard_logout_title);
    Log.i("MicroMsg.WalletECardLogoutUI", "do qry logout desc");
    paramBundle = new g();
    paramBundle.m(this);
    a(paramBundle, true, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2931);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */