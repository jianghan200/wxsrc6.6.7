package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbz;
import com.tencent.mm.protocal.c.bca;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public bbz kru = null;
  private bca krv = null;
  
  public h(int paramInt, long paramLong1, long paramLong2)
  {
    b.a locala = new b.a();
    locala.dIG = new bbz();
    locala.dIH = new bca();
    locala.dIF = 824;
    locala.uri = "/cgi-bin/micromsg-bin/pstnheartbeat";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    long l = System.currentTimeMillis();
    this.kru = ((bbz)this.diG.dID.dIL);
    this.kru.rxG = paramInt;
    this.kru.rxH = paramLong1;
    this.kru.seh = paramLong2;
    this.kru.see = l;
    x.d("MicroMsg.NetSceneIPCallHeartBeat", "heartbeat, roomId: %d, roomKey: %d, callSeq: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(l) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallHeartBeat", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krv = ((bca)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 824;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */