package com.tencent.mm.openim.b;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.protocal.c.bjp;
import com.tencent.mm.protocal.c.bjq;
import com.tencent.mm.protocal.c.bjr;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements com.tencent.mm.network.k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private String euv;
  public bjp euw;
  public String eux;
  
  public e(String paramString)
  {
    this.euv = paramString;
    b.a locala = new b.a();
    locala.dIG = new bjq();
    locala.dIH = new bjr();
    locala.uri = "/cgi-bin/micromsg-bin/searchopenimcontact";
    locala.dIF = 372;
    this.diG = locala.KT();
    x.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", new Object[] { paramString });
    ((bjq)this.diG.dID.dIL).sjD = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (paramInt3 == 63502)) {
        this.eux = ((bjr)this.diG.dIE.dIL).url;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.euw = ((bjr)this.diG.dIE.dIL).sjE;
    paramq = new j();
    paramq.username = this.euw.hbL;
    paramq.dHR = this.euw.rqZ;
    paramq.dHQ = this.euw.rra;
    paramq.bWA = -1;
    x.d("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd search setImageFlag %s b[%s] s[%s]", new Object[] { paramq.getUsername(), paramq.Kx(), paramq.Ky() });
    paramq.csA = 3;
    paramq.by(true);
    com.tencent.mm.aa.q.KH().a(paramq);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 372;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/openim/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */