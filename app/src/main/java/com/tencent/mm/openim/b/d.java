package com.tencent.mm.openim.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.axy;
import com.tencent.mm.protocal.c.axz;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public h.b euu;
  private int opType;
  
  public d(h.b paramb)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new axy();
    ((b.a)localObject).dIH = new axz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/openimoplog";
    ((b.a)localObject).dIF = 806;
    this.diG = ((b.a)localObject).KT();
    this.opType = paramb.lcD;
    this.euu = paramb;
    x.i("MicroMsg.NetSceneOpenIMOPLog", "type: %d", new Object[] { Integer.valueOf(this.opType) });
    localObject = (axy)this.diG.dID.dIL;
    ((axy)localObject).type = this.opType;
    ((axy)localObject).saV = new com.tencent.mm.bk.b(paramb.getBuffer());
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneOpenIMOPLog", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opType:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.opType) });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 806;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/openim/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */