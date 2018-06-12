package com.tencent.mm.ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvoiceaddr.ui.b;
import com.tencent.mm.plugin.fts.ui.n.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.d.b.a;
import com.tencent.mm.ui.chatting.d.b.b;
import com.tencent.mm.ui.chatting.g.d;
import com.tencent.mm.ui.chatting.g.g;
import com.tencent.mm.ui.tools.e;
import com.tencent.mm.ui.tools.o;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MediaHistoryListUI
  extends MMActivity
  implements b.b
{
  private RecyclerView Sa;
  private String gBf;
  private TextView hOU;
  private ProgressDialog kjo;
  private b.a tTv;
  private b tXI;
  
  private void dO(boolean paramBoolean)
  {
    x.i("MicroMsg.MediaHistoryListUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      this.kjo = p.b(this, getString(R.l.loading_tips), true, 0, null);
    }
    while ((this.kjo == null) || (!this.kjo.isShowing())) {
      return;
    }
    this.kjo.dismiss();
    this.kjo = null;
  }
  
  public final void bz(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      String str = getString(R.l.chatting_record_search_noting_hint, new Object[] { paramString });
      this.hOU.setVisibility(0);
      this.Sa.setVisibility(8);
      TextView localTextView = this.hOU;
      this.hOU.getContext();
      localTextView.setText(com.tencent.mm.plugin.fts.a.f.a(str, paramString));
      return;
    }
    this.hOU.setVisibility(8);
    this.Sa.setVisibility(0);
  }
  
  public final void cwK()
  {
    dO(true);
  }
  
  protected final int getLayoutId()
  {
    return R.i.media_history_ui;
  }
  
  protected final void initView()
  {
    this.tXI = new b();
    this.tXI.mv(false);
    this.tXI.a(this.tTv.cwI());
    this.tXI.erG = false;
    this.hOU = ((TextView)findViewById(R.h.search_nothing_hint));
    this.Sa = ((RecyclerView)findViewById(R.h.history_recycler_view));
    findViewById(R.h.content_history).setBackgroundColor(-1);
    this.Sa.setBackgroundColor(-1);
    this.Sa.setLayoutManager(this.tTv.cwu());
    this.Sa.a(this.tTv.cwF());
    this.Sa.setAdapter(this.tTv.aau(this.gBf));
    this.Sa.setHasFixedSize(true);
    setMMTitle(this.tTv.Wm());
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    finish();
    overridePendingTransition(0, 0);
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
    this.gBf = getIntent().getStringExtra("kintent_talker");
    int i = getIntent().getIntExtra("key_media_type", -1);
    paramBundle = null;
    switch (i)
    {
    default: 
      if (paramBundle == null) {
        x.e("MicroMsg.MediaHistoryListUI", "[onCreate] presenter is null!");
      }
      break;
    }
    label664:
    do
    {
      do
      {
        return;
        paramBundle = new d(this);
        break;
        paramBundle = new com.tencent.mm.ui.chatting.g.h(this);
        break;
        paramBundle = new com.tencent.mm.ui.chatting.g.f(this);
        break;
        paramBundle = new g(this);
        break;
        paramBundle.a(this);
        lF(android.support.v4.content.a.g(this.mController.tml, n.a.normal_actionbar_color));
        cqh();
        initView();
        this.tTv.cwG();
        boolean bool = com.tencent.mm.model.s.fq(this.gBf);
        au.HU();
        paramBundle = c.Ga().ii(this.gBf);
        if (!bool) {
          break label664;
        }
        if (this.tTv.getType() == 6)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramBundle.Nn().size()), Integer.valueOf(1) });
          return;
        }
        if (this.tTv.getType() == -1)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(paramBundle.Nn().size()), Integer.valueOf(1) });
          return;
        }
        if (this.tTv.getType() == 3)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramBundle.Nn().size()), Integer.valueOf(1) });
          return;
        }
      } while (this.tTv.getType() != 5);
      com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramBundle.Nn().size()), Integer.valueOf(1), Integer.valueOf(1) });
      return;
      if (this.tTv.getType() == 6)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        return;
      }
      if (this.tTv.getType() == -1)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        return;
      }
      if (this.tTv.getType() == 3)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
        return;
      }
    } while (this.tTv.getType() != 5);
    com.tencent.mm.plugin.report.service.h.mEJ.h(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.tXI.a(this, paramMenu);
    paramMenu = this.tXI;
    String str = this.tTv.cwJ();
    if ((paramMenu.uBv != null) && (!bi.oW(str))) {
      paramMenu.uBv.setSelectedTag(str);
    }
    this.mController.contentView.postDelayed(new MediaHistoryListUI.1(this), 200L);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.tTv.onDetach();
  }
  
  public final void onFinish()
  {
    x.i("MicroMsg.MediaHistoryListUI", "[onRefreshed]");
    finish();
    overridePendingTransition(0, 0);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 4)
    {
      finish();
      overridePendingTransition(0, 0);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final void onKeyboardStateChanged()
  {
    super.onKeyboardStateChanged();
    if (this.mController.tmG == 2) {
      this.tXI.clearFocus();
    }
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.tXI.a(this, paramMenu);
    return true;
  }
  
  public final void y(boolean paramBoolean, int paramInt)
  {
    dO(false);
    x.i("MicroMsg.MediaHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/MediaHistoryListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */