package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.luckymoney.b.ah;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.luckymoney.b.t;
import com.tencent.mm.plugin.luckymoney.b.u;
import com.tencent.mm.plugin.luckymoney.b.w;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.io.IOException;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyBusiReceiveUI
  extends LuckyMoneyBaseUI
{
  private TextView kLF;
  private ImageView kLO;
  private TextView kMF;
  private Button kMG;
  private View kMK;
  private ImageView kOI;
  private TextView kUA;
  private View kUB;
  private ImageView kUC;
  private TextView kUD;
  private View kUE;
  private TextView kUF;
  private Button kUG;
  private TextView kUH;
  private CheckBox kUI;
  private int kUJ;
  private String kUK = null;
  private int kUL = 0;
  private u kUM;
  private RealnameGuideHelper kUN;
  private String kUn = null;
  private String kUp = null;
  private int kUr = 0;
  private TextView kUz;
  private com.tencent.mm.ui.base.p tipDialog = null;
  
  private void as(int paramInt, String paramString)
  {
    x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "markResult resultCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    Intent localIntent = new Intent();
    localIntent.putExtra("key_result_errmsg", paramString);
    setResult(paramInt, localIntent);
  }
  
  private void init()
  {
    this.tipDialog = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.i.loading_tips), true, new LuckyMoneyBusiReceiveUI.1(this));
    if (this.kUJ == 3) {
      b(new com.tencent.mm.plugin.luckymoney.b.s(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url")), false);
    }
    for (;;)
    {
      as(0, "");
      return;
      if (this.kUJ == 4)
      {
        b(new com.tencent.mm.plugin.luckymoney.b.s(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("key_wxapi_sign"), getIntent().getStringExtra("key_wxapi_package_name")), false);
        continue;
      }
      try
      {
        this.kUn = Uri.parse(bi.oV(this.kUp)).getQueryParameter("sendid");
        if (!bi.oW(this.kUn))
        {
          b(new u(this.kUn, this.kUp, this.kUJ, getIntent().getStringExtra("packageExt")), false);
          continue;
        }
        finish();
        x.w("MicroMsg.LuckyMoneyBusiReceiveUI", "sendid null & finish");
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, final l paraml)
  {
    if ((paraml instanceof u))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.kUM = ((u)paraml);
        this.kUn = this.kUM.kLZ;
        this.kUL = this.kUM.kPI;
        com.tencent.mm.plugin.report.service.h.mEJ.h(13050, new Object[] { Integer.valueOf(this.kUr), Integer.valueOf(1), this.kUM.kQN });
        if (this.kUM.ceT == 2)
        {
          as(-1, "");
          b(new w(this.kUn, 11, 0, this.kUp, "v1.0"), false);
          return true;
        }
        if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
          this.tipDialog.hide();
        }
        o.i(this.kLO, this.kUM.kQR);
        o.a(this.mController.tml, this.kMF, this.kUM.kQH);
        o.g(this.kUC, this.kUM.kQb);
        if ((this.kUM.ceT != 1) && (this.kUM.ceS != 4) && (this.kUM.ceS != 5) && (this.kUM.ceS != 1)) {
          if (!bi.oW(this.kUM.kQN))
          {
            this.kUK = this.kUM.kQN;
            if (this.kUM.kQO == 1) {
              this.kUI.setVisibility(8);
            }
          }
          else
          {
            this.kMG.setOnClickListener(new LuckyMoneyBusiReceiveUI.4(this));
            if (bi.oW(this.kUM.kPJ)) {
              break label460;
            }
            this.kUz.setText(this.kUM.kPJ);
            label336:
            if (bi.oW(this.kUM.kQS)) {
              break label472;
            }
            this.kUA.setText(this.kUM.kQS);
          }
        }
        for (;;)
        {
          o.a(this.kMK, null);
          this.mController.contentView.setVisibility(0);
          break;
          x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "show checkbox for " + this.kUM.kQN);
          if (this.kUM.kQL == 1) {
            this.kUI.setChecked(true);
          }
          for (;;)
          {
            this.kUI.setText(this.kUM.kQM);
            break;
            this.kUI.setChecked(false);
          }
          label460:
          this.kUz.setVisibility(8);
          break label336;
          label472:
          this.kUA.setVisibility(8);
          continue;
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
          this.kUz.setVisibility(4);
          this.kUA.setText(this.kUM.kPJ);
          this.kMG.setVisibility(8);
          if (this.kUL == 1)
          {
            this.kUD.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
                paramAnonymousView = new Intent();
                paramAnonymousView.setClass(LuckyMoneyBusiReceiveUI.this.mController.tml, LuckyMoneyBusiDetailUI.class);
                paramAnonymousView.putExtra("key_native_url", LuckyMoneyBusiReceiveUI.j(LuckyMoneyBusiReceiveUI.this));
                paramAnonymousView.putExtra("key_sendid", LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).kLZ);
                paramAnonymousView.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUI.g(LuckyMoneyBusiReceiveUI.this));
                LuckyMoneyBusiReceiveUI.this.startActivity(paramAnonymousView);
                LuckyMoneyBusiReceiveUI.this.finish();
              }
            });
            this.kUD.setVisibility(0);
          }
          else
          {
            this.kUD.setVisibility(8);
          }
        }
      }
    }
    else if ((paraml instanceof t))
    {
      o.c(this.kMG);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        as(-1, "");
        paraml = (t)paraml;
        if (paraml.ceT == 2)
        {
          if ((paraml.hUg <= 1) || ((paraml.kPY != null) && (paraml.kPY.ddp != 1)))
          {
            x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can not atomic go detail");
            paramString = new Intent();
            paramString.putExtra("key_sendid", paraml.kLZ);
            paramString.putExtra("key_static_from_scene", this.kUr);
            if (paraml.kMP != null) {
              paramString.putExtra("key_realname_guide_helper", paraml.kMP);
            }
            try
            {
              paramString.putExtra("key_detail_info", paraml.kQP.toByteArray());
              paramString.putExtra("key_jump_from", 2);
              if (g.AT().getInt("PlayCoinSound", 0) > 0) {
                paramString.putExtra("play_sound", true);
              }
              d.b(this.mController.tml, "luckymoney", ".ui.LuckyMoneyBusiDetailUI", paramString);
              finish();
              return true;
            }
            catch (IOException paraml)
            {
              for (;;)
              {
                x.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paraml.getLocalizedMessage());
              }
            }
          }
          paramString = findViewById(a.f.lucky_money_busi_receive_top_ll);
          TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -paramString.getHeight());
          localTranslateAnimation.setDuration(400L);
          localTranslateAnimation.setFillAfter(true);
          localTranslateAnimation.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              paramString.setVisibility(8);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
            
            public final void onAnimationStart(Animation paramAnonymousAnimation) {}
          });
          paramString.startAnimation(localTranslateAnimation);
          this.kLF.setText(com.tencent.mm.wallet_core.ui.e.A(paraml.cfh / 100.0D));
          this.kMF.setText(paraml.kQH);
          this.kUz.setVisibility(8);
          this.kUA.setVisibility(8);
          this.kUB.setVisibility(0);
          this.kMG.setVisibility(8);
          if (!bi.oW(paraml.kQK))
          {
            paramString = paraml.kQK;
            this.kUG.setText(paramString);
            this.kUH.setVisibility(0);
            com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
            x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "totalNum:" + paraml.hUg);
            if ((paraml.hUg <= 1) && ((paraml.kPY == null) || (paraml.kPY.ddp != 1))) {
              break label1167;
            }
            x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can atomic");
            this.kUN = paraml.kMP;
            this.kUG.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                LuckyMoneyBusiReceiveUI.k(LuckyMoneyBusiReceiveUI.this).setVisibility(4);
                LuckyMoneyBusiReceiveUI.l(LuckyMoneyBusiReceiveUI.this).setVisibility(8);
                LuckyMoneyBusiReceiveUI.m(LuckyMoneyBusiReceiveUI.this).setVisibility(8);
                if ((paraml.kPY != null) && (!bi.oW(paraml.kPY.kPx))) {}
                for (paramAnonymousView = paraml.kPY.kPx;; paramAnonymousView = LuckyMoneyBusiReceiveUI.this.getString(a.i.lucky_money_share_friends_tips))
                {
                  LuckyMoneyBusiReceiveUI.n(LuckyMoneyBusiReceiveUI.this).setText(paramAnonymousView);
                  LuckyMoneyBusiReceiveUI.o(LuckyMoneyBusiReceiveUI.this).setText(paraml.kQI);
                  LuckyMoneyBusiReceiveUI.p(LuckyMoneyBusiReceiveUI.this).setVisibility(0);
                  LuckyMoneyBusiReceiveUI.n(LuckyMoneyBusiReceiveUI.this).setOnClickListener(new LuckyMoneyBusiReceiveUI.7.1(this));
                  o.a(LuckyMoneyBusiReceiveUI.k(LuckyMoneyBusiReceiveUI.this), new LuckyMoneyBusiReceiveUI.7.2(this));
                  return;
                }
              }
            });
            label1146:
            this.kUG.setVisibility(0);
          }
        }
        for (;;)
        {
          return true;
          paramString = getString(a.i.lucky_money_share);
          break;
          label1167:
          this.kUG.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              LuckyMoneyBusiReceiveUI.this.finish();
            }
          });
          break label1146;
          this.kUz.setVisibility(4);
          this.kUA.setText(paraml.kPJ);
          this.kMG.setVisibility(8);
          if (this.kUL == 1)
          {
            this.kUD.setOnClickListener(new LuckyMoneyBusiReceiveUI.9(this, paraml));
            this.kUD.setVisibility(0);
          }
          else
          {
            this.kUD.setVisibility(8);
          }
        }
      }
      if (paramInt2 == 416)
      {
        if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
          this.tipDialog.hide();
        }
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
        paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
        this.kMG.setBackgroundResource(a.e.festival_lucky_money_open_btn);
        new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        };
        new LuckyMoneyBusiReceiveUI.2(this);
        return o.a(this, paramInt2, paraml, paramString, false, 1005);
      }
    }
    else
    {
      if ((paraml instanceof ah))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.h.bA(this, getString(a.i.has_send));
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
          finish();
          return true;
        }
        com.tencent.mm.ui.base.h.bA(this, paramString);
        return true;
      }
      if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.s))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          l(new u(this.kUn, this.kUp, this.kUJ, getIntent().getStringExtra("packageExt")));
          return true;
        }
      }
      else
      {
        if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.p)) {
          return true;
        }
        if ((paraml instanceof w))
        {
          if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
            this.tipDialog.hide();
          }
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paraml = (w)paraml;
            paramString = new Intent();
            paramString.setClass(this.mController.tml, LuckyMoneyBusiDetailUI.class);
            try
            {
              paramString.putExtra("key_detail_info", paraml.kQP.toByteArray());
              paramString.putExtra("key_jump_from", 2);
              paramString.putExtra("key_native_url", this.kUp);
              paramString.putExtra("key_sendid", this.kUn);
              paramString.putExtra("key_static_from_scene", this.kUr);
              startActivity(paramString);
              finish();
              return true;
            }
            catch (IOException paraml)
            {
              for (;;)
              {
                x.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paraml.getLocalizedMessage());
              }
            }
          }
        }
      }
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      as(2, paramString);
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_busi_receive_ui;
  }
  
  protected final void initView()
  {
    this.kMK = findViewById(a.f.lucky_money_busi_receive_ll);
    this.kLO = ((ImageView)findViewById(a.f.lucky_money_busi_receive_sender_avatar));
    this.kMF = ((TextView)findViewById(a.f.lucky_money_busi_receive_sender_nickname));
    this.kUA = ((TextView)findViewById(a.f.lucky_money_busi_receive_maindesc));
    this.kUz = ((TextView)findViewById(a.f.lucky_money_busi_receive_subdesc));
    this.kMG = ((Button)findViewById(a.f.lucky_money_busi_receive_open));
    this.kOI = ((ImageView)findViewById(a.f.lucky_money_busi_recieve_close_btn));
    this.kUB = findViewById(a.f.lucky_money_busi_amount_area);
    this.kLF = ((TextView)findViewById(a.f.lucky_money_busi_amount));
    this.kUC = ((ImageView)findViewById(a.f.lucky_money_busi_recieve_watermask));
    this.kUD = ((TextView)findViewById(a.f.lucky_money_busi_recieve_check_detail));
    this.kUE = findViewById(a.f.lucky_money_busi_receive_share_area);
    this.kUF = ((TextView)findViewById(a.f.lucky_money_busi_receive_share_hintmess));
    this.kUG = ((Button)findViewById(a.f.lucky_money_busi_share_btn));
    this.kUH = ((TextView)findViewById(a.f.lucky_money_busi_receive_savetips));
    this.kUI = ((CheckBox)findViewById(a.f.lucky_money_busi_subcribe));
    this.kOI.setOnClickListener(new LuckyMoneyBusiReceiveUI.3(this));
    ux(8);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), str });
        if (!bi.oW(str)) {
          l(new ah(str, this.kUn, "v1.0"));
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kUp = getIntent().getStringExtra("key_native_url");
    this.kUJ = getIntent().getIntExtra("key_way", 5);
    this.kUr = getIntent().getIntExtra("key_static_from_scene", 0);
    x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "nativeurl=" + bi.oV(this.kUp) + ", mWay=" + this.kUJ);
    init();
    com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(10), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    initView();
    jr(980);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
    js(980);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.hasExtra("key_is_realname_verify_process")))
    {
      if (paramIntent.getIntExtra("realname_verify_process_ret", 0) == -1)
      {
        x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process succ");
        init();
      }
    }
    else {
      return;
    }
    x.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process cancel");
    as(-1, "");
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */