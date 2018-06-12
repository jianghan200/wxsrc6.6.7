package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.mm.R.g;

public class QRCodeIntroductionWebViewUI
  extends WebViewUI
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addIconOptionMenu(0, R.g.mm_title_btn_menu, new QRCodeIntroductionWebViewUI.1(this));
    setBackBtn(new QRCodeIntroductionWebViewUI.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/QRCodeIntroductionWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */