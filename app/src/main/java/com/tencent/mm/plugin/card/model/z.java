package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abh;
import com.tencent.mm.protocal.c.abi;
import com.tencent.mm.sdk.platformtools.x;

public final class z
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public CardGiftInfo hwX;
  
  public z(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new abh();
    ((b.a)localObject).dIH = new abi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardgiftinfo";
    ((b.a)localObject).dIF = 1165;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (abh)this.diG.dID.dIL;
    ((abh)localObject).qZT = paramInt;
    ((abh)localObject).qZU = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetCardGiftInfo", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.hwX = CardGiftInfo.a((abi)this.diG.dIE.dIL);
      x.d("MicroMsg.NetSceneGetCardGiftInfo", "%s", new Object[] { this.hwX.toString() });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1165;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */