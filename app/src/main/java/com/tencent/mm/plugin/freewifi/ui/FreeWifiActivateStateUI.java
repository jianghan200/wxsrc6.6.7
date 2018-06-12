package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

@Deprecated
public abstract class FreeWifiActivateStateUI
  extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  private int bLv = 1;
  protected int bxk;
  protected String jkH;
  private FreeWifiStateView jlT;
  private TextView jlU;
  private TextView jlV;
  private Button jlW;
  protected Button jlX;
  protected String jlY;
  protected FreeWifiNetworkReceiver jlZ;
  protected boolean jma = false;
  private boolean jmb = false;
  private al jmc = new al(new al.a()
  {
    public final boolean vD()
    {
      if (!bi.oW(FreeWifiActivateStateUI.this.ssid))
      {
        FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this, FreeWifiActivateStateUI.this.aPq());
        x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now auth time out, ssid is %s, the connect state is %d", new Object[] { FreeWifiActivateStateUI.this.ssid, Integer.valueOf(FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this)) });
        FreeWifiActivateStateUI.b(FreeWifiActivateStateUI.this).SO();
        if (FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this) != 2)
        {
          FreeWifiActivateStateUI.this.aPu();
          FreeWifiActivateStateUI.this.aPs();
          com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateStateUI.this.ssid, 3, FreeWifiActivateStateUI.this.getIntent());
        }
      }
      return false;
    }
  }, false);
  private al jmd = new al(new FreeWifiActivateStateUI.2(this), true);
  private j.a jme = new FreeWifiActivateStateUI.3(this);
  protected int source;
  protected String ssid;
  
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
    finish();
    if (getIntent().getBooleanExtra("free_wifi_jump_to_main_ui", false))
    {
      Intent localIntent = new Intent();
      g.ezn.i(localIntent, this);
    }
  }
  
  protected abstract void Yz();
  
  protected abstract void aPp();
  
  protected abstract int aPq();
  
  protected final void aPs()
  {
    if (this.jlZ != null)
    {
      x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister wifi state change receiver");
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
      x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister network changed receiver");
      this.jlZ.jjZ = null;
    }
  }
  
  protected final void aPw()
  {
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.jmc.J(60000L, 60000L);
      this.jmd.J(1000L, 1000L);
      x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "wifi is not enable, enable it");
      j.aON().aOv().post(new FreeWifiActivateStateUI.7(this));
      return;
    }
    this.bLv = aPq();
    x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.bLv) });
    if (this.bLv != 2)
    {
      this.jmc.J(60000L, 60000L);
      this.jmd.J(1000L, 1000L);
      if (com.tencent.mm.plugin.freewifi.model.d.BY(this.ssid))
      {
        x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.jma) });
        if (this.jma)
        {
          x.d("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now it is authing");
          return;
        }
        this.jmc.J(60000L, 60000L);
        this.jmd.J(1000L, 1000L);
        Yz();
        this.jma = true;
        return;
      }
      j.aON().aOv().post(new FreeWifiActivateStateUI.8(this));
      return;
    }
    ph(this.bLv);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_state;
  }
  
  protected void initView()
  {
    setBackBtn(new FreeWifiActivateStateUI.4(this));
    this.jlT = ((FreeWifiStateView)findViewById(R.h.free_wifi_connect_state_iv));
    this.jlU = ((TextView)findViewById(R.h.free_wifi_connect_state_tv));
    this.jlV = ((TextView)findViewById(R.h.free_wifi_connect_tips));
    if (this.source == 3) {
      this.jlV.setText(getString(R.l.mig_connect_state_connecting_tips, new Object[] { this.ssid }));
    }
    for (;;)
    {
      this.jlW = ((Button)findViewById(R.h.re_scan_qrcode));
      this.jlW.setOnClickListener(new FreeWifiActivateStateUI.5(this));
      this.jlX = ((Button)findViewById(R.h.help_btn));
      this.jlX.setOnClickListener(new FreeWifiActivateStateUI.6(this));
      return;
      this.jlV.setText(getString(R.l.connect_state_connecting_tips, new Object[] { this.ssid }));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.jlY = getIntent().getStringExtra("free_wifi_mid");
    this.jkH = getIntent().getStringExtra("free_wifi_url");
    this.source = getIntent().getIntExtra("free_wifi_source", 1);
    this.bxk = getIntent().getIntExtra("free_wifi_channel_id", 0);
    switch (this.source)
    {
    default: 
      if (bi.oW(this.ssid)) {
        x.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      }
      break;
    case 2: 
    case 1: 
    case 3: 
    case 4: 
    case 5: 
      for (;;)
      {
        label134:
        initView();
        j.aOK().c(this.jme);
        return;
        paramBundle = j.aOK().aPn();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.jlY = paramBundle.field_mid;
          this.jkH = paramBundle.field_url;
          x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.jlY, this.jkH });
          break;
        }
        x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bi.oW(this.ssid)) {
          break label252;
        }
        x.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      }
      label252:
      paramBundle = j.aOK().Cg(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = ac.ce(this.ssid);
        paramBundle.field_ssid = this.ssid;
        paramBundle.field_connectState = 1;
      }
      break;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = this.jkH;
      paramBundle.field_mid = this.jlY;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      if (i != 0)
      {
        j.aOK().b(paramBundle);
        break;
      }
      j.aOK().c(paramBundle, new String[0]);
      break;
      x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.jlY, Integer.valueOf(this.source) });
      break label134;
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
  
  protected void onResume()
  {
    super.onResume();
    if (!bi.oW(this.ssid)) {
      aPw();
    }
  }
  
  protected final void ph(int paramInt)
  {
    this.jlT.setOnClickListener(null);
    x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      this.jlT.setImageResource(R.g.free_wifi_state_normal);
      this.jlU.setText(R.l.connect_state_connecting);
      if (this.source == 3) {
        this.jlV.setText(getString(R.l.mig_connect_state_connecting_tips, new Object[] { this.ssid }));
      }
      break;
    }
    for (;;)
    {
      this.jlW.setVisibility(8);
      return;
      this.jlT.setImageResource(R.g.free_wifi_state_normal);
      this.jlT.setState(3);
      this.jlT.iCE = 2;
      this.jlU.setText(R.l.connect_state_failed);
      this.jlW.setVisibility(0);
      this.jlW.setText(R.l.free_wifi_re_connect);
      this.jmc.SO();
      this.jmd.SO();
      return;
      this.jlT.setImageResource(R.g.free_wifi_state_connected);
      this.jlT.setState(2);
      this.jlU.setText(R.l.connect_state_connected);
      this.jlW.setVisibility(0);
      this.jlW.setText(R.l.free_wifi_back);
      this.jmc.SO();
      this.jmd.SO();
      if ((this.source == 1) || (this.source == 5) || (this.source == 4))
      {
        this.jlW.setVisibility(4);
        com.tencent.mm.plugin.freewifi.g.c localc = j.aOK().Cg(this.ssid);
        if ((localc != null) && (!bi.oW(localc.field_showUrl)) && (!this.jmb))
        {
          this.jmb = true;
          ah.i(new FreeWifiActivateStateUI.9(this, localc), 1000L);
        }
      }
      d.xP();
      return;
      this.jlT.setImageResource(R.g.free_wifi_state_normal);
      this.jlT.setState(1);
      this.jlU.setText(R.l.connect_state_connecting);
      continue;
      this.jmc.SO();
      this.jmd.SO();
      this.jlT.setImageResource(R.g.free_wifi_state_illegal_ap);
      this.jlT.setState(3);
      this.jlU.setText(R.l.free_wifi_illegal_ap_tile);
      this.jlU.setVisibility(0);
      this.jlV.setText(R.l.free_wifi_illegal_ap_tips);
      this.jlV.setVisibility(0);
      continue;
      this.jlV.setText(getString(R.l.connect_state_connecting_tips, new Object[] { this.ssid }));
    }
  }
  
  public final void qa(int paramInt)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiActivateStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */