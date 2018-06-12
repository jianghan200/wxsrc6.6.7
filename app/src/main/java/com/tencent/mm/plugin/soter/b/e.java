package com.tencent.mm.plugin.soter.b;

import com.tencent.d.b.e.e.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements com.tencent.d.b.e.e, k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private com.tencent.d.b.e.b<e.b> jgZ = null;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneUploadSoterASK", "MicroMsg.NetSceneUploadSoterASK errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      x.i("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask successfully");
      if (this.jgZ != null) {
        this.jgZ.cG(new e.b(true));
      }
    }
    do
    {
      return;
      x.e("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask failed");
    } while (this.jgZ == null);
    this.jgZ.cG(new e.b(false));
  }
  
  public final void a(com.tencent.d.b.e.b<e.b> paramb)
  {
    this.jgZ = paramb;
  }
  
  public final void execute()
  {
    x.v("MicroMsg.NetSceneUploadSoterASK", "alvinluo NetSceneUploadSoterASK execute doScene");
    g.DF().a(this, 0);
  }
  
  public final int getType()
  {
    return 619;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/soter/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */