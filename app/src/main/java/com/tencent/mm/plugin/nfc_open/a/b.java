package com.tencent.mm.plugin.nfc_open.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.qh;
import com.tencent.mm.protocal.c.qi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public b(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new qh();
    locala.dIH = new qi();
    locala.uri = "/cgi-bin/mmpay-bin/cpucardgetconfig2";
    locala.dIF = 1561;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((qh)this.diG.dID.dIL).version = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneCpuCardGetConfig", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1561;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/nfc_open/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */