package com.tencent.mm.plugin.talkroom.model;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.l.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.c.bsm;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
  implements com.tencent.mm.ab.d
{
  private static int Oq(String paramString)
  {
    int i = 0;
    if (!bi.oW(paramString)) {}
    try
    {
      i = Integer.valueOf(paramString).intValue();
      return i;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.TalkRoomExtension", paramString, "", new Object[0]);
    }
    return 0;
  }
  
  private static String br(List<bsm> paramList)
  {
    Object localObject = b.bGT().aZp();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    label160:
    label165:
    for (;;)
    {
      bsm localbsm;
      if (paramList.hasNext())
      {
        localbsm = (bsm)paramList.next();
        Iterator localIterator = ((List)localObject).iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((bsm)localIterator.next()).hbL.equals(localbsm.hbL));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label165;
        }
        localLinkedList.add(localbsm.hbL);
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
            break label160;
          }
          localObject = (String)localLinkedList.get(i);
          paramList = (List<bsm>)localObject;
          if (!((String)localObject).equals(q.GF())) {
            break;
          }
          i += 1;
        }
        return null;
      }
    }
  }
  
  private static String bs(List<bsm> paramList)
  {
    Object localObject = b.bGT().aZp();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    label160:
    label165:
    for (;;)
    {
      bsm localbsm;
      if (((Iterator)localObject).hasNext())
      {
        localbsm = (bsm)((Iterator)localObject).next();
        Iterator localIterator = paramList.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((bsm)localIterator.next()).hbL.equals(localbsm.hbL));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label165;
        }
        localLinkedList.add(localbsm.hbL);
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
            break label160;
          }
          localObject = (String)localLinkedList.get(i);
          paramList = (List<bsm>)localObject;
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
    int k = 1;
    Object localObject2 = parama.dIN;
    if (localObject2 == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM is null");
      return null;
    }
    if (((by)localObject2).jQd != 56)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM.type:%d", new Object[] { Integer.valueOf(((by)localObject2).jQd) });
      return null;
    }
    Object localObject1 = com.tencent.mm.platformtools.ab.a(((by)localObject2).rcj);
    parama = com.tencent.mm.platformtools.ab.a(((by)localObject2).rck);
    au.HU();
    if (((String)c.DT().get(2, null)).equals(localObject1)) {
      localObject1 = parama;
    }
    for (;;)
    {
      au.HU();
      parama = c.FR().Yg((String)localObject1);
      if ((parama == null) || ((int)parama.dhP == 0))
      {
        au.HU();
        c.FR().T(new com.tencent.mm.storage.ab((String)localObject1));
      }
      parama = com.tencent.mm.platformtools.ab.a(((by)localObject2).rcl);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomExtension", "talkroom xml:" + parama);
      localObject2 = bl.z(parama, "talkroominfo");
      if (localObject2 == null) {
        break;
      }
      for (;;)
      {
        try
        {
          if (Oq((String)((Map)localObject2).get(".talkroominfo.tracksysmsgtype")) != 0) {
            break label504;
          }
          Oq((String)((Map)localObject2).get(".talkroominfo.sysmsgtype"));
          i = 1;
          LinkedList localLinkedList = new LinkedList();
          Oq((String)((Map)localObject2).get(".talkroominfo.membersize"));
          int j = 0;
          Object localObject3 = new StringBuilder(".talkroominfo.memberlist.member");
          if (j == 0)
          {
            parama = "";
            localObject3 = parama;
            parama = (String)((Map)localObject2).get((String)localObject3 + ".username");
            if (!bi.oW(parama))
            {
              int m = Oq((String)((Map)localObject2).get((String)localObject3 + ".memberid"));
              localObject3 = new bsm();
              ((bsm)localObject3).hbL = parama;
              ((bsm)localObject3).spS = m;
              localLinkedList.add(localObject3);
              j += 1;
            }
          }
          else
          {
            parama = Integer.valueOf(j);
            continue;
          }
          if (!((String)localObject1).equals(b.bGT().owU)) {
            break label496;
          }
          localObject2 = br(localLinkedList);
          if (bi.oW((String)localObject2))
          {
            parama = bs(localLinkedList);
            localObject3 = b.bGU();
            j = k;
            if (i != 0) {
              j = 0;
            }
            ((e)localObject3).a((String)localObject1, localLinkedList, (String)localObject2, parama, j);
            return null;
          }
        }
        catch (Exception parama)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TalkRoomExtension", "parsing memList xml failed");
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.TalkRoomExtension", parama, "", new Object[0]);
          return null;
        }
        parama = null;
        continue;
        label496:
        parama = null;
        localObject2 = null;
        continue;
        label504:
        int i = 0;
      }
    }
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */