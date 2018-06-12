package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.eq;
import com.tencent.mm.protocal.c.er;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  public int eKI;
  private List<String> iin;
  
  public c(int paramInt, List<String> paramList)
  {
    b.a locala = new b.a();
    locala.dIG = new eq();
    locala.dIH = new er();
    locala.uri = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
    locala.dIF = 698;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.eKI = paramInt;
    this.iin = paramList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (eq)this.diG.dID.dIL;
    parame1.rfe = this.eKI;
    parame1.rfd = new LinkedList(this.iin);
    int i;
    if ((parame1.rfd != null) && (parame1.rfd.size() > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5 list size:%s", new Object[] { Integer.valueOf(parame1.rfd.size()) });
      i = 0;
    }
    while (i < parame1.rfd.size())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5:%s", new Object[] { parame1.rfd.get(i) });
      i += 1;
      continue;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "empty md5 list.");
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramInt3 == 65102)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.NetSceneBackupEmojiOperate", "[cpan] batch backup emoji failed. over size.");
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOQ, Boolean.valueOf(true));
      h.mEJ.a(164L, 7L, 1L, false);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOQ, Boolean.valueOf(false));
      if (this.eKI == 1) {
        h.mEJ.a(164L, 5L, 1L, false);
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      h.mEJ.a(164L, 8L, 1L, false);
      continue;
      if (this.eKI == 1) {
        h.mEJ.a(164L, 6L, 1L, false);
      } else {
        h.mEJ.a(164L, 9L, 1L, false);
      }
    }
  }
  
  public final int getType()
  {
    return 698;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */