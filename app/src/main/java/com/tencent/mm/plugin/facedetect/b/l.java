package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqe;
import com.tencent.mm.protocal.c.bbt;
import com.tencent.mm.protocal.c.vl;
import com.tencent.mm.protocal.c.vm;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private LinkedList<aqe> iMv = null;
  public bbt iMw = null;
  public String iMx = null;
  public String iMy = null;
  public String iMz = null;
  
  public l(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new vl();
    ((b.a)localObject).dIH = new vm();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/faceidentifyprepage";
    ((b.a)localObject).dIF = 1147;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (vl)this.diG.dID.dIL;
    ((vl)localObject).bPS = paramString1;
    ((vl)localObject).ryI = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (vm)((b)paramq).dIE.dIL;
    if (paramq != null)
    {
      this.iMv = paramq.rqi;
      this.iMw = paramq.ryJ;
      this.iMx = paramq.ryL;
      this.iMy = paramq.ryM;
      this.iMz = paramq.ryN;
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
    }
  }
  
  public final int getType()
  {
    return 1147;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */