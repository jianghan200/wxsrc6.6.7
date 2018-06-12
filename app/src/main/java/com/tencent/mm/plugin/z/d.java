package com.tencent.mm.plugin.z;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bke;
import com.tencent.mm.protocal.c.bkf;
import com.tencent.mm.protocal.c.df;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.a;

public final class d
  extends l
  implements k
{
  private String aeskey;
  private String cXR;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private String fileId;
  private int lsF;
  
  public d(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this.fileId = paramString1;
    this.aeskey = paramString2;
    this.lsF = paramInt;
    this.cXR = paramString3;
    paramString2 = new b.a();
    paramString2.dIG = new bke();
    paramString2.dIH = new bkf();
    paramString2.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    paramString2.dIF = 222;
    paramString2.dII = 107;
    paramString2.dIJ = 1000000107;
    this.diG = paramString2.KT();
    x.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "MsgSynchronizeSendAppMsgNetScene fileId[%s], fileLen[%d], selfName[%s], stack[%s]", new Object[] { paramString1, Integer.valueOf(paramInt), paramString3, bi.cjd() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new g.a();
    parame1.title = "PCSYNC";
    parame1.description = "ANDROID_PCSYNC";
    parame1.type = 35;
    parame1.url = this.fileId;
    parame1.dwK = this.aeskey;
    parame1.dwo = this.lsF;
    parame1.dwL = this.aeskey;
    parame1.showType = 0;
    bke localbke = (bke)this.diG.dID.dIL;
    df localdf = new df();
    localdf.jTv = this.cXR;
    localdf.rdn = parame1.sdkVer;
    localdf.hcE = 35;
    localdf.jTu = this.cXR;
    localdf.jSA = g.a.a(parame1, null, null, 0, 0);
    localdf.lOH = ((int)bi.VE());
    localbke.sjS = localdf;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "msgSynchronize sendAppMsg onGYNetEnd. [%d,%d,%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 222;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/z/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */