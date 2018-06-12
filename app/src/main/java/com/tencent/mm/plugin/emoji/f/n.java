package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.a.at;
import com.tencent.mm.g.a.at.b;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.c.adg;
import com.tencent.mm.protocal.c.adh;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class n
  extends com.tencent.mm.ab.l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private final int fdx;
  public byte[] iiN = null;
  public int iiP;
  private boolean iiQ = false;
  private ArrayList<ts> iiR = new ArrayList();
  public final int mType;
  
  public n(int paramInt1, int paramInt2)
  {
    this(paramInt1, null, paramInt2);
  }
  
  public n(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    this(paramInt1, paramArrayOfByte, paramInt2, false);
  }
  
  public n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
  {
    b.a locala = new b.a();
    locala.dIG = new adg();
    locala.dIH = new adh();
    locala.uri = "/cgi-bin/micromsg-bin/getemotionlist";
    locala.dIF = 411;
    locala.dII = 210;
    locala.dIJ = 1000000210;
    this.diG = locala.KT();
    this.iiN = paramArrayOfByte;
    this.mType = paramInt1;
    this.fdx = paramInt2;
    this.iiQ = paramBoolean;
  }
  
  public static com.tencent.mm.plugin.emoji.model.f a(adh paramadh)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.NetSceneGetEmotionList", "getEmotionListModel");
    if (paramadh == null) {
      return null;
    }
    com.tencent.mm.plugin.emoji.model.f localf = new com.tencent.mm.plugin.emoji.model.f();
    if (paramadh != null)
    {
      localf.ihp = paramadh.rHB;
      Object localObject1 = new ArrayList();
      if ((paramadh.rHC != null) && (!paramadh.rHC.isEmpty()))
      {
        Object[] arrayOfObject = paramadh.rHC.toArray();
        if ((arrayOfObject != null) && (arrayOfObject.length > 0))
        {
          int j = arrayOfObject.length;
          int i = 0;
          while (i < j)
          {
            Object localObject2 = arrayOfObject[i];
            if ((localObject2 != null) && ((localObject2 instanceof ts)))
            {
              localObject2 = (ts)localObject2;
              if ((localObject2 != null) && (!bi.oW(((ts)localObject2).rem))) {
                ((List)localObject1).add(new com.tencent.mm.plugin.emoji.a.a.f((ts)localObject2));
              }
            }
            i += 1;
          }
        }
      }
      localf.ihq = ((List)localObject1);
      localf.ihr = paramadh.rHD;
      localf.ihs = paramadh.rHF;
      localObject1 = paramadh.rHN;
      if (localf.ihu == null)
      {
        localf.ihu = new LinkedList();
        localf.ihu.addAll((Collection)localObject1);
      }
      localf.iht = paramadh.rHJ;
    }
    return localf;
  }
  
  private void aER()
  {
    adh localadh = aEQ();
    if ((localadh != null) && (localadh.rHC != null) && (localadh.rHC.size() > 0))
    {
      this.iiR.addAll(localadh.rHC);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.NetSceneGetEmotionList", "addSummaryList faild. response is null or emotion list is empty.");
  }
  
  private void r(ArrayList<ts> paramArrayList)
  {
    com.tencent.mm.storage.emotion.a locala = i.aEA().igy;
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList failed. get emoji group info storage failed.");
      return;
    }
    long l2 = System.currentTimeMillis();
    Object localObject2;
    long l1;
    if ((locala.diF instanceof h))
    {
      localObject2 = (h)locala.diF;
      l1 = ((h)localObject2).dO(Thread.currentThread().getId());
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround preparedDownloadCustomEmojiList in a transaction, ticket = %d", new Object[] { Long.valueOf(l1) });
    }
    for (;;)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0)) {
        if ((paramArrayList == null) || (paramArrayList.size() <= 0))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary empty summary.");
          if (localObject2 != null)
          {
            ((h)localObject2).gp(l1);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end updateList transaction");
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[cpan] preparedDownloadCustomEmojiList use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - Long.valueOf(l2).longValue()) });
          locala.b("event_update_group", 0, bi.cjd().toString());
          if (!this.iiQ) {
            break label1336;
          }
          if ((paramArrayList == null) || (paramArrayList.size() <= 0)) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d force", new Object[] { Integer.valueOf(paramArrayList.size()) });
          localObject1 = new ArrayList();
          paramArrayList = paramArrayList.iterator();
        }
      }
      for (;;)
      {
        if (!paramArrayList.hasNext()) {
          break label1306;
        }
        localObject2 = (ts)paramArrayList.next();
        if ((localObject2 != null) && (!bi.oW(((ts)localObject2).rem)))
        {
          if (((ts)localObject2).rem.equals(String.valueOf(EmojiGroupInfo.tcy)))
          {
            ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.c("com.tencent.xin.emoticon.tusiji"));
            continue;
            HashMap localHashMap = locala.cnh();
            ArrayList localArrayList1 = new ArrayList();
            ArrayList localArrayList2 = new ArrayList();
            int j = paramArrayList.size();
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary size:%d", new Object[] { Integer.valueOf(j) });
            int i = 0;
            Object localObject3;
            while (i < j)
            {
              ts localts = (ts)paramArrayList.get(i);
              if ((localts == null) || (bi.oW(localts.rem)))
              {
                com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiGroupInfoStorage", "summary is null or product id is null.");
                i += 1;
              }
              else
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "summary productID:%s", new Object[] { localts.rem });
                localArrayList1.add(localts.rem);
                if (localHashMap.containsKey(localts.rem))
                {
                  localObject3 = (EmojiGroupInfo)localHashMap.get(localts.rem);
                  localObject1 = localObject3;
                  if (localObject3 == null) {
                    localObject1 = new EmojiGroupInfo();
                  }
                  ((EmojiGroupInfo)localObject1).field_productID = localts.rem;
                  label494:
                  if (!localts.rem.equals("com.tencent.xin.emoticon.tusiji")) {
                    break label932;
                  }
                  ((EmojiGroupInfo)localObject1).field_flag = 0;
                  ((EmojiGroupInfo)localObject1).field_packName = "emoji_custom_all";
                  ((EmojiGroupInfo)localObject1).field_type = EmojiGroupInfo.TYPE_SYSTEM;
                  label530:
                  ((EmojiGroupInfo)localObject1).field_packIconUrl = localts.jPG;
                  ((EmojiGroupInfo)localObject1).field_packGrayIconUrl = localts.rxd;
                  ((EmojiGroupInfo)localObject1).field_packCoverUrl = localts.rwY;
                  ((EmojiGroupInfo)localObject1).field_packDesc = localts.rwR;
                  ((EmojiGroupInfo)localObject1).field_packAuthInfo = localts.rwS;
                  ((EmojiGroupInfo)localObject1).field_packPrice = localts.rwT;
                  ((EmojiGroupInfo)localObject1).field_packType = localts.rwU;
                  ((EmojiGroupInfo)localObject1).field_packFlag = localts.rwV;
                  ((EmojiGroupInfo)localObject1).field_packExpire = localts.rwZ;
                  ((EmojiGroupInfo)localObject1).field_packTimeStamp = localts.rxy;
                  ((EmojiGroupInfo)localObject1).field_sort = 1;
                  ((EmojiGroupInfo)localObject1).field_idx = i;
                  if (((EmojiGroupInfo)localObject1).field_sync == 0) {
                    if ((((EmojiGroupInfo)localObject1).field_status != 7) || (((EmojiGroupInfo)localObject1).field_packStatus != 1)) {
                      break label953;
                    }
                  }
                }
                label932:
                label953:
                for (((EmojiGroupInfo)localObject1).field_sync = 2;; ((EmojiGroupInfo)localObject1).field_sync = 1)
                {
                  if (((EmojiGroupInfo)localObject1).field_sync == 2) {
                    ((EmojiGroupInfo)localObject1).field_status = 7;
                  }
                  if ((((EmojiGroupInfo)localObject1).field_sync == 2) && (!localts.rem.equals("com.tencent.xin.emoticon.tusiji")))
                  {
                    localObject3 = new at();
                    ((at)localObject3).bIi.type = 1;
                    ((at)localObject3).bIi.bIl = localts.rem;
                    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
                    if (!((at)localObject3).bIj.bGZ)
                    {
                      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "decode failed re download product:%s.", new Object[] { localts.rem });
                      ((EmojiGroupInfo)localObject1).field_sync = 1;
                    }
                  }
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks updateEmojiGroupByEmotionSummary: prodcutId: %s, lasttime: %d, sort: %d", new Object[] { ((EmojiGroupInfo)localObject1).field_productID, Long.valueOf(((EmojiGroupInfo)localObject1).field_lastUseTime), Integer.valueOf(((EmojiGroupInfo)localObject1).field_sort) });
                  locala.a((com.tencent.mm.sdk.e.c)localObject1);
                  break;
                  if (localts.rem.equals("com.tencent.xin.emoticon.tusiji"))
                  {
                    localObject3 = (EmojiGroupInfo)localHashMap.get(String.valueOf(EmojiGroupInfo.tcy));
                    localObject1 = localObject3;
                    if (localObject3 == null) {
                      localObject1 = new EmojiGroupInfo();
                    }
                    ((EmojiGroupInfo)localObject1).field_productID = String.valueOf(EmojiGroupInfo.tcy);
                    break label494;
                  }
                  localObject1 = new EmojiGroupInfo();
                  ((EmojiGroupInfo)localObject1).field_productID = localts.rem;
                  break label494;
                  ((EmojiGroupInfo)localObject1).field_packName = localts.rwQ;
                  ((EmojiGroupInfo)localObject1).field_type = EmojiGroupInfo.tcv;
                  break label530;
                }
              }
            }
            localObject1 = localHashMap.values().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (EmojiGroupInfo)((Iterator)localObject1).next();
              if ((localObject3 != null) && (!bi.oW(((EmojiGroupInfo)localObject3).field_productID)) && (!((EmojiGroupInfo)localObject3).field_productID.equals(String.valueOf(EmojiGroupInfo.tcz)))) {
                if (((EmojiGroupInfo)localObject3).field_productID.equals(String.valueOf(EmojiGroupInfo.tcy)))
                {
                  if (!localArrayList1.contains("com.tencent.xin.emoticon.tusiji"))
                  {
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", new Object[] { "com.tencent.xin.emoticon.tusiji" });
                    localArrayList2.add("com.tencent.xin.emoticon.tusiji");
                  }
                }
                else if (!localArrayList1.contains(((EmojiGroupInfo)localObject3).field_productID))
                {
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", new Object[] { ((EmojiGroupInfo)localObject3).field_productID });
                  localArrayList2.add(((EmojiGroupInfo)localObject3).field_productID);
                }
              }
            }
            if (localArrayList2.size() > 0)
            {
              localObject1 = localArrayList2.iterator();
              while (((Iterator)localObject1).hasNext()) {
                locala.Zu((String)((Iterator)localObject1).next());
              }
            }
            locala.b("event_update_group", 0, bi.cjd().toString());
            break;
            localObject1 = locala.cni().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (EmojiGroupInfo)((Iterator)localObject1).next();
              if (((EmojiGroupInfo)localObject3).field_sync > 0)
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "delete pid:%s", new Object[] { ((EmojiGroupInfo)localObject3).field_productID });
                locala.Zu(((EmojiGroupInfo)localObject3).field_productID);
              }
            }
            locala.Zu("com.tencent.xin.emoticon.tusiji");
            break;
          }
          ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.b(((ts)localObject2).rem, (byte)0));
        }
      }
      label1306:
      i.aEx().t((ArrayList)localObject1);
      if (i.aEx().ije.iju) {
        break;
      }
      i.aEx().ije.aEV();
      return;
      label1336:
      Object localObject1 = (ArrayList)locala.cnr();
      if (((ArrayList)localObject1).size() <= 0) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
      paramArrayList = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (!bi.oW((String)localObject2)) {
          if (((String)localObject2).equals(String.valueOf(EmojiGroupInfo.tcy))) {
            paramArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.c("com.tencent.xin.emoticon.tusiji"));
          } else {
            paramArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.b((String)localObject2));
          }
        }
      }
      i.aEx().t(paramArrayList);
      if (i.aEx().ije.iju) {
        break;
      }
      i.aEx().ije.aEV();
      return;
      l1 = -1L;
      localObject2 = null;
    }
  }
  
  protected final int Cc()
  {
    return 100;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    adg localadg = (adg)this.diG.dID.dIL;
    if (this.iiN != null)
    {
      localadg.rcT = ab.O(this.iiN);
      if (localadg.rcT != null) {
        break label112;
      }
    }
    label112:
    for (parame1 = "Buf is NULL";; parame1 = localadg.rcT.toString())
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.NetSceneGetEmotionList", parame1);
      localadg.rgA = this.mType;
      localadg.otY = this.fdx;
      if (this.mType == 7) {
        localadg.rHA = this.iiP;
      }
      return a(parame, this.diG, this);
      localadg.rcT = new bhy();
      break;
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.NetSceneGetEmotionList", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    if (this.mType == 8)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sOS, Long.valueOf(System.currentTimeMillis()));
      }
    }
    else if (this.mType == 11)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        break label176;
      }
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOW, Long.valueOf(System.currentTimeMillis()));
    }
    for (;;)
    {
      i.aEA().igA.a(this.mType, aEQ());
      if ((paramInt2 == 0) || (paramInt2 == 4)) {
        break label206;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOS, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
      break;
      label176:
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOW, Long.valueOf(System.currentTimeMillis() - 28800000L + 600000L));
    }
    label206:
    paramArrayOfByte = (adh)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramArrayOfByte.rcT != null) {
      this.iiN = ab.a(paramArrayOfByte.rcT);
    }
    if (this.mType == 8)
    {
      if (paramInt3 != 0) {
        break label301;
      }
      aER();
      r(this.iiR);
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOS, Long.valueOf(System.currentTimeMillis()));
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label301:
      if (paramInt3 == 2)
      {
        aER();
        ((adg)((com.tencent.mm.ab.b)paramq).dID.dIL).rcT = ((adh)((com.tencent.mm.ab.b)paramq).dIE.dIL).rcT;
        a(this.dIX, this.diJ);
      }
      else if (paramInt3 == 3)
      {
        if (this.iiR != null) {
          this.iiR.clear();
        }
        ((adg)((com.tencent.mm.ab.b)paramq).dID.dIL).rcT = new bhy();
        a(this.dIX, this.diJ);
      }
    }
  }
  
  public final adh aEQ()
  {
    if (this.diG == null) {
      return null;
    }
    return (adh)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 411;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */