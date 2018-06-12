package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.websearch.api.ad;

public class FTSWebViewUI
  extends FTSBaseWebViewUI
{
  private void bXz()
  {
    if (this.scene == 21) {
      ad.Ad(19);
    }
  }
  
  protected final void ant()
  {
    super.ant();
    ad.Ab(this.scene);
    if (this.scene == 21) {
      ad.Ad(17);
    }
  }
  
  protected final void bWw()
  {
    bXz();
    super.bWw();
  }
  
  protected final String getHint()
  {
    return getString(R.l.app_search);
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    bXz();
  }
  
  public void onClickCancelBtn(View paramView)
  {
    super.onClickCancelBtn(paramView);
    finish();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    ad.bTl();
    ad.bTm();
    if (this.scene == 21) {
      ad.Ad(18);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    ad.bTk();
  }
  
  protected void onResume()
  {
    super.onResume();
    ad.bTj();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */