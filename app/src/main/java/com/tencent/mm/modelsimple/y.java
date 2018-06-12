package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bmg;
import com.tencent.mm.protocal.c.bmh;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class y
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public y(String paramString1, String paramString2, int paramInt, bhy parambhy)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bmg();
    ((b.a)localObject).dIH = new bmh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/newsetpasswd";
    ((b.a)localObject).dIF = 383;
    ((b.a)localObject).dII = 180;
    ((b.a)localObject).dIJ = 1000000180;
    this.diG = ((b.a)localObject).KT();
    localObject = (bmg)this.diG.dID.dIL;
    ((bmg)localObject).iwG = bi.WN(paramString1);
    ((bmg)localObject).rwj = paramString2;
    ((bmg)localObject).skA = paramInt;
    ((bmg)localObject).res = parambhy;
    x.d("MicroMsg.NetSceneSetPwd", "summersetpwd md5:%s ticket:%s, type:%d, authkey:%s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), bi.bB(ab.a(parambhy)) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSetPwd", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 383;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelsimple/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */