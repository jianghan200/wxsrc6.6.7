package com.tencent.mm.plugin.voiceprint.model;

import android.os.Handler;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.ba.a;
import com.tencent.mm.model.ba.b;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.byj;
import com.tencent.mm.protocal.c.byp;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends com.tencent.mm.ab.l
  implements k
{
  private final q dJM;
  com.tencent.mm.ab.e diJ;
  String eRp = "";
  private String filename;
  public boolean oEW = false;
  private boolean oEX = false;
  private Handler oEY = null;
  private int oEZ = 0;
  int oFc = 0;
  private int tH = 0;
  
  public h(String paramString1, int paramInt, String paramString2)
  {
    x.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "resid %d vertifyTicket %s", new Object[] { Integer.valueOf(paramInt), bi.aG(paramString2, "") });
    this.dJM = new c();
    ba.a locala = (ba.a)this.dJM.KV();
    this.filename = paramString1;
    this.tH = 0;
    locala.dBW.shi = paramInt;
    locala.dBW.rMq = paramString2;
    this.oEZ = 0;
    locala.dBW.shg = 0;
    x.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0) });
    this.oEW = true;
    bIU();
  }
  
  private int bIU()
  {
    ba.a locala = (ba.a)this.dJM.KV();
    byp localbyp = new byp();
    new g();
    locala.dBW.suq = localbyp;
    Object localObject = new com.tencent.mm.modelvoice.l(m.aY(this.filename, false));
    int i = com.tencent.mm.a.e.cm(m.aY(this.filename, false));
    if (i - this.tH >= 6000) {}
    for (localObject = ((com.tencent.mm.modelvoice.l)localObject).br(this.tH, 6000);; localObject = ((com.tencent.mm.modelvoice.l)localObject).br(this.tH, i - this.tH))
    {
      x.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.tH), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).bEG), Integer.valueOf(i), Boolean.valueOf(this.oEW) });
      if (((g)localObject).bEG != 0) {
        break;
      }
      return -2;
    }
    if (((g)localObject).ret < 0)
    {
      x.w("MicroMsg.NetSceneRsaVertifyVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
      return -1;
    }
    if (this.tH >= 469000)
    {
      x.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.tH) });
      return -1;
    }
    localbyp.suA = new bhy().bq(((g)localObject).buf);
    localbyp.rdW = this.tH;
    localbyp.suy = ((g)localObject).bEG;
    localbyp.suz = 0;
    locala.dBW.shg = this.oEZ;
    if (this.oEW)
    {
      int j = com.tencent.mm.a.e.cm(m.aY(this.filename, false));
      if (((g)localObject).eon >= j)
      {
        localbyp.suz = 1;
        this.oEX = true;
        x.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
      }
    }
    this.tH = ((g)localObject).eon;
    locala.dBW.suq = localbyp;
    return 0;
  }
  
  protected final int Cc()
  {
    return 240;
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
    x.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (ba.b)paramq.Id();
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.KV().qWA.ver;
      x.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      au.Em().H(new h.1(this, paramInt1));
      return;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.oEZ = paramArrayOfByte.dBX.shg;
    this.oFc = paramArrayOfByte.dBX.rsj;
    this.eRp = paramArrayOfByte.dBX.sur;
    int i = paramArrayOfByte.dBX.shg;
    int j = this.oFc;
    boolean bool = bi.oW(this.eRp);
    if (bi.oW(this.eRp)) {}
    for (paramInt1 = 0;; paramInt1 = this.eRp.length())
    {
      x.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voice VoiceTicket %d mResult %d mAuthPwd is null: %b, mAuthPwd.len: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
      if (!this.oEX) {
        break;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(bIU()) });
    a(this.dIX, this.diJ);
    x.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "loop doscene");
  }
  
  public final int getType()
  {
    return 617;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */