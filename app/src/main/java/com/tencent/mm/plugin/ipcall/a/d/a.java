package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbv;
import com.tencent.mm.protocal.c.bbw;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public bbv krf = null;
  private bbw krg = null;
  
  public a(int paramInt1, long paramLong1, String paramString1, String paramString2, int paramInt2, long paramLong2)
  {
    b.a locala = new b.a();
    locala.dIG = new bbv();
    locala.dIH = new bbw();
    locala.dIF = 843;
    locala.uri = "/cgi-bin/micromsg-bin/pstncancelinvite";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    long l = System.currentTimeMillis();
    this.krf = ((bbv)this.diG.dID.dIL);
    this.krf.rxG = paramInt1;
    this.krf.rxH = paramLong1;
    this.krf.jTu = paramString1;
    this.krf.see = l;
    this.krf.sef = paramInt2;
    this.krf.seg = paramString2;
    this.krf.seh = paramLong2;
    x.d("MicroMsg.NetSceneIPCallCancel", "roomId: %d, roomKey: %d, toUsername: %s, timestamp: %d, inviteId: %d, phoneNumber: %s, callseq: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramString1, Long.valueOf(l), Integer.valueOf(paramInt2), paramString2, Long.valueOf(paramLong2) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallCancel", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krg = ((bbw)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 843;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */