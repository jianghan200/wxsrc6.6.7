package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aaz;
import com.tencent.mm.protocal.c.aba;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends l
  implements k
{
  b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  
  public o()
  {
    b.a locala = new b.a();
    locala.dIG = new aaz();
    locala.dIH = new aba();
    locala.uri = "/cgi-bin/micromsg-bin/getboundharddevices";
    locala.dIF = 539;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((aaz)this.diG.dID.dIL).hcD = 1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneGetBoundHardDevices", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 539;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */