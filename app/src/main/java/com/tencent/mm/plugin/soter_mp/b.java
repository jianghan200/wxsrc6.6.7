package com.tencent.mm.plugin.soter_mp;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class b
  implements ar
{
  private static com.tencent.mm.plugin.soter_mp.b.b onZ = new com.tencent.mm.plugin.soter_mp.b.b();
  private static com.tencent.mm.plugin.soter_mp.b.a ooa = new com.tencent.mm.plugin.soter_mp.b.a();
  
  public final HashMap<Integer, h.d> Ci()
  {
    x.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoter getBaseDBFactories");
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoter onAccountPostReset");
    if (!com.tencent.mm.sdk.b.a.sFg.d(onZ)) {
      com.tencent.mm.sdk.b.a.sFg.b(onZ);
    }
    if (!com.tencent.mm.sdk.b.a.sFg.d(ooa)) {
      com.tencent.mm.sdk.b.a.sFg.b(ooa);
    }
  }
  
  public final void bo(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoterMp onSdcardMount");
  }
  
  public final void gi(int paramInt)
  {
    x.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoter clearPluginData");
  }
  
  public final void onAccountRelease()
  {
    x.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoterMp onAccountRelease");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/soter_mp/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */