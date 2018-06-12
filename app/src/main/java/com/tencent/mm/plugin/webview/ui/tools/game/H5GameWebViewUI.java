package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.MMWebView;

@a(19)
public class H5GameWebViewUI
  extends GameWebViewUI
{
  private int lfm;
  
  protected final boolean bVQ()
  {
    return false;
  }
  
  protected final boolean bVZ()
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.H5GameWebViewUI", "onCreate");
    this.jJB = false;
    this.lfm = this.screenOrientation;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.i("MicroMsg.H5GameWebViewUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    boolean bool = getIntent().getBooleanExtra("show_full_screen", false);
    setIntent(paramIntent);
    paramIntent = paramIntent.getStringExtra("rawUrl");
    x.d("MicroMsg.H5GameWebViewUI", "url = " + paramIntent);
    if (!this.pXP.equals(paramIntent))
    {
      if (paramIntent.startsWith("http://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html")) {
        this.pXP = paramIntent;
      }
      if (this.cbP.equals(paramIntent)) {
        break label179;
      }
      this.cbP = paramIntent;
      this.screenOrientation = getIntent().getIntExtra("screen_orientation", -1);
      this.pYo.jIf = this.cbP;
      if (this.gcP != null) {
        break label166;
      }
      this.gcP = new e(this, this.mhH);
    }
    for (;;)
    {
      this.mhH.loadUrl("about:blank");
      super.j(this.cbP, false, -1);
      return;
      label166:
      this.gcP.b(paramIntent, null, null);
    }
    label179:
    this.screenOrientation = this.lfm;
    getIntent().putExtra("show_full_screen", bool);
    bWe();
  }
  
  public void onResume()
  {
    ahy();
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/H5GameWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */