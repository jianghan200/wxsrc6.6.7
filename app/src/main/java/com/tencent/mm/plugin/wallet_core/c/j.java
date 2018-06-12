package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.uk;
import com.tencent.mm.protocal.c.ul;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private boolean pjf;
  private uk pjl;
  public ul pjm;
  
  public j(String paramString, boolean paramBoolean)
  {
    this.pjf = paramBoolean;
    b.a locala = new b.a();
    locala.dIG = new uk();
    locala.dIH = new ul();
    if (paramBoolean) {
      locala.dIF = 2529;
    }
    for (locala.uri = "/cgi-bin/mmpay-bin/mktf2fmodifyexposure";; locala.uri = "/cgi-bin/mmpay-bin/mktmodifyexposure")
    {
      locala.dII = 0;
      locala.dIJ = 0;
      this.eAN = locala.KT();
      this.pjl = ((uk)this.eAN.dID.dIL);
      this.pjl.rxR = paramString;
      return;
      locala.dIF = 2888;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMktModifyExposure", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pjm = ((ul)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    if (this.pjf) {
      return 2529;
    }
    return 2888;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */