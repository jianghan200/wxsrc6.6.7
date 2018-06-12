package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.av;
import com.tencent.mm.model.az.a;
import com.tencent.mm.model.az.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajs;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private final q dJM = new b();
  private int dJp = 2;
  com.tencent.mm.ab.e diJ;
  String eHp = "";
  
  public e(String paramString)
  {
    az.a locala = (az.a)this.dJM.KV();
    locala.dBU.hbL = paramString;
    locala.dBU.rMs = 1;
    x.i("MicroMsg.NetSceneGetVoiceprintTicketRsa", "sceneType %d %s", new Object[] { Integer.valueOf(1), paramString });
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
    paramArrayOfByte = (az.b)paramq.Id();
    this.eHp = paramArrayOfByte.dBV.rMt;
    x.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " mTicket: " + this.eHp);
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      av.a(true, paramArrayOfByte.dBV.rhK, paramArrayOfByte.dBV.rhL, paramArrayOfByte.dBV.rhJ);
      this.dJp -= 1;
      if (this.dJp <= 0)
      {
        x.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "reach redirect limit, invoke callback");
        this.diJ.a(3, -1, "", this);
        return;
      }
      x.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "redirect IDC");
      a(this.dIX, this.diJ);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.KV().qWA.ver;
      x.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      au.Em().H(new e.1(this, paramInt1));
      return;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  protected final void a(l.a parama) {}
  
  public final int getType()
  {
    return 618;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */