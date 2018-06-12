package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bjy;
import com.tencent.mm.protocal.c.bjz;
import com.tencent.mm.protocal.c.bxa;

public final class i
  extends l
  implements k
{
  private String bHt;
  private com.tencent.mm.ab.e diJ;
  public byte[] mOK;
  public bjz mON;
  
  public i(String paramString)
  {
    this.bHt = paramString;
  }
  
  public i(byte[] paramArrayOfByte)
  {
    this.mOK = paramArrayOfByte;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    bjy localbjy = new bjy();
    localbjy.bHt = this.bHt;
    if (this.mOK != null) {
      localbjy.rLH = ab.O(this.mOK).siK;
    }
    parame1.dIG = localbjy;
    parame1.dIH = new bjz();
    parame1.dIF = 1169;
    parame1.uri = "/cgi-bin/mmbiz-bin/searchuserauth";
    parame1.dII = 0;
    parame1.dIJ = 0;
    return a(parame, parame1.KT(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.mON = ((bjz)((b)paramq).dIE.dIL);
    paramInt1 = this.mON.rvs.bMH;
    paramString = this.mON.rvs.bMI;
    this.diJ.a(paramInt2, paramInt1, paramString, this);
  }
  
  public final int getType()
  {
    return 1169;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */