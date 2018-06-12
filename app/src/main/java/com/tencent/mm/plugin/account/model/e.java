package com.tencent.mm.plugin.account.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbr;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private bbr eNZ;
  
  public e(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new bbr();
    locala.dIH = new fl();
    locala.dIF = 268;
    locala.dII = 0;
    locala.dIJ = 0;
    locala.uri = "/cgi-bin/micromsg-bin/privacypolicychoise";
    this.eAN = locala.KT();
    this.eNZ = ((bbr)this.eAN.dID.dIL);
    this.eNZ.sdR = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetScenePrivacyPolicyChoice", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 268;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */