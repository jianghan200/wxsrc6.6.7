package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.a.at;
import com.tencent.mm.g.a.at.b;
import com.tencent.mm.g.a.nb;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.n;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.c.fs;
import com.tencent.mm.protocal.c.ft;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends com.tencent.mm.ab.l
  implements k
{
  public static int iip = 0;
  public static int iiq = 1;
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  private ArrayList<String> iio = new ArrayList();
  private HashMap<String, ta> iir = new HashMap();
  public int iis = 0;
  private LinkedList<String> iit = new LinkedList();
  private int mIndex = 0;
  
  public e()
  {
    b.a locala = new b.a();
    locala.dIG = new fs();
    locala.dIH = new ft();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
    locala.dIF = 697;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.mIndex = 0;
    this.iis = iip;
    this.iit = new LinkedList();
  }
  
  public e(LinkedList<String> paramLinkedList)
  {
    b.a locala = new b.a();
    locala.dIG = new fs();
    locala.dIH = new ft();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
    locala.dIF = 697;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.mIndex = 0;
    this.iis = iiq;
    this.iit = paramLinkedList;
  }
  
  private void a(ft paramft)
  {
    if (paramft == null) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList response is null.");
    }
    for (;;)
    {
      return;
      if ((paramft.rgD == null) || (paramft.rgD.size() <= 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addemojiInfoList EmojiList is null or size is empty.");
        return;
      }
      paramft = paramft.rgD.iterator();
      while (paramft.hasNext())
      {
        ta localta = (ta)paramft.next();
        String str = localta.rwk.toLowerCase();
        this.iio.add(str);
        this.iir.put(str, localta);
      }
    }
  }
  
  protected final int Cc()
  {
    return 20;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (fs)this.diG.dID.dIL;
    parame1.rgz = this.mIndex;
    parame1.rgA = this.iis;
    parame1.rgB = this.iit;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    ArrayList localArrayList;
    boolean bool;
    Object localObject;
    long l2;
    if (this.iis == iip)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        com.tencent.mm.plugin.report.service.h.mEJ.a(164L, 1L, 1L, false);
        au.HU();
        c.DT().a(aa.a.sPb, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
        return;
      }
      paramq = (ft)this.diG.dIE.dIL;
      paramArrayOfByte = (fs)this.diG.dID.dIL;
      if ((paramq.rgC == 0) && ((paramq.rfd == null) || (paramq.rfd.size() <= 0)))
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] donwload list is null");
        com.tencent.mm.plugin.report.service.h.mEJ.a(164L, 0L, 1L, false);
        return;
      }
      if (paramq.rgC == 1)
      {
        if (this.iir == null) {}
        for (paramInt1 = 0;; paramInt1 = this.iir.size())
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] preparedDownloadCustomEmojiList size:%s", new Object[] { Integer.valueOf(paramInt1) });
          this.diJ.a(paramInt2, paramInt3, paramString, this);
          au.HU();
          c.DT().a(aa.a.sPb, Long.valueOf(System.currentTimeMillis()));
          a(paramq);
          localArrayList = this.iio;
          if ((localArrayList != null) && (localArrayList.size() > 0)) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] perparedDownloadCustomEmojiList failed. list is null.");
          au.HU();
          c.DT().a(aa.a.sOQ, Boolean.valueOf(false));
          com.tencent.mm.plugin.report.service.h.mEJ.a(164L, 0L, 1L, false);
          return;
        }
        if (localArrayList.size() < n.aEj())
        {
          au.HU();
          c.DT().a(aa.a.sOQ, Boolean.valueOf(false));
        }
        au.HU();
        bool = ((Boolean)c.DT().get(aa.a.sOT, Boolean.valueOf(true))).booleanValue();
        localObject = i.aEA().igx;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin preparedDownloadCustomEmojiList");
        l2 = System.currentTimeMillis();
        if ((localArrayList == null) || (localArrayList.size() <= 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] perparedDownloadCustomEmojiList failed. list is null");
          au.HU();
          c.DT().a(aa.a.sOT, Boolean.valueOf(false));
          paramString = i.aEA().igx;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin preparedDeleteCustomEmojiList");
          l1 = System.currentTimeMillis();
          if ((localArrayList == null) || (localArrayList.size() <= 0))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. list is null");
            label499:
            paramq = (ArrayList)i.aEA().igx.cnJ();
            if (paramq.size() <= 0) {
              break label1410;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "try to sync emoji downloadList:%d", new Object[] { Integer.valueOf(paramq.size()) });
            paramString = new ArrayList();
            paramInt2 = paramq.size();
            paramInt1 = 0;
          }
        }
        else
        {
          for (;;)
          {
            if (paramInt1 < paramInt2)
            {
              paramArrayOfByte = ((String)paramq.get(paramInt1)).toLowerCase();
              if ((this.iir != null) && (this.iir.containsKey(paramArrayOfByte)) && (this.iir.get(paramArrayOfByte) != null))
              {
                localObject = (ta)this.iir.get(paramArrayOfByte);
                paramString.add(new com.tencent.mm.plugin.emoji.sync.a.a(paramArrayOfByte, ((ta)localObject).jPK, ((ta)localObject).lPl, ((ta)localObject).rwl, ((ta)localObject).rwm, ((ta)localObject).rwn, ((ta)localObject).rem, ((ta)localObject).rwq));
                label675:
                paramInt1 += 1;
                continue;
                paramString = null;
                if (!(((d)localObject).diF instanceof com.tencent.mm.bt.h)) {
                  break label1649;
                }
                paramString = (com.tencent.mm.bt.h)((d)localObject).diF;
              }
            }
          }
        }
      }
    }
    label824:
    label982:
    label1048:
    label1055:
    label1410:
    label1649:
    for (long l1 = paramString.dO(Thread.currentThread().getId());; l1 = -1L)
    {
      Iterator localIterator = localArrayList.iterator();
      paramInt1 = 1;
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label1055;
        }
        String str = (String)localIterator.next();
        paramArrayOfByte = ((d)localObject).Zy(str);
        if ((paramArrayOfByte == null) || (bi.oW(paramArrayOfByte.Xh())) || (!paramArrayOfByte.cnv()))
        {
          paramq = new EmojiInfo();
          paramq.field_md5 = str;
          paramq.field_catalog = 85;
          paramq.field_source = EmojiInfo.tcT;
          paramq.field_lastUseTime = System.currentTimeMillis();
          paramq.field_reserved3 = paramInt1;
          if (bool)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiInfoStorage", "need repair");
            paramq.field_temp = 2;
          }
          if (paramq.cnv()) {
            break label982;
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiInfoStorage", "file don't exist");
          paramq.field_temp = 2;
        }
        for (;;)
        {
          paramq = paramq.wH();
          if (((d)localObject).diF.replace("EmojiInfo", "md5", paramq) >= 0L) {
            break label1048;
          }
          if (paramString != null) {
            paramString.gp(l1);
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDownloadCustomEmojiList user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          break;
          paramArrayOfByte.field_source = EmojiInfo.tcT;
          paramq = paramArrayOfByte;
          if (paramArrayOfByte.field_catalog != EmojiInfo.tcB) {
            break label824;
          }
          paramArrayOfByte.field_catalog = EmojiInfo.tcH;
          paramq = paramArrayOfByte;
          break label824;
          paramArrayOfByte = new at();
          paramArrayOfByte.bIi.type = 0;
          paramArrayOfByte.bIi.bIk = paramq;
          com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfByte);
          if (!paramArrayOfByte.bIj.bGZ)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiInfoStorage", "decode failed re download.");
            paramq.field_temp = 2;
          }
        }
        paramInt1 += 1;
      }
      if (paramString != null) {
        paramString.gp(l1);
      }
      l1 = System.currentTimeMillis();
      if (localArrayList == null) {}
      for (paramInt1 = 0;; paramInt1 = localArrayList.size())
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDownloadCustomEmojiList user time:%d succes. size:%d", new Object[] { Long.valueOf(l1 - l2), Integer.valueOf(paramInt1) });
        break;
      }
      paramArrayOfByte = paramString.cnI();
      if (paramArrayOfByte.size() <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. sync list is null");
        break label499;
      }
      paramq = new ArrayList();
      paramArrayOfByte = paramArrayOfByte.iterator();
      while (paramArrayOfByte.hasNext())
      {
        localObject = (String)paramArrayOfByte.next();
        if (!localArrayList.contains(((String)localObject).toLowerCase()))
        {
          paramq.add(localObject);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] delete:%s", new Object[] { localObject });
        }
      }
      paramString.dt(paramq);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDeleteCustomEmojiList user time:%d succes. size:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), Integer.valueOf(paramq.size()) });
      break label499;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "emoji info list no contains md5:%s", new Object[] { paramArrayOfByte });
      break label675;
      paramq = i.aEx();
      paramInt1 = localArrayList.size();
      paramq.ije.ijp = paramInt1;
      i.aEx().s(paramString);
      i.aEx().ije.aEV();
      com.tencent.mm.plugin.report.service.h.mEJ.h(11595, new Object[] { Integer.valueOf(2) });
      if (ao.isWifi(ad.getContext())) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(11595, new Object[] { Integer.valueOf(3) });
      }
      for (;;)
      {
        com.tencent.mm.sdk.b.a.sFg.m(new nb());
        break;
        au.HU();
        c.DT().a(aa.a.sOY, Boolean.valueOf(false));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "no things need to download.");
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] do next scene. index:%d size:%d", new Object[] { Integer.valueOf(paramArrayOfByte.rgz), Integer.valueOf(paramq.rfd.size()) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      paramArrayOfByte.rgz = paramq.rgz;
      this.mIndex = paramArrayOfByte.rgz;
      a(paramq);
      paramInt2 = a(this.dIX, this.diJ);
      if (paramInt1 >= 0) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] doScene error.nextNetId:%d", new Object[] { Integer.valueOf(paramInt2) });
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      paramq = (ft)this.diG.dIE.dIL;
      if ((paramq.rgD == null) || (paramq.rgD.size() <= 0)) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "Change MD5 to URL failed.");
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        i.aEA().igx.dv(paramq.rgD);
      }
    }
  }
  
  public final int getType()
  {
    return 697;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */