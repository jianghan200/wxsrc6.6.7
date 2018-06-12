package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class n
  extends i<m>
{
  public static final String[] diD = { i.a(m.dhO, "BackupTempMoveTime") };
  public e diF;
  
  public n(h paramh)
  {
    super(paramh, m.dhO, "BackupTempMoveTime", null);
    this.diF = paramh;
  }
  
  public final void a(LinkedList<String> paramLinkedList1, LinkedList<Long> paramLinkedList2, LinkedList<String> paramLinkedList3, LinkedList<Long> paramLinkedList4)
  {
    if (getCount() <= 0)
    {
      paramLinkedList3.addAll(paramLinkedList1);
      paramLinkedList4.addAll(paramLinkedList2);
    }
    label32:
    String str;
    int i;
    long l1;
    do
    {
      return;
      paramLinkedList2 = paramLinkedList2.iterator();
      Iterator localIterator = paramLinkedList1.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        str = (String)localIterator.next();
        i = 0;
      } while (!paramLinkedList2.hasNext());
      l1 = ((Long)paramLinkedList2.next()).longValue();
    } while (!paramLinkedList2.hasNext());
    long l3 = ((Long)paramLinkedList2.next()).longValue();
    long l2 = l3;
    if (l3 == 0L) {
      l2 = Long.MAX_VALUE;
    }
    paramLinkedList1 = new LinkedList();
    Object localObject = "SELECT * FROM BackupTempMoveTime WHERE sessionName = \"" + str + "\" ";
    x.d("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession:" + (String)localObject);
    localObject = this.diF.rawQuery((String)localObject, null);
    if (localObject == null)
    {
      x.e("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession failed, sessionName:%s ", new Object[] { str });
      paramLinkedList1 = null;
    }
    for (;;)
    {
      if ((paramLinkedList1 != null) && (paramLinkedList1.size() > 0) && (l2 >= ((es)paramLinkedList1.getFirst()).startTime) && (l1 <= ((es)paramLinkedList1.getLast()).endTime)) {
        break label360;
      }
      paramLinkedList3.add(str);
      paramLinkedList4.add(Long.valueOf(l1));
      paramLinkedList4.add(Long.valueOf(l2));
      break;
      while (((Cursor)localObject).moveToNext())
      {
        m localm = new m();
        localm.d((Cursor)localObject);
        es locales = new es();
        locales.startTime = localm.field_startTime;
        locales.endTime = localm.field_endTime;
        paramLinkedList1.add(locales);
      }
      ((Cursor)localObject).close();
    }
    label360:
    int j = 0;
    label363:
    int k;
    if ((j < paramLinkedList1.size()) && (l1 <= l2))
    {
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
        break label32;
      }
      paramLinkedList3.add(str);
      paramLinkedList4.add(Long.valueOf(l1));
      paramLinkedList4.add(Long.valueOf(l2));
      break label32;
      break;
      paramLinkedList4.add(Long.valueOf(((es)localObject).startTime));
      l3 = ((es)localObject).endTime;
      k = i;
      j += 1;
      i = k;
      l1 = l3;
      break label363;
    }
  }
  
  public final boolean ckt()
  {
    boolean bool = this.diF.fV("BackupTempMoveTime", "delete from BackupTempMoveTime");
    x.i("MicroMsg.BackupTempMoveTimeStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/storage/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */