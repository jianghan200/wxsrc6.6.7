package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.beu;
import com.tencent.mm.protocal.c.bev;
import com.tencent.mm.protocal.c.bey;
import com.tencent.mm.protocal.c.bez;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(com.tencent.mm.plugin.address.d.b paramb)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new beu();
    ((b.a)localObject).dIH = new bev();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoadd";
    ((b.a)localObject).dIF = 415;
    ((b.a)localObject).dII = 200;
    ((b.a)localObject).dIJ = 1000000200;
    this.diG = ((b.a)localObject).KT();
    localObject = (beu)this.diG.dID.dIL;
    ((beu)localObject).sgs = new bez();
    ((beu)localObject).sgs.sgz = new bhz().VO(bi.aG(paramb.eXZ, ""));
    ((beu)localObject).sgs.sgx = new bhz().VO(bi.aG(paramb.eXX, ""));
    ((beu)localObject).sgs.sgC = new bhz().VO(bi.aG(paramb.eYc, ""));
    ((beu)localObject).sgs.sgA = new bhz().VO(bi.aG(paramb.eYa, ""));
    ((beu)localObject).sgs.sgD = new bhz().VO(bi.aG(paramb.eYd, ""));
    ((beu)localObject).sgs.sgE = new bhz().VO(bi.aG(paramb.eYe, ""));
    ((beu)localObject).sgs.sgy = new bhz().VO(bi.aG(paramb.eXY, ""));
    ((beu)localObject).sgs.sgB = new bhz().VO(bi.aG(paramb.eYb, ""));
    ((beu)localObject).sgs.sgF = new bhz().VO(bi.aG(paramb.eYf, ""));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneRcptInfoAdd", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bev)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if (paramq.sgt.sgw != null)
      {
        x.d("MicroMsg.NetSceneRcptInfoAdd", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.sgt.sgw.size());
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
    return 415;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/address/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */