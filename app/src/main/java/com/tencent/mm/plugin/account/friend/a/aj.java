package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.blc;
import com.tencent.mm.protocal.c.bld;

public final class aj
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public aj(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new blc();
    locala.dIH = new bld();
    locala.uri = "/cgi-bin/micromsg-bin/sendverifyemail";
    locala.dIF = 108;
    locala.dII = 43;
    locala.dIJ = 1000000043;
    this.diG = locala.KT();
    ((blc)this.diG.dID.dIL).rvi = new bhz().VO(paramString);
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
    return 108;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */