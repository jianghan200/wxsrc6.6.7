package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bvb;
import com.tencent.mm.protocal.c.bvc;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public int iyb;
  public int iyc;
  public int opType;
  
  public n(int paramInt1, int paramInt2)
  {
    this.opType = paramInt1;
    this.iyb = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bvb();
    ((b.a)localObject).dIH = new bvc();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/updateranksetting";
    ((b.a)localObject).dIF = 1044;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bvb)this.diG.dID.dIL;
    ((bvb)localObject).bYt = this.opType;
    ((bvb)localObject).bWA = this.iyb;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneUpdateRankSetting", "hy: scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.iyc = ((bvc)this.diG.dIE.dIL).bWA;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1044;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */