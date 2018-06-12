package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahf;
import com.tencent.mm.protocal.c.ahg;

public final class n
  extends l
  implements k
{
  public final b dZf;
  private com.tencent.mm.ab.e diJ;
  
  public n()
  {
    b.a locala = new b.a();
    locala.dIG = new ahf();
    locala.dIH = new ahg();
    locala.uri = "/cgi-bin/micromsg-bin/getremind";
    locala.dIF = 866;
    locala.dII = 0;
    locala.dIJ = 0;
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
    return 866;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsimple/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */