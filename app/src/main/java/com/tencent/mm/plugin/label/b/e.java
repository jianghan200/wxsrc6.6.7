package com.tencent.mm.plugin.label.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.protocal.c.buv;
import com.tencent.mm.protocal.c.buw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private aqf kAH = null;
  
  public e(int paramInt, String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new buv();
    locala.dIH = new buw();
    locala.uri = "/cgi-bin/micromsg-bin/updatecontactlabel";
    locala.dIF = 637;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    if ((paramInt >= 0) && (!bi.oW(paramString)))
    {
      this.kAH = new aqf();
      this.kAH.rSH = paramInt;
      this.kAH.rSG = paramString;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    buv localbuv = (buv)this.diG.dID.dIL;
    if (this.kAH != null)
    {
      localbuv.srS = this.kAH;
      return a(parame, this.diG, this);
    }
    x.e("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[doScene] label pair is null.");
    parame1.a(3, -1, "[doScene]empty label pair.", this);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 637;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/label/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */