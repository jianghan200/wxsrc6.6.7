package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  private c.a kqr = new c.1(this);
  public com.tencent.mm.e.b.c ltc = new com.tencent.mm.e.b.c(v2protocal.lsT, 1, 1);
  private com.tencent.mm.plugin.voip.model.a ltf = new c.2(this);
  public com.tencent.mm.plugin.voip.model.b oKt;
  
  public c()
  {
    this.ltc.ey(20);
    this.ltc.aN(true);
    this.ltc.wm();
    this.ltc.t(1, false);
    this.ltc.aM(true);
    this.ltc.bEb = this.kqr;
    this.oKt = new com.tencent.mm.plugin.voip.model.b();
    this.oKt.X(v2protocal.lsT, 20, 0);
    this.oKt.r(ad.getContext(), false);
    this.oKt.oHi = this.ltf;
  }
  
  private boolean iJ(boolean paramBoolean)
  {
    if (this.oKt != null) {
      return this.oKt.iJ(paramBoolean);
    }
    return false;
  }
  
  public final void ja(boolean paramBoolean)
  {
    x.k("MicroMsg.cs.VoipCsAudioManager", "enableSpeaker: " + paramBoolean, new Object[0]);
    x.d("MicroMsg.cs.VoipCsAudioManager", "MMCore.getAudioManager() " + au.HV().yI());
    if (au.HV().yE()) {
      paramBoolean = false;
    }
    if (q.deN.dby)
    {
      q.deN.dump();
      if (q.deN.dbz > 0) {
        iJ(paramBoolean);
      }
    }
    if ((q.deN.dcb >= 0) || (q.deN.dcc >= 0)) {
      iJ(paramBoolean);
    }
    com.tencent.mm.plugin.voip_cs.b.b.a locala;
    if (this.oKt != null)
    {
      i = this.oKt.bJx();
      au.HV().b(paramBoolean, i, false);
      locala = com.tencent.mm.plugin.voip_cs.b.b.bMv();
      if (!paramBoolean) {
        break label186;
      }
    }
    label186:
    for (int i = locala.kqx.tf(401);; i = locala.kqx.tf(402))
    {
      if (i < 0) {
        com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.VoipCSEngine", "voipContext trySwitchSpeakerPhone ret:" + i);
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */