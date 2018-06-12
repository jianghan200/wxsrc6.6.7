package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.d.b.e.e.b;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends d
  implements com.tencent.d.b.e.e, k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String eWo = null;
  private com.tencent.d.b.e.b<e.b> jgZ = null;
  
  public c(String paramString)
  {
    this.eWo = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(com.tencent.d.b.e.b<e.b> paramb)
  {
    this.jgZ = paramb;
  }
  
  public final void aNJ()
  {
    x.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: authkey required");
    if (this.diJ != null) {
      this.diJ.a(4, -1, "", this);
    }
    if (this.jgZ != null)
    {
      x.e("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "alvinluo pay auth key expired when upload pay auth key");
      this.jgZ.cG(new e.b(false));
    }
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "onGYNetEnd errType: %d , errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
    if (this.jgZ != null)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        this.jgZ.cG(new e.b(true));
      }
    }
    else {
      return;
    }
    this.jgZ.cG(new e.b(false));
  }
  
  public final void execute()
  {
    g.DF().a(this, 0);
  }
  
  public final int getType()
  {
    return 1665;
  }
  
  public final void pS(int paramInt)
  {
    x.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt) });
    if (this.diJ != null) {
      this.diJ.a(4, -1, "", this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */