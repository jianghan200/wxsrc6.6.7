package com.tencent.mm.plugin.account.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bks;
import com.tencent.mm.protocal.c.bkt;

public final class f
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  
  public f(bks parambks)
  {
    b.a locala = new b.a();
    locala.dIG = parambks;
    locala.dIH = new bkt();
    locala.uri = "/cgi-bin/micromsg-bin/sendphoto2fbwall";
    locala.dIF = 433;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
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
    return 433;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */