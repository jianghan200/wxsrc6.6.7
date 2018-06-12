package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.d.a.c.i;
import com.tencent.mm.plugin.soter.b.e;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.ref.WeakReference;

public final class l
  implements j
{
  private String eTo = "";
  private com.tencent.mm.pluginsdk.wallet.a jgD = null;
  private com.tencent.mm.pluginsdk.wallet.a jgE = null;
  WeakReference<WalletBaseUI> jgT = null;
  
  private void ah(int paramInt, String paramString)
  {
    x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
    clear();
    this.jgE.af(paramInt, paramString);
    this.jgE = null;
  }
  
  public final void a(Context paramContext, com.tencent.mm.pluginsdk.wallet.a parama, String paramString)
  {
    x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: prepare");
    this.jgT = new WeakReference((WalletBaseUI)paramContext);
    this.jgD = parama;
    this.eTo = paramString;
    ((WalletBaseUI)this.jgT.get()).jr(1586);
    ((WalletBaseUI)this.jgT.get()).jr(1638);
    com.tencent.mm.plugin.soter.c.a.bFd();
    x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: start gen auth key");
    com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, true, 1, new com.tencent.mm.plugin.fingerprint.c.c(this.eTo), new e());
  }
  
  public final void a(com.tencent.mm.pluginsdk.wallet.a parama, String paramString, int paramInt)
  {
    x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: doOpenFP");
    this.jgE = parama;
    parama = s.pqR.pqT;
    if (parama != null)
    {
      if ((this.jgT != null) && (this.jgT.get() != null)) {
        ((WalletBaseUI)this.jgT.get()).a(new com.tencent.mm.plugin.fingerprint.c.b(parama.vlM, parama.signature, this.eTo), true, true);
      }
      return;
    }
    x.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: signature is null");
    com.tencent.mm.plugin.soter.c.a.c(9, -1000223, -1, "signature is null");
    ag(-1, ad.getContext().getString(a.i.fingerprint_open_fail));
  }
  
  final void ag(int paramInt, String paramString)
  {
    if (this.jgD != null) {
      this.jgD.af(paramInt, paramString);
    }
  }
  
  public final void clear()
  {
    x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: clear");
    if ((this.jgT != null) && (this.jgT.get() != null))
    {
      ((WalletBaseUI)this.jgT.get()).js(1586);
      ((WalletBaseUI)this.jgT.get()).js(1638);
    }
    this.jgD = null;
    s.pqR.reset();
    if ((this.jgT != null) && (this.jgT.get() != null)) {
      this.jgT.clear();
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    String str = paramString;
    if (bi.oW(paramString)) {
      str = ad.getContext().getString(a.i.fingerprint_open_fail);
    }
    if ((paraml instanceof com.tencent.mm.plugin.fingerprint.c.a))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        x.i("MicroMsg.SoterFingerprintOpenDelegate", "get challenge success");
        if (bi.oW(((com.tencent.mm.plugin.fingerprint.c.a)paraml).jgX))
        {
          ag(-1, str);
          return true;
        }
        ah.A(new Runnable()
        {
          public final void run()
          {
            l.this.ag(0, "");
          }
        });
      }
    }
    else
    {
      if (!(paraml instanceof com.tencent.mm.plugin.fingerprint.c.b)) {
        break label201;
      }
      if ((paramInt2 != 0) || (paramInt1 != 0)) {
        break label175;
      }
      x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open success");
      com.tencent.mm.plugin.soter.c.a.bFe();
      com.tencent.mm.plugin.soter.c.a.c(0, 0, 0, "OK");
      ah(0, str);
    }
    for (;;)
    {
      return true;
      x.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: failed get challenge");
      ag(paramInt2, str);
      com.tencent.mm.plugin.soter.c.a.c(7, paramInt1, paramInt2, "get challenge failed");
      return true;
      label175:
      x.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open");
      com.tencent.mm.plugin.soter.c.a.c(8, paramInt1, paramInt2, "open fp pay failed");
      ah(-1, str);
    }
    label201:
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */