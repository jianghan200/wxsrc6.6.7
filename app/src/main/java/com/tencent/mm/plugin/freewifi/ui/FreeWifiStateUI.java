package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
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
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
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
public abstract class FreeWifiStateUI
  extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  protected String bIQ;
  private int bLv = 1;
  protected String bPS;
  protected String bPg;
  protected int bxk;
  private final com.tencent.mm.ak.a.a.c dXk;
  protected String jkH;
  protected String jkJ;
  protected String jlY;
  protected FreeWifiNetworkReceiver jlZ;
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
  protected boolean jma = false;
  private al jmc = new al(new FreeWifiStateUI.1(this), false);
  private al jmd = new al(new FreeWifiStateUI.2(this), true);
  private j.a jme;
  private p jnR = null;
  protected int jnW;
  protected String jnX;
  protected String jnY;
  protected String signature;
  protected int source;
  protected String ssid;
  
  public FreeWifiStateUI()
  {
    c.a locala = new c.a();
    locala.dXw = true;
    locala.dXx = true;
    locala.dXN = R.g.free_wifi_icon_default;
    locala.dXW = true;
    locala.dXX = 0.0F;
    this.dXk = locala.Pt();
    this.jme = new FreeWifiStateUI.3(this);
  }
  
  private void aPv()
  {
    this.jlZ = new FreeWifiNetworkReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(this.jlZ, localIntentFilter);
  }
  
  private void goBack()
  {
    l.u(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.ezn.i(localIntent, this);
    finish();
  }
  
  protected abstract void Yz();
  
  public abstract void a(NetworkInfo.State paramState);
  
  protected abstract void aPp();
  
  protected abstract int aPq();
  
  protected final void aPs()
  {
    if (this.jlZ != null)
    {
      x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister wifi state change receiver");
      this.jlZ.jjY = null;
    }
  }
  
  protected final void aPt()
  {
    if (this.jlZ == null) {
      aPv();
    }
    this.jlZ.jjZ = this;
  }
  
  protected final void aPu()
  {
    if (this.jlZ != null)
    {
      x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister network changed receiver");
      this.jlZ.jjZ = null;
    }
  }
  
  protected final void aPw()
  {
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.jmc.J(60000L, 60000L);
      this.jmd.J(1000L, 1000L);
      x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "wifi is not enable, enable it");
      j.aON().aOv().post(new FreeWifiStateUI.7(this));
      return;
    }
    this.bLv = aPq();
    x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.bLv) });
    if (this.bLv != 2)
    {
      if (com.tencent.mm.plugin.freewifi.m.G(getIntent()) == 4) {
        this.jmc.J(30000L, 30000L);
      }
      for (;;)
      {
        this.jmd.J(1000L, 1000L);
        if (!com.tencent.mm.plugin.freewifi.model.d.BY(this.ssid)) {
          break label233;
        }
        x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.jma) });
        if (!this.jma) {
          break;
        }
        x.d("MicroMsg.FreeWifi.FreeWifiStateUI", "now it is authing");
        return;
        this.jmc.J(60000L, 60000L);
      }
      this.jmc.J(60000L, 60000L);
      this.jmd.J(1000L, 1000L);
      Yz();
      this.jma = true;
      return;
      label233:
      j.aON().aOv().post(new FreeWifiStateUI.8(this));
      return;
    }
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, this.bLv, getIntent());
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_front_page;
  }
  
  protected void initView()
  {
    setBackBtn(new FreeWifiStateUI.4(this));
    if (getIntent().getIntExtra("free_wifi_protocol_type", 0) == 1) {
      findViewById(R.h.user_protocol_phone_text).setVisibility(0);
    }
    this.jmP = ((ImageView)findViewById(R.h.free_wifi_app_logo_iv));
    this.jmQ = ((TextView)findViewById(R.h.free_wifi_welcomemsg_tv));
    this.jmR = ((TextView)findViewById(R.h.free_wifi_ssidname_tv));
    this.jmC = ((TextView)findViewById(R.h.free_wifi_connectfail_tv));
    this.jmS = ((Button)findViewById(R.h.connect_wifi_btn));
    this.jmS.setOnClickListener(new FreeWifiStateUI.5(this));
    this.jmT = ((Button)findViewById(R.h.user_protocol_privacy_btn));
    this.jmT.setOnClickListener(new FreeWifiStateUI.6(this));
    if (bi.oW(this.ssid))
    {
      this.jmR.setText(getString(R.l.free_wifi_ssid_empty_tips));
      this.jmS.setVisibility(4);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.bIQ = getIntent().getStringExtra("free_wifi_ap_key");
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
    switch (this.source)
    {
    default: 
      if (bi.oW(this.ssid)) {
        x.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      }
      break;
    case 2: 
    case 1: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      for (;;)
      {
        label234:
        initView();
        j.aOK().c(this.jme);
        l.s(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
        return;
        paramBundle = j.aOK().aPn();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.jlY = paramBundle.field_mid;
          this.jkH = paramBundle.field_url;
          x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.jlY, this.jkH });
          break;
        }
        x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bi.oW(this.ssid)) {
          break label377;
        }
        x.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      }
      label377:
      paramBundle = j.aOK().Cg(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = ac.ce(this.ssid);
        paramBundle.field_ssid = this.ssid;
      }
      break;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = this.jkH;
      paramBundle.field_mid = this.jlY;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      paramBundle.field_connectState = 1;
      if (i != 0)
      {
        j.aOK().b(paramBundle);
        break;
      }
      j.aOK().c(paramBundle, new String[0]);
      break;
      x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.jlY, Integer.valueOf(this.source) });
      break label234;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    j.aOK().d(this.jme);
    aPs();
    aPu();
    if (this.jlZ != null) {
      unregisterReceiver(this.jlZ);
    }
    this.jmc.SO();
    this.jmd.SO();
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
  
  protected final void ph(int paramInt)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      if (this.jnR != null) {
        this.jnR.dismiss();
      }
      this.jmC.setVisibility(4);
      this.jmS.setText(R.l.connect_state_wating);
      if (this.source == 3) {
        this.jmR.setText(getString(R.l.mig_connect_state_connecting_tips, new Object[] { this.ssid }));
      }
      break;
    }
    for (;;)
    {
      if (!bi.oW(this.bPS))
      {
        if (!bi.oW(this.jmX)) {
          this.jmQ.setText(this.jmX);
        }
        if (!bi.oW(this.jmW)) {
          o.Pj().a(this.jmW, this.jmP, this.dXk);
        }
      }
      label462:
      for (;;)
      {
        return;
        if (this.jnR != null) {
          this.jnR.dismiss();
        }
        this.jmc.SO();
        this.jmd.SO();
        this.jma = false;
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
          if (bi.oW(this.bPS)) {
            break label462;
          }
          if (!bi.oW(this.jmX)) {
            this.jmQ.setText(this.jmX);
          }
          if (bi.oW(this.jmW)) {
            break;
          }
          o.Pj().a(this.jmW, this.jmP, this.dXk);
          return;
          if (bi.oW(this.jmY)) {
            this.jmR.setText(getString(R.l.connect_state_connecting_default_tips));
          } else {
            this.jmR.setText(this.jmY);
          }
        }
      }
      if (this.jnR != null) {
        this.jnR.dismiss();
      }
      this.jmc.SO();
      this.jmd.SO();
      this.jmC.setVisibility(0);
      this.jmS.setText(R.l.free_wifi_re_connect);
      return;
      if (this.jnR != null) {
        this.jnR.dismiss();
      }
      this.jmc.SO();
      this.jmd.SO();
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
        return;
        localIntent.putExtra("free_wifi_qinghuai_url", this.jnY);
        localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
      }
      this.jmC.setVisibility(4);
      this.jmS.setText(R.l.connect_state_connecting_ing);
      this.jnR = h.a(this.mController.tml, getString(R.l.connect_state_connecting_ing), true, new FreeWifiStateUI.9(this));
      return;
      if (this.jnR != null) {
        this.jnR.dismiss();
      }
      this.jmc.SO();
      this.jmd.SO();
      this.jmC.setVisibility(0);
      this.jmS.setText(R.l.free_wifi_re_connect);
      return;
      if (bi.oW(this.jmY)) {
        this.jmR.setText(getString(R.l.connect_state_connecting_default_tips));
      } else {
        this.jmR.setText(this.jmY);
      }
    }
  }
  
  public final void qa(int paramInt)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    default: 
      return;
    }
    aPs();
    aPw();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */