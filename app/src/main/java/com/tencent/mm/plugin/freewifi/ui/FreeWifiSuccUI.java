package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.u;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.c;

public class FreeWifiSuccUI
  extends MMActivity
  implements e
{
  private String bPS;
  private String bPg;
  private CheckBox hHb;
  private String jkJ;
  private TextView jnP;
  private int jnW;
  private String jnX;
  private View joc;
  private TextView jod;
  private View joe;
  private TextView jof;
  private View jog;
  private Button joh;
  private int joi;
  private boolean joj = false;
  private boolean jok = false;
  private String signature;
  
  private void aPJ()
  {
    if (this.jok) {
      return;
    }
    this.jok = true;
    if ((this.joj) && (!bi.oW(this.bPS)) && ((!com.tencent.mm.model.s.hf(this.bPg)) || (!com.tencent.mm.model.s.he(this.bPg))))
    {
      au.DF().a(1703, this);
      i locali = new i(this.bPS, getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_channel_id", 0), m.E(getIntent()));
      au.DF().a(locali, 0);
    }
    com.tencent.mm.plugin.freewifi.l.c(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), this.joj);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "onSceneEnd, scnee type = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    au.DF().b(1703, this);
  }
  
  public void finish()
  {
    super.finish();
    aPJ();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_succ_page;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.free_wifi_title);
    lD(false);
    this.joc = findViewById(R.h.free_wifi_succ_follow_outter);
    this.jod = ((TextView)findViewById(R.h.free_wifi_succ_follow_title_tv));
    this.hHb = ((CheckBox)findViewById(R.h.free_wifi_succ_follow_cb));
    this.joe = findViewById(R.h.free_wifi_succ_appdesc_outter);
    this.jof = ((TextView)findViewById(R.h.free_wifi_succ_appdesc_tv));
    this.jog = findViewById(R.h.free_wifi_succ_profile_outter);
    this.jnP = ((TextView)findViewById(R.h.free_wifi_succ_appname_tv));
    this.joh = ((Button)findViewById(R.h.connect_wifi_finish_btn));
    this.joh.setOnClickListener(new FreeWifiSuccUI.1(this));
    if ((bi.oW(this.bPS)) || (bi.oW(this.bPg)) || (bi.oW(this.jkJ)))
    {
      this.joc.setVisibility(8);
      this.joe.setVisibility(8);
      this.jog.setVisibility(8);
    }
    for (;;)
    {
      if (m.H(getIntent()) == 10)
      {
        final String str = q.deR.dfn;
        if ((!m.isEmpty(str)) && (!m.isEmpty(q.br(this.mController.tml))))
        {
          Button localButton = (Button)findViewById(R.h.free_wifi_succui_manufacturer_link);
          localButton.setText(String.format(getString(R.l.free_wifi_succ_manu_wording), new Object[] { q.br(this.mController.tml) }));
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", str);
              com.tencent.mm.bg.d.b(FreeWifiSuccUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
            }
          });
          localButton.setVisibility(0);
        }
      }
      return;
      if ((!com.tencent.mm.model.s.hf(this.bPg)) || (!com.tencent.mm.model.s.he(this.bPg))) {
        break;
      }
      com.tencent.mm.plugin.freewifi.l.b(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), true);
      this.joc.setVisibility(8);
      this.joe.setVisibility(8);
      this.jog.setVisibility(0);
      this.jnP.setText(this.jkJ);
      this.jog.setOnClickListener(new FreeWifiSuccUI.2(this));
    }
    com.tencent.mm.plugin.freewifi.l.b(com.tencent.mm.plugin.freewifi.model.d.aOB(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), false);
    this.jog.setVisibility(8);
    this.joc.setVisibility(0);
    if (bi.oW(this.signature))
    {
      this.joe.setVisibility(8);
      findViewById(R.h.free_wifi_succ_follow_item).setBackgroundColor(getResources().getColor(R.e.white));
      label477:
      this.jod.setText(getString(R.l.free_wifi_follow_tips, new Object[] { this.jkJ }));
      if (this.joi != 1) {
        break label563;
      }
      this.hHb.setChecked(true);
    }
    for (this.joj = true;; this.joj = false)
    {
      this.hHb.setOnCheckedChangeListener(new FreeWifiSuccUI.3(this));
      break;
      this.joe.setVisibility(0);
      this.jof.setText(this.signature);
      break label477;
      label563:
      this.hHb.setChecked(false);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.bPS = getIntent().getStringExtra("free_wifi_appid");
    this.jkJ = getIntent().getStringExtra("free_wifi_app_nickname");
    this.bPg = getIntent().getStringExtra("free_wifi_app_username");
    this.jnW = getIntent().getIntExtra("free_wifi_finish_actioncode", 0);
    this.jnX = getIntent().getStringExtra("free_wifi_finish_url");
    this.joi = getIntent().getIntExtra(e.c.thu, 0);
    this.signature = getIntent().getStringExtra("free_wifi_signature");
    x.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "get from intent, appid = %s, appNickName = %s, appUserName = %s, finishActionCode = %d, finishUrl = %s, signature = %s", new Object[] { this.bPS, this.jkJ, this.bPg, Integer.valueOf(this.jnW), this.jnX, this.signature });
    WifiInfo localWifiInfo = com.tencent.mm.plugin.freewifi.model.d.aOA();
    k.a locala = k.aOa();
    String str = localWifiInfo.getMacAddress();
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
    if (localWifiInfo != null)
    {
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
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiSuccUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */