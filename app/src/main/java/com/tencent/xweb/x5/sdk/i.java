package com.tencent.xweb.x5.sdk;

import android.content.Context;
import com.tencent.smtt.sdk.WebView;

public final class i
  implements c
{
  public final boolean getCanReboot()
  {
    return WebView.getTbsNeedReboot();
  }
  
  public final String getCrashExtraMessage(Context paramContext)
  {
    return WebView.getCrashExtraMessage(paramContext);
  }
  
  public final int getTbsCoreVersion(Context paramContext)
  {
    return WebView.getTbsCoreVersion(paramContext);
  }
  
  public final int getTbsSDKVersion(Context paramContext)
  {
    return WebView.getTbsSDKVersion(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/xweb/x5/sdk/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */