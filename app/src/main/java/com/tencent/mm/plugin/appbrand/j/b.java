package com.tencent.mm.plugin.appbrand.j;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.cdg;
import com.tencent.mm.protocal.c.cdh;
import com.tencent.mm.protocal.c.cdi;
import com.tencent.mm.storage.aa.a;
import java.util.Locale;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b dFA;
  private com.tencent.mm.ab.e doG;
  private cdh gkz;
  
  public b()
  {
    b.a locala = new b.a();
    locala.dIG = new cdg();
    locala.dIH = new cdh();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchtitle";
    locala.dIF = 1170;
    locala.dII = 0;
    locala.dIJ = 0;
    this.dFA = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetWeAppSearchTitle", "doScene");
    this.doG = parame1;
    return a(parame, this.dFA, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetWeAppSearchTitle", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.gkz = ((cdh)this.dFA.dIE.dIL);
    if (this.doG != null) {
      this.doG.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.gkz.syT == null) {
      return;
    }
    paramString = g.Ei().DT();
    paramString.a(aa.a.sVz, Locale.getDefault().getLanguage());
    paramString.a(aa.a.sVA, this.gkz.syT.ksB);
    paramString.a(aa.a.sVB, this.gkz.syT.syS);
    paramString.a(aa.a.sVC, Long.valueOf(System.currentTimeMillis()));
  }
  
  public final int getType()
  {
    return 1170;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */