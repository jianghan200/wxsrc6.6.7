package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bgv;
import com.tencent.mm.protocal.c.bgw;
import com.tencent.mm.sdk.platformtools.x;

public final class ai
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public ai(String paramString, byte[] paramArrayOfByte, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bgv();
    ((b.a)localObject).dIH = new bgw();
    ((b.a)localObject).uri = "/cgi-bin/card/reportlotionorbluetoothinfo";
    ((b.a)localObject).dIF = 2574;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bgv)this.diG.dID.dIL;
    ((bgv)localObject).cac = paramString;
    ((bgv)localObject).shG = com.tencent.mm.bk.b.bi(paramArrayOfByte);
    ((bgv)localObject).bUg = paramFloat1;
    ((bgv)localObject).bSx = paramFloat2;
    ((bgv)localObject).shF = paramFloat3;
    ((bgv)localObject).shH = paramBoolean1;
    ((bgv)localObject).shI = paramBoolean2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneReportLotionOrBluetoothInfo", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2574;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/model/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */