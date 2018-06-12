package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.al;
import com.tencent.mm.protocal.c.am;
import com.tencent.mm.protocal.c.ky;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class p
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  public int hwV;
  public String hwW;
  
  public p(LinkedList<ky> paramLinkedList, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new al();
    ((b.a)localObject).dIH = new am();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcardlistfromapp";
    ((b.a)localObject).dIF = 687;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (al)this.diG.dID.dIL;
    ((al)localObject).qZS = paramLinkedList;
    ((al)localObject).cae = paramInt1;
    ((al)localObject).qZO = paramString1;
    ((al)localObject).qZN = paramString2;
    ((al)localObject).qZP = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (am)this.diG.dIE.dIL;
      this.hwU = paramq.hwU;
      this.hwV = paramq.hwV;
      this.hwW = paramq.hwW;
      x.e("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, ret_code = " + this.hwV + " ret_msg = " + this.hwW);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 687;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */