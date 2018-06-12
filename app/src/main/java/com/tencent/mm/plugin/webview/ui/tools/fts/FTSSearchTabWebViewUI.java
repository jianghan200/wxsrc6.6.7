package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.base.a;

@a(3)
public class FTSSearchTabWebViewUI
  extends FTSBaseWebViewUI
{
  protected final boolean anv()
  {
    return true;
  }
  
  public String getHint()
  {
    String str = getIntent().getStringExtra("key_search_input_hint");
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    int i = -1;
    switch (this.type)
    {
    }
    while (i < 0)
    {
      return com.tencent.mm.sdk.platformtools.ad.getContext().getResources().getString(R.l.app_search);
      i = R.l.search_education_biz_contact;
      continue;
      i = R.l.fts_header_timeline;
      continue;
      i = R.l.search_education_article;
      continue;
      i = R.l.fts_header_poi;
      continue;
      i = R.l.app_brand_entrance;
      continue;
      i = R.l.fts_header_emoji;
      continue;
      i = R.l.fts_header_emoji_product;
      continue;
      i = R.l.fts_header_music;
      continue;
      i = R.l.fts_header_novel;
    }
    return com.tencent.mm.sdk.platformtools.ad.getContext().getResources().getString(R.l.search_detail_page_hint, new Object[] { com.tencent.mm.sdk.platformtools.ad.getContext().getResources().getString(i) });
  }
  
  public void onClickCancelBtn(View paramView)
  {
    super.onClickCancelBtn(paramView);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(R.h.action_bar_container), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    cqh();
  }
  
  protected void onPause()
  {
    super.onPause();
    com.tencent.mm.plugin.websearch.api.ad.bTk();
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.plugin.websearch.api.ad.bTj();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchTabWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */