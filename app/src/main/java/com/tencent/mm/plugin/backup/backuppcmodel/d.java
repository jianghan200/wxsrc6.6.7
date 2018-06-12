package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.a.b.c;
import com.tencent.mm.plugin.backup.a.e;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.l;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class d
  implements com.tencent.mm.plugin.backup.a.b.d
{
  private static boolean gTT = false;
  private static boolean gWH = false;
  private boolean dJO = false;
  private com.tencent.mm.plugin.backup.b.d gTJ;
  private long gTK = 0L;
  LinkedList<String> gTL;
  LinkedList<Long> gTM;
  private HashSet<String> gTQ = new HashSet();
  private long gTR = 0L;
  private long gTS = 0L;
  private boolean gTb = false;
  public Set<b.c> gWI = new HashSet();
  public b.a gWJ;
  private long gWK = 0L;
  private boolean gWL = false;
  private final com.tencent.mm.plugin.backup.f.b.d gWM = new d.1(this);
  private Object lock = new Object();
  private long recvSize = 0L;
  
  public static boolean arA()
  {
    return au.HU().GA().ckv();
  }
  
  public static void ase()
  {
    gWH = true;
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
      x.printErrStackTrace("MicroMsg.BackupPcRecoverServer", paramString, "sendResp", new Object[0]);
    }
  }
  
  private static void d(int paramInt1, int paramInt2, long paramLong)
  {
    o localo = new o();
    localo.ID = b.arV().gRu;
    localo.hcd = paramInt1;
    localo.hbY = g.bU(paramLong);
    try
    {
      x.i("MicroMsg.BackupPcRecoverServer", "send start resp, status[%d]", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.plugin.backup.f.b.o(localo.toByteArray(), 4, paramInt2);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BackupPcRecoverServer", localException, "buf to BackupStartRequest err.", new Object[0]);
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 0;
    x.i("MicroMsg.BackupPcRecoverServer", "cancel isSelf[%b], needClearContinueRecoverData[%b], caller:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), aj.cin() });
    gWH = true;
    if (!paramBoolean1)
    {
      b.arV().arW();
      c.arE();
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
          b.arV().aqP().gRC = paramInt;
          mw(paramInt);
        }
        if (paramBoolean2) {
          arB();
        }
        com.tencent.mm.plugin.backup.f.b.asm();
        com.tencent.mm.plugin.backup.f.b.aso();
        com.tencent.mm.plugin.backup.f.b.asq();
        return;
      }
      i = 1;
    }
  }
  
  public final void aqO()
  {
    arB();
    h.mEJ.a(400L, 27L, 1L, false);
    h.mEJ.a(400L, 28L, bi.bH(this.gTS) / 1000L, false);
    com.tencent.mm.plugin.backup.f.b.asm();
    com.tencent.mm.plugin.backup.f.b.aso();
  }
  
  public final void arB()
  {
    x.i("MicroMsg.BackupPcRecoverServer", "clearContinueRecoverData");
    this.gTQ.clear();
  }
  
  public final void arg()
  {
    synchronized (this.lock)
    {
      if (this.dJO)
      {
        x.e("MicroMsg.BackupPcRecoverServer", "startMerge isCancel true.");
        return;
      }
      if ((this.gTJ != null) && (this.gTJ.gSS))
      {
        x.e("MicroMsg.BackupPcRecoverServer", "startMerge hasStartMerge, return.");
        return;
      }
    }
    if (this.gTJ != null) {
      this.gTJ.g(false, 0);
    }
    if ((this.gTQ == null) || (this.gTQ.size() <= 0)) {}
    for (int i = au.HU().GA().ckw();; i = this.gTQ.size())
    {
      b.arV().aqP().D(26, 1, i);
      mw(26);
      if (this.gTL == null) {
        this.gTL = new LinkedList();
      }
      if (this.gTM == null) {
        this.gTM = new LinkedList();
      }
      this.gTS = bi.VF();
      this.gTJ = new com.tencent.mm.plugin.backup.b.d(b.arV(), 1, this, i, this.gTb, this.gTL, this.gTM);
      this.gTJ.arg();
      h.mEJ.a(400L, 24L, 1L, false);
      return;
    }
  }
  
  public final void init()
  {
    x.i("MicroMsg.BackupPcRecoverServer", "init");
    this.gWL = false;
    gWH = false;
    gTT = false;
    com.tencent.mm.plugin.backup.f.b.a(this.gWM);
    this.gTK = 0L;
    this.recvSize = 0L;
    this.dJO = false;
    this.gTb = false;
    this.gTQ.clear();
  }
  
  public final void mG(int paramInt)
  {
    long l = 0L;
    if (this.gTR != 0L) {
      l = bi.bH(this.gTR);
    }
    h.mEJ.h(13737, new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.gTK / 1024L), Long.valueOf(l / 1000L), Integer.valueOf(2), Integer.valueOf(b.arV().arW().gWC) });
    x.i("MicroMsg.BackupPcRecoverServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], recoverCostTime[%d s]", new Object[] { Integer.valueOf(13737), Integer.valueOf(paramInt), Long.valueOf(this.gTK / 1024L), Long.valueOf(l / 1000L) });
  }
  
  public final void mw(int paramInt)
  {
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.gWI);
    ah.A(new d.3(this, localHashSet, paramInt));
    if (this.gWJ != null) {
      ah.A(new d.4(this, paramInt));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcmodel/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */