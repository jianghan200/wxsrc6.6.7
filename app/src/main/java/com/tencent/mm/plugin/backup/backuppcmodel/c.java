package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.b.d;
import com.tencent.mm.plugin.backup.f.f.a;
import com.tencent.mm.plugin.backup.f.g.a;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  private static int dHg = 2;
  private static boolean gUi = false;
  private al gUh;
  final com.tencent.mm.ab.e gUj = new c.1(this);
  private final com.tencent.mm.ab.e gUk = new c.3(this);
  b.c gUo = new c.9(this);
  private final f.a gUp = new c.6(this);
  private final i.a gUq = new i.a()
  {
    public final void arG()
    {
      int i = b.arV().arW().gWw;
      if ((1 == i) || (3 == i)) {
        b.arV().arX().mH(b.arV().aqP().gRC);
      }
      while ((2 != i) && (4 != i)) {
        return;
      }
      b.arV().arY().mw(b.arV().aqP().gRC);
    }
    
    public final void arH()
    {
      int i = b.arV().aqP().gRC;
      x.e("MicroMsg.BackupPcProcessMgr", "speedOverTime callback, state[%d]", new Object[] { Integer.valueOf(i) });
      int j = b.arV().arW().gWw;
      if (((1 == j) || (3 == j)) && ((i == 14) || (i == 4)))
      {
        b.arV().arw().stop();
        b.arV().arX().an(true);
        h.mEJ.a(400L, 9L, 1L, false);
        b.arV().arX().mG(18);
        b.arV().aqP().gRC = -4;
        b.arV().arX().mH(-4);
      }
      while (((2 != j) && (4 != j)) || ((i != 23) && (i != 4))) {
        return;
      }
      b.arV().arw().stop();
      b.arV().arY().a(true, false, -4);
      h.mEJ.a(400L, 17L, 1L, false);
      b.arV().arY().mG(18);
    }
    
    public final void mB(int paramAnonymousInt) {}
  };
  boolean gWA;
  private com.tencent.mm.bk.b gWB;
  public int gWC;
  public boolean gWD = true;
  private final b.d gWE = new c.4(this);
  public final g.a gWF = new c.8(this);
  public int gWw = 0;
  public String gWx;
  String gWy;
  int gWz;
  
  public static void arE()
  {
    x.i("MicroMsg.BackupPcProcessMgr", "backupSendCancelRequest.");
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.arV().gRu;
    try
    {
      com.tencent.mm.plugin.backup.f.b.J(locala.toByteArray(), 5);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCancelRequest to buf err.", new Object[0]);
    }
  }
  
  private void asa()
  {
    b.arV().arw().connect(this.gWy, this.gWz);
    com.tencent.mm.plugin.backup.f.b.clear();
    com.tencent.mm.plugin.backup.f.b.a(1, this.gUk);
    com.tencent.mm.plugin.backup.f.a locala = new com.tencent.mm.plugin.backup.f.a(b.arV().gRv, b.arV().gRw, com.tencent.mm.plugin.backup.a.d.aqT(), b.arV().gRu, 0, 1);
    locala.s(true, true);
    locala.gXt.hcG = 1;
    locala.ass();
    x.i("MicroMsg.BackupPcProcessMgr", "tryConnect start backupConnectTimerHandler.");
    if (this.gUh == null) {
      this.gUh = new al(new al.a()
      {
        public final boolean vD()
        {
          if (!c.gUi)
          {
            x.e("MicroMsg.BackupPcProcessMgr", "tryConnect overtime failed.");
            if (c.c(c.this) != null) {
              c.c(c.this).SO();
            }
            c.d(c.this);
          }
          return true;
        }
      }, false);
    }
    this.gUh.J(3000L, 3000L);
  }
  
  public static String asb()
  {
    return com.tencent.mm.plugin.backup.f.b.asp();
  }
  
  public static void cf(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandResponse cmd:%d", new Object[] { Integer.valueOf(paramInt1) });
    com.tencent.mm.plugin.backup.h.c localc = new com.tencent.mm.plugin.backup.h.c();
    localc.hbr = paramInt1;
    try
    {
      com.tencent.mm.plugin.backup.f.b.o(localc.toByteArray(), 18, paramInt2);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCommandResponse to buf err.", new Object[0]);
    }
  }
  
  public final void a(boolean paramBoolean, com.tencent.mm.bk.b paramb)
  {
    this.gWA = paramBoolean;
    this.gWB = paramb;
  }
  
  public final void mF(int paramInt)
  {
    x.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandRequest cmd:%d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.backup.h.b localb = new com.tencent.mm.plugin.backup.h.b();
    localb.hbr = paramInt;
    if (paramInt == 9) {
      localb.hbs = this.gWB;
    }
    try
    {
      com.tencent.mm.plugin.backup.f.b.J(localb.toByteArray(), 17);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCommandRequest to buf err.", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcmodel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */