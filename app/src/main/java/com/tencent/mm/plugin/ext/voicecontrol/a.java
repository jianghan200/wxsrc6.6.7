package com.tencent.mm.plugin.ext.voicecontrol;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.dk;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.protocal.c.dm;
import com.tencent.mm.protocal.c.dq;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  public String appId;
  public int bNI;
  public int dHI;
  public int dHJ;
  com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public int iLq;
  public com.tencent.mm.bk.b iLr;
  public String iLs;
  public dq iLt;
  public dk iLu;
  int iLv = 5000;
  long iLw = 0L;
  public int sH;
  
  public a(int paramInt1, String paramString1, int paramInt2, String paramString2, dq paramdq)
  {
    this.bNI = 1;
    this.appId = paramString1;
    this.iLq = paramInt1;
    this.sH = 1;
    this.dHI = paramInt2;
    this.iLt = paramdq;
    this.iLu = null;
    this.iLs = paramString2;
    if (paramdq != null) {}
    for (;;)
    {
      x.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, totalLen=%s, controlType=%s, %s, %s", new Object[] { Integer.valueOf(1), paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(1), Boolean.valueOf(bool), Boolean.valueOf(false) });
      return;
      bool = false;
    }
  }
  
  public a(int paramInt, String paramString, dk paramdk, long paramLong)
  {
    this.bNI = 2;
    this.appId = paramString;
    this.iLq = paramInt;
    this.sH = 1;
    this.iLt = null;
    this.iLu = paramdk;
    this.iLw = paramLong;
    x.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, controlType=%s, %s, %s", new Object[] { Integer.valueOf(2), paramString, Integer.valueOf(paramInt), Integer.valueOf(1), Boolean.valueOf(false), Boolean.valueOf(true) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIF = 985;
    parame1.uri = "/cgi-bin/micromsg-bin/appvoicecontrol";
    parame1.dIG = new dl();
    parame1.dIH = new dm();
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    parame1 = (dl)this.diG.dID.dIL;
    parame1.qZc = this.bNI;
    parame1.jQb = this.appId;
    parame1.rdH = this.iLq;
    parame1.rdI = this.sH;
    parame1.rdJ = this.iLt;
    parame1.rdK = this.iLu;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramq != null)) {
      x.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    }
    while (this.diJ != null)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    }
    x.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] callback null");
  }
  
  public final int getType()
  {
    return 985;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ext/voicecontrol/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */