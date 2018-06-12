package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abp;
import com.tencent.mm.protocal.c.abq;
import com.tencent.mm.storage.aa.a;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  public String hym = "";
  
  public b(double paramDouble1, double paramDouble2, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new abp();
    ((b.a)localObject).dIH = new abq();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getcardshomepage";
    ((b.a)localObject).dIF = 1164;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (abp)this.diG.dID.dIL;
    ((abp)localObject).latitude = paramDouble1;
    ((abp)localObject).longitude = paramDouble2;
    ((abp)localObject).hym = paramString;
    ((abp)localObject).rGm = ((String)g.Ei().DT().get(aa.a.sPU, ""));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetCardsHomePageLayout", "red_buff:" + ((abp)localObject).rGm);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetCardsHomePageLayout", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1164), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (abq)this.diG.dIE.dIL;
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetCardsHomePageLayout", "json:" + paramq.hwU);
      this.hwU = paramq.hwU;
      this.hym = paramq.hym;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1164;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */