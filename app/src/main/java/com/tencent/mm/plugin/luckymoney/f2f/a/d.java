package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.aw;
import com.tencent.mm.protocal.c.vf;
import com.tencent.mm.protocal.c.vg;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public String ixy;
  public String kLZ;
  private vf kNo;
  private vg kNp;
  public String kNq;
  public String kNr;
  public int kNs;
  
  public d()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new vf();
    ((b.a)localObject).dIH = new vg();
    ((b.a)localObject).dIF = 1990;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/ffquerydowxhb";
    this.eAN = ((b.a)localObject).KT();
    this.kNo = ((vf)this.eAN.dID.dIL);
    this.kNo.timestamp = (System.currentTimeMillis() / 1000L);
    localObject = i.bOL();
    if (localObject != null)
    {
      this.kNo.latitude = ((aw)localObject).latitude;
      this.kNo.longitude = ((aw)localObject).longitude;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("NetSceneF2FLuckyMoneyQuery", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kNp = ((vg)((b)paramq).dIE.dIL);
    this.kLZ = this.kNp.kLZ;
    this.ixy = this.kNp.ixy;
    this.kNs = this.kNp.ryC;
    this.kNq = this.kNp.kNq;
    this.kNr = this.kNp.kNr;
    if (this.diJ != null) {
      this.diJ.a(paramInt2, this.kNp.hUm, this.kNp.hUn, this);
    }
  }
  
  public final int getType()
  {
    return 1990;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/f2f/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */