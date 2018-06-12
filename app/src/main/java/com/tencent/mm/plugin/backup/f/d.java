package com.tencent.mm.plugin.backup.f;

import com.tencent.mm.ab.e;
import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.z;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class d
  extends b
{
  private e dKj;
  private z gXT = new z();
  public aa gXU = new aa();
  
  public d(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, LinkedList<String> paramLinkedList, e parame)
  {
    x.i("MicroMsg.BackupDataTagScene", "init DataTag, BakChatName:%s, startTime:%d, endTime:%d, mediaIdList size:%d", new Object[] { paramString1, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramLinkedList.size()) });
    this.gXT.hbD = paramString1;
    this.gXT.hcP = paramLong1;
    this.gXT.hcQ = paramLong2;
    this.gXT.hcR = paramString2;
    this.gXT.hcS = paramString3;
    this.gXT.hcv = paramLinkedList;
    this.dKj = parame;
  }
  
  public final a asj()
  {
    return this.gXU;
  }
  
  public final a ask()
  {
    return this.gXT;
  }
  
  public final boolean ass()
  {
    boolean bool = super.ast();
    if (!bool) {
      this.dKj.a(1, -2, "doScene failed", this);
    }
    return bool;
  }
  
  public final int getType()
  {
    return 15;
  }
  
  public final void mI(int paramInt)
  {
    x.i("MicroMsg.BackupDataTagScene", "onSceneEnd");
    g(0, 0, "success");
    this.dKj.a(0, 0, "", this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */