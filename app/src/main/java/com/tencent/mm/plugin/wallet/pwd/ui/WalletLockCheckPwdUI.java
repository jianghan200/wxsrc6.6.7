package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.qz;
import com.tencent.mm.plugin.wallet.pwd.a.i;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

public class WalletLockCheckPwdUI
  extends WalletBaseUI
{
  private TextView gsY;
  private TextView hBv;
  private r pco;
  private EditHintPasswdView phS;
  private int phT = -1;
  private String sS;
  
  private void u(int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt);
    localIntent.putExtra("key_token", paramString1);
    localIntent.putExtra("key_type", paramString2);
    setResult(-1, localIntent);
    finish();
  }
  
  private void zh(int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt);
    setResult(-1, localIntent);
    finish();
  }
  
  protected final boolean aWj()
  {
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paraml instanceof r))
    {
      paraml = (r)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ("next_action.switch_on_pattern".equals(getIntent().getStringExtra("next_action")))
        {
          x.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo start to open wallet lock after check pwd");
          paramString = new Intent();
          paramString.putExtra("action", "action.switch_on_pattern");
          paramString.putExtra("next_action", "next_action.switch_on_pattern");
          paramString.putExtra("token", paraml.token);
          paramString.putExtra("type", paraml.pjt);
          paramString.putExtra("key_wallet_lock_type", this.phT);
          paramString.setPackage(ad.getPackageName());
          if (this.phT == 2) {
            paramString.putExtra("key_pay_passwd", this.phS.getText());
          }
          paraml = new qz();
          paraml.cbL.cbN = paramString;
          paraml.cbL.bOb = this;
          paraml.cbL.bRZ = 1;
          com.tencent.mm.sdk.b.a.sFg.m(paraml);
          return true;
        }
        u(0, paraml.token, paraml.pjt);
        return true;
      }
      if ((paramInt1 == 1000) && (paramInt2 == 3))
      {
        u(-1, null, null);
        return true;
      }
    }
    else
    {
      if ((paraml instanceof i))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          zh(0);
          return true;
        }
        zh(-1);
        return true;
      }
      if ((paraml instanceof com.tencent.mm.plugin.wallet.pwd.a.a))
      {
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label305;
        }
        zh(0);
      }
    }
    for (;;)
    {
      return false;
      label305:
      zh(-1);
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_check_pwd;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    if (paramIntent == null) {}
    for (;;)
    {
      x.v("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI onActivityResult requestCode: %d, resultCode: %d, data == null: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      setResult(paramInt2, paramIntent);
      finish();
      return;
      bool = false;
    }
  }
  
  public void onBackPressed()
  {
    x.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo onBackPressed");
    zh(4);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.phT = getIntent().getIntExtra("key_wallet_lock_type", -1);
    this.sS = getIntent().getStringExtra("action");
    x.v("MicroMsg.WalletLockCheckPwdUI", "alvinluo wallet lock type: %d, action: %s", new Object[] { Integer.valueOf(this.phT), this.sS });
    this.phS = ((EditHintPasswdView)findViewById(a.f.input_et));
    this.gsY = ((TextView)findViewById(a.f.wallet_pwd_title));
    this.hBv = ((TextView)findViewById(a.f.wallet_pwd_content));
    paramBundle = getIntent().getStringExtra("key_wallet_lock_input_new_fp_tips");
    if (this.phT == 2)
    {
      this.gsY.setText(a.i.wallet_wx_offline_start_fingerprint_lock);
      if ((this.sS.equals("action.touchlock_need_verify_paypwd")) && (!bi.oW(paramBundle))) {
        this.hBv.setText(paramBundle);
      }
    }
    for (;;)
    {
      this.phS.setOnInputValidListener(new WalletLockCheckPwdUI.3(this));
      d(this.phS, 0, false);
      setBackBtn(new WalletLockCheckPwdUI.1(this));
      findViewById(a.f.close_button).setOnClickListener(new WalletLockCheckPwdUI.2(this));
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
      return;
      if (this.phT == 1) {
        this.gsY.setText(a.i.wallet_wx_offline_start_gesture);
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.phS != null) {
      this.phS.bqn();
    }
  }
  
  public final void rj(int paramInt)
  {
    super.rj(paramInt);
    this.phS.bqn();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletLockCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */