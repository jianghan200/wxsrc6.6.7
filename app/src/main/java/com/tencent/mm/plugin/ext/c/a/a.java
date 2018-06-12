package com.tencent.mm.plugin.ext.c.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private b diG;
  public com.tencent.mm.ab.e diJ;
  public int iKY = -1;
  public String mUrl = null;
  
  public a(String paramString, int paramInt1, int paramInt2)
  {
    this.mUrl = paramString;
    b.a locala = new b.a();
    locala.dIG = new nk();
    locala.dIH = new nl();
    locala.uri = "/cgi-bin/micromsg-bin/checkcamerascan";
    locala.dIF = 782;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    x.i("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: checking url: %s", new Object[] { paramString });
    paramString = (nk)this.diG.dID.dIL;
    paramString.URL = this.mUrl;
    paramString.rrv = paramInt1;
    paramString.rrw = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: on get camera url end. errType; %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (nl)((b)paramq).dIE.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.iKY = paramq.hcE;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 782;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ext/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */