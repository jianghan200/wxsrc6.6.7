package com.tencent.mm.plugin.offline;

import android.database.Cursor;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import java.util.HashSet;
import java.util.Map;

public final class g
{
  public static String TAG = "MicroMsg.OfflineGetMsgLogic";
  public static int lII = 5000;
  private static int lIJ = 30000;
  private static int lIK = 5000;
  public static int lIL = 0;
  public static int lIM = 24;
  public static int lIN = 4;
  public static int lIO = 8;
  public static int lIP = 23;
  public static int lIQ = 6;
  public static int lIR = 5;
  public static int lIS = 20;
  public static int lIT = 20000;
  public static int lIU = 20001;
  public static int lIV = 10001;
  public static int lIW = lIK;
  public com.tencent.mm.ab.e lIX = new g.1(this);
  public boolean lIY = true;
  public al lIZ = new al(new g.2(this), false);
  public int status = 0;
  
  static
  {
    com.tencent.mm.kernel.g.Ek();
    Object localObject = com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sXl, null);
    int i;
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      lIW = i;
      if (i == 0) {
        lIW = lIK;
      }
    }
    com.tencent.mm.kernel.g.Ek();
    localObject = com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sXn, Integer.valueOf(0));
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      if (i != 0) {
        lIJ = i;
      }
    }
  }
  
  public g()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(385, this.lIX);
  }
  
  private static boolean a(r paramr)
  {
    boolean bool = false;
    if (paramr != null) {
      com.tencent.mm.sdk.platformtools.x.i(TAG, "isOrderClosed lastest status req_key=" + paramr.field_reqkey);
    }
    Object localObject = new HashSet();
    ((HashSet)localObject).add(Integer.valueOf(lIT));
    ((HashSet)localObject).add(Integer.valueOf(lIQ));
    ((HashSet)localObject).add(Integer.valueOf(lIR));
    ((HashSet)localObject).add(Integer.valueOf(lIN));
    ((HashSet)localObject).add(Integer.valueOf(-1));
    if ((paramr == null) || (((HashSet)localObject).contains(Integer.valueOf(paramr.field_status))))
    {
      localObject = TAG;
      StringBuilder localStringBuilder = new StringBuilder("isOrderClosed true;status==null?");
      if (paramr == null) {
        bool = true;
      }
      com.tencent.mm.sdk.platformtools.x.i((String)localObject, bool);
      if (paramr != null) {
        com.tencent.mm.sdk.platformtools.x.i(TAG, "isOrderClosed status.field_status=" + paramr.field_status);
      }
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.i(TAG, "isOrderClosed false");
    if (paramr != null)
    {
      com.tencent.mm.sdk.platformtools.x.i(TAG, "status=" + paramr.field_status + ";req_key=" + paramr.field_reqkey);
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i(TAG, "isOrderClosed status=null");
    return false;
  }
  
  private static boolean a(r paramr, int paramInt)
  {
    int i = paramInt;
    if (paramInt == lIN) {
      i = lIT;
    }
    boolean bool = de(paramr.field_status, i);
    com.tencent.mm.sdk.platformtools.x.i(TAG, "in changeStatus: isallow=%b; old status = %d; new status = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramr.field_status), Integer.valueOf(i) });
    if (bool)
    {
      paramr.field_status = i;
      k.bkO();
      k.bkS().b(paramr);
    }
    return bool;
  }
  
  public static void bR(String paramString, int paramInt)
  {
    if (!bi.oW(paramString))
    {
      k.bkO();
      localr = k.bkS().IX(paramString);
      if (localr != null) {
        a(localr, paramInt);
      }
    }
    else
    {
      return;
    }
    r localr = new r();
    localr.field_reqkey = paramString;
    localr.field_status = paramInt;
    k.bkO();
    k.bkS().b(localr);
  }
  
  public static int bkJ()
  {
    return lIJ;
  }
  
  public static void bkK()
  {
    com.tencent.mm.sdk.platformtools.x.i(TAG, "endAllOldOrder");
    k.bkO();
    com.tencent.mm.plugin.offline.b.a locala = k.bkS();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OfflineOrderStatusStorage", "end all orders to final status. orders count: %d, latest 3 orders: %s", new Object[] { Integer.valueOf(locala.bkY()), locala.bkX() });
    Object localObject = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1;", new Object[] { "rowid", "OfflineOrderStatus", "rowid" });
    localObject = locala.diF.b((String)localObject, null, 2);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders: error. cursor is null \n");
      l = 0L;
      if (l - 10L > 0L)
      {
        localObject = String.format("DELETE FROM %s WHERE %s < %d;", new Object[] { "OfflineOrderStatus", "rowid", Long.valueOf(l - 10L) });
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. sql: %s", new Object[] { Long.valueOf(l), localObject });
        locala.diF.fV("OfflineOrderStatus", (String)localObject);
        label186:
        localObject = "UPDATE OfflineOrderStatus SET status=" + lIT + " where status!=" + lIT;
        locala.diF.fV("OfflineOrderStatus", (String)localObject);
      }
    }
    else
    {
      ((Cursor)localObject).moveToFirst();
      if ((((Cursor)localObject).isAfterLast()) || (((Cursor)localObject).getColumnCount() <= 0)) {
        break label298;
      }
    }
    label298:
    for (long l = ((Cursor)localObject).getLong(0);; l = 0L)
    {
      ((Cursor)localObject).close();
      break;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. do nothing", new Object[] { Long.valueOf(l) });
      break label186;
    }
  }
  
  private static boolean de(int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i(TAG, "checkStatus from=" + paramInt1 + ";to=" + paramInt2);
    if (paramInt1 == paramInt2) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return false;
                  if (paramInt1 == lIL) {
                    return true;
                  }
                  if (paramInt1 != lIM) {
                    break;
                  }
                } while (paramInt2 == lIM);
                return true;
                if (paramInt1 != lIQ) {
                  break;
                }
              } while (paramInt2 != lIT);
              return true;
              if (paramInt1 != lIR) {
                break;
              }
            } while (paramInt2 != lIT);
            return true;
            if (paramInt1 != lIN) {
              break;
            }
          } while (paramInt2 != lIT);
          return true;
          if (paramInt1 != lIS) {
            break;
          }
        } while (paramInt2 != lIT);
        return true;
        if ((paramInt1 != lIO) && (paramInt1 != lIP)) {
          break;
        }
      } while ((paramInt2 != lIQ) && (paramInt2 != lIT));
      return true;
    } while ((paramInt1 != lIV) || ((paramInt2 != lIQ) && (paramInt2 != lIT)));
    return true;
  }
  
  public static boolean ec(String paramString1, String paramString2)
  {
    int i;
    Object localObject1;
    if (bi.oW(paramString2))
    {
      com.tencent.mm.sdk.platformtools.x.i(TAG, "shouldDeal appmsg is null");
      i = 0;
      if (i == 0) {
        break label1157;
      }
      k.bkO();
      localObject1 = k.bkS().bkW();
      paramString2 = bl.z(paramString2, "sysmsg");
      i = bi.getInt((String)paramString2.get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString2 = (String)paramString2.get(".sysmsg.paymsg.req_key");
      if (i != 24) {
        break label1032;
      }
      h.mEJ.a(135L, 58L, 1L, true);
      label92:
      if ((localObject1 == null) || (((r)localObject1).field_reqkey == null) || (!((r)localObject1).field_reqkey.equals(paramString2))) {
        break label1111;
      }
      a((r)localObject1, i);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i(TAG, "dealMsg true");
      return true;
      localObject1 = bl.z(paramString2, "sysmsg");
      String str3 = (String)((Map)localObject1).get(".sysmsg.paymsg.req_key");
      int j = bi.getInt((String)((Map)localObject1).get(".sysmsg.paymsg.PayMsgType"), -1);
      k.bkO();
      r localr1 = k.bkS().IX(str3);
      k.bkO();
      r localr2 = k.bkS().bkW();
      boolean bool2 = a(localr2);
      label229:
      String str1;
      Object localObject3;
      Object localObject2;
      boolean bool1;
      if (localr1 != null)
      {
        h.mEJ.a(135L, 63L, 1L, true);
        if (localr2 == null) {
          break label356;
        }
        str1 = TAG;
        localObject3 = "latestStatus: reqKey: %s, status:%d, isLatestClose: %b";
        localObject2 = new Object[3];
        localObject2[0] = localr2.field_reqkey;
        localObject2[1] = Integer.valueOf(localr2.field_status);
        i = 2;
        bool1 = bool2;
        localObject1 = localObject2;
      }
      for (;;)
      {
        localObject1[i] = Boolean.valueOf(bool1);
        com.tencent.mm.sdk.platformtools.x.i(str1, (String)localObject3, (Object[])localObject2);
        if (localr1 != null) {
          break label543;
        }
        if (localr2 != null) {
          break label440;
        }
        com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d; cannot get latest order in local storage. return true", new Object[] { str3, Integer.valueOf(j) });
        i = 1;
        break;
        h.mEJ.a(135L, 64L, 1L, true);
        break label229;
        label356:
        str1 = TAG;
        String str2 = "latestStatus is null. isLatestClose: %b, localStatus is null ?: %b";
        localObject1 = new Object[2];
        localObject1[0] = Boolean.valueOf(bool2);
        i = 1;
        if (localr1 == null)
        {
          bool1 = true;
          localObject2 = localObject1;
          localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject3;
          localObject3 = str2;
        }
        else
        {
          bool1 = false;
          localObject2 = localObject1;
          localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject3;
          localObject3 = str2;
        }
      }
      label440:
      if (bool2)
      {
        com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is closed, reqKey:%s, status:%d. return true", new Object[] { str3, Integer.valueOf(j), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
        i = 1;
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is not closed, reqKey:%s, status:%d. return false", new Object[] { str3, Integer.valueOf(j), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
      i = 0;
      break;
      label543:
      if (a(localr1))
      {
        com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d, it is final status. return false.", new Object[] { localr1.field_reqkey, Integer.valueOf(j), Integer.valueOf(localr1.field_status) });
        i = 0;
        break;
      }
      if (localr2 == null)
      {
        com.tencent.mm.sdk.platformtools.x.i(TAG, "== unbelievable! current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; cannot get latest order in local storage , or all local orders is in give-up. return false.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localr1.field_status) });
        k.bkO();
        k.bkS().IY(str3);
        i = 0;
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s ", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
      if (localr1.field_reqkey.equals(localr2.field_reqkey))
      {
        if (de(localr2.field_status, j))
        {
          com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return true", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
          i = 1;
          break;
        }
        com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return false.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
        if (localr2.field_status != j)
        {
          com.tencent.mm.sdk.platformtools.x.i(TAG, "mark reqKey: %s as give up", new Object[] { str3 });
          k.bkO();
          k.bkS().IY(str3);
        }
        i = 0;
        break;
      }
      if (bool2)
      {
        com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is closed. return true.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
        i = 1;
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is not closed. return false.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
      k.bkO();
      k.bkS().IY(str3);
      i = 0;
      break;
      label1032:
      if (i == 6)
      {
        h.mEJ.a(135L, 59L, 1L, true);
        break label92;
      }
      if ((i == 4) || (i == 5) || (i == 20))
      {
        h.mEJ.a(135L, 60L, 1L, true);
        break label92;
      }
      if (i != 23) {
        break label92;
      }
      h.mEJ.a(135L, 66L, 1L, true);
      break label92;
      label1111:
      localObject1 = new r();
      ((r)localObject1).field_reqkey = paramString2;
      if (!bi.oW(paramString1)) {
        ((r)localObject1).field_ack_key = paramString1;
      }
      ((r)localObject1).field_status = lIL;
      a((r)localObject1, i);
    }
    label1157:
    com.tencent.mm.sdk.platformtools.x.i(TAG, "dealMsg false");
    return false;
  }
  
  public final void stop()
  {
    if (com.tencent.mm.plugin.offline.c.a.bma())
    {
      com.tencent.mm.sdk.platformtools.x.i(TAG, "OFFLINEGETMSGLOGIN STOP; IS stopped=" + this.lIZ.ciq());
      if (!this.lIZ.ciq())
      {
        h.mEJ.a(135L, 62L, 1L, true);
        this.lIZ.SO();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */