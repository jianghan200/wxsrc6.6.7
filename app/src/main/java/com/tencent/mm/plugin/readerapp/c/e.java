package com.tencent.mm.plugin.readerapp.c;

import android.content.Context;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.bj;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.readerapp.a.g;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.r.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e
  implements f
{
  public static e mnr = new e();
  
  private static List<com.tencent.mm.model.bi> a(by paramby, String paramString)
  {
    Object localObject2 = ab.a(paramby.rcl).trim();
    Object localObject1 = localObject2;
    if (((String)localObject2).indexOf("<") != -1) {
      localObject1 = ((String)localObject2).substring(((String)localObject2).indexOf("<"));
    }
    long l = paramby.lOH;
    x.d("MicroMsg.ReaderFuncMsgUpdateMgr", "parseMsg, createTime: %s, content: %s", new Object[] { Integer.valueOf(paramby.lOH), localObject1 });
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
    ArrayList localArrayList = new ArrayList();
    Map localMap;
    int i;
    label130:
    int m;
    try
    {
      localMap = bl.z((String)localObject1, "mmreader");
      i = 0;
      if (i > 0) {
        break label1291;
      }
      localObject2 = new StringBuilder(".mmreader.category");
      if (i <= 0) {
        break label1294;
      }
      localObject1 = Integer.valueOf(i);
      localObject1 = localObject1;
      m = com.tencent.mm.sdk.platformtools.bi.getInt((String)localMap.get((String)localObject1 + ".$type"), 0);
      if (m == 0) {
        x.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".$type  error");
      } else if ((m != 20) && (m != 11)) {
        x.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".$type  error Type:" + m);
      }
    }
    catch (Exception paramby)
    {
      x.printErrStackTrace("MicroMsg.ReaderFuncMsgUpdateMgr", paramby, "", new Object[0]);
      x.e("MicroMsg.ReaderFuncMsgUpdateMgr", "parseMsg error: %s", new Object[] { paramby.getMessage() });
      return null;
    }
    String str2 = (String)localMap.get((String)localObject1 + ".name");
    String str1;
    label531:
    label546:
    int j;
    Object localObject3;
    label576:
    String str4;
    com.tencent.mm.model.bi localbi;
    if (com.tencent.mm.sdk.platformtools.bi.oW(str2))
    {
      x.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".name  error");
    }
    else
    {
      String str3 = (String)localMap.get((String)localObject1 + ".topnew.cover");
      str1 = (String)localMap.get((String)localObject1 + ".topnew.digest");
      int n = com.tencent.mm.sdk.platformtools.bi.getInt((String)localMap.get((String)localObject1 + ".$count"), 0);
      if (n == 0)
      {
        x.e("MicroMsg.ReaderFuncMsgUpdateMgr", "get " + (String)localObject1 + ".$count  error");
      }
      else if (n > 1)
      {
        localObject2 = new StringBuilder().append((String)localObject1);
        if (m != 20) {
          break label1306;
        }
        localObject1 = ".newitem";
        localObject1 = (String)localObject1;
        break label1301;
        if (j >= n) {
          break label1284;
        }
        localObject3 = new StringBuilder().append((String)localObject1);
        if (j <= 0) {
          break label1314;
        }
        localObject2 = Integer.valueOf(j);
        str4 = localObject2;
        localbi = new com.tencent.mm.model.bi();
        localbi.dCW = paramby.rci;
        localbi.title = ((String)localMap.get(str4 + ".title"));
        if (j != 0) {
          break label1204;
        }
        localbi.dCU = 1;
        localbi.dzy = str3;
        if (!com.tencent.mm.sdk.platformtools.bi.oW(str1)) {
          break label1321;
        }
      }
    }
    label706:
    label1204:
    label1284:
    label1291:
    label1294:
    label1301:
    label1306:
    label1314:
    label1321:
    for (localObject2 = (String)localMap.get(str4 + ".digest");; localObject2 = str1)
    {
      localbi.dzA = ((String)localObject2);
      if (localMap.containsKey(str4 + ".vedio")) {}
      for (int k = 1;; k = 0)
      {
        localbi.dCV = k;
        localbi.url = ((String)localMap.get(str4 + ".url"));
        localbi.dCP = ((String)localMap.get(str4 + ".shorturl"));
        localbi.dCQ = ((String)localMap.get(str4 + ".longurl"));
        localbi.dCR = com.tencent.mm.sdk.platformtools.bi.getLong((String)localMap.get(str4 + ".pub_time"), 0L);
        localObject3 = (String)localMap.get(str4 + ".tweetid");
        if (localObject3 != null)
        {
          localObject2 = localObject3;
          if (!"".equals(localObject3)) {}
        }
        else
        {
          localObject2 = new Date(System.currentTimeMillis() + j);
          localObject2 = "N" + localSimpleDateFormat.format((Date)localObject2);
          x.d("MicroMsg.ReaderFuncMsgUpdateMgr", "create tweetID = " + (String)localObject2);
        }
        localbi.dCO = ((String)localObject2);
        localbi.dCS = ((String)localMap.get(str4 + ".sources.source.name"));
        localbi.dCT = ((String)localMap.get(str4 + ".sources.source.icon"));
        localbi.time = (i + l * 1000L);
        localbi.type = m;
        localbi.name = str2;
        localbi.dCX = paramString;
        localArrayList.add(localbi);
        x.d("MicroMsg.ReaderFuncMsgUpdateMgr", "parse info, pubtime: %s, time: %s", new Object[] { com.tencent.mm.pluginsdk.f.h.h(ad.getContext().getString(a.g.fmt_date), localbi.dCR), com.tencent.mm.pluginsdk.f.h.c(ad.getContext(), localbi.time, false) });
        j += 1;
        break;
        localObject1 = (String)localObject1 + ".item";
        break label1301;
        localbi.dzy = ((String)localMap.get(str4 + ".cover"));
        localbi.dzA = ((String)localMap.get(str4 + ".digest"));
        break label706;
      }
      i += 1;
      break;
      return localArrayList;
      localObject1 = "";
      break label130;
      j = 0;
      break label546;
      localObject1 = ".item";
      break label531;
      localObject2 = "";
      break label576;
    }
  }
  
  public final void a(int paramInt, Map<String, by> paramMap, boolean paramBoolean)
  {
    x.i("MicroMsg.ReaderFuncMsgUpdateMgr", "onFunctionMsgUpdate, op: %s, msgIdMap.size: %s, needUpdateTime: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramMap.size()), Boolean.valueOf(paramBoolean) });
    Iterator localIterator1 = paramMap.keySet().iterator();
    Object localObject3;
    Object localObject1;
    Object localObject4;
    long l;
    label150:
    Object localObject2;
    label259:
    int i;
    int k;
    if (localIterator1.hasNext())
    {
      localObject3 = (String)localIterator1.next();
      localObject1 = (by)paramMap.get(localObject3);
      localObject4 = a((by)localObject1, (String)localObject3);
      if (localObject4 != null)
      {
        l = ((by)localObject1).lOH * 1000L;
        if ((localObject4 != null) && (((List)localObject4).size() != 0)) {
          break label150;
        }
      }
      do
      {
        for (;;)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(13440, new Object[] { Integer.valueOf(1) });
          break;
          x.i("MicroMsg.ReaderFuncMsgUpdateMgr", "processInfoList, op: %s, infoList.size: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(((List)localObject4).size()) });
          if (paramInt != 1) {
            break label259;
          }
          localObject1 = ((List)localObject4).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (com.tencent.mm.model.bi)((Iterator)localObject1).next();
            x.i("MicroMsg.ReaderFuncMsgUpdateMgr", "delete info, functionMsgId: %s", new Object[] { ((com.tencent.mm.model.bi)localObject2).IB() });
            g.bpT().b(((com.tencent.mm.model.bi)localObject2).IB(), ((com.tencent.mm.model.bi)localObject2).type, true, true);
          }
        }
      } while (paramInt != 0);
      localObject2 = null;
      i = 0;
      k = 0;
      List localList = g.bpT().H((String)localObject3, ((com.tencent.mm.model.bi)((List)localObject4).get(0)).type);
      localObject1 = null;
      x.i("MicroMsg.ReaderFuncMsgUpdateMgr", "update info, functionMsgId: %s, oldInfoList: %s", new Object[] { localObject3, localList });
      int j = 0;
      Iterator localIterator2 = ((List)localObject4).iterator();
      for (;;)
      {
        if (localIterator2.hasNext())
        {
          localObject4 = (com.tencent.mm.model.bi)localIterator2.next();
          localObject3 = localObject2;
          if (localObject2 == null)
          {
            k = ((com.tencent.mm.model.bi)localObject4).type;
            ((com.tencent.mm.model.bi)localObject4).dCU = 1;
            localObject3 = localObject4;
          }
          if (localList == null)
          {
            x.i("MicroMsg.ReaderFuncMsgUpdateMgr", "update info, insert new msg, functionMsgId: %s", new Object[] { ((com.tencent.mm.model.bi)localObject4).IB() });
            i += 1;
            g.bpT().a((com.tencent.mm.model.bi)localObject4);
            localObject2 = localObject3;
          }
          else if (paramBoolean)
          {
            ((com.tencent.mm.model.bi)localObject4).time = l;
            if (localObject3 != null) {
              ((com.tencent.mm.model.bi)localObject3).time = l;
            }
            i += 1;
            label457:
            x.i("MicroMsg.ReaderFuncMsgUpdateMgr", "update info, update the exist one, functionMsgId: %s, time: %s", new Object[] { ((com.tencent.mm.model.bi)localObject4).IB(), Long.valueOf(((com.tencent.mm.model.bi)localObject4).time) });
            int m = j;
            if (j == 0)
            {
              g.bpT().b(((com.tencent.mm.model.bi)localObject4).IB(), ((com.tencent.mm.model.bi)localObject4).type, false, false);
              m = 1;
            }
            g.bpT().a((com.tencent.mm.model.bi)localObject4);
            j = m;
            localObject2 = localObject3;
          }
          else
          {
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              localObject1 = (com.tencent.mm.model.bi)localList.get(0);
              Iterator localIterator3 = localList.iterator();
              label569:
              localObject2 = localObject1;
              if (localIterator3.hasNext())
              {
                localObject2 = (com.tencent.mm.model.bi)localIterator3.next();
                if (((com.tencent.mm.model.bi)localObject2).dCU != 1) {
                  break label914;
                }
                localObject1 = localObject2;
              }
            }
          }
        }
      }
    }
    label723:
    label740:
    label790:
    label800:
    label810:
    label914:
    for (;;)
    {
      break label569;
      ((com.tencent.mm.model.bi)localObject4).time = ((com.tencent.mm.model.bi)localObject2).time;
      if (localObject3 != null) {
        ((com.tencent.mm.model.bi)localObject3).time = ((com.tencent.mm.model.bi)localObject2).time;
      }
      localObject1 = localObject2;
      break label457;
      if (i > 0)
      {
        localObject1 = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().Yq(com.tencent.mm.model.bi.he(k));
        if ((localObject1 != null) && (((am)localObject1).field_username.equals(com.tencent.mm.model.bi.he(k)))) {
          break label810;
        }
        localObject3 = new ai();
        ((ai)localObject3).setUsername(com.tencent.mm.model.bi.he(k));
        if (localObject2 != null) {
          break label790;
        }
        localObject1 = "";
        ((ai)localObject3).setContent((String)localObject1);
        if (localObject2 != null) {
          break label800;
        }
        l = com.tencent.mm.sdk.platformtools.bi.VF();
        ((ai)localObject3).as(l);
        ((ai)localObject3).eX(0);
        ((ai)localObject3).eV(1);
        ((i)com.tencent.mm.kernel.g.l(i.class)).FW().d((ai)localObject3);
      }
      for (;;)
      {
        g.bpT().doNotify();
        break;
        localObject1 = ((com.tencent.mm.model.bi)localObject2).getTitle();
        break label723;
        l = ((com.tencent.mm.model.bi)localObject2).time;
        break label740;
        ((ai)localObject1).as(((com.tencent.mm.model.bi)localObject2).time);
        ((ai)localObject1).eX(0);
        if (((!com.tencent.mm.sdk.platformtools.bi.oW(((com.tencent.mm.model.bi)localObject2).getTitle())) && (!((com.tencent.mm.model.bi)localObject2).getTitle().equals(((am)localObject1).field_content))) || (((am)localObject1).field_unReadCount == 0))
        {
          ((ai)localObject1).setContent(((com.tencent.mm.model.bi)localObject2).getTitle());
          ((ai)localObject1).eV(((am)localObject1).field_unReadCount + 1);
        }
        ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a((ai)localObject1, com.tencent.mm.model.bi.he(k));
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/readerapp/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */