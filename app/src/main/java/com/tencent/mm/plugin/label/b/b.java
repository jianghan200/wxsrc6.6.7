package com.tencent.mm.plugin.label.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.rb;
import com.tencent.mm.protocal.c.rc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String kAF = null;
  
  public b(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new rb();
    locala.dIH = new rc();
    locala.uri = "/cgi-bin/micromsg-bin/delcontactlabel";
    locala.dIF = 636;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.kAF = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    rb localrb = (rb)this.diG.dID.dIL;
    localrb.rvl = this.kAF;
    if ((this.kAF != null) && (!bi.oW(this.kAF)))
    {
      localrb.rvl = this.kAF;
      localrb.rvl = this.kAF;
      return a(parame, this.diG, this);
    }
    x.e("MicroMsg.Label.NetSceneDelContactLabel", "cpan[doScene] label id list is null.");
    parame1.a(3, -1, "[doScene]empty label is list.", this);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.Label.NetSceneDelContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 636;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/label/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */