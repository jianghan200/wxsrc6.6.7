package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.bq;
import com.tencent.mm.g.a.bq.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.c.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends c<bq>
  implements e
{
  private bq jgp;
  private boolean jgq = false;
  
  public b()
  {
    this.sFo = bq.class.getName().hashCode();
  }
  
  private boolean a(bq parambq)
  {
    if (!g.Eg().Dx()) {
      x.e("MicroMsg.CloseFingerPrintEventListener", "CloseFingerPrintEvent account is not ready");
    }
    do
    {
      return false;
      this.jgq = false;
    } while (!(parambq instanceof bq));
    this.jgp = parambq;
    x.i("MicroMsg.CloseFingerPrintEventListener", "handle CloseFingerPrintEvent");
    g.Ek();
    g.Eh().dpP.a(385, this);
    parambq = new d();
    g.Ek();
    g.Eh().dpP.a(parambq, 0);
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof d))
    {
      paraml = new bq.a();
      x.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label134;
      }
      x.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is success");
    }
    for (paraml.retCode = 0;; paraml.retCode = paramInt2)
    {
      g.Ek();
      g.Eh().dpP.b(385, this);
      this.jgp.bJb = paraml;
      this.jgq = true;
      if (this.jgp.bJX != null) {
        this.jgp.bJX.run();
      }
      if (this.jgq) {
        this.jgp = null;
      }
      return;
      label134:
      x.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is fail");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */