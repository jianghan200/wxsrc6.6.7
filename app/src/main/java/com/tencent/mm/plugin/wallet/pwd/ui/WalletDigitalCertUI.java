package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.pwd.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.f;
import com.tencent.mm.wallet_core.c.r;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Iterator;
import java.util.Vector;

public class WalletDigitalCertUI
  extends WalletBaseUI
{
  private Button eOQ;
  private ImageView gxd;
  private TextView mvO;
  private Button phv;
  private LinearLayout phw;
  private TextView phx;
  
  private void bOa()
  {
    x.i("MicroMsg.WalletDigitalCertUI", "updateCrtState");
    this.phw.removeAllViews();
    if (s.cDi().cDj())
    {
      this.phv.setVisibility(8);
      this.eOQ.setVisibility(0);
      this.mvO.setText(a.i.wallet_password_setting_digitalcert_succ);
      this.gxd.setImageResource(a.e.wallet_cert_installed);
    }
    for (;;)
    {
      localObject = s.cDi().uXD;
      if (((Vector)localObject).size() != 0) {
        break;
      }
      this.phw.setVisibility(8);
      this.phx.setVisibility(8);
      return;
      this.phv.setVisibility(0);
      this.eOQ.setVisibility(8);
      this.mvO.setText(a.i.wallet_password_setting_digitalcert_fail);
      this.gxd.setImageResource(a.e.wallet_cert_uninstall);
    }
    this.phw.setVisibility(0);
    this.phx.setVisibility(0);
    Object localObject = ((Vector)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      r localr = (r)((Iterator)localObject).next();
      if (localr.uXx <= 0)
      {
        View localView = View.inflate(this, a.g.wallet_cert_adapter_item, null);
        TextView localTextView1 = (TextView)localView.findViewById(a.f.cert_title);
        TextView localTextView2 = (TextView)localView.findViewById(a.f.cert_summary);
        TextView localTextView3 = (TextView)localView.findViewById(a.f.del_item);
        localTextView1.setText(localr.sxq);
        localTextView2.setText(localr.uXw);
        localTextView3.setTag(localr);
        localTextView3.setOnClickListener(new WalletDigitalCertUI.4(this));
        this.phw.addView(localView);
      }
    }
    if (this.phw.getChildCount() == 0)
    {
      this.phx.setVisibility(8);
      return;
    }
    this.phx.setVisibility(0);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (!(paraml instanceof d))
    {
      if (!(paraml instanceof f)) {
        break label59;
      }
      if (paramInt2 != 0) {
        break label61;
      }
      h.mEJ.h(13731, new Object[] { Integer.valueOf(11) });
      s.cDi().abV(((f)paraml).uXa);
    }
    for (;;)
    {
      bOa();
      label59:
      return false;
      label61:
      h.mEJ.h(13731, new Object[] { Integer.valueOf(12) });
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_digital_certui;
  }
  
  public final void initView()
  {
    setMMTitle(a.i.wallet_password_setting_digitalcert);
    this.gxd = ((ImageView)findViewById(a.f.cert_icon_iv));
    this.mvO = ((TextView)findViewById(a.f.cert_tip_state));
    this.phv = ((Button)findViewById(a.f.install_cert));
    this.eOQ = ((Button)findViewById(a.f.del_cert));
    this.phw = ((LinearLayout)findViewById(a.f.installed_list));
    this.phx = ((TextView)findViewById(a.f.installed_list_tip));
    this.phv.setOnClickListener(new WalletDigitalCertUI.1(this));
    this.eOQ.setOnClickListener(new WalletDigitalCertUI.2(this));
    setBackBtn(new WalletDigitalCertUI.3(this));
    bOa();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if ((1 == paramInt1) && (paramInt2 == -1))
    {
      bool = ((k)g.l(k.class)).aNa();
      paramIntent = ad.chZ();
      if (paramIntent == null) {
        break label103;
      }
      str = paramIntent.getString("cpu_id", null);
      paramIntent = paramIntent.getString("uid", null);
    }
    for (;;)
    {
      x.i("MicroMsg.WalletDigitalCertUI", "alvinluo getSecurityInfo isOpenTouchPay: %b", new Object[] { Boolean.valueOf(bool) });
      a(new d(bool, str, paramIntent), false, false);
      return;
      label103:
      paramIntent = null;
      str = null;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1654);
    jr(1568);
    jr(1669);
    initView();
    h.mEJ.h(13731, new Object[] { Integer.valueOf(1) });
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1654);
    js(1568);
    js(1669);
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletDigitalCertUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */