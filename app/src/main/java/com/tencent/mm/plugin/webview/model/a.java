package com.tencent.mm.plugin.webview.model;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.n;

public final class a
{
  private static String[] pQW = null;
  
  public static void a(MMWebView paramMMWebView, d paramd)
  {
    if (paramd == null) {
      x.e("MicroMsg.AutoPlayLogic", "invoker null");
    }
    String str;
    do
    {
      return;
      if (paramMMWebView == null)
      {
        x.e("MicroMsg.AutoPlayLogic", "webView null");
        return;
      }
      str = paramMMWebView.getUrl();
      x.i("MicroMsg.AutoPlayLogic", "currentUrl:%s", new Object[] { str });
    } while (bi.oW(str));
    if (a(str, paramd))
    {
      a(paramMMWebView, true);
      x.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (true)");
      return;
    }
    a(paramMMWebView, false);
    x.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (false)");
  }
  
  private static void a(MMWebView paramMMWebView, boolean paramBoolean)
  {
    if (paramMMWebView.getIsX5Kernel()) {
      try
      {
        Bundle localBundle = new Bundle();
        if (!paramBoolean) {}
        for (paramBoolean = true;; paramBoolean = false)
        {
          localBundle.putBoolean("require", paramBoolean);
          a.a.cJ(paramMMWebView.getX5WebViewExtension()).y("invokeMiscMethod", new Object[] { "setVideoPlaybackRequiresUserGesture", localBundle });
          return;
        }
        x.i("MicroMsg.AutoPlayLogic", "not x5 all enable");
      }
      catch (Exception paramMMWebView)
      {
        x.e("MicroMsg.AutoPlayLogic", "enableAutoPlay :%s", new Object[] { paramMMWebView });
        return;
      }
    }
    paramMMWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
  }
  
  private static boolean a(String paramString, d paramd)
  {
    boolean bool2 = false;
    if (pQW == null) {}
    for (;;)
    {
      int i;
      try
      {
        Object localObject = paramd.g(100, new Bundle());
        paramd = null;
        if (localObject != null) {
          paramd = ((Bundle)localObject).getString("enable_auto_play_host_paths");
        }
        x.i("MicroMsg.AutoPlayLogic", "autoPlayHostsStr config:%s", new Object[] { paramd });
        localObject = paramd;
        if (bi.oW(paramd)) {
          localObject = "mp.weixin.qq.com/s;mp.weixin.qq.com/mp/appmsg/show";
        }
        pQW = ((String)localObject).split(";");
        paramString = Uri.parse(paramString);
        paramString = paramString.getAuthority() + paramString.getPath();
        i = 0;
        boolean bool1 = bool2;
        if (i < pQW.length)
        {
          if (paramString.startsWith(pQW[i])) {
            bool1 = true;
          }
        }
        else {
          return bool1;
        }
      }
      catch (RemoteException paramString)
      {
        x.w("MicroMsg.AutoPlayLogic", "isOauthHost exp:%s", new Object[] { paramString.getLocalizedMessage() });
        return false;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */