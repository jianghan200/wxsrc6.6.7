package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajz;
import com.tencent.mm.protocal.c.aka;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ;
  private ajz krp = null;
  public aka krq = null;
  public boolean krr = true;
  
  public f(String paramString1, String paramString2)
  {
    if (bi.oW(paramString2))
    {
      this.krr = true;
      paramString2 = "";
    }
    for (;;)
    {
      b.a locala = new b.a();
      locala.dIG = new ajz();
      locala.dIH = new aka();
      locala.dIF = 929;
      locala.uri = "/cgi-bin/micromsg-bin/getwcoproductlist";
      locala.dII = 0;
      locala.dIJ = 0;
      this.diG = locala.KT();
      this.krp = ((ajz)this.diG.dID.dIL);
      this.krp.rMy = paramString1;
      this.krp.rMz = paramString2;
      x.i("MicroMsg.NetSceneIPCallGetProductList", "NetSceneIPCallGetProductList");
      return;
      this.krr = false;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallGetProductList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krq = ((aka)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 929;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */