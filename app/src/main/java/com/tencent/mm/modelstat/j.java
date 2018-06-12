package com.tencent.mm.modelstat;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adk;
import com.tencent.mm.protocal.c.adl;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends l
  implements k
{
  private com.tencent.mm.ab.e doG;
  final com.tencent.mm.ab.b ejL;
  
  public j(com.tencent.mm.bk.b paramb)
  {
    b.a locala = new b.a();
    adk localadk = new adk();
    localadk.qZv = 0;
    localadk.rHQ = paramb;
    locala.dIG = localadk;
    locala.dIH = new adl();
    locala.uri = "/cgi-bin/mmbiz-bin/geteventsampleconf";
    locala.dIF = 1126;
    locala.dII = 0;
    locala.dIJ = 0;
    this.ejL = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneUpdateEventConfig", "start update event config");
    this.dJc = true;
    this.doG = parame1;
    return a(parame, this.ejL, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneUpdateEventConfig", "onGYNetEnd errType: %d, errCode: %d, errMsg %s, IReqResp %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq.toString() });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1126;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelstat/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */