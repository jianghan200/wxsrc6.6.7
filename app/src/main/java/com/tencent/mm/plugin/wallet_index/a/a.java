package com.tencent.mm.plugin.wallet_index.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.wallet_index.c.h;
import java.util.HashMap;

public class a
  implements ar
{
  private h pCC = new h();
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.pCC.pCW);
    com.tencent.mm.sdk.b.a.sFg.b(this.pCC.pCX);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.pCC.pCW);
    com.tencent.mm.sdk.b.a.sFg.c(this.pCC.pCX);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */