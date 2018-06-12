package com.tencent.mm.plugin.nfc;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import java.util.HashMap;

public final class a
  implements ar
{
  private static com.tencent.mm.plugin.hce.a.a lEU = new com.tencent.mm.plugin.hce.a.a();
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    if (!com.tencent.mm.sdk.b.a.sFg.d(lEU)) {
      com.tencent.mm.sdk.b.a.sFg.a(lEU);
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    if (com.tencent.mm.sdk.b.a.sFg.d(lEU)) {
      com.tencent.mm.sdk.b.a.sFg.c(lEU);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/nfc/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */