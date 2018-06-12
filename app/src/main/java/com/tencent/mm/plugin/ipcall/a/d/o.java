package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bck;
import com.tencent.mm.protocal.c.bcl;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ;
  public bck krI = null;
  public bcl krJ = null;
  
  public o(int paramInt1, long paramLong1, int paramInt2, long paramLong2, boolean paramBoolean)
  {
    b.a locala = new b.a();
    locala.dIG = new bck();
    locala.dIH = new bcl();
    locala.dIF = 819;
    locala.uri = "/cgi-bin/micromsg-bin/pstnsync";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    long l = System.currentTimeMillis();
    this.krI = ((bck)this.diG.dID.dIL);
    this.krI.seC = com.tencent.mm.model.q.GF();
    this.krI.rxG = paramInt1;
    this.krI.rxH = paramLong1;
    this.krI.see = l;
    this.krI.seD = paramInt2;
    this.krI.seh = paramLong2;
    if (!paramBoolean) {}
    for (this.krI.seE = 0;; this.krI.seE = 1)
    {
      x.i("MicroMsg.NetSceneIPCallSync", "roomId: %d, roomKey: %d, syncKey: %d, callSeq: %d,dataFlag: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Integer.valueOf(this.krI.seE), Long.valueOf(l) });
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallSync", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krJ = ((bcl)((b)paramq).dIE.dIL);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 819;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */