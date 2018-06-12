package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bru;
import com.tencent.mm.protocal.c.brv;
import com.tencent.mm.sdk.platformtools.x;

public final class q
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public boolean iMJ = false;
  public boolean iMK = false;
  
  public q(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new bru();
    locala.dIH = new brv();
    locala.uri = "/cgi-bin/micromsg-bin/switchopface";
    locala.dIF = 938;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bru)this.diG.dID.dIL).qZc = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramq = (brv)((b)paramq).dIE.dIL;
    this.iMJ = paramq.spD;
    this.iMK = paramq.spE;
    x.i("MicroMsg.NetSceneFaceSwitchOpFace", "hy: NetSceneFaceSwitchOpFace errType: %d, errCode: %d, errMsg: %s, hasBio: %b, isOpen: %b", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Boolean.valueOf(this.iMJ), Boolean.valueOf(this.iMK) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 938;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */