package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apn;
import com.tencent.mm.protocal.c.apo;
import com.tencent.mm.sdk.platformtools.x;

public final class u
  extends l
  implements k
{
  private final b dZf;
  private com.tencent.mm.ab.e diJ;
  public Object tag;
  
  public u(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new apn();
    locala.dIH = new apo();
    locala.uri = "/cgi-bin/micromsg-bin/jumpemotiondetail";
    locala.dIF = 666;
    locala.dII = 0;
    locala.dIJ = 0;
    this.dZf = locala.KT();
    ((apn)this.dZf.dID.dIL).jPK = paramString;
  }
  
  public final apo Rt()
  {
    return (apo)this.dZf.dIE.dIL;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      x.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:net end ok");
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 666;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelsimple/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */