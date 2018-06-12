package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ch;
import com.tencent.mm.protocal.c.jj;
import com.tencent.mm.protocal.c.jk;
import com.tencent.mm.sdk.platformtools.x;
import d.a.a.c;
import java.util.LinkedList;

public final class j
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public jk mxm;
  
  public j(ch paramch, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new jj();
    ((b.a)localObject).dIH = new jk();
    ((b.a)localObject).dIF = 2504;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2fsucpage";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.eAN = ((b.a)localObject).KT();
    localObject = (jj)this.eAN.dID.dIL;
    ((jj)localObject).rkA = paramch;
    ((jj)localObject).rkM = paramString;
    x.i("MicroMsg.NetSceneBusiF2fSucpage", "NetSceneBusiF2fSucpage suc_page_extend %s req %s", new Object[] { paramString, a.a(paramch) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBusiF2fSucpage", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxm = ((jk)((b)paramq).dIE.dIL);
    paramq = new StringBuffer();
    if (this.mxm.pqb != null)
    {
      paramq.append("response: " + this.mxm.rkZ);
      paramq.append("is_show_btn: " + this.mxm.pqb.rxT);
      if (this.mxm.pqb.rxS != null) {
        paramq.append("single_exposure_info_list " + this.mxm.pqb.rxS.size());
      }
    }
    x.i("MicroMsg.NetSceneBusiF2fSucpage", "ret_code: %s, ret_msg: %s %s", new Object[] { Integer.valueOf(this.mxm.hwV), this.mxm.hwW, paramq.toString() });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2504;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */