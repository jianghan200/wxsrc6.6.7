package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.wh;
import com.tencent.mm.protocal.c.wi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String nHM = "";
  
  public b(String paramString)
  {
    this.nHM = paramString;
    b.a locala = new b.a();
    locala.dIG = new wh();
    locala.dIH = new wi();
    locala.uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_favofficialitem";
    locala.dIF = 2874;
    this.diG = locala.KT();
    ((wh)this.diG.dID.dIL).rBB = paramString;
    x.i("MicroMsg.NetSceneFavOfficialItem", "Req: item_buff[%s]", new Object[] { paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneFavOfficialItem", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2874;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */