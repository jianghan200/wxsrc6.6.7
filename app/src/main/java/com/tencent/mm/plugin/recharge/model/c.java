package com.tencent.mm.plugin.recharge.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xh;
import com.tencent.mm.protocal.c.xi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  public String bTi;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  public String ioy;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.bTi = paramString2;
    this.ioy = paramString3;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new xh();
    ((b.a)localObject).dIH = new xi();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/flowdatarechargepreinquery";
    ((b.a)localObject).dIF = 1555;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (xh)this.diG.dID.dIL;
    ((xh)localObject).rDg = paramString1;
    ((xh)localObject).rhu = paramString2;
    ((xh)localObject).lPm = paramString3;
    ((xh)localObject).rDh = paramString4;
    ((xh)localObject).rDi = paramString5;
    ((xh)localObject).rwj = com.tencent.mm.plugin.wallet_core.model.mall.c.bPK().Pe(paramString1);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneFlowDataRechargePreinQuery", "errCode " + paramInt3 + ", errMsg " + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1555;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */