package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.il;
import com.tencent.mm.protocal.c.im;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  private int dHI;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  private int djw = 1;
  private byte[] mFL;
  private int mFO;
  private int offset;
  
  public g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.mFL = paramArrayOfByte;
    this.djw = 1;
    this.dHI = paramInt1;
    this.offset = 0;
    this.mFO = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new il();
    parame1.dIH = new im();
    parame1.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanimg";
    parame1.dIF = 1062;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    parame1 = (il)this.diG.dID.dIL;
    parame1.rjz = ((int)bi.VF() & 0x7FFFFFFF);
    parame1.rjA = new bhy().bq(this.mFL);
    parame1.rjB = this.dHI;
    parame1.rjC = this.offset;
    if (this.offset + this.mFL.length < this.dHI) {}
    for (parame1.rgC = 0;; parame1.rgC = 1)
    {
      parame1.rjD = this.djw;
      parame1.rjE = this.mFO;
      return a(parame, this.diG, this);
    }
  }
  
  protected final int a(q paramq)
  {
    paramq = (il)((b)paramq).dID.dIL;
    if ((paramq.rjz <= 0) || (paramq.rjD < 0) || (paramq.rjA == null) || (paramq.rjA.siI <= 0) || (paramq.rjB <= 0) || (paramq.rjC < 0) || (paramq.rjC + paramq.rjA.siI > paramq.rjB))
    {
      x.e("MicroMsg.scanner.NetSceneScanImage", "ERR: Security Check Failed, imageType = %s, totalLen = %s, offset = %s", new Object[] { Integer.valueOf(paramq.rjD), Integer.valueOf(paramq.rjB), Integer.valueOf(paramq.rjC) });
      if (paramq.rjA != null) {
        x.e("MicroMsg.scanner.NetSceneScanImage", "buffer length = %s", new Object[] { Integer.valueOf(paramq.rjA.siI) });
      }
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.scanner.NetSceneScanImage", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1062;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */