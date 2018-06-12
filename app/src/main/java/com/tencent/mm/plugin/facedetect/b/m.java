package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.vn;
import com.tencent.mm.protocal.c.vo;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends l
  implements k, e
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private boolean iMA = false;
  public String iMB = null;
  public boolean iMC = false;
  private String iMD = "";
  
  public m(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new vn();
    ((b.a)localObject).dIH = new vo();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/faceidentify";
    ((b.a)localObject).dIF = 1080;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (vn)this.diG.dID.dIL;
    ((vn)localObject).bPS = paramString1;
    ((vn)localObject).ryO = paramLong;
    ((vn)localObject).ryI = paramString2;
    ((vn)localObject).ryQ = paramString3;
    ((vn)localObject).ryP = paramString4;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneFaceVerifyFace", "alvinluo NetSceneFacePicThirdVerifyFace errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (vo)((b)paramq).dIE.dIL;
    x.i("MicroMsg.NetSceneFaceVerifyFace", "identity_id: %s", new Object[] { paramq.ryR });
    this.iMB = paramq.ryR;
    this.iMC = paramq.ryS;
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final boolean aJr()
  {
    return this.iMC;
  }
  
  public final String aJs()
  {
    return this.iMB;
  }
  
  public final int getType()
  {
    return 1080;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */