package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.u;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
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
import java.net.HttpURLConnection;

@Deprecated
public class ProtocolThreeOneUI
  extends MMActivity
{
  private boolean bBc = false;
  private String bIQ;
  private String bLe;
  private int bLv = 1;
  protected String bPS;
  protected String bPg;
  protected int bxk;
  private final com.tencent.mm.ak.a.a.c dXk;
  private Intent intent;
  protected String jkH;
  protected String jkJ;
  private String jkS;
  private int jkT = 0;
  protected String jlY;
  private TextView jmC;
  private ImageView jmP;
  private TextView jmQ;
  private TextView jmR;
  private Button jmS;
  private Button jmT;
  protected String jmW;
  protected String jmX;
  protected String jmY;
  protected String jmZ;
  private j.a jme;
  private p jnR;
  protected int jnW;
  protected String jnX;
  protected String jnY;
  private al jou = new al(new ProtocolThreeOneUI.1(this), false);
  protected String signature;
  protected int source;
  protected String ssid;
  
  public ProtocolThreeOneUI()
  {
    c.a locala = new c.a();
    locala.dXw = true;
    locala.dXx = true;
    locala.dXN = R.g.free_wifi_icon_default;
    locala.dXW = true;
    locala.dXX = 0.0F;
    this.dXk = locala.Pt();
  }
  
  private void ai(int paramInt, String paramString)
  {
    k.a locala = k.aOa();
    locala.ssid = this.ssid;
    locala.bssid = com.tencent.mm.plugin.freewifi.m.BT("MicroMsg.FreeWifi.Protocol31UI");
    locala.bIR = com.tencent.mm.plugin.freewifi.m.BU("MicroMsg.FreeWifi.Protocol31UI");
    locala.bIQ = this.bIQ;
    locala.jic = this.bPS;
    locala.jid = com.tencent.mm.plugin.freewifi.m.E(this.intent);
    locala.jie = com.tencent.mm.plugin.freewifi.m.G(this.intent);
    locala.jif = k.b.jiG.jiQ;
    locala.jig = k.b.jiG.name;
    locala.result = paramInt;
    locala.hKX = paramString;
    locala.bVU = com.tencent.mm.plugin.freewifi.m.H(this.intent);
    locala.jih = this.bPg;
    locala.aOc().aOb();
  }
  
  private void goBack()
  {
    l.u(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.ezn.i(localIntent, this);
    finish();
  }
  
  protected final int aPq()
  {
    if (bi.oW(this.ssid)) {
      x.d("MicroMsg.FreeWifi.Protocol31UI", "Illegal SSID");
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
    this.bLv = aPq();
    x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connect, desc=it starts connecting wifi by protocol 3.1. current connect state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), com.tencent.mm.plugin.freewifi.model.d.pZ(this.bLv) });
    if (this.bLv != 2)
    {
      this.jou.J(15000L, 15000L);
      x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connect, desc=it starts connectTimeoutHandler. timeout=%d s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), Integer.valueOf(60) });
      String str = this.jkS;
      j.aON().aOv().post(new ProtocolThreeOneUI.6(this, str));
      return;
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
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.jlY = getIntent().getStringExtra("free_wifi_mid");
    this.jkH = getIntent().getStringExtra("free_wifi_url");
    this.source = getIntent().getIntExtra("free_wifi_source", 1);
    this.bxk = getIntent().getIntExtra("free_wifi_channel_id", 0);
    this.bPS = getIntent().getStringExtra("free_wifi_appid");
    this.jmW = getIntent().getStringExtra("free_wifi_head_img_url");
    this.jmX = getIntent().getStringExtra("free_wifi_welcome_msg");
    this.jmY = getIntent().getStringExtra("free_wifi_welcome_sub_title");
    this.jmZ = getIntent().getStringExtra("free_wifi_privacy_url");
    this.jkJ = getIntent().getStringExtra("free_wifi_app_nickname");
    x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initView, desc=Initializing the view. ssid=%s, mid=%s, fullUrl=%s, source=%d, channel=%d, appid=%s, headImgUrl=%s, welcomeMsg=%s, privacyUrl=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), this.ssid, this.jlY, this.jkH, Integer.valueOf(this.source), Integer.valueOf(this.bxk), this.bPS, this.jmW, this.jmX, this.jmZ });
    setBackBtn(new ProtocolThreeOneUI.2(this));
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
        l.t(com.tencent.mm.plugin.freewifi.model.d.aOB(), ProtocolThreeOneUI.this.getIntent().getStringExtra("free_wifi_ap_key"), ProtocolThreeOneUI.this.getIntent().getIntExtra("free_wifi_protocol_type", 0));
        int i = ProtocolThreeOneUI.this.aPq();
        x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(ProtocolThreeOneUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.pZ(i) });
        if (i == 2)
        {
          ProtocolThreeOneUI.this.finish();
          return;
        }
        com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeOneUI.this.ssid, 1, ProtocolThreeOneUI.this.getIntent());
        ProtocolThreeOneUI.this.connect();
      }
    });
    this.jmT = ((Button)findViewById(R.h.user_protocol_privacy_btn));
    this.jmT.setOnClickListener(new ProtocolThreeOneUI.4(this));
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
    this.intent = getIntent();
    this.bIQ = getIntent().getStringExtra("free_wifi_ap_key");
    this.bLe = getIntent().getStringExtra("free_wifi_schema_ticket");
    this.jkS = getIntent().getStringExtra("free_wifi_portal_ap_info_authurl_with_params");
    x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.onCreate, desc=it goes into Protocol31 connect frontpage. apKey=%s, ticket=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), this.bIQ, this.bLe });
    initView();
    if (bi.oW(this.ssid))
    {
      x.e("MicroMsg.FreeWifi.Protocol31UI", "ssid is null");
      l.s(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
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
      paramBundle.field_url = this.jkH;
      paramBundle.field_mid = this.jlY;
      paramBundle.field_wifiType = 3;
      paramBundle.field_connectState = 1;
      if (i != 0) {
        j.aOK().b(paramBundle);
      }
      for (;;)
      {
        x.i("MicroMsg.FreeWifi.Protocol31UI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.jlY, Integer.valueOf(this.source) });
        this.jme = new ProtocolThreeOneUI.5(this);
        j.aOK().c(this.jme);
        x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initModel, desc=Initializing the model behind the view, so anything that changes the model will notify the view. model : field_ssidmd5=%s, field_ssid=%s, field_url=%s, field_mid=%s, field_wifiType=%d, field_connectState=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), paramBundle.field_ssidmd5, paramBundle.field_ssid, paramBundle.field_url, paramBundle.field_mid, Integer.valueOf(paramBundle.field_wifiType), Integer.valueOf(paramBundle.field_connectState) });
        x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initModel, desc=it initializes the front page. ", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
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
    x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.onConnectStateChange, desc=it receives notifications whenever the connect state of model changes and then updates the view accordingly. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())), Integer.valueOf(paramInt) });
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
      if ((com.tencent.mm.plugin.freewifi.m.H(getIntent()) == 10) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(q.deR.dfn)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(q.br(this.mController.tml)))) {
        this.jmS.setText(String.format(getString(R.l.free_wifi_connect_btn_manu_wording), new Object[] { q.br(this.mController.tml) }));
      }
      if (this.source == 3) {
        this.jmR.setText(getString(R.l.mig_connect_state_connecting_tips, new Object[] { this.ssid }));
      }
      for (;;)
      {
        if (!bi.oW(this.bPS))
        {
          if (!bi.oW(this.jkJ)) {
            this.jmQ.setText(this.jkJ);
          }
          if (!bi.oW(this.jmW)) {
            o.Pj().a(this.jmW, this.jmP, this.dXk);
          }
        }
        x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toConnectStart, desc=it initializes the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
        return;
        if (bi.oW(this.jmY)) {
          this.jmR.setText(getString(R.l.connect_state_connecting_default_tips));
        } else {
          this.jmR.setText(this.jmY);
        }
      }
    case 1: 
      this.jmC.setVisibility(4);
      this.jmS.setText(R.l.connect_state_connecting_ing);
      this.jnR = h.a(this.mController.tml, getString(R.l.connect_state_connecting_ing), true, new ProtocolThreeOneUI.9(this));
      x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      return;
    case 3: 
      if (this.jnR != null) {
        this.jnR.dismiss();
      }
      this.jou.SO();
      this.jmC.setVisibility(0);
      this.jmS.setText(R.l.free_wifi_re_connect);
      x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toFail, desc=connect failed.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      return;
    }
    if (this.jnR != null) {
      this.jnR.dismiss();
    }
    this.jou.SO();
    this.jmS.setText(R.l.connect_state_connected);
    this.jmS.setClickable(false);
    Intent localIntent = getIntent();
    localIntent.putExtra("free_wifi_appid", this.bPS);
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
      x.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.E(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.F(getIntent())) });
      return;
      localIntent.putExtra("free_wifi_qinghuai_url", this.jnY);
      localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/ProtocolThreeOneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */