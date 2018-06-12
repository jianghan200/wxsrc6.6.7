package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.x;

public final class ai
{
  public static ai pRX = new ai();
  public boolean hasInit;
  public e pRY = null;
  
  public static ai bUm()
  {
    return pRX;
  }
  
  public final void setNetWorkState(int paramInt)
  {
    if (this.pRY == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.WebViewVideoProxy", "set networkd state = %d, callbacker == null ? %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      Bundle localBundle;
      if (this.pRY != null)
      {
        localBundle = new Bundle();
        localBundle.putInt("webview_video_proxy_net_state", paramInt);
      }
      try
      {
        this.pRY.g(5005, localBundle);
        return;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.WebViewVideoProxy", "set network state failed : %s", new Object[] { localException.getMessage() });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */