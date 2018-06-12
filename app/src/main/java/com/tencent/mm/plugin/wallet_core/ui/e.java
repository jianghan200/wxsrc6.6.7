package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;

public final class e
  extends p
{
  private Context context;
  
  public e(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final boolean b(WebView paramWebView, String paramString)
  {
    paramWebView = new Intent();
    paramWebView.putExtra("rawUrl", paramString);
    x.d("MicroMsg.ProtoColWebViewClient", "raw url: %s", new Object[] { paramWebView.getStringExtra("rawUrl") });
    d.b(this.context, "webview", ".ui.tools.WebViewUI", paramWebView);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */