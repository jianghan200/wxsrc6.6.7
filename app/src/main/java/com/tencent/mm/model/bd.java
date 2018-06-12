package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.jo;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class bd
{
  public static void I(List<Long> paramList)
  {
    if (paramList.size() == 0) {}
    for (;;)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        aU(((Long)paramList.next()).longValue());
      }
    }
  }
  
  public static long Ik()
  {
    long l1 = System.currentTimeMillis();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, before fix, now is :%s", new Object[] { Long.valueOf(l1) });
    Object localObject = ad.getContext().getSharedPreferences("system_config_prefs", 4);
    int i = ((SharedPreferences)localObject).getInt("client_server_diff_time_enable", 0);
    int j = ((SharedPreferences)localObject).getInt("client_server_diff_time_interval", 0);
    if ((i <= 0) || (j <= 0)) {}
    long l2;
    do
    {
      do
      {
        return l1;
        g.Ek();
        localObject = g.Ei().DT().get(aa.a.sWU, null);
      } while (localObject == null);
      l2 = bi.getLong(localObject.toString(), 0L);
    } while (Math.abs(l2 / 1000L) <= j);
    return l1 - l2;
  }
  
  public static void Il()
  {
    List localList = ((i)g.l(i.class)).bcY().GH("bottlemessage");
    if (localList != null)
    {
      int i = 0;
      while (i < localList.size())
      {
        j((com.tencent.mm.storage.bd)localList.get(i));
        i += 1;
      }
    }
    ((i)g.l(i.class)).bcY().GJ("bottlemessage");
  }
  
  public static void Im()
  {
    List localList = ((i)g.l(i.class)).bcY().GH("qmessage");
    if (localList != null)
    {
      int i = 0;
      while (i < localList.size())
      {
        j((com.tencent.mm.storage.bd)localList.get(i));
        i += 1;
      }
    }
    ((i)g.l(i.class)).bcY().GJ("qmessage");
  }
  
  public static void In()
  {
    List localList = ((i)g.l(i.class)).bcY().GH("tmessage");
    if (localList != null)
    {
      int i = 0;
      while (i < localList.size())
      {
        j((com.tencent.mm.storage.bd)localList.get(i));
        i += 1;
      }
    }
    ((i)g.l(i.class)).bcY().GJ("tmessage");
  }
  
  public static String U(String paramString1, String paramString2)
  {
    String str;
    if (bi.oW(paramString1)) {
      str = null;
    }
    do
    {
      return str;
      str = paramString1;
    } while (bi.oW(paramString2));
    return paramString2 + ": " + paramString1;
  }
  
  public static int a(String paramString, a parama)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker[%s] stack[%s]", new Object[] { paramString, bi.cjd() });
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      final int dCf = 200;
      final int dCg = 30;
      final int dCh = 5;
      int dCi = 100;
      
      public final void run()
      {
        Object localObject = ((i)g.l(i.class)).bcY().GE(this.dhh);
        long l1;
        long l5;
        int i;
        long l3;
        if (localObject == null)
        {
          l1 = Long.MAX_VALUE;
          if ((localObject != null) && (((cm)localObject).field_createTime > 0L)) {
            ((i)g.l(i.class)).Gx().G(this.dhh, l1);
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker run currentThread[%s, %d] lastMsg[%s] lastMsgCreateTime[%s]", new Object[] { Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId()), localObject, Long.valueOf(l1) });
          l5 = bi.VF();
          i = 0;
          l3 = 0L;
        }
        long l2;
        label281:
        do
        {
          if ((this.dCi < 200) && (this.dCi > 30)) {
            if (l3 <= 500L) {
              break label281;
            }
          }
          long l6;
          for (int j = this.dCi - 5;; j = this.dCi + 5)
          {
            this.dCi = j;
            l6 = bi.VF();
            localObject = ((i)g.l(i.class)).bcY().f(this.dhh, this.dCi, l1);
            l3 = 0L;
            l2 = 0L;
            while (((Cursor)localObject).moveToNext())
            {
              com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
              localbd.d((Cursor)localObject);
              l4 = l3;
              if (l3 < localbd.field_createTime) {
                l4 = localbd.field_createTime;
              }
              bd.j(localbd);
              l2 = 1L + l2;
              l3 = l4;
            }
            l1 = ((cm)localObject).field_createTime;
            break;
          }
          ((Cursor)localObject).close();
          long l7 = bi.VF();
          if ((l3 > 0L) && (l2 > 0L)) {
            ((i)g.l(i.class)).bcY().S(this.dhh, l3);
          }
          i = (int)(i + l2);
          long l8 = bi.VF();
          long l4 = l8 - l6;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", new Object[] { bi.Xf(this.dhh), Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l1 - l3), Long.valueOf(l1), Long.valueOf(l8 - l7), Long.valueOf(l8 - l6), Long.valueOf(l8 - l5), Integer.valueOf(this.dCi) });
          l3 = l4;
        } while (l2 > 0L);
        ((i)g.l(i.class)).Gx().G(this.dhh, 0L);
      }
    }, "deleteMsgByTalker");
    ah.A(new Runnable()
    {
      public final void run()
      {
        if (this.dAD != null) {
          this.dAD.Io();
        }
      }
    });
    return 0;
  }
  
  public static void a(a parama)
  {
    g.Ek();
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        if ((this.dAD == null) || (!this.dAD.Ip()))
        {
          ((i)g.l(i.class)).FW().cly();
          if ((this.dAD == null) || (!this.dAD.Ip()))
          {
            bd.Im();
            if ((this.dAD == null) || (!this.dAD.Ip()))
            {
              bd.In();
              if ((this.dAD == null) || (!this.dAD.Ip()))
              {
                bd.Il();
                if ((this.dAD == null) || (!this.dAD.Ip()))
                {
                  List localList = ((i)g.l(i.class)).bcY().GH("message");
                  if (localList != null)
                  {
                    int i = 0;
                    while (i < localList.size())
                    {
                      bd.j((com.tencent.mm.storage.bd)localList.get(i));
                      i += 1;
                    }
                  }
                  ((i)g.l(i.class)).bcY().GJ("message");
                }
              }
            }
          }
        }
        if (this.dAD != null) {
          ah.A(new Runnable()
          {
            public final void run()
            {
              bd.4.this.dAD.Io();
            }
          });
        }
      }
      
      public final String toString()
      {
        return super.toString() + "|deleteAllMsg";
      }
    });
  }
  
  public static void a(com.tencent.mm.storage.bd parambd, d.a parama)
  {
    if ((parambd == null) || (parama == null) || (parama.dIN == null)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgWithAddMsgInfo error input is null, stack[%s]", new Object[] { bi.cjd() });
    }
    by localby;
    do
    {
      do
      {
        return;
      } while (parambd.field_msgSvrId != parama.dIN.rcq);
      localby = parama.dIN;
    } while ((parambd.field_isSend != 0) && (localby.rcr == 0));
    if ((parambd.field_msgSeq == 0L) && (localby.rcr != 0)) {
      parambd.aA(localby.rcr);
    }
    int i = parambd.field_flag;
    if (parama.dIO)
    {
      i |= 0x2;
      label108:
      if (!parama.dIP) {
        break label187;
      }
      i |= 0x1;
      label119:
      if (!parama.dIQ) {
        break label195;
      }
      i |= 0x4;
    }
    for (;;)
    {
      parambd.fg(i);
      if ((parambd.field_msgId != 0L) || (!parama.dIO)) {
        break;
      }
      parambd.ay(g(parambd.field_talker, parama.dIN.lOH, parama.dIN.rcr));
      return;
      i &= 0xFFFFFFFD;
      break label108;
      label187:
      i &= 0xFFFFFFFE;
      break label119;
      label195:
      i &= 0xFFFFFFFB;
    }
  }
  
  public static int aU(long paramLong)
  {
    com.tencent.mm.storage.bd localbd = ((i)g.l(i.class)).bcY().dW(paramLong);
    if (localbd.field_msgId != paramLong) {
      return 0;
    }
    j(localbd);
    return ((i)g.l(i.class)).bcY().dX(paramLong);
  }
  
  public static String b(boolean paramBoolean, String paramString, int paramInt)
  {
    String str = paramString;
    if (paramBoolean)
    {
      str = paramString;
      if (paramString != null)
      {
        str = paramString;
        if (paramInt == 0) {
          str = iC(paramString);
        }
      }
    }
    return str;
  }
  
  public static int c(d.a parama)
  {
    int j = 0;
    if (parama.dIO) {
      j = 2;
    }
    int i = j;
    if (parama.dIP) {
      i = j | 0x1;
    }
    j = i;
    if (parama.dIQ) {
      j = i | 0x4;
    }
    return j;
  }
  
  public static long g(String paramString, long paramLong1, long paramLong2)
  {
    long l1 = paramLong1 * 1000L;
    long l2 = 0L;
    long l3 = -1L;
    paramLong1 = l2;
    if (paramString != null)
    {
      localbd = ((i)g.l(i.class)).bcY().GE(paramString);
      paramLong1 = l2;
      if (localbd != null) {
        paramLong1 = localbd.field_createTime;
      }
      l3 = ((i)g.l(i.class)).bcY().GY(paramString);
    }
    if (l3 == paramLong1)
    {
      l2 = l1;
      if (l1 == paramLong1) {
        l2 = l1 + 1L;
      }
    }
    do
    {
      do
      {
        return l2;
        if (l3 >= paramLong1) {
          break;
        }
        if (l1 == l3) {
          return l1 - 1L;
        }
        if (l1 == paramLong1) {
          return l1 + 1L;
        }
        l2 = l1;
      } while (paramLong2 == 0L);
      l2 = l1;
    } while (l1 > paramLong1);
    com.tencent.mm.storage.bd localbd = ((i)g.l(i.class)).bcY().K(paramString, l1);
    if ((localbd.field_msgSeq != 0L) && (localbd.field_msgSeq != paramLong2))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d] need fix serverMillTime[%d, %d]", new Object[] { Long.valueOf(localbd.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(localbd.field_createTime), Long.valueOf(l1) });
      if (paramLong2 < localbd.field_msgSeq)
      {
        paramString = ((i)g.l(i.class)).bcY().O(paramString, l1 - 1000L);
        if ((paramString.field_msgSeq == 0L) || (paramString.field_msgSeq == paramLong2)) {
          break label430;
        }
        if (paramString.field_msgSeq >= paramLong2) {
          break label420;
        }
        paramLong1 = paramString.field_createTime + 1L;
        label320:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d, %d] need fix serverMillTime[%d, %d, %d] done", new Object[] { Long.valueOf(localbd.field_msgSeq), Long.valueOf(paramString.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(localbd.field_createTime), Long.valueOf(paramString.field_createTime), Long.valueOf(paramLong1) });
      }
    }
    for (;;)
    {
      return paramLong1;
      paramString = ((i)g.l(i.class)).bcY().N(paramString, 1000L + l1);
      break;
      label420:
      paramLong1 = paramString.field_createTime - 1L;
      break label320;
      label430:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d] no need fix serverMillTime[%d, %d]", new Object[] { Long.valueOf(localbd.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(localbd.field_createTime), Long.valueOf(l1) });
      paramLong1 = l1;
    }
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgCreateTime first > last [%d > %d], ret serverMillTime:%d", new Object[] { Long.valueOf(l3), Long.valueOf(paramLong1), Long.valueOf(l1) });
    return l1;
  }
  
  public static boolean hd(int paramInt)
  {
    switch (paramInt)
    {
    case 25: 
    default: 
      return false;
    }
    return true;
  }
  
  public static long i(com.tencent.mm.storage.bd parambd)
  {
    ab localab = ((i)g.l(i.class)).FR().Yg(parambd.field_talker);
    if ((localab == null) || ((int)localab.dhP == 0))
    {
      localab = new ab(parambd.field_talker);
      localab.setType(2);
      jo localjo = new jo();
      localjo.bTj.bTk = localab;
      com.tencent.mm.sdk.b.a.sFg.m(localjo);
      ((i)g.l(i.class)).FR().T(localab);
    }
    return ((i)g.l(i.class)).bcY().T(parambd);
  }
  
  public static int iA(String paramString)
  {
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos text is null]");
      return -1;
    }
    if (paramString.length() <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos length < 0]");
      return -1;
    }
    if (paramString.startsWith("~SEMI_XML~"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos startsWith(SemiXml.MAGIC_HEAD)]");
      return -1;
    }
    int i = paramString.indexOf(':');
    if ((i != -1) && (paramString.substring(0, i).contains("<")))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorageLogic", "dz[reject illegal character]");
      return -1;
    }
    return i;
  }
  
  public static String iB(String paramString)
  {
    int i = iA(paramString);
    if (i == -1) {
      return null;
    }
    return paramString.substring(0, i);
  }
  
  public static String iC(String paramString)
  {
    int i = iA(paramString);
    if (i == -1) {}
    while (i + 2 >= paramString.length()) {
      return paramString;
    }
    return paramString.substring(i + 2);
  }
  
  public static long iD(String paramString)
  {
    long l = Ik();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, after fix, now is :%s", new Object[] { Long.valueOf(l) });
    if (paramString != null)
    {
      paramString = ((i)g.l(i.class)).bcY().GE(paramString);
      if (paramString != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, before return, msg id:%s, now is :%s", new Object[] { Long.valueOf(paramString.field_msgId), Long.valueOf(l) });
        if (paramString.field_createTime + 1L > l) {
          return paramString.field_createTime + 1L;
        }
      }
    }
    return l;
  }
  
  public static int iE(String paramString)
  {
    return ((i)g.l(i.class)).bcY().GK(paramString);
  }
  
  public static b iF(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    try
    {
      paramString = bl.z(paramString, "msgsource");
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        b localb = new b();
        localb.dCl = ((String)paramString.get(".msgsource.bizmsg.msgcluster"));
        localb.dCq = ((String)paramString.get(".msgsource.kf.kf_worker"));
        localb.dCp = bi.oV((String)paramString.get(".msgsource.bizmsg.bizclientmsgid"));
        localb.dCt = bi.oV((String)paramString.get(".msgsource.enterprise_info.qy_msg_type"));
        localb.dCu = bi.oV((String)paramString.get(".msgsource.enterprise_info.bizchat_id"));
        localb.dCv = bi.oV((String)paramString.get(".msgsource.enterprise_info.bizchat_ver"));
        localb.userId = bi.oV((String)paramString.get(".msgsource.enterprise_info.user_id"));
        localb.dCw = bi.oV((String)paramString.get(".msgsource.enterprise_info.user_nickname"));
        localb.dCx = bi.oV((String)paramString.get(".msgsource.enterprise_info.sync_from_qy_im"));
        localb.dCs = ((String)paramString.get(".msgsource.strangerantispamticket.$ticket"));
        localb.scene = bi.getInt((String)paramString.get(".msgsource.strangerantispamticket.$scene"), 0);
        localb.dCy = ((String)paramString.get(".msgsource.NotAutoDownloadRange"));
        localb.dCz = bi.getInt((String)paramString.get(".msgsource.DownloadLimitKbps"), 0);
        localb.dCA = bi.getInt((String)paramString.get(".msgsource.videopreloadlen"), 0);
        localb.dCB = bi.getInt((String)paramString.get(".msgsource.PreDownload"), 0);
        localb.dCC = bi.getInt((String)paramString.get(".msgsource.PreDownloadNetType"), 0);
        localb.dCD = ((String)paramString.get(".msgsource.NoPreDownloadRange"));
        localb.dCm = bi.getInt((String)paramString.get(".msgsource.msg_cluster_type"), -1);
        localb.dCn = bi.getInt((String)paramString.get(".msgsource.service_type"), -1);
        localb.dCo = bi.getInt((String)paramString.get(".msgsource.scene"), -1);
        localb.dCr = bi.getInt((String)paramString.get(".msgsource.bizmsg.msg_predict"), 0);
        return localb;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorageLogic", "exception:%s", new Object[] { bi.i(paramString) });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgInfoStorageLogic", "Exception in getMsgSourceValue, %s", new Object[] { paramString.getMessage() });
      return null;
    }
    return null;
  }
  
  public static String iG(String paramString)
  {
    paramString = iF(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.dCq;
  }
  
  public static void j(com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null) {
      return;
    }
    int i = parambd.getType();
    switch (i)
    {
    }
    for (;;)
    {
      Object localObject = d.c.ba(Integer.valueOf(i));
      if (localObject != null) {
        ((d)localObject).h(parambd);
      }
      localObject = new cd();
      ((cd)localObject).bJB.bJC = parambd.field_msgId;
      ((cd)localObject).bJB.talker = parambd.field_talker;
      ((cd)localObject).bJB.msgType = parambd.getType();
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      return;
      i = 49;
    }
  }
  
  public static long o(String paramString, long paramLong)
  {
    if (paramString != null)
    {
      paramString = ((i)g.l(i.class)).bcY().GE(paramString);
      if (paramString == null) {}
    }
    for (long l = paramString.field_createTime + 1L;; l = 0L)
    {
      if (l > paramLong * 1000L) {
        return l;
      }
      return paramLong * 1000L;
    }
  }
  
  public static int p(String paramString, long paramLong)
  {
    com.tencent.mm.storage.bd localbd = ((i)g.l(i.class)).bcY().I(paramString, paramLong);
    if (localbd.field_msgSvrId != paramLong) {
      return 0;
    }
    j(localbd);
    return ((i)g.l(i.class)).bcY().R(paramString, paramLong);
  }
  
  public static abstract interface a
  {
    public abstract void Io();
    
    public abstract boolean Ip();
  }
  
  public static final class b
  {
    public int dCA;
    public int dCB;
    public int dCC;
    public String dCD;
    public String dCl;
    public int dCm;
    public int dCn;
    public int dCo;
    public String dCp;
    public String dCq;
    public int dCr;
    public String dCs;
    public String dCt;
    public String dCu;
    public String dCv;
    public String dCw;
    public String dCx;
    public String dCy;
    public int dCz;
    public int scene = 0;
    public String userId;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */