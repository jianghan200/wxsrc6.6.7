package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends e
  implements a
{
  private String eSH = this.intent.getStringExtra("free_wifi_passowrd");
  
  public f(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    x.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, desc=Data retrieved. password=%s", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.eSH });
  }
  
  public final void connect()
  {
    com.tencent.mm.plugin.freewifi.c localc = new com.tencent.mm.plugin.freewifi.c(this.ssid, this.jkG, this.eSH);
    j.aOI();
    j.aON().aOv().post(new f.1(this, localc));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */