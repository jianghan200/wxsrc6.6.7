package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bce;
import com.tencent.mm.protocal.c.bcf;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public bce krA = null;
  public bcf krB = null;
  
  public k(int paramInt, long paramLong1, long paramLong2)
  {
    b.a locala = new b.a();
    locala.dIG = new bce();
    locala.dIH = new bcf();
    locala.dIF = 726;
    locala.uri = "/cgi-bin/micromsg-bin/pstnredirect";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.krA = ((bce)this.diG.dID.dIL);
    this.krA.rxG = paramInt;
    this.krA.rxH = paramLong1;
    this.krA.seh = paramLong2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallRedirect", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krB = ((bcf)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 726;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */