package com.tencent.mm.openim.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkq;
import com.tencent.mm.protocal.c.bkr;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private String eup;
  
  public f(String paramString1, String paramString2, String paramString3)
  {
    this.eup = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bkq();
    ((b.a)localObject).dIH = new bkr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendopenimverifyrequest";
    ((b.a)localObject).dIF = 243;
    this.diG = ((b.a)localObject).KT();
    localObject = (bkq)this.diG.dID.dIL;
    ((bkq)localObject).eup = paramString1;
    ((bkq)localObject).skb = paramString2;
    ((bkq)localObject).rcw = paramString3;
    x.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "init user:%s anti:%s", new Object[] { paramString1, paramString3 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.eup });
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      x.e("MicroMsg.NetSceneSendOpenIMVerifyRequest", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 243;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/openim/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */