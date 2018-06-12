package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.c.g.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

public class WalletVerifyIdCardUI
  extends WalletBaseUI
{
  private TextView gsY;
  private boolean pyP = false;
  private com.tencent.mm.plugin.wallet_core.model.h pyR = new com.tencent.mm.plugin.wallet_core.model.h();
  private g.a pyS = new WalletVerifyIdCardUI.4(this);
  private EditHintPasswdView pyX;
  
  private boolean bQH()
  {
    return this.sy.getBoolean("key_is_oversea", false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool = false;
    if ((paraml instanceof g))
    {
      if ((paramInt2 == 0) || (!((g)paraml).caB)) {
        break label54;
      }
      com.tencent.mm.ui.base.h.a(this.mController.tml, paramString, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      });
    }
    for (;;)
    {
      bool = true;
      return bool;
      label54:
      this.pyX.bqn();
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_verify_idcard_ui;
  }
  
  protected final void initView()
  {
    this.gsY = ((TextView)findViewById(a.f.wviu_title_tv));
    this.pyX = ((EditHintPasswdView)findViewById(a.f.wviu_tail_et));
    String str1 = this.sy.getString("key_true_name");
    String str2 = this.sy.getString("key_cre_name");
    String str3 = this.sy.getString("key_cre_type");
    this.gsY.setText(getString(a.i.wallet_idcard_tail_title, new Object[] { str1, str2 }));
    this.pyX.setEditTextMaxLength(4);
    this.pyX.setEditTextSize(34.0F);
    this.pyX.setOnInputValidListener(new EditHintPasswdView.a()
    {
      public final void fE(boolean paramAnonymousBoolean)
      {
        WalletVerifyIdCardUI.c(WalletVerifyIdCardUI.this).postDelayed(new WalletVerifyIdCardUI.2.1(this, paramAnonymousBoolean), 50L);
      }
    });
    if ("1".equals(str3))
    {
      d(this.pyX, 1, false);
      return;
    }
    d(this.pyX, 1, true);
  }
  
  public final boolean k(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.WalletVerifyIdCardUI", "onPreSceneEnd %s %s", new Object[] { Integer.valueOf(paramInt2), paraml });
    if (((paraml instanceof g)) && (paramInt2 == 0))
    {
      this.pyP = true;
      com.tencent.mm.ui.base.s.makeText(this, a.i.wallet_password_setting_digitalcert_install_verify_install_toast, 0).show();
      x.i("MicroMsg.WalletVerifyIdCardUI", "tag it isCertInstalled ok");
    }
    return true;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.pyR = new com.tencent.mm.plugin.wallet_core.model.h(this.sy);
    initView();
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.white)));
    paramBundle = getSupportActionBar().getCustomView();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.findViewById(a.f.divider);
      if (paramBundle != null) {
        paramBundle.setBackgroundColor(getResources().getColor(a.c.transparent));
      }
    }
    if (d.fR(21))
    {
      if (!d.fR(23)) {
        break label145;
      }
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      setMMTitle("");
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          WalletVerifyIdCardUI.this.finish();
          return false;
        }
      }, a.h.actionbar_icon_dark_back);
      return;
      label145:
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletVerifyIdCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */