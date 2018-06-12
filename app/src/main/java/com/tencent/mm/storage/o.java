package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.ac.a.b;
import com.tencent.mm.ac.a.c;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.ac.a.k;
import com.tencent.mm.ac.z;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class o
  extends e
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS bizchatmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT ) ", "CREATE INDEX IF NOT EXISTS  bizmessageChatIdIndex ON bizchatmessage ( bizChatId )", "CREATE INDEX IF NOT EXISTS  bizmessageSvrIdIndex ON bizchatmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bizmessageTalkerIndex ON bizchatmessage ( talker )", "CREATE INDEX IF NOT EXISTS  bizmessageTalerStatusIndex ON bizchatmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTimeIndex ON bizchatmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTaklerTimeIndex ON bizchatmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageBizChatIdTypeCreateTimeIndex ON bizchatmessage ( bizChatId,type,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageSendCreateTimeIndex ON bizchatmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  bizchatmessageTalkerTypeIndex ON bizchatmessage ( talker,type )" };
  
  public o(com.tencent.mm.plugin.messenger.foundation.a.a.f paramf)
  {
    super(paramf);
    a(bdc(), "bizchatmessage");
    a(new f.b(16, "bizchatmessage", f.b.a(2500001L, 3000000L, 99000001L, 102000000L)));
  }
  
  private static String ap(String paramString, long paramLong)
  {
    return " bizChatId= " + paramLong + " AND talker= '" + paramString + "'";
  }
  
  public final int GK(String paramString)
  {
    x.w("MicroMsg.BizChatMessageStorage", "not attention  deleteEnterpriseMsgByTalker :%s  stack:%s", new Object[] { paramString, aj.cio() });
    String str = "talker= '" + paramString + "'";
    fW(GX(paramString), str);
    int i = bdc().delete(GX(paramString), str, null);
    if (i != 0)
    {
      this.sNO.Xp("delete_talker " + paramString);
      paramString = new f.c(paramString, "delete", null, i, (byte)0);
      paramString.lcC = -1L;
      a(paramString);
    }
    return i;
  }
  
  public final String XG(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (!com.tencent.mm.ac.f.eZ(paramString)) {
        break;
      }
      return "bizchatmessage";
    }
    return null;
  }
  
  protected final boolean a(bd parambd, bd.b paramb)
  {
    if (parambd == null)
    {
      x.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:message == null");
      return false;
    }
    parambd.az(-1L);
    if (paramb != null)
    {
      if (!com.tencent.mm.ac.f.eZ(parambd.field_talker)) {
        break label311;
      }
      if (bi.oW(paramb.dCu))
      {
        x.w("MicroMsg.BizChatMessageStorage", "EnterpriseChat msgSourceValue error: %s", new Object[] { parambd.cqb });
        return false;
      }
      localObject = new c();
      ((c)localObject).field_bizChatServId = paramb.dCu;
      ((c)localObject).field_brandUserName = parambd.field_talker;
      if (!bi.oW(paramb.dCv)) {
        ((c)localObject).field_chatVersion = bi.getInt(paramb.dCv, -1);
      }
      if (!bi.oW(paramb.dCt)) {
        ((c)localObject).field_chatType = bi.getInt(paramb.dCt, -1);
      }
      x.d("MicroMsg.BizChatMessageStorage", "bizchatId:%s,userId:%s", new Object[] { paramb.dCu, paramb.userId });
      localObject = com.tencent.mm.ac.a.e.e((c)localObject);
      if (localObject == null) {
        break label301;
      }
      parambd.az(((c)localObject).field_bizChatLocalId);
      parambd.field_bizChatUserId = bi.oV(paramb.userId);
      parambd.cGu = true;
      if (paramb.dCx.equals("1")) {
        parambd.eX(1);
      }
      if ((parambd.field_isSend != 1) && (paramb.userId != null))
      {
        localObject = z.Nc().cA(parambd.field_talker);
        if (paramb.userId.equals(localObject)) {
          parambd.eX(1);
        }
      }
      if (!bi.oW(paramb.userId))
      {
        localObject = new j();
        ((j)localObject).field_userId = paramb.userId;
        ((j)localObject).field_userName = paramb.dCw;
        ((j)localObject).field_brandUserName = parambd.field_talker;
        z.Nc().c((j)localObject);
      }
    }
    label301:
    label311:
    while (bi.oW(paramb.dCu))
    {
      Object localObject;
      return true;
      x.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:bizChatInfo == null!");
      return false;
    }
    x.i("MicroMsg.BizChatMessageStorage", "is EnterpriseChat but contact not ready");
    return false;
  }
  
  public final bd aq(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    bd localbd = new bd();
    paramString = "select * from " + GX(paramString) + " where" + ap(paramString, paramLong) + "order by createTime DESC limit 1";
    paramString = bdc().b(paramString, null, 0);
    if (paramString.getCount() != 0)
    {
      paramString.moveToFirst();
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final Cursor ar(String paramString, long paramLong)
  {
    long l = System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    Object localObject = GX(paramString);
    paramString = "select * from " + (String)localObject + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + ap(paramString, paramLong) + "AND " + this.sNO.bdl() + "  order by createTime";
    localObject = bdc().b(paramString, null, 0);
    x.d("MicroMsg.BizChatMessageStorage", "all time: %d, sql: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramString });
    return (Cursor)localObject;
  }
  
  public final int as(String paramString, long paramLong)
  {
    x.w("MicroMsg.BizChatMessageStorage", "deleteByTalker :%s  stack:%s", new Object[] { paramString, aj.cio() });
    fW(GX(paramString), ap(paramString, paramLong));
    int i = bdc().delete(GX(paramString), ap(paramString, paramLong), null);
    if (i != 0)
    {
      this.sNO.Xp("delete_talker " + paramString);
      paramString = new f.c(paramString, "delete", null, i, (byte)0);
      paramString.lcC = -1L;
      a(paramString);
    }
    return i;
  }
  
  public final Cursor at(String paramString, long paramLong)
  {
    return bdc().query(GX(paramString), null, ap(paramString, paramLong), null, null, null, "createTime ASC ");
  }
  
  public final int au(String paramString, long paramLong)
  {
    if (paramString == null)
    {
      x.w("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable talker:%s,bizChatId:%s", new Object[] { paramString, Long.valueOf(paramLong) });
      return -1;
    }
    a locala = z.Nb().bd(paramLong);
    if (locala.field_msgCount != 0) {
      return locala.field_msgCount;
    }
    x.i("MicroMsg.BizChatMessageStorage", "geBiztMsgCount contactMsgCount is 0 ,go normal %s", new Object[] { paramString });
    return av(paramString, paramLong);
  }
  
  public final int av(String paramString, long paramLong)
  {
    int i = 0;
    paramString = "SELECT COUNT(*) FROM " + GX(paramString) + " WHERE " + ap(paramString, paramLong);
    x.v("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable sql:[%s]", new Object[] { paramString });
    paramString = bdc().b(paramString, null, 0);
    if (paramString.moveToLast()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    return i;
  }
  
  public final int aw(String paramString, long paramLong)
  {
    int i = 0;
    paramString = "SELECT COUNT(*) FROM " + this.sNO.GX(paramString) + " WHERE " + ap(paramString, paramLong) + "AND " + this.sNO.bdk();
    paramString = bdc().b(paramString, null, 0);
    if (paramString.moveToLast()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    return i;
  }
  
  public final long ax(String paramString, long paramLong)
  {
    Object localObject = "select createTime from " + GX(paramString) + " where" + ap(paramString, paramLong) + "order by createTime DESC LIMIT 1 ";
    x.d("MicroMsg.BizChatMessageStorage", "get last message create time: " + (String)localObject);
    localObject = bdc().b((String)localObject, null, 0);
    if (localObject == null)
    {
      x.e("MicroMsg.BizChatMessageStorage", "get last message create time failed " + paramString);
      return -1L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      paramLong = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      return paramLong;
    }
    ((Cursor)localObject).close();
    return -1L;
  }
  
  public final Cursor b(String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    String str = GX(paramString);
    paramString = "select * from ( select * from " + str + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + ap(paramString, paramLong) + "AND " + this.sNO.bdk() + " order by createTime DESC limit " + paramInt2 + " OFFSET " + paramInt1 + ") order by createTime ASC ";
    return bdc().b(paramString, null, 0);
  }
  
  public final Cursor b(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    String str = GX(paramString);
    paramString = "select * from " + str + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + ap(paramString, paramLong1) + "AND " + this.sNO.bdk() + " AND createTime >= " + paramLong2 + " AND createTime< " + paramLong3 + " order by createTime ASC";
    return bdc().b(paramString, null, 0);
  }
  
  public final List<bd> b(String paramString, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    long l = System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid, limit = 10");
      return null;
    }
    paramLong2 = this.sNO.Q(paramString, paramLong2);
    if (paramLong2 == 0L)
    {
      x.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, msg is null");
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      paramString = "select * from " + GX(paramString) + " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + ap(paramString, paramLong1) + "AND " + this.sNO.bdk() + " AND createTime > " + paramLong2 + "  order by createTime ASC limit 10";
      paramString = bdc().b(paramString, null, 0);
      if (!paramString.moveToFirst()) {}
    }
    else
    {
      for (;;)
      {
        if (paramString.isAfterLast()) {
          break label298;
        }
        bd localbd = new bd();
        localbd.d(paramString);
        paramString.moveToNext();
        if (paramBoolean)
        {
          localArrayList.add(localbd);
          continue;
          paramString = "select * from " + GX(paramString) + " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + ap(paramString, paramLong1) + "AND " + this.sNO.bdk() + " AND createTime < " + paramLong2 + "  order by createTime DESC limit 10";
          break;
        }
        localArrayList.add(0, localbd);
      }
    }
    label298:
    paramString.close();
    x.i("MicroMsg.BizChatMessageStorage", "getBizChatImgVideoMessage spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    return localArrayList;
  }
  
  public final int c(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong3 < paramLong2) {}
    for (;;)
    {
      x.d("MicroMsg.BizChatMessageStorage", "talker %s, get count fromCreateTime %d, toCreateTime %d", new Object[] { paramString, Long.valueOf(paramLong3), Long.valueOf(paramLong2) });
      paramString = "SELECT COUNT(msgId) FROM " + GX(paramString) + " WHERE" + ap(paramString, paramLong1) + "AND createTime >= " + paramLong3 + " AND createTime <= " + paramLong2;
      x.d("MicroMsg.BizChatMessageStorage", "get count sql: " + paramString);
      paramString = bdc().b(paramString, null, 0);
      if (paramString == null)
      {
        x.w("MicroMsg.BizChatMessageStorage", "get count error, cursor is null");
        return 0;
      }
      if (paramString.moveToFirst())
      {
        int i = paramString.getInt(0);
        x.d("MicroMsg.BizChatMessageStorage", "result msg count %d", new Object[] { Integer.valueOf(i) });
        paramString.close();
        return i;
      }
      paramString.close();
      return 0;
      long l = paramLong2;
      paramLong2 = paramLong3;
      paramLong3 = l;
    }
  }
  
  public final Cursor d(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong3 < paramLong2) {}
    for (;;)
    {
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + ap(paramString, paramLong1) + "AND createTime >= " + paramLong3 + " AND createTime <= " + paramLong2 + " ORDER BY createTime ASC ";
      x.d("MicroMsg.BizChatMessageStorage", "get cursor: " + paramString);
      return bdc().b(paramString, null, 0);
      long l = paramLong2;
      paramLong2 = paramLong3;
      paramLong3 = l;
    }
  }
  
  public final List<bd> h(String paramString, long paramLong, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + ap(paramString, paramLong) + "AND isSend = 0 ORDER BY createTime DESC LIMIT " + paramInt;
    paramString = bdc().b(paramString, null, 0);
    if (paramString.moveToFirst()) {
      while (!paramString.isAfterLast())
      {
        bd localbd = new bd();
        localbd.d(paramString);
        paramString.moveToNext();
        if (localbd.isText()) {
          localArrayList.add(localbd);
        }
      }
    }
    paramString.close();
    return localArrayList;
  }
  
  public final Cursor i(String paramString, long paramLong, int paramInt)
  {
    String str = "SELECT * FROM ( SELECT * FROM " + GX(paramString) + " WHERE" + ap(paramString, paramLong) + "ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC";
    x.d("MicroMsg.BizChatMessageStorage", "getBizInitCursor talker:%s, bizChatId:%s, limitCount:%s, sql:[%s]", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt), str });
    return bdc().b(str, null, 0);
  }
  
  public final int v(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    bd localbd = this.sNO.dW(paramLong2);
    if (localbd.field_msgId == 0L)
    {
      x.e("MicroMsg.BizChatMessageStorage", "getCountEarlyThan fail, msg does not exist");
      return 0;
    }
    String str = GX(paramString);
    paramString = "SELECT COUNT(*) FROM " + str + " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  WHERE " + ap(paramString, paramLong1) + "AND " + this.sNO.bdk() + " AND createTime < " + localbd.field_createTime;
    paramString = bdc().b(paramString, null, 0);
    if (paramString.moveToLast()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    return i;
  }
  
  public final long w(String paramString, long paramLong1, long paramLong2)
  {
    x.d("MicroMsg.BizChatMessageStorage", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong2), Integer.valueOf(18) });
    paramString = "SELECT createTime FROM " + GX(paramString) + " WHERE" + ap(paramString, paramLong1) + "AND createTime < " + paramLong2 + " ORDER BY createTime DESC  LIMIT 18";
    x.d("MicroMsg.BizChatMessageStorage", "get up inc msg create time sql: %s", new Object[] { paramString });
    paramString = bdc().b(paramString, null, 0);
    if (paramString == null)
    {
      x.w("MicroMsg.BizChatMessageStorage", "get inc msg create time error, cursor is null");
      return paramLong2;
    }
    if (paramString.moveToLast())
    {
      paramLong1 = paramString.getLong(0);
      x.d("MicroMsg.BizChatMessageStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong1) });
      paramString.close();
      return paramLong1;
    }
    paramString.close();
    x.w("MicroMsg.BizChatMessageStorage", "get result fail");
    return paramLong2;
  }
  
  public final long x(String paramString, long paramLong1, long paramLong2)
  {
    x.d("MicroMsg.BizChatMessageStorage", "get down inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong2), Integer.valueOf(18) });
    paramString = "SELECT createTime FROM " + GX(paramString) + " WHERE" + ap(paramString, paramLong1) + "AND createTime > " + paramLong2 + " ORDER BY createTime ASC  LIMIT 18";
    x.d("MicroMsg.BizChatMessageStorage", "get down inc msg create time sql: %s", new Object[] { paramString });
    paramString = bdc().b(paramString, null, 0);
    if (paramString == null)
    {
      x.w("MicroMsg.BizChatMessageStorage", "get down inc msg create time error, cursor is null");
      return paramLong2;
    }
    if (paramString.moveToLast())
    {
      paramLong1 = paramString.getLong(0);
      x.d("MicroMsg.BizChatMessageStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong1) });
      paramString.close();
      return paramLong1;
    }
    paramString.close();
    x.w("MicroMsg.BizChatMessageStorage", "get result fail");
    return paramLong2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */