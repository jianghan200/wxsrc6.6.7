package com.tinkerboots.sdk.a.a;

import android.content.Context;
import com.tinkerboots.sdk.b.c;
import java.util.Map;

public class a
  implements b
{
  public void E(Map<String, String> paramMap) {}
  
  public boolean aWu()
  {
    Context localContext = com.tinkerboots.sdk.b.b.getContext();
    com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.hL(localContext);
    if (!com.tinkerboots.sdk.b.a.isConnected(localContext))
    {
      com.tencent.tinker.lib.f.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, not connect to internet", new Object[0]);
      return false;
    }
    if (com.tencent.tinker.lib.f.b.hN(localContext))
    {
      com.tencent.tinker.lib.f.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, tinker service is running", new Object[0]);
      return false;
    }
    if (!locala.ons)
    {
      com.tencent.tinker.lib.f.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, only request on the main process", new Object[0]);
      return false;
    }
    if (c.cJF())
    {
      com.tencent.tinker.lib.f.a.e("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, is in ignore channel, current channel:%s", new Object[] { c.cJE() });
      return false;
    }
    return true;
  }
  
  public void aWv() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tinkerboots/sdk/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */