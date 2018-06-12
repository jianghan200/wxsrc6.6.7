package com.tencent.mm.openim.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afq;
import com.tencent.mm.protocal.c.afr;
import com.tencent.mm.protocal.c.axq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String eup;
  private String euq;
  public axq eur;
  private int ret;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    b.a locala = new b.a();
    locala.dIG = new afq();
    locala.dIH = new afr();
    locala.uri = "/cgi-bin/micromsg-bin/getopenimcontact";
    locala.dIF = 881;
    this.diG = locala.KT();
    this.eup = paramString1;
    this.euq = bi.aG(paramString2, "");
    x.i("MicroMsg.NetSceneGetOpenIMContact", "get openim username: %s, roomname: %s, ticket:%s", new Object[] { paramString1, this.euq, paramString3 });
    paramString2 = (afq)this.diG.dID.dIL;
    paramString2.eup = paramString1;
    paramString2.reg = this.euq;
    paramString2.bLe = paramString3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.eup });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (afr)this.diG.dIE.dIL;
    this.ret = paramq.rfn;
    this.eur = paramq.rJB;
    paramq = i.a(this.eur);
    x.i("MicroMsg.NetSceneGetOpenIMContact", "onGYNetEnd openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s", new Object[] { paramq.field_username, paramq.field_nickname, paramq.field_conRemark, Integer.valueOf(paramq.getSource()), Integer.valueOf(paramq.sex), paramq.field_openImAppid, paramq.cte, Integer.valueOf(paramq.ctd), Integer.valueOf(paramq.field_type), paramq.field_descWordingId });
    ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().S(paramq);
    ((com.tencent.mm.openim.a.b)g.l(com.tencent.mm.openim.a.b.class)).aD(this.eur.hva, this.eur.saS);
    i.b(this.eur);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 881;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/openim/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */