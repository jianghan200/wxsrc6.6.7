package com.tencent.mm.plugin.readerapp.c;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.bj;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
  implements d
{
  public static boolean bpR()
  {
    return (q.GL() & 0x400) == 0;
  }
  
  public final d.b b(d.a parama)
  {
    by localby = parama.dIN;
    if (localby == null)
    {
      x.e("MicroMsg.ReaderAppMsgExtension", "onPreAddMessage cmdAM is null");
      return null;
    }
    g.bpT().aW(localby.rci);
    parama = ab.a(localby.rcl);
    long l1 = com.tencent.mm.sdk.platformtools.bi.VF();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
    int m = 0;
    ArrayList localArrayList = new ArrayList();
    k = 0;
    try
    {
      localMap = bl.z(parama, "mmreader");
      if (localMap == null) {
        return null;
      }
      i = 0;
      k = 0;
    }
    catch (Exception parama)
    {
      int i;
      for (;;)
      {
        Map localMap;
        label1597:
        j = k;
        i = m;
        x.printErrStackTrace("MicroMsg.ReaderAppMsgExtension", parama, "", new Object[0]);
        continue;
        i1 = 0;
        continue;
        i += 1;
        k = j;
        continue;
        j = k;
        continue;
        if (com.tencent.mm.sdk.platformtools.bi.oW(((com.tencent.mm.model.bi)localObject1).getUrl()))
        {
          x.e("MicroMsg.ReaderAppMsgExtension", "readerAppInfo.getUrl() is null, appInfo.tweetid = " + ((com.tencent.mm.model.bi)localObject1).Iv() + ", type = " + ((com.tencent.mm.model.bi)localObject1).type);
          k = 0;
        }
      }
      if (m <= 0) {
        break label2059;
      }
      localObject1 = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().Yq(com.tencent.mm.model.bi.he(j));
      if ((localObject1 != null) && (((am)localObject1).field_username.equals(com.tencent.mm.model.bi.he(j)))) {
        break label1994;
      }
      localObject2 = new ai();
      ((ai)localObject2).setUsername(com.tencent.mm.model.bi.he(j));
      if (parama != null) {
        break label1976;
      }
      localObject1 = "";
      ((ai)localObject2).setContent((String)localObject1);
      if (parama != null) {
        break label1985;
      }
      l1 = com.tencent.mm.sdk.platformtools.bi.VF();
      ((ai)localObject2).as(l1);
      ((ai)localObject2).eX(0);
      ((ai)localObject2).eV(i);
      ((i)com.tencent.mm.kernel.g.l(i.class)).FW().d((ai)localObject2);
      for (;;)
      {
        g.bpT().doNotify();
        parama = parama.getTitle();
        localObject1 = new bd();
        ((bd)localObject1).setContent(parama);
        ((bd)localObject1).ep(com.tencent.mm.model.bi.he(j));
        ((bd)localObject1).setType(1);
        ((bd)localObject1).setMsgId(7377812L);
        return new d.b((bd)localObject1, true);
        localObject1 = parama.getTitle();
        break;
        l1 = parama.time;
        break label1875;
        ((ai)localObject1).setContent(parama.getTitle());
        ((ai)localObject1).as(parama.time);
        ((ai)localObject1).eX(0);
        ((ai)localObject1).eV(((am)localObject1).field_unReadCount + i);
        ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a((ai)localObject1, com.tencent.mm.model.bi.he(j));
      }
      x.e("MicroMsg.ReaderAppMsgExtension", "insert error");
      return null;
    }
    if (i <= 0)
    {
      for (;;)
      {
        try
        {
          localObject1 = new StringBuilder(".mmreader.category");
          if (i <= 0) {
            continue;
          }
          parama = Integer.valueOf(i);
          parama = parama;
          j = com.tencent.mm.sdk.platformtools.bi.getInt((String)localMap.get(parama + ".$type"), 0);
          if (j != 0) {
            continue;
          }
          x.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".$type  error");
          j = k;
          boolean bool = bpR();
          x.d("MicroMsg.ReaderAppMsgExtension", "type = " + j + ", want to receive news? " + bool);
          parama = localArrayList.iterator();
          if (!parama.hasNext()) {
            continue;
          }
          localObject1 = (com.tencent.mm.model.bi)parama.next();
          if (!com.tencent.mm.sdk.platformtools.bi.oW(((com.tencent.mm.model.bi)localObject1).getTitle())) {
            continue;
          }
          x.e("MicroMsg.ReaderAppMsgExtension", "readerAppInfo.getTitle() is null, appInfo.tweetid = " + ((com.tencent.mm.model.bi)localObject1).Iv() + ", type = " + ((com.tencent.mm.model.bi)localObject1).type);
          k = 0;
        }
        catch (Exception parama)
        {
          String str1;
          String str2;
          Object localObject2;
          int i2;
          Object localObject3;
          String str3;
          com.tencent.mm.model.bi localbi;
          long l2;
          int i1;
          int j = k;
          continue;
          continue;
          continue;
          k = 1;
          continue;
          int n = 0;
          continue;
          parama = ".item";
          continue;
          Object localObject1 = "";
          continue;
          localObject1 = localObject2;
          continue;
        }
        if ((localArrayList.size() <= 0) || (k == 0)) {
          continue;
        }
        m = 0;
        parama = null;
        k = 0;
        if (k >= localArrayList.size()) {
          continue;
        }
        if (!g.bpT().a((com.tencent.mm.model.bi)localArrayList.get(k))) {
          continue;
        }
        if (parama != null) {
          continue;
        }
        parama = (com.tencent.mm.model.bi)localArrayList.get(k);
        parama.dCU = 1;
        m += 1;
        k += 1;
        continue;
        parama = "";
        continue;
        if ((j != 20) && (j != 11))
        {
          x.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".$type  error Type:" + j);
          j = k;
        }
        else
        {
          k = j;
          m = i;
          str1 = (String)localMap.get(parama + ".name");
          k = j;
          m = i;
          if (com.tencent.mm.sdk.platformtools.bi.oW(str1))
          {
            k = j;
            m = i;
            x.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".name  error");
          }
          else
          {
            k = j;
            m = i;
            str2 = (String)localMap.get(parama + ".topnew.cover");
            k = j;
            m = i;
            localObject2 = (String)localMap.get(parama + ".topnew.digest");
            k = j;
            m = i;
            i2 = com.tencent.mm.sdk.platformtools.bi.getInt((String)localMap.get(parama + ".$count"), 0);
            if (i2 != 0) {
              continue;
            }
            k = j;
            m = i;
            x.e("MicroMsg.ReaderAppMsgExtension", "get " + parama + ".$count  error");
          }
        }
      }
      if (i2 > 1)
      {
        k = j;
        m = i;
        localObject1 = new StringBuilder().append(parama);
        if (j != 20) {
          break label2096;
        }
        parama = ".newitem";
        k = j;
        m = i;
        parama = parama;
        break label2090;
        if (n >= i2) {
          break label1711;
        }
        k = j;
        m = i;
        localObject3 = new StringBuilder().append(parama);
        if (n <= 0) {
          break label2103;
        }
        k = j;
        m = i;
        localObject1 = Integer.valueOf(n);
        k = j;
        m = i;
        str3 = localObject1;
        k = j;
        m = i;
        localbi = new com.tencent.mm.model.bi();
        k = j;
        m = i;
        localbi.dCW = localby.rci;
        k = j;
        m = i;
        localbi.title = ((String)localMap.get(str3 + ".title"));
        if (n != 0) {
          break label1597;
        }
        k = j;
        m = i;
        l2 = com.tencent.mm.sdk.platformtools.bi.getLong((String)localMap.get(str3 + ".pub_time"), 0L);
        if (l2 > 0L) {
          l1 = 1000L * l2;
        }
        k = j;
        m = i;
        localbi.dCU = 1;
        k = j;
        m = i;
        localbi.dzy = str2;
        k = j;
        m = i;
        if (!com.tencent.mm.sdk.platformtools.bi.oW((String)localObject2)) {
          break label2110;
        }
        k = j;
        m = i;
        localObject1 = (String)localMap.get(str3 + ".digest");
        k = j;
        m = i;
      }
      for (localbi.dzA = ((String)localObject1);; localbi.dzA = ((String)localMap.get(str3 + ".digest")))
      {
        k = j;
        m = i;
        if (!localMap.containsKey(str3 + ".vedio")) {
          break label1705;
        }
        i1 = 1;
        k = j;
        m = i;
        localbi.dCV = i1;
        k = j;
        m = i;
        localbi.url = ((String)localMap.get(str3 + ".url"));
        k = j;
        m = i;
        localbi.dCP = ((String)localMap.get(str3 + ".shorturl"));
        k = j;
        m = i;
        localbi.dCQ = ((String)localMap.get(str3 + ".longurl"));
        k = j;
        m = i;
        localbi.dCR = com.tencent.mm.sdk.platformtools.bi.getLong((String)localMap.get(str3 + ".pub_time"), 0L);
        k = j;
        m = i;
        localObject3 = (String)localMap.get(str3 + ".tweetid");
        if (localObject3 != null)
        {
          localObject1 = localObject3;
          k = j;
          m = i;
          if (!"".equals(localObject3)) {}
        }
        else
        {
          k = j;
          m = i;
          localObject1 = new Date(System.currentTimeMillis() + n);
          k = j;
          m = i;
          localObject1 = "N" + localSimpleDateFormat.format((Date)localObject1);
          k = j;
          m = i;
          x.d("MicroMsg.ReaderAppMsgExtension", "create tweetID = " + (String)localObject1);
        }
        k = j;
        m = i;
        localbi.dCO = ((String)localObject1);
        k = j;
        m = i;
        localbi.dCS = ((String)localMap.get(str3 + ".sources.source.name"));
        k = j;
        m = i;
        localbi.dCT = ((String)localMap.get(str3 + ".sources.source.icon"));
        k = j;
        m = i;
        localbi.time = (i + l1);
        k = j;
        m = i;
        localbi.type = j;
        k = j;
        m = i;
        localbi.name = str1;
        k = j;
        m = i;
        localArrayList.add(localbi);
        n += 1;
        break;
        k = j;
        m = i;
        parama = parama + ".item";
        break label2090;
        k = j;
        m = i;
        localbi.dzy = ((String)localMap.get(str3 + ".cover"));
        k = j;
        m = i;
      }
    }
    label1705:
    label1711:
    label1875:
    label1976:
    label1985:
    label1994:
    label2059:
    return null;
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/readerapp/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */