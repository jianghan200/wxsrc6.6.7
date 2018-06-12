package com.tencent.mm.model.gdpr.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.o.a.b;
import com.tencent.mm.plugin.webview.ui.tools.widget.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.c.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.f.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMWebView;
import java.io.File;
import java.util.Locale;

@com.tencent.mm.ui.base.a(1)
public class MPGdprPolicyUI
  extends MMActivity
{
  private MMFalseProgressBar dEm;
  private MMWebView dEn;
  private com.tencent.mm.model.gdpr.a dEo;
  private String dEp;
  private ResultReceiver dEq;
  
  private void bw(boolean paramBoolean)
  {
    ResultReceiver localResultReceiver;
    if (this.dEq != null)
    {
      localResultReceiver = this.dEq;
      if (!paramBoolean) {
        break label25;
      }
    }
    label25:
    for (int i = 1;; i = -1)
    {
      localResultReceiver.send(i, null);
      return;
    }
  }
  
  @SuppressLint({"SetJavaScriptEnabled", "InlinedApi"})
  protected final void dealContentView(View paramView)
  {
    super.dealContentView(paramView);
    this.dEn = f.a.qkE.cS(this);
    this.dEn.getSettings().cIv();
    this.dEn.getSettings().setJavaScriptEnabled(true);
    this.dEn.getSettings().setMediaPlaybackRequiresUserGesture(false);
    this.dEn.getSettings().cIx();
    this.dEn.getSettings().setUserAgentString(com.tencent.mm.plugin.webview.ui.tools.widget.n.aV(this.mController.tml, this.dEn.getSettings().getUserAgentString()) + " miniProgram");
    this.dEn.getView().setHorizontalScrollBarEnabled(false);
    this.dEn.getView().setVerticalScrollBarEnabled(false);
    this.dEn.getSettings().setBuiltInZoomControls(true);
    this.dEn.getSettings().setUseWideViewPort(true);
    this.dEn.getSettings().setLoadWithOverviewMode(true);
    this.dEn.getSettings().cIq();
    this.dEn.getSettings().cIp();
    this.dEn.getSettings().setGeolocationEnabled(true);
    this.dEn.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    this.dEn.getSettings().cIt();
    this.dEn.getSettings().setAppCachePath(this.mController.tml.getDir("webviewcache", 0).getAbsolutePath());
    this.dEn.getSettings().cIs();
    this.dEn.getSettings().cIu();
    this.dEn.getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.duM + "databases/");
    Bundle localBundle = new Bundle(1);
    localBundle.putBoolean("KInitialParam_Force_wcPrivacyPolicyResult_DoInService", true);
    this.dEn.setWebViewClient(c.a.qkD.a(this.dEn, new MPGdprPolicyUI.1(this), localBundle));
    this.dEn.setWebChromeClient(com.tencent.mm.plugin.webview.ui.tools.widget.a.a.qkC.a(this.dEn, new MPGdprPolicyUI.2(this)));
    ((FrameLayout)paramView).addView(this.dEn, -1, -1);
    this.dEm = new MMFalseProgressBar(this);
    this.dEm.setProgressDrawable(com.tencent.mm.bp.a.f(this, com.tencent.mm.plugin.o.a.a.mm_webview_progress_horizontal));
    ((FrameLayout)paramView).addView(this.dEm, -1, com.tencent.mm.bp.a.fromDPToPix(this, 3));
  }
  
  public void finish()
  {
    super.finish();
    if (this.dEq != null)
    {
      bw(false);
      this.dEq = null;
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    try
    {
      if (getIntent() != null)
      {
        paramBundle = (ResultReceiver)getIntent().getParcelableExtra("MPGdprPolicyUI_KEY_RECEIVER");
        this.dEq = paramBundle;
        if (paramBundle != null) {}
      }
      else
      {
        finish();
        return;
      }
    }
    catch (Exception paramBundle)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MPGdprPolicyUI", "onCreate get receiver ex = %s", new Object[] { paramBundle });
      finish();
      return;
    }
    this.dEo = com.tencent.mm.model.gdpr.a.iY(getIntent().getStringExtra("MPGdprPolicyUI_KEY_BUSINESS"));
    if (this.dEo == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MPGdprPolicyUI", "onCreate get empty business");
      bw(false);
      finish();
      return;
    }
    this.dEp = getIntent().getStringExtra("MPGdprPolicyUI_KEY_APPID");
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    try
    {
      this.dEn.destroy();
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MPGdprPolicyUI", "destroy WebView e = %s", new Object[] { localException });
      return;
    }
    finally
    {
      this.dEn = null;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.dEn.canGoBack()))
    {
      this.dEn.goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    setBackBtn(new MPGdprPolicyUI.3(this), a.b.actionbar_icon_dark_close);
    lF(-1);
    paramBundle = String.format(Locale.US, "https://weixin.qq.com/cgi-bin/newreadtemplate?t=gdpr/confirm&business=%s&lang=%s&cc=%s", new Object[] { this.dEo.dEe, w.fD(this), (String)g.Ei().DT().get(274436, null) });
    this.dEn.loadUrl(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/model/gdpr/ui/MPGdprPolicyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */