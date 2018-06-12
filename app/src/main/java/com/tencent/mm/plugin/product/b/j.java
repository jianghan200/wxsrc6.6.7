package com.tencent.mm.plugin.product.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.bbm;
import com.tencent.mm.protocal.c.bbn;
import com.tencent.mm.protocal.c.bie;
import com.tencent.mm.protocal.c.um;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class j
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String lQN;
  public LinkedList<um> lQY;
  public LinkedList<au> lQZ;
  
  public j(LinkedList<bie> paramLinkedList, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bbm();
    ((b.a)localObject).dIH = new bbn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/presubmitorder";
    ((b.a)localObject).dIF = 554;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bbm)this.diG.dID.dIL;
    ((bbm)localObject).rmL = paramLinkedList;
    if (paramLinkedList != null) {
      i = paramLinkedList.size();
    }
    ((bbm)localObject).lOS = i;
    ((bbm)localObject).sdG = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (bbn)((b)paramq).dIE.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.rmN == 0))
    {
      x.d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.ExpressCount " + paramArrayOfByte.rIK);
      x.d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.LockId " + paramArrayOfByte.rmM);
      this.lQY = paramArrayOfByte.sdH;
      this.lQN = paramArrayOfByte.rmM;
      this.lQZ = paramArrayOfByte.sdI;
    }
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
    x.d("MicroMsg.NetSceneMallPreSubmitOrder", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.diJ.a(paramInt2, paramInt1, paramq, this);
  }
  
  public final int getType()
  {
    return 554;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */