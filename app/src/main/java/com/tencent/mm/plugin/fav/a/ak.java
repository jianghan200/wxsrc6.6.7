package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adq;
import com.tencent.mm.protocal.c.adr;
import com.tencent.mm.sdk.platformtools.x;

public final class ak
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  
  public ak()
  {
    b.a locala = new b.a();
    locala.dIG = new adq();
    locala.dIH = new adr();
    locala.uri = "/cgi-bin/micromsg-bin/getfavinfo";
    locala.dIF = 438;
    locala.dII = 217;
    locala.dIJ = 1000000217;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetFavInfo", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (adr)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      x.v("MicroMsg.NetSceneGetFavInfo", "used:%d  total:%d  mxDown:%d  mxUp:%d  mxFile:%d", new Object[] { Long.valueOf(paramq.rcg), Long.valueOf(paramq.hcc), Integer.valueOf(paramq.rId), Integer.valueOf(paramq.rIc), Integer.valueOf(paramq.rIb) });
      b.dh(paramq.rcg);
      b.di(paramq.hcc);
      b.dk(paramq.rId);
      b.dl(paramq.rIc);
      b.dm(paramq.rIb);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 438;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/fav/a/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */