package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.auv;
import com.tencent.mm.protocal.c.auw;
import com.tencent.mm.protocal.c.bxa;

public final class h
  extends l
  implements k
{
  private final String bPS;
  private com.tencent.mm.ab.e diJ;
  public final String mOL;
  public final int mOM;
  private final int scene;
  
  public h(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.bPS = paramString1;
    this.mOL = paramString2;
    this.mOM = paramInt1;
    this.scene = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    auv localauv = new auv();
    localauv.bPS = this.bPS;
    localauv.rXM = this.mOL;
    localauv.rXN = this.mOM;
    parame1.dIG = localauv;
    parame1.uri = "/cgi-bin/mmbiz-bin/moduserauth";
    parame1.dIH = new auw();
    parame1.dIF = 1144;
    parame1.dII = 0;
    parame1.dIJ = 0;
    return a(parame, parame1.KT(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramString = (auw)((b)paramq).dIE.dIL;
    this.diJ.a(paramInt2, paramString.rvs.bMH, paramString.rvs.bMI, this);
  }
  
  public final int getType()
  {
    return 1144;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */