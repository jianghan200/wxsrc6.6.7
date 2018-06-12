package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.akw;
import com.tencent.mm.sdk.platformtools.x;

public final class af
  extends l
  implements k
{
  public String cad;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public int hwV;
  public String hwW;
  
  public af(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new akv();
    ((b.a)localObject).dIH = new akw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/giftcarditem";
    ((b.a)localObject).dIF = 652;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (akv)this.diG.dID.dIL;
    ((akv)localObject).cac = paramString1;
    ((akv)localObject).rNK = paramString2;
    ((akv)localObject).rNL = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGiftCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (akw)this.diG.dIE.dIL;
      if (paramq != null)
      {
        this.cad = paramq.cad;
        this.hwW = paramq.hwW;
        this.hwV = paramq.hwV;
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramq = (akw)this.diG.dIE.dIL;
      if (paramq != null)
      {
        this.cad = paramq.cad;
        this.hwW = paramq.hwW;
        this.hwV = paramq.hwV;
      }
    }
  }
  
  public final int getType()
  {
    return 652;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/model/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */