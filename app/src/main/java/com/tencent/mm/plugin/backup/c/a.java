package com.tencent.mm.plugin.backup.c;

import android.content.SharedPreferences;
import com.tencent.mm.plugin.backup.a.e;
import com.tencent.mm.plugin.backup.a.f.b;
import com.tencent.mm.plugin.backup.b.b.3;
import com.tencent.mm.plugin.backup.b.b.4;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b.b
{
  boolean gTA = false;
  public com.tencent.mm.plugin.backup.b.b gTt;
  public b.b gTu;
  public long gTv;
  private LinkedList<f.b> gTw = null;
  private LinkedList<f.b> gTx = null;
  public LinkedList<f.b> gTy = null;
  public boolean gTz = false;
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
  
  public final void a(int paramInt, long paramLong1, long paramLong2, LinkedList<f.b> paramLinkedList)
  {
    if (paramInt == 0) {
      this.gTx = new LinkedList(paramLinkedList);
    }
    for (;;)
    {
      return;
      this.gTx = new LinkedList();
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        f.b localb = (f.b)paramLinkedList.next();
        if (com.tencent.mm.plugin.backup.g.d.asG().asH().FT().r(localb.gRI, paramLong1, paramLong2) > 0) {
          this.gTx.add(localb);
        }
      }
    }
  }
  
  public final void a(LinkedList<f.b> paramLinkedList, f.b paramb, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeProgress.");
    this.gTw = paramLinkedList;
    if (this.gTx != null)
    {
      Iterator localIterator = this.gTx.iterator();
      while (localIterator.hasNext())
      {
        f.b localb = (f.b)localIterator.next();
        if (localb.gRI.equals(paramb.gRI))
        {
          localb.gRL = paramb.gRL;
          localb.gRM = paramb.gRM;
        }
      }
    }
    if (b.arv().arx().gUz)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.arv().aqP().D(13, paramInt, paramLinkedList.size());
      b.arv().arx().mw(13);
    }
    if (this.gTu != null) {
      this.gTu.a(arr(), paramb, paramInt);
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
  
  public final LinkedList<f.b> ars()
  {
    if (this.gTy == null) {
      this.gTy = new LinkedList();
    }
    return this.gTy;
  }
  
  public final void art()
  {
    this.gTw = null;
    this.gTy = null;
    this.gTx = null;
    this.gTA = false;
    this.gTz = false;
  }
  
  public final void aru()
  {
    b.arv();
    SharedPreferences localSharedPreferences = b.aqU();
    a(localSharedPreferences.getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L), arq());
  }
  
  public final void cancel()
  {
    synchronized (this.lock)
    {
      if (this.gTt != null)
      {
        this.gTt.cancel();
        this.gTt = null;
      }
      return;
    }
  }
  
  public final void y(LinkedList<f.b> paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveChooseServer", "onCalcuConvFinish.");
    this.gTz = true;
    this.gTw = new LinkedList(paramLinkedList);
    this.gTv = B(this.gTw);
    aru();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveChooseServer", "onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", new Object[] { Integer.valueOf(arq().size()), Integer.valueOf(arr().size()) });
    if (this.gTu != null) {
      this.gTu.y(arr());
    }
  }
  
  public final void z(LinkedList<f.b> paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeFinish.");
    this.gTA = true;
    this.gTw = ((LinkedList)paramLinkedList.clone());
    aru();
    if (b.arv().arx().gUz)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.arv().arx().arJ();
    }
    while (this.gTu == null) {
      return;
    }
    this.gTu.z(paramLinkedList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/backup/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */