package com.tencent.mm.ac;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bcs;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Date;

public final class r
  extends l
  implements k
{
  private Object data;
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public r(b paramb, int paramInt1, int paramInt2, Object paramObject)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bcs();
    ((b.a)localObject).dIH = new bct();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/reportpluginstat";
    ((b.a)localObject).dIF = 2805;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bcs)this.diG.dID.dIL;
    ((bcs)localObject).seR = 1;
    ((bcs)localObject).seS = paramb.field_wwCorpId;
    ((bcs)localObject).riY = paramb.field_wwUserVid;
    g.Eg();
    ((bcs)localObject).seT = a.Df();
    ((bcs)localObject).scene = paramInt2;
    ((bcs)localObject).bIH = paramInt1;
    ((bcs)localObject).seU = 0L;
    ((bcs)localObject).seV = new Date().getTime();
    ((bcs)localObject).seW = 1;
    ((bcs)localObject).scj = com.tencent.mm.sdk.platformtools.e.aj(null, d.qVN);
    this.data = paramObject;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneEnterprisePushStat", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneEnterprisePushStat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2805;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ac/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */