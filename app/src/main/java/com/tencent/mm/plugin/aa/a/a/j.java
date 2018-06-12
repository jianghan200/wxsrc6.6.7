package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.u;
import com.tencent.mm.protocal.c.v;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private u eAY;
  public v eAZ;
  
  public j(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    b.a locala = new b.a();
    locala.dIG = new u();
    locala.dIH = new v();
    locala.dIF = 1695;
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerydetail";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.eAY = ((u)this.eAN.dID.dIL);
    this.eAY.qYc = paramString1;
    this.eAY.scene = paramInt1;
    this.eAY.qYd = paramString2;
    if (paramInt1 == 5)
    {
      x.i("MicroMsg.NetSceneAAQueryDetail", "set sign and ver");
      this.eAY.sign = paramString3;
      this.eAY.ver = paramInt2;
    }
    x.i("MicroMsg.NetSceneAAQueryDetail", "NetSceneAAQueryDetail, billNo: %s, scene: %s, groupId: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneAAQueryDetail", "doScene");
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAAQueryDetail", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eAZ = ((v)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneAAQueryDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.eAZ.hUm), this.eAZ.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1695;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */