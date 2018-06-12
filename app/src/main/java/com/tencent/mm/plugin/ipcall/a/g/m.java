package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public final class m
{
  public static k a(k paramk, long paramLong)
  {
    k localk;
    if (paramk == null) {
      localk = null;
    }
    do
    {
      return localk;
      x.d("MicroMsg.IPCallRecordStorageLogic", "recordSelfShutdownCall, localId: %d, talkTime: %d", new Object[] { Long.valueOf(paramk.sKx), Long.valueOf(paramLong) });
      localk = paramk;
    } while (paramk.sKx == -1L);
    paramk.field_status = 4;
    paramk.field_duration = paramLong;
    i.aXw().a(paramk);
    return paramk;
  }
  
  public static ArrayList<k> aXY()
  {
    long l2 = System.currentTimeMillis();
    Object localObject1 = i.aXw();
    Object localObject2 = Calendar.getInstance();
    ((Calendar)localObject2).add(6, -30);
    long l1 = ((Calendar)localObject2).getTimeInMillis();
    localObject1 = ((l)localObject1).diF.query("IPCallRecord", l.ksH, "calltime>=?", new String[] { String.valueOf(l1) }, "addressId, phonenumber", null, "calltime desc");
    if (((Cursor)localObject1).getCount() < 30)
    {
      ((Cursor)localObject1).close();
      localObject1 = i.aXw().diF.query("IPCallRecord", l.ksH, null, null, "addressId, phonenumber", null, "calltime desc");
    }
    for (;;)
    {
      x.d("MicroMsg.IPCallRecordStorageLogic", "finish query used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      HashMap localHashMap = new HashMap();
      localObject2 = new ArrayList();
      for (;;)
      {
        k localk1;
        try
        {
          if (!((Cursor)localObject1).moveToFirst()) {
            break label623;
          }
          if ((((Cursor)localObject1).isAfterLast()) || (((ArrayList)localObject2).size() > 30)) {
            break label623;
          }
          localk1 = new k();
          localk1.d((Cursor)localObject1);
          if (localk1.field_addressId != -1L)
          {
            if (!localHashMap.containsKey(localk1.field_addressId))
            {
              localHashMap.put(localk1.field_addressId, localk1);
              ((ArrayList)localObject2).add(localk1);
            }
            ((Cursor)localObject1).moveToNext();
            continue;
          }
          Object localObject5;
          k localk2;
          l1 = -1L;
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser error: %s", new Object[] { localException.getMessage() });
          ((Cursor)localObject1).close();
          x.d("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser, used: %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          return (ArrayList<k>)localObject2;
          localObject4 = a.aw(ad.getContext(), localk1.field_phonenumber);
          localObject4 = i.aXv().EQ((String)localObject4);
          if (localObject4 == null) {
            break label586;
          }
          localObject5 = i.aXw();
          if ((((l)localObject5).diF instanceof h))
          {
            l1 = ((h)((l)localObject5).diF).dO(-1L);
            localObject5 = i.aXw().ET(localk1.field_phonenumber);
            if (!((Cursor)localObject5).moveToFirst()) {
              break label486;
            }
            if (((Cursor)localObject5).isAfterLast()) {
              break label486;
            }
            localk2 = new k();
            localk2.d((Cursor)localObject5);
            localk2.field_addressId = ((c)localObject4).sKx;
            i.aXw().a(localk2);
            ((Cursor)localObject5).moveToNext();
            continue;
          }
        }
        finally
        {
          ((Cursor)localObject1).close();
        }
        continue;
        label486:
        Object localObject4 = i.aXw();
        if (((((l)localObject4).diF instanceof h)) && (l1 != -1L)) {
          ((h)((l)localObject4).diF).gp(l1);
        }
        if (!localException.containsKey(localk1.field_addressId))
        {
          localException.put(localk1.field_addressId, localk1);
          ((ArrayList)localObject3).add(localk1);
          continue;
          label586:
          if (!localException.containsKey(localk1.field_phonenumber))
          {
            localException.put(localk1.field_phonenumber, localk1);
            ((ArrayList)localObject3).add(localk1);
            continue;
            label623:
            ((Cursor)localObject1).close();
          }
        }
      }
    }
  }
  
  public static k b(k paramk)
  {
    k localk;
    if (paramk == null) {
      localk = null;
    }
    do
    {
      return localk;
      x.d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", new Object[] { Long.valueOf(paramk.sKx) });
      localk = paramk;
    } while (paramk.sKx == -1L);
    paramk.field_status = 7;
    i.aXw().a(paramk);
    return paramk;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */