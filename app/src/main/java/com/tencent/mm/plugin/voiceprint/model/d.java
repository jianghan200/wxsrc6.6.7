package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajl;
import com.tencent.mm.protocal.c.ajm;
import com.tencent.mm.protocal.c.bhj;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  String oER = "";
  int oES = 0;
  String oET = "";
  
  public d(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ajl();
    ((b.a)localObject).dIH = new ajm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getvoiceprintresource";
    ((b.a)localObject).dIF = 611;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ajl)this.diG.dID.dIL;
    x.i("MicroMsg.NetSceneGetVoicePrintResource", "sceneType %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    ((ajl)localObject).rMp = paramInt;
    ((ajl)localObject).rMq = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetVoicePrintResource", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (ajm)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramq.rMr != null)
    {
      this.oER = new String(paramq.rMr.sio.siK.lR);
      this.oES = paramq.rMr.shi;
      x.d("MicroMsg.NetSceneGetVoicePrintResource", "vertify resid %d mtext %s", new Object[] { Integer.valueOf(this.oES), this.oER });
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.e("MicroMsg.NetSceneGetVoicePrintResource", "resp ResourceData null ");
    }
  }
  
  public final int getType()
  {
    return 611;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */