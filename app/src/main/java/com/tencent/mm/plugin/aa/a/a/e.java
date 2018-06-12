package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.d;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private d eAO;
  public com.tencent.mm.protocal.c.e eAP;
  public int scene;
  
  public e(String paramString1, int paramInt, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new d();
    locala.dIH = new com.tencent.mm.protocal.c.e();
    locala.dIF = 1530;
    locala.uri = "/cgi-bin/mmpay-bin/newaaclose";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.eAO = ((d)this.eAN.dID.dIL);
    this.eAO.qYd = paramString2;
    this.eAO.qYc = paramString1;
    this.eAO.scene = paramInt;
    this.scene = paramInt;
    x.d("MicroMsg.NetSceneAAClose", "NetSceneAAClose, billNo: %s, scene: %s", new Object[] { this.eAO.qYc, Integer.valueOf(paramInt) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneAAClose", "doScene");
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAAClose", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eAP = ((com.tencent.mm.protocal.c.e)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneAAClose", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.eAP.hUm), this.eAP.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1530;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */