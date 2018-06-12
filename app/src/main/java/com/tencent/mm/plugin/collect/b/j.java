package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lm;
import com.tencent.mm.protocal.c.ln;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public ln hUj;
  
  public j()
  {
    b.a locala = new b.a();
    locala.dIG = new lm();
    locala.dIH = new ln();
    locala.dIF = 1256;
    locala.uri = "/cgi-bin/mmpay-bin/f2fannounce";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    x.d("MicroMsg.NetSceneF2fAnnouce", "do cgi");
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneF2fAnnouce", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.hUj = ((ln)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1256;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/collect/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */