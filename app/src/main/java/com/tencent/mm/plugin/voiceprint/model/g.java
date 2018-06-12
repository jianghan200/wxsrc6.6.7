package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.bk.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.ay.a;
import com.tencent.mm.model.ay.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajo;
import com.tencent.mm.protocal.c.bhj;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  private final q dJM = new a();
  com.tencent.mm.ab.e diJ;
  String oER = "";
  int oES = 0;
  private String oET = "";
  
  public g(String paramString)
  {
    ay.a locala = (ay.a)this.dJM.KV();
    x.i("MicroMsg.NetSceneRsaGetVoicePrintResource", "sceneType %d %s", new Object[] { Integer.valueOf(73), paramString });
    locala.dBS.rMp = 73;
    locala.dBS.rMq = paramString;
  }
  
  protected final int Cc()
  {
    return 3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dJM, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (ay.b)paramq.Id();
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.KV().qWA.ver;
      x.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      au.Em().H(new g.1(this, paramInt1));
      return;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramArrayOfByte.dBT.rMr != null)
    {
      this.oER = new String(paramArrayOfByte.dBT.rMr.sio.siK.lR);
      this.oES = paramArrayOfByte.dBT.rMr.shi;
      x.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "resid %d mVertifyKey %s mtext %s", new Object[] { Integer.valueOf(this.oES), this.oET, this.oER });
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.e("MicroMsg.NetSceneRsaGetVoicePrintResource", "resp ResourceData null ");
    }
  }
  
  protected final void a(l.a parama) {}
  
  public final int getType()
  {
    return 616;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */