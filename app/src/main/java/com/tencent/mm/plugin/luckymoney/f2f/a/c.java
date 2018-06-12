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
import com.tencent.mm.protocal.c.vh;
import com.tencent.mm.protocal.c.vi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;

public final class c
  extends l
  implements k, d
{
  public String bOd;
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public String kLZ;
  private vh kNl;
  private vi kNm;
  public String kNn;
  
  public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new vh();
    ((b.a)localObject).dIH = new vi();
    ((b.a)localObject).dIF = 1970;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/ffrequestwxhb";
    this.eAN = ((b.a)localObject).KT();
    this.kNl = ((vh)this.eAN.dID.dIL);
    this.kNl.hUg = paramInt1;
    this.kNl.lTc = paramInt2;
    this.kNl.kPI = paramInt3;
    this.kNl.ryD = paramInt4;
    localObject = i.bOL();
    if (localObject != null)
    {
      this.kNl.latitude = ((aw)localObject).latitude;
      this.kNl.longitude = ((aw)localObject).longitude;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("NetSceneF2FLuckyMoneyPrepare", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kNm = ((vi)((b)paramq).dIE.dIL);
    this.bOd = this.kNm.kRq;
    this.kLZ = this.kNm.kLZ;
    this.kNn = this.kNm.kRx;
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1970;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/f2f/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */