package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awh;
import com.tencent.mm.protocal.c.awi;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  private int djw = 1;
  private byte[] mFL;
  private String mFM = "en";
  private String mFN = "zh_CN";
  private int mFO;
  
  public e(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt)
  {
    this.mFL = paramArrayOfByte;
    this.djw = 1;
    this.mFM = paramString1;
    this.mFN = paramString2;
    this.mFO = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new awh();
    parame1.dIH = new awi();
    parame1.uri = "/cgi-bin/micromsg-bin/ocrtranslation";
    parame1.dIF = 392;
    parame1.dII = 199;
    parame1.dIJ = 1000000199;
    this.diG = parame1.KT();
    parame1 = (awh)this.diG.dID.dIL;
    parame1.rjz = ((int)bi.VF() & 0x7FFFFFFF);
    parame1.rjA = new bhy().bq(this.mFL);
    parame1.rjD = this.djw;
    parame1.rZC = this.mFM;
    parame1.rZD = this.mFN;
    parame1.rjE = this.mFO;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    paramq = (awh)((b)paramq).dID.dIL;
    if ((paramq.rjz <= 0) || (bi.oW(paramq.rZD)) || (bi.oW(paramq.rZC)) || (paramq.rjD < 0) || (paramq.rjA == null) || (paramq.rjA.siI <= 0))
    {
      x.e("MicroMsg.scanner.NetSceneOCRTranslate", "ERR: Security Check Failed");
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.scanner.NetSceneOCRTranslate", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 392;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */