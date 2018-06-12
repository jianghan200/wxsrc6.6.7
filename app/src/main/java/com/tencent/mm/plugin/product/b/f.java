package com.tencent.mm.plugin.product.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bie;
import com.tencent.mm.protocal.c.ko;
import com.tencent.mm.protocal.c.kp;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class f
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public f(LinkedList<bie> paramLinkedList, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ko();
    ((b.a)localObject).dIH = new kp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cancelpreorder";
    ((b.a)localObject).dIF = 555;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ko)this.diG.dID.dIL;
    ((ko)localObject).rmL = paramLinkedList;
    if (paramLinkedList != null) {
      i = paramLinkedList.size();
    }
    ((ko)localObject).lOS = i;
    ((ko)localObject).rmM = paramString;
    x.d("MicroMsg.NetSceneMallCancelPreOrder", "lockId " + paramString);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (kp)((b)paramq).dIE.dIL;
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.rmN != 0)
      {
        paramInt1 = paramArrayOfByte.rmN;
        paramq = paramArrayOfByte.rmO;
      }
    }
    x.d("MicroMsg.NetSceneMallCancelPreOrder", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.diJ.a(paramInt2, paramInt1, paramq, this);
  }
  
  public final int getType()
  {
    return 555;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */