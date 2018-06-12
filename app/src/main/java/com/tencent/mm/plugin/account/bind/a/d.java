package com.tencent.mm.plugin.account.bind.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.buj;
import com.tencent.mm.protocal.c.buk;

public final class d
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public d(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new buj();
    locala.dIH = new buk();
    locala.uri = "/cgi-bin/micromsg-bin/unbindqq";
    locala.dIF = 253;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((buj)this.diG.dID.dIL).rwj = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 253;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/bind/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */