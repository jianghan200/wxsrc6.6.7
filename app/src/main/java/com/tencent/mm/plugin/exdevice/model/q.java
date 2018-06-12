package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.ahy;
import com.tencent.mm.protocal.c.ahz;
import com.tencent.mm.sdk.platformtools.x;

public final class q
  extends l
  implements k
{
  public b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new ahy();
    parame1.dIH = new ahz();
    parame1.uri = "/cgi-bin/mmbiz-bin/rank/getsportdevicelist";
    parame1.dIF = 1267;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneGetSportDeviceList", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1267;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */