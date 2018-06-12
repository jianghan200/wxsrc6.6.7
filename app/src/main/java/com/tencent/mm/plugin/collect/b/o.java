package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bme;
import com.tencent.mm.protocal.c.bmf;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private bme hUD;
  
  public o(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new bme();
    locala.dIH = new bmf();
    locala.dIF = 304;
    locala.uri = "/cgi-bin/micromsg-bin/setpushsound";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.hUD = ((bme)this.eAN.dID.dIL);
    this.hUD.hcE = 3;
    this.hUD.skz = paramString;
    x.i("MicroMsg.NetSceneSetPushSound", "type: %d, sound: %s", new Object[] { Integer.valueOf(3), paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSetPushSound", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 304;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */