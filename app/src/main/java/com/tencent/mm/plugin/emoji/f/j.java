package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.acy;
import com.tencent.mm.protocal.c.acz;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e doG;
  public String iiI;
  private String iiJ;
  
  public j(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new acy();
    locala.dIH = new acz();
    locala.uri = "/cgi-bin/micromsg-bin/getemotionactivity";
    locala.dIF = 368;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iiI = paramString1;
    this.iiJ = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    parame1 = (acy)this.diG.dID.dIL;
    parame1.rHs = this.iiI;
    parame1.rwk = this.iiJ;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.emoji.NetSceneGetEmotionActivity", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 368;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */