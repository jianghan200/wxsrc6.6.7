package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.brw;
import com.tencent.mm.protocal.c.brx;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public int mStatus;
  public int oFh;
  
  public i(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new brw();
    locala.dIH = new brx();
    locala.uri = "/cgi-bin/micromsg-bin/switchopvoiceprint";
    locala.dIF = 615;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((brw)this.diG.dID.dIL).bOh = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSwitchOpVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (brx)((b)paramq).dIE.dIL;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.mStatus = paramq.sdf;
    this.oFh = paramq.spF;
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 615;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */