package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class n
{
  public static String aV(Context paramContext, String paramString)
  {
    Object localObject = "MicroMsg.WechatWebViewUserAgentUtil, appendUserAgent fail, context is null, stack = " + bi.cjd();
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue((String)localObject, bool);
      if (paramString != null) {
        break label222;
      }
    }
    label222:
    for (paramString = " MicroMessenger/";; paramString = paramString + " MicroMessenger/")
    {
      localObject = getPackageInfo(paramContext, ad.getPackageName());
      paramContext = paramString;
      if (localObject != null)
      {
        paramContext = paramString + e.aj(null, com.tencent.mm.protocal.d.qVN);
        paramContext = paramContext + "." + ((PackageInfo)localObject).versionCode;
        paramContext = paramContext + "(" + com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION + ")";
      }
      paramString = ao.fH(ad.getContext());
      paramContext = paramContext + " NetType/" + paramString;
      paramContext = paramContext + " Language/" + w.fD(ad.getContext());
      x.i("MicroMsg.WechatWebViewUserAgentUtil", "appendUserAgent, uaStr = " + paramContext);
      return paramContext;
      bool = false;
      break;
    }
  }
  
  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    if (paramString == null)
    {
      x.e("MicroMsg.WechatWebViewUserAgentUtil", "getPackageInfo fail, packageName is null");
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      x.printErrStackTrace("MicroMsg.WechatWebViewUserAgentUtil", paramContext, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */