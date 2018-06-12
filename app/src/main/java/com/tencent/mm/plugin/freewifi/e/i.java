package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends e
  implements a
{
  protected String bJT = this.jkZ.getQueryParameter("timestamp");
  private int jkT = 0;
  protected String jkW = this.jkZ.getQueryParameter("shopId");
  protected String jkX = this.jkZ.getQueryParameter("authUrl");
  protected String jkY = this.jkZ.getQueryParameter("extend");
  private Uri jkZ = Uri.parse(this.jla);
  private String jla = this.intent.getStringExtra("free_wifi_schema_uri");
  protected String sign = this.jkZ.getQueryParameter("sign");
  
  public i(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    this.appId = this.jkZ.getQueryParameter("appId");
    x.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=Data retrieved. schemaUri=%s, appid=%s, shopId=%s, authUrl=%s, extend=%s, timestamp=%s, sign=%s", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.jkZ, this.appId, this.jkW, this.jkX, this.jkY, this.bJT, this.sign });
  }
  
  protected final void aPk()
  {
    j.aON().aOv().post(new i.3(this));
  }
  
  public final void connect()
  {
    FreeWifiFrontPageUI.d locald;
    FreeWifiFrontPageUI.a locala;
    if (m.isEmpty(this.ssid))
    {
      x.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=it cannot get ssid, so it fails. ", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)) });
      localObject = this.jkG;
      locald = FreeWifiFrontPageUI.d.jnj;
      locala = new FreeWifiFrontPageUI.a();
      locala.jmI = m.a(this.jkI, k.b.jiJ, 32);
      ((FreeWifiFrontPageUI)localObject).a(locald, locala);
      return;
    }
    if (m.isEmpty(this.jkX))
    {
      x.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=authurl is empty, so it fails. ", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)) });
      localObject = this.jkG;
      locald = FreeWifiFrontPageUI.d.jnj;
      locala = new FreeWifiFrontPageUI.a();
      locala.jmI = m.a(this.jkI, k.b.jiJ, 32);
      ((FreeWifiFrontPageUI)localObject).a(locald, locala);
      return;
    }
    Object localObject = new StringBuilder(this.jkX);
    if (this.jkX.indexOf("?") == -1) {
      ((StringBuilder)localObject).append("?extend=").append(this.jkY);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      j.aON().aOv().post(new i.1(this, (String)localObject));
      return;
      ((StringBuilder)localObject).append("&extend=").append(this.jkY);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */