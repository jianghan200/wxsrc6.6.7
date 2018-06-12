package com.tencent.mm.av;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.protocal.c.blg;
import com.tencent.mm.protocal.c.blh;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  String edM;
  
  public a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new blg();
    ((b.a)localObject).dIH = new blh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sensewhere";
    ((b.a)localObject).dIF = 752;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = new aqr();
    ((aqr)localObject).ryX = paramString2;
    ((aqr)localObject).ryY = paramInt2;
    ((aqr)localObject).rms = paramFloat2;
    ((aqr)localObject).rmr = paramFloat1;
    ((aqr)localObject).ryW = paramString1;
    ((aqr)localObject).ryV = paramInt1;
    paramString1 = (blg)this.diG.dID.dIL;
    paramString1.rva = ((aqr)localObject);
    paramString1.sko = paramInt3;
    paramString1.otY = paramInt4;
    paramString1.jSA = paramString3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneUploadSenseWhere", "upload sense where info. errType[%d] errCode[%d] errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.edM = ((blh)((b)paramq).dIE.dIL).jSA;
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.w("MicroMsg.NetSceneUploadSenseWhere", "upload sense where error");
    }
  }
  
  public final int getType()
  {
    return 752;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/av/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */