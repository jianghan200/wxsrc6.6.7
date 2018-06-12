package com.tencent.mm.plugin.chatroom.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.jg.JgClassChecked;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;

@Deprecated
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public class RoomAnnouncementUI
  extends MMActivity
{
  private String fsV;
  private WebView hNb;
  private boolean hNc;
  
  public final int getLayoutId()
  {
    return R.i.chatroom_announcement;
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  protected final void initView()
  {
    setMMTitle(R.l.room_upgrade_responsibility_title);
    this.hNb = MMWebView.a.l(this, R.h.webview);
    this.hNb.getSettings().setJavaScriptEnabled(true);
    this.hNb.getSettings().cIv();
    this.hNb.getSettings().setBuiltInZoomControls(true);
    this.hNb.getSettings().setUseWideViewPort(true);
    this.hNb.getSettings().setLoadWithOverviewMode(true);
    this.hNb.getSettings().cIq();
    this.hNb.getSettings().cIp();
    this.hNb.getSettings().setGeolocationEnabled(false);
    this.hNb.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
    this.hNb.setWebChromeClient(new RoomAnnouncementUI.1(this));
    this.hNb.setWebViewClient(new RoomAnnouncementUI.2(this));
    setBackBtn(new RoomAnnouncementUI.3(this));
    String str = getString(R.l.chatroom_owner_responsibility, new Object[] { w.chP() });
    this.hNb.loadUrl(str);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hNc = getIntent().getBooleanExtra("need_bind_mobile", false);
    this.fsV = getIntent().getStringExtra("RoomInfo_Id");
    initView();
  }
  
  protected void onDestroy()
  {
    if (this.hNb != null)
    {
      this.hNb.setVisibility(8);
      ((ViewGroup)this.hNb.getParent()).removeView(this.hNb);
      this.hNb.removeAllViews();
      this.hNb.destroy();
      this.hNb = null;
      System.gc();
    }
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/RoomAnnouncementUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */