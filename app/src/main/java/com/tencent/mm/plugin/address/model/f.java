package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.bey;
import com.tencent.mm.protocal.c.bfc;
import com.tencent.mm.protocal.c.bfd;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.ab.l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int eXI = 0;
  
  public f(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new bfc();
    locala.dIH = new bfd();
    locala.uri = "/cgi-bin/micromsg-bin/rcptinforemove";
    locala.dIF = 416;
    locala.dII = 201;
    locala.dIJ = 1000000201;
    this.diG = locala.KT();
    this.eXI = paramInt;
    x.d("MicroMsg.NetSceneRcptInfoRemove", "remove Id " + paramInt);
    ((bfc)this.diG.dID.dIL).id = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneRcptInfoRemove", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bfd)((b)paramq).dIE.dIL;
      if (paramq.sgt.sgw != null)
      {
        x.d("MicroMsg.NetSceneRcptInfoRemove", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.sgt.sgw.size());
        a.Zv();
        a.Zx().q(paramq.sgt.sgw);
        a.Zv();
        a.Zx().Zz();
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 416;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/address/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */