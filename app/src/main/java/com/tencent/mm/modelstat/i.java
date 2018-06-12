package com.tencent.mm.modelstat;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bd;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.protocal.c.bj;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class i
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e doG;
  
  public i(int paramInt1, String paramString, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bd();
    ((b.a)localObject).dIH = new be();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    ((b.a)localObject).dIF = 1295;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bd)this.diG.dID.dIL;
    bj localbj = new bj();
    localbj.rbJ = paramInt1;
    localbj.rbK = new com.tencent.mm.bk.b(paramString.getBytes());
    localbj.rbL = paramInt2;
    ((bd)localObject).rbu.add(localbj);
    x.i("MicroMsg.NetSceneAdDataReport", "init logId:%d, logStr:%s", new Object[] { Integer.valueOf(paramInt1), paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (be)this.diG.dIE.dIL;
    x.i("MicroMsg.NetSceneAdDataReport", "onGYNetEnd, errType = %d, errCode = %d, ret=%d, msg=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramq.ret), paramq.bIr });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1295;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelstat/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */