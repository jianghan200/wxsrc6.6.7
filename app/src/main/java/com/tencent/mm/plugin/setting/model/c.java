package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bxa;
import com.tencent.mm.protocal.c.rr;
import com.tencent.mm.protocal.c.rs;

public final class c
  extends l
  implements k
{
  public final String appId;
  private com.tencent.mm.ab.e diJ;
  private final int scene;
  
  public c(String paramString, int paramInt)
  {
    this.appId = paramString;
    this.scene = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    rr localrr = new rr();
    localrr.bPS = this.appId;
    localrr.cae = this.scene;
    parame1.dIG = localrr;
    parame1.uri = "/cgi-bin/mmbiz-bin/deluserauth";
    parame1.dIH = new rs();
    parame1.dIF = 1127;
    parame1.dII = 0;
    parame1.dIJ = 0;
    return a(parame, parame1.KT(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramString = (rs)((b)paramq).dIE.dIL;
    this.diJ.a(paramInt2, paramString.rvs.bMH, paramString.rvs.bMI, this);
  }
  
  public final int getType()
  {
    return 1127;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */