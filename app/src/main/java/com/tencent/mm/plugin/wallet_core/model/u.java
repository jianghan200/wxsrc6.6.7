package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.d.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.aa.a;
import java.util.Date;

public final class u
  extends c<sy>
  implements com.tencent.mm.ab.e
{
  private String btH = null;
  private sy pqV;
  
  public u()
  {
    this.sFo = sy.class.getName().hashCode();
  }
  
  private void bPf()
  {
    d locald = o.bPa();
    r localr = new r();
    localr.field_bulletin_scene = this.btH;
    if (!locald.b(localr, new String[0])) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletGetBulletinEventListener", "not bulletin data ");
    }
    for (;;)
    {
      this.pqV.bJX.run();
      this.pqV = null;
      return;
      this.pqV.cdP.cdQ = localr.field_bulletin_scene;
      this.pqV.cdP.content = localr.field_bulletin_content;
      this.pqV.cdP.url = localr.field_bulletin_url;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletGetBulletinEventListener", "NetSceneGetBannerInfo resp,errType = " + paramInt1 + ";errCode=" + paramInt2);
    g.Ek();
    g.Eh().dpP.b(385, this);
    g.Ek();
    g.Ei().DT().a(aa.a.sSp, Long.valueOf(new Date().getTime()));
    bPf();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */