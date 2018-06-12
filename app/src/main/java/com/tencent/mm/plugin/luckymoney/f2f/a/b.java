package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.aw;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.vd;
import com.tencent.mm.protocal.c.ve;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  public int amount;
  public int bJL;
  public int ceS;
  private com.tencent.mm.ab.e diJ;
  private com.tencent.mm.ab.b eAN;
  public String kLZ;
  private vd kNb;
  private ve kNc;
  public int kNd;
  public String kNe;
  public bfi kNf;
  public int kNg;
  public String kNh;
  public String kNi;
  public String kNj;
  public int kNk;
  
  public b(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new vd();
    locala.dIH = new ve();
    locala.dIF = 1997;
    locala.dII = 0;
    locala.dIJ = 0;
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/ffopenwxhb";
    this.eAN = locala.KT();
    this.kNb = ((vd)this.eAN.dID.dIL);
    this.kNb.ixy = paramString;
    paramString = i.bOL();
    if (paramString != null)
    {
      this.kNb.csL = paramString.csL;
      this.kNb.csK = paramString.csK;
      this.kNb.ryw = paramString.raZ;
      this.kNb.ryx = paramString.rba;
      this.kNb.ryy = paramString.raY;
      this.kNb.ryz = paramString.latitude;
      this.kNb.ryA = paramString.longitude;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.kNc = ((ve)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("NetSceneF2FLuckyMoneyOpen", "errType %d, retCode %d, retMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.kNc.hUm), this.kNc.hUn });
    this.kLZ = this.kNc.kLZ;
    this.ceS = this.kNc.ceS;
    this.kNd = this.kNc.ceT;
    this.bJL = this.kNc.bJL;
    this.kNe = this.kNc.kQg;
    this.amount = this.kNc.amount;
    this.kNf = this.kNc.ryB;
    this.kNg = this.kNc.kNg;
    this.kNh = this.kNc.kNh;
    this.kNi = this.kNc.kNi;
    this.kNj = this.kNc.kNj;
    this.kNk = this.kNc.kNk;
    if (this.diJ != null) {
      this.diJ.a(paramInt2, this.kNc.hUm, this.kNc.hUn, this);
    }
  }
  
  public final int getType()
  {
    return 1997;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/f2f/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */