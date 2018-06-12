package com.tencent.mm.plugin.backup.f;

import com.tencent.mm.a.k;
import com.tencent.mm.plugin.backup.a.c;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.plugin.backup.h.w;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends b
{
  public v gXt = new v();
  public w gXu = new w();
  final int gXv;
  final String gXw;
  final byte[] gXx;
  final String gXy;
  
  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.BackupAuthScene", "BackupAuthScene init, backupType[%d], stack:%s", new Object[] { Integer.valueOf(paramInt2), bi.cjd() });
    this.gXt.hbs = new com.tencent.mm.bk.b(k.b(paramString1.getBytes(), paramArrayOfByte));
    this.gXt.hcC = 0;
    this.gXt.ID = paramString3;
    this.gXt.hcD = paramInt1;
    this.gXw = paramString2;
    this.gXy = paramString3;
    this.gXx = paramArrayOfByte;
    this.gXv = paramInt2;
  }
  
  public final com.tencent.mm.bk.a asj()
  {
    return this.gXu;
  }
  
  public final com.tencent.mm.bk.a ask()
  {
    return this.gXt;
  }
  
  public final int getType()
  {
    return 1;
  }
  
  public final void mI(int paramInt)
  {
    if (this.gXu.hcd != 0)
    {
      x.e("MicroMsg.BackupAuthScene", "onSceneEnd errType[%d]", new Object[] { Integer.valueOf(this.gXu.hcd) });
      g(4, this.gXu.hcd, "onSceneEnd status failed");
    }
    do
    {
      return;
      if (!this.gXy.equals(this.gXu.ID))
      {
        x.e("MicroMsg.BackupAuthScene", "onSceneEnd not the same id");
        g(4, -1, "onSceneEnd not the same id");
        return;
      }
      String str = new String(k.a(this.gXu.hbs.lR, this.gXx));
      if (str.length() != this.gXw.length()) {}
      for (boolean bool = false;; bool = str.equals(this.gXw))
      {
        x.i("MicroMsg.BackupAuthScene", "onSceneEnd check ok result[%b]", new Object[] { Boolean.valueOf(bool) });
        if (bool) {
          break;
        }
        x.e("MicroMsg.BackupAuthScene", "onSceneEnd check ok failed");
        g(4, -3, "onSceneEnd check ok failed");
        return;
      }
      g(0, 0, "onSceneEnd auth success");
    } while ((this.gXv == 22) && (this.gXu.hcD < c.gRm));
    this.gXt.hbs = new com.tencent.mm.bk.b(k.b(this.gXw.getBytes(), this.gXx));
    this.gXt.hcC = 1;
    this.gXt.ID = this.gXy;
    try
    {
      x.i("MicroMsg.BackupAuthScene", "directSendAuthOk");
      b.o(this.gXt.toByteArray(), 1, paramInt);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BackupAuthScene", localException, "directSendAuthOk req to bur err.", new Object[0]);
    }
  }
  
  public final void s(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      localv = this.gXt;
      localv.hcF |= c.gRq;
    }
    v localv = this.gXt;
    localv.hcF |= c.gRr;
    localv = this.gXt;
    localv.hcF |= c.gRs;
    if (paramBoolean2)
    {
      localv = this.gXt;
      localv.hcF |= c.gRt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */