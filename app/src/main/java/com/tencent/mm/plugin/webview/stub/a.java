package com.tencent.mm.plugin.webview.stub;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static final boolean aW(Context paramContext, String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        paramContext = s.getPackageInfo(paramContext, "com.tencent.weread");
        if (paramContext != null) {}
        for (boolean bool = true;; bool = false)
        {
          x.d("MicroMsg.ConstantsWebViewStub", "isWeReadSupportShare(%s).", new Object[] { Boolean.valueOf(bool) });
          if ((paramContext == null) || (!Uri.parse(paramString).getHost().startsWith("mp.weixin.qq.com"))) {
            break;
          }
          int i = paramContext.versionCode;
          if (i <= 2000812) {
            break;
          }
          return true;
        }
        return false;
      }
      catch (Exception paramContext)
      {
        x.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQzoneSupportShare(), e : %s.", new Object[] { paramContext.getMessage() });
      }
    }
  }
  
  public static final boolean ey(Context paramContext)
  {
    try
    {
      paramContext = s.getPackageInfo(paramContext, "com.tencent.mobileqq");
      if (paramContext != null) {}
      for (boolean bool = true;; bool = false)
      {
        x.d("MicroMsg.ConstantsWebViewStub", "isQQSupportShare(%s).", new Object[] { Boolean.valueOf(bool) });
        if (paramContext == null) {
          break;
        }
        return true;
      }
      return false;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQQSupportShare(), e : %s.", new Object[] { paramContext.getMessage() });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/stub/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */