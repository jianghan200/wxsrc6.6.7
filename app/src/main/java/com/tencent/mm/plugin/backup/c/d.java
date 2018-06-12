package com.tencent.mm.plugin.backup.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.a.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.backup.a.b.b;
import com.tencent.mm.plugin.backup.a.f.b;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.backup.h.f;
import com.tencent.mm.plugin.backup.h.i;
import com.tencent.mm.plugin.backup.h.j;
import com.tencent.mm.plugin.backup.h.m;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.plugin.backup.h.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
  implements b.b, com.tencent.mm.plugin.backup.f.b.d
{
  public static boolean gTb = false;
  public static boolean gUB = false;
  public byte[] bitmapData;
  public com.tencent.mm.plugin.backup.a.b.d gSW;
  public boolean gTY = false;
  public int gUA = 0;
  private int gUC;
  private int gUD;
  private int gUE = 0;
  public e gUF = new e(new d.5(this), b.arv().aqP());
  public b.c gUo = new d.2(this);
  private final com.tencent.mm.plugin.backup.f.f.a gUp = new d.3(this);
  public final i.a gUq = new d.4(this);
  public LinkedList<String> gUu;
  private com.tencent.mm.plugin.backup.b.b gUv;
  private com.tencent.mm.plugin.backup.b.c gUw;
  public long gUx = 0L;
  public long gUy = 0L;
  public boolean gUz = false;
  
  private static void arE()
  {
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.arv().gRu;
    try
    {
      x.i("MicroMsg.BackupMoveServer", "backupSendCancelRequest.");
      com.tencent.mm.plugin.backup.f.b.J(locala.toByteArray(), 5);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
    }
  }
  
  public static String arK()
  {
    return com.tencent.mm.plugin.backup.f.b.asp();
  }
  
  private static LinkedList<com.tencent.mm.plugin.backup.a.f.a> b(LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    if ((paramLinkedList == null) || (paramLinkedList1 == null) || (paramLinkedList.isEmpty()) || (paramLinkedList.size() * 2 != paramLinkedList1.size())) {
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList1 = paramLinkedList1.iterator();
    int i = 0;
    long l1 = 0L;
    long l3 = 0L;
    while (i < paramLinkedList.size())
    {
      long l2 = l1;
      if (paramLinkedList1.hasNext())
      {
        long l4 = ((Long)paramLinkedList1.next()).longValue();
        l3 = l4;
        l2 = l1;
        if (paramLinkedList1.hasNext())
        {
          l2 = ((Long)paramLinkedList1.next()).longValue();
          l3 = l4;
        }
      }
      localLinkedList.add(new com.tencent.mm.plugin.backup.a.f.a(i, (String)paramLinkedList.get(i), l3, l2));
      i += 1;
      l1 = l2;
    }
    return localLinkedList;
  }
  
  public static void c(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    x.i("MicroMsg.BackupMoveServer", "setBakupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramLong2 = 0L;
      paramLong1 = 0L;
    }
    b.arv();
    SharedPreferences.Editor localEditor = b.aqU().edit();
    localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", paramInt1);
    localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", paramLong1);
    localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", paramLong2);
    localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", paramInt2);
    localEditor.commit();
  }
  
  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      x.i("MicroMsg.BackupMoveServer", "summerbak onNotify isLocal:%b type:%d seq:%d buf:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((paramBoolean) && (paramArrayOfByte != null) && (10011 == paramInt1))
      {
        i = b.arv().aqP().gRC;
        x.i("MicroMsg.BackupMoveServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(i) });
      }
      switch (i)
      {
      default: 
        label164:
        if (paramInt1 == 1)
        {
          localObject = (v)com.tencent.mm.plugin.backup.a.g.a(new v(), paramArrayOfByte);
          if (localObject == null)
          {
            x.e("MicroMsg.BackupMoveServer", "authReq parseBuf failed:%d", new Object[] { Integer.valueOf(bi.bD(paramArrayOfByte)) });
            b.arv().aqP().gRC = -5;
            mw(-5);
          }
        }
        break;
      }
    }
    do
    {
      do
      {
        return;
        i = paramArrayOfByte.length;
        break;
        b.arv().arw().stop();
        b.arv().aqP().gRC = -100;
        mw(-100);
        break label164;
        b.arv().arw().stop();
        break label164;
        an(true);
        b.arv().arw().stop();
        b.arv().aqP().gRC = -4;
        mw(-4);
        h.mEJ.a(485L, 24L, 1L, false);
        if ((this.gUw == null) || (this.gUw.gSk == 0L)) {
          break label164;
        }
        long l = bi.bH(this.gUw.gSk);
        x.i("MicroMsg.BackupMoveServer", "onNotify backup transfer disconnect, backupDataSize:%d kb, backupCostTime:%d s", new Object[] { Long.valueOf(this.gUw.arc()), Long.valueOf(l / 1000L) });
        break label164;
        an(true);
        break label164;
        if (bi.oW(b.arv().gRu)) {
          b.arv().gRu = ((v)localObject).ID;
        }
        if (!((v)localObject).ID.equals(b.arv().gRu))
        {
          x.e("MicroMsg.BackupMoveServer", "id not equel:self:%s, authReq.id:%s", new Object[] { b.arv().gRu, ((v)localObject).ID });
          an(false);
          b.arv().aqP().gRC = -5;
          mw(-5);
          return;
        }
        x.i("MicroMsg.BackupMoveServer", "authReq info, id:%s, step:%d", new Object[] { ((v)localObject).ID, Integer.valueOf(((v)localObject).hcC) });
        if (((v)localObject).hcC == 0)
        {
          paramArrayOfByte = ((v)localObject).hbs.lR;
          if (!b.arv().gRv.equals(new String(k.a(paramArrayOfByte, com.tencent.mm.plugin.backup.a.d.aqT()))))
          {
            paramArrayOfByte = new w();
            paramArrayOfByte.hcC = 0;
            paramArrayOfByte.ID = b.arv().gRu;
            paramArrayOfByte.hcd = 1;
            x.e("MicroMsg.BackupMoveServer", "get authReq step 0, but hello failed");
          }
          try
          {
            x.i("MicroMsg.BackupMoveServer", "summerbak send authFailResp.");
            com.tencent.mm.plugin.backup.f.b.o(paramArrayOfByte.toByteArray(), 2, paramInt2);
            b.arv().aqP().gRC = -5;
            mw(-5);
            if (((v)localObject).hcD < com.tencent.mm.plugin.backup.a.c.gRm)
            {
              x.i("MicroMsg.BackupMoveServer", "summerbak old move, version:%d", new Object[] { Integer.valueOf(((v)localObject).hcD) });
              h.mEJ.a(485L, 103L, 1L, false);
              b.arv().aqP().gRC = -12;
              mw(-12);
              return;
            }
          }
          catch (Exception paramArrayOfByte)
          {
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
            }
            x.i("MicroMsg.BackupMoveServer", "summerbak start move");
            this.gUD = paramInt2;
            if ((gUB) || (gTb))
            {
              if ((gUB) && (gTb) && ((((v)localObject).hcF & com.tencent.mm.plugin.backup.a.c.gRr) == 0) && ((((v)localObject).hcF & com.tencent.mm.plugin.backup.a.c.gRs) == 0))
              {
                b.arv().aqP().gRC = -31;
                mw(-31);
                this.gUE = 1;
                return;
              }
              if ((gUB) && ((((v)localObject).hcF & com.tencent.mm.plugin.backup.a.c.gRr) == 0))
              {
                b.arv().aqP().gRC = -32;
                mw(-32);
                this.gUE = 2;
                return;
              }
              if ((gTb) && ((((v)localObject).hcF & com.tencent.mm.plugin.backup.a.c.gRs) == 0))
              {
                b.arv().aqP().gRC = -33;
                mw(-33);
                this.gUE = 3;
                return;
              }
            }
            dw(false);
            return;
          }
        }
      } while (((v)localObject).hcC != 1);
      paramArrayOfByte = ((v)localObject).hbs.lR;
      if (!b.arv().gRw.equals(new String(k.a(paramArrayOfByte, com.tencent.mm.plugin.backup.a.d.aqT()))))
      {
        x.e("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok failed");
        b.arv().aqP().gRC = -5;
        mw(-5);
      }
      x.i("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok success");
      b.arv().aqP().gRC = 2;
      mw(2);
      return;
      if (paramInt1 == 3)
      {
        this.gUC = paramInt2;
        if (b.arv().arz().gTA)
        {
          arJ();
          return;
        }
        this.gUz = true;
        return;
      }
      if (paramInt1 == 9)
      {
        localObject = (com.tencent.mm.plugin.backup.h.e)com.tencent.mm.plugin.backup.a.g.a(new com.tencent.mm.plugin.backup.h.e(), paramArrayOfByte);
        if (localObject == null)
        {
          x.e("MicroMsg.BackupMoveServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bi.bD(paramArrayOfByte)) });
          return;
        }
        x.i("MicroMsg.BackupMoveServer", "summerbak receive heartbeatReq,req:%s ack:%d", new Object[] { localObject, Long.valueOf(((com.tencent.mm.plugin.backup.h.e)localObject).gXZ) });
        paramArrayOfByte = (f)com.tencent.mm.plugin.backup.a.g.a(new f(), paramArrayOfByte);
        paramArrayOfByte.gXZ = ((com.tencent.mm.plugin.backup.h.e)localObject).gXZ;
        try
        {
          x.i("MicroMsg.BackupMoveServer", "summerbak send heartbeatResp");
          com.tencent.mm.plugin.backup.f.b.o(paramArrayOfByte.toByteArray(), 10, paramInt2);
          return;
        }
        catch (Exception paramArrayOfByte)
        {
          x.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
          return;
        }
      }
      if (paramInt1 == 10)
      {
        localObject = new f();
        try
        {
          ((f)localObject).aG(paramArrayOfByte);
          return;
        }
        catch (Exception paramArrayOfByte)
        {
          x.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak heartbeatResp parse from buf error.", new Object[0]);
          return;
        }
      }
      if (paramInt1 == 5)
      {
        x.i("MicroMsg.BackupMoveServer", "summerbak receive command cancel");
        an(true);
        b.arv().aqP().gRC = -100;
        mw(-100);
        return;
      }
    } while (paramInt1 != 12);
    Object localObject = (j)com.tencent.mm.plugin.backup.a.g.a(new j(), paramArrayOfByte);
    if (localObject == null)
    {
      x.e("MicroMsg.BackupMoveServer", "requestSessionResp parseBuf failed:%d", new Object[] { Integer.valueOf(bi.bD(paramArrayOfByte)) });
      b.arv().aqP().gRC = -5;
      mw(-5);
      return;
    }
    paramArrayOfByte = b(((j)localObject).hbH, ((j)localObject).hbI);
    if (paramArrayOfByte == null) {}
    for (paramInt1 = -1;; paramInt1 = paramArrayOfByte.size())
    {
      x.i("MicroMsg.BackupMoveServer", "summerbak backup receive requestsession response. backupSessionList:%d ", new Object[] { Integer.valueOf(paramInt1) });
      if (paramArrayOfByte != null) {
        break;
      }
      x.e("MicroMsg.BackupMoveServer", "requestSessionResp sessionName or timeInterval null or requestSessionResp number error.");
      arE();
      b.arv().aqP().gRC = -21;
      mw(-21);
      return;
    }
    com.tencent.mm.plugin.backup.f.b.a(this.gUp);
    com.tencent.mm.plugin.backup.f.b.asl();
    this.gUw = new com.tencent.mm.plugin.backup.b.c(b.arv(), 2, this);
    this.gUw.dt(false);
    this.gUw.a(paramArrayOfByte, b.arv().aqP().gRF, gTb);
  }
  
  public final void an(boolean paramBoolean)
  {
    x.e("MicroMsg.BackupMoveServer", "summerbak BackupMoveServer CANCEL, Caller:%s", new Object[] { aj.cin() });
    if (!paramBoolean) {
      arE();
    }
    if (this.gUw != null) {
      this.gUw.cancel();
    }
    if (this.gUv != null)
    {
      this.gUv.cancel();
      this.gUv = null;
    }
    x.i("MicroMsg.BackupMoveServer", "cancel , notifyall.");
    com.tencent.mm.plugin.backup.f.b.asm();
    com.tencent.mm.plugin.backup.f.b.aso();
  }
  
  public final void aqL() {}
  
  public final void aqM()
  {
    an(false);
  }
  
  public final void arJ()
  {
    x.i("MicroMsg.BackupMoveServer", "startRequestNotify receive start request.");
    this.gUz = false;
    b.arv().aqP().gRC = 12;
    mw(12);
    com.tencent.mm.plugin.backup.g.d.asG().asJ();
    if (this.gUu == null) {
      return;
    }
    x.i("MicroMsg.BackupMoveServer", "transfer conversation size:%d", new Object[] { Integer.valueOf(this.gUu.size()) });
    Object localObject1 = new o();
    ((o)localObject1).ID = b.arv().gRu;
    ((o)localObject1).hcb = this.gUu.size();
    Object localObject2 = b.arv().arz();
    long l2;
    if (((a)localObject2).ars() == null) {
      l2 = 0L;
    }
    for (;;)
    {
      ((o)localObject1).hcc = l2;
      ((o)localObject1).hcd = 0;
      int i;
      if (this.gTY)
      {
        i = com.tencent.mm.plugin.backup.a.c.gRl;
        ((o)localObject1).hce = i;
        if (gTb) {
          ((o)localObject1).hca = 3;
        }
        localObject2 = new m();
        ((m)localObject2).hbO = q.zz();
        ((m)localObject2).hbP = Build.MANUFACTURER;
        ((m)localObject2).hbQ = Build.MODEL;
        ((m)localObject2).hbR = "Android";
        ((m)localObject2).hbS = Build.VERSION.RELEASE;
        ((m)localObject2).hbT = com.tencent.mm.protocal.d.qVN;
        ((m)localObject2).hbU = 0L;
        x.i("MicroMsg.BackupMoveServer", "startRequestNotify generalinfo wechatversion:%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.qVN) });
        ((o)localObject1).hbY = ((m)localObject2);
      }
      try
      {
        com.tencent.mm.plugin.backup.f.b.o(((o)localObject1).toByteArray(), 4, this.gUC);
        long l1 = this.gUx;
        l2 = this.gUy;
        x.i("MicroMsg.BackupMoveServer", "backupSendRequestSession sessionName[%d], startTime[%d], endTime[%d]", new Object[] { Integer.valueOf(this.gUu.size()), Long.valueOf(l1), Long.valueOf(l2) });
        localObject1 = new i();
        ((i)localObject1).hbH = this.gUu;
        ((i)localObject1).hbI = new LinkedList();
        localObject2 = this.gUu.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ((Iterator)localObject2).next();
          ((i)localObject1).hbI.add(Long.valueOf(l1));
          ((i)localObject1).hbI.add(Long.valueOf(l2));
          continue;
          localObject2 = ((a)localObject2).ars().iterator();
          for (l1 = 0L;; l1 = ((f.b)((Iterator)localObject2).next()).gRL + l1)
          {
            l2 = l1;
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
          }
          i = com.tencent.mm.plugin.backup.a.c.gRk;
        }
      }
      catch (IOException localIOException)
      {
        x.e("MicroMsg.BackupMoveServer", "startRequestNotify prase startResp error!!");
        x.printErrStackTrace("MicroMsg.BackupMoveServer", localIOException, "", new Object[0]);
        return;
      }
    }
    try
    {
      x.i("MicroMsg.BackupMoveServer", "backupSendRequestSession, chooseConvNames size:%d", new Object[] { Integer.valueOf(this.gUu.size()) });
      com.tencent.mm.plugin.backup.f.b.J(localIOException.toByteArray(), 11);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "backupSendRequestSession BackupRequestSession parse req failed.", new Object[0]);
    }
  }
  
  public final void dw(boolean paramBoolean)
  {
    if (paramBoolean) {
      switch (this.gUE)
      {
      }
    }
    for (;;)
    {
      w localw = new w();
      localw.hcC = 0;
      localw.ID = b.arv().gRu;
      localw.hcD = com.tencent.mm.plugin.backup.a.c.gRm;
      localw.hcd = 0;
      localw.hcE = this.gUA;
      localw.hbs = new com.tencent.mm.bk.b(k.b(b.arv().gRw.getBytes(), com.tencent.mm.plugin.backup.a.d.aqT()));
      if (bi.getInt(com.tencent.mm.k.g.AT().getValue("ChattingRecordsKvstatDisable"), 0) == 0) {
        localw.hcF |= com.tencent.mm.plugin.backup.a.c.gRq;
      }
      localw.hcF |= com.tencent.mm.plugin.backup.a.c.gRr;
      localw.hcF |= com.tencent.mm.plugin.backup.a.c.gRs;
      try
      {
        x.i("MicroMsg.BackupMoveServer", "summerbak send authSuccessResp.");
        com.tencent.mm.plugin.backup.f.b.o(localw.toByteArray(), 2, this.gUD);
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
      }
      gUB = false;
      gTb = false;
      this.gUx = 0L;
      this.gUy = 0L;
      continue;
      gUB = false;
      this.gUx = 0L;
      this.gUy = 0L;
      continue;
      gTb = false;
    }
  }
  
  public final void mw(int paramInt)
  {
    if (this.gSW != null) {
      ah.A(new d.1(this, paramInt));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */