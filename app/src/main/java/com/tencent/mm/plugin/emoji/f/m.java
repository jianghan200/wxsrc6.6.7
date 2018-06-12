package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.ade;
import com.tencent.mm.protocal.c.adf;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public byte[] iiN = null;
  private String iiO;
  
  public m(String paramString, byte[] paramArrayOfByte)
  {
    b.a locala = new b.a();
    locala.dIG = new ade();
    locala.dIH = new adf();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetemotiondonorlist";
    locala.dIF = 299;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iiN = paramArrayOfByte;
    this.iiO = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (ade)this.diG.dID.dIL;
    if (this.iiN != null) {}
    for (parame1.rcT = ab.O(this.iiN);; parame1.rcT = new bhy())
    {
      parame1.rem = this.iiO;
      return a(parame, this.diG, this);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.emoji.NetSceneGetEmotionDonorList", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    paramq = (adf)((b)paramq).dIE.dIL;
    if (paramq.rcU != null) {
      this.iiN = ab.a(paramq.rcU);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final adf aEP()
  {
    return (adf)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 299;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */