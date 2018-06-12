package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;

public class FreeWifiPcUI
  extends MMActivity
{
  private String appId;
  private String bLe;
  private Button eGn;
  private String jkJ;
  private Button jmT;
  private String jmZ;
  private TextView jnP;
  private int jnQ;
  private p jnR = null;
  
  private void goBack()
  {
    Intent localIntent = new Intent();
    g.ezn.i(localIntent, this);
    finish();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_pc_front_page;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.free_wifi_title);
    setBackBtn(new FreeWifiPcUI.1(this));
    this.appId = getIntent().getStringExtra("free_wifi_appid");
    this.jnQ = getIntent().getIntExtra("ConstantsFreeWifi.FREE_WIFI_PC_ENCRYPTED_SHOPID", 0);
    this.bLe = getIntent().getStringExtra("ConstantsFreeWifi.FREE_WIFI_PC_TICKET");
    this.jkJ = getIntent().getStringExtra("free_wifi_app_nickname");
    this.jmZ = getIntent().getStringExtra("free_wifi_privacy_url");
    this.jnP = ((TextView)findViewById(R.h.free_wifi_pc_app_name_tv));
    this.eGn = ((Button)findViewById(R.h.free_wifi_pc_ok_btn));
    this.jnP.setText("由" + this.jkJ + "提供");
    this.eGn.setOnClickListener(new FreeWifiPcUI.2(this));
    this.jmT = ((Button)findViewById(R.h.free_wifi_pc_user_protocol_privacy_btn));
    this.jmT.setOnClickListener(new FreeWifiPcUI.3(this));
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
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiPcUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */