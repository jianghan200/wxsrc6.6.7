package com.tencent.mm.plugin.brandservice.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.m.a;
import com.tencent.mm.ac.z;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.a;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper;
import com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper.a;

public class SearchOrRecommendBizUI
  extends MMActivity
  implements BizSearchResultItemContainer.b
{
  private int hnT = 0;
  private BizSearchResultItemContainer hom;
  private int hop = 0;
  private ProgressDialog hpV = null;
  private SearchViewNotRealTimeHelper hpW;
  
  public final void auU()
  {
    ActionBarActivity localActionBarActivity = this.mController.tml;
    getString(b.h.app_tip);
    this.hpV = h.a(localActionBarActivity, getString(b.h.contact_search_recommend_biz_searching), true, new SearchOrRecommendBizUI.6(this));
  }
  
  public final void auV()
  {
    if (this.hpV != null)
    {
      this.hpV.dismiss();
      this.hpV = null;
    }
  }
  
  protected final int getLayoutId()
  {
    return b.e.contact_search_recommend_biz;
  }
  
  protected final void initView()
  {
    setMMTitle(b.h.contact_search_recommend_biz_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SearchOrRecommendBizUI.this.YC();
        SearchOrRecommendBizUI.this.finish();
        return true;
      }
    });
    this.hpW = ((SearchViewNotRealTimeHelper)findViewById(b.d.search_view));
    this.hpW.setSearchColor(getResources().getColor(b.a.normal_text_color));
    this.hpW.setSearchHint(getString(b.h.contact_search_recommend_biz_title));
    this.hpW.setSearchHintColor(getResources().getColor(b.a.hint_color_white_bg));
    this.hpW.setSearchIcon(0);
    this.hpW.setShowBackIcon(false);
    this.hpW.setCallBack(new SearchViewNotRealTimeHelper.a()
    {
      public final void ava()
      {
        SearchOrRecommendBizUI.this.showVKB();
      }
      
      public final boolean pj(String paramAnonymousString)
      {
        wY(paramAnonymousString);
        return true;
      }
      
      public final void wY(String paramAnonymousString)
      {
        if (!bi.oW(paramAnonymousString))
        {
          SearchOrRecommendBizUI.this.YC();
          SearchOrRecommendBizUI.a(SearchOrRecommendBizUI.this).aV(paramAnonymousString, 0);
          return;
        }
        h.bA(SearchOrRecommendBizUI.this.mController.tml, SearchOrRecommendBizUI.this.getString(b.h.contact_search_recommend_biz_notext));
      }
    });
    this.hom = ((BizSearchResultItemContainer)findViewById(b.d.searchResultItemContainer));
    this.hom.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        SearchOrRecommendBizUI.b(SearchOrRecommendBizUI.this).clearFocus();
        SearchOrRecommendBizUI.this.YC();
        return false;
      }
    });
    f localf = new f(this);
    localf.hpR = com.tencent.mm.plugin.brandservice.b.f.auO();
    this.hom.setAdapter(localf);
    this.hom.setBusinessTypes(new long[] { 1L });
    this.hom.setDisplayArgs$25decb5(false);
    this.hom.setMode(1);
    this.hom.setScene(this.hop);
    this.hom.setIOnSearchStateChangedListener(this);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hnT = getIntent().getIntExtra("intent_extra_entry_flag", 0);
    this.hop = getIntent().getIntExtra("fromScene", 0);
    initView();
    if (com.tencent.mm.plugin.brandservice.b.f.auN())
    {
      g.DF().a(456, new SearchOrRecommendBizUI.1(this));
      g.DF().a(new com.tencent.mm.plugin.brandservice.b.f(), 0);
    }
    paramBundle = getIntent().getStringExtra("Search_Str");
    if (!bi.oW(paramBundle)) {
      new ag(Looper.getMainLooper()).post(new SearchOrRecommendBizUI.2(this, paramBundle));
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    z.Ni().MS();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/SearchOrRecommendBizUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */