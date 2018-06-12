package com.tencent.mm.modelmulti;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aep;
import com.tencent.mm.protocal.c.aeq;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  public String content = "";
  public int dZg = 0;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String title = "";
  
  public e(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new aep();
    locala.dIH = new aeq();
    locala.uri = "/cgi-bin/micromsg-bin/getinvitefriendsmsg";
    locala.dIF = 1803;
    this.diG = locala.KT();
    ((aep)this.diG.dID.dIL).rID = paramInt;
    this.dZg = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneGetInviteFriendsMsg", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetInviteFriendsMsg", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aeq)this.diG.dIE.dIL;
      this.title = paramq.rIE;
      this.content = paramq.rIF;
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1803;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelmulti/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */