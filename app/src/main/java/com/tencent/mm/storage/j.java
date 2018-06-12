package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.et;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(i.dhO, "BackupMoveTime") };
  public e diF;
  
  public j(h paramh)
  {
    super(paramh, i.dhO, "BackupMoveTime", null);
    this.diF = paramh;
    long l1 = System.currentTimeMillis();
    long l2 = paramh.dO(Thread.currentThread().getId());
    long l3 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(Arrays.asList(new String[] { "CREATE INDEX IF NOT EXISTS DeviceIdSessionIndex ON BackupMoveTime ( deviceId,sessionName )" }));
    int i = 0;
    while (i < localArrayList.size())
    {
      paramh.fV("BackupMoveTime", (String)localArrayList.get(i));
      i += 1;
    }
    x.d("MicroMsg.BackupMoveTimeStorage", "build new index last time[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l3) });
    paramh.gp(l2);
    x.i("MicroMsg.BackupMoveTimeStorage", "executeInitSQL last time[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  private static void a(LinkedList<es> paramLinkedList, m paramm)
  {
    if (paramm.field_startTime > paramm.field_endTime) {}
    for (;;)
    {
      return;
      Object localObject = paramLinkedList.iterator();
      es locales1;
      int i;
      for (;;)
      {
        if (((Iterator)localObject).hasNext())
        {
          locales1 = (es)((Iterator)localObject).next();
          if (paramm.field_startTime < locales1.endTime) {
            if (paramm.field_endTime < locales1.startTime)
            {
              localObject = new es();
              ((es)localObject).startTime = paramm.field_startTime;
              ((es)localObject).endTime = paramm.field_endTime;
              paramLinkedList.add(localObject);
              i = 1;
            }
          }
        }
      }
      while (i == 0)
      {
        localObject = new es();
        ((es)localObject).startTime = paramm.field_startTime;
        ((es)localObject).endTime = paramm.field_endTime;
        paramLinkedList.add(localObject);
        return;
        if (paramm.field_startTime < locales1.startTime) {
          locales1.startTime = paramm.field_startTime;
        }
        if (paramm.field_endTime > locales1.endTime)
        {
          locales1.endTime = paramm.field_endTime;
          for (;;)
          {
            if (!((Iterator)localObject).hasNext()) {
              break label251;
            }
            es locales2 = (es)((Iterator)localObject).next();
            if (paramm.field_endTime <= locales2.startTime) {
              break label251;
            }
            if (paramm.field_endTime <= locales2.endTime)
            {
              locales1.endTime = locales2.endTime;
              ((Iterator)localObject).remove();
              i = 1;
              break;
            }
            ((Iterator)localObject).remove();
          }
        }
        label251:
        i = 1;
        continue;
        i = 0;
      }
    }
  }
  
  public final void a(String paramString, LinkedList<String> paramLinkedList1, LinkedList<Long> paramLinkedList2, LinkedList<String> paramLinkedList3, LinkedList<Long> paramLinkedList4)
  {
    paramLinkedList2 = paramLinkedList2.iterator();
    Iterator localIterator = paramLinkedList1.iterator();
    String str;
    int i;
    long l1;
    long l3;
    long l2;
    Object localObject;
    label324:
    int j;
    label332:
    int k;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        i = 0;
        if (paramLinkedList2.hasNext())
        {
          l1 = ((Long)paramLinkedList2.next()).longValue();
          if (paramLinkedList2.hasNext())
          {
            l3 = ((Long)paramLinkedList2.next()).longValue();
            l2 = l3;
            if (l3 == 0L) {
              l2 = Long.MAX_VALUE;
            }
            paramLinkedList1 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + paramString + "\" AND sessionName = \"" + str + "\" ";
            x.d("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession:" + paramLinkedList1);
            paramLinkedList1 = this.diF.rawQuery(paramLinkedList1, null);
            if (paramLinkedList1 == null)
            {
              x.e("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession failed, deviceid:%s, sessionName:%s ", new Object[] { paramString, str });
              paramLinkedList1 = null;
            }
            for (;;)
            {
              if ((paramLinkedList1 != null) && (paramLinkedList1.rfg.size() > 0) && (l2 >= ((es)paramLinkedList1.rfg.getFirst()).startTime) && (l1 <= ((es)paramLinkedList1.rfg.getLast()).endTime)) {
                break label324;
              }
              paramLinkedList3.add(str);
              paramLinkedList4.add(Long.valueOf(l1));
              paramLinkedList4.add(Long.valueOf(l2));
              break;
              if (paramLinkedList1.moveToFirst())
              {
                localObject = new i();
                ((i)localObject).d(paramLinkedList1);
                paramLinkedList1.close();
                paramLinkedList1 = ((i)localObject).field_moveTime;
              }
              else
              {
                paramLinkedList1.close();
                paramLinkedList1 = null;
              }
            }
            paramLinkedList1 = paramLinkedList1.rfg;
            j = 0;
            if ((j >= paramLinkedList1.size()) || (l1 > l2)) {
              break label566;
            }
            localObject = (es)paramLinkedList1.get(j);
            k = i;
            l3 = l1;
            if (l1 <= ((es)localObject).endTime) {
              if (l1 < ((es)localObject).startTime)
              {
                i = 1;
                paramLinkedList3.add(str);
                paramLinkedList4.add(Long.valueOf(l1));
                if (l2 < ((es)localObject).startTime)
                {
                  paramLinkedList4.add(Long.valueOf(l2));
                  l1 = ((es)localObject).startTime;
                  i = 1;
                }
              }
            }
          }
        }
      }
    }
    label566:
    for (;;)
    {
      if (l1 <= l2)
      {
        paramLinkedList3.add(str);
        paramLinkedList4.add(Long.valueOf(l1));
        paramLinkedList4.add(Long.valueOf(l2));
        i = 1;
      }
      if (i != 0) {
        break;
      }
      paramLinkedList3.add(str);
      paramLinkedList4.add(Long.valueOf(l1));
      paramLinkedList4.add(Long.valueOf(l2));
      break;
      paramLinkedList4.add(Long.valueOf(((es)localObject).startTime));
      l3 = ((es)localObject).endTime;
      k = i;
      j += 1;
      i = k;
      l1 = l3;
      break label332;
      return;
    }
  }
  
  public final boolean ckt()
  {
    boolean bool = this.diF.fV("BackupMoveTime", "delete from BackupMoveTime");
    x.i("MicroMsg.BackupMoveTimeStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final void d(String paramString, LinkedList<m> paramLinkedList)
  {
    x.i("MicroMsg.BackupMoveTimeStorage", "start mergeDataByDeviceIdSession.");
    HashMap localHashMap = new HashMap();
    Object localObject1 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + paramString + "\" ";
    x.d("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice:" + (String)localObject1);
    localObject1 = this.diF.rawQuery((String)localObject1, null);
    if (localObject1 == null)
    {
      x.e("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice failed, deviceid:%s", new Object[] { paramString });
      if (this.diF.delete("BackupMoveTime", "deviceId= ? ", new String[] { paramString }) >= 0) {
        break label187;
      }
      x.e("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId delete db failed, deviceid:%s", new Object[] { paramString });
    }
    for (;;)
    {
      return;
      Object localObject2;
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = new i();
        ((i)localObject2).d((Cursor)localObject1);
        localHashMap.put(((i)localObject2).field_sessionName, localObject2);
      }
      ((Cursor)localObject1).close();
      break;
      label187:
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        localObject1 = (m)paramLinkedList.next();
        localObject2 = (i)localHashMap.get(((m)localObject1).field_sessionName);
        if (localObject2 == null)
        {
          localObject2 = new es();
          ((es)localObject2).startTime = ((m)localObject1).field_startTime;
          ((es)localObject2).endTime = ((m)localObject1).field_endTime;
          i locali = new i();
          locali.field_deviceId = paramString;
          locali.field_sessionName = ((m)localObject1).field_sessionName;
          locali.field_moveTime = new et();
          locali.field_moveTime.rfg = new LinkedList();
          locali.field_moveTime.rfg.add(localObject2);
          localHashMap.put(((m)localObject1).field_sessionName, locali);
        }
        else
        {
          a(((i)localObject2).field_moveTime.rfg, (m)localObject1);
        }
      }
      paramString = localHashMap.keySet().iterator();
      while (paramString.hasNext())
      {
        paramLinkedList = (String)paramString.next();
        x.i("MicroMsg.BackupMoveTimeStorage", "summerbak insert BackupMoveTimeStorage ret[%b], sessionName:%s", new Object[] { Boolean.valueOf(b((c)localHashMap.get(paramLinkedList))), paramLinkedList });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */