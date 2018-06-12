package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x;
import com.tencent.mm.plugin.webview.ui.tools.widget.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.c.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.f.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;

public final class h
  extends a
{
  public h(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
  }
  
  protected final void bzQ()
  {
    WebView localWebView;
    Object localObject;
    String str1;
    if ((x)bzL() != null)
    {
      localWebView = (WebView)getView();
      localObject = (x)bzL();
      if ((TextUtils.isEmpty(((x)localObject).url)) || (TextUtils.isEmpty(((x)localObject).ntU))) {
        break label170;
      }
      String str2 = AdLandingPagesProxy.getInstance().getUin();
      str1 = ad.l(((x)localObject).url, new String[] { "uxinfo=" + ((x)localObject).ntU, "uin=" + str2 });
      if (((x)localObject).bID != 1) {
        break label178;
      }
      localObject = AdLandingPagesProxy.getInstance().getAdVoteInfo(((x)localObject).url, ((x)localObject).ntU, str2);
      if (bi.oW((String)localObject)) {
        break label178;
      }
      str1 = str1 + "&" + (String)localObject;
    }
    label170:
    label178:
    for (;;)
    {
      localWebView.loadUrl(str1);
      return;
      str1 = ((x)localObject).url;
    }
  }
  
  protected final View bzR()
  {
    MMWebView localMMWebView = f.a.qkE.cS(this.context);
    localMMWebView.getSettings().cIs();
    localMMWebView.getSettings().cIw();
    localMMWebView.getSettings().cIv();
    localMMWebView.setWebViewClient(c.a.qkD.a(localMMWebView, new d()
    {
      public final boolean c(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        switch (paramAnonymousInt)
        {
        default: 
          return false;
        }
        x localx = (x)h.this.bzL();
        paramAnonymousInt = paramAnonymousBundle.getInt("sns_landing_pages_ad_vote_index");
        AdLandingPagesProxy.getInstance().saveAdVoteInfo(localx.url, localx.ntU, localx.uin, paramAnonymousInt, 0);
        return false;
      }
    }));
    return localMMWebView;
  }
  
  public final void bzz()
  {
    super.bzz();
    WebView localWebView = (WebView)getView();
    if ((localWebView != null) && (localWebView.getParent() != null))
    {
      ((ViewGroup)localWebView.getParent()).removeView(localWebView);
      localWebView.setTag(null);
      localWebView.destroy();
    }
    this.contentView = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */