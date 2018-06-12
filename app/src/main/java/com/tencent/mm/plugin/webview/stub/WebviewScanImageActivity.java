package com.tencent.mm.plugin.webview.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.aj;
import com.tencent.mm.g.a.cb;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

@com.tencent.mm.ui.base.a(7)
public class WebviewScanImageActivity
  extends Activity
{
  private int bJr;
  private int bJs;
  private String edG;
  private String nMW = null;
  private c nNd = new WebviewScanImageActivity.1(this);
  private boolean pVh = false;
  private String url;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.WebviewScanImageActivity", "hy: on create");
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().addFlags(Integer.MIN_VALUE);
      getWindow().setStatusBarColor(0);
    }
    setContentView(R.i.layout_empty_activity);
  }
  
  protected void onPause()
  {
    super.onPause();
    x.i("MicroMsg.WebviewScanImageActivity", "hy: on pause");
    aj localaj = new aj();
    localaj.bHK.activity = this;
    localaj.bHK.bHL = this.nMW;
    com.tencent.mm.sdk.b.a.sFg.m(localaj);
    com.tencent.mm.sdk.b.a.sFg.c(this.nNd);
    finish();
  }
  
  protected void onStart()
  {
    super.onStart();
    x.i("MicroMsg.WebviewScanImageActivity", "hy: on start");
    if ((!this.pVh) && (getIntent() != null))
    {
      this.nMW = getIntent().getStringExtra("key_string_for_scan");
      this.bJr = getIntent().getIntExtra("key_codetype_for_scan", 0);
      this.bJs = getIntent().getIntExtra("key_codeversion_for_scan", 0);
      this.url = getIntent().getStringExtra("key_string_for_url");
      this.edG = getIntent().getStringExtra("key_string_for_image_url");
      if (this.nMW != null)
      {
        cb localcb = new cb();
        localcb.bJq.activity = this;
        localcb.bJq.bHL = this.nMW;
        localcb.bJq.bJs = this.bJs;
        localcb.bJq.bJr = this.bJr;
        localcb.bJq.bJt = 6;
        localcb.bJq.imagePath = this.edG;
        localcb.bJq.scene = 40;
        Bundle localBundle = new Bundle();
        localBundle.putString("stat_url", this.url);
        localBundle.putInt("stat_scene", 4);
        localcb.bJq.bJx = localBundle;
        com.tencent.mm.sdk.b.a.sFg.m(localcb);
        com.tencent.mm.sdk.b.a.sFg.b(this.nNd);
      }
    }
    this.pVh = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/stub/WebviewScanImageActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */