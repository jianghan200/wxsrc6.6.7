package com.tencent.mm.plugin.wallet_core.ui;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.tg;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(19)
public class WalletPwdConfirmUI
  extends WalletBaseUI
{
  private com.tencent.mm.sdk.b.c cXu = new WalletPwdConfirmUI.6(this);
  private TextView gsY;
  private TextView hBv;
  public EditHintPasswdView kkY;
  private PayInfo mCn;
  private TextView pxc;
  private boolean pxd = false;
  private al pxe = new al(new al.a()
  {
    public final boolean vD()
    {
      if (WalletPwdConfirmUI.c(WalletPwdConfirmUI.this))
      {
        WalletPwdConfirmUI.d(WalletPwdConfirmUI.this);
        WalletPwdConfirmUI.e(WalletPwdConfirmUI.this);
      }
      return false;
    }
  }, false);
  
  private void bQs()
  {
    Bundle localBundle = this.sy;
    localBundle.putBoolean("intent_bind_end", true);
    com.tencent.mm.wallet_core.a.j(this, localBundle);
  }
  
  protected final boolean aWj()
  {
    return true;
  }
  
  protected final boolean bND()
  {
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.sy.putString("key_pwd1", this.kkY.getText());
      if ((paraml instanceof y)) {
        if (!this.pxd) {
          bQs();
        }
      }
      for (;;)
      {
        return true;
        if ((com.tencent.mm.wallet_core.a.af(this) != null) && (com.tencent.mm.wallet_core.a.af(this).c(this, null)))
        {
          if (this.mCn != null) {}
          for (paramString = this.mCn.bOd;; paramString = "")
          {
            a(new y(paramString, 22), true, false);
            paramString = new tg();
            if (com.tencent.mm.sdk.b.a.sFg.G(paramString.getClass()))
            {
              this.pxd = true;
              com.tencent.mm.sdk.b.a.sFg.m(paramString);
            }
            this.pxe.J(10000L, 10000L);
            break;
          }
        }
        com.tencent.mm.wallet_core.a.j(this, this.sy);
      }
    }
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_set_pwd;
  }
  
  protected final void initView()
  {
    this.gsY = ((TextView)findViewById(a.f.wallet_pwd_title));
    this.hBv = ((TextView)findViewById(a.f.wallet_pwd_content));
    if ((cDK() != null) && ("ModifyPwdProcess".equals(cDK().aNK()))) {
      this.gsY.setText(a.i.wallet_modify_password_title);
    }
    this.hBv.setText(a.i.wallet_set_password_hint_2);
    this.pxc = ((TextView)findViewById(a.f.input_finish));
    if (!bi.K(cDM())) {
      this.pxc.setText(a.i.wallet_set_password_pay_tips);
    }
    for (;;)
    {
      this.pxc.setVisibility(0);
      this.pxc.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          Object localObject = WalletPwdConfirmUI.this.sy.getString("key_new_pwd1");
          String str2 = WalletPwdConfirmUI.this.kkY.getMd5Value();
          paramAnonymousView = WalletPwdConfirmUI.this.sy.getString("kreq_token");
          String str1 = WalletPwdConfirmUI.this.sy.getString("key_verify_code");
          x.d("Micromsg.WalletPwdConfirmUI", "mPayInfo " + WalletPwdConfirmUI.a(WalletPwdConfirmUI.this) + " vertifyCode: " + str1);
          if ((localObject != null) && (((String)localObject).equals(str2)))
          {
            localObject = new p();
            ((p)localObject).eJn = WalletPwdConfirmUI.this.kkY.getText();
            ((p)localObject).mpb = WalletPwdConfirmUI.a(WalletPwdConfirmUI.this);
            ((p)localObject).token = paramAnonymousView;
            ((p)localObject).pqM = str1;
            ((p)localObject).pqN = WalletPwdConfirmUI.this.sy.getBoolean("key_is_bind_bankcard", true);
            if (!com.tencent.mm.wallet_core.a.af(WalletPwdConfirmUI.this).bQH()) {}
            for (((p)localObject).flag = "1";; ((p)localObject).flag = "4")
            {
              paramAnonymousView = (FavorPayInfo)WalletPwdConfirmUI.this.sy.getParcelable("key_favor_pay_info");
              if (paramAnonymousView != null)
              {
                ((p)localObject).plt = paramAnonymousView.pnS;
                ((p)localObject).plu = paramAnonymousView.pnP;
              }
              WalletPwdConfirmUI.this.cDL().m(new Object[] { localObject });
              return;
            }
          }
          com.tencent.mm.wallet_core.a.m(WalletPwdConfirmUI.this, 64534);
        }
      });
      this.pxc.setEnabled(false);
      this.pxc.setClickable(false);
      this.kkY = ((EditHintPasswdView)findViewById(a.f.input_et));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.kkY);
      this.kkY.setEditTextMaxLength(6);
      this.kkY.setOnInputValidListener(new WalletPwdConfirmUI.3(this));
      findViewById(a.f.bind_wallet_verify_hint).setVisibility(8);
      d(this.kkY, 0, false);
      this.kTx = new WalletPwdConfirmUI.4(this, (ScrollView)findViewById(a.f.root_view));
      return;
      this.pxc.setText(a.i.app_finish);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.mCn = ((PayInfo)this.sy.getParcelable("key_pay_info"));
    initView();
    com.tencent.mm.plugin.wallet_core.e.c.b(this, this.sy, 6);
    findViewById(a.f.close_button).setOnClickListener(new WalletPwdConfirmUI.1(this));
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(a.c.white));
      if (Build.VERSION.SDK_INT >= 23) {
        paramBundle.getDecorView().setSystemUiVisibility(8192);
      }
    }
    this.mController.contentView.setFitsSystemWindows(true);
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.sdk.b.a.sFg.c(this.cXu);
  }
  
  public void onResume()
  {
    this.kkY.requestFocus();
    super.onResume();
    com.tencent.mm.sdk.b.a.sFg.b(this.cXu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */