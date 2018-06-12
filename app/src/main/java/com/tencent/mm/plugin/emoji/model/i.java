package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.mm.ab.o;
import com.tencent.mm.ak.a.a.b.a;
import com.tencent.mm.br.f;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.emoji.e.j.1;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager.ConnectivityReceiver;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.pluginsdk.g.a.a.m;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.view.SmileyPanelImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class i
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private d ihK;
  private com.tencent.mm.plugin.emoji.e.a ihL;
  private com.tencent.mm.plugin.emoji.e.g ihM;
  private j ihN;
  private g ihO;
  private e ihP;
  private com.tencent.mm.plugin.emoji.sync.a<com.tencent.mm.plugin.emoji.sync.d> ihQ;
  private volatile com.tencent.mm.plugin.emoji.e.h ihR;
  private volatile com.tencent.mm.plugin.emoji.e.b ihS;
  private volatile com.tencent.mm.plugin.emoji.e.l ihT;
  private volatile com.tencent.mm.plugin.emoji.e.j ihU;
  private com.tencent.mm.ak.a.a ihV;
  private c ihW;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("EMOJIINFO_TABLE".hashCode()), new i.1());
    cVM.put(Integer.valueOf("EMOJIGROUPINFO_TABLE".hashCode()), new i.7());
    cVM.put(Integer.valueOf("EMOJIINFODESC_TABLE".hashCode()), new i.8());
    cVM.put(Integer.valueOf("EMOTIONDETAIL_TABLE".hashCode()), new i.9());
    cVM.put(Integer.valueOf("GETEMOTIONLISTCACHE_TABLE".hashCode()), new i.10());
    cVM.put(Integer.valueOf("EmotionRewardINFO_TABLE".hashCode()), new i.11());
    cVM.put(Integer.valueOf("EmotionDesignerInfoStorage_TABLE".hashCode()), new i.12());
    cVM.put(Integer.valueOf("EmotionRewardTipStorage_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return com.tencent.mm.storage.emotion.n.diD;
      }
    });
    cVM.put(Integer.valueOf("SmileyInfoStorage_TABLE".hashCode()), new i.14());
    cVM.put(Integer.valueOf("SmileyPanelConfigInfoStorage_TABLE".hashCode()), new i.2());
    cVM.put(Integer.valueOf("EmojiDescMapStorage".hashCode()), new i.3());
    cVM.put(Integer.valueOf("DELETE".hashCode()), new i.4());
  }
  
  public static com.tencent.mm.ak.a.a aDZ()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihV == null)
    {
      Object localObject = new b.a(ad.getContext());
      ((b.a)localObject).dXn = new com.tencent.mm.plugin.emoji.d.a();
      ((b.a)localObject).dXl = new com.tencent.mm.view.d.a();
      localObject = ((b.a)localObject).Ps();
      aEt().ihV = new com.tencent.mm.ak.a.a((com.tencent.mm.ak.a.a.b)localObject);
    }
    return aEt().ihV;
  }
  
  public static com.tencent.mm.plugin.emoji.e.l aEA()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihT == null) {
      aEt().ihT = new com.tencent.mm.plugin.emoji.e.l();
    }
    return aEt().ihT;
  }
  
  public static com.tencent.mm.plugin.emoji.e.j aEB()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihU == null) {
      aEt().ihU = new com.tencent.mm.plugin.emoji.e.j();
    }
    return aEt().ihU;
  }
  
  public static e aEC()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihP == null) {
      aEt().ihP = new e();
    }
    return aEt().ihP;
  }
  
  public static c aED()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihW == null) {
      aEt().ihW = new c();
    }
    return aEt().ihW;
  }
  
  private static i aEt()
  {
    au.HN();
    i locali2 = (i)bs.iK("plugin.emoji");
    if (locali2 == null)
    {
      i locali1 = locali2;
      if (locali2 == null) {}
      try
      {
        locali1 = new i();
        au.HN().a("plugin.emoji", locali1);
        return locali1;
      }
      finally {}
    }
    return locali2;
  }
  
  public static d aEu()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihK == null) {
      aEt().ihK = new d();
    }
    return aEt().ihK;
  }
  
  public static com.tencent.mm.plugin.emoji.e.a aEv()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihL == null) {
      aEt().ihL = new com.tencent.mm.plugin.emoji.e.a();
    }
    return aEt().ihL;
  }
  
  public static com.tencent.mm.plugin.emoji.e.g aEw()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihM == null) {
      aEt().ihM = new com.tencent.mm.plugin.emoji.e.g();
    }
    return aEt().ihM;
  }
  
  public static com.tencent.mm.plugin.emoji.sync.a<com.tencent.mm.plugin.emoji.sync.d> aEx()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihQ == null) {
      aEt().ihQ = new com.tencent.mm.plugin.emoji.sync.a();
    }
    return aEt().ihQ;
  }
  
  private static com.tencent.mm.plugin.emoji.e.h aEy()
  {
    try
    {
      com.tencent.mm.kernel.g.Eg().Ds();
      if (aEt().ihR == null) {
        aEt().ihR = new com.tencent.mm.plugin.emoji.e.h();
      }
      com.tencent.mm.plugin.emoji.e.h localh = aEt().ihR;
      return localh;
    }
    finally {}
  }
  
  private static com.tencent.mm.plugin.emoji.e.b aEz()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (aEt().ihS == null) {
      aEt().ihS = new com.tencent.mm.plugin.emoji.e.b();
    }
    return aEt().ihS;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.SubCoreEmoji", "[onAccountPostReset]");
    com.tencent.mm.pluginsdk.ui.chat.e.qMK = new e.b()
    {
      public final ChatFooterPanel da(Context paramAnonymousContext)
      {
        return new SmileyPanelImpl(paramAnonymousContext);
      }
    };
    com.tencent.mm.pluginsdk.ui.chat.e.qML = new i.6(this);
    ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).setEmojiMgr();
    Object localObject1 = aEy();
    au.getSysCmdMsgExtension().a("emotionstore", ((com.tencent.mm.plugin.emoji.e.h)localObject1).ifv, true);
    au.getSysCmdMsgExtension().a("NewRecommendEmotion", ((com.tencent.mm.plugin.emoji.e.h)localObject1).ifw, true);
    au.getSysCmdMsgExtension().a("EmojiBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject1).ifx, true);
    au.getSysCmdMsgExtension().a("EmotionBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject1).ifx, true);
    localObject1 = aEz();
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ieT);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ieX);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ieY);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ieZ);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ifa);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ifb);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ifc);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ifd);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ife);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ieU);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ieV);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).iff);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ifg);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).ieW);
    localObject1 = aEA();
    ((com.tencent.mm.plugin.emoji.e.l)localObject1).igx.c(((com.tencent.mm.plugin.emoji.e.l)localObject1).igR);
    ((com.tencent.mm.plugin.emoji.e.l)localObject1).igy.c(((com.tencent.mm.plugin.emoji.e.l)localObject1).igP);
    ((com.tencent.mm.plugin.emoji.e.l)localObject1).igz.c(((com.tencent.mm.plugin.emoji.e.l)localObject1).igQ);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.emoji.e.l)localObject1).igS);
    aEv();
    localObject1 = aEB();
    Object localObject2 = com.tencent.mm.k.g.AT().getValue("EmotionRewardTipsLimit");
    long l;
    if (!bi.oW((String)localObject2))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiRewardTipMgr", "updateConfig dynamic config %s", new Object[] { localObject2 });
      localObject2 = ((String)localObject2).split(",");
      if ((localObject2 != null) && (localObject2.length == 3))
      {
        if (bi.getInt(localObject2[0], 0) != 0) {
          break label912;
        }
        l = 863913600000L;
        ((com.tencent.mm.plugin.emoji.e.j)localObject1).igd = l;
        ((com.tencent.mm.plugin.emoji.e.j)localObject1).ige = (bi.getInt(localObject2[1], 20) - 1);
        ((com.tencent.mm.plugin.emoji.e.j)localObject1).hou = (bi.getInt(localObject2[2], 80) - 1);
      }
    }
    boolean bool2 = com.tencent.mm.plugin.emoji.e.n.aEh();
    au.HU();
    boolean bool3 = ((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sPf, Boolean.valueOf(true))).booleanValue();
    if ((bool2) && (bool3)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      ((com.tencent.mm.plugin.emoji.e.j)localObject1).igc = bool1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiRewardTipMgr", "init RewardTipMgr RewardTipEnable:%b isEnableRewardTip:%b isTipsEnable:%b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.emoji.e.j)localObject1).igc), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      au.Em().H(new j.1((com.tencent.mm.plugin.emoji.e.j)localObject1));
      localObject1 = aEx().ije;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg attach");
      com.tencent.mm.sdk.b.a.sFg.b(((BKGLoaderManager)localObject1).ijI);
      com.tencent.mm.sdk.b.a.sFg.b(((BKGLoaderManager)localObject1).ijJ);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      ((BKGLoaderManager)localObject1).ijE = new BKGLoaderManager.ConnectivityReceiver((BKGLoaderManager)localObject1);
      ad.getContext().registerReceiver(((BKGLoaderManager)localObject1).ijE, (IntentFilter)localObject2);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.SubCoreEmoji", "[oneliang]initCore");
      aEA().aEf();
      this.ihN = new j();
      this.ihO = new g();
      com.tencent.mm.ag.a.bJ(paramBoolean);
      localObject1 = aED();
      au.DF().a(697, (com.tencent.mm.ab.e)localObject1);
      int i = f.cjI().cjK();
      int j = com.tencent.mm.br.e.cjH().apV();
      if (i < 0)
      {
        au.HU();
        if (((Integer)com.tencent.mm.model.c.DT().get(aa.a.sPi, Integer.valueOf(0))).intValue() > 0)
        {
          b.c.ccr().e(37, 1, -1, false);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sPi, Integer.valueOf(0));
          localObject1 = new m(37);
          au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
          com.tencent.mm.plugin.report.service.h.mEJ.a(165L, 10L, 1L, false);
        }
      }
      if (j < 0)
      {
        au.HU();
        if (((Integer)com.tencent.mm.model.c.DT().get(aa.a.sPj, Integer.valueOf(0))).intValue() > 0)
        {
          b.c.ccr().e(37, 2, -1, false);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sPj, Integer.valueOf(0));
          localObject1 = new m(37);
          au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
          com.tencent.mm.plugin.report.service.h.mEJ.a(165L, 11L, 1L, false);
        }
      }
      return;
      label912:
      l = bi.getInt(localObject2[0], 0) * 86400000L;
      break;
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    Object localObject = aEy();
    au.getSysCmdMsgExtension().b("emotionstore", ((com.tencent.mm.plugin.emoji.e.h)localObject).ifv, true);
    au.getSysCmdMsgExtension().b("NewRecommendEmotion", ((com.tencent.mm.plugin.emoji.e.h)localObject).ifw, true);
    au.getSysCmdMsgExtension().b("EmojiBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject).ifx, true);
    au.getSysCmdMsgExtension().b("EmotionBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject).ifx, true);
    localObject = aEz();
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ieT);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ieX);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ieY);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ieZ);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ifa);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ifb);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ifc);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ifd);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ife);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ieU);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ieV);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).iff);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ifg);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.b)localObject).ieW);
    localObject = aEA();
    ((com.tencent.mm.plugin.emoji.e.l)localObject).igx.d(((com.tencent.mm.plugin.emoji.e.l)localObject).igR);
    ((com.tencent.mm.plugin.emoji.e.l)localObject).igy.d(((com.tencent.mm.plugin.emoji.e.l)localObject).igP);
    ((com.tencent.mm.plugin.emoji.e.l)localObject).igz.d(((com.tencent.mm.plugin.emoji.e.l)localObject).igQ);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.emoji.e.l)localObject).igS);
    if (com.tencent.mm.plugin.emoji.e.l.igN != null)
    {
      com.tencent.mm.plugin.emoji.e.l.igN.clear();
      com.tencent.mm.plugin.emoji.e.l.igN = null;
    }
    if (com.tencent.mm.plugin.emoji.e.l.igO != null)
    {
      com.tencent.mm.plugin.emoji.e.l.igO.clear();
      com.tencent.mm.plugin.emoji.e.l.igO = null;
    }
    aEv().clear();
    ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).removeEmojiMgr();
    localObject = aEu();
    au.DF().b(175, (com.tencent.mm.ab.e)localObject);
    ((d)localObject).ihh.clear();
    ((d)localObject).ihf.clear();
    ((d)localObject).ihk.clear();
    localObject = aEB();
    ((com.tencent.mm.plugin.emoji.e.j)localObject).igf = null;
    if (((com.tencent.mm.plugin.emoji.e.j)localObject).igg != null) {
      ((com.tencent.mm.plugin.emoji.e.j)localObject).igg.clear();
    }
    localObject = aEx().ije;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg detach");
    if (((BKGLoaderManager)localObject).ijA != null) {
      ((BKGLoaderManager)localObject).ijA.clear();
    }
    if (((BKGLoaderManager)localObject).ijB != null) {
      ((BKGLoaderManager)localObject).ijB.clear();
    }
    if (((BKGLoaderManager)localObject).ijC != null) {
      ((BKGLoaderManager)localObject).ijC.clear();
    }
    ((BKGLoaderManager)localObject).ijr = false;
    com.tencent.mm.sdk.b.a.sFg.c(((BKGLoaderManager)localObject).ijI);
    com.tencent.mm.sdk.b.a.sFg.c(((BKGLoaderManager)localObject).ijJ);
    if (((BKGLoaderManager)localObject).ijE != null)
    {
      ad.getContext().unregisterReceiver(((BKGLoaderManager)localObject).ijE);
      ((BKGLoaderManager)localObject).ijE = null;
    }
    if (this.ihN != null)
    {
      localObject = this.ihN;
      com.tencent.mm.sdk.b.a.sFg.c(((j)localObject).iib);
      com.tencent.mm.sdk.b.a.sFg.c(((j)localObject).iic);
    }
    if (this.ihO != null)
    {
      localObject = this.ihO;
      ((g)localObject).ihv.clear();
      aEu().ihj = null;
      ((g)localObject).ihw.dead();
    }
    if (this.ihV != null) {
      this.ihV.detach();
    }
    localObject = aED();
    au.DF().b(697, (com.tencent.mm.ab.e)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */