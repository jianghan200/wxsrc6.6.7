package com.tencent.mm.plugin.nearby.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqy;
import com.tencent.mm.protocal.c.aqz;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String euq;
  public String lBn;
  
  public d(float paramFloat1, float paramFloat2, int paramInt, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aqy();
    ((b.a)localObject).dIH = new aqz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/joinlbsroom";
    ((b.a)localObject).dIF = 376;
    ((b.a)localObject).dII = 183;
    ((b.a)localObject).dIJ = 1000000183;
    this.diG = ((b.a)localObject).KT();
    localObject = (aqy)this.diG.dID.dIL;
    ((aqy)localObject).qZc = 1;
    ((aqy)localObject).rmr = paramFloat1;
    ((aqy)localObject).rms = paramFloat2;
    ((aqy)localObject).ryV = paramInt;
    ((aqy)localObject).ryW = paramString1;
    ((aqy)localObject).ryX = paramString2;
    ((aqy)localObject).ryY = 0;
    x.d("MicroMsg.NetSceneLbsRoom", "Req: opcode:1 lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt + " gpsSource:0 mac" + paramString1 + " cell:" + paramString2);
  }
  
  public d(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aqy();
    ((b.a)localObject).dIH = new aqz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/joinlbsroom";
    ((b.a)localObject).dIF = 376;
    ((b.a)localObject).dII = 183;
    ((b.a)localObject).dIJ = 1000000183;
    this.diG = ((b.a)localObject).KT();
    localObject = (aqy)this.diG.dID.dIL;
    ((aqy)localObject).rmr = 0.0F;
    ((aqy)localObject).rms = 0.0F;
    ((aqy)localObject).ryV = 0;
    ((aqy)localObject).ryY = 0;
    ((aqy)localObject).ryW = "";
    ((aqy)localObject).ryX = "";
    ((aqy)localObject).qZc = 2;
    ((aqy)localObject).ebL = paramString;
    ((aqy)localObject).rTw = paramInt1;
    ((aqy)localObject).rTv = paramInt2;
  }
  
  public final int Oh()
  {
    return ((aqy)this.diG.dID.dIL).qZc;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneLbsRoom", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " opCode:" + Oh());
    paramArrayOfByte = (aqz)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramInt2 != 0) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      if (Oh() == 1)
      {
        this.euq = paramArrayOfByte.ebL;
        this.lBn = paramArrayOfByte.rTx;
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    } while (Oh() != 2);
    b.IH(((aqy)((com.tencent.mm.ab.b)paramq).dID.dIL).ebL);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 376;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/nearby/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */