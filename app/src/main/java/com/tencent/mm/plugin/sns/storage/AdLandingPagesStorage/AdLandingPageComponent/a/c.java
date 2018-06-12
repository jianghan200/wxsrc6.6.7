package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adw;
import com.tencent.mm.protocal.c.adx;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.awr;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  public String bVc;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new awq();
    locala.dIH = new awr();
    locala.uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_officialsync";
    locala.dIF = 2721;
    this.diG = locala.KT();
    ((awq)this.diG.dID.dIL).rZR = paramString;
    x.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: syncBuffer:" + paramString);
  }
  
  public c(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new adw();
    ((b.a)localObject).dIH = new adx();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecanvasinfo";
    ((b.a)localObject).dIF = 1337;
    this.diG = ((b.a)localObject).KT();
    localObject = (adw)this.diG.dID.dIL;
    ((adw)localObject).jQb = paramString1;
    ((adw)localObject).rIj = paramString2;
    ((adw)localObject).rIk = paramString3;
    x.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: shareType:" + paramString2 + " sharedAppId :" + paramString1);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString + " sceneType: " + this.diG.dIF);
    if (this.diG.dIF == 1337) {
      this.bVc = ((adx)((b)paramq).dIE.dIL).rFb;
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      if (this.diG.dIF == 2721) {
        this.bVc = ((awr)((b)paramq).dIE.dIL).rZS;
      }
    }
  }
  
  public final int getType()
  {
    return this.diG.dIF;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */