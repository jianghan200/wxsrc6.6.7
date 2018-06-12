package com.tencent.mm.plugin.webview.ui.tools;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMWebView;

public final class h
{
  String gsE;
  boolean qaV = false;
  MMWebView qaW;
  WebViewUI qaX;
  int qaY;
  
  public h(WebViewUI paramWebViewUI)
  {
    this.qaX = paramWebViewUI;
  }
  
  final void bWM()
  {
    int i = bWN();
    this.qaX.lF(i);
    Object localObject = this.qaX.mController;
    if (Build.VERSION.SDK_INT >= 21) {
      ((s)localObject).getSupportActionBar().setElevation(1.0F);
    }
    localObject = this.qaX.findViewById(R.h.webview_logo_container);
    if (localObject != null) {
      ((View)localObject).setBackgroundColor(bWN());
    }
    i = this.qaX.getResources().getColor(R.e.webview_x5logo_text_color);
    localObject = this.qaX.findViewById(R.h.x5_logo_url);
    if ((localObject != null) && ((localObject instanceof TextView))) {
      ((TextView)localObject).setTextColor(i);
    }
    localObject = this.qaX.findViewById(R.h.info_txt);
    if ((localObject != null) && ((localObject instanceof TextView))) {
      ((TextView)localObject).setTextColor(i);
    }
    localObject = this.qaX.findViewById(R.h.x5_logo_img);
    if ((localObject != null) && ((localObject instanceof ImageView))) {
      ((ImageView)localObject).setImageResource(R.k.webview_logo_qqbrowser_light);
    }
  }
  
  public final int bWN()
  {
    int i = 0;
    if (this.qaX == null)
    {
      if (i != 0) {
        return this.qaX.getResources().getColor(R.e.webview_mp_actionbar_color);
      }
    }
    else
    {
      String str2 = this.gsE;
      String str1 = str2;
      if (bi.oW(str2)) {
        str1 = this.qaX.getRawUrl();
      }
      if ((bi.oW(str1)) || ((!str1.startsWith("http://mp.weixin.qq.com/s?")) && (!str1.startsWith("https://mp.weixin.qq.com/s?")))) {
        break label93;
      }
    }
    label93:
    for (i = 1;; i = 0)
    {
      break;
      return this.qaX.getResources().getColor(R.e.webview_actionbar_color);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */