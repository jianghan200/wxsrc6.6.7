package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.bnr;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.ep;
import com.tencent.mm.protocal.c.zr;
import com.tencent.mm.protocal.c.zs;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends c
{
  private static int jkw = 7200;
  private String mac;
  private String ssid;
  
  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    aOR();
    this.ssid = paramString1;
    this.mac = paramString2;
    cr localcr = new cr();
    localcr.mac = paramString2;
    localcr.ssid = paramString1;
    paramString1 = (zr)this.diG.dID.dIL;
    paramString1.appId = paramString3;
    paramString1.jkW = paramString4;
    paramString1.jkX = paramString5;
    paramString1.jkY = paramString6;
    paramString1.bJT = paramString7;
    paramString1.sign = paramString8;
    paramString1.rFz = localcr;
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new zr();
    locala.dIH = new zs();
    locala.uri = "/cgi-bin/mmo2o-bin/getbackpagefor33";
    locala.dIF = 1726;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final ep aOY()
  {
    return ((zs)this.diG.dIE.dIL).jng;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    paramString = j.aOK().Cg(this.ssid);
    if (paramString == null)
    {
      paramString = new com.tencent.mm.plugin.freewifi.g.c();
      paramString.field_ssidmd5 = ac.ce(this.ssid);
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        zs localzs = (zs)this.diG.dIE.dIL;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = localzs.qZl;
        bnr localbnr = localzs.qZm;
        if (localbnr != null)
        {
          x.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "en : %s, cn : %s, tw : %s", new Object[] { localbnr.slK, localbnr.slL, localbnr.slM });
          paramString.field_showWordCn = localbnr.slL;
          paramString.field_showWordEn = localbnr.slK;
          paramString.field_showWordTw = localbnr.slM;
          paramString.field_action = localzs.qZk;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (localzs.qZu <= 0) {
            localzs.qZu = jkw;
          }
          paramString.field_expiredTime = (bi.VE() + localzs.qZu);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0) {
            break label315;
          }
          x.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aOK().b(paramString)) });
          label250:
          j.aOK().Ch(this.ssid);
        }
      }
      label315:
      do
      {
        return;
        paramString.field_showWordCn = ad.getContext().getResources().getString(R.l.free_wifi_verified);
        paramString.field_showWordEn = ad.getContext().getResources().getString(R.l.free_wifi_verified);
        paramString.field_showWordTw = ad.getContext().getResources().getString(R.l.free_wifi_verified);
        break;
        x.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aOK().c(paramString, new String[0])) });
        break label250;
        x.e("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      } while (paramInt1 != 0);
      boolean bool = j.aOK().a(paramString, new String[0]);
      x.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      return;
    }
  }
  
  public final int getType()
  {
    return 1726;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */