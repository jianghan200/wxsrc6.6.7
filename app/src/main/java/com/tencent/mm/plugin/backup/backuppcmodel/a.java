package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.SharedPreferences;
import com.tencent.mm.plugin.backup.a.f.b;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.plugin.backup.b.c;
import com.tencent.mm.plugin.backup.g.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b.a
{
  public long gTv;
  private LinkedList<f.b> gTw = null;
  private LinkedList<f.b> gTx = null;
  private LinkedList<f.b> gTy = null;
  public boolean gTz = false;
  com.tencent.mm.plugin.backup.b.b gUv;
  public boolean gWn = false;
  public b.a gWo;
  private Object lock = new Object();
  
  private static long B(LinkedList<f.b> paramLinkedList)
  {
    long l1 = 0L;
    long l2 = l1;
    if (paramLinkedList != null)
    {
      l2 = l1;
      if (paramLinkedList.size() > 0)
      {
        l1 = ((f.b)paramLinkedList.get(0)).gRJ;
        paramLinkedList = paramLinkedList.iterator();
        l2 = l1;
        if (paramLinkedList.hasNext())
        {
          f.b localb = (f.b)paramLinkedList.next();
          if (l1 <= localb.gRJ) {
            break label77;
          }
          l1 = localb.gRJ;
        }
      }
    }
    label77:
    for (;;)
    {
      break;
      return l2;
    }
  }
  
  private LinkedList<f.b> ars()
  {
    if (this.gTy == null) {
      this.gTy = new LinkedList();
    }
    return this.gTy;
  }
  
  public final void C(LinkedList<f.b> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      this.gTy = new LinkedList();
      return;
    }
    this.gTy = new LinkedList(paramLinkedList.subList(paramLinkedList.size() * 3 / 4, paramLinkedList.size()));
    this.gTy.addAll(paramLinkedList.subList(0, paramLinkedList.size() * 3 / 4));
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2, LinkedList<f.b> paramLinkedList)
  {
    if (paramInt == 0)
    {
      this.gTx = new LinkedList(paramLinkedList);
      return;
    }
    if (this.gTx == null) {
      this.gTx = new LinkedList();
    }
    for (;;)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        f.b localb = (f.b)paramLinkedList.next();
        if (d.asG().asH().FT().r(localb.gRI, paramLong1, paramLong2) > 0) {
          this.gTx.add(localb);
        }
      }
      break;
      this.gTx.clear();
    }
  }
  
  public final LinkedList<f.b> arq()
  {
    if (this.gTw == null) {
      this.gTw = new LinkedList();
    }
    return this.gTw;
  }
  
  public final LinkedList<f.b> arr()
  {
    if (this.gTx == null) {
      this.gTx = new LinkedList();
    }
    return this.gTx;
  }
  
  public final void art()
  {
    this.gTw = null;
    this.gTy = null;
    this.gTx = null;
    this.gTz = false;
  }
  
  public final void cancel()
  {
    x.i("MicroMsg.BackupPcChooseServer", "cancel, stack:%s", new Object[] { bi.cjd() });
    synchronized (this.lock)
    {
      if (this.gUv != null)
      {
        this.gUv.cancel();
        this.gUv = null;
      }
      this.gTz = false;
      return;
    }
  }
  
  public final void dy(boolean paramBoolean)
  {
    x.i("MicroMsg.BackupPcChooseServer", "calculateToChoose, isChooseAllRecords[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    this.gWn = paramBoolean;
    d.asG().asJ();
    com.tencent.mm.sdk.f.e.post(new a.1(this), "BackupPcChooseServer.calculateToChoose");
  }
  
  public final void y(LinkedList<f.b> paramLinkedList)
  {
    int i;
    if (paramLinkedList == null)
    {
      i = -1;
      x.i("MicroMsg.BackupPcChooseServer", "onCalcuConvFinish, conv size[%d]", new Object[] { Integer.valueOf(i) });
      this.gTz = true;
      if ((paramLinkedList != null) && (paramLinkedList.size() != 0)) {
        break label122;
      }
      if (this.gWo != null) {
        this.gWo.y(paramLinkedList);
      }
      if (this.gWn)
      {
        paramLinkedList = b.arV().arX();
        e.gWQ = true;
        paramLinkedList.gUw.ard();
        b.arV().arw().stop();
        b.arV().aqP().gRC = -23;
        b.arV().arX().mH(-23);
      }
    }
    label122:
    do
    {
      return;
      i = paramLinkedList.size();
      break;
      this.gTw = new LinkedList(paramLinkedList);
      this.gTv = B(this.gTw);
      b.arV();
      SharedPreferences localSharedPreferences = b.aqU();
      a(localSharedPreferences.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0), localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L), localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L), arq());
      x.i("MicroMsg.BackupPcChooseServer", "onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", new Object[] { Integer.valueOf(paramLinkedList.size()), Integer.valueOf(arr().size()) });
      if (this.gWn)
      {
        C(arr());
        b.arV().arX().D(g.x(ars()));
        b.arV().arX().bV(ars().size());
      }
    } while (this.gWo == null);
    this.gWo.y(arr());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcmodel/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */