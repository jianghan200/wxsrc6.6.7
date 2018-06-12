package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aj;
import com.tencent.mm.protocal.c.ak;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  public int hwV;
  public String hwW;
  
  public o(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, int paramInt3, bqs parambqs)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aj();
    ((b.a)localObject).dIH = new ak();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcarditem";
    ((b.a)localObject).dIF = 651;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aj)this.diG.dID.dIL;
    ((aj)localObject).cac = paramString1;
    ((aj)localObject).hwf = paramString2;
    ((aj)localObject).cae = paramInt1;
    ((aj)localObject).cad = paramString3;
    ((aj)localObject).qZO = paramString4;
    ((aj)localObject).qZN = paramString5;
    ((aj)localObject).qZP = paramInt2;
    ((aj)localObject).qZQ = paramInt3;
    ((aj)localObject).qZR = parambqs;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAcceptCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ak)this.diG.dIE.dIL;
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
      paramq = (ak)this.diG.dIE.dIL;
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
    return 651;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */