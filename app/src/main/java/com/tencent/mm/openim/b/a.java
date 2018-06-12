package com.tencent.mm.openim.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ca;
import com.tencent.mm.protocal.c.cb;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String eup;
  
  public a(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ca();
    ((b.a)localObject).dIH = new cb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addopenimcontact";
    ((b.a)localObject).dIF = 667;
    this.diG = ((b.a)localObject).KT();
    this.eup = paramString1;
    localObject = (ca)this.diG.dID.dIL;
    ((ca)localObject).eup = paramString1;
    ((ca)localObject).rcw = paramString2;
    x.i("MicroMsg.NetSceneAddOpenIMContact", "tp_username: %s, antispam_ticket:%s", new Object[] { paramString1, paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAddOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.eup });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 667;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/openim/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */