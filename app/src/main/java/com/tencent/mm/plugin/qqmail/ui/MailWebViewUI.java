package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.widget.FrameLayout;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import java.util.Map;

public class MailWebViewUI
  extends MMActivity
{
  private String bxz;
  private ag handler;
  private d iMQ = new d(this);
  private long mea;
  private MMWebView mhH;
  private View mhI;
  private p.a mhJ = new p.a()
  {
    public final void onError(int paramAnonymousInt, String paramAnonymousString)
    {
      MailWebViewUI.a(MailWebViewUI.this).post(new MailWebViewUI.1.2(this, paramAnonymousString));
    }
    
    public final void onSuccess(String paramAnonymousString, Map paramAnonymousMap)
    {
      MailWebViewUI.a(MailWebViewUI.this).post(new MailWebViewUI.1.1(this, paramAnonymousString));
    }
  };
  
  protected final int getLayoutId()
  {
    return R.i.qqmail_webview;
  }
  
  protected final void initView()
  {
    this.mhI = findViewById(R.h.web_navigator);
    if (this.mhI != null) {
      this.mhI.setVisibility(8);
    }
    boolean bool = getIntent().getBooleanExtra("singleColumn", false);
    this.mhH = MMWebView.a.cS(this.mController.tml);
    this.mhH.setBackgroundDrawable(a.f(this, R.e.navpage));
    ((FrameLayout)findViewById(R.h.container)).addView(this.mhH);
    this.mhH.getSettings().setJavaScriptEnabled(true);
    if (Boolean.valueOf(bool).booleanValue())
    {
      MMWebView localMMWebView = this.mhH;
      if (Build.VERSION.SDK_INT >= 8) {
        localMMWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      }
    }
    this.mhH.getSettings().cIr();
    this.mhH.getSettings().setSupportZoom(true);
    this.mhH.getSettings().setBuiltInZoomControls(true);
    this.mhH.setWebViewClient(new MailWebViewUI.3(this));
    this.mhH.setWebChromeClient(new MailWebViewUI.4(this));
    this.mhH.cAx();
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        MailWebViewUI.this.finish();
        return true;
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.handler = new ag();
    initView();
    paramBundle = getIntent().getStringExtra("title");
    if (paramBundle != null) {
      setMMTitle(paramBundle);
    }
    this.iMQ.K(new MailWebViewUI.2(this));
  }
  
  protected void onDestroy()
  {
    this.mhH.setVisibility(8);
    this.mhH.destroy();
    this.mhH = null;
    this.iMQ.release();
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    WebView.disablePlatformNotifications();
  }
  
  protected void onResume()
  {
    super.onResume();
    WebView.enablePlatformNotifications();
  }
  
  protected void onStop()
  {
    this.mhH.stopLoading();
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */