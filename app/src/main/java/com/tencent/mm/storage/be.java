package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import junit.framework.Assert;

public final class be
  extends j
  implements com.tencent.mm.plugin.messenger.foundation.a.a.f
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS " + "message" + " ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT,transBrandWording TEXT ,talkerId INTEGER, bizClientMsgId" + " TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT, msgSeq INTEGER, flag INT) " };
  private final h dCZ;
  private ay gYD;
  private az gYF;
  private final com.tencent.mm.sdk.e.k<f.a, f.c> sNT = new com.tencent.mm.sdk.e.k()
  {
    public final void cY(List<f.c> paramAnonymousList)
    {
      if ((!isLocked()) && (be.a(be.this) != null))
      {
        paramAnonymousList = paramAnonymousList.iterator();
        while (paramAnonymousList.hasNext())
        {
          f.c localc = (f.c)paramAnonymousList.next();
          if (localc != null) {
            be.a(be.this).b(be.this, localc);
          }
        }
      }
    }
  };
  private final long taQ = 86400L;
  private boolean tbX = false;
  private final List<e> tbY = new CopyOnWriteArrayList();
  private List<f.b> tbZ;
  private final com.tencent.mm.a.f<Integer, bd.c> tca = new com.tencent.mm.a.f(100);
  private final com.tencent.mm.a.f<Integer, bd.d> tcb = new com.tencent.mm.a.f(100);
  private final com.tencent.mm.a.f<Integer, bd.a> tcc = new com.tencent.mm.a.f(100);
  private final com.tencent.mm.a.f<Integer, bd.b> tcd = new com.tencent.mm.a.f(100);
  private final com.tencent.mm.a.f<Integer, Object> tce = new com.tencent.mm.a.f(100);
  private final com.tencent.mm.a.f<String, Long> tcf = new com.tencent.mm.a.f(100);
  private al tcg = new al();
  private Map<String, f.c> tch = new HashMap();
  private boolean tci = false;
  private String tcj = "";
  private long tck = 0L;
  
  public be(h paramh, ay paramay, az paramaz)
  {
    this.dCZ = paramh;
    this.gYD = paramay;
    this.gYF = paramaz;
    g.Ek();
    if (((Integer)g.Ei().DT().get(348169, Integer.valueOf(0))).intValue() == 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d", new Object[] { Integer.valueOf(this.dCZ.delete("message", "msgId> ? ", new String[] { "80000000" })) });
      g.Ek();
      g.Ei().DT().set(348169, Integer.valueOf(1));
    }
    a(paramh, "message");
    cmQ();
    if (this.tbZ == null) {
      this.tbZ = new LinkedList();
    }
    this.tbZ.clear();
    a(new f.b(1, "message", f.b.a(1L, 1000000L, 10000000L, 90000000L)));
  }
  
  private String YZ(String paramString)
  {
    String str = GX(paramString);
    if ((this.tbX) && (str.equals("message"))) {
      return " talkerId=" + Za(paramString) + " ";
    }
    return " talker= '" + bi.oU(paramString) + "' ";
  }
  
  private long Za(String paramString)
  {
    long l = this.gYD.Yh(paramString);
    if (l < 0L) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        ab localab = new ab(paramString);
        localab.setType(2);
        this.gYD.T(localab);
        l = this.gYD.Yh(paramString);
      }
      if (!b.chr()) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "getTalkerIdByTalkerName:%s id:%s needinsert:%s [%s]", new Object[] { paramString, Long.valueOf(l), Boolean.valueOf(bool), bi.cjd() });
      }
      return l;
    }
  }
  
  private static String Zb(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    try
    {
      paramString = bl.z(paramString, "msgsource");
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        paramString = (String)paramString.get(".msgsource.bizmsg.msgcluster");
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "exception:%s", new Object[] { bi.i(paramString) });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "Exception in getMsgcluster, %s", new Object[] { paramString.getMessage() });
      return null;
    }
    return null;
  }
  
  private String Zc(String paramString)
  {
    if ((paramString == null) || (!paramString.equals("message"))) {
      return "";
    }
    if (this.tbX) {
      return "INDEXED BY messageTaklerIdTypeCreateTimeIndex";
    }
    return "INDEXED BY messageCreateTaklerTypeTimeIndex";
  }
  
  private f.b Zd(String paramString)
  {
    boolean bool;
    int i;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool = true;
      Assert.assertTrue("tableName == null", bool);
      i = 0;
    }
    for (;;)
    {
      if (i >= this.tbZ.size()) {
        break label84;
      }
      if (paramString.equals(((f.b)this.tbZ.get(i)).name))
      {
        return (f.b)this.tbZ.get(i);
        bool = false;
        break;
      }
      i += 1;
    }
    label84:
    Assert.assertTrue("no table match", false);
    return null;
  }
  
  private f.b Ze(String paramString)
  {
    boolean bool2 = true;
    boolean bool1;
    label35:
    String str;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool1 = true;
      Assert.assertTrue("username == null", bool1);
      if ((paramString == null) || (paramString.length() <= 0)) {
        break label98;
      }
      bool1 = bool2;
      Assert.assertTrue(bool1);
      Iterator localIterator = this.tbY.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        str = ((e)localIterator.next()).XG(paramString);
      } while (bi.oW(str));
    }
    for (paramString = str;; paramString = "message")
    {
      return Zd(paramString);
      bool1 = false;
      break;
      label98:
      bool1 = false;
      break label35;
    }
  }
  
  private static void am(bd parambd)
  {
    if ((parambd == null) || (!parambd.aQm())) {}
    for (;;)
    {
      return;
      try
      {
        String str = parambd.field_content;
        int i = str.indexOf("<msg>");
        Object localObject = str;
        if (i > 0)
        {
          localObject = str;
          if (i < str.length()) {
            localObject = str.substring(i).trim();
          }
        }
        localObject = bl.z((String)localObject, "msg");
        if ((localObject != null) && (((Map)localObject).size() > 0))
        {
          parambd.er(com.tencent.mm.sdk.platformtools.ay.au((Map)localObject));
          return;
        }
      }
      catch (Exception parambd)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", parambd.getMessage());
      }
    }
  }
  
  private void b(f.b paramb)
  {
    Cursor localCursor = this.dCZ.b("select max(msgid) from " + paramb.name, null, 2);
    int i;
    if (localCursor.moveToFirst())
    {
      i = localCursor.getInt(0);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "id count is %d, now id:%d", new Object[] { Integer.valueOf(i), Long.valueOf(paramb.dTS) });
      if (i >= paramb.dTS)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgTable", "summermsg setMsgLocalId [%d, %d]  regions[%d, %d] stack[%s]", new Object[] { Long.valueOf(paramb.dTS), Integer.valueOf(i), Long.valueOf(paramb.lct[0].lcw), Long.valueOf(paramb.lct[1].lcv), bi.cjd() });
        if ((i <= paramb.lct[0].lcw) || (i >= paramb.lct[1].lcv)) {
          break label269;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgTable", "summermsg setMsgLocalId revised msgLocalId to %d", new Object[] { Long.valueOf(paramb.lct[1].lcv) });
        paramb.dTS = paramb.lct[1].lcv;
        com.tencent.mm.plugin.report.f.mDy.a(111L, 169L, 1L, false);
      }
    }
    for (;;)
    {
      localCursor.close();
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "loading new msg id:" + paramb.dTS);
      return;
      label269:
      paramb.dTS = i;
    }
  }
  
  private void cmQ()
  {
    long l1 = System.currentTimeMillis();
    long l2 = this.dCZ.dO(Thread.currentThread().getId());
    long l3 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = new String[13];
    arrayOfString[0] = ("CREATE INDEX IF NOT EXISTS " + "message" + "IdIndex ON message ( msgId )");
    arrayOfString[1] = ("CREATE INDEX IF NOT EXISTS " + "message" + "SvrIdIndex ON message ( msgSvrId )");
    arrayOfString[2] = ("CREATE INDEX IF NOT EXISTS " + "message" + "SendCreateTimeIndex ON message ( status,isSend,createTime )");
    arrayOfString[3] = ("CREATE INDEX IF NOT EXISTS " + "message" + "CreateTimeIndex ON message ( createTime )");
    arrayOfString[4] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TaklerIdTypeCreateTimeIndex ON message ( talkerId,type,createTime )");
    arrayOfString[5] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdStatusIndex ON message ( talkerId,status )");
    arrayOfString[6] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdCreateTimeIsSendIndex ON message ( talkerId,isSend,createTime )");
    arrayOfString[7] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdCreateTimeIndex ON message ( talkerId,createTime )");
    arrayOfString[8] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdSvrIdIndex ON message ( talkerId,msgSvrId )");
    arrayOfString[9] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdTypeIndex ON message ( talkerId,type )");
    arrayOfString[10] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerTypeIndex ON message ( talker,type )");
    arrayOfString[11] = ("CREATE INDEX IF NOT EXISTS " + "message" + "messageTalkerMsgSeqIndex ON message ( talker,msgSeq )");
    arrayOfString[12] = ("CREATE INDEX IF NOT EXISTS " + "message" + "messageTalkerFlagMsgSeqIndex ON message ( talker,flag,msgSeq )");
    if (!this.tbX)
    {
      arrayOfString[4] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTypeTimeIndex ON message ( talker,type,createTime )";
      arrayOfString[5] = "CREATE INDEX IF NOT EXISTS  messageTalkerStatusIndex ON message ( talker,status )";
      arrayOfString[6] = "CREATE INDEX IF NOT EXISTS  messageTalkerCreateTimeIsSendIndex ON message ( talker,isSend,createTime )";
      arrayOfString[7] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTimeIndex ON message ( talker,createTime )";
      arrayOfString[8] = "CREATE INDEX IF NOT EXISTS  messageTalkerSvrIdIndex ON message ( talker,msgSvrId )";
    }
    localArrayList.addAll(Arrays.asList(arrayOfString));
    int i = 0;
    while (i < localArrayList.size())
    {
      this.dCZ.fV("message", (String)localArrayList.get(i));
      i += 1;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "build new index last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l3) });
    this.dCZ.gp(l2);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "executeMsgInitSQL last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  private String go(long paramLong)
  {
    if ((paramLong == 0L) || (paramLong == -1L)) {
      return null;
    }
    bd.gn(paramLong);
    int i = 0;
    while (i < this.tbZ.size())
    {
      if (((f.b)this.tbZ.get(i)).eb(paramLong)) {
        return ((f.b)this.tbZ.get(i)).name;
      }
      i += 1;
    }
    Assert.assertTrue(String.format("getTableNameByLocalId failed:%d", new Object[] { Long.valueOf(paramLong) }), false);
    return null;
  }
  
  public final Cursor E(String paramString1, String paramString2, int paramInt)
  {
    String str = " SELECT * FROM " + GX(paramString1) + " WHERE" + YZ(paramString1) + "AND content LIKE '" + paramString2 + "%' ORDER BY createTime DESC LIMIT " + paramInt;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "getInitCursorByMember getCursor talk:%s member:%s,limitCount:%d [%s]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), str });
    return this.dCZ.b(str, null, 0);
  }
  
  public final void E(ArrayList<Long> paramArrayList)
  {
    long l1 = this.dCZ.dO(-1L);
    try
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        long l2 = ((Long)paramArrayList.next()).longValue();
        bd localbd = dW(l2);
        localbd.eC(localbd.cqa | 0x20);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "msgId:%d, setOmitFailResend", new Object[] { Long.valueOf(l2) });
        a(l2, localbd);
      }
    }
    finally
    {
      this.dCZ.gp(l1);
    }
  }
  
  public final void GA(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "unlockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", new Object[] { paramString, Boolean.valueOf(this.tci), Integer.valueOf(this.sKC.sKF), Integer.valueOf(this.sNT.sKF), Integer.valueOf(this.tch.size()), this.tcj, Long.valueOf(bi.bH(this.tck)) });
    if (bi.oW(paramString)) {
      Assert.assertTrue("lockForSync, do not call me by null tag.", false);
    }
    if (!this.tci)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "unlockForSync, No one Locking Now , why this fucking tag:%s call it ! [%s]", new Object[] { paramString, bi.cjd() });
      return;
    }
    if (!paramString.equals(this.tcj))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "unlockForSync locking[%s] diff:%d, but unlock[%s] , Ignore this call.", new Object[] { this.tcj, Long.valueOf(bi.bH(this.tck)), paramString });
      return;
    }
    this.tci = false;
    this.tck = 0L;
    this.tcj = "";
    paramString = this.tch.keySet().iterator();
    while (paramString.hasNext())
    {
      String str = (String)paramString.next();
      a((f.c)this.tch.get(str));
    }
    this.tch.clear();
    super.unlock();
    this.sNT.unlock();
    doNotify();
  }
  
  public final void GB(String paramString)
  {
    if (!this.tci) {}
    f.c localc;
    do
    {
      return;
      localc = null;
      if (this.tch.containsKey(paramString)) {
        localc = (f.c)this.tch.get(paramString);
      }
      if (localc == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "statusNotify, No one Locking info Now , why this fucking talker:%s call it ! [%s]", new Object[] { paramString, bi.cjd() });
        return;
      }
    } while ((localc.lcx == null) || (!localc.lcx.equals("insert")) || (localc.lcz <= 0));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "statusNotify talker[%s] insertCount[%d]", new Object[] { paramString, Integer.valueOf(localc.lcz) });
    localc.lcz = 0;
  }
  
  public final Cursor GC(String paramString)
  {
    h localh = this.dCZ;
    String str = GX(paramString);
    paramString = YZ(paramString);
    return localh.query(str, new String[] { "createTime", "msgId" }, paramString, null, "createTime", null, "createTime ASC");
  }
  
  public final bd GD(String paramString)
  {
    bd localbd = new bd();
    paramString = this.dCZ.a(GX(paramString), null, YZ(paramString), null, null, null, "msgSvrId  DESC limit 1 ", 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final bd GE(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    bd localbd = new bd();
    paramString = "select * from " + GX(paramString) + " where" + YZ(paramString) + "order by createTime DESC limit 1";
    paramString = this.dCZ.b(paramString, null, 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final bd GF(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    bd localbd = new bd();
    paramString = "select * from " + GX(paramString) + " where" + YZ(paramString) + "and isSend = 0  order by createTime DESC limit 1";
    paramString = this.dCZ.b(paramString, null, 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final bd GG(String paramString)
  {
    if (this.tbZ == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
      return null;
    }
    bd localbd = new bd();
    long l1 = 0L;
    if (bi.oW(paramString)) {}
    for (paramString = "";; paramString = paramString.replaceFirst("and", "where"))
    {
      int i = 0;
      while (i < this.tbZ.size())
      {
        long l2 = l1;
        if ((((f.b)this.tbZ.get(i)).lcu & 0x8) != 0)
        {
          Object localObject = "select * from " + ((f.b)this.tbZ.get(i)).name + paramString + "  order by createTime DESC limit 1";
          localObject = this.dCZ.b((String)localObject, null, 2);
          l2 = l1;
          if (((Cursor)localObject).moveToFirst())
          {
            long l3 = ((Cursor)localObject).getLong(((Cursor)localObject).getColumnIndex("createTime"));
            l2 = l1;
            if (l1 < l3)
            {
              localbd.d((Cursor)localObject);
              l2 = l3;
            }
          }
          ((Cursor)localObject).close();
        }
        i += 1;
        l1 = l2;
      }
    }
    return localbd;
  }
  
  public final List<bd> GH(String paramString)
  {
    bd localbd = null;
    Cursor localCursor = this.dCZ.b("select * from " + paramString, null, 2);
    if (localCursor == null) {
      return null;
    }
    paramString = localbd;
    if (localCursor.moveToFirst())
    {
      paramString = new ArrayList();
      do
      {
        localbd = new bd();
        localbd.d(localCursor);
        paramString.add(localbd);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return paramString;
  }
  
  public final Cursor GI(String paramString)
  {
    long l = System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    Object localObject = GX(paramString);
    paramString = "select * from " + (String)localObject + " " + Zc((String)localObject) + " where" + YZ(paramString) + "AND type IN (3,39,13,43,62,44,49,268435505)  order by createTime";
    localObject = this.dCZ.b(paramString, null, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "all time: %d, sql: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramString });
    return (Cursor)localObject;
  }
  
  public final void GJ(String paramString)
  {
    b(paramString, "", null);
    if (this.dCZ.fV(paramString, "delete from " + paramString))
    {
      Xp("delete_all " + paramString);
      return;
    }
    com.tencent.mm.plugin.report.f.mDy.a(111L, 247L, 1L, false);
  }
  
  public final int GK(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "deleteByTalker :%s  stack:%s", new Object[] { paramString, aj.cio() });
    b(GX(paramString), YZ(paramString), null);
    int i = this.dCZ.delete(GX(paramString), YZ(paramString), null);
    if (i != 0)
    {
      Xp("delete_talker " + paramString);
      paramString = new f.c(paramString, "delete", null, i, (byte)0);
      paramString.lcC = -1L;
      a(paramString);
    }
    return i;
  }
  
  public final boolean GL(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "deleteMessageEndByName nameTag:%s  stack:%s", new Object[] { paramString, aj.cio() });
    b(GX(paramString), " talker like '%" + paramString + "'", null);
    boolean bool = this.dCZ.fV(GX(paramString), "delete from " + GX(paramString) + " where talker like '%" + paramString + "'");
    if (bool) {
      doNotify();
    }
    return bool;
  }
  
  public final int GM(String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", Integer.valueOf(4));
    int i = this.dCZ.update(GX(paramString), localContentValues, YZ(paramString) + "AND isSend=? AND status!=? ", new String[] { "0", "4" });
    if (i != 0)
    {
      doNotify();
      a(new f.c(paramString, "update", null));
    }
    return i;
  }
  
  public final Cursor GN(String paramString)
  {
    return this.dCZ.query(GX(paramString), null, YZ(paramString), null, null, null, "createTime ASC ");
  }
  
  public final Cursor GO(String paramString)
  {
    return this.dCZ.query(GX(paramString), null, "isSend=? AND" + YZ(paramString) + "AND status!=?", new String[] { "0", "4" }, null, null, null);
  }
  
  public final bd.c GP(String paramString)
  {
    bd.c localc2 = (bd.c)this.tca.get(Integer.valueOf(paramString.hashCode()));
    bd.c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = bd.c.YX(paramString);
      this.tca.m(Integer.valueOf(paramString.hashCode()), localc1);
    }
    return localc1;
  }
  
  public final bd.d GQ(String paramString)
  {
    bd.d locald2 = (bd.d)this.tcb.get(Integer.valueOf(paramString.hashCode()));
    bd.d locald1 = locald2;
    if (locald2 == null)
    {
      locald1 = bd.d.YY(paramString);
      this.tcb.m(Integer.valueOf(paramString.hashCode()), locald1);
    }
    return locald1;
  }
  
  public final bd.a GR(String paramString)
  {
    bd.a locala1 = null;
    if ((!bi.oW(paramString)) && (this.tcc != null)) {
      locala1 = (bd.a)this.tcc.get(Integer.valueOf(paramString.hashCode()));
    }
    for (;;)
    {
      bd.a locala2 = locala1;
      if (locala1 == null)
      {
        locala1 = bd.a.YV(paramString);
        locala2 = locala1;
        if (this.tcc != null)
        {
          this.tcc.m(Integer.valueOf(bi.aG(paramString, "").hashCode()), locala1);
          locala2 = locala1;
        }
      }
      return locala2;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "input text null ???? %B", new Object[] { Boolean.valueOf(bi.oW(paramString)) });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "[arthurdan.FriendContentCrash] Fatal error!!! cachesForFriend is null!");
    }
  }
  
  public final bd.b GS(String paramString)
  {
    bd.b localb2 = (bd.b)this.tcd.get(Integer.valueOf(paramString.hashCode()));
    bd.b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = bd.b.YW(paramString);
      this.tcd.m(Integer.valueOf(paramString.hashCode()), localb1);
    }
    return localb1;
  }
  
  public final int GT(String paramString)
  {
    int i = 0;
    if (GU(paramString))
    {
      i = this.gYF.YI(paramString);
      if (i > 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "getMsgCount conversationStorage.getMsgCountByUsername count:%d", new Object[] { Integer.valueOf(i) });
        return i;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "getMsgCount contactMsgCount is 0 ,go normal %s", new Object[] { paramString });
    }
    while (!"appbrandmessage".equals(GX(paramString))) {
      return GV(paramString);
    }
    paramString = "SELECT COUNT(*) FROM " + GX(paramString) + " WHERE" + YZ(paramString);
    paramString = this.dCZ.b(paramString, null, 0);
    if (paramString.moveToLast()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    return i;
  }
  
  public final boolean GU(String paramString)
  {
    return "message".equals(GX(paramString));
  }
  
  public final int GV(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("SELECT COUNT(*) FROM ").append(GX(paramString)).append(" ");
    String str;
    if (this.tbX)
    {
      str = "INDEXED BY messageTalkerIdStatusIndex";
      paramString = str + " WHERE" + YZ(paramString);
      paramString = this.dCZ.b(paramString, null, 2);
      if (!paramString.moveToFirst()) {
        break label103;
      }
    }
    label103:
    for (int i = paramString.getInt(0);; i = 0)
    {
      paramString.close();
      return i;
      str = "INDEXED BY messageTalkerStatusIndex";
      break;
    }
  }
  
  public final int GW(String paramString)
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder("SELECT COUNT(*) FROM ");
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      String str = Ze(paramString).name;
      paramString = new StringBuilder().append(str).append("  indexed by  ").append(str).append("TalkerTypeIndex ").toString() + " WHERE talker= '" + bi.oU(paramString) + "' AND type IN (3,39,13,43,62,44,268435505)";
      paramString = this.dCZ.b(paramString, null, 2);
      if (paramString.moveToFirst()) {
        i = paramString.getInt(0);
      }
      paramString.close();
      return i;
    }
  }
  
  public final String GX(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      return Ze(paramString).name;
    }
  }
  
  public final long GY(String paramString)
  {
    Object localObject = "select createTime from message where" + YZ(paramString) + "order by createTime LIMIT 1 OFFSET 0";
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get first message create time: " + (String)localObject);
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "get first message create time failed: " + paramString);
      return -1L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      return l;
    }
    ((Cursor)localObject).close();
    return -1L;
  }
  
  public final long GZ(String paramString)
  {
    Object localObject = "select createTime from message where" + YZ(paramString) + "order by createTime DESC LIMIT 1 ";
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get last message create time: " + (String)localObject);
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "get last message create time failed " + paramString);
      return -1L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      return l;
    }
    ((Cursor)localObject).close();
    return -1L;
  }
  
  public final void Gz(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "lockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", new Object[] { paramString, Boolean.valueOf(this.tci), Integer.valueOf(this.sKC.sKF), Integer.valueOf(this.sNT.sKF), Integer.valueOf(this.tch.size()), this.tcj, Long.valueOf(bi.bH(this.tck)) });
    if (bi.oW(paramString)) {
      Assert.assertTrue("lockForSync, do not call me by null tag.", false);
    }
    if (this.tci)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "lockForSync, has been locked by :%s  time:%d", new Object[] { this.tcj, Long.valueOf(bi.bH(this.tck)) });
      return;
    }
    this.tcj = paramString;
    this.tck = bi.VF();
    this.tci = true;
    super.lock();
    this.sNT.lock();
  }
  
  public final void H(String paramString, long paramLong)
  {
    f.b localb = Ze(paramString);
    long l = localb.dTS;
    Random localRandom = new Random();
    this.dCZ.fV("message", "BEGIN;");
    bd localbd = new bd(paramString);
    int i = 0;
    while (i < paramLong)
    {
      localbd.ay(System.currentTimeMillis());
      localbd.setType(1);
      localbd.setContent("纵观目前国内手游市场，大量同质类手游充斥玩家的视野，而在主机和PC平台上经久不衰的体育类游戏，却鲜有佳作。在获得了NBA官方认可以后。" + bi.cjc());
      localbd.setMsgId(l);
      localbd.setStatus(localRandom.nextInt(4));
      localbd.eX(localRandom.nextInt(1));
      l += 1L;
      localb.dTS += 1L;
      localbd.ax(System.currentTimeMillis() + bi.cjc());
      this.dCZ.fV("message", "INSERT INTO " + GX(localbd.field_talker) + " (msgid,msgSvrid,type,status,createTime,talker,content,talkerid)  VALUES(" + localbd.field_msgId + "," + localbd.field_msgSvrId + "," + localbd.getType() + "," + localbd.field_status + "," + localbd.field_createTime + ",'" + localbd.field_talker + "','" + localbd.field_content + "'," + Za(paramString) + ");");
      if (i % 10000 == 0)
      {
        this.dCZ.fV("message", "COMMIT;");
        this.dCZ.fV("message", "BEGIN;");
      }
      i += 1;
    }
    this.dCZ.fV("message", "COMMIT;");
    this.gYF.Yr(paramString);
    localbd.setMsgId(1L + l);
    T(localbd);
  }
  
  public final long Ha(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0L;
    }
    Object localObject = "select msgSeq from message where" + YZ(paramString) + "order by msgSeq DESC LIMIT 1 ";
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq: " + (String)localObject);
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq failed " + paramString);
      return 0L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      return l;
    }
    ((Cursor)localObject).close();
    return 0L;
  }
  
  public final bd Hb(String paramString)
  {
    if (bi.oW(paramString)) {
      localObject1 = null;
    }
    do
    {
      return (bd)localObject1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg talker[%s], onlyCache[%b]", new Object[] { paramString, Boolean.valueOf(false) });
      localObject1 = (Long)this.tcf.get(paramString);
      if ((localObject1 == null) || (((Long)localObject1).longValue() <= 0L)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg hit cache msgid[%d]", new Object[] { Long.valueOf(((Long)localObject1).longValue()) });
      localObject2 = dW(((Long)localObject1).longValue());
      localObject1 = localObject2;
    } while ((((cm)localObject2).field_flag & 0x1) != 0);
    this.tcf.remove(paramString);
    return null;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg not hit cache");
    Object localObject1 = new bd();
    long l = System.currentTimeMillis();
    Object localObject2 = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND flag %2 = 1  ORDER BY msgSeq DESC LIMIT 1 ";
    localObject2 = this.dCZ.b((String)localObject2, null, 2);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg take %dms, tid[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Long.valueOf(Thread.currentThread().getId()) });
    if (localObject2 == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg failed " + paramString);
      return (bd)localObject1;
    }
    if (((Cursor)localObject2).moveToFirst()) {
      ((bd)localObject1).d((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    this.tcf.m(paramString, Long.valueOf(((cm)localObject1).field_msgId));
    return (bd)localObject1;
  }
  
  public final int Hc(String paramString)
  {
    String str = " SELECT COUNT(*) FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND isSend=1";
    Cursor localCursor = this.dCZ.b(str, null, 2);
    for (;;)
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          break label143;
        }
        i = localCursor.getInt(0);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
        localCursor.close();
        i = 0;
        continue;
      }
      finally
      {
        localCursor.close();
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "[getMsgCountBySelf] getCursor talk:%s,count:%s,[%s]", new Object[] { paramString, Integer.valueOf(i), str });
      return i;
      label143:
      int i = 0;
    }
  }
  
  /* Error */
  public final List<bd> Hd(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 512	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 513	java/util/ArrayList:<init>	()V
    //   9: astore_3
    //   10: aload_0
    //   11: getfield 135	com/tencent/mm/storage/be:dCZ	Lcom/tencent/mm/bt/h;
    //   14: ldc 64
    //   16: aconst_null
    //   17: ldc_w 1070
    //   20: iconst_2
    //   21: anewarray 54	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: aload_1
    //   27: invokestatic 259	com/tencent/mm/sdk/platformtools/bi:oU	(Ljava/lang/String;)Ljava/lang/String;
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: invokestatic 497	java/lang/System:currentTimeMillis	()J
    //   36: ldc2_w 1071
    //   39: lsub
    //   40: invokestatic 1074	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   43: aastore
    //   44: aconst_null
    //   45: aconst_null
    //   46: ldc_w 700
    //   49: iconst_2
    //   50: invokevirtual 712	com/tencent/mm/bt/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   53: astore_1
    //   54: aload_1
    //   55: astore_2
    //   56: aload_2
    //   57: astore_1
    //   58: aload_2
    //   59: invokeinterface 756 1 0
    //   64: ifeq +69 -> 133
    //   67: aload_2
    //   68: astore_1
    //   69: new 396	com/tencent/mm/storage/bd
    //   72: dup
    //   73: invokespecial 707	com/tencent/mm/storage/bd:<init>	()V
    //   76: astore 4
    //   78: aload_2
    //   79: astore_1
    //   80: aload 4
    //   82: aload_2
    //   83: invokevirtual 715	com/tencent/mm/storage/bd:d	(Landroid/database/Cursor;)V
    //   86: aload_2
    //   87: astore_1
    //   88: aload_3
    //   89: aload 4
    //   91: invokevirtual 1075	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   94: pop
    //   95: goto -39 -> 56
    //   98: astore_3
    //   99: aload_2
    //   100: astore_1
    //   101: ldc -82
    //   103: aload_3
    //   104: ldc_w 1077
    //   107: iconst_1
    //   108: anewarray 178	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload_3
    //   114: invokevirtual 336	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   117: aastore
    //   118: invokestatic 1067	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: aload_2
    //   122: ifnull +9 -> 131
    //   125: aload_2
    //   126: invokeinterface 486 1 0
    //   131: aconst_null
    //   132: areturn
    //   133: aload_2
    //   134: ifnull +9 -> 143
    //   137: aload_2
    //   138: invokeinterface 486 1 0
    //   143: aload_3
    //   144: areturn
    //   145: astore_1
    //   146: aload_2
    //   147: ifnull +9 -> 156
    //   150: aload_2
    //   151: invokeinterface 486 1 0
    //   156: aload_1
    //   157: athrow
    //   158: astore_3
    //   159: aload_1
    //   160: astore_2
    //   161: aload_3
    //   162: astore_1
    //   163: goto -17 -> 146
    //   166: astore_3
    //   167: aconst_null
    //   168: astore_2
    //   169: goto -70 -> 99
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	be
    //   0	172	1	paramString	String
    //   1	168	2	str	String
    //   9	80	3	localArrayList	ArrayList
    //   98	46	3	localException1	Exception
    //   158	4	3	localObject	Object
    //   166	1	3	localException2	Exception
    //   76	14	4	localbd	bd
    // Exception table:
    //   from	to	target	type
    //   58	67	98	java/lang/Exception
    //   69	78	98	java/lang/Exception
    //   80	86	98	java/lang/Exception
    //   88	95	98	java/lang/Exception
    //   2	54	145	finally
    //   58	67	158	finally
    //   69	78	158	finally
    //   80	86	158	finally
    //   88	95	158	finally
    //   101	121	158	finally
    //   2	54	166	java/lang/Exception
  }
  
  public final long He(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return 0L;
      paramString = Zd(paramString);
    } while (paramString == null);
    return paramString.dTS;
  }
  
  public final Cursor Hf(String paramString)
  {
    try
    {
      paramString = this.dCZ.a(GX(paramString), null, YZ(paramString) + " AND createTime>=? AND type IN (436207665,419430449)", new String[] { String.valueOf(System.currentTimeMillis() - 86400000L) }, null, null, "createTime ASC", 2);
      return paramString;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MsgInfoStorage", paramString, "getLastDayC2CMsgByTalker error: %s", new Object[] { paramString.getMessage() });
    }
    return null;
  }
  
  public final bd I(String paramString, long paramLong)
  {
    bd localbd = new bd();
    paramString = this.dCZ.a(GX(paramString), null, "msgSvrId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final bd J(String paramString, long paramLong)
  {
    bd localbd = new bd();
    paramString = this.dCZ.a(GX(paramString), null, YZ(paramString) + " AND msgSeq=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final bd K(String paramString, long paramLong)
  {
    bd localbd = new bd();
    paramString = this.dCZ.a(GX(paramString), null, "createTime=? AND" + YZ(paramString), new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final List<bd> L(String paramString, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = "Select * From " + GX(paramString) + " Where " + YZ(paramString) + " AND createTime < ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 11";
    paramString = this.dCZ.b(paramString, new String[] { String.valueOf(paramLong) }, 2);
    while (paramString.moveToNext())
    {
      bd localbd = new bd();
      localbd.d(paramString);
      localArrayList.add(localbd);
    }
    paramString.close();
    return localArrayList;
  }
  
  public final List<bd> M(String paramString, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = "Select * From " + GX(paramString) + " Where " + YZ(paramString) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 11;";
    paramString = this.dCZ.b(paramString, new String[] { String.valueOf(paramLong) }, 2);
    while (paramString.moveToNext())
    {
      bd localbd = new bd();
      localbd.d(paramString);
      localArrayList.add(localbd);
    }
    paramString.close();
    return localArrayList;
  }
  
  public final bd N(String paramString, long paramLong)
  {
    bd localbd = new bd();
    paramString = "Select * From " + GX(paramString) + " Where " + YZ(paramString) + " AND createTime < ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 1;";
    paramString = this.dCZ.b(paramString, new String[] { String.valueOf(paramLong) }, 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final bd O(String paramString, long paramLong)
  {
    bd localbd = new bd();
    paramString = "Select * From " + GX(paramString) + " Where " + YZ(paramString) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime ASC Limit 1;";
    paramString = this.dCZ.b(paramString, new String[] { String.valueOf(paramLong) }, 2);
    if (paramString.moveToFirst()) {
      localbd.d(paramString);
    }
    paramString.close();
    return localbd;
  }
  
  public final boolean P(String paramString, long paramLong)
  {
    return K(paramString, paramLong).field_msgId > 0L;
  }
  
  public final long Q(String paramString, long paramLong)
  {
    paramString = "select createTime from " + GX(paramString) + " where msgId = " + paramLong;
    paramLong = 0L;
    paramString = this.dCZ.b(paramString, null, 2);
    if (paramString.moveToFirst()) {
      paramLong = paramString.getLong(0);
    }
    paramString.close();
    return paramLong;
  }
  
  public final int R(String paramString, long paramLong)
  {
    bd localbd = I(paramString, paramLong);
    this.tcg.j((int)(bi.VE() / 86400L), localbd.field_msgSvrId, localbd.field_createTime / 1000L);
    int i = this.dCZ.delete(GX(paramString), "msgSvrId=?", new String[] { String.valueOf(paramLong) });
    if (i != 0)
    {
      doNotify();
      a(new f.c(paramString, "delete", null, 1, (byte)0));
      return i;
    }
    com.tencent.mm.plugin.report.f.mDy.a(111L, 246L, 1L, false);
    return i;
  }
  
  public final int S(bd parambd)
  {
    int i = 0;
    if ((parambd == null) || (bi.oW(parambd.field_talker))) {
      return 0;
    }
    parambd = "SELECT count(msgId) FROM " + GX(parambd.field_talker) + " WHERE" + YZ(parambd.field_talker) + "AND isSend = 0 AND msgId >= " + parambd.field_msgId + " ORDER BY createTime DESC";
    parambd = this.dCZ.b(parambd, null, 2);
    if (parambd.moveToFirst()) {
      i = parambd.getInt(0);
    }
    parambd.close();
    return i;
  }
  
  public final int S(String paramString, long paramLong)
  {
    String str = YZ(paramString) + " and createTime <= " + paramLong;
    b(GX(paramString), str, null);
    int i = this.dCZ.delete(GX(paramString), str, null);
    if (i != 0)
    {
      Xp("delete_talker " + paramString);
      paramString = new f.c(paramString, "delete", null, i, (byte)0);
      paramString.lcC = -1L;
      a(paramString);
    }
    return i;
  }
  
  public final int T(String paramString, long paramLong)
  {
    int i = 0;
    bd localbd = dW(paramLong);
    if (localbd.field_msgId == 0L)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
      return 0;
    }
    String str = GX(paramString);
    paramString = "SELECT COUNT(*) FROM " + str + " " + Zc(str) + " WHERE " + YZ(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime < " + localbd.field_createTime;
    paramString = this.dCZ.b(paramString, null, 2);
    if (paramString.moveToFirst()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    return i;
  }
  
  public final long T(bd parambd)
  {
    return b(parambd, false);
  }
  
  public final String U(String paramString, long paramLong)
  {
    int i = 0;
    Object localObject1 = dW(paramLong);
    if (((cm)localObject1).field_msgId == 0L)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
      return null;
    }
    Object localObject2 = GX(paramString);
    paramString = "EXPLAIN QUERY PLAN SELECT COUNT(*) FROM " + (String)localObject2 + " " + Zc((String)localObject2) + " WHERE" + YZ(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime < " + ((cm)localObject1).field_createTime;
    localObject2 = this.dCZ.b(paramString, null, 0);
    paramString = "";
    localObject1 = paramString;
    if (((Cursor)localObject2).moveToFirst()) {
      for (;;)
      {
        localObject1 = paramString;
        if (i >= ((Cursor)localObject2).getColumnCount()) {
          break;
        }
        paramString = paramString + ((Cursor)localObject2).getString(i) + " ";
        i += 1;
      }
    }
    ((Cursor)localObject2).close();
    return (String)localObject1;
  }
  
  public final void U(bd parambd)
  {
    if ((parambd == null) || (parambd.field_status == 4)) {}
    String str;
    do
    {
      do
      {
        return;
        parambd.setStatus(4);
        str = go(parambd.field_msgId);
      } while ((str == null) || (str.length() <= 0));
    } while (this.dCZ.update(str, parambd.wH(), "msgId=?", new String[] { parambd.field_msgId }) == 0);
    doNotify();
    a(new f.c(parambd.field_talker, "update", parambd, -1));
  }
  
  public final int V(bd parambd)
  {
    int i = 0;
    if (parambd != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("content", parambd.field_content);
      localContentValues.put("status", Integer.valueOf(parambd.field_status));
      int j = this.dCZ.update(go(parambd.field_msgId), localContentValues, "msgId=?", new String[] { String.valueOf(parambd.field_msgId) });
      i = j;
      if (j != 0)
      {
        doNotify();
        a(new f.c(parambd.field_talker, "update", parambd));
        i = j;
      }
    }
    return i;
  }
  
  public final bd V(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = "select * from message where" + YZ(paramString) + " and msgSeq > " + paramLong + " order by msgSeq ASC LIMIT 1 ";
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "summerbadcr getNewerMsgByMsgSeq: " + (String)localObject);
    localObject = this.dCZ.b((String)localObject, null, 0);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "summerbadcr getNewerMsgByMsgSeq failed " + paramString);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new bd();
      paramString.d((Cursor)localObject);
      ((Cursor)localObject).close();
      return paramString;
    }
    ((Cursor)localObject).close();
    return null;
  }
  
  public final bd W(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = "select * from message where" + YZ(paramString) + " and msgSeq < " + paramLong + " order by msgSeq DESC LIMIT 1 ";
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "summerbadcr getOlderMsgByMsgSeq: " + (String)localObject);
    localObject = this.dCZ.b((String)localObject, null, 0);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "summerbadcr getNewerMsgByMsgSeq failed " + paramString);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new bd();
      paramString.d((Cursor)localObject);
      ((Cursor)localObject).close();
      return paramString;
    }
    ((Cursor)localObject).close();
    return null;
  }
  
  public final long X(String paramString, long paramLong)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(18) });
    paramString = "SELECT createTime FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime < " + paramLong + " ORDER BY createTime DESC  LIMIT 18";
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get up inc msg create time sql: %s", new Object[] { paramString });
    paramString = this.dCZ.b(paramString, null, 0);
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
      return paramLong;
    }
    if (paramString.moveToLast())
    {
      paramLong = paramString.getLong(0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong) });
      paramString.close();
      return paramLong;
    }
    paramString.close();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "get result fail");
    return paramLong;
  }
  
  public final List<bd> X(String paramString, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = "SELECT * FROM " + GX(paramString) + " WHERE type = 49 ORDER BY createTime DESC LIMIT " + paramInt1 + " , " + paramInt2;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "getAppMsgTypeList sql=%s", new Object[] { paramString });
    paramString = this.dCZ.b(paramString, null, 2);
    while (paramString.moveToNext())
    {
      bd localbd = new bd();
      localbd.d(paramString);
      if (localbd.aQm()) {
        localArrayList.add(localbd);
      }
    }
    paramString.close();
    return localArrayList;
  }
  
  public final long Y(String paramString, long paramLong)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get down inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(18) });
    paramString = "SELECT createTime FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime > " + paramLong + " ORDER BY createTime ASC  LIMIT 18";
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get down inc msg create time sql: %s", new Object[] { paramString });
    paramString = this.dCZ.b(paramString, null, 0);
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "get down inc msg create time error, cursor is null");
      return paramLong;
    }
    if (paramString.moveToLast())
    {
      paramLong = paramString.getLong(0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong) });
      paramString.close();
      return paramLong;
    }
    paramString.close();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "get result fail");
    return paramLong;
  }
  
  public final Cursor Y(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    String str = GX(paramString);
    paramString = "select * from ( select * from " + str + " where" + YZ(paramString) + " AND type IN (3,39,13,43,62,44,268435505)  order by createTime DESC limit " + paramInt2 + " OFFSET " + paramInt1 + ") order by createTime ASC ";
    return this.dCZ.b(paramString, null, 2);
  }
  
  public final Cursor a(String paramString, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    if (paramLong2 < paramLong1) {}
    for (;;)
    {
      paramString = new StringBuilder("SELECT * FROM ").append(GX(paramString)).append(" WHERE").append(YZ(paramString)).append("AND createTime >= ").append(paramLong2).append(" AND createTime <= ").append(paramLong1).append(" AND isSend=");
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        paramString = i + " LIMIT 1";
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
        return this.dCZ.b(paramString, null, 0);
      }
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }
  
  public final void a(long paramLong, bd parambd)
  {
    if (parambd.cmg())
    {
      String str = Zb(parambd.cqb);
      if (s.hK(str))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { str });
        parambd.ep("notifymessage");
      }
    }
    am(parambd);
    if (this.dCZ.update(go(paramLong), parambd.wH(), "msgId=?", new String[] { String.valueOf(paramLong) }) != 0)
    {
      doNotify();
      a(new f.c(parambd.field_talker, "update", parambd));
      return;
    }
    com.tencent.mm.plugin.report.f.mDy.a(111L, 244L, 1L, false);
  }
  
  public final void a(h paramh, String paramString)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    Cursor localCursor = paramh.b("PRAGMA table_info( " + paramString + " )", null, 2);
    int i5 = localCursor.getColumnIndex("name");
    while (localCursor.moveToNext()) {
      if (i5 >= 0)
      {
        String str = localCursor.getString(i5);
        if ("lvbuffer".equalsIgnoreCase(str)) {
          i = 1;
        } else if ("transContent".equalsIgnoreCase(str)) {
          j = 1;
        } else if ("transBrandWording".equalsIgnoreCase(str)) {
          k = 1;
        } else if ("talkerId".equalsIgnoreCase(str)) {
          m = 1;
        } else if ("bizClientMsgId".equalsIgnoreCase(str)) {
          n = 1;
        } else if ("bizChatId".equalsIgnoreCase(str)) {
          i1 = 1;
        } else if ("bizChatUserId".equalsIgnoreCase(str)) {
          i2 = 1;
        } else if ("msgSeq".equalsIgnoreCase(str)) {
          i3 = 1;
        } else if ("flag".equalsIgnoreCase(str)) {
          i4 = 1;
        }
      }
    }
    localCursor.close();
    long l = paramh.dO(Thread.currentThread().getId());
    if (i == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add lvbuffer BLOB ");
    }
    if (j == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add transContent TEXT ");
    }
    if (k == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add transBrandWording TEXT ");
    }
    if (m == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add talkerId INTEGER ");
    }
    if (n == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add bizClientMsgId TEXT ");
    }
    if (i1 == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add bizChatId INTEGER DEFAULT -1");
    }
    if (i2 == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add bizChatUserId TEXT ");
    }
    if (i3 == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add msgSeq INTEGER ");
    }
    if (i4 == 0) {
      paramh.fV(paramString, "Alter table " + paramString + " add flag INT DEFAULT 0 ");
    }
    paramh.gp(l);
  }
  
  public final void a(f.a parama)
  {
    this.sNT.remove(parama);
  }
  
  public final void a(f.a parama, Looper paramLooper)
  {
    this.sNT.a(parama, paramLooper);
  }
  
  public final void a(f.b paramb)
  {
    synchronized (this.tbZ)
    {
      this.tbZ.add(paramb);
      b(paramb);
      return;
    }
  }
  
  public final void a(f.c paramc)
  {
    if (this.sNT.ci(paramc)) {
      this.sNT.doNotify();
    }
  }
  
  public final void a(e parame)
  {
    if (!this.tbY.contains(parame))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "addMessageStorageImpl %s", new Object[] { parame });
      this.tbY.add(parame);
    }
  }
  
  public final long b(bd parambd, boolean paramBoolean)
  {
    if ((parambd == null) || (bi.oW(parambd.field_talker)))
    {
      com.tencent.mm.plugin.report.f.mDy.a(111L, 250L, 1L, false);
      if (parambd == null) {}
      for (localObject1 = "-1";; localObject1 = parambd.field_talker)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "Error insert message msg:%s talker:%s", new Object[] { parambd, localObject1 });
        return -1L;
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "insert lockForSync[%b], message seq[%d]", new Object[] { Boolean.valueOf(this.tci), Long.valueOf(parambd.field_msgSeq) });
    Object localObject1 = null;
    Object localObject2 = com.tencent.mm.model.bd.iF(parambd.cqb);
    if (localObject2 != null) {
      localObject1 = ((com.tencent.mm.model.bd.b)localObject2).dCl;
    }
    if (s.hK((String)localObject1))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { localObject1 });
      if (parambd.getType() == 436207665)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "protect:c2c msg should not here");
        return -1L;
      }
      parambd.ep("notifymessage");
    }
    localObject1 = Ze(parambd.field_talker);
    if (localObject1 == null)
    {
      com.tencent.mm.plugin.report.f.mDy.a(111L, 249L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "Error insert message getTableByTalker failed. talker:%s", new Object[] { parambd.field_talker });
      return -1L;
    }
    ((f.b)localObject1).bdn();
    parambd.setMsgId(((f.b)localObject1).dTS);
    Assert.assertTrue(String.format("check table name from id:%d table:%s getTableNameByLocalId:%s", new Object[] { Long.valueOf(parambd.field_msgId), localObject1, go(parambd.field_msgId) }), ((f.b)localObject1).name.equals(go(parambd.field_msgId)));
    if (parambd.field_msgSvrId != 0L)
    {
      parambd.cGF = 1;
      parambd.cpN = true;
    }
    Iterator localIterator = this.tbY.iterator();
    while (localIterator.hasNext()) {
      if (!((e)localIterator.next()).a(parambd, (com.tencent.mm.model.bd.b)localObject2))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "Error dealMsgSource. talker:%s ,msgSouce:%s", new Object[] { parambd.field_talker, parambd.cqb });
        return -1L;
      }
    }
    am(parambd);
    if (((f.b)localObject1).name.equals("message"))
    {
      parambd.field_talkerId = ((int)Za(parambd.field_talker));
      parambd.cpO = true;
    }
    localObject2 = parambd.wH();
    long l = this.dCZ.a(((f.b)localObject1).name, "msgId", (ContentValues)localObject2, paramBoolean);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "insert:%d talker:%s id:%d type:%d status:%d svrid:%d msgseq:%d flag:%d create:%d issend:%d lockforsync[%s,%d]", new Object[] { Long.valueOf(l), parambd.field_talker, Long.valueOf(parambd.field_msgId), Integer.valueOf(parambd.getType()), Integer.valueOf(parambd.field_status), Long.valueOf(parambd.field_msgSvrId), Long.valueOf(parambd.field_msgSeq), Integer.valueOf(parambd.field_flag), Long.valueOf(parambd.field_createTime), Integer.valueOf(parambd.field_isSend), this.tcj, Long.valueOf(bi.bH(this.tck)) });
    if (l == -1L)
    {
      com.tencent.mm.plugin.report.f.mDy.a(111L, 248L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "insert failed svrid:%d ret:%d", new Object[] { Long.valueOf(parambd.field_msgSvrId), Long.valueOf(l) });
      return -1L;
    }
    if ((this.tci) && (bi.bH(this.tck) > 2000L) && (parambd.field_isSend == 1) && (parambd.field_status == 1))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "insert this fucking tag[%s] lockForSync too long:%d force to release Now.", new Object[] { this.tcj, Long.valueOf(bi.bH(this.tck)) });
      GA(this.tcj);
    }
    if (this.tci)
    {
      localObject1 = null;
      if (e.sNP != null) {
        localObject1 = e.sNP.I(parambd);
      }
      if (!bi.oW((String)localObject1)) {
        break label924;
      }
    }
    label924:
    for (localObject2 = parambd.field_talker;; localObject2 = localObject1)
    {
      localObject1 = null;
      if (this.tch.containsKey(localObject2)) {
        localObject1 = (f.c)this.tch.get(localObject2);
      }
      if (localObject1 == null)
      {
        localObject1 = new f.c(parambd.field_talker, "insert", parambd);
        if (f.c.W(parambd)) {
          ((f.c)localObject1).lcz += 1;
        }
        ((f.c)localObject1).lcA += 1;
        this.tch.put(localObject2, localObject1);
      }
      for (;;)
      {
        return parambd.field_msgId;
        ((f.c)localObject1).lcy.add(parambd);
        break;
        localObject1 = new f.c(parambd.field_talker, "insert", parambd);
        if (f.c.W(parambd)) {
          ((f.c)localObject1).lcz = 1;
        }
        ((f.c)localObject1).lcA = 1;
        doNotify();
        a((f.c)localObject1);
      }
    }
  }
  
  public final Cursor b(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    if (paramLong2 == 0L)
    {
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime > " + paramLong1 + " ORDER BY createTime ASC  LIMIT 50 OFFSET " + paramInt;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      return this.dCZ.b(paramString, null, 0);
    }
    if (paramLong2 < paramLong1) {}
    for (;;)
    {
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime > " + paramLong2 + " AND createTime < " + paramLong1 + " ORDER BY createTime ASC  LIMIT 50 OFFSET " + paramInt;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      return this.dCZ.b(paramString, null, 0);
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }
  
  public final void b(long paramLong, bd parambd)
  {
    if (bi.oV(parambd.field_talker).length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("no talker set when update by svrid", bool);
      if (parambd.cmg())
      {
        String str = Zb(parambd.cqb);
        if (s.hK(str))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { str });
          parambd.ep("notifymessage");
        }
      }
      am(parambd);
      if (this.dCZ.update(GX(parambd.field_talker), parambd.wH(), "msgSvrId=?", new String[] { String.valueOf(paramLong) }) == 0) {
        break;
      }
      doNotify();
      a(new f.c(parambd.field_talker, "update", parambd));
      return;
    }
    com.tencent.mm.plugin.report.f.mDy.a(111L, 243L, 1L, false);
  }
  
  public final void b(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    long l = bi.VE();
    Object localObject = "SELECT msgSvrId,createTime FROM " + paramString1 + " WHERE createTime > " + (l - 172800L) * 1000L;
    paramString1 = (String)localObject;
    if (!bi.oW(paramString2)) {
      paramString1 = (String)localObject + " AND " + paramString2;
    }
    paramString2 = new ArrayList();
    localObject = new ArrayList();
    paramString1 = this.dCZ.b(paramString1, paramArrayOfString, 2);
    if (paramString1.moveToFirst())
    {
      do
      {
        int i = paramString1.getInt(0);
        l = paramString1.getLong(1) / 1000L;
        paramString2.add(Integer.valueOf(i));
        ((List)localObject).add(Long.valueOf(l));
      } while (paramString1.moveToNext());
      this.tcg.h(paramString2, (List)localObject);
    }
    paramString1.close();
  }
  
  public final Cursor bA(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    String str = GX(paramString);
    paramString = "select * from " + str + " where" + YZ(paramString) + " AND type = 49  order by createTime DESC limit " + paramInt + " OFFSET 0";
    return this.dCZ.b(paramString, null, 0);
  }
  
  public final Cursor bB(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    Object localObject = GX(paramString);
    paramString = new StringBuilder("select msgId,msgSvrId,createTime,content,isSend from ").append((String)localObject).append(" where").append(YZ(paramString)).append(" AND ");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" (type = 49");
    ((StringBuilder)localObject).append(" or type = 587202609");
    ((StringBuilder)localObject).append(" or type = 553648177) ");
    paramString = ((StringBuilder)localObject).toString() + "  order by createTime DESC limit 100 OFFSET " + paramInt;
    return this.dCZ.b(paramString, null, 0);
  }
  
  public final int bC(String paramString, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "deleteByTalkerFrom :%s  :%d stack:%s", new Object[] { paramString, Integer.valueOf(paramInt), aj.cio() });
    bd localbd = I(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localbd.field_talker));
    b(GX(paramString), "createTime<=? AND" + YZ(paramString), new String[] { localbd.field_createTime });
    paramInt = this.dCZ.delete(GX(paramString), "createTime<=? AND" + YZ(paramString), new String[] { localbd.field_createTime });
    if (paramInt != 0)
    {
      doNotify();
      a(new f.c(paramString, "delete", null, paramInt, (byte)0));
    }
    return paramInt;
  }
  
  public final Cursor bD(String paramString, int paramInt)
  {
    bd localbd = I(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localbd.field_talker));
    return this.dCZ.query(GX(paramString), null, "createTime<=? AND" + YZ(paramString), new String[] { localbd.field_createTime }, null, null, null);
  }
  
  public final Cursor bE(String paramString, int paramInt)
  {
    return this.dCZ.query(GX(paramString), null, "isSend=? AND" + YZ(paramString) + "AND status!=?  order by msgId DESC limit " + paramInt, new String[] { "0", "4" }, null, null, null);
  }
  
  public final int bF(String paramString, int paramInt)
  {
    int i = 0;
    paramString = "SELECT COUNT(*) FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND type = " + paramInt;
    paramString = this.dCZ.b(paramString, null, 2);
    paramInt = i;
    if (paramString.moveToFirst()) {
      paramInt = paramString.getInt(0);
    }
    paramString.close();
    return paramInt;
  }
  
  public final Cursor bG(String paramString, int paramInt)
  {
    String str = " SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND isSend=1 ORDER BY createTime DESC LIMIT " + paramInt;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "[getInitCursorBySelf] getCursor talk:%s,limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
    return this.dCZ.b(str, null, 0);
  }
  
  public final bd[] bH(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramInt <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getLastMsgList, invalid argument, talker = " + paramString + ", limit = " + paramInt);
      return null;
    }
    Object localObject = "select * from " + GX(paramString) + " where" + YZ(paramString) + "order by createTime DESC limit " + paramInt;
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      ArrayList localArrayList = new ArrayList();
      do
      {
        bd localbd = new bd();
        localbd.d((Cursor)localObject);
        localArrayList.add(localbd);
      } while (((Cursor)localObject).moveToNext());
      ((Cursor)localObject).close();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "getLastMsgList, talker = " + paramString + ", limit = " + paramInt + ", count = " + localArrayList.size());
      Collections.reverse(localArrayList);
      return (bd[])localArrayList.toArray(new bd[localArrayList.size()]);
    }
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "getLastMsgList, cursor is empty");
    ((Cursor)localObject).close();
    return null;
  }
  
  public final Cursor bI(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    String str = GX(paramString);
    paramString = "select * from " + str + " where" + YZ(paramString) + " AND type IN (436207665,419430449)  order by createTime DESC limit " + paramInt + " OFFSET 0";
    return this.dCZ.b(paramString, null, 0);
  }
  
  public final h bdc()
  {
    return this.dCZ;
  }
  
  public final void bdd()
  {
    g.Ek();
    g.Ei().DT().set(348167, Integer.valueOf(1));
  }
  
  public final void bde()
  {
    int i = 0;
    while (i < this.tbZ.size())
    {
      b((f.b)this.tbZ.get(i));
      i += 1;
    }
  }
  
  public final void bdf()
  {
    if (!this.tbX) {}
    Object localObject;
    do
    {
      return;
      localObject = "select count(*) from " + "message" + " where talkerId ISNULL ";
      localObject = this.dCZ.b((String)localObject, null, 2);
    } while (localObject == null);
    if (((Cursor)localObject).moveToFirst()) {}
    for (int i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      if (i <= 0) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", " msg table exists null talkerid ,start translate tableName %s ", new Object[] { "message" });
      long l = System.currentTimeMillis();
      localObject = "update " + "message" + " set talkerId=(select rowid from rcontact where rcontact.username = " + "message" + ".talker)";
      boolean bool = this.dCZ.fV("message", (String)localObject);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "update result :%b last %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
      if ((!bool) || (!this.tbX)) {
        break;
      }
      this.dCZ.fV("message", "DROP INDEX messageCreateTaklerTypeTimeIndex IF EXISTS");
      this.dCZ.fV("message", "DROP INDEX messageTalkerStatusIndex IF EXISTS");
      this.dCZ.fV("message", "DROP INDEX messageTalkerCreateTimeIsSendIndex IF EXISTS");
      this.dCZ.fV("message", "DROP INDEX messageCreateTaklerTimeIndex IF EXISTS");
      this.dCZ.fV("message", "DROP INDEX messageTalkerSvrIdIndex IF EXISTS");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "clear talker Name index");
      return;
    }
  }
  
  public final ArrayList<bd> bdg()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.dCZ.a("message", null, "createTime>=? AND status=? AND isSend=?", new String[] { String.valueOf(System.currentTimeMillis() - 172800000L), "5", "1" }, null, null, "createTime ASC", 2);
    label143:
    while (localCursor.moveToNext())
    {
      bd localbd = new bd();
      localbd.d(localCursor);
      if (!localbd.cmx()) {}
      for (int i = 1;; i = 0)
      {
        if (((i & 0x1) == 0) || (ab.XO(localbd.field_talker)) || (ab.XQ(localbd.field_talker)) || (ab.gY(localbd.field_talker))) {
          break label143;
        }
        localArrayList.add(localbd);
        break;
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public final List<bd> bdh()
  {
    ArrayList localArrayList = new ArrayList();
    boolean bool;
    Object localObject1;
    int i;
    if (this.tbZ != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localObject1 = new ArrayList();
      i = 0;
    }
    Object localObject2;
    for (;;)
    {
      if (i >= this.tbZ.size()) {
        break label201;
      }
      localObject2 = this.dCZ.a(((f.b)this.tbZ.get(i)).name, null, "status=1 and isSend=1", null, null, null, "createTime DESC ", 2);
      for (;;)
      {
        if (!((Cursor)localObject2).moveToNext()) {
          break label187;
        }
        bd localbd = new bd();
        localbd.d((Cursor)localObject2);
        if ((localbd.isText()) || (localbd.cmi()) || (localbd.aQo()) || (localbd.cms()))
        {
          if (com.tencent.mm.model.bd.Ik() - localbd.field_createTime > 600000L)
          {
            ((List)localObject1).add(localbd);
            continue;
            bool = false;
            break;
          }
          localArrayList.add(localbd);
        }
      }
      label187:
      ((Cursor)localObject2).close();
      i += 1;
    }
    label201:
    if (((List)localObject1).size() > 0)
    {
      long l = this.dCZ.dO(-1L);
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (bd)((Iterator)localObject1).next();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "Set msg timtout : id:%d time:%d talker:%s content:%s", new Object[] { Long.valueOf(((cm)localObject2).field_msgId), Long.valueOf(((cm)localObject2).field_createTime), ((cm)localObject2).field_talker, bi.Xf(((cm)localObject2).field_content) });
        ((bd)localObject2).setStatus(5);
        a(((cm)localObject2).field_msgId, (bd)localObject2);
      }
      this.dCZ.gp(l);
    }
    return localArrayList;
  }
  
  public final Cursor bdi()
  {
    return this.dCZ.query("message", new String[] { "talker", "count(*) as unReadCount" }, "isSend=? AND status!=?", new String[] { "0", "4" }, "talker", null, null);
  }
  
  public final Cursor bdj()
  {
    if (this.tbZ.size() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      return this.dCZ.query(((f.b)this.tbZ.get(0)).name, null, "msgId=?", new String[] { "-1" }, null, null, null);
    }
  }
  
  public final String bdk()
  {
    return "type IN (3,39,13,43,62,44,268435505)";
  }
  
  public final String bdl()
  {
    return "type IN (3,39,13,43,62,44,49,268435505)";
  }
  
  /* Error */
  public final List<bd> bdm()
  {
    // Byte code:
    //   0: new 512	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 513	java/util/ArrayList:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: getfield 135	com/tencent/mm/storage/be:dCZ	Lcom/tencent/mm/bt/h;
    //   12: ldc 64
    //   14: aconst_null
    //   15: ldc_w 1621
    //   18: iconst_1
    //   19: anewarray 54	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: invokestatic 497	java/lang/System:currentTimeMillis	()J
    //   27: ldc2_w 1071
    //   30: lsub
    //   31: invokestatic 1074	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   34: aastore
    //   35: aconst_null
    //   36: aconst_null
    //   37: ldc_w 700
    //   40: iconst_2
    //   41: invokevirtual 712	com/tencent/mm/bt/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   44: astore_2
    //   45: aload_2
    //   46: astore_1
    //   47: aload_2
    //   48: invokeinterface 756 1 0
    //   53: ifeq +69 -> 122
    //   56: aload_2
    //   57: astore_1
    //   58: new 396	com/tencent/mm/storage/bd
    //   61: dup
    //   62: invokespecial 707	com/tencent/mm/storage/bd:<init>	()V
    //   65: astore 4
    //   67: aload_2
    //   68: astore_1
    //   69: aload 4
    //   71: aload_2
    //   72: invokevirtual 715	com/tencent/mm/storage/bd:d	(Landroid/database/Cursor;)V
    //   75: aload_2
    //   76: astore_1
    //   77: aload_3
    //   78: aload 4
    //   80: invokevirtual 1075	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   83: pop
    //   84: goto -39 -> 45
    //   87: astore_3
    //   88: aload_2
    //   89: astore_1
    //   90: ldc -82
    //   92: aload_3
    //   93: ldc_w 1077
    //   96: iconst_1
    //   97: anewarray 178	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_3
    //   103: invokevirtual 336	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   106: aastore
    //   107: invokestatic 1067	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_2
    //   111: ifnull +9 -> 120
    //   114: aload_2
    //   115: invokeinterface 486 1 0
    //   120: aconst_null
    //   121: areturn
    //   122: aload_2
    //   123: ifnull +9 -> 132
    //   126: aload_2
    //   127: invokeinterface 486 1 0
    //   132: aload_3
    //   133: areturn
    //   134: astore_2
    //   135: aconst_null
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull +9 -> 147
    //   141: aload_1
    //   142: invokeinterface 486 1 0
    //   147: aload_2
    //   148: athrow
    //   149: astore_2
    //   150: goto -13 -> 137
    //   153: astore_3
    //   154: aconst_null
    //   155: astore_2
    //   156: goto -68 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	be
    //   46	96	1	localCursor1	Cursor
    //   44	83	2	localCursor2	Cursor
    //   134	14	2	localObject1	Object
    //   149	1	2	localObject2	Object
    //   155	1	2	localObject3	Object
    //   7	71	3	localArrayList	ArrayList
    //   87	46	3	localException1	Exception
    //   153	1	3	localException2	Exception
    //   65	14	4	localbd	bd
    // Exception table:
    //   from	to	target	type
    //   47	56	87	java/lang/Exception
    //   58	67	87	java/lang/Exception
    //   69	75	87	java/lang/Exception
    //   77	84	87	java/lang/Exception
    //   0	45	134	finally
    //   47	56	149	finally
    //   58	67	149	finally
    //   69	75	149	finally
    //   77	84	149	finally
    //   90	110	149	finally
    //   0	45	153	java/lang/Exception
  }
  
  public final List<bd> by(String paramString, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.tbZ != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND status = 3 AND type <> 10000 ORDER BY createTime DESC LIMIT " + paramInt;
      paramString = this.dCZ.b(paramString, null, 2);
      while (paramString.moveToNext())
      {
        bd localbd = new bd();
        localbd.d(paramString);
        localArrayList.add(localbd);
      }
    }
    paramString.close();
    return localArrayList;
  }
  
  public final List<bd> bz(String paramString, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.tbZ != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND isSend = 0 ORDER BY createTime DESC LIMIT " + paramInt;
      paramString = this.dCZ.b(paramString, null, 2);
      while (paramString.moveToNext())
      {
        bd localbd = new bd();
        localbd.d(paramString);
        if (localbd.isText()) {
          localArrayList.add(localbd);
        }
      }
    }
    paramString.close();
    return localArrayList;
  }
  
  public final int c(String paramString, long paramLong, int paramInt)
  {
    String str = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime < " + paramLong + " ORDER BY createTime ASC LIMIT -1 OFFSET " + paramInt;
    Cursor localCursor = this.dCZ.b(str, null, 0);
    paramInt = localCursor.getCount();
    localCursor.close();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "getPositionByCreateTime talk:" + paramString + " time:" + paramLong + " count " + paramInt + " [" + str + "]");
    return paramInt;
  }
  
  public final Cursor d(String paramString, long paramLong, int paramInt)
  {
    try
    {
      paramString = "select * from " + paramString + " where " + "type IN (3,39,13,43,62,44,49,268435505,34)" + " AND msgId >= " + paramLong + "  order by msgId ASC  limit " + paramInt;
      paramString = this.dCZ.b(paramString, null, 0);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public final List<bd> d(String paramString, long paramLong, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid, limit = 10");
      return null;
    }
    paramLong = Q(paramString, paramLong);
    if (paramLong == 0L)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, msg is null");
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean) {}
    for (paramString = "select * from " + GX(paramString) + " where" + YZ(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime > " + paramLong + "  order by createTime ASC limit 10";; paramString = "select * from " + GX(paramString) + " where" + YZ(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime < " + paramLong + "  order by createTime DESC limit 10")
    {
      paramString = this.dCZ.b(paramString, null, 2);
      while (paramString.moveToNext())
      {
        bd localbd = new bd();
        localbd.d(paramString);
        localArrayList.add(localbd);
      }
    }
    if (!paramBoolean) {
      Collections.reverse(localArrayList);
    }
    paramString.close();
    return localArrayList;
  }
  
  public final bd dG(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getLastMsg failed : talker:%s", new Object[] { paramString1 });
      return null;
    }
    bd localbd = new bd();
    paramString2 = "select * from " + GX(paramString1) + " where" + YZ(paramString1) + paramString2 + " order by createTime DESC limit 1";
    paramString2 = this.dCZ.b(paramString2, null, 2);
    if (paramString2.moveToFirst()) {
      localbd.d(paramString2);
    }
    paramString2.close();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "getLastMsg talker:%s msgid:%d", new Object[] { paramString1, Long.valueOf(localbd.field_msgId) });
    return localbd;
  }
  
  public final Cursor dH(String paramString1, String paramString2)
  {
    paramString1 = "SELECT * FROM " + GX(paramString1) + " WHERE" + YZ(paramString1) + "AND content LIKE '%" + paramString2 + "%' AND type = 1";
    paramString1 = paramString1 + " ORDER BY createTime DESC";
    return this.dCZ.b(paramString1, null, 0);
  }
  
  public final int dI(String paramString1, String paramString2)
  {
    String str = " SELECT COUNT(*) FROM " + GX(paramString1) + " WHERE" + YZ(paramString1) + "AND content LIKE '" + paramString2 + "%' ";
    Cursor localCursor = this.dCZ.b(str, null, 2);
    for (;;)
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          break label163;
        }
        i = localCursor.getInt(0);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
        localCursor.close();
        i = 0;
        continue;
      }
      finally
      {
        localCursor.close();
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "getMsgCountByMember getCursor talk:%s member:%s,count:%s,[%s]", new Object[] { paramString1, paramString2, Integer.valueOf(i), str });
      return i;
      label163:
      int i = 0;
    }
  }
  
  public final LinkedList<bd> dJ(String paramString1, String paramString2)
  {
    paramString1 = this.dCZ.a("message", null, "talker=? AND bizClientMsgId=?", new String[] { paramString1, paramString2 }, null, null, null, 2);
    if ((paramString1 == null) || (!paramString1.moveToFirst()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getByBizClientMsgId fail");
      return null;
    }
    paramString2 = new LinkedList();
    do
    {
      bd localbd = new bd();
      localbd.d(paramString1);
      paramString2.add(localbd);
    } while (paramString1.moveToNext());
    paramString1.close();
    return paramString2;
  }
  
  public final bd dW(long paramLong)
  {
    bd localbd = new bd();
    Cursor localCursor = this.dCZ.a(go(paramLong), null, "msgId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (localCursor.moveToFirst()) {
      localbd.d(localCursor);
    }
    localCursor.close();
    return localbd;
  }
  
  public final int dX(long paramLong)
  {
    bd localbd = dW(paramLong);
    Object localObject = localbd.field_talker;
    this.tcg.j((int)(bi.VE() / 86400L), localbd.field_msgSvrId, localbd.field_createTime / 1000L);
    int i = this.dCZ.delete(go(paramLong), "msgId=?", new String[] { String.valueOf(paramLong) });
    if (i != 0)
    {
      Xp("delete_id " + paramLong);
      localObject = new f.c((String)localObject, "delete", localbd, 1, (byte)0);
      ((f.c)localObject).lcC = paramLong;
      ((f.c)localObject).hpD = localbd.field_bizChatId;
      a((f.c)localObject);
      return i;
    }
    com.tencent.mm.plugin.report.f.mDy.a(111L, 245L, 1L, false);
    return i;
  }
  
  public final boolean dY(long paramLong)
  {
    return this.tcg.gm(paramLong);
  }
  
  public final boolean dZ(long paramLong)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.tbZ.size())
      {
        if (((f.b)this.tbZ.get(i)).eb(paramLong)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public final void ea(long paramLong)
  {
    this.tcg.a(0, paramLong, 0L, false);
  }
  
  public final Cursor f(String paramString, int paramInt, long paramLong)
  {
    paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + " AND createTime <= " + paramLong + " order by createTime ASC limit " + paramInt;
    return this.dCZ.b(paramString, null, 0);
  }
  
  public final Cursor g(String paramString, int paramInt, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder("SELECT * FROM ( SELECT * FROM ").append(GX(paramString)).append(" WHERE").append(YZ(paramString));
    if (paramLong > 0L) {}
    for (String str = " AND createTime > " + paramLong;; str = "")
    {
      str = str + " ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC";
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "getInitCursor1 getCursor talk:%s limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
      return this.dCZ.b(str, null, 0);
    }
  }
  
  public final Cursor h(String paramString, int paramInt, long paramLong)
  {
    String str = "SELECT * FROM ( SELECT * FROM ( SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC ) WHERE createTime <= " + paramLong;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorage", "summerbadcr getInitCursor2 getCursor talk:%s limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
    return this.dCZ.b(str, null, 0);
  }
  
  public final void lock()
  {
    Assert.assertTrue("lock deprecated, use lockForSync instead.", false);
  }
  
  public final Cursor n(String paramString, long paramLong1, long paramLong2)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      return null;
    }
    String str = GX(paramString);
    paramString = "select * from " + str + " where" + YZ(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime >= " + paramLong1 + " AND createTime< " + paramLong2 + " order by createTime ASC";
    return this.dCZ.b(paramString, null, 2);
  }
  
  public final int o(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    paramString = "SELECT COUNT(*) FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND type = 50 AND createTime >= " + paramLong1 + " AND createTime <= " + paramLong2 + " LIMIT 1";
    paramString = this.dCZ.b(paramString, null, 2);
    if (paramString.moveToFirst()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    return i;
  }
  
  public final int p(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong2 < paramLong1) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "talker %s, get count fromCreateTime %d, toCreateTime %d", new Object[] { paramString, Long.valueOf(paramLong2), Long.valueOf(paramLong1) });
      paramString = "SELECT COUNT(msgId) FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime >= " + paramLong2 + " AND createTime <= " + paramLong1;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get count sql: " + paramString);
      paramString = this.dCZ.b(paramString, null, 2);
      if (paramString == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
        return 0;
      }
      if (paramString.moveToFirst())
      {
        int i = paramString.getInt(0);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "result msg count %d", new Object[] { Integer.valueOf(i) });
        paramString.close();
        return i;
      }
      paramString.close();
      return 0;
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }
  
  public final Cursor q(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong2 < paramLong1) {}
    for (;;)
    {
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime >= " + paramLong2 + " AND createTime <= " + paramLong1 + " ORDER BY createTime ASC ";
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      return this.dCZ.b(paramString, null, 0);
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }
  
  public final int r(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong2 < paramLong1) {}
    for (;;)
    {
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime > " + paramLong2 + " AND createTime < " + paramLong1;
      paramString = this.dCZ.b(paramString, null, 2);
      if (paramString.moveToFirst()) {}
      for (int i = paramString.getInt(0);; i = 0)
      {
        paramString.close();
        return i;
      }
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }
  
  public final Cursor s(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong2 < paramLong1) {}
    for (;;)
    {
      paramString = "SELECT * FROM " + GX(paramString) + " WHERE" + YZ(paramString) + "AND createTime >= " + paramLong2 + " AND createTime <= " + paramLong1;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      return this.dCZ.b(paramString, null, 0);
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }
  
  public final bd sx(int paramInt)
  {
    if (this.tbZ == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
      return null;
    }
    bd localbd = new bd();
    long l1 = 0L;
    int i = 0;
    while (i < this.tbZ.size())
    {
      long l2 = l1;
      if ((((f.b)this.tbZ.get(i)).lcu & paramInt) != 0)
      {
        Object localObject = "select * from " + ((f.b)this.tbZ.get(i)).name + "  order by createTime DESC limit 1";
        localObject = this.dCZ.b((String)localObject, null, 2);
        l2 = l1;
        if (((Cursor)localObject).moveToFirst())
        {
          long l3 = ((Cursor)localObject).getLong(((Cursor)localObject).getColumnIndex("createTime"));
          l2 = l1;
          if (l1 < l3)
          {
            localbd.d((Cursor)localObject);
            l2 = l3;
          }
        }
        ((Cursor)localObject).close();
      }
      i += 1;
      l1 = l2;
    }
    return localbd;
  }
  
  public final void unlock()
  {
    Assert.assertTrue("unlock deprecated, use lockForSync instead.", false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */