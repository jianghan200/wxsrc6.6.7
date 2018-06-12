package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends e
  implements a
{
  private String jkS = this.intent.getStringExtra("free_wifi_portal_ap_info_authurl_with_params");
  private int jkT = 0;
  
  public h(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    x.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, desc=Data retrieved. authUrlWithParams=%s", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.jkS });
  }
  
  private void ai(int paramInt, String paramString)
  {
    Object localObject = k.aOa();
    ((k.a)localObject).ssid = this.ssid;
    ((k.a)localObject).bssid = m.BT("MicroMsg.FreeWifi.ProtocolThreeOne");
    ((k.a)localObject).bIR = m.BU("MicroMsg.FreeWifi.ProtocolThreeOne");
    ((k.a)localObject).bIQ = this.bIQ;
    ((k.a)localObject).jic = this.appId;
    ((k.a)localObject).jid = m.E(this.intent);
    ((k.a)localObject).jie = 31;
    ((k.a)localObject).jif = k.b.jiG.jiQ;
    ((k.a)localObject).jig = k.b.jiG.name;
    ((k.a)localObject).result = paramInt;
    ((k.a)localObject).hKX = paramString;
    ((k.a)localObject).bVU = m.H(this.intent);
    paramString = ((k.a)localObject).aOc();
    localObject = this.intent;
    if (paramInt != 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramString.b((Intent)localObject, bool).aOb();
      return;
    }
  }
  
  public final void connect()
  {
    x.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.connect, desc=it starts connecting wifi by protocol 3.1. authUrlWithParams=%s", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.jkS });
    final String str = this.jkS;
    j.aON().aOv().post(new Runnable()
    {
      public final void run()
      {
        x.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.E(h.this.intent), Integer.valueOf(m.F(h.this.intent)), str });
        com.tencent.mm.plugin.freewifi.a.a.aOj();
        com.tencent.mm.plugin.freewifi.a.a.a(str, new h.1.1(this));
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */