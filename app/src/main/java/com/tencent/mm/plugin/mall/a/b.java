package com.tencent.mm.plugin.mall.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.age;
import com.tencent.mm.protocal.c.agf;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private com.tencent.mm.ab.b eAN;
  private age kYd;
  public agf kYe;
  
  public b()
  {
    b.a locala = new b.a();
    locala.dIG = new age();
    locala.dIH = new agf();
    locala.dIF = 1754;
    locala.uri = "/cgi-bin/mmpay-bin/tenpay/getpaymenu";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.kYd = ((age)this.eAN.dID.dIL);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneGetPayMenu", "doScene");
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetPayMenu", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kYe = ((agf)this.eAN.dIE.dIL);
      paramq = this.kYe.title;
      paramArrayOfByte = this.kYe.rJS;
      if (this.kYe.rJS == null) {
        break label132;
      }
    }
    label132:
    for (paramInt1 = this.kYe.rJS.size();; paramInt1 = 0)
    {
      x.i("MicroMsg.NetSceneGetPayMenu", "onGYNetEnd, title: %s, sectors: %s, sectors.size: %s", new Object[] { paramq, paramArrayOfByte, Integer.valueOf(paramInt1) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
  }
  
  public final int getType()
  {
    return 1754;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/mall/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */