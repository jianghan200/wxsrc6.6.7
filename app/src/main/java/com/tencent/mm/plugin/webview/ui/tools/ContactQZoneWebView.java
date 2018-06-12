package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;

public class ContactQZoneWebView
  extends WebViewUI
{
  private String lRt = "";
  private boolean pVm = false;
  private String pVn = "";
  
  final void Ra(String paramString)
  {
    if (this.pVm) {
      return;
    }
    this.pVm = true;
    Object localObject = paramString.substring(19);
    x.d("MicroMsg.ContactQZoneWebView", "get url :" + (String)localObject);
    paramString = new Intent();
    paramString.putExtra("nowUrl", (String)localObject);
    paramString.putExtra("tweetid", bi.oV(getIntent().getStringExtra("tweetid")));
    paramString.putExtra("htmlData", this.pVn);
    paramString.putExtra("type", getIntent().getIntExtra("type", 0));
    localObject = new Bundle();
    ((Bundle)localObject).putInt("stat_scene", 4);
    ((Bundle)localObject).putString("stat_url", getCurrentURL());
    paramString.putExtra("_stat_obj", (Bundle)localObject);
    startActivity(paramString);
    a.ezn.r(paramString, this);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(getString(R.l.contact_info_qq_view_qzone));
    this.mhH.setWebViewClient(new ContactQZoneWebView.1(this));
    this.mhH.loadUrl(this.cbP);
    x.d("MicroMsg.ContactQZoneWebView", "loadUrl:loadUrl, url = " + this.cbP);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.pVm = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/ContactQZoneWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */