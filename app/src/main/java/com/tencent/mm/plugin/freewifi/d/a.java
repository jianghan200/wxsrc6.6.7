package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.aa;
import com.tencent.mm.protocal.c.ab;
import com.tencent.mm.protocal.c.bdp;
import com.tencent.mm.protocal.c.bnr;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.ep;
import com.tencent.mm.protocal.c.xq;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLDecoder;
import java.util.LinkedList;

public final class a
  extends c
{
  private static int jkw = 7200;
  private int bNI;
  private String mac;
  private String ssid;
  
  public a(String paramString1, int paramInt, String paramString2)
  {
    aOR();
    this.bNI = 4;
    aa localaa = (aa)this.diG.dID.dIL;
    localaa.qZc = 4;
    localaa.URL = paramString1;
    localaa.qZe = paramInt;
    localaa.qZf = paramString2;
    localaa.qZg = m.aOg();
    localaa.qZd = new LinkedList();
    paramString2 = new cr();
    paramString2.ssid = m.BS("MicroMsg.FreeWifi.NetSceneAPAuth");
    paramString2.mac = m.BT("MicroMsg.FreeWifi.NetSceneAPAuth");
    localaa.qZd.add(paramString2);
    localaa.qZh = m.BU("MicroMsg.FreeWifi.NetSceneAPAuth");
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "Constructing get front page request, HasMobile=%d, Ap_info[0].ssid=%s, Ap_info[0].mac=%s", new Object[] { Integer.valueOf(localaa.qZg), paramString2.ssid, paramString2.mac });
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opCode = %d, url = %s", new Object[] { Integer.valueOf(4), paramString1 });
  }
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    aOR();
    this.ssid = paramString3;
    this.mac = paramString2;
    this.bNI = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new cr();
    ((cr)localObject).ssid = paramString3;
    ((cr)localObject).mac = paramString2;
    ((cr)localObject).rcO = paramInt1;
    localLinkedList.add(localObject);
    localObject = (aa)this.diG.dID.dIL;
    ((aa)localObject).qZc = 1;
    ((aa)localObject).qZd = localLinkedList;
    ((aa)localObject).URL = paramString1;
    ((aa)localObject).qZe = paramInt2;
    ((aa)localObject).qZf = paramString4;
    ((aa)localObject).qZh = m.BU("MicroMsg.FreeWifi.NetSceneAPAuth");
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opcode = %d, mac = %s, ssid = %s, rssi = %d", new Object[] { Integer.valueOf(1), paramString2, paramString3, Integer.valueOf(paramInt1) });
  }
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7)
  {
    aOR();
    this.ssid = paramString2;
    this.mac = paramString3;
    aa localaa = (aa)this.diG.dID.dIL;
    String str = URLDecoder.decode(paramString5);
    localaa.qZc = 0;
    localaa.URL = paramString1;
    localaa.SSID = paramString2;
    localaa.qYZ = paramString4;
    localaa.qZa = str;
    localaa.qZb = paramString6;
    localaa.qZe = paramInt;
    localaa.qZf = paramString7;
    paramString7 = new LinkedList();
    cr localcr = new cr();
    localcr.ssid = paramString2;
    localcr.mac = paramString3;
    paramString7.add(localcr);
    localaa.qZd = paramString7;
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "url : %s, ssid : %s, mid : %s, mac : %s, apauthdata : %s, decoded apauthdata :%s,  token : %s", new Object[] { paramString1, paramString2, paramString4, paramString3, paramString5, str, paramString6 });
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new aa();
    locala.dIH = new ab();
    locala.uri = "/cgi-bin/micromsg-bin/apauth";
    locala.dIF = 640;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final String aOS()
  {
    ab localab = (ab)this.diG.dIE.dIL;
    if (localab != null) {
      return localab.qZi;
    }
    return null;
  }
  
  public final bdp aOT()
  {
    ab localab = (ab)this.diG.dIE.dIL;
    if (localab != null) {
      return localab.qZp;
    }
    return null;
  }
  
  public final boolean aOU()
  {
    ab localab = (ab)this.diG.dIE.dIL;
    if ((localab != null) && (localab.qZq != null)) {
      return localab.qZq.qZg == 1;
    }
    return false;
  }
  
  public final xq aOV()
  {
    ab localab = (ab)this.diG.dIE.dIL;
    if (localab != null) {
      return localab.qZq;
    }
    return null;
  }
  
  public final String aOW()
  {
    ab localab = (ab)this.diG.dIE.dIL;
    if (localab != null) {
      return localab.qZs;
    }
    return null;
  }
  
  public final String aOX()
  {
    ab localab = (ab)this.diG.dIE.dIL;
    if (localab != null) {
      return localab.qZt;
    }
    return null;
  }
  
  public final ep aOY()
  {
    ab localab = (ab)this.diG.dIE.dIL;
    if (localab != null) {
      return localab.qZr;
    }
    return null;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.bNI) });
    switch (this.bNI)
    {
    }
    label455:
    label509:
    label953:
    do
    {
      do
      {
        return;
      } while ((paramInt2 != 0) || (paramInt3 != 0));
      Object localObject = j.aOK().Cg(this.ssid);
      paramString = this.ssid;
      bnr localbnr;
      if (localObject == null)
      {
        bool = true;
        x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get freewifi by ssid :%s, is wifi info = null ? %b", new Object[] { paramString, Boolean.valueOf(bool) });
        paramInt1 = 0;
        paramString = (String)localObject;
        if (localObject == null)
        {
          paramInt1 = 1;
          paramString = new com.tencent.mm.plugin.freewifi.g.c();
          paramString.field_ssidmd5 = ac.ce(this.ssid);
        }
        paramString.field_wifiType = 1;
        localObject = (ab)this.diG.dIE.dIL;
        localbnr = ((ab)localObject).qZm;
        if (localbnr == null) {
          break label455;
        }
        x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbnr.slK, localbnr.slL, localbnr.slM });
        paramString.field_showWordCn = localbnr.slL;
        paramString.field_showWordEn = localbnr.slK;
      }
      for (paramString.field_showWordTw = localbnr.slM;; paramString.field_showWordTw = ad.getContext().getResources().getString(R.l.free_wifi_verified))
      {
        paramString.field_action = ((ab)localObject).qZk;
        paramString.field_verifyResult = 1;
        paramString.field_connectState = -1;
        if (((ab)localObject).qZu <= 0) {
          ((ab)localObject).qZu = jkw;
        }
        paramString.field_expiredTime = (bi.VE() + ((ab)localObject).qZu);
        paramString.field_showUrl = ((ab)localObject).qZl;
        paramString.field_action = ((ab)localObject).qZk;
        paramString.field_ssid = this.ssid;
        paramString.field_mac = this.mac;
        paramString.field_wifiType = 1;
        if (paramInt1 == 0) {
          break label509;
        }
        bool = j.aOK().b(paramString);
        x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(bool) });
        x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((ab)localObject).qZj), Integer.valueOf(((ab)localObject).qZk), ((ab)localObject).qZl });
        return;
        bool = false;
        break;
        paramString.field_showWordCn = ad.getContext().getResources().getString(R.l.free_wifi_verified);
        paramString.field_showWordEn = ad.getContext().getResources().getString(R.l.free_wifi_verified);
      }
      bool = j.aOK().c(paramString, new String[0]);
      x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "update local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((ab)localObject).qZj), Integer.valueOf(((ab)localObject).qZk), ((ab)localObject).qZl });
      return;
      localObject = j.aOK().Cg(this.ssid);
      paramInt1 = 0;
      paramString = (String)localObject;
      if (localObject == null)
      {
        paramInt1 = 1;
        paramString = new com.tencent.mm.plugin.freewifi.g.c();
        paramString.field_ssidmd5 = ac.ce(this.ssid);
      }
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        localObject = (ab)this.diG.dIE.dIL;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = ((ab)localObject).qZl;
        localbnr = ((ab)localObject).qZm;
        x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get resp info : %s, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Integer.valueOf(((ab)localObject).qZj), Integer.valueOf(((ab)localObject).qZk), ((ab)localObject).qZl });
        if (localbnr != null)
        {
          x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbnr.slK, localbnr.slL, localbnr.slM });
          paramString.field_showWordCn = localbnr.slL;
          paramString.field_showWordEn = localbnr.slK;
          paramString.field_showWordTw = localbnr.slM;
          paramString.field_action = ((ab)localObject).qZk;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (((ab)localObject).qZu <= 0) {
            ((ab)localObject).qZu = jkw;
          }
          paramString.field_expiredTime = (bi.VE() + ((ab)localObject).qZu);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0) {
            break label953;
          }
          x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aOK().b(paramString)) });
        }
        for (;;)
        {
          j.aOK().Ch(this.ssid);
          return;
          paramString.field_showWordCn = ad.getContext().getResources().getString(R.l.free_wifi_verified);
          paramString.field_showWordEn = ad.getContext().getResources().getString(R.l.free_wifi_verified);
          paramString.field_showWordTw = ad.getContext().getResources().getString(R.l.free_wifi_verified);
          break;
          x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aOK().c(paramString, new String[0])) });
        }
      }
      x.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
    } while (paramInt1 != 0);
    boolean bool = j.aOK().a(paramString, new String[0]);
    x.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
  }
  
  public final int getType()
  {
    return 640;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */