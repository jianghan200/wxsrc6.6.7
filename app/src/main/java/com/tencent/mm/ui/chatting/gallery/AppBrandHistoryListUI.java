package com.tencent.mm.ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.d.b.a;
import com.tencent.mm.ui.chatting.d.b.b;
import com.tencent.mm.ui.chatting.g.a;

public class AppBrandHistoryListUI
  extends MMActivity
  implements b.b
{
  private RecyclerView Sa;
  private String gBf;
  private TextView hOU;
  private ProgressDialog kjo;
  private b.a tTv;
  
  private void dO(boolean paramBoolean)
  {
    x.i("MicroMsg.AppBrandHistoryListUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      this.kjo = p.b(this, getString(R.l.loading_tips), true, 0, null);
    }
    while ((this.kjo == null) || (!this.kjo.isShowing())) {
      return;
    }
    this.kjo.dismiss();
    this.kjo = null;
  }
  
  public final void bz(String paramString, boolean paramBoolean) {}
  
  public final void cwK()
  {
    dO(true);
  }
  
  protected final int getLayoutId()
  {
    return R.i.appbrand_history_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(getString(R.l.chat_app_brand));
    this.hOU = ((TextView)findViewById(R.h.search_nothing_hint));
    this.Sa = ((RecyclerView)findViewById(R.h.history_recycler_view));
    this.Sa.setBackgroundColor(-1);
    this.Sa.setLayoutManager(this.tTv.cwu());
    this.Sa.setAdapter(this.tTv.aau(this.gBf));
    this.Sa.setHasFixedSize(true);
    setBackBtn(new AppBrandHistoryListUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.gBf = getIntent().getStringExtra("Chat_User");
    new a(this).a(this);
    initView();
    this.tTv.cwG();
    if (s.fq(this.gBf))
    {
      h.mEJ.h(14562, new Object[] { this.gBf, Integer.valueOf(0) });
      return;
    }
    h.mEJ.h(14562, new Object[] { this.gBf, Integer.valueOf(1) });
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.tTv.onDetach();
  }
  
  public final void onFinish()
  {
    x.i("MicroMsg.AppBrandHistoryListUI", "[onRefreshed]");
    finish();
  }
  
  public final void y(boolean paramBoolean, int paramInt)
  {
    dO(false);
    x.i("MicroMsg.AppBrandHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      this.hOU.setVisibility(0);
      this.Sa.setVisibility(8);
      this.hOU.setText(getString(R.l.chatting_record_noting_hint));
      return;
    }
    this.hOU.setVisibility(8);
    this.Sa.setVisibility(0);
    this.Sa.getAdapter().RR.notifyChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/AppBrandHistoryListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */