package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.aiz;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bxa;

public final class f
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public aiz mOJ;
  public byte[] mOK;
  
  public f(byte[] paramArrayOfByte)
  {
    this.mOK = paramArrayOfByte;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    aiy localaiy = new aiy();
    if (this.mOK != null) {
      localaiy.rLH = ab.O(this.mOK).siK;
    }
    parame1.dIG = localaiy;
    this.mOJ = new aiz();
    parame1.dIH = this.mOJ;
    parame1.uri = "/cgi-bin/mmbiz-bin/getuserauthlist";
    parame1.dIF = 1146;
    parame1.dII = 0;
    parame1.dIJ = 0;
    return a(parame, parame1.KT(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.mOJ = ((aiz)((b)paramq).dIE.dIL);
    if (this.mOJ.rvs != null)
    {
      paramInt3 = this.mOJ.rvs.bMH;
      paramString = this.mOJ.rvs.bMI;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1146;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */