package com.tencent.mm.plugin.sport.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sport.b.c;
import com.tencent.mm.protocal.c.aia;
import com.tencent.mm.protocal.c.aib;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  aia ooU;
  aib ooV;
  c ooW;
  
  public d(long paramLong1, long paramLong2, c paramc)
  {
    this.ooW = paramc;
    paramc = new b.a();
    paramc.dIF = 1734;
    paramc.uri = "/cgi-bin/mmoc-bin/hardware/getsteplist";
    paramc.dIG = new aia();
    paramc.dIH = new aib();
    this.dZf = paramc.KT();
    this.ooU = ((aia)this.dZf.dID.dIL);
    this.ooU.rvI = ((int)(paramLong1 / 1000L));
    this.ooU.rvJ = ((int)(paramLong2 / 1000L));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Sport.NetSceneGetStepList", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ooV = ((aib)this.dZf.dIE.dIL);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1734;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sport/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */