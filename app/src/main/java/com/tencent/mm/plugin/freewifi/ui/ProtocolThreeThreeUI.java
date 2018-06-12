package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;

@Deprecated
public class ProtocolThreeThreeUI
  extends MMActivity
{
  protected String appId;
  protected String bJT;
  private int bLv = 1;
  protected String bPg;
  protected String bssid;
  protected int bxk;
  protected String jkJ;
  private int jkT = 0;
  protected String jkW;
  protected String jkX;
  protected String jkY;
  private Uri jkZ;
  private String jla;
  private TextView jmC;
  private ImageView jmP;
  private TextView jmQ;
  private TextView jmR;
  private Button jmS;
  private Button jmT;
  private j.a jme;
  private p jnR;
  protected int jnW;
  protected String jnX;
  protected String jnY;
  private al jou = new al(new ProtocolThreeThreeUI.1(this), false);
  protected String sign;
  protected String signature;
  protected int source;
  protected String ssid;
  
  private void goBack()
  {
    com.tencent.mm.plugin.freewifi.l.u(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.ezn.i(localIntent, this);
    finish();
  }
  
  protected final int aPq()
  {
    if (bi.oW(this.ssid)) {
      x.d("MicroMsg.FreeWifi.Protocol33UI", "Illegal SSID");
    }
    com.tencent.mm.plugin.freewifi.g.c localc;
    do
    {
      return 0;
      localc = j.aOK().Cg(this.ssid);
    } while ((localc == null) || (!localc.field_ssid.equalsIgnoreCase(this.ssid)));
    return localc.field_connectState;
  }
  
  protected final void connect()
  {
    if (com.tencent.mm.plugin.freewifi.m.isEmpty(this.ssid))
    {
      x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, desc=it cannot get ssid, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 3, getIntent());
      return;
    }
    if (com.tencent.mm.plugin.freewifi.m.isEmpty(this.jkX))
    {
      x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, desc=authurl is empty, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 3, getIntent());
      return;
    }
    this.bLv = aPq();
    x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connect, desc=it starts connecting wifi by protocol 3.1. current connect state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), com.tencent.mm.plugin.freewifi.model.d.pZ(this.bLv) });
    if (this.bLv != 2)
    {
      this.jou.J(30000L, 30000L);
      x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connect, desc=it starts connectTimeoutHandler. timeout=%d s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), Integer.valueOf(60) });
      com.tencent.mm.plugin.freewifi.m.isEmpty(this.jkX);
      Object localObject = new StringBuilder(this.jkX);
      if (this.jkX.indexOf("?") == -1) {
        ((StringBuilder)localObject).append("?extend=").append(this.jkY);
      }
      for (;;)
      {
        localObject = ((StringBuilder)localObject).toString();
        j.aON().aOv().post(new ProtocolThreeThreeUI.6(this, (String)localObject));
        return;
        ((StringBuilder)localObject).append("&extend=").append(this.jkY);
      }
    }
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_front_page;
  }
  
  public final void initView()
  {
    this.ssid = com.tencent.mm.plugin.freewifi.m.BS("MicroMsg.FreeWifi.Protocol33UI");
    this.bssid = com.tencent.mm.plugin.freewifi.m.BT("MicroMsg.FreeWifi.Protocol33UI");
    this.source = getIntent().getIntExtra("free_wifi_source", 1);
    this.bxk = getIntent().getIntExtra("free_wifi_channel_id", 0);
    setBackBtn(new ProtocolThreeThreeUI.2(this));
    findViewById(R.h.user_protocol_phone_text).setVisibility(0);
    this.jmP = ((ImageView)findViewById(R.h.free_wifi_app_logo_iv));
    this.jmQ = ((TextView)findViewById(R.h.free_wifi_welcomemsg_tv));
    this.jmR = ((TextView)findViewById(R.h.free_wifi_ssidname_tv));
    this.jmC = ((TextView)findViewById(R.h.free_wifi_connectfail_tv));
    this.jmS = ((Button)findViewById(R.h.connect_wifi_btn));
    this.jmS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.tencent.mm.plugin.freewifi.l.t(com.tencent.mm.plugin.freewifi.model.d.aOB(), ProtocolThreeThreeUI.this.getIntent().getStringExtra("free_wifi_ap_key"), ProtocolThreeThreeUI.this.getIntent().getIntExtra("free_wifi_protocol_type", 0));
        int i = ProtocolThreeThreeUI.this.aPq();
        x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(ProtocolThreeThreeUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.pZ(i) });
        if (i == 2)
        {
          ProtocolThreeThreeUI.this.finish();
          return;
        }
        com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeThreeUI.this.ssid, 1, ProtocolThreeThreeUI.this.getIntent());
        ProtocolThreeThreeUI.this.connect();
      }
    });
    this.jmT = ((Button)findViewById(R.h.user_protocol_privacy_btn));
    this.jmT.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView) {}
    });
    if (bi.oW(this.ssid))
    {
      this.jmR.setText(getString(R.l.free_wifi_ssid_empty_tips));
      this.jmS.setVisibility(4);
    }
    setMMTitle(getString(R.l.free_wifi_title));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jla = getIntent().getStringExtra("free_wifi_schema_uri");
    this.jkZ = Uri.parse(this.jla);
    this.appId = this.jkZ.getQueryParameter("appId");
    this.jkW = this.jkZ.getQueryParameter("shopId");
    this.jkX = this.jkZ.getQueryParameter("authUrl");
    this.jkY = this.jkZ.getQueryParameter("extend");
    this.bJT = this.jkZ.getQueryParameter("timestamp");
    this.sign = this.jkZ.getQueryParameter("sign");
    x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.onCreate, desc=it goes into Protocol33 connect frontpage. uri = %s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), this.jla });
    initView();
    if (bi.oW(this.ssid))
    {
      x.e("MicroMsg.FreeWifi.Protocol33UI", "ssid is null");
      com.tencent.mm.plugin.freewifi.l.s(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      return;
    }
    paramBundle = j.aOK().Cg(this.ssid);
    if (paramBundle == null)
    {
      paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
      paramBundle.field_ssidmd5 = ac.ce(this.ssid);
      paramBundle.field_ssid = this.ssid;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = "";
      paramBundle.field_mid = "";
      paramBundle.field_wifiType = 33;
      paramBundle.field_connectState = 1;
      if (i != 0) {
        j.aOK().b(paramBundle);
      }
      for (;;)
      {
        x.i("MicroMsg.FreeWifi.Protocol33UI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, "", Integer.valueOf(this.source) });
        this.jme = new j.a()
        {
          private int joa = -999999999;
          
          public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
          {
            ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this, ProtocolThreeThreeUI.this.aPq());
            if (this.joa != ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this))
            {
              this.joa = ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this);
              ProtocolThreeThreeUI.this.qb(ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this));
            }
          }
        };
        j.aOK().c(this.jme);
        x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.initModel, desc=Initializing the model behind the view, so anything that changes the model will notify the view. model : field_ssidmd5=%s, field_ssid=%s, field_url=%s, field_mid=%s, field_wifiType=%d, field_connectState=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), paramBundle.field_ssidmd5, paramBundle.field_ssid, paramBundle.field_url, paramBundle.field_mid, Integer.valueOf(paramBundle.field_wifiType), Integer.valueOf(paramBundle.field_connectState) });
        x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.initModel, desc=it initializes the front page. ", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
        break;
        j.aOK().c(paramBundle, new String[0]);
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jme != null) {
      j.aOK().d(this.jme);
    }
    this.jou.SO();
    j.aON().release();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected final void qb(int paramInt)
  {
    x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.onConnectStateChange, desc=it receives notifications whenever the connect state of model changes and then updates the view accordingly. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      return;
    case 4: 
      if (this.jnR != null) {
        this.jnR.dismiss();
      }
      this.jou.SO();
      this.jmC.setVisibility(4);
      this.jmS.setText(R.l.connect_state_wating);
      if (this.source == 3) {
        this.jmR.setText(getString(R.l.mig_connect_state_connecting_tips, new Object[] { this.ssid }));
      }
      for (;;)
      {
        x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toConnectStart, desc=it initializes the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
        return;
        this.jmR.setText(getString(R.l.connect_state_connecting_tips, new Object[] { this.ssid }));
      }
    case 1: 
      this.jmC.setVisibility(4);
      this.jmS.setText(R.l.connect_state_connecting_ing);
      this.jnR = h.a(this.mController.tml, getString(R.l.connect_state_connecting_ing), true, new ProtocolThreeThreeUI.9(this));
      x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      return;
    case 3: 
      if (this.jnR != null) {
        this.jnR.dismiss();
      }
      this.jou.SO();
      this.jmC.setVisibility(0);
      this.jmS.setText(R.l.free_wifi_re_connect);
      x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toFail, desc=connect failed.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      return;
    }
    if (this.jnR != null) {
      this.jnR.dismiss();
    }
    this.jou.SO();
    this.jmS.setText(R.l.connect_state_connected);
    this.jmS.setClickable(false);
    Intent localIntent = getIntent();
    localIntent.putExtra("free_wifi_appid", this.appId);
    localIntent.putExtra("free_wifi_app_nickname", this.jkJ);
    localIntent.putExtra("free_wifi_app_username", this.bPg);
    localIntent.putExtra("free_wifi_signature", this.signature);
    localIntent.putExtra("free_wifi_finish_actioncode", this.jnW);
    localIntent.putExtra("free_wifi_finish_url", this.jnX);
    if (bi.oW(this.jnY)) {
      localIntent.setClass(this, FreeWifiSuccUI.class);
    }
    for (;;)
    {
      finish();
      startActivity(localIntent);
      d.xP();
      x.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      return;
      localIntent.putExtra("free_wifi_qinghuai_url", this.jnY);
      localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/ProtocolThreeThreeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */