package com.tencent.mm.ac;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apq;
import com.tencent.mm.protocal.c.apr;
import com.tencent.mm.sdk.platformtools.x;

public final class u
  extends l
  implements k
{
  public String dMD;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public u(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new apq();
    ((b.a)localObject).dIH = new apr();
    ((b.a)localObject).uri = "/cgi-bin/mmkf-bin/kfgetbindlist";
    ((b.a)localObject).dIF = 674;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (apq)this.diG.dID.dIL;
    ((apq)localObject).rSp = paramString1;
    ((apq)localObject).rSq = paramString2;
    this.dMD = paramString1;
  }
  
  public final apr MT()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (apr)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneKFGetBindList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneKFGetBindList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 674;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ac/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */