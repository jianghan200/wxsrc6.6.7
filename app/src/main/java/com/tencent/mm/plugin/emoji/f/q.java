package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.auh;
import com.tencent.mm.protocal.c.aui;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;

public final class q
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e doG;
  private int iiX;
  public String iiv;
  
  public q(String paramString, int paramInt)
  {
    this.iiv = paramString;
    if ((!bi.oW(paramString)) && (paramString.equals(String.valueOf(EmojiGroupInfo.tcy)))) {
      this.iiv = "com.tencent.xin.emoticon.tusiji";
    }
    this.iiX = paramInt;
    paramString = new b.a();
    paramString.dIG = new auh();
    paramString.dIH = new aui();
    paramString.uri = "/cgi-bin/micromsg-bin/modemotionpack";
    paramString.dIF = 413;
    paramString.dII = 212;
    paramString.dIJ = 1000000212;
    this.diG = paramString.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    parame1 = (auh)this.diG.dID.dIL;
    parame1.rem = this.iiv;
    parame1.qZc = this.iiX;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.emoji.NetSceneModEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.doG.a(paramInt2, paramInt3, paramString, this);
      if (this.iiX == 1)
      {
        h.mEJ.a(165L, 3L, 1L, false);
        x.i("MicroMsg.emoji.NetSceneModEmotionPack", "del tukiz failed  ");
        return;
      }
      h.mEJ.a(165L, 5L, 1L, false);
      x.i("MicroMsg.emoji.NetSceneModEmotionPack", "del emoji failed md5:%s", new Object[] { this.iiv });
      return;
    }
    if (this.iiX == 1) {
      h.mEJ.a(165L, 2L, 1L, false);
    }
    for (;;)
    {
      this.doG.a(paramInt2, paramInt3, paramString, this);
      return;
      h.mEJ.a(165L, 4L, 1L, false);
    }
  }
  
  public final int getType()
  {
    return 413;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */