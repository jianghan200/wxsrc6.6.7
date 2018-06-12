package com.tencent.mm.modelappbrand;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aho;
import com.tencent.mm.protocal.c.ahp;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  public final b dFA;
  private com.tencent.mm.ab.e doG;
  
  public n(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new aho();
    locala.dIH = new ahp();
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getservicenotifyoptions";
    locala.dIF = 1145;
    locala.dII = 0;
    locala.dIJ = 0;
    this.dFA = locala.KT();
    ((aho)this.dFA.dID.dIL).rKO = paramInt;
  }
  
  public final ahp JR()
  {
    return (ahp)this.dFA.dIE.dIL;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
    this.doG = parame1;
    return a(parame, this.dFA, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.doG != null) {
      this.doG.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1145;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelappbrand/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */