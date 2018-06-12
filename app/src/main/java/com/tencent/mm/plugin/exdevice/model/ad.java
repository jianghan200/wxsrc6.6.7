package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Message;
import android.util.Base64;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.g.a.dd;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.plugin.exdevice.b.k;
import com.tencent.mm.plugin.exdevice.b.k.c;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class ad
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private ab iwh = new ab();
  private b iwi;
  private com.tencent.mm.plugin.exdevice.h.c iwj;
  private com.tencent.mm.plugin.exdevice.f.b.b.d iwk;
  private com.tencent.mm.plugin.exdevice.f.b.b.a iwl;
  private com.tencent.mm.plugin.exdevice.f.b.b.b iwm;
  private com.tencent.mm.plugin.exdevice.f.b.b.e iwn;
  private e iwo;
  private d iwp;
  private com.tencent.mm.plugin.exdevice.f.b.c iwq;
  private com.tencent.mm.plugin.exdevice.f.b.a iwr;
  private com.tencent.mm.plugin.exdevice.f.a.c iws;
  private com.tencent.mm.ak.a.a iwt = null;
  private com.tencent.mm.ak.a.a.c iwu = null;
  private af iwv;
  private h iww;
  private bv.a iwx = new bv.a()
  {
    public final void a(d.a paramAnonymousa)
    {
      if (ad.aHk() != null)
      {
        ad.aHk();
        paramAnonymousa = paramAnonymousa.dIN;
        x.i("MicroMsg.exdevice.ExDeviceWifiStatusMessageHandler", "parseMessageFromServer");
        localObject1 = com.tencent.mm.platformtools.ab.a(paramAnonymousa.rcl);
        if (!bi.oW((String)localObject1)) {
          break label75;
        }
        x.e("MicroMsg.exdevice.ExDeviceWifiStatusMessageHandler", "msg content is null");
      }
      int i;
      label75:
      do
      {
        do
        {
          do
          {
            i = 0;
            if (i == 0)
            {
              paramAnonymousa = com.tencent.mm.platformtools.ab.a(paramAnonymousa.rcl);
              if (!bi.oW(paramAnonymousa)) {
                break;
              }
              x.e("MicroMsg.exdevice.ExDeviceMessageService", "msg content is null");
            }
            return;
            localObject1 = bl.z((String)localObject1, "sysmsg");
          } while ((localObject1 == null) || (((Map)localObject1).size() <= 0));
          localObject2 = (String)((Map)localObject1).get(".sysmsg.$type");
        } while ((bi.oW((String)localObject2)) || (!((String)localObject2).equalsIgnoreCase("wcdevicemsg")));
        String str1 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.ToUserName");
        String str2 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.FromUserName");
        l = bi.getLong((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.CreateTime"), -1L);
        localObject2 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.MsgType");
        String str3 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceType");
        String str4 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceID");
        i = bi.getInt((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceStatus"), -1);
        x.i("MicroMsg.exdevice.ExDeviceWifiStatusMessageHandler", "parseMessageFromServer:tousr=" + str1 + ",fromuser=" + str2 + ",createtime=" + l + ",msgtype=" + (String)localObject2 + ",devicetype=" + str3 + ",deviceid=" + str4 + ",devicestatus=" + i);
        localObject1 = ad.aHe().Al(str4);
      } while ((localObject1 == null) || (!bi.oV(((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_connProto).contains("4")) || (!bi.oV((String)localObject2).contains("device_status")));
      if (i != 0)
      {
        ad.aHp();
        e.e(((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_url, 2, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_deviceID);
      }
      for (;;)
      {
        i = 1;
        break;
        ad.aHp();
        e.e(((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_url, 4, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_deviceID);
      }
      Object localObject1 = bl.z(paramAnonymousa, "sysmsg");
      if ((localObject1 == null) || (((Map)localObject1).size() <= 0))
      {
        x.e("MicroMsg.exdevice.ExDeviceMessageService", "receiveMessage, no sysmsg");
        return;
      }
      paramAnonymousa = (String)((Map)localObject1).get(".sysmsg.$type");
      if ((bi.oW(paramAnonymousa)) || (!paramAnonymousa.equalsIgnoreCase("wcdevicemsg")))
      {
        x.e("MicroMsg.exdevice.ExDeviceMessageService", "receiveMessage, type not wcdevicemsg");
        return;
      }
      paramAnonymousa = bi.oV((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.MsgType"));
      x.i("MicroMsg.exdevice.ExDeviceMessageService", "newXml wcdevicemsg msgType = %s", new Object[] { paramAnonymousa });
      if (paramAnonymousa.equals("device_relation"))
      {
        paramAnonymousa = new dd();
        paramAnonymousa.bKK.bKL = true;
        com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousa);
        return;
      }
      Object localObject2 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.Content");
      x.i("MicroMsg.exdevice.ExDeviceMessageService", "contentBase64 = %s", new Object[] { localObject2 });
      if (bi.oW((String)localObject2))
      {
        x.e("MicroMsg.exdevice.ExDeviceMessageService", "Fuck off: contentBase64 is null");
        return;
      }
      try
      {
        paramAnonymousa = Base64.decode((String)localObject2, 0);
        if (bi.bC(paramAnonymousa))
        {
          x.e("MicroMsg.exdevice.ExDeviceMessageService", "null == decodedContent");
          return;
        }
      }
      catch (Exception paramAnonymousa)
      {
        x.e("MicroMsg.exdevice.ExDeviceMessageService", "decode failed!!! %s", new Object[] { paramAnonymousa.getMessage() });
        x.printErrStackTrace("MicroMsg.exdevice.ExDeviceMessageService", paramAnonymousa, "", new Object[0]);
        return;
      }
      long l = bi.getLong((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.SessionID"), -1L);
      localObject1 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceID");
      x.i("MicroMsg.exdevice.ExDeviceMessageService", "------NewXml Receive------sessionId = %d, deviceId = %s, message content = %s, length = %d", new Object[] { Long.valueOf(l), localObject1, localObject2, Integer.valueOf(paramAnonymousa.length) });
      localObject1 = ad.aHe().Al((String)localObject1);
      if (localObject1 == null)
      {
        x.e("MicroMsg.exdevice.ExDeviceMessageService", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
        return;
      }
      if (0L == l)
      {
        paramAnonymousa = new com.tencent.mm.plugin.exdevice.i.g(paramAnonymousa, 0, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_mac);
        u.aHG().a(paramAnonymousa);
        return;
      }
      localObject1 = k.aGF();
      x.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Recivce sendDataToManufacturerResponse, sessionId = %d", new Object[] { Long.valueOf(l) });
      if (l >= 0L) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        localObject2 = new k.c((byte)0);
        ((k.c)localObject2).mSessionId = l;
        ((k.c)localObject2).hfA = paramAnonymousa;
        ((k)localObject1).mHandler.obtainMessage(3, localObject2).sendToTarget();
        return;
      }
    }
  };
  m.b iwy = new ad.9(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("HARDDEVICEINFO_TABLE".hashCode()), new ad.1());
    cVM.put(Integer.valueOf("HARDDEVICERANKINFO_TABLE".hashCode()), new ad.3());
    cVM.put(Integer.valueOf("HARDDEVICERANKFOLLOWINFO_TABLE".hashCode()), new ad.4());
    cVM.put(Integer.valueOf("HARDDEVICELIKEINFO_TABLE".hashCode()), new ad.5());
    cVM.put(Integer.valueOf("HARDDEVICECHAMPIONINFO_TABLE".hashCode()), new ad.6());
    cVM.put(Integer.valueOf("HARDDEVICERANKDETAILINFO_TABLE".hashCode()), new ad.7());
  }
  
  public ad()
  {
    if (this.iwp == null) {
      this.iwp = new d();
    }
    if (this.iwo == null) {
      this.iwo = new e();
    }
    x.i("MicroMsg.exdevice.SubCoreExDevice", "create SubCoreExDevice.");
    com.tencent.mm.sdk.b.a.sFg.b(this.iwo.itZ);
  }
  
  public static com.tencent.mm.ak.a.a.c Aa(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.exdevice.SubCoreExDevice", "newImageOptions failed, url is null or nil, return default.");
      paramString = aHd();
      if (paramString.iwu == null)
      {
        c.a locala = new c.a();
        com.tencent.mm.ak.o.Pk();
        locala.dXU = null;
        locala.dXF = 640;
        locala.dXE = 640;
        locala.dXw = false;
        locala.dXy = true;
        paramString.iwu = locala.Pt();
      }
      return aHd().iwu;
    }
    paramString = new c.a();
    paramString.dXF = 640;
    paramString.dXE = 640;
    paramString.dXw = false;
    paramString.dXx = true;
    au.HU();
    paramString.dXB = com.tencent.mm.model.c.Gb();
    return paramString.Pt();
  }
  
  private static ad aHd()
  {
    au.HN();
    ad localad2 = (ad)bs.iK("plugin.exdevice");
    ad localad1 = localad2;
    if (localad2 == null)
    {
      x.w("MicroMsg.exdevice.SubCoreExDevice", "not found in MMCore, new one");
      localad1 = new ad();
      au.HN().a("plugin.exdevice", localad1);
    }
    return localad1;
  }
  
  public static com.tencent.mm.plugin.exdevice.h.c aHe()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aHd().iwj == null)
    {
      ad localad = aHd();
      au.HU();
      localad.iwj = new com.tencent.mm.plugin.exdevice.h.c(com.tencent.mm.model.c.FO());
    }
    return aHd().iwj;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.d aHf()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aHd().iwk == null)
    {
      ad localad = aHd();
      au.HU();
      localad.iwk = new com.tencent.mm.plugin.exdevice.f.b.b.d(com.tencent.mm.model.c.FO());
    }
    return aHd().iwk;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.a aHg()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aHd().iwl == null)
    {
      ad localad = aHd();
      au.HU();
      localad.iwl = new com.tencent.mm.plugin.exdevice.f.b.b.a(com.tencent.mm.model.c.FO());
    }
    return aHd().iwl;
  }
  
  public static com.tencent.mm.ak.a.a aHh()
  {
    if (aHd().iwt == null) {
      aHd().iwt = com.tencent.mm.ak.o.Pj();
    }
    return aHd().iwt;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.b aHi()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aHd().iwm == null)
    {
      ad localad = aHd();
      au.HU();
      localad.iwm = new com.tencent.mm.plugin.exdevice.f.b.b.b(com.tencent.mm.model.c.FO());
    }
    return aHd().iwm;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.e aHj()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aHd().iwn == null)
    {
      ad localad = aHd();
      au.HU();
      localad.iwn = new com.tencent.mm.plugin.exdevice.f.b.b.e(com.tencent.mm.model.c.FO());
    }
    return aHd().iwn;
  }
  
  public static b aHk()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aHd().iwi == null) {
      aHd().iwi = new b();
    }
    return aHd().iwi;
  }
  
  public static d aHl()
  {
    if (aHd().iwp == null) {
      aHd().iwp = new d();
    }
    return aHd().iwp;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.c aHm()
  {
    if (aHd().iwq == null) {
      aHd().iwq = new com.tencent.mm.plugin.exdevice.f.b.c();
    }
    return aHd().iwq;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.a aHn()
  {
    if (aHd().iwr == null) {
      aHd().iwr = new com.tencent.mm.plugin.exdevice.f.b.a();
    }
    return aHd().iwr;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.a.c aHo()
  {
    if (aHd().iws == null) {
      aHd().iws = new com.tencent.mm.plugin.exdevice.f.a.c();
    }
    return aHd().iws;
  }
  
  public static e aHp()
  {
    if (aHd().iwo == null) {
      aHd().iwo = new e();
    }
    return aHd().iwo;
  }
  
  public static h aHq()
  {
    if (aHd().iww == null) {
      aHd().iww = new h();
    }
    return aHd().iww;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    au.HU();
    com.tencent.mm.model.c.FR().a(this.iwy);
    Object localObject = k.aGF();
    au.DF().a(538, (com.tencent.mm.ab.e)localObject);
    this.iwv = new af();
    com.tencent.mm.sdk.b.a.sFg.b(this.iwh);
    au.getSysCmdMsgExtension().a("wcdevicemsg", this.iwx, true);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itA);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itB);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itC);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itV);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itz);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().ity);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itD);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itE);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itF);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itW);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itG);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itH);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itI);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itK);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itJ);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itO);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itM);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itN);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itP);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itX);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().hdn);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itL);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itQ);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itR);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itS);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itT);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iug);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iuh);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iui);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iuk);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iuj);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iua);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iub);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iuc);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iud);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iue);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().iuf);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itY);
    com.tencent.mm.sdk.b.a.sFg.b(aHp().itZ);
    localObject = i.ivn;
    x.i("MicroMsg.exdevice.GetBoundDeviceLogic", "addSceneEndListener");
    au.DF().a(539, (com.tencent.mm.ab.e)localObject);
    com.tencent.mm.compatible.a.a.a(19, new a.a()
    {
      public final void run()
      {
        ad.a(ad.this);
      }
    });
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    au.HU();
    com.tencent.mm.model.c.FR().b(this.iwy);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itA);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itB);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itC);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itV);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itX);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itz);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().ity);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itD);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itE);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itF);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itW);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iug);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iuh);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iui);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iuk);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iuj);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iua);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iub);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iuc);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iud);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iue);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().iuf);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itH);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itY);
    com.tencent.mm.sdk.b.a.sFg.c(aHp().itZ);
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "releaseAllSharePreferences");
    Object localObject1 = com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localObject1 == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      localObject1 = u.aHF();
      x.i("MicroMsg.exdevice.ExdeviceInfoManager", "delAllDeviceAuthFlag");
      if (((f)localObject1).iyJ != null) {
        break label595;
      }
      x.e("MicroMsg.exdevice.ExdeviceInfoManager", "null == exdeviceInfoList");
    }
    for (;;)
    {
      localObject1 = k.aGF();
      au.DF().b(538, (com.tencent.mm.ab.e)localObject1);
      k.isJ = null;
      com.tencent.mm.sdk.b.a.sFg.c(this.iwh);
      au.getSysCmdMsgExtension().b("wcdevicemsg", this.iwx, true);
      com.tencent.mm.sdk.b.a.sFg.c(aHp().itG);
      if (aHd().iwi != null) {
        aHd();
      }
      localObject1 = i.ivn;
      x.i("MicroMsg.exdevice.GetBoundDeviceLogic", "removeSceneEndListener");
      au.DF().b(539, (com.tencent.mm.ab.e)localObject1);
      localObject1 = aHd().iwp;
      if ((((d)localObject1).itf == null) || (((d)localObject1).itf.isEmpty())) {
        break label660;
      }
      Object localObject2 = ((d)localObject1).itf.entrySet().iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((al)((Map.Entry)((Iterator)localObject2).next()).getValue()).SO();
      }
      if (((SharedPreferences)localObject1).edit().clear().commit()) {
        break;
      }
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().clear().commit() Failed!!!");
      break;
      label595:
      localObject1 = ((f)localObject1).iyJ.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        f.a locala = (f.a)((Map.Entry)localObject2).getValue();
        locala.iyN = false;
        ((Map.Entry)localObject2).setValue(locala);
      }
    }
    ((d)localObject1).itf.clear();
    label660:
    if (aHd().iwq != null)
    {
      localObject1 = aHd().iwq;
      au.DF().b(1042, (com.tencent.mm.ab.e)localObject1);
      au.DF().b(1041, (com.tencent.mm.ab.e)localObject1);
      au.DF().b(1043, (com.tencent.mm.ab.e)localObject1);
      au.DF().b(1040, (com.tencent.mm.ab.e)localObject1);
    }
    if (aHd().iwt != null) {
      aHd().iwt.detach();
    }
    localObject1 = this.iwv;
    com.tencent.mm.sdk.b.a.sFg.c(((af)localObject1).cXu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */