package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ij;
import com.tencent.mm.protocal.c.ik;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends l
  implements k
{
  public int bJr;
  public int bJs;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public boolean mFP = false;
  
  public f(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ij();
    ((b.a)localObject).dIH = new ik();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
    ((b.a)localObject).dIF = 1061;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ij)this.diG.dID.dIL;
    ((ij)localObject).hcE = paramInt1;
    ((ij)localObject).rjy = paramString;
    ((ij)localObject).otY = 1;
    this.bJr = paramInt2;
    this.bJs = paramInt3;
    x.d("MicroMsg.scanner.NetSceneScanBarcode", "NetSceneScanBarcode, type: %s, barcode: %s, scene: %s, codetype: %s, codeVersion: %s", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    paramq = (ij)((b)paramq).dID.dIL;
    if ((paramq.hcE < 0) || (paramq.rjy == null) || (paramq.rjy.length() <= 0))
    {
      x.e("MicroMsg.scanner.NetSceneScanBarcode", "securityVerificationChecked failed, Type = " + paramq.hcE + ", Barcode = %s" + paramq.rjy);
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.scanner.NetSceneScanBarcode", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final ik bsb()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (ik)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int getType()
  {
    return 1061;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */