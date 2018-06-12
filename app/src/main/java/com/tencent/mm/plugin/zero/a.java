package com.tencent.mm.plugin.zero;

import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class a
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.zero.b.a
{
  private com.tencent.mm.k.c qxA = new com.tencent.mm.k.c();
  private com.tencent.mm.k.e qxz = new com.tencent.mm.k.e();
  
  public final com.tencent.mm.k.e AT()
  {
    g.Ek();
    g.Eg().Ds();
    return this.qxz;
  }
  
  public final com.tencent.mm.k.c AU()
  {
    g.Ek();
    g.Eg().Ds();
    return this.qxA;
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    if (paramc.dqH)
    {
      paramc = this.qxA;
      File localFile1 = new File(com.tencent.mm.compatible.util.e.bnE + "configlist/");
      if (localFile1.exists())
      {
        File localFile2 = new File(com.tencent.mm.k.c.dgQ);
        if (!localFile2.exists())
        {
          x.d("MicroMsg.ConfigListDecoder", "bugfix");
          paramc.d(localFile1, localFile2);
        }
      }
    }
    this.qxz.kS();
    this.qxA.init();
  }
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/zero/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */