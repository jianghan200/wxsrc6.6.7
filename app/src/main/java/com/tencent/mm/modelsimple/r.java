package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.bdv;

public final class r
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int efX = 1;
  public int efY;
  
  public r(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new bdu();
    locala.dIH = new bdv();
    locala.uri = "/cgi-bin/micromsg-bin/queryhaspasswd";
    locala.dIF = 255;
    locala.dII = 132;
    locala.dIJ = 1000000132;
    this.diG = locala.KT();
    ((bdu)this.diG.dID.dIL).otY = paramInt;
    this.efY = paramInt;
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
    return 255;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelsimple/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */