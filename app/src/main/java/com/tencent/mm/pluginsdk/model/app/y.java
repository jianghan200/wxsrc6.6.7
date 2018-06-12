package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.cu;
import com.tencent.mm.protocal.c.cv;

public final class y
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  int qAc;
  x qAd;
  
  public y(int paramInt, x paramx)
  {
    this.qAc = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cu();
    ((b.a)localObject).dIH = new cv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/appcenter";
    ((b.a)localObject).dIF = 452;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (cu)this.diG.dID.dIL;
    byte[] arrayOfByte = paramx.cbx();
    if (arrayOfByte != null) {
      ((cu)localObject).rcT = new bhy().bq(arrayOfByte);
    }
    ((cu)localObject).hcE = paramInt;
    this.qAd = paramx;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneAppCenter", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneAppCenter", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.qAd.bg(ab.a(((cv)this.diG.dIE.dIL).rcU));
    this.qAd.a(paramInt1, paramInt2, paramInt3, paramString, this.diG, paramArrayOfByte);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 452;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */