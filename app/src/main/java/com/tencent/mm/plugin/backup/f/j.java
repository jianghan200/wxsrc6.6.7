package com.tencent.mm.plugin.backup.f;

import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.backup.h.n;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends b
{
  public n gYu = new n();
  public o gYv = new o();
  
  public j(String paramString)
  {
    x.i("MicroMsg.BackupStartScene", "BackupStartScene, id[%s]", new Object[] { paramString });
    this.gYu.ID = paramString;
  }
  
  public final a ask()
  {
    return this.gYu;
  }
  
  public final int getType()
  {
    return 3;
  }
  
  public final void mI(int paramInt)
  {
    x.i("MicroMsg.BackupStartScene", "onSceneEnd.");
    if (this.gYv.hcd != 0)
    {
      g(4, this.gYv.hcd, "BackupStartScene onSceneEnd failed");
      return;
    }
    g(0, this.gYv.hcd, "BackupStartScene onSceneEnd success");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/backup/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */