package com.tencent.mm.plugin.freewifi.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.u;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;

public class FreeWifiSuccWebViewUI
  extends WebViewUI
  implements e
{
  private String bPS;
  private String bPg;
  private int bVU;
  private String jkJ;
  private int jnW;
  private String jnX;
  private boolean joj = false;
  private String signature;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "onSceneEnd, scnee type = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    au.DF().b(1703, this);
  }
  
  protected final void ant()
  {
    super.ant();
  }
  
  public void finish()
  {
    super.finish();
  }
  
  protected final void initView()
  {
    super.initView();
    lD(false);
    a(0, getString(R.l.free_wifi_finish), new FreeWifiSuccWebViewUI.1(this), s.b.tnc);
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    com.tencent.mm.plugin.freewifi.j.userName = "";
    com.tencent.mm.plugin.freewifi.j.type = 0;
    String str = getIntent().getStringExtra("free_wifi_qinghuai_url");
    x.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "qinghuaiUrl=%s", new Object[] { str });
    getIntent().putExtra("rawUrl", str);
    getIntent().putExtra("showShare", false);
    super.onCreate(paramBundle);
    this.bPS = getIntent().getStringExtra("free_wifi_appid");
    this.jkJ = getIntent().getStringExtra("free_wifi_app_nickname");
    this.bPg = getIntent().getStringExtra("free_wifi_app_username");
    this.jnW = getIntent().getIntExtra("free_wifi_finish_actioncode", 0);
    this.jnX = getIntent().getStringExtra("free_wifi_finish_url");
    this.signature = getIntent().getStringExtra("free_wifi_signature");
    this.bVU = m.H(getIntent());
    if (this.bVU == 10)
    {
      paramBundle = q.deR.dfn;
      str = q.br(this.mController.tml);
      if ((!m.isEmpty(paramBundle)) && (!m.isEmpty(str))) {
        this.jnX = Uri.parse(this.jnX).buildUpon().appendQueryParameter("manufacturer", str).appendQueryParameter("manufacturerUsername", paramBundle).toString();
      }
    }
    x.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "get from intent, appid = %s, appNickName = %s, appUserName = %s, finishActionCode = %d, finishUrl = %s, signature = %s", new Object[] { this.bPS, this.jkJ, this.bPg, Integer.valueOf(this.jnW), this.jnX, this.signature });
    WifiInfo localWifiInfo = d.aOA();
    k.a locala = k.aOa();
    if (localWifiInfo != null)
    {
      str = localWifiInfo.getMacAddress();
      paramBundle = str;
      if (Build.VERSION.SDK_INT > 22) {
        if (str != null)
        {
          paramBundle = str;
          if (!str.equals("02:00:00:00:00:00")) {}
        }
        else
        {
          paramBundle = m.aOf();
        }
      }
      locala.ssid = m.BQ(localWifiInfo.getSSID());
      locala.bssid = localWifiInfo.getBSSID();
      locala.bIR = paramBundle;
    }
    locala.bIQ = getIntent().getStringExtra("free_wifi_ap_key");
    locala.jic = this.bPS;
    locala.jid = m.E(getIntent());
    locala.jie = m.G(getIntent());
    locala.jif = k.b.jir.jiQ;
    locala.jig = k.b.jir.name;
    locala.bVU = m.H(getIntent());
    locala.jih = this.bPg;
    locala.aOc().aOb();
  }
  
  @TargetApi(11)
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(1703, this);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    String str = (String)paramMenu.getItem(0).getTitle();
    if (!getString(R.l.free_wifi_finish).equals(str)) {
      a(0, getString(R.l.free_wifi_finish), new FreeWifiSuccWebViewUI.2(this), s.b.tnc);
    }
    return super.onPrepareOptionsMenu(paramMenu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiSuccWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */