package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.xweb.p;

public class WebViewTestUI
  extends MMActivity
{
  private p fwL = new WebViewTestUI.1(this);
  MMWebViewWithJsApi pXy;
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("rawUrl");
    this.pXy = MMWebViewWithJsApi.a.eC(this);
    this.pXy.setWebViewClient(this.fwL);
    setContentView(this.pXy);
    this.pXy.loadUrl(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/WebViewTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */