package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mu;
import com.tencent.mm.protocal.c.mv;

public final class a
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mu();
    ((b.a)localObject).dIH = new mv();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo";
    ((b.a)localObject).dIF = 1210;
    this.diG = ((b.a)localObject).KT();
    localObject = (mu)this.diG.dID.dIL;
    ((mu)localObject).rqR = paramString2;
    ((mu)localObject).rqO = paramString1;
    ((mu)localObject).rqS = com.tencent.mm.sdk.platformtools.e.chv();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return this.diG.dIF;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */