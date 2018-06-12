package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.voip.model.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public abstract class n<REQ, RESP>
  extends l
  implements com.tencent.mm.network.k
{
  protected b diG;
  com.tencent.mm.ab.e diJ;
  private com.tencent.mm.ab.e jkx;
  protected j oKs = com.tencent.mm.plugin.voip.model.k.bKc();
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = bLn();
    if (i != 0) {
      return i;
    }
    this.jkx = parame1;
    this.diJ = bLm();
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    dP(paramInt2, paramInt3);
    if (this.jkx != null) {
      this.jkx.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.diJ != null) {
      ah.A(new n.1(this, paramInt2, paramInt3, paramString));
    }
  }
  
  public abstract com.tencent.mm.ab.e bLm();
  
  public int bLn()
  {
    return 0;
  }
  
  public final void bLp()
  {
    x.i("MicroMsg.VoipNetSceneBase", "netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
    au.DF().a(this, 0);
  }
  
  public final <RESP> RESP bLq()
  {
    return this.diG.dIE.dIL;
  }
  
  public final <REQ> REQ bLr()
  {
    return this.diG.dID.dIL;
  }
  
  public void dP(int paramInt1, int paramInt2) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */