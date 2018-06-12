package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.f;
import com.tencent.mm.storage.emotion.j;
import com.tencent.mm.storage.emotion.n;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.emotion.r;
import com.tencent.mm.storage.emotion.t;
import com.tencent.mm.storage.emotion.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class l
{
  private static int cfZ = -1;
  public static boolean igJ = false;
  public static boolean igK = false;
  public static boolean igL = false;
  public static boolean igM = false;
  public static ArrayList<EmojiGroupInfo> igN = new ArrayList();
  public static HashMap<String, ArrayList<EmojiInfo>> igO = new HashMap();
  public p igA;
  public j igB;
  public com.tencent.mm.storage.emotion.l igC;
  public com.tencent.mm.storage.emotion.h igD;
  public n igE;
  r igF;
  t igG;
  f igH;
  public v igI;
  public final j.a igP = new j.a()
  {
    public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
    {
      if ((!bi.oW(paramAnonymousString)) && (paramAnonymousString.equals("event_update_group")))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStorageMgr", "onNotifyChange event:%s", new Object[] { (String)paramAnonymousl.obj });
        if (g.Eg().Dx()) {}
      }
      while ((bi.oW(paramAnonymousString)) || ((!paramAnonymousString.equals("event_update_group")) && (!paramAnonymousString.equalsIgnoreCase("productID"))))
      {
        return;
        i.aEv().aDI();
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStorageMgr", "modify emoji gorup .");
      l.igJ = true;
      l.igM = true;
    }
  };
  public final j.a igQ = new l.2(this);
  public final j.a igR = new j.a()
  {
    public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
    {
      if (paramAnonymousString == null) {}
      do
      {
        do
        {
          return;
          if (paramAnonymousString.equalsIgnoreCase("delete_emoji_info_notify"))
          {
            l.igK = true;
            return;
          }
        } while (!g.Eg().Dx());
        paramAnonymousString = ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(paramAnonymousString);
      } while ((paramAnonymousString == null) || (paramAnonymousString.field_catalog != EmojiInfo.tcH));
      l.igK = true;
    }
  };
  public final com.tencent.mm.sdk.b.c igS = new l.4(this);
  public com.tencent.mm.storage.emotion.d igx;
  public com.tencent.mm.storage.emotion.a igy;
  public com.tencent.mm.storage.emotion.c igz;
  
  public l()
  {
    au.HU();
    this.igx = new com.tencent.mm.storage.emotion.d(com.tencent.mm.model.c.FO());
    au.HU();
    this.igy = new com.tencent.mm.storage.emotion.a(com.tencent.mm.model.c.FO());
    au.HU();
    this.igz = new com.tencent.mm.storage.emotion.c(com.tencent.mm.model.c.FO());
    au.HU();
    this.igB = new j(com.tencent.mm.model.c.FO());
    au.HU();
    this.igC = new com.tencent.mm.storage.emotion.l(com.tencent.mm.model.c.FO());
    au.HU();
    this.igD = new com.tencent.mm.storage.emotion.h(com.tencent.mm.model.c.FO());
    au.HU();
    this.igA = new p(com.tencent.mm.model.c.FO());
    au.HU();
    this.igE = new n(com.tencent.mm.model.c.FO());
    au.HU();
    this.igF = new r(com.tencent.mm.model.c.FO());
    au.HU();
    this.igG = new t(com.tencent.mm.model.c.FO());
    au.HU();
    this.igH = new f(com.tencent.mm.model.c.FO());
    this.igI = new v();
  }
  
  public final ArrayList<EmojiGroupInfo> aDW()
  {
    if (igN == null) {
      igN = new ArrayList();
    }
    if ((igN.size() == 0) || (igJ))
    {
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable()) {
        break label59;
      }
    }
    label59:
    for (igN = this.igy.cnn();; igN = (ArrayList)this.igy.cnf())
    {
      igJ = false;
      return igN;
    }
  }
  
  public final int aDX()
  {
    if ((cfZ == -1) || (igM)) {
      cfZ = this.igy.cnj();
    }
    return cfZ;
  }
  
  public final ArrayList<EmojiInfo> aDY()
  {
    if (igO == null) {
      igO = new HashMap();
    }
    if ((!igO.containsKey("custom")) || (igK)) {
      igO.put("custom", (ArrayList)this.igx.cnG());
    }
    igK = false;
    return (ArrayList)igO.get("custom");
  }
  
  public final void aEf()
  {
    Object localObject1 = ad.getContext();
    boolean bool;
    if (localObject1 != null)
    {
      au.HU();
      bool = ((Boolean)com.tencent.mm.model.c.DT().get(274480, Boolean.valueOf(true))).booleanValue();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStorageMgr", "[oneliang]initCore,need init emoji:%s", new Object[] { String.valueOf(bool) });
      if (bool)
      {
        this.igx.gg((Context)localObject1);
        this.igy.gg((Context)localObject1);
      }
      au.HU();
      com.tencent.mm.model.c.DT().set(274480, Boolean.valueOf(false));
    }
    au.HU();
    if (((Integer)com.tencent.mm.model.c.DT().get(aa.a.sPg, Integer.valueOf(0))).intValue() != com.tencent.mm.protocal.d.qVN)
    {
      l1 = System.currentTimeMillis();
      i.aEA().igy.cnu();
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sPg, Integer.valueOf(com.tencent.mm.protocal.d.qVN));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStorageMgr", "recoverCustomEmojiGroup use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    }
    au.HU();
    long l2;
    Object localObject2;
    if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sPh, Boolean.valueOf(true))).booleanValue())
    {
      l2 = System.currentTimeMillis();
      localObject2 = i.aEA().igy;
      localObject1 = null;
      if (!(((com.tencent.mm.storage.emotion.a)localObject2).diF instanceof com.tencent.mm.bt.h)) {
        break label477;
      }
      localObject1 = (com.tencent.mm.bt.h)((com.tencent.mm.storage.emotion.a)localObject2).diF;
    }
    label467:
    label477:
    for (long l1 = ((com.tencent.mm.bt.h)localObject1).dO(Thread.currentThread().getId());; l1 = -1L)
    {
      Object localObject3 = ((com.tencent.mm.storage.emotion.a)localObject2).cni();
      if (!((ArrayList)localObject3).isEmpty())
      {
        localObject3 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)((Iterator)localObject3).next();
          if ((localEmojiGroupInfo != null) && (!bi.oW(localEmojiGroupInfo.field_productID)))
          {
            i = ((com.tencent.mm.storage.emotion.a)localObject2).zs(localEmojiGroupInfo.field_productID);
            if (localEmojiGroupInfo.field_count != i)
            {
              localEmojiGroupInfo.field_count = i;
              ((com.tencent.mm.storage.emotion.a)localObject2).diF.update("EmojiGroupInfo", localEmojiGroupInfo.wH(), "productID=?", new String[] { localEmojiGroupInfo.field_productID });
            }
          }
        }
      }
      if (localObject1 != null) {}
      for (int i = ((com.tencent.mm.bt.h)localObject1).gp(l1);; i = -1)
      {
        ((com.tencent.mm.storage.emotion.a)localObject2).b("event_update_group", 0, bi.cjd().toString());
        if (i >= 0)
        {
          i = 1;
          au.HU();
          localObject1 = com.tencent.mm.model.c.DT();
          localObject2 = aa.a.sPh;
          if (i != 0) {
            break label467;
          }
        }
        for (bool = true;; bool = false)
        {
          ((com.tencent.mm.storage.x)localObject1).a((aa.a)localObject2, Boolean.valueOf(bool));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStorageMgr", "updateEmojiGroupCount use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          return;
          i = 0;
          break;
        }
      }
    }
  }
  
  public final com.tencent.mm.storage.emotion.d asE()
  {
    return this.igx;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */