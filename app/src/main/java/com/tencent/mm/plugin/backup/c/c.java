package com.tencent.mm.plugin.backup.c;

import android.database.Cursor;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.b.a.a;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.f.a;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.backup.h.f;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.m;
import com.tencent.mm.storage.n;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class c
  implements com.tencent.mm.plugin.backup.a.b.d, com.tencent.mm.plugin.backup.f.b.d
{
  private static int dHg = 0;
  private static boolean gTT = false;
  private static boolean gTU = false;
  private static boolean gUi = false;
  String byN;
  private boolean dJO = false;
  public com.tencent.mm.plugin.backup.a.b.d gSW;
  private com.tencent.mm.plugin.backup.b.d gTJ;
  private long gTK = 0L;
  private LinkedList<String> gTL;
  private LinkedList<Long> gTM;
  private LinkedList<String> gTN;
  private LinkedList<Long> gTO;
  public b.a gTP;
  private HashSet<String> gTQ = new HashSet();
  private long gTR = 0L;
  private long gTS = 0L;
  private boolean gTV = true;
  private HashSet<String> gTW = new HashSet();
  private int gTX = 0;
  public boolean gTY = false;
  private boolean gTZ = true;
  private boolean gTb = false;
  private boolean gUa = true;
  private boolean gUb = false;
  private boolean gUc = false;
  private int gUd;
  public String gUe;
  String gUf;
  int gUg;
  private al gUh;
  final com.tencent.mm.ab.e gUj = new c.1(this);
  private final com.tencent.mm.ab.e gUk = new c.6(this);
  private final com.tencent.mm.ab.e gUl = new c.7(this);
  public long gUm;
  private int gUn;
  b.c gUo = new c.11(this);
  private final f.a gUp = new c.12(this);
  private final i.a gUq = new c.2(this);
  private Object lock = new Object();
  private long recvSize = 0L;
  
  private void aS(String paramString, int paramInt)
  {
    boolean bool = true;
    b.arv().arw().connect(paramString, paramInt);
    com.tencent.mm.plugin.backup.f.b.a(1, this.gUk);
    for (;;)
    {
      try
      {
        if (bi.getInt(com.tencent.mm.k.g.AT().getValue("ChattingRecordsKvstatDisable"), 0) != 0) {
          continue;
        }
        this.gUa = bool;
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "getInt", new Object[0]);
        continue;
      }
      paramString = new com.tencent.mm.plugin.backup.f.a(b.arv().gRv, b.arv().gRw, com.tencent.mm.plugin.backup.a.d.aqT(), b.arv().gRu, com.tencent.mm.plugin.backup.a.c.gRm, 22);
      paramString.s(this.gUa, false);
      paramString.ass();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "tryConnect start connect timehandler.");
      if (this.gUh == null) {
        this.gUh = new al(new c.5(this), false);
      }
      this.gUh.J(3000L, 3000L);
      return;
      bool = false;
    }
  }
  
  public static boolean arA()
  {
    return au.HU().GA().ckv();
  }
  
  private void arC()
  {
    String str1 = this.gUe;
    String str2 = this.gUf;
    String str3 = com.tencent.mm.plugin.backup.a.g.cQ(ad.getContext());
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupMoveRecoverServer", "connect failed thisWifi:%s, oldPhoneWifiName:%s, oldPhoneIpAddress:%s, tryCount:%d", new Object[] { str3, str1, str2, Integer.valueOf(dHg) });
    if ((str3 == null) || (str3.equals("")))
    {
      h.mEJ.a(485L, 1L, 1L, false);
      h.mEJ.h(11787, new Object[] { Integer.valueOf(1) });
      b.arv().aqP().gRC = -1;
      mw(-1);
      return;
    }
    if ((str1 == null) || (!str1.equals(str3)))
    {
      h.mEJ.a(485L, 2L, 1L, false);
      h.mEJ.h(11787, new Object[] { Integer.valueOf(2) });
      b.arv().aqP().gRC = -2;
      mw(-2);
      return;
    }
    if (!com.tencent.mm.plugin.backup.a.g.ww(str2))
    {
      h.mEJ.a(485L, 3L, 1L, false);
      h.mEJ.h(11787, new Object[] { Integer.valueOf(3) });
      b.arv().aqP().gRC = -3;
      mw(-3);
      return;
    }
    if (dHg <= 0)
    {
      b.arv().aqP().gRC = -5;
      mw(-5);
      h.mEJ.a(485L, 4L, 1L, false);
      h.mEJ.h(11787, new Object[] { Integer.valueOf(6) });
      return;
    }
    dHg -= 1;
    aS(this.gUf, this.gUg);
  }
  
  public static String arD()
  {
    return com.tencent.mm.plugin.backup.f.b.asp();
  }
  
  private static void arE()
  {
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.arv().gRu;
    try
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "send cancel req.");
      com.tencent.mm.plugin.backup.f.b.J(locala.toByteArray(), 5);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
    }
  }
  
  private static void b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    y localy = new y();
    localy.hcI = paramString;
    localy.hcJ = paramInt1;
    localy.hcL = paramInt2;
    localy.hcM = paramInt3;
    localy.hcd = paramInt4;
    try
    {
      com.tencent.mm.plugin.backup.f.b.o(localy.toByteArray(), 7, paramInt5);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "sendResp", new Object[0]);
    }
  }
  
  public final void a(boolean paramBoolean, final int paramInt1, final byte[] paramArrayOfByte, final int paramInt2)
  {
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "onNotify isLocal:%b, type:%d, seq:%d, buf.len:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((!paramBoolean) || (10011 != paramInt1)) {
        break;
      }
      paramInt1 = b.arv().aqP().gRC;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(paramInt1) });
      switch (paramInt1)
      {
      default: 
        return;
      }
    }
    b.arv().arw().stop();
    if (!gUi)
    {
      if (this.gUh != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify stop backupConnectTimerHandler.");
        this.gUh.SO();
      }
      arC();
      return;
    }
    b.arv().aqP().gRC = -4;
    mw(-4);
    return;
    b.arv().arw().stop();
    return;
    a(true, false, -4);
    b.arv().arw().stop();
    gTU = true;
    h.mEJ.a(485L, 43L, 1L, false);
    mA(4);
    long l = 0L;
    if (this.gTR != 0L) {
      l = bi.bH(this.gTR);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify recover transfer disconnect, recoverDataSize:%d, recoverCostTime:%d", new Object[] { Long.valueOf(this.gTK), Long.valueOf(l) });
    return;
    a(true, false, 0);
    return;
    if (paramInt1 == 9)
    {
      com.tencent.mm.plugin.backup.h.e locale = (com.tencent.mm.plugin.backup.h.e)com.tencent.mm.plugin.backup.a.g.a(new com.tencent.mm.plugin.backup.h.e(), paramArrayOfByte);
      if (locale == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupMoveRecoverServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bi.bD(paramArrayOfByte)) });
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat req, req:%s ack:%d", new Object[] { locale, Long.valueOf(locale.gXZ) });
      paramArrayOfByte = new f();
      paramArrayOfByte.gXZ = locale.gXZ;
      try
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "summerbak send heartbeat resp");
        com.tencent.mm.plugin.backup.f.b.o(paramArrayOfByte.toByteArray(), 10, paramInt2);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
        return;
      }
    }
    if (paramInt1 == 10)
    {
      paramArrayOfByte = (f)com.tencent.mm.plugin.backup.a.g.a(new f(), paramArrayOfByte);
      if (paramArrayOfByte != null) {}
      for (l = paramArrayOfByte.gXZ;; l = -1L)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat response, resp:%s ack:%d", new Object[] { paramArrayOfByte, Long.valueOf(l) });
        return;
      }
    }
    if (paramInt1 == 5)
    {
      h.mEJ.a(485L, 51L, 1L, false);
      a(true, false, -100);
    }
    au.Em().H(new Runnable()
    {
      public final void run()
      {
        if (paramInt1 == 11) {
          c.a(c.this, paramArrayOfByte, paramInt2);
        }
        do
        {
          return;
          if (paramInt1 == 6)
          {
            c.b(c.this, paramArrayOfByte, paramInt2);
            return;
          }
          if (paramInt1 == 13)
          {
            c.H(paramArrayOfByte, paramInt2);
            return;
          }
          if (paramInt1 == 15)
          {
            c.c(c.this, paramArrayOfByte, paramInt2);
            return;
          }
        } while (paramInt1 != 8);
        c.a(c.this, paramArrayOfByte);
      }
    });
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 0;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "cancel backupMoveRecoverServer cancel isSelf[%b], needClearContinueRecoverData[%b], updateState[%d], caller:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt), aj.cin() });
    if (!paramBoolean1) {
      arE();
    }
    synchronized (this.lock)
    {
      this.dJO = true;
      if (this.gTJ != null)
      {
        this.gTJ.g(paramBoolean2, paramInt);
        this.gTJ = null;
        if ((i != 0) && (paramInt != 0))
        {
          b.arv().aqP().gRC = paramInt;
          mw(paramInt);
        }
        if (paramBoolean2) {
          arB();
        }
        com.tencent.mm.plugin.backup.f.b.asm();
        com.tencent.mm.plugin.backup.f.b.aso();
        b.arv().arw().gRS = null;
        return;
      }
      i = 1;
    }
  }
  
  public final void aqO()
  {
    h.mEJ.a(485L, 49L, 1L, false);
    h.mEJ.a(485L, 50L, bi.bH(this.gTS) / 1000L, false);
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sVe, Boolean.valueOf(true));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "move recover finish, make BACKUP_MOVE_RECORDS.");
    Object localObject;
    LinkedList localLinkedList;
    if (!this.gTb)
    {
      localObject = au.HU().Gz();
      localLinkedList = new LinkedList();
      localObject = ((n)localObject).axc();
      if (localObject != null) {
        break label129;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupTempMoveTimeStorage", "getAllData failed.");
      if (localLinkedList.size() > 0) {
        break label169;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupMoveRecoverServer", "merge finish and BackupTempMoveTimeStorage is empty!");
    }
    for (;;)
    {
      arB();
      com.tencent.mm.plugin.backup.f.b.asm();
      com.tencent.mm.plugin.backup.f.b.aso();
      return;
      label129:
      while (((Cursor)localObject).moveToNext())
      {
        m localm = new m();
        localm.d((Cursor)localObject);
        localLinkedList.add(localm);
      }
      ((Cursor)localObject).close();
      break;
      label169:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "merge finish and start update BackupMoveTimeStorage!");
      au.HU().Gy().d(this.byN, localLinkedList);
    }
  }
  
  public final void arB()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "recover clearContinueRecoverData");
    this.gTQ.clear();
  }
  
  public final void arg()
  {
    synchronized (this.lock)
    {
      if (this.dJO)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupMoveRecoverServer", "startMerge isCancel true.");
        return;
      }
      if ((this.gTJ != null) && (this.gTJ.gSS))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupMoveRecoverServer", "startMerge hasStartMerge, return.");
        return;
      }
    }
    if (this.gTJ != null) {
      this.gTJ.g(false, 0);
    }
    if ((this.gTQ == null) || (this.gTQ.size() <= 0)) {}
    for (int i = au.HU().GA().ckw();; i = this.gTQ.size())
    {
      b.arv().aqP().D(26, 1, i);
      mw(26);
      this.gTS = bi.VF();
      this.gTJ = new com.tencent.mm.plugin.backup.b.d(b.arv(), 22, this, i, false, new LinkedList(), new LinkedList());
      this.gTJ.arg();
      h.mEJ.a(485L, 46L, 1L, false);
      return;
    }
  }
  
  public final void du(boolean paramBoolean)
  {
    this.gUc = paramBoolean;
    final Object localObject = new LinkedBlockingQueue();
    b.arv().arw().gRS = new a.a()
    {
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, byte[] paramAnonymousArrayOfByte)
      {
        for (;;)
        {
          if (!c.n(c.this)) {}
          try
          {
            boolean bool = localObject.offer(new c.a(c.this, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousArrayOfByte), 500L, TimeUnit.MILLISECONDS);
            if (bool)
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "summerbak offer datapushQueue, datapushQueue size:%d", new Object[] { Integer.valueOf(localObject.size()) });
              return;
            }
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupMoveRecoverServer", "onBackupMoveRecoverDatapushCallback e:%s", new Object[] { localException.getMessage() });
          }
        }
      }
    };
    com.tencent.mm.sdk.f.e.b(new c.10(this, (LinkedBlockingQueue)localObject), "onNotifyWorker").start();
    this.gTN = new LinkedList();
    this.gTO = new LinkedList();
    au.HU().Gz().a(this.gTL, this.gTM, this.gTN, this.gTO);
    if ((!this.gTb) && (!paramBoolean))
    {
      localObject = this.gTN;
      LinkedList localLinkedList = this.gTO;
      this.gTN = new LinkedList();
      this.gTO = new LinkedList();
      au.HU().Gy().a(this.byN, (LinkedList)localObject, localLinkedList, this.gTN, this.gTO);
    }
    localObject = new com.tencent.mm.plugin.backup.h.j();
    ((com.tencent.mm.plugin.backup.h.j)localObject).hbH = this.gTN;
    ((com.tencent.mm.plugin.backup.h.j)localObject).hbI = this.gTO;
    try
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "summerbak send requestsession resp, SessionName size:%d, TimeInterval size:%d", new Object[] { Integer.valueOf(this.gTL.size()), Integer.valueOf(((com.tencent.mm.plugin.backup.h.j)localObject).hbI.size()) });
      com.tencent.mm.plugin.backup.f.b.o(((com.tencent.mm.plugin.backup.h.j)localObject).toByteArray(), 12, this.gUn);
      com.tencent.mm.plugin.backup.f.b.asn();
      b.arv().aqP().D(23, 1, this.gTL.size());
      mw(23);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupRequestSessionResponse err.", new Object[0]);
      }
    }
  }
  
  public final void mA(int paramInt)
  {
    long l = 0L;
    if (this.gTR != 0L) {
      l = bi.bH(this.gTR);
    }
    h.mEJ.h(11789, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramInt), Integer.valueOf(this.gUd), Long.valueOf(this.gTK / 1024L), Long.valueOf(l / 1000L) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveRecoverServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d KB], recoverCostTime[%d s]", new Object[] { Integer.valueOf(11789), Integer.valueOf(paramInt), Long.valueOf(this.gTK / 1024L), Long.valueOf(l / 1000L) });
  }
  
  public final void mw(int paramInt)
  {
    if (this.gSW != null) {
      ah.A(new c.3(this, paramInt));
    }
    if (this.gTP != null) {
      ah.A(new c.4(this, paramInt));
    }
  }
  
  private final class a
  {
    byte[] buf;
    int egS;
    boolean gbk = false;
    int type;
    
    a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
    {
      this.egS = paramInt1;
      this.type = paramInt2;
      this.buf = ((byte[])paramArrayOfByte.clone());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */