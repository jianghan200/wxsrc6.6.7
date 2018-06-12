package com.tencent.mm.plugin.bottle.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.aax;
import com.tencent.mm.protocal.c.aay;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public d()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aax();
    ((b.a)localObject).dIH = new aay();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbottlecount";
    ((b.a)localObject).dIF = 152;
    ((b.a)localObject).dII = 49;
    ((b.a)localObject).dIJ = 1000000049;
    ((b.a)localObject).dIK = false;
    this.diG = ((b.a)localObject).KT();
    localObject = (aax)this.diG.dID.dIL;
    ((aax)localObject).hbL = com.tencent.mm.model.q.GF();
    ((aax)localObject).rGb = ((int)bi.VE());
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramq = (aay)this.diG.dIE.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      c.nh(paramq.rGd);
      c.ng(paramq.rGc);
    }
    for (;;)
    {
      x.d("MicroMsg.NetSceneGetBottleCount", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3 + " ret:" + paramq.rfn + " pickCnt:" + paramq.rGd + " throwCnt:" + paramq.rGc);
      this.diJ.a(0, paramq.rfn, paramString, this);
      return;
      if ((paramq.rfn == 63534) || (paramq.rfn == -56))
      {
        c.nh(0);
        c.ng(0);
      }
    }
  }
  
  public final int getType()
  {
    return 152;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */