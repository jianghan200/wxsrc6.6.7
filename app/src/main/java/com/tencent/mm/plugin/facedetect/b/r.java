package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.vp;
import com.tencent.mm.protocal.c.vq;
import com.tencent.mm.sdk.platformtools.x;

public final class r
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String mFileName = "";
  
  public r(String paramString1, long paramLong, String paramString2, String paramString3, String paramString4)
  {
    b.a locala = new b.a();
    locala.dIG = new vp();
    locala.dIH = new vq();
    locala.uri = "/cgi-bin/mmbiz-bin/usrmsg/facevideobindbioid";
    locala.dIF = 1197;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.mFileName = paramString1;
    paramString1 = (vp)this.diG.dID.dIL;
    paramString1.bPS = paramString2;
    paramString1.ryO = paramLong;
    paramString1.ryP = paramString4;
    paramString1.ryT = paramString3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneFaceThirdBindVideo", "hy:  errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1197;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */