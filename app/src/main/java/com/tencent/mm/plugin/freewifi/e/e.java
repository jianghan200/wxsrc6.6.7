package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.x;

public class e
{
  protected String appId;
  protected String bIQ;
  protected int bxk;
  protected final Intent intent;
  protected FreeWifiFrontPageUI jkG;
  protected String jkH;
  protected int jkI;
  protected String jkJ;
  protected int source;
  protected String ssid;
  
  public e(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    this.jkG = paramFreeWifiFrontPageUI;
    this.intent = paramFreeWifiFrontPageUI.getIntent();
    this.ssid = this.intent.getStringExtra("free_wifi_ssid");
    this.jkH = this.intent.getStringExtra("free_wifi_url");
    this.bIQ = this.intent.getStringExtra("free_wifi_ap_key");
    this.source = this.intent.getIntExtra("free_wifi_source", 1);
    this.bxk = this.intent.getIntExtra("free_wifi_channel_id", 0);
    this.appId = this.intent.getStringExtra("free_wifi_appid");
    this.jkJ = this.intent.getStringExtra("free_wifi_app_nickname");
    this.jkI = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    x.i("MicroMsg.FreeWifi.ProtocolBase", "sessionKey=%s, step=%d, desc=Data retrieved. ssid=%s, fullUrl=%s, apKey=%s, source=%s, channelId=%d, appid=%s, appNickName=%s, protocolNumber=%d", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.ssid, this.jkH, this.bIQ, Integer.valueOf(this.source), Integer.valueOf(this.bxk), this.appId, this.jkJ, Integer.valueOf(this.jkI) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */