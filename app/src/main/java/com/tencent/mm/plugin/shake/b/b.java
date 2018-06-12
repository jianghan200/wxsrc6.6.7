package com.tencent.mm.plugin.shake.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bmp;
import com.tencent.mm.protocal.c.bmq;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  extends l
  implements k
{
  byte[] cdy;
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  int ret;
  
  public b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bmp();
    ((b.a)localObject).dIH = new bmq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakereport";
    ((b.a)localObject).dIF = 161;
    ((b.a)localObject).dII = 56;
    ((b.a)localObject).dIJ = 1000000056;
    this.diG = ((b.a)localObject).KT();
    localObject = (bmp)this.diG.dID.dIL;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShakeReport", "share reprot %f %f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
    ((bmp)localObject).qZc = 0;
    ((bmp)localObject).rmr = paramFloat1;
    ((bmp)localObject).rms = paramFloat2;
    ((bmp)localObject).ryV = paramInt1;
    ((bmp)localObject).ryW = paramString1;
    ((bmp)localObject).ryX = paramString2;
    ((bmp)localObject).ryY = paramInt2;
    au.HU();
    ((bmp)localObject).skU = bi.a((Integer)c.DT().get(4107, null), 0);
    au.HU();
    paramInt2 = bi.f((Integer)c.DT().get(4106, null));
    ((bmp)localObject).skV = paramInt2;
    au.HU();
    c.DT().set(4106, Integer.valueOf(paramInt2 + 1));
    ((bmp)localObject).rTr = new bhy().bq(com.tencent.mm.plugin.normsg.a.b.lFJ.bjE());
    o.a(2002, paramFloat1, paramFloat2, paramInt1);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneShakeReport", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneShakeReport", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bmq)this.diG.dIE.dIL;
    this.ret = paramq.Id().qWB;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.cdy = ab.a(paramArrayOfByte.rfy);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int bun()
  {
    return ((bmp)this.diG.dID.dIL).ryY;
  }
  
  public final int getType()
  {
    return 161;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/shake/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */