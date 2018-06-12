package com.tencent.mm.plugin.location.model;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class n
  extends com.tencent.mm.model.e
{
  private static double FL(String paramString)
  {
    if (paramString == null) {
      return 0.0D;
    }
    return bi.getDouble(paramString, 0.0D);
  }
  
  private static String br(List<String> paramList)
  {
    Object localObject = l.aZi().aZp();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    label151:
    label156:
    for (;;)
    {
      String str;
      if (paramList.hasNext())
      {
        str = (String)paramList.next();
        Iterator localIterator = ((List)localObject).iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((String)localIterator.next()).equals(str));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label156;
        }
        localLinkedList.add(str);
        break;
        if (localLinkedList.isEmpty())
        {
          paramList = null;
          return paramList;
        }
        i = 0;
        for (;;)
        {
          if (i >= localLinkedList.size()) {
            break label151;
          }
          localObject = (String)localLinkedList.get(i);
          paramList = (List<String>)localObject;
          if (!((String)localObject).equals(q.GF())) {
            break;
          }
          i += 1;
        }
        return null;
      }
    }
  }
  
  private static String bs(List<String> paramList)
  {
    Object localObject = l.aZi().aZp();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    label151:
    label156:
    for (;;)
    {
      String str;
      if (((Iterator)localObject).hasNext())
      {
        str = (String)((Iterator)localObject).next();
        Iterator localIterator = paramList.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((String)localIterator.next()).equals(str));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label156;
        }
        localLinkedList.add(str);
        break;
        if (localLinkedList.isEmpty())
        {
          paramList = null;
          return paramList;
        }
        i = 0;
        for (;;)
        {
          if (i >= localLinkedList.size()) {
            break label151;
          }
          localObject = (String)localLinkedList.get(i);
          paramList = (List<String>)localObject;
          if (!((String)localObject).equals(q.GF())) {
            break;
          }
          i += 1;
        }
        return null;
      }
    }
  }
  
  public final d.b b(d.a parama)
  {
    Object localObject3 = parama.dIN;
    if (localObject3 == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TrackMsgExtension", "onPreAddMessage cmdAM is null");
    }
    LinkedList localLinkedList;
    Object localObject2;
    Object localObject1;
    Map localMap;
    do
    {
      return null;
      localLinkedList = new LinkedList();
      parama = ab.a(((by)localObject3).rcj);
      localObject2 = ab.a(((by)localObject3).rck);
      if (!((String)g.Ei().DT().get(2, null)).equals(parama)) {
        break;
      }
      localObject1 = localObject2;
      localObject3 = ab.a(((by)localObject3).rcl);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TrackMsgExtension", "cmd " + (String)localObject3);
      localMap = bl.z((String)localObject3, "sysmsg");
    } while (localMap == null);
    StringBuffer localStringBuffer;
    double d1;
    double d2;
    for (;;)
    {
      int i;
      try
      {
        localStringBuffer = new StringBuffer();
        localStringBuffer.append("talk  " + (String)localObject1 + "\r\n");
        localStringBuffer.append("from fromUser " + parama + "\r\n");
        localStringBuffer.append("from toUser " + (String)localObject2 + "\r\n");
        localObject3 = (String)localMap.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.addr");
        d1 = FL((String)localMap.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.latitude"));
        localStringBuffer.append("lat " + d1 + "\r\n");
        d2 = FL((String)localMap.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.longitude"));
        localStringBuffer.append("lng " + d2 + "\r\n");
        i = bi.getInt((String)localMap.get(".sysmsg.trackmsg.trackroominfo.timestamp"), 0);
        localStringBuffer.append("times " + i + "\r\n");
        i = 0;
        localObject2 = new StringBuilder(".sysmsg.trackmsg.trackroominfo.trackmemberlist.member");
        if (i != 0) {
          break label465;
        }
        parama = "";
        parama = parama;
        parama = (String)localMap.get(parama + ".username");
        if (bi.oW(parama)) {
          break label474;
        }
        i += 1;
        localLinkedList.add(parama);
        continue;
        localObject1 = parama;
      }
      catch (Exception parama)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.TrackMsgExtension", parama, "", new Object[0]);
        return null;
      }
      break;
      label465:
      parama = Integer.valueOf(i);
    }
    label474:
    localStringBuffer.append("userNameList size " + localLinkedList.size() + "\r\n");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrackMsgExtension", "xml : " + localStringBuffer.toString());
    if (((String)localObject1).equals(l.aZi().kDN))
    {
      localObject2 = br(localLinkedList);
      if (bi.oW((String)localObject2)) {
        parama = bs(localLinkedList);
      }
    }
    for (;;)
    {
      l.aZj().a((String)localObject1, localLinkedList, d1, d2, (String)localObject3, (String)localObject2, parama);
      return null;
      parama = null;
      continue;
      parama = null;
      localObject2 = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/location/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */