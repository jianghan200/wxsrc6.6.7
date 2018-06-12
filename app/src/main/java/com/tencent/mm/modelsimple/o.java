package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.ahj;
import com.tencent.mm.protocal.c.ahk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public final b efk;
  
  public o()
  {
    b.a locala = new b.a();
    locala.dIG = new ahj();
    locala.dIH = new ahk();
    locala.uri = "/cgi-bin/micromsg-bin/getresourcecontrolinfo";
    locala.dIF = 725;
    locala.dII = 0;
    locala.dIJ = 0;
    this.efk = locala.KT();
    ((ahj)this.efk.dID.dIL).hcE = 0;
    x.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo type[%d], stack[%s]", new Object[] { Integer.valueOf(0), bi.cjd() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    h.mEJ.a(405L, 1L, 1L, true);
    return a(parame, this.efk, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      h.mEJ.a(405L, 2L, 1L, true);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 725;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelsimple/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */