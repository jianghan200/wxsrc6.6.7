package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.a.e;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.a.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

@com.tencent.mm.ui.base.a(3)
public class CardGiftVideoUI
  extends MMActivity
  implements a.a, f.a
{
  private k contextMenuHelper;
  int duration = 0;
  private CardGiftInfo hDa;
  private ImageView hDb;
  private ProgressBar hDe;
  private ag hDf = new ag(Looper.getMainLooper());
  private Bundle hDg;
  private boolean hDh = false;
  private com.tencent.mm.ui.tools.f hDi;
  private int hDj = 0;
  private int hDk = 0;
  private int hDl = 0;
  private int hDm = 0;
  private boolean hEj;
  private RelativeLayout hEk;
  private com.tencent.mm.pluginsdk.ui.tools.f hEl;
  private RelativeLayout hEm;
  private ImageView hEn;
  TextView hEo;
  private MMPinProgressBtn hEp;
  private TextView hEq;
  private al hEr = new al(new CardGiftVideoUI.10(this), true);
  private String videoPath;
  
  private void ayJ()
  {
    if (this.contextMenuHelper == null) {
      this.contextMenuHelper = new k(this.mController.tml);
    }
    if (bi.oW(this.videoPath))
    {
      x.e("MicroMsg.CardGiftVideoUI", "videoPath is null");
      return;
    }
    this.contextMenuHelper.a((VideoTextureView)this.hEl, new CardGiftVideoUI.1(this), new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        switch (paramAnonymousMenuItem.getItemId())
        {
        default: 
          return;
        }
        paramAnonymousMenuItem = t.nX(CardGiftVideoUI.a(CardGiftVideoUI.this));
        if (bi.oW(paramAnonymousMenuItem))
        {
          Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(a.g.video_file_save_failed), 1).show();
          return;
        }
        Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(a.g.video_file_saved, new Object[] { paramAnonymousMenuItem }), 1).show();
        l.a(paramAnonymousMenuItem, CardGiftVideoUI.this);
      }
    });
  }
  
  private void xJ(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.CardGiftVideoUI", "the videoPath is null, fail~!!!");
      setResult(0);
      finish();
      return;
    }
    if (!e.cn(paramString))
    {
      x.e("MicroMsg.CardGiftVideoUI", "the videoPath is %s, the file isn't exist~!!!", new Object[] { paramString });
      setResult(0);
      finish();
      return;
    }
    this.hEl.setVideoPath(paramString);
  }
  
  public final void aY(String paramString, int paramInt)
  {
    if (paramString.equals(this.hDa.hvp)) {
      this.hDf.post(new CardGiftVideoUI.2(this, paramInt));
    }
  }
  
  public final void ayH()
  {
    this.hDi.u(this.hDk, this.hDj, this.hDl, this.hDm);
    this.hDi.a(this.hEk, this.hDb, new CardGiftVideoUI.9(this), null);
  }
  
  public final void cf(String paramString1, final String paramString2)
  {
    if (paramString1.equals(this.hDa.hvp))
    {
      this.hDf.post(new Runnable()
      {
        public final void run()
        {
          CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(8);
          CardGiftVideoUI.a(CardGiftVideoUI.this, paramString2);
          CardGiftVideoUI.b(CardGiftVideoUI.this, CardGiftVideoUI.a(CardGiftVideoUI.this));
          CardGiftVideoUI.i(CardGiftVideoUI.this);
        }
      });
      return;
    }
    if (paramString1.equals(this.hDa.hvq))
    {
      this.hDf.post(new CardGiftVideoUI.4(this, paramString2));
      return;
    }
    x.i("MicroMsg.CardGiftVideoUI", "fieldId:%s is unsuitable", new Object[] { paramString1 });
  }
  
  public final int ck(int paramInt1, int paramInt2)
  {
    return 0;
  }
  
  public final void cl(int paramInt1, int paramInt2) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      x.d("MicroMsg.CardGiftVideoUI", "dispatchKeyEvent");
      ayH();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final void fail(String paramString) {}
  
  protected final int getLayoutId()
  {
    return a.e.card_gift_video_ui;
  }
  
  protected final void initView()
  {
    this.hEk = ((RelativeLayout)findViewById(a.d.video_ui_root));
    this.hEm = ((RelativeLayout)findViewById(a.d.video_root));
    this.hEn = ((ImageView)findViewById(a.d.video_thumb));
    this.hEo = ((TextView)findViewById(a.d.video_duration));
    this.hEp = ((MMPinProgressBtn)findViewById(a.d.video_progress));
    this.hDe = ((ProgressBar)findViewById(a.d.video_loading));
    this.hEq = ((TextView)findViewById(a.d.video_tips));
    this.hEl = new VideoTextureView(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(13);
    this.hEl.setMute(this.hEj);
    this.hEl.setVideoCallback(this);
    this.hEm.addView((View)this.hEl, localLayoutParams);
    this.hDb = ((ImageView)findViewById(a.d.gallery_bg));
    this.hDb.setLayerType(2, null);
    this.hEk.setOnTouchListener(new CardGiftVideoUI.6(this));
    ((View)this.hEl).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        CardGiftVideoUI.this.ayH();
      }
    });
    this.hDi = new com.tencent.mm.ui.tools.f(this);
  }
  
  public final void iy()
  {
    setResult(-1);
    this.hDf.post(new Runnable()
    {
      public final void run()
      {
        x.i("MicroMsg.CardGiftVideoUI", "%d switch video model isVideoPlay %b", new Object[] { Integer.valueOf(CardGiftVideoUI.this.hashCode()), Boolean.valueOf(this.hEu) });
        if (this.hEu)
        {
          ((View)CardGiftVideoUI.e(CardGiftVideoUI.this)).setVisibility(0);
          CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(8);
          return;
        }
        ((View)CardGiftVideoUI.e(CardGiftVideoUI.this)).setVisibility(8);
        CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(0);
      }
    });
    this.hDf.post(new CardGiftVideoUI.12(this));
    this.hEl.start();
    this.duration = (this.hEl.getDuration() / 1000);
    this.hEr.J(500L, 500L);
    x.i("MicroMsg.CardGiftVideoUI", "onPrepared videoView.start duration:%d", new Object[] { Integer.valueOf(this.duration) });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.hDg = paramBundle;
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    if (com.tencent.mm.booter.a.xt() != null) {
      com.tencent.mm.booter.a.xt().xv();
    }
    this.hDa = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    this.videoPath = getIntent().getStringExtra("key_video_path");
    this.hEj = getIntent().getBooleanExtra("key_is_mute", false);
    if (this.hDa == null) {}
    for (paramBundle = "null";; paramBundle = this.hDa.toString())
    {
      x.d("MicroMsg.CardGiftVideoUI", "cardGiftInfo %s", new Object[] { paramBundle });
      x.d("MicroMsg.CardGiftVideoUI", "videoPath:%s, isMute:%b", new Object[] { this.videoPath, Boolean.valueOf(this.hEj) });
      initView();
      com.tencent.mm.plugin.card.d.a.a(this);
      ayJ();
      if (this.hDa != null) {
        break;
      }
      x.e("MicroMsg.CardGiftVideoUI", "cardGiftInfo is null");
      return;
    }
    if (!bi.oW(this.hDa.hvp))
    {
      com.tencent.mm.plugin.card.d.a.g(this.hDa.hvq, this.hDa.hvt, this.hDa.hvC, 2);
      com.tencent.mm.plugin.card.d.a.g(this.hDa.hvp, this.hDa.hvs, this.hDa.hvB, 1);
      return;
    }
    x.e("MicroMsg.CardGiftVideoUI", "fromUserContentVideoUrl is null");
  }
  
  protected void onDestroy()
  {
    this.hEl.stop();
    this.hEr.SO();
    com.tencent.mm.plugin.card.d.a.b(this);
    super.onDestroy();
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    setResult(0);
    this.hEl.stop();
    x.e("MicroMsg.CardGiftVideoUI", "%d on play video error what %d extra %d.", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  protected void onPause()
  {
    this.hEl.pause();
    super.onPause();
  }
  
  protected void onResume()
  {
    if (!bi.oW(this.videoPath)) {
      xJ(this.videoPath);
    }
    super.onResume();
  }
  
  public void onStart()
  {
    Bundle localBundle = this.hDg;
    if (!this.hDh)
    {
      this.hDh = true;
      if (Build.VERSION.SDK_INT >= 12) {
        break label51;
      }
      x.e("MicroMsg.CardGiftVideoUI", "version is %d, no animation", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
    }
    for (;;)
    {
      super.onStart();
      return;
      label51:
      this.hDj = getIntent().getIntExtra("img_top", 0);
      this.hDk = getIntent().getIntExtra("img_left", 0);
      this.hDl = getIntent().getIntExtra("img_width", 0);
      this.hDm = getIntent().getIntExtra("img_height", 0);
      this.hDi.u(this.hDk, this.hDj, this.hDl, this.hDm);
      if (localBundle == null) {
        this.hEk.getViewTreeObserver().addOnPreDrawListener(new CardGiftVideoUI.8(this));
      }
    }
  }
  
  public final void wd()
  {
    x.i("MicroMsg.CardGiftVideoUI", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    this.hEl.x(0.0D);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardGiftVideoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */