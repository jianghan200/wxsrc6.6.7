package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bmt;
import com.tencent.mm.protocal.c.bmu;
import com.tencent.mm.protocal.c.bmv;
import com.tencent.mm.protocal.c.bnk;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class g
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  public int hwV;
  public String hwW;
  
  public g(int paramInt1, LinkedList<bmv> paramLinkedList, String paramString1, String paramString2, bnk parambnk, int paramInt2, bqs parambqs)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bmt();
    ((b.a)localObject).dIH = new bmu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sharecarditem";
    ((b.a)localObject).dIF = 902;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bmt)this.diG.dID.dIL;
    ((bmt)localObject).skX = paramInt1;
    ((bmt)localObject).dzs = paramLinkedList;
    ((bmt)localObject).skY = paramString1;
    ((bmt)localObject).rGk = paramString2;
    x.i("MicroMsg.NetSceneShareCardItem", "list length is " + paramLinkedList.size());
    ((bmt)localObject).skZ = parambnk;
    ((bmt)localObject).cae = paramInt2;
    ((bmt)localObject).qZR = parambqs;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(902), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      x.i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
      paramq = (bmu)this.diG.dIE.dIL;
      if (paramq != null)
      {
        this.hwU = paramq.hwU;
        this.hwV = paramq.hwV;
        this.hwW = paramq.hwW;
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramq = (bmu)this.diG.dIE.dIL;
      if (paramq != null)
      {
        this.hwU = paramq.hwU;
        this.hwV = paramq.hwV;
        this.hwW = paramq.hwW;
      }
    }
  }
  
  public final int getType()
  {
    return 902;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */