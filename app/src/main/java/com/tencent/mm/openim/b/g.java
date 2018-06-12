package com.tencent.mm.openim.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bxr;
import com.tencent.mm.protocal.c.bxs;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String eup;
  
  public g(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bxr();
    ((b.a)localObject).dIH = new bxs();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyopenimcontact";
    ((b.a)localObject).dIF = 853;
    this.diG = ((b.a)localObject).KT();
    this.eup = paramString1;
    localObject = (bxr)this.diG.dID.dIL;
    ((bxr)localObject).eup = paramString1;
    ((bxr)localObject).stS = paramString2;
    x.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "tp_username: %s, verify_ticket:%s", new Object[] { paramString1, paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.eup });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 853;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/openim/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */