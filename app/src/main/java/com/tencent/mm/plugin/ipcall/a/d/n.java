package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bci;
import com.tencent.mm.protocal.c.bcj;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public bci krG = null;
  private bcj krH = null;
  
  public n(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    b.a locala = new b.a();
    locala.dIG = new bci();
    locala.dIH = new bcj();
    locala.dIF = 723;
    locala.uri = "/cgi-bin/micromsg-bin/pstnshutdown";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    long l = System.currentTimeMillis();
    this.krG = ((bci)this.diG.dID.dIL);
    this.krG.jTv = com.tencent.mm.model.q.GF();
    this.krG.rxG = paramInt1;
    this.krG.rxH = paramLong1;
    this.krG.seh = paramLong2;
    this.krG.hcd = paramInt2;
    this.krG.see = l;
    x.i("MicroMsg.NetSceneIPCallShutDown", "roomId: %d, roomKey: %d, callSeq: %d, status: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2), Long.valueOf(l) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallShutDown", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krH = ((bcj)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 723;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */