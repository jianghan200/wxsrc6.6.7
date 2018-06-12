package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import com.tencent.mm.R.e;

public abstract class WebSearchBaseActivity
  extends CustomStatusBarMMActivity
{
  protected final int getStatusBarColor()
  {
    return getResources().getColor(R.e.websearch_bg);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cqf();
    nS(-16777216);
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().getCustomView().setBackgroundColor(getResources().getColor(R.e.websearch_bg));
      getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.e.websearch_bg)));
    }
    setBackBtn(new WebSearchBaseActivity.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/WebSearchBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */