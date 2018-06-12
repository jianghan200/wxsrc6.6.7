package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.vb;
import com.tencent.mm.protocal.c.vc;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private vb kMZ;
  private vc kNa;
  
  public a(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new vb();
    locala.dIH = new vc();
    locala.dIF = 1987;
    locala.dII = 0;
    locala.dIJ = 0;
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/ffclearwxhb";
    this.eAN = locala.KT();
    this.kMZ = ((vb)this.eAN.dID.dIL);
    this.kMZ.kLZ = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.kNa = ((vc)((b)paramq).dIE.dIL);
    x.i("NetSceneF2FLuckyMoneyClear", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.kNa.hUm), this.kNa.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, this.kNa.hUm, this.kNa.hUn, this);
    }
  }
  
  public final int getType()
  {
    return 1987;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/f2f/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */