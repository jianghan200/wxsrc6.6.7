package com.tencent.mm.ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.d.d;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.d.a.a;
import com.tencent.mm.ui.chatting.d.a.b;
import com.tencent.mm.ui.chatting.d.a.c;

public class MediaHistoryGalleryUI
  extends MMActivity
  implements View.OnClickListener, a.b
{
  private RecyclerView Sa;
  private long dRd = 0L;
  private int dYK;
  private long dkA = 0L;
  private String gBf;
  private TextView hOU;
  private ProgressDialog kjo;
  private com.tencent.matrix.trace.b.a nYi = new MediaHistoryGalleryUI.1(this);
  private long tNE;
  private View tUD;
  private View tUF;
  private View tUG;
  private View tUH;
  private View tUI;
  private boolean tUz = false;
  private boolean tXA;
  private int tXB = -1;
  private boolean tXC;
  private boolean tXD = true;
  private int tXE;
  private a.a tXx;
  private TextView tXy;
  private boolean tXz;
  
  private void FJ(int paramInt)
  {
    if ((this.tXx.cwz()) && (paramInt > 0))
    {
      this.tUF.setEnabled(true);
      this.tUG.setEnabled(true);
      this.tUH.setEnabled(true);
      this.tUI.setEnabled(true);
      return;
    }
    this.tUF.setEnabled(false);
    this.tUG.setEnabled(false);
    this.tUH.setEnabled(false);
    this.tUI.setEnabled(false);
  }
  
  private void q(boolean paramBoolean, String paramString)
  {
    x.i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      str = paramString;
      if (paramString == null) {
        str = getString(R.l.loading_tips);
      }
      this.kjo = p.b(this, str, true, 0, null);
    }
    while ((this.kjo == null) || (!this.kjo.isShowing()))
    {
      String str;
      return;
    }
    this.kjo.dismiss();
    this.kjo = null;
  }
  
  public final void Fj(int paramInt)
  {
    setMMTitle(getString(R.l.gallery_selected_title, new Object[] { Integer.valueOf(paramInt) }));
    FJ(paramInt);
  }
  
  public final void Fk(int paramInt)
  {
    cwy();
    q(false, "");
    int i = paramInt;
    if (paramInt == 0) {
      i = R.l.gallery_selected_save_err;
    }
    if (this.tXC) {
      h.a(this, i, R.l.app_tip, true, null);
    }
    this.tXC = false;
  }
  
  public final void cwA()
  {
    cwy();
    this.tXC = false;
    q(false, "");
  }
  
  public final void cwB()
  {
    this.tXC = true;
    q(true, getString(R.l.image_saving_tip));
  }
  
  public final void cwC()
  {
    cwy();
    this.tXC = false;
    q(false, "");
    String str = com.tencent.mm.compatible.util.e.dgl.substring(com.tencent.mm.compatible.util.e.dgl.indexOf("tencent/MicroMsg"));
    Toast.makeText(this, getString(R.l.chatting_record_saved, new Object[] { str }), 1).show();
  }
  
  public final boolean cwD()
  {
    return this.tXC;
  }
  
  public final void cwx()
  {
    this.tXx.cwx();
    setMMTitle(getString(R.l.gallery_selected_title, new Object[] { Integer.valueOf(this.tXx.cww()) }));
    this.tUD.setVisibility(0);
    this.tUD.startAnimation(AnimationUtils.loadAnimation(this, R.a.push_up_in));
    FJ(this.tXx.cww());
    removeOptionMenu(0);
    addTextOptionMenu(0, getString(R.l.gallery_grid_cancel_selected_option), new MediaHistoryGalleryUI.5(this));
  }
  
  public final void cwy()
  {
    this.tXx.cwy();
    setMMTitle(this.tXx.Wm());
    this.tUD.setVisibility(8);
    this.tUD.startAnimation(AnimationUtils.loadAnimation(this, R.a.push_down_out));
    removeOptionMenu(0);
    addTextOptionMenu(0, getString(R.l.gallery_grid_selected_option), new MediaHistoryGalleryUI.6(this));
  }
  
  public final View getChildAt(int paramInt)
  {
    return this.Sa.getChildAt(paramInt);
  }
  
  protected final int getLayoutId()
  {
    return R.i.media_history_ui;
  }
  
  protected final void initView()
  {
    super.initView();
    this.tUD = findViewById(R.h.more_bottom_root);
    this.tUG = findViewById(R.h.trans_btn);
    this.tUI = findViewById(R.h.del_btn);
    this.tUH = findViewById(R.h.save_btn);
    this.tUF = findViewById(R.h.fav_btn);
    this.tUF.setTag(Integer.valueOf(1));
    this.tUG.setTag(Integer.valueOf(0));
    this.tUH.setTag(Integer.valueOf(3));
    this.tUI.setTag(Integer.valueOf(2));
    this.tUF.setOnClickListener(this);
    this.tUG.setOnClickListener(this);
    this.tUH.setOnClickListener(this);
    this.tUI.setOnClickListener(this);
    this.tXy = ((TextView)findViewById(R.h.album_tips_bar));
    this.hOU = ((TextView)findViewById(R.h.search_nothing_hint));
    this.Sa = ((RecyclerView)findViewById(R.h.history_recycler_view));
    this.Sa.setBackgroundColor(getResources().getColor(R.e.album_ui_bg));
    findViewById(R.h.content_history).setBackgroundColor(getResources().getColor(R.e.album_ui_bg));
    this.Sa.setLayoutManager(this.tXx.cwu());
    this.Sa.a(this.tXx.gN(this));
    this.Sa.setAdapter(this.tXx.ay(this.gBf, this.tNE));
    this.Sa.setHasFixedSize(true);
    this.Sa.setOnScrollListener(new MediaHistoryGalleryUI.2(this));
    this.Sa.a(new MediaHistoryGalleryUI.3(this));
    setMMTitle(this.tXx.Wm());
    setBackBtn(new MediaHistoryGalleryUI.4(this));
  }
  
  public final void ma(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      q(true, null);
      return;
    }
    this.tXE = ((GridLayoutManager)this.Sa.getLayoutManager()).fj();
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    x.i("MicroMsg.MediaHistoryGalleryUI", "[onBackPressed] ");
    if (this.tXC)
    {
      this.tXx.cwA();
      return;
    }
    finish();
  }
  
  public void onClick(View paramView)
  {
    this.tXx.Fi(((Integer)paramView.getTag()).intValue());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.tUz = true;
    paramBundle = getIntent();
    boolean bool;
    if (paramBundle.getIntExtra("kintent_intent_source", 0) == 1)
    {
      bool = true;
      this.tXz = bool;
      this.gBf = paramBundle.getStringExtra("kintent_talker");
      this.tXB = paramBundle.getIntExtra("kintent_image_index", -1);
      this.tXA = paramBundle.getBooleanExtra("key_is_biz_chat", false);
      this.tNE = getIntent().getLongExtra("key_biz_chat_id", -1L);
      switch (getIntent().getIntExtra("key_media_type", -1))
      {
      }
    }
    for (paramBundle = a.ar(this, a.c.tTt);; paramBundle = a.ar(this, a.c.tTt))
    {
      paramBundle.a(this);
      initView();
      this.tXx.x(true, this.tXB);
      return;
      bool = false;
      break;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.tXx.onDetach();
  }
  
  protected void onPause()
  {
    super.onPause();
    HardCoderJNI.stopPerformace(HardCoderJNI.hcMediaGalleryScrollEnable, this.dYK);
    this.dYK = 0;
    ((com.tencent.matrix.trace.a)com.tencent.matrix.a.tg().g(com.tencent.matrix.trace.a.class)).bsV.b(this.nYi);
    if (bi.VE() > this.dRd) {}
    for (long l = bi.VE() - this.dRd;; l = 1L)
    {
      this.dRd = l;
      HardCoderJNI.reportFPS(703, HardCoderJNI.hcMediaGalleryScrollAction, 1, this.dkA, this.dRd);
      this.dkA = 0L;
      this.dRd = 0L;
      return;
    }
  }
  
  protected void onResume()
  {
    this.dRd = bi.VE();
    ((com.tencent.matrix.trace.a)com.tencent.matrix.a.tg().g(com.tencent.matrix.trace.a.class)).bsV.a(this.nYi);
    super.onResume();
    this.tXx.onResume();
    if (this.tUz)
    {
      if (!this.tXx.cwz()) {
        break label71;
      }
      cwx();
    }
    for (;;)
    {
      this.tUz = false;
      return;
      label71:
      cwy();
    }
  }
  
  public final void y(boolean paramBoolean, int paramInt)
  {
    x.i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(this.tXB) });
    if (paramBoolean)
    {
      q(false, null);
      this.Sa.getAdapter().RR.notifyChanged();
      if (this.tXB > 0)
      {
        if (this.tXB % 4 == 0) {
          this.tXB += 1;
        }
        this.Sa.bg(this.tXB);
      }
      while (paramInt <= 0)
      {
        this.hOU.setVisibility(0);
        this.Sa.setVisibility(8);
        this.hOU.setText(getString(R.l.chatting_record_noting_hint));
        return;
        int i = this.Sa.getAdapter().getItemCount();
        this.Sa.bg(i - 1);
      }
      this.hOU.setVisibility(8);
      this.Sa.setVisibility(0);
      return;
    }
    if (paramInt > 0)
    {
      this.Sa.getAdapter().Z(0, paramInt);
      this.Sa.getAdapter().X(paramInt, this.tXE + paramInt);
      return;
    }
    this.Sa.getAdapter().bl(0);
  }
  
  private static final class a
  {
    public static a.a ar(Context paramContext, int paramInt)
    {
      switch (MediaHistoryGalleryUI.7.tXH[(paramInt - 1)])
      {
      default: 
        return null;
      }
      return new com.tencent.mm.ui.chatting.g.e(paramContext);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */