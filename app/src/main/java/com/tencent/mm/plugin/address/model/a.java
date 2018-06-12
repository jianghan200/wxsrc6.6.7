package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.sb;
import com.tencent.mm.protocal.c.sc;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new sb();
    ((b.a)localObject).dIH = new sc();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
    ((b.a)localObject).dIF = 1194;
    this.diG = ((b.a)localObject).KT();
    localObject = (sb)this.diG.dID.dIL;
    ((sb)localObject).rvy = "invoice_info";
    ((sb)localObject).group_id = paramInt;
    ((sb)localObject).source = 2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneDeleteUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      x.i("MicroMsg.NetSceneDeleteUserAutoFillInfo", "");
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1194;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/address/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */