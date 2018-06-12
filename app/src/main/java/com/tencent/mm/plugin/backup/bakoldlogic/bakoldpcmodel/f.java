package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.backup.bakoldlogic.b.j;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b.2;
import com.tencent.mm.plugin.backup.h.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.protocal.c.ez;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  implements com.tencent.mm.ab.f
{
  boolean bPd = false;
  boolean dJO = false;
  boolean gSS = false;
  HashSet<String> gZB = new HashSet();
  e.d gZC;
  private com.tencent.mm.ab.e gZD;
  boolean gZE = false;
  int gZI = 0;
  List<t> hac;
  List<t> had;
  int hae = 0;
  public boolean haf = false;
  long hag;
  long hah;
  int hai;
  Object lock = new Object();
  
  public static int au(List<t> paramList)
  {
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      Object localObject = (t)paramList.next();
      try
      {
        localObject = com.tencent.mm.a.e.f(com.tencent.mm.plugin.backup.bakoldlogic.a.a.asK() + "backupItem/" + com.tencent.mm.plugin.backup.bakoldlogic.a.a.wv(((t)localObject).ID) + ((t)localObject).ID, 0, -1);
        int j = ((ez)new ez().aG((byte[])localObject)).hbG.size();
        i = j + i;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RecoverPCServer", localException, "", new Object[0]);
      }
    }
    return i;
  }
  
  final int a(String arg1, HashMap<String, Integer> paramHashMap, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.c paramc, HashSet<String> paramHashSet)
  {
    long l2 = System.currentTimeMillis();
    byte[] arrayOfByte = com.tencent.mm.a.e.f(???, 0, -1);
    ez localez;
    ey localey;
    int i;
    try
    {
      localez = (ez)new ez().aG(arrayOfByte);
      Iterator localIterator = localez.hbG.iterator();
      if (!localIterator.hasNext()) {
        break label953;
      }
      localey = (ey)localIterator.next();
      if ((this.bPd) && (!this.dJO)) {}
      try
      {
        str = (String)com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().DT().get(2, null);
        localf = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().FT();
        localObject1 = localey.rcj.siM;
        ??? = localey.rck.siM;
        if ((!bi.oW((String)localObject1)) && (!bi.oW(???))) {
          break label361;
        }
        localObject2 = localObject1;
        if (localObject1 != null) {
          break label992;
        }
        localObject2 = "null";
      }
      catch (Exception ???)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RecoverPCServer", "readFromSdcard err:" + ???.toString());
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RecoverPCServer", ???, "", new Object[0]);
        }
        localObject2 = ((com.tencent.mm.plugin.backup.bakoldlogic.d.c)localObject2).gYI;
        localay = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().FR();
        if (((i)localObject2).has((String)localObject1)) {
          break label1007;
        }
      }
    }
    catch (Exception paramHashMap)
    {
      synchronized (this.lock)
      {
        try
        {
          this.lock.wait();
          if (this.dJO)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "backupImp canceled");
            return -1;
            paramHashMap = paramHashMap;
            if (arrayOfByte == null) {}
            for (i = 0;; i = arrayOfByte.length)
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RecoverPCServer", "read mmPath errr %s, %s, len:%d", new Object[] { ???, paramHashMap, Integer.valueOf(i) });
              com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RecoverPCServer", paramHashMap, "", new Object[0]);
              return 0;
            }
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RecoverPCServer", localInterruptedException, "", new Object[0]);
          }
        }
      }
    }
    String str;
    com.tencent.mm.plugin.messenger.foundation.a.a.f localf;
    Object localObject1;
    Object localObject2;
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupPackMsgLogic", "recoverMsg fromUserName or toUserName is null, fromUserName[%s], toUserName[%s]", new Object[] { localObject2, localObject1 });
    for (;;)
    {
      label293:
      this.gZI += 1;
      if (this.gZI % 100 == 0) {
        atf();
      }
      com.tencent.mm.plugin.backup.b.e.mz(localey.hcE);
      long l1 = bi.VF();
      if (l1 - paramc.dDj <= 10000L) {
        break;
      }
      paramc.end();
      paramc.begin();
      paramc.dDj = l1;
      break;
      label361:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPackMsgLogic", "recoverMsg, type[%d], from[%s], to[%s]", new Object[] { Integer.valueOf(localey.hcE), localObject1, ??? });
      localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm();
      if (((com.tencent.mm.plugin.backup.bakoldlogic.d.c)localObject2).uin == 0) {
        throw new com.tencent.mm.model.b();
      }
      ay localay;
      if (!str.equals(localObject1)) {
        break label1021;
      }
      break label1007;
      label502:
      if (localey.rfC != 0L) {}
      for (l1 = localey.rfC;; l1 = localey.rfu * 1000L)
      {
        paramHashSet.add(localObject2);
        List localList = com.tencent.mm.plugin.backup.bakoldlogic.a.a.arb();
        if ((!localList.contains(localObject1)) && (!localList.contains(???))) {
          break label607;
        }
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupPackMsgLogic", "recoverMsg hit the blockList: " + (String)localObject1 + " " + ???);
        break;
      }
      label607:
      if ((localey.rcq == 0L) && (localey.rci != 0)) {
        localey.rcq = localey.rci;
      }
      if (localey.rcq != 0L)
      {
        if (!str.equals(localObject1)) {
          break label1034;
        }
        label656:
        ??? = localf.I(???, localey.rcq);
        if (???.field_msgId != 0L) {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPackMsgLogic", "recoverMsg msg exist");
        }
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupPackMsgLogic", "recoverMsg drop the item server id < 0");
        continue;
      }
      if (localey.rcq != 0L) {
        ???.ax(localey.rcq);
      }
      ???.aA(localey.rfB);
      ???.ay(l1);
      ???.fg(localey.rfD);
      ???.setType(localey.hcE);
      localObject1 = localay.Yg((String)localObject2);
      if ((localObject1 == null) || (bi.oW(((ai)localObject1).field_username)) || (!((com.tencent.mm.storage.ab)localObject1).ckW())) {
        break label1040;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupPackMsgLogic", "recoverMsg hit the blockList: " + (String)localObject2);
    }
    label818:
    ???.eX(j);
    ???.ep((String)localObject2);
    if (i != 0) {}
    for (int j = localey.rft;; j = 4)
    {
      ???.setStatus(j);
      if (paramHashMap.get(localObject2) == null) {
        paramHashMap.put(localObject2, Integer.valueOf(0));
      }
      if ((i == 0) && (localey.rft == 3)) {
        paramHashMap.put(localObject2, Integer.valueOf(bi.a((Integer)paramHashMap.get(localObject2), 0) + 1));
      }
      localObject1 = com.tencent.mm.plugin.backup.bakoldlogic.b.d.asM().mN(localey.hcE);
      if (localObject1 == null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPackMsgLogic", "recoverMsg unknown type");
        break label293;
      }
      ((j)localObject1).a(str, localey, ???);
      break label293;
      label953:
      com.tencent.mm.plugin.backup.b.e.aro();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RecoverPCServer", "read item time " + (System.currentTimeMillis() - l2));
      return localez.hbG.size();
      label992:
      localObject1 = ???;
      if (??? != null) {
        break;
      }
      localObject1 = "null";
      break;
      label1007:
      label1021:
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label1027;
        }
        localObject2 = ???;
        break;
      }
      label1027:
      localObject2 = localObject1;
      break label502;
      label1034:
      ??? = (String)localObject1;
      break label656;
      label1040:
      if (i != 0)
      {
        j = 1;
        break label818;
      }
      j = 0;
      break label818;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, l paraml)
  {
    this.hah += paramInt1;
    if (this.hag == 0L) {}
    for (paramInt1 = 0;; paramInt1 = (int)(this.hah * 100L / this.hag))
    {
      if (paramInt1 > this.hai)
      {
        this.hai = paramInt1;
        com.tencent.mm.plugin.backup.bakoldlogic.c.d.setProgress(this.hai);
      }
      if ((this.bPd) || (this.dJO) || (this.gZC == null) || (this.hai < 0) || (this.hai > 100)) {
        break;
      }
      this.gZC.mT(this.hai);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RecoverPCServer", "failed to call operatorCallback.onNetProgress:%d", new Object[] { Integer.valueOf(this.hai) });
  }
  
  final void ate()
  {
    if ((!this.gZE) || (this.dJO)) {
      return;
    }
    synchronized (this.lock)
    {
      if (!this.gZB.isEmpty()) {
        break label120;
      }
      if (this.dJO) {
        return;
      }
    }
    this.haf = true;
    this.hai = 0;
    a.asN().asO().gZU = 6;
    a.asN().asO().gZV = 5;
    if (this.gZC != null) {
      this.gZC.atb();
    }
    for (;;)
    {
      com.tencent.mm.plugin.backup.f.b.b(7, this.gZD);
      cg(0, 0);
      e.asZ();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "checkRecover publicRestAccUinEven");
      label120:
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "operatorCallback is null");
    }
  }
  
  public final void atf()
  {
    System.gc();
    long l1 = Runtime.getRuntime().freeMemory() / 1000L;
    long l2 = Runtime.getRuntime().totalMemory() / 1000L;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "memoryInfo avail/total, dalvik[%dk, %dk, user:%dk], recoverCnt:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1), Integer.valueOf(this.gZI) });
  }
  
  public final void cancel()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "cancel");
    this.dJO = true;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      com.tencent.mm.plugin.backup.f.b.b(7, this.gZD);
      this.gZC = null;
      this.haf = false;
      this.gSS = false;
      this.hae = 0;
      this.hai = 0;
      return;
    }
  }
  
  final void cg(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {}
    int i;
    for (long l = 0L;; l = paramInt1 * 100L / paramInt2)
    {
      i = (int)l;
      if (((paramInt1 == 0) && (paramInt2 == 0)) || (i > this.hae)) {
        break;
      }
      return;
    }
    this.hae = i;
    if ((!this.bPd) && (!this.dJO) && (this.gZC != null) && (this.hae >= 0) && (this.hae <= 100)) {
      this.gZC.mU(this.hae);
    }
    com.tencent.mm.plugin.backup.h.ab localab = new com.tencent.mm.plugin.backup.h.ab();
    localab.hbr = 13;
    localab.hcT = 0;
    localab.hcU = this.hae;
    try
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "send progress cmd, progress :%d", new Object[] { Integer.valueOf(i) });
      com.tencent.mm.plugin.backup.f.b.J(localab.toByteArray(), 3);
      return;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RecoverPCServer", localIOException, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RecoverPCServer", "buf to PacketCommandRequest err");
    }
  }
  
  public final void pause()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "pause");
    this.bPd = true;
  }
  
  public final void resume()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RecoverPCServer", "resume");
    this.bPd = false;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */