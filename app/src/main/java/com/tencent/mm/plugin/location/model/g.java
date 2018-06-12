package com.tencent.mm.plugin.location.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afb;
import com.tencent.mm.protocal.c.afc;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private byte[] kCG;
  String kCH;
  
  public g(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new afb();
    ((b.a)localObject).dIH = new afc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlocimg";
    ((b.a)localObject).dIF = 648;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (afb)this.diG.dID.dIL;
    ((afb)localObject).iwP = paramString2;
    if (bi.fU(ad.getContext())) {}
    for (((afb)localObject).rJk = 1;; ((afb)localObject).rJk = 0)
    {
      ((afb)localObject).rms = paramFloat1;
      ((afb)localObject).rmr = paramFloat2;
      ((afb)localObject).rJl = paramInt1;
      x.i("MicroMsg.NetSceneGetLocImg", "src w %d h %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      while (paramInt2 * paramInt3 > 270000)
      {
        paramInt2 = (int)(paramInt2 / 1.2D);
        paramInt3 = (int)(paramInt3 / 1.2D);
      }
    }
    x.i("MicroMsg.NetSceneGetLocImg", "NetSceneGetLocImg %f %f %d w = %d h = %d lan=%s", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), ((afb)localObject).iwP });
    ((afb)localObject).Height = paramInt3;
    ((afb)localObject).Width = paramInt2;
    this.kCH = paramString1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetLocImg", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (afc)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    try
    {
      this.kCG = paramq.rcn.siK.lR;
      com.tencent.mm.a.e.b(this.kCH, this.kCG, this.kCG.length);
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      return;
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneGetLocImg", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    return 648;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */