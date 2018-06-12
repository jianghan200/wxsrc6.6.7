package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abj;
import com.tencent.mm.protocal.c.abk;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.sdk.platformtools.x;

public final class aa
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  
  public aa(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, bqs parambqs)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new abj();
    ((b.a)localObject).dIH = new abk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcarditeminfo";
    ((b.a)localObject).dIF = 645;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (abj)this.diG.dID.dIL;
    ((abj)localObject).cac = paramString1;
    ((abj)localObject).cae = paramInt1;
    ((abj)localObject).hwf = paramString2;
    ((abj)localObject).cad = paramString3;
    ((abj)localObject).qZO = paramString4;
    ((abj)localObject).qZN = paramString5;
    ((abj)localObject).qZP = paramInt2;
    ((abj)localObject).rGk = paramString6;
    ((abj)localObject).qZR = parambqs;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetCardItemInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.hwU = ((abk)this.diG.dIE.dIL).hwU;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 645;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */