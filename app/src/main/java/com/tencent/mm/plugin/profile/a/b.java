package com.tencent.mm.plugin.profile.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bls;
import com.tencent.mm.protocal.c.blt;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public b(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bls();
    ((b.a)localObject).dIH = new blt();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/setbrandflag";
    ((b.a)localObject).dIF = 1363;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bls)this.diG.dID.dIL;
    ((bls)localObject).riK = paramString;
    ((bls)localObject).skw = paramInt;
    ((bls)localObject).skx = 4;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneSetBrandFlag", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneSetBrandFlag", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1363;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/profile/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */