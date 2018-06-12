package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.mm.a.k;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.plugin.backup.h.w;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends com.tencent.mm.plugin.backup.f.b
{
  final int gRy;
  private v gXt = new v();
  private w gXu = new w();
  final String han;
  final String hao;
  private boolean hap = false;
  final byte[] key;
  
  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3)
  {
    x.i("MicroMsg.BakOldAuthScene", "summerbak init id:%s,  hello:%s, ok:%s, stack[%s]", new Object[] { paramString3, paramString1, paramString2, bi.cjd() });
    this.gXt.hbs = new com.tencent.mm.bk.b(k.b(paramString1.getBytes(), paramArrayOfByte));
    this.gXt.hcC = 0;
    this.gXt.ID = paramString3;
    this.gXt.hcD = 0;
    this.han = paramString2;
    this.hao = paramString3;
    this.key = paramArrayOfByte;
    this.gRy = -1;
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
    if (this.gXu.hcd == 0)
    {
      if (this.hao.equals(this.gXu.ID))
      {
        String str = new String(k.a(this.gXu.hbs.lR, this.key));
        if (str.length() != this.han.length()) {}
        for (boolean bool = false;; bool = str.equals(this.han))
        {
          this.hap = bool;
          x.i("MicroMsg.BakOldAuthScene", "check ok result:%b", new Object[] { Boolean.valueOf(this.hap) });
          if (!this.hap) {
            break;
          }
          g(0, 0, "auth ok");
          this.gXt.hbs = new com.tencent.mm.bk.b(k.b(this.han.getBytes(), this.key));
          this.gXt.hcC = 1;
          this.gXt.ID = this.hao;
          try
          {
            x.i("MicroMsg.BakOldAuthScene", "directSendAuthOk");
            com.tencent.mm.plugin.backup.f.b.o(this.gXt.toByteArray(), 1, paramInt);
            return;
          }
          catch (Exception localException)
          {
            x.printErrStackTrace("MicroMsg.BakOldAuthScene", localException, "directSendAuthOk req to bur err.", new Object[0]);
            return;
          }
        }
        x.e("MicroMsg.BakOldAuthScene", "check ok failed");
        g(4, 1, "not ok packet");
        return;
      }
      x.e("MicroMsg.BakOldAuthScene", "not the same id");
      g(4, -1, "not the same id");
      return;
    }
    x.e("MicroMsg.BakOldAuthScene", "errType %d", new Object[] { Integer.valueOf(this.gXu.hcd) });
    g(4, this.gXu.hcd, "not not success");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */