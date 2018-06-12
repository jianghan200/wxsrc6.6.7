package com.tencent.mm.plugin.auto.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class b
  implements ar
{
  private a gRh = new a();
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.auto.SubCoreAuto", "onAccountPostReset");
    a locala = this.gRh;
    com.tencent.mm.sdk.b.a.sFg.b(locala.gRf);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.i("MicroMsg.auto.SubCoreAuto", "onAccountRelease");
    a locala = this.gRh;
    com.tencent.mm.sdk.b.a.sFg.c(locala.gRf);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/auto/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */