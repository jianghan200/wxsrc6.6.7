package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bge;
import com.tencent.mm.protocal.c.bma;
import com.tencent.mm.protocal.c.bmb;

public final class x
  extends l
  implements k
{
  public final b dZf;
  private com.tencent.mm.ab.e diJ;
  
  public x(int paramInt, bge parambge)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSetMsgRemind", "[NetSceneSetMsgRemind] opType:%s RemindId:%s time:%s Type:%s SubType:%s", new Object[] { Integer.valueOf(paramInt), parambge.shm, Integer.valueOf(parambge.ixe), Integer.valueOf(parambge.hcE), Integer.valueOf(parambge.sdX) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bma();
    ((b.a)localObject).dIH = new bmb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setmsgremind";
    ((b.a)localObject).dIF = 525;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.dZf = ((b.a)localObject).KT();
    localObject = (bma)this.dZf.dID.dIL;
    int i = paramInt;
    if (paramInt == 0) {
      i = 1;
    }
    ((bma)localObject).jRb = i;
    ((bma)localObject).sky = parambge;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSetMsgRemind", "[onGYNetEnd] RemindId:%s", new Object[] { ((bmb)this.dZf.dIE.dIL).shm });
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSetMsgRemind", "[onGYNetEnd] errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    }
  }
  
  public final int getType()
  {
    return 525;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelsimple/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */