package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends l
  implements com.tencent.mm.network.k
{
  private final q dJM = new com.tencent.mm.ab.k();
  private com.tencent.mm.ab.e diJ;
  
  public final boolean La()
  {
    return false;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dJM, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetCert", "dkcert onGYNetEnd [%d,%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 381;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelsimple/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */