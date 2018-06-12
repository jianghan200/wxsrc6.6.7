package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahs;
import com.tencent.mm.protocal.c.aht;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  public int hwV;
  public String hwW;
  
  public d(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ahs();
    ((b.a)localObject).dIH = new aht();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
    ((b.a)localObject).dIF = 910;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ahs)this.diG.dID.dIL;
    ((ahs)localObject).cac = paramString1;
    ((ahs)localObject).scene = 20;
    ((ahs)localObject).huU = paramString2;
    ((ahs)localObject).code = paramString3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(910), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aht)this.diG.dIE.dIL;
      x.v("MicroMsg.NetSceneGetShareCardConsumedInfo", "json:" + paramq.hwU);
      this.hwU = paramq.hwU;
      this.hwW = paramq.hwW;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 910;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */