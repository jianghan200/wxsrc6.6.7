package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.an;
import com.tencent.mm.protocal.c.ao;
import com.tencent.mm.sdk.platformtools.x;

public final class q
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public CardGiftInfo hwX;
  
  public q(int paramInt, String paramString1, String paramString2, Boolean paramBoolean)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new an();
    ((b.a)localObject).dIH = new ao();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptgiftcard";
    ((b.a)localObject).dIF = 1136;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (an)this.diG.dID.dIL;
    ((an)localObject).qZT = paramInt;
    ((an)localObject).qZU = paramString1;
    ((an)localObject).qZV = paramString2;
    ((an)localObject).qZW = paramBoolean.booleanValue();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.hwX = CardGiftInfo.a((ao)this.diG.dIE.dIL);
      x.d("MicroMsg.NetSceneAcceptGiftCard", "%s", new Object[] { this.hwX.toString() });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1136;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */