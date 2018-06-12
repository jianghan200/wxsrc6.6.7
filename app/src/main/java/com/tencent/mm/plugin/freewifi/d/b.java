package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.bnr;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class b
  extends c
{
  private static int jkw = 7200;
  public String mac;
  private String ssid;
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    aOR();
    this.ssid = paramString2;
    this.mac = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new cr();
    ((cr)localObject).ssid = paramString2;
    ((cr)localObject).mac = paramString1;
    ((cr)localObject).rcO = paramInt1;
    localLinkedList.add(localObject);
    localObject = (com.tencent.mm.protocal.c.ac)this.diG.dID.dIL;
    ((com.tencent.mm.protocal.c.ac)localObject).qZv = h.b.aNY().aNS();
    ((com.tencent.mm.protocal.c.ac)localObject).qZd = localLinkedList;
    ((com.tencent.mm.protocal.c.ac)localObject).qZw = m.aOi();
    ((com.tencent.mm.protocal.c.ac)localObject).qZx = paramInt2;
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "new apcheck request. mac = %s, ssid = %s, rssi = %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1) });
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new com.tencent.mm.protocal.c.ac();
    locala.dIH = new com.tencent.mm.protocal.c.ad();
    locala.uri = "/cgi-bin/mmo2o-bin/apcheck";
    locala.dIF = 1744;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "apcheck returns. onGYNetEnd : errType : %d, errCode : %d, errMsg : %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool;
    if ((this.diG != null) && (this.diG.dIE.dIL != null))
    {
      h.b.aNY().a((com.tencent.mm.protocal.c.ad)this.diG.dIE.dIL);
      if ((m.cC(paramInt2, paramInt3)) || (m.cD(paramInt2, paramInt3)))
      {
        paramString = (com.tencent.mm.protocal.c.ad)this.diG.dIE.dIL;
        paramInt1 = paramString.qZA;
        bool = paramString.qZz;
        if ((paramInt1 != 0) && (paramInt1 != i.a.aNZ().getInt("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", 7))) {
          i.a.aNZ().bo("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", paramInt1);
        }
        if (bool) {
          i.a.aNZ().C("LOCAL_CONFIG_LAST_APCHECK_SAVE_DELAY_CRD_TIMEMILLIS", System.currentTimeMillis());
        }
      }
    }
    paramString = j.aOK().Cg(this.ssid);
    if (paramString == null)
    {
      paramString = new com.tencent.mm.plugin.freewifi.g.c();
      paramString.field_ssidmd5 = com.tencent.mm.sdk.platformtools.ac.ce(this.ssid);
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        com.tencent.mm.protocal.c.ad localad = (com.tencent.mm.protocal.c.ad)this.diG.dIE.dIL;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = localad.qZl;
        bnr localbnr = localad.qZm;
        if (localbnr != null)
        {
          x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbnr.slK, localbnr.slL, localbnr.slM });
          paramString.field_showWordCn = localbnr.slL;
          paramString.field_showWordEn = localbnr.slK;
          paramString.field_showWordTw = localbnr.slM;
          paramString.field_action = localad.qZk;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (localad.qZu <= 0) {
            localad.qZu = jkw;
          }
          paramString.field_expiredTime = (bi.VE() + localad.qZu);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0) {
            break label472;
          }
          x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aOK().b(paramString)) });
          label407:
          j.aOK().Ch(this.ssid);
        }
      }
      label472:
      do
      {
        return;
        paramString.field_showWordCn = com.tencent.mm.sdk.platformtools.ad.getContext().getResources().getString(R.l.free_wifi_verified);
        paramString.field_showWordEn = com.tencent.mm.sdk.platformtools.ad.getContext().getResources().getString(R.l.free_wifi_verified);
        paramString.field_showWordTw = com.tencent.mm.sdk.platformtools.ad.getContext().getResources().getString(R.l.free_wifi_verified);
        break;
        x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aOK().c(paramString, new String[0])) });
        break label407;
        x.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      } while (paramInt1 != 0);
      bool = j.aOK().a(paramString, new String[0]);
      x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      return;
    }
  }
  
  public final int getType()
  {
    return 1744;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */