package com.tencent.mm.plugin.webwx.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.uw;
import com.tencent.mm.protocal.c.ux;

public final class e
  extends l
  implements k
{
  public final b dZf;
  private com.tencent.mm.ab.e diJ;
  public boolean qma;
  
  public e(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.qma = paramBoolean;
    b.a locala = new b.a();
    uw localuw = new uw();
    ux localux = new ux();
    locala.dIG = localuw;
    locala.dIH = localux;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
    locala.dIF = 972;
    locala.dII = 0;
    locala.dIJ = 0;
    localuw.rya = paramString1;
    localuw.ryl = paramString2;
    localuw.ryn = paramBoolean;
    this.dZf = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 972;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webwx/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */