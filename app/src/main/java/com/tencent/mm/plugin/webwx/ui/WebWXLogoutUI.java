package com.tencent.mm.plugin.webwx.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.a;
import com.tencent.mm.R.b;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.k.f;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.webwx.a.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.an;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(3)
public class WebWXLogoutUI
  extends MMActivity
  implements e, aq
{
  private boolean hsJ;
  private ProgressDialog mQY = null;
  private com.tencent.mm.sdk.b.c nqB = new WebWXLogoutUI.9(this);
  private Animator qmA;
  private int qmB;
  private boolean qmn = false;
  private boolean qmt;
  private ImageButton qmu;
  private ImageButton qmv;
  private ImageView qmw;
  private int qmx;
  private int qmy;
  private int qmz;
  
  private void anw()
  {
    if (!bi.oW(com.tencent.mm.modelsimple.l.efw))
    {
      ((TextView)findViewById(R.h.status_desc)).setText(com.tencent.mm.modelsimple.l.efw);
      if (com.tencent.mm.modelsimple.l.QW() != 1) {
        break label72;
      }
      if (this.qmt) {
        break label395;
      }
      this.qmw.setImageResource(R.k.connect_pc_mute);
      this.qmw.setPadding(this.qmy - this.qmx, this.qmz, 0, 0);
    }
    label72:
    label248:
    do
    {
      return;
      if (com.tencent.mm.modelsimple.l.QW() != 2) {
        break;
      }
      if (this.qmt) {
        ((TextView)findViewById(R.h.prompt_desc)).setText(R.l.webwx_open_notify_prompt);
      }
      for (;;)
      {
        if (!this.hsJ) {
          break label248;
        }
        ((TextView)findViewById(R.h.status_desc)).setText(getString(R.l.webwx_lock_desc, new Object[] { "Mac" }));
        this.qmw.setImageResource(R.k.connect_mac_lock);
        this.qmw.setPadding(0, this.qmz, 0, 0);
        if ((!f.Aj()) || (this.qmt)) {
          break;
        }
        ((TextView)findViewById(R.h.prompt_desc)).setText(R.l.webwx_close_notify_prompt);
        this.qmw.setImageResource(R.k.connect_mac_mute_lock);
        this.qmw.setPadding(this.qmy - this.qmx, this.qmz, 0, 0);
        return;
        if (!f.Aj()) {
          ((TextView)findViewById(R.h.prompt_desc)).setText("");
        }
      }
      ((TextView)findViewById(R.h.status_desc)).setText(getString(R.l.webwx_login_desc, new Object[] { "Mac" }));
      this.qmw.setImageResource(R.k.connect_mac);
      this.qmw.setPadding(0, this.qmz, 0, 0);
    } while ((!f.Aj()) || (this.qmt));
    ((TextView)findViewById(R.h.prompt_desc)).setText(R.l.webwx_close_notify_prompt);
    this.qmw.setImageResource(R.k.connect_mac_mute);
    this.qmw.setPadding(this.qmy - this.qmx, this.qmz, 0, 0);
    return;
    if (com.tencent.mm.modelsimple.l.QW() == 3)
    {
      this.qmw.setImageResource(R.k.connect_ipad);
      this.qmw.setPadding(0, this.qmz, 0, 0);
      return;
    }
    label395:
    this.qmw.setImageResource(R.k.connect_pc);
    this.qmw.setPadding(0, this.qmz, 0, 0);
  }
  
  private void ko(boolean paramBoolean)
  {
    if (this.qmu != null)
    {
      if (paramBoolean)
      {
        this.qmu.setImageResource(R.g.webwx_unlock_bt);
        ((TextView)findViewById(R.h.webwx_lockBt_txt)).setText(R.l.webwx_unlock);
      }
    }
    else {
      return;
    }
    this.qmu.setImageResource(R.g.webwx_lock_bt);
    ((TextView)findViewById(R.h.webwx_lockBt_txt)).setText(R.l.webwx_lock);
  }
  
  private void kp(boolean paramBoolean)
  {
    if (this.qmv != null)
    {
      if (paramBoolean) {
        this.qmv.setImageResource(R.g.webwx_close_notify_bt);
      }
    }
    else {
      return;
    }
    this.qmv.setImageResource(R.g.webwx_open_notify_bt);
  }
  
  public final void HK()
  {
    au.HU();
    if (!com.tencent.mm.model.c.FM()) {
      finish();
    }
    while ((!com.tencent.mm.modelsimple.l.QY()) || (this.hsJ)) {
      return;
    }
    x.d("MicroMsg.WebWXLogoutUI", "extDevice remote lock");
    this.hsJ = true;
    ko(this.hsJ);
    anw();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (this.mQY != null)
    {
      this.mQY.dismiss();
      this.mQY = null;
    }
    if (paraml.getType() == 281)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        Toast.makeText(this, R.l.webwx_logout_error_txt, 1).show();
      }
      finish();
    }
    while (paraml.getType() != 792) {
      return;
    }
    int i = ((b)paraml).bNI;
    if (this.qmA != null) {
      this.qmA.start();
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (i == 1)
      {
        Toast.makeText(this, R.l.webwx_lock_error_txt, 0).show();
        return;
      }
      Toast.makeText(this, R.l.webwx_unlock_error_txt, 0).show();
      return;
    }
    boolean bool;
    if (i == 1)
    {
      bool = true;
      this.hsJ = bool;
      com.tencent.mm.modelsimple.l.bO(this.hsJ);
      anw();
      if (!this.hsJ) {
        break label187;
      }
    }
    label187:
    for (paramString = "lock";; paramString = "unlock")
    {
      x.d("MicroMsg.WebWXLogoutUI", "%s extDevice success", new Object[] { paramString });
      return;
      bool = false;
      break;
    }
  }
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(R.a.anim_not_change, R.a.push_down_out);
  }
  
  protected final int getLayoutId()
  {
    return R.i.webwxlogout;
  }
  
  protected final void initView()
  {
    setMMTitle("");
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(an.n(getResources().getColor(R.e.statusbar_fg_color), this.mController.cqm()));
    }
    Object localObject;
    label212:
    label265:
    Drawable localDrawable;
    if (!f.Aj())
    {
      findViewById(R.h.closeNotiBt_layout).setVisibility(8);
      this.qmt = false;
      this.qmw = ((ImageView)findViewById(R.h.status_icon));
      x.d("MicroMsg.WebWXLogoutUI", "need hide lock bt ?: " + com.tencent.mm.modelsimple.l.Ra());
      if (com.tencent.mm.modelsimple.l.Ra()) {
        break label448;
      }
      localObject = AnimatorInflater.loadAnimator(this, R.b.fade_in_property_anim);
      ((Animator)localObject).setTarget(findViewById(R.h.webwx_lock_progress));
      this.qmA = AnimatorInflater.loadAnimator(this, R.b.fade_out_property_anim);
      this.qmA.setTarget(findViewById(R.h.webwx_lock_progress));
      this.qmA.addListener(new WebWXLogoutUI.2(this));
      this.hsJ = com.tencent.mm.modelsimple.l.QY();
      this.qmu = ((ImageButton)findViewById(R.h.webwx_lock));
      ko(this.hsJ);
      this.qmu.setOnClickListener(new WebWXLogoutUI.3(this, (Animator)localObject));
      localObject = (ImageButton)findViewById(R.h.webwx_file_transfer);
      x.d("MicroMsg.WebWXLogoutUI", "need hide file bt ?: " + com.tencent.mm.modelsimple.l.Rb());
      if (com.tencent.mm.modelsimple.l.Rb()) {
        break label463;
      }
      ((ImageButton)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Chat_User", "filehelper");
          paramAnonymousView.putExtra("key_show_bottom_app_panel", true);
          com.tencent.mm.plugin.webwx.a.ezn.e(paramAnonymousView, WebWXLogoutUI.this);
          x.d("MicroMsg.WebWXLogoutUI", "clicked file transfer bt, start filehelper");
          WebWXLogoutUI.this.finish();
        }
      });
      localObject = (Button)findViewById(R.h.webwx_logout_bt);
      ((Button)localObject).setText(com.tencent.mm.modelsimple.l.efE);
      ((Button)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          x.d("MicroMsg.WebWXLogoutUI", "logout webwx");
          WebWXLogoutUI.f(WebWXLogoutUI.this);
        }
      });
      ((TextView)findViewById(R.h.webwx_logout_closeBt)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          WebWXLogoutUI.this.finish();
        }
      });
      if (com.tencent.mm.modelsimple.l.QW() != 1) {
        break label472;
      }
      localObject = getResources().getDrawable(R.k.connect_pc);
      localDrawable = getResources().getDrawable(R.k.connect_pc_mute);
      if ((localObject != null) && (localDrawable != null))
      {
        this.qmx = ((Drawable)localObject).getIntrinsicWidth();
        this.qmy = localDrawable.getIntrinsicWidth();
      }
    }
    for (;;)
    {
      this.qmw.post(new WebWXLogoutUI.7(this));
      return;
      this.qmv = ((ImageButton)findViewById(R.h.webwx_close_notify));
      if (q.gT(q.GL())) {}
      for (this.qmt = true;; this.qmt = false)
      {
        kp(this.qmt);
        this.qmv.setOnClickListener(new WebWXLogoutUI.1(this));
        break;
      }
      label448:
      findViewById(R.h.lockBt_layout).setVisibility(8);
      break label212;
      label463:
      ((ImageButton)localObject).setVisibility(8);
      break label265;
      label472:
      if (com.tencent.mm.modelsimple.l.QW() == 2)
      {
        localObject = getResources().getDrawable(R.k.connect_mac);
        localDrawable = getResources().getDrawable(R.k.connect_mac_mute);
        if ((localObject != null) && (localDrawable != null))
        {
          this.qmx = ((Drawable)localObject).getIntrinsicWidth();
          this.qmy = localDrawable.getIntrinsicWidth();
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    if (getIntent() != null) {
      this.qmB = getIntent().getIntExtra("intent.key.online_version", 0);
    }
    initView();
    overridePendingTransition(R.a.push_up_in, R.a.anim_not_change);
    au.DF().a(281, this);
    au.DF().a(792, this);
    au.HU();
    com.tencent.mm.model.c.a(this);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqB);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    overridePendingTransition(R.a.anim_not_change, R.a.push_down_out);
    au.DF().b(281, this);
    au.DF().b(792, this);
    au.HU();
    com.tencent.mm.model.c.b(this);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqB);
  }
  
  protected void onPause()
  {
    super.onPause();
    xt localxt;
    if ((this.qmn) && (au.HX()))
    {
      localxt = new xt();
      localxt.rDz = 27;
      if (!q.gT(q.GL())) {
        break label75;
      }
    }
    label75:
    for (int i = 1;; i = 2)
    {
      localxt.rDA = i;
      au.HU();
      com.tencent.mm.model.c.FQ().b(new h.a(23, localxt));
      this.qmn = false;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webwx/ui/WebWXLogoutUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */