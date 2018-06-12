package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.bey;
import com.tencent.mm.protocal.c.bez;
import com.tencent.mm.protocal.c.bfg;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public h(com.tencent.mm.plugin.address.d.b paramb)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bfg();
    ((b.a)localObject).dIH = new bfh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoupdate";
    ((b.a)localObject).dIF = 418;
    ((b.a)localObject).dII = 203;
    ((b.a)localObject).dIJ = 1000000203;
    this.diG = ((b.a)localObject).KT();
    localObject = (bfg)this.diG.dID.dIL;
    ((bfg)localObject).sgs = new bez();
    ((bfg)localObject).sgs.id = paramb.id;
    ((bfg)localObject).sgs.sgz = new bhz().VO(bi.aG(paramb.eXZ, ""));
    ((bfg)localObject).sgs.sgx = new bhz().VO(bi.aG(paramb.eXX, ""));
    ((bfg)localObject).sgs.sgC = new bhz().VO(bi.aG(paramb.eYc, ""));
    ((bfg)localObject).sgs.sgA = new bhz().VO(bi.aG(paramb.eYa, ""));
    ((bfg)localObject).sgs.sgD = new bhz().VO(bi.aG(paramb.eYd, ""));
    ((bfg)localObject).sgs.sgE = new bhz().VO(bi.aG(paramb.eYe, ""));
    ((bfg)localObject).sgs.sgy = new bhz().VO(bi.aG(paramb.eXY, ""));
    ((bfg)localObject).sgs.sgB = new bhz().VO(bi.aG(paramb.eYb, ""));
    ((bfg)localObject).sgs.sgF = new bhz().VO(bi.aG(paramb.eYf, ""));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneRcptInfoUpdate", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bfh)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if (paramq.sgt.sgw != null)
      {
        x.d("MicroMsg.NetSceneRcptInfoUpdate", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.sgt.sgw.size());
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
    return 418;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/address/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */