package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agg;
import com.tencent.mm.protocal.c.agh;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String pjb = "";
  public boolean pjc = false;
  
  public f()
  {
    b.a locala = new b.a();
    locala.dIG = new agg();
    locala.dIH = new agh();
    locala.uri = "/cgi-bin/mmpay-bin/getpayuserduty";
    locala.dIF = 2541;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MircoMsg.NetSceneGetPayUserDuty", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (agh)((b)paramq).dIE.dIL;
    this.pjb = paramq.pjb;
    this.pjc = paramq.pjc;
    x.i("MircoMsg.NetSceneGetPayUserDuty", "duty_info %s need_agree_duty %s", new Object[] { this.pjb, Boolean.valueOf(this.pjc) });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2541;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */