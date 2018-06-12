package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.ac.z;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public final class s
{
  private static Boolean sOe = null;
  private static Boolean sOf = null;
  
  private static long L(long paramLong1, long paramLong2)
  {
    long l2 = -1L;
    String str = (String)g.Ei().DT().get(aa.a.sZX, "");
    long l1 = l2;
    if (!bi.oW(str))
    {
      String[] arrayOfString = str.split(":");
      l1 = l2;
      if (arrayOfString.length == 2)
      {
        l1 = l2;
        if (bi.getLong(arrayOfString[0], -1L) == paramLong1) {
          l1 = paramLong2 - bi.getLong(arrayOfString[1], -1L);
        }
      }
    }
    if (l1 < 0L)
    {
      str = paramLong1 + ":" + (paramLong2 - 604800L);
      g.Ei().DT().a(aa.a.sZX, str);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BizTimeLineInfoStorageLogic", "getSerialNumber set groupStartTime %s,createTime %d", new Object[] { str, Long.valueOf(paramLong2) });
      return 604800L;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizTimeLineInfoStorageLogic", "getSerialNumber groupStartTime %s,createTime %d", new Object[] { str, Long.valueOf(paramLong2) });
    return l1;
  }
  
  private static boolean a(bd parambd, int paramInt1, int paramInt2)
  {
    return ((parambd.cky()) || (parambd.getType() == 1) || (parambd.getType() == 34) || (parambd.getType() == 3)) && ((paramInt1 == 3) || (paramInt2 == 9) || (paramInt2 == 15) || (paramInt2 == 17));
  }
  
  public static void ag(bd parambd)
  {
    if (!auK()) {}
    for (;;)
    {
      return;
      if (parambd != null)
      {
        int k = 0;
        int j = -1;
        int i = 0;
        Object localObject1 = com.tencent.mm.model.bd.iF(parambd.cqb);
        if (localObject1 != null)
        {
          k = ((bd.b)localObject1).dCm;
          j = ((bd.b)localObject1).dCn;
          i = ((bd.b)localObject1).dCo;
        }
        for (long l1 = ((bd.b)localObject1).dCr; j == 0; l1 = 0L)
        {
          boolean bool;
          if (a(parambd, k, i))
          {
            bool = true;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg %s, isTimeLine %b", new Object[] { parambd.field_talker, Boolean.valueOf(bool) });
            if (bool) {
              break label361;
            }
            localObject2 = z.Nf();
            l1 = parambd.field_msgSvrId;
            localObject1 = new q();
            localObject2 = ((t)localObject2).dCZ.a("BizTimeLineSingleMsgInfo", null, "msgSvrId" + "=?", new String[] { String.valueOf(l1) }, null, null, null, 2);
            if (!((Cursor)localObject2).moveToFirst()) {
              break label331;
            }
            ((q)localObject1).d((Cursor)localObject2);
            ((Cursor)localObject2).close();
            label197:
            if (localObject1 != null) {
              break label344;
            }
          }
          label331:
          label344:
          for (Object localObject2 = new q();; localObject2 = localObject1)
          {
            ((q)localObject2).field_msgId = parambd.field_msgId;
            ((q)localObject2).field_msgSvrId = parambd.field_msgSvrId;
            ((q)localObject2).field_content = parambd.field_content;
            ((q)localObject2).field_type = parambd.getType();
            ((q)localObject2).field_talker = parambd.field_talker;
            ((q)localObject2).field_talkerId = parambd.field_talkerId;
            ((q)localObject2).field_createTime = parambd.field_createTime;
            ((q)localObject2).field_imgPath = parambd.field_imgPath;
            ((q)localObject2).eC(parambd.cqa);
            ((q)localObject2).dt(parambd.cqb);
            ((q)localObject2).field_status = parambd.field_status;
            if (localObject1 != null) {
              break label351;
            }
            z.Nf().c((q)localObject2);
            return;
            bool = false;
            break;
            ((Cursor)localObject2).close();
            localObject1 = null;
            break label197;
          }
          label351:
          z.Nf().d((q)localObject2);
          return;
          label361:
          localObject2 = z.Ne().gg(parambd.field_msgSvrId);
          if (localObject2 == null) {}
          for (localObject1 = new q();; localObject1 = localObject2)
          {
            ((q)localObject1).field_msgId = parambd.field_msgId;
            ((q)localObject1).field_msgSvrId = parambd.field_msgSvrId;
            ((q)localObject1).field_content = parambd.field_content;
            ((q)localObject1).field_type = parambd.getType();
            ((q)localObject1).field_talker = parambd.field_talker;
            ((q)localObject1).field_talkerId = parambd.field_talkerId;
            ((q)localObject1).field_createTime = parambd.field_createTime;
            ((q)localObject1).field_imgPath = parambd.field_imgPath;
            ((q)localObject1).eC(parambd.cqa);
            ((q)localObject1).dt(parambd.cqb);
            ((q)localObject1).field_status = parambd.field_status;
            if (localObject2 != null) {
              break;
            }
            ((q)localObject1).field_hasShow = 0;
            ((q)localObject1).field_isExpand = false;
            long l3 = z.Ne().ckx();
            long l4 = L(l3, ((q)localObject1).field_createTime / 1000L);
            long l2 = l4;
            if (l4 >= 4294967296L)
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg serialNumber is too big %d", new Object[] { Long.valueOf(l4) });
              l3 = z.Ne().ckE();
              l2 = L(l3, ((q)localObject1).field_createTime / 1000L);
            }
            ((q)localObject1).field_orderFlag = (l1 << 24 & 0xFF000000 | l3 << 32 | l2);
            z.Ne().c((q)localObject1);
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg groupId %d, serialNumber %d,orderFlag %d", new Object[] { Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(((q)localObject1).field_orderFlag) });
            return;
          }
          z.Ne().d((q)localObject1);
          return;
        }
      }
    }
  }
  
  public static void ah(bd parambd)
  {
    int j = -1;
    Object localObject = com.tencent.mm.model.bd.iF(parambd.cqb);
    int k;
    int i;
    if (localObject != null)
    {
      k = ((bd.b)localObject).dCm;
      j = ((bd.b)localObject).dCn;
      i = ((bd.b)localObject).dCo;
    }
    for (;;)
    {
      if (j != 0) {
        break label38;
      }
      label38:
      while (!a(parambd, k, i)) {
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizTimeLineInfoStorageLogic", "doMigrateBizTimeLineMsg %s", new Object[] { parambd.field_talker });
      q localq = z.Ne().gg(parambd.field_msgSvrId);
      if (localq == null) {}
      for (localObject = new q();; localObject = localq)
      {
        ((q)localObject).field_msgId = parambd.field_msgId;
        ((q)localObject).field_msgSvrId = parambd.field_msgSvrId;
        ((q)localObject).field_content = parambd.field_content;
        ((q)localObject).field_type = parambd.getType();
        ((q)localObject).field_talker = parambd.field_talker;
        ((q)localObject).field_talkerId = parambd.field_talkerId;
        ((q)localObject).field_createTime = parambd.field_createTime;
        ((q)localObject).field_imgPath = parambd.field_imgPath;
        ((q)localObject).eC(parambd.cqa);
        ((q)localObject).dt(parambd.cqb);
        if (localq != null) {
          break;
        }
        ((q)localObject).field_status = 4;
        ((q)localObject).field_isExpand = false;
        ((q)localObject).field_orderFlag = (0x100000000 | ((q)localObject).field_createTime / 1000L);
        z.Ne().c((q)localObject);
        return;
      }
      i = 0;
      k = 0;
    }
  }
  
  public static void ai(bd parambd)
  {
    if (parambd == null) {
      return;
    }
    z.Ne().gj(parambd.field_msgId);
  }
  
  public static boolean auK()
  {
    if (sOe != null) {
      return sOe.booleanValue();
    }
    c localc = com.tencent.mm.model.c.c.Jx().fJ("100391");
    if ((localc.isValid()) && ("1".equals(localc.ckq().get("isOpenSubscribeListVersion1")))) {}
    for (boolean bool = true;; bool = false)
    {
      sOe = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BizTimeLineInfoStorageLogic", "isBizTimeLineOpen open %b", new Object[] { sOe });
      return sOe.booleanValue();
    }
  }
  
  public static boolean auL()
  {
    if (sOf != null) {
      return sOf.booleanValue();
    }
    c localc = com.tencent.mm.model.c.c.Jx().fJ("100391");
    if ((localc.isValid()) && ("1".equals(localc.ckq().get("isOpenNumberNotify")))) {}
    for (boolean bool = true;; bool = false)
    {
      sOf = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BizTimeLineInfoStorageLogic", "isOpenNumberNotify open %b", new Object[] { sOf });
      return sOf.booleanValue();
    }
  }
  
  public static void ckH()
  {
    if (!auK()) {
      return;
    }
    int j = z.Ne().ckC();
    int k = z.Nf().axd();
    az localaz = ((i)g.l(i.class)).FW();
    ai localai = localaz.Yq("officialaccounts");
    if (localai == null) {
      localai = new ai("officialaccounts");
    }
    for (int i = 1;; i = 0)
    {
      localai.eV(j);
      localai.fb(k);
      Object localObject;
      if (k > 0)
      {
        localObject = z.Nf().ckB();
        label87:
        if ((localObject == null) || (((q)localObject).field_msgId == 0L)) {
          break label315;
        }
        bd localbd = ((i)g.l(i.class)).bcY().dW(((q)localObject).field_msgId);
        if (localbd.field_msgId <= 0L) {
          break label317;
        }
        localai.aj(localbd);
        localai.setContent(localbd.field_talker + ":" + localbd.field_content);
        localai.ec(Integer.toString(localbd.getType()));
        localObject = localaz.vu();
        if (localObject != null)
        {
          PString localPString1 = new PString();
          PString localPString2 = new PString();
          PInt localPInt = new PInt();
          localbd.ep("officialaccounts");
          localbd.setContent(localai.field_content);
          ((az.b)localObject).a(localbd, localPString1, localPString2, localPInt, true);
          localai.ed(localPString1.value);
          localai.ee(localPString2.value);
          localai.eY(localPInt.value);
        }
      }
      for (;;)
      {
        if (i == 0) {
          break label344;
        }
        localaz.d(localai);
        return;
        localObject = z.Ne().ckB();
        break label87;
        label315:
        break;
        label317:
        localai.clx();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizTimeLineInfoStorageLogic", "lastOfMsg is null or MsgId <= 0, lastTalker is %s", new Object[] { ((q)localObject).field_talker });
      }
      label344:
      localaz.a(localai, localai.field_username);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */