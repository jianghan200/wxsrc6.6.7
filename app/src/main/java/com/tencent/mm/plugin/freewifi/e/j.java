package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends e
  implements a
{
  String bJT = this.intent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_TIMESTAMP");
  private com.tencent.mm.plugin.freewifi.a jkN;
  private int jkT = 0;
  String jle = this.intent.getStringExtra("free_wifi_tid");
  String openId = this.intent.getStringExtra("free_wifi_openid");
  String sign = this.intent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_SIGN");
  
  public j(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    x.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, desc=Data retrieved. openId=%s, tid=%s, timestamp=%s, sign=%s", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.openId, this.jle, this.bJT, this.sign });
  }
  
  private void aj(int paramInt, String paramString)
  {
    k.a locala = k.aOa();
    locala.ssid = this.ssid;
    locala.bssid = m.BT("MicroMsg.FreeWifi.Protocol32");
    locala.bIR = m.BU("MicroMsg.FreeWifi.Protocol32");
    locala.bIQ = this.bIQ;
    locala.jic = this.appId;
    locala.jid = m.E(this.intent);
    locala.jie = 32;
    locala.jif = k.b.jiH.jiQ;
    locala.jig = k.b.jiH.name;
    locala.result = paramInt;
    locala.hKX = paramString;
    locala.bVU = m.H(this.intent);
    locala.aOc().aOb();
  }
  
  public final void connect()
  {
    this.jkN = new com.tencent.mm.plugin.freewifi.a(this.ssid, this.jkG);
    com.tencent.mm.plugin.freewifi.model.j.aON().aOv().post(new Runnable()
    {
      public final void run()
      {
        j.a(j.this);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */