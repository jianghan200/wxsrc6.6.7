package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.pluginsdk.wallet.a;
import com.tencent.mm.pluginsdk.wallet.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  implements k
{
  public final void a(a parama)
  {
    x.i("MicroMsg.SoterPrePayAuthDelegate", "hy: pre auth prepare.");
    if (bi.oW(s.pqR.jgX))
    {
      x.e("MicroMsg.SoterPrePayAuthDelegate", "hy: no challenge. failed.");
      parama.af(-1, "no challenge");
      return;
    }
    parama.af(0, "");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */