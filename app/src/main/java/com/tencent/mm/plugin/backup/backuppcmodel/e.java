package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.a.b.b;
import com.tencent.mm.plugin.backup.a.b.c;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.plugin.backup.f.b.d;
import com.tencent.mm.plugin.backup.f.j;
import com.tencent.mm.plugin.backup.h.m;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class e
{
  private static boolean gTb = false;
  private static boolean gUB = false;
  static boolean gWQ = false;
  private b.b gSh = new e.5(this);
  final com.tencent.mm.ab.e gUl = new com.tencent.mm.ab.e()
  {
    public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
    {
      com.tencent.mm.plugin.backup.f.b.b(3, e.this.gUl);
      if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp failed, errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        h.mEJ.a(400L, 117L, 1L, false);
        b.arV().aqP().gRC = -5;
        e.this.mH(-5);
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp success, errMsg[%s]", new Object[] { paramAnonymousString });
      paramAnonymousString = ((j)paramAnonymousl).gYv;
      if (!b.arV().gRu.equals(paramAnonymousString.ID))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp not the same id");
        h.mEJ.a(400L, 118L, 1L, false);
        b.arV().aqP().gRC = -5;
        e.this.mH(-5);
        return;
      }
      b.arV().aqP().gRF = paramAnonymousString.hbV;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp BigDataSize[%d]", new Object[] { Long.valueOf(paramAnonymousString.hbV) });
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sVe, Boolean.valueOf(false));
      com.tencent.mm.plugin.backup.f.b.asl();
      e.a(e.this);
    }
  };
  LinkedList<String> gUu;
  private com.tencent.mm.plugin.backup.b.b gUv;
  com.tencent.mm.plugin.backup.b.c gUw;
  private long gUx = 0L;
  private long gUy = 0L;
  public Set<b.c> gWI = new HashSet();
  public b.a gWJ;
  private boolean gWL = false;
  public boolean gWR = false;
  public boolean gWS = false;
  final com.tencent.mm.ab.e gWT = new e.2(this);
  private final b.d gWU = new e.3(this);
  
  public static void asf()
  {
    gWQ = true;
  }
  
  public static void d(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "setBackupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramLong2 = 0L;
      paramLong1 = 0L;
    }
    b.arV();
    SharedPreferences.Editor localEditor = b.aqU().edit();
    if (1 == b.arV().arW().gWw)
    {
      localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", paramInt1);
      localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", paramInt2);
      localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", paramLong1);
      localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", paramLong2);
    }
    localEditor.commit();
  }
  
  public final void D(LinkedList<String> paramLinkedList)
  {
    this.gUu = paramLinkedList;
    b.arV();
    label89:
    int i;
    label95:
    SharedPreferences.Editor localEditor;
    if (b.aqU().getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0) == 1)
    {
      gUB = true;
      b.arV();
      this.gUx = b.aqU().getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
      b.arV();
      this.gUy = b.aqU().getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
      b.arV();
      if (b.aqU().getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0) != 1) {
        break label235;
      }
      gTb = true;
      if (paramLinkedList != null) {
        break label242;
      }
      i = -1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "setBackupChooseData users size[%d], isSelectTime[%b], isQuickBackup[%b], selectStartTime[%d], selectEndTime[%d]", new Object[] { Integer.valueOf(i), Boolean.valueOf(gUB), Boolean.valueOf(gTb), Long.valueOf(this.gUx), Long.valueOf(this.gUy) });
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUY, Boolean.valueOf(true));
      if (1 == b.arV().arW().gWw)
      {
        b.arV();
        localEditor = b.aqU().edit();
        if (paramLinkedList != null) {
          break label250;
        }
      }
    }
    label235:
    label242:
    label250:
    for (paramLinkedList = new String[0];; paramLinkedList = (String[])paramLinkedList.toArray(new String[paramLinkedList.size()]))
    {
      localEditor.putString("BACKUP_PC_CHOOSE_SESSION", g.a("", ",", paramLinkedList));
      localEditor.commit();
      return;
      gUB = false;
      break;
      gTb = false;
      break label89;
      i = paramLinkedList.size();
      break label95;
    }
  }
  
  public final void an(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "cancel, isSelf[%b], Caller:%s", new Object[] { Boolean.valueOf(paramBoolean), aj.cin() });
    gWQ = true;
    if (!paramBoolean)
    {
      b.arV().arW();
      c.arE();
    }
    this.gUw.cancel();
    if (this.gUv != null)
    {
      this.gUv.cancel();
      this.gUv = null;
    }
    com.tencent.mm.plugin.backup.f.b.asm();
    com.tencent.mm.plugin.backup.f.b.aso();
    com.tencent.mm.plugin.backup.f.b.asq();
  }
  
  public final void aqN()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.gWI);
    ah.A(new e.4(this, localHashSet));
  }
  
  public final void bV(long paramLong)
  {
    int i = 3;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest");
    com.tencent.mm.plugin.backup.f.b.a(3, this.gUl);
    j localj = new j(b.arV().gRu);
    Object localObject = new PLong();
    PLong localPLong = new PLong();
    au.HU();
    g.a((PLong)localObject, localPLong, com.tencent.mm.model.c.Gq());
    if (gTb) {}
    for (;;)
    {
      localObject = g.bU(localPLong.value);
      localj.gYu.hbV = 0L;
      localj.gYu.hbW = paramLong;
      localj.gYu.hbX = 0L;
      localj.gYu.hbY = ((m)localObject);
      localj.gYu.hbZ = 0L;
      localj.gYu.hca = i;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest sessionCount:%d, transferType:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
      localj.ass();
      return;
      au.HU();
      if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sVe, Boolean.valueOf(false))).booleanValue()) {
        i = 0;
      } else {
        i = 1;
      }
    }
  }
  
  public final void init()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "BackupPcServer init.");
    gWQ = false;
    this.gWL = false;
    com.tencent.mm.plugin.backup.f.b.a(this.gWU);
    this.gUw = new com.tencent.mm.plugin.backup.b.c(b.arV(), 1, this.gSh);
  }
  
  public final void mG(int paramInt)
  {
    long l1 = 0L;
    long l2;
    if (this.gUw != null)
    {
      if (this.gUw.gSk != 0L) {
        l1 = bi.bH(this.gUw.gSk);
      }
      long l3 = this.gUw.arc();
      l2 = l1;
      l1 = l3;
    }
    for (;;)
    {
      h.mEJ.h(13737, new Object[] { Integer.valueOf(paramInt), Long.valueOf(l1), Long.valueOf(l2 / 1000L), Integer.valueOf(1), Integer.valueOf(b.arV().arW().gWC) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], backupCostTime[%d s]", new Object[] { Integer.valueOf(13737), Integer.valueOf(paramInt), Long.valueOf(l1), Long.valueOf(l2 / 1000L) });
      return;
      l1 = 0L;
      l2 = 0L;
    }
  }
  
  public final void mH(int paramInt)
  {
    this.gSh.mw(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcmodel/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */