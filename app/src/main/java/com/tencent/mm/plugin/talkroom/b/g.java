package com.tencent.mm.plugin.talkroom.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bsn;
import com.tencent.mm.protocal.c.bso;
import com.tencent.mm.protocal.c.bsp;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class g
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public g(LinkedList<bsn> paramLinkedList, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bso();
    ((b.a)localObject).dIH = new bsp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talkstatreport";
    ((b.a)localObject).dIF = 373;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bso)this.diG.dID.dIL;
    ((bso)localObject).spU = paramLinkedList.size();
    ((bso)localObject).spV = paramLinkedList;
    ((bso)localObject).otY = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneTalkStatReport", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneTalkStatReport", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 373;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/talkroom/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */