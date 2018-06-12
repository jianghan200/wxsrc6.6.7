package com.tencent.mm.plugin.backup.f;

import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.backup.h.i;
import com.tencent.mm.plugin.backup.h.j;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
  extends b
{
  private i gYi = new i();
  public j gYj = new j();
  
  public h(LinkedList<String> paramLinkedList, long paramLong1, long paramLong2)
  {
    x.i("MicroMsg.BackupRequestSessionScene", "init sessionName[%d], startTime[%d], endTime[%d]", new Object[] { Integer.valueOf(paramLinkedList.size()), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    this.gYi.hbH = paramLinkedList;
    this.gYi.hbI = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      paramLinkedList.next();
      this.gYi.hbI.add(Long.valueOf(paramLong1));
      this.gYi.hbI.add(Long.valueOf(paramLong2));
    }
  }
  
  public final a asj()
  {
    return this.gYj;
  }
  
  public final a ask()
  {
    return this.gYi;
  }
  
  public final int getType()
  {
    return 11;
  }
  
  public final void mI(int paramInt)
  {
    if ((this.gYj.hbH == null) || (this.gYj.hbI == null) || (this.gYj.hbH.isEmpty()) || (this.gYj.hbH.size() * 2 != this.gYj.hbI.size()))
    {
      if ((this.gYj.hbH != null) && (this.gYj.hbI != null)) {
        x.e("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName and TimeInterval size error. sessionName size[%d], timeInterval size[%d]", new Object[] { Integer.valueOf(this.gYj.hbH.size()), Integer.valueOf(this.gYj.hbI.size()) });
      }
      g(4, -1, "BackupRequestSession failed");
      return;
    }
    x.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName size[%d], name:%s", new Object[] { Integer.valueOf(this.gYj.hbH.size()), this.gYj.hbH.toString() });
    x.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd requestsession resp, TimeInterval:%s", new Object[] { this.gYj.hbI.toString() });
    g(0, 0, "BackupRequestSession success");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */