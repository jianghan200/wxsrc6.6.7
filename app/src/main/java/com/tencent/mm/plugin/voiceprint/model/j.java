package com.tencent.mm.plugin.voiceprint.model;

import android.os.Handler;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.byg;
import com.tencent.mm.protocal.c.byh;
import com.tencent.mm.protocal.c.byp;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends com.tencent.mm.ab.l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private String eRp = "";
  private String filename;
  public boolean oEW = false;
  private boolean oEX = false;
  private Handler oEY = null;
  private int oEZ = 0;
  int oFc = 0;
  private int tH = 0;
  
  public j(String paramString, int paramInt)
  {
    x.d("MicroMsg.NetSceneVerifyVoicePrint", "resid %d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new byg();
    ((b.a)localObject).dIH = new byh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyvoiceprint";
    ((b.a)localObject).dIF = 613;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (byg)this.diG.dID.dIL;
    this.filename = paramString;
    this.tH = 0;
    ((byg)localObject).shi = paramInt;
    this.oEZ = 0;
    ((byg)localObject).shg = 0;
    x.i("MicroMsg.NetSceneVerifyVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0) });
    this.oEW = true;
    bIU();
  }
  
  private int bIU()
  {
    byg localbyg = (byg)this.diG.dID.dIL;
    byp localbyp = new byp();
    new g();
    localbyg.suq = localbyp;
    Object localObject = new com.tencent.mm.modelvoice.l(m.aY(this.filename, false));
    int i = com.tencent.mm.a.e.cm(m.aY(this.filename, false));
    if (i - this.tH >= 6000) {}
    for (localObject = ((com.tencent.mm.modelvoice.l)localObject).br(this.tH, 6000);; localObject = ((com.tencent.mm.modelvoice.l)localObject).br(this.tH, i - this.tH))
    {
      x.d("MicroMsg.NetSceneVerifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.tH), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).bEG), Integer.valueOf(i), Boolean.valueOf(this.oEW) });
      if (((g)localObject).bEG != 0) {
        break;
      }
      return -2;
    }
    if (((g)localObject).ret < 0)
    {
      x.w("MicroMsg.NetSceneVerifyVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
      return -1;
    }
    if (this.tH >= 469000)
    {
      x.i("MicroMsg.NetSceneVerifyVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.tH) });
      return -1;
    }
    localbyp.suA = new bhy().bq(((g)localObject).buf);
    localbyp.rdW = this.tH;
    localbyp.suy = ((g)localObject).bEG;
    localbyp.suz = 0;
    localbyg.shg = this.oEZ;
    if (this.oEW)
    {
      int j = com.tencent.mm.a.e.cm(m.aY(this.filename, false));
      if (((g)localObject).eon >= j)
      {
        localbyp.suz = 1;
        this.oEX = true;
        x.i("MicroMsg.NetSceneVerifyVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
      }
    }
    this.tH = ((g)localObject).eon;
    localbyg.suq = localbyp;
    return 0;
  }
  
  protected final int Cc()
  {
    return 240;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneVerifyVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (byh)((b)paramq).dIE.dIL;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.oEZ = paramq.shg;
    this.oFc = paramq.rsj;
    x.i("MicroMsg.NetSceneVerifyVoicePrint", "voice VoiceTicket %d mResult %d", new Object[] { Integer.valueOf(paramq.shg), Integer.valueOf(this.oFc) });
    if (this.oEX)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.i("MicroMsg.NetSceneVerifyVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(bIU()) });
    a(this.dIX, this.diJ);
    x.i("MicroMsg.NetSceneVerifyVoicePrint", "loop doscene");
  }
  
  public final int getType()
  {
    return 613;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */