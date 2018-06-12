package com.tencent.mm.modelmulti;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbf;
import com.tencent.mm.protocal.c.bbg;
import com.tencent.mm.protocal.c.bue;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.i.a;
import org.b.d.i;

public final class h
  extends l
  implements k
{
  private int dZg = 0;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public h(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bbf();
    ((b.a)localObject).dIH = new bbg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/postinvitefriendsmsg";
    ((b.a)localObject).dIF = 1804;
    this.diG = ((b.a)localObject).KT();
    bbf localbbf = (bbf)this.diG.dID.dIL;
    localbbf.rID = paramInt;
    localbbf.rIF = paramString;
    if ((paramInt & 0x10) > 0)
    {
      a locala = new a();
      localObject = new bue();
      if (locala.uFc == null) {
        break label173;
      }
      paramString = (String)localObject;
      if (!bi.oW(locala.uFc.token))
      {
        ((bue)localObject).srB = locala.uFc.token;
        ((bue)localObject).srC = locala.uFc.rWk;
      }
    }
    label173:
    for (paramString = (String)localObject;; paramString = null)
    {
      localbbf.sdt = paramString;
      this.dZg = paramInt;
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetScenePostInviteFriendsMsg", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetScenePostInviteFriendsMsg", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1804;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelmulti/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */