package com.tencent.mm.plugin.ipcall.a;

import android.content.Context;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.b.a;
import com.tencent.mm.plugin.ipcall.a.g.j;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;
import java.util.Map;

public final class i
  implements ar
{
  private static i koM = null;
  private static HashMap<Integer, h.d> kpf;
  private g koN = new g();
  private com.tencent.mm.plugin.ipcall.a.c.a koO = new com.tencent.mm.plugin.ipcall.a.c.a();
  private com.tencent.mm.plugin.ipcall.a.c.b koP = new com.tencent.mm.plugin.ipcall.a.c.b();
  private com.tencent.mm.plugin.ipcall.a.b.b koQ = new com.tencent.mm.plugin.ipcall.a.b.b();
  private f koR = new f();
  private com.tencent.mm.plugin.ipcall.c koS = new com.tencent.mm.plugin.ipcall.c();
  private com.tencent.mm.plugin.ipcall.a.g.d koT;
  private l koU;
  private j koV;
  private com.tencent.mm.plugin.ipcall.a.g.h koW;
  private com.tencent.mm.plugin.voip.video.i koX;
  private com.tencent.mm.plugin.voip.video.d koY;
  private Context koZ;
  private long kpa;
  private com.tencent.mm.sdk.b.c kpb = new i.1(this);
  private com.tencent.mm.sdk.b.c kpc = new i.4(this);
  private com.tencent.mm.sdk.b.c kpd = new i.5(this);
  private com.tencent.mm.sdk.b.c kpe = new i.6(this);
  private bv.a kpg = new i.11(this);
  private bv.a kph = new bv.a()
  {
    public final void a(d.a paramAnonymousa)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreIPCall", "WeChatOutMsg onRecieveMsg");
      Object localObject = paramAnonymousa.dIN;
      paramAnonymousa = ab.a(paramAnonymousa.dIN.rcl);
      if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, msgContent is null");
        return;
      }
      paramAnonymousa = bl.z(paramAnonymousa, "sysmsg");
      if (paramAnonymousa == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, values is null");
        return;
      }
      com.tencent.mm.plugin.ipcall.a.g.h localh = i.aXy();
      long l = ((by)localObject).rci;
      int i;
      if (paramAnonymousa != null)
      {
        localObject = new com.tencent.mm.plugin.ipcall.a.g.g();
        ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId = l;
        ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Title"));
        if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title == null) {
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = "";
        }
        ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Content"));
        if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content == null) {
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = "";
        }
        i = bi.getInt((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.MsgType"), 0);
        ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType = i;
        ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime = bi.getLong((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.PushTime"), 0L);
        ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.DescUrl"));
        if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl == null) {
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = "";
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallMsgStorage", "insertNewXml svrId:%s,title:%s,content:%s,msgType:%s,pushTime:%s,descUrl=%s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl });
        localh.b((com.tencent.mm.sdk.e.c)localObject);
      }
      for (;;)
      {
        if (i != -1)
        {
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRl, Integer.valueOf(i));
        }
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sRk, Boolean.valueOf(true));
        com.tencent.mm.plugin.report.service.h.mEJ.h(13254, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(i), Integer.valueOf(-1) });
        return;
        i = -1;
      }
    }
  };
  private bv.a kpi = new i.3(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    kpf = localHashMap;
    localHashMap.put(Integer.valueOf("IPCallAddressItem".hashCode()), new i.7());
    kpf.put(Integer.valueOf("IPCallRecord".hashCode()), new i.8());
    kpf.put(Integer.valueOf("IPCallPopularCountry".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return j.diD;
      }
    });
    kpf.put(Integer.valueOf("IPCallMsg".hashCode()), new i.10());
  }
  
  public static com.tencent.mm.plugin.voip.video.d aXA()
  {
    if (aXo().koY == null) {
      aXo().koY = new com.tencent.mm.plugin.voip.video.d(ad.getContext());
    }
    return aXo().koY;
  }
  
  public static i aXo()
  {
    if (koM == null)
    {
      koM = new i();
      au.HN().a("plugin.ipcall", koM);
    }
    return koM;
  }
  
  public static g aXp()
  {
    return aXo().koN;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.c.a aXq()
  {
    return aXo().koO;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.c.b aXr()
  {
    return aXo().koP;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.b.b aXs()
  {
    return aXo().koQ;
  }
  
  public static f aXt()
  {
    return aXo().koR;
  }
  
  public static com.tencent.mm.plugin.ipcall.c aXu()
  {
    return aXo().koS;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.g.d aXv()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aXo().koT == null)
    {
      i locali = aXo();
      au.HU();
      locali.koT = new com.tencent.mm.plugin.ipcall.a.g.d(com.tencent.mm.model.c.FO());
    }
    return aXo().koT;
  }
  
  public static l aXw()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aXo().koU == null)
    {
      i locali = aXo();
      au.HU();
      locali.koU = new l(com.tencent.mm.model.c.FO());
    }
    return aXo().koU;
  }
  
  public static j aXx()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aXo().koV == null)
    {
      i locali = aXo();
      au.HU();
      locali.koV = new j(com.tencent.mm.model.c.FO());
    }
    return aXo().koV;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.g.h aXy()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aXo().koW == null)
    {
      i locali = aXo();
      au.HU();
      locali.koW = new com.tencent.mm.plugin.ipcall.a.g.h(com.tencent.mm.model.c.FO());
    }
    return aXo().koW;
  }
  
  public static com.tencent.mm.plugin.voip.video.i aXz()
  {
    if (aXo().koX == null) {
      aXo().koX = new com.tencent.mm.plugin.voip.video.i(ad.getContext());
    }
    return aXo().koX;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return kpf;
  }
  
  public final void bn(boolean paramBoolean)
  {
    Object localObject = this.koN;
    ((g)localObject).koy.init();
    ((g)localObject).koz.init();
    ((g)localObject).koA.init();
    ((g)localObject).koB.init();
    ((g)localObject).koC.init();
    ((g)localObject).koD.init();
    ((g)localObject).koE.init();
    ((g)localObject).koF.init();
    ((g)localObject).koy.kpk = ((a.a)localObject);
    ((g)localObject).koA.kpk = ((a.a)localObject);
    ((g)localObject).koB.kpk = ((a.a)localObject);
    ((g)localObject).koD.kpk = ((a.a)localObject);
    ((g)localObject).koF.kpk = ((a.a)localObject);
    ((g)localObject).koz.kpm = ((b.a)localObject);
    ((g)localObject).koC.kpm = ((b.a)localObject);
    au.a(((g)localObject).koJ);
    b.init();
    localObject = d.aXf();
    com.tencent.mm.sdk.b.a.sFg.b(((d)localObject).kom);
    localObject = e.aXi();
    com.tencent.mm.sdk.b.a.sFg.b(((e)localObject).eOh);
    au.getSysCmdMsgExtension().a("WeChatOut", this.kpg, true);
    au.getSysCmdMsgExtension().a("WeChatOutMsg", this.kph, true);
    au.getSysCmdMsgExtension().a("WCONotify", this.kpi, true);
    com.tencent.mm.sdk.b.a.sFg.b(this.kpb);
    com.tencent.mm.sdk.b.a.sFg.b(this.kpc);
    com.tencent.mm.sdk.b.a.sFg.b(this.kpd);
    com.tencent.mm.sdk.b.a.sFg.b(this.kpe);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    if (this.koR.aXj()) {
      this.koS.cK(0, 0);
    }
    Object localObject = this.koN;
    ((g)localObject).koy.destroy();
    ((g)localObject).koz.destroy();
    ((g)localObject).koA.destroy();
    ((g)localObject).koB.destroy();
    ((g)localObject).koC.destroy();
    ((g)localObject).koE.destroy();
    au.b(((g)localObject).koJ);
    b.release();
    localObject = d.aXf();
    au.DF().b(159, (com.tencent.mm.ab.e)localObject);
    au.DF().b(160, (com.tencent.mm.ab.e)localObject);
    com.tencent.mm.sdk.b.a.sFg.c(((d)localObject).kom);
    localObject = e.aXi();
    com.tencent.mm.sdk.b.a.sFg.c(((e)localObject).eOh);
    au.getSysCmdMsgExtension().b("WeChatOut", this.kpg, true);
    au.getSysCmdMsgExtension().b("WeChatOutMsg", this.kph, true);
    au.getSysCmdMsgExtension().b("WCONotify", this.kpi, true);
    com.tencent.mm.sdk.b.a.sFg.c(this.kpb);
    com.tencent.mm.sdk.b.a.sFg.c(this.kpc);
    com.tencent.mm.sdk.b.a.sFg.c(this.kpd);
    com.tencent.mm.sdk.b.a.sFg.c(this.kpe);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */