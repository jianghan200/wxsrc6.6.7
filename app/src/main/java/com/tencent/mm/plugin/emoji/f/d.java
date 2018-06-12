package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.c.a;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.fq;
import com.tencent.mm.protocal.c.fr;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends com.tencent.mm.ab.l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private ArrayList<String> iio;
  
  public d(ArrayList<String> paramArrayList)
  {
    b.a locala = new b.a();
    locala.dIG = new fq();
    locala.dIH = new fr();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojibackup";
    locala.dIF = 696;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iio = paramArrayList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    ((fq)this.diG.dID.dIL).rfd = new LinkedList(this.iio);
    if ((this.iio == null) || (this.iio.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "need no backup custom emoji, list is null.");
      au.HU();
      c.DT().set(348162, Boolean.valueOf(false));
      return -1;
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "netId:%d, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramInt3 == 65102)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.NetSceneBatchEmojiBackup", "[cpan] batch backup emoji failed. over size.");
      au.HU();
      c.DT().a(aa.a.sOQ, Boolean.valueOf(true));
      h.mEJ.a(164L, 4L, 1L, false);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      au.HU();
      c.DT().a(aa.a.sOQ, Boolean.valueOf(false));
      paramq = i.aEA().igx;
      paramArrayOfByte = this.iio;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji failed. list is null");
        h.mEJ.a(164L, 2L, 1L, false);
      }
    }
    for (;;)
    {
      paramq = (fr)this.diG.dIE.dIL;
      if ((paramq.rff != null) && (paramq.rff.size() > 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "[cpan] there are some emoji need to upload.");
        i.aEA().igx.at(paramq.rff);
        au.HU();
        c.DT().set(348165, Boolean.valueOf(true));
        a.ei(true);
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji list size :%d.", new Object[] { Integer.valueOf(paramArrayOfByte.size()) });
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UPDATE");
      localStringBuilder.append(" EmojiInfo ");
      localStringBuilder.append(" SET ");
      localStringBuilder.append("source");
      localStringBuilder.append("=");
      localStringBuilder.append(EmojiInfo.tcT);
      localStringBuilder.append(" where ");
      localStringBuilder.append("md5");
      localStringBuilder.append(" IN (");
      paramInt1 = 0;
      while (paramInt1 < paramArrayOfByte.size())
      {
        localStringBuilder.append("'" + (String)paramArrayOfByte.get(paramInt1) + "'");
        if (paramInt1 < paramArrayOfByte.size() - 1) {
          localStringBuilder.append(",");
        }
        paramInt1 += 1;
      }
      localStringBuilder.append(")");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
      paramq.diF.fV("EmojiInfo", localStringBuilder.toString());
      break;
      h.mEJ.a(164L, 3L, 1L, false);
    }
  }
  
  public final int getType()
  {
    return 696;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */