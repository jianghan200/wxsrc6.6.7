package com.tencent.mm.plugin.webwx.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.uo;
import com.tencent.mm.protocal.c.up;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  public int bNI;
  private final com.tencent.mm.ab.b dZf;
  private com.tencent.mm.ab.e diJ;
  
  public b(int paramInt)
  {
    this.bNI = paramInt;
    b.a locala = new b.a();
    uo localuo = new uo();
    up localup = new up();
    locala.dIG = localuo;
    locala.dIH = localup;
    locala.uri = "/cgi-bin/micromsg-bin/extdevicecontrol";
    locala.dIF = 792;
    locala.dII = 0;
    locala.dIJ = 0;
    localuo.jRb = paramInt;
    localuo.rxZ = 1;
    this.dZf = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneExtDeviceControl", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " errMsg:" + paramString);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 792;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webwx/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */