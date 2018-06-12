package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;

public class BindQQUI
  extends MMWizardActivity
  implements com.tencent.mm.ab.e
{
  private String eFZ = null;
  private String eGa = null;
  p tipDialog;
  private int type = 0;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindQQUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paraml.getType());
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (paraml.getType() == 254) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.eFZ = ((y)paraml).XL();
        if ((this.eFZ != null) && (this.eFZ.length() > 0)) {
          g.Ei().DT().set(102407, this.eFZ);
        }
        if (!bi.oW(this.eGa))
        {
          paramString = new Intent(this, StartUnbindQQ.class);
          paramString.putExtra("notice", this.eGa);
          D(this, paramString);
        }
      }
    }
    while (paraml.getType() != 255)
    {
      do
      {
        return;
        paramString = new r(2);
        g.DF().a(paramString, 0);
        return;
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        if (paramInt2 == -3)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindQQUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
          h.a(this.mController.tml, getString(a.j.settings_unbind_tips_set_user_password), null, getString(a.j.settings_unbind_tips_unbind_btn), getString(a.j.settings_unbind_tips_cancel_btn), true, new DialogInterface.OnClickListener()new BindQQUI.9
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              paramAnonymousDialogInterface = new Intent();
              paramAnonymousDialogInterface.putExtra("kintent_hint", BindQQUI.this.getString(a.j.settings_unbind_set_password_tip));
              paramAnonymousDialogInterface.putExtra("from_unbind", true);
              d.b(BindQQUI.this, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
            }
          }, new BindQQUI.9(this));
          return;
        }
        if (paramInt2 == -81)
        {
          h.a(this, a.j.setting_unbind_qq_err_norbindqq, a.j.app_tip, null);
          return;
        }
        if (paramInt2 == -82)
        {
          h.a(this, a.j.setting_unbind_qq_err_one_left, a.j.app_tip, null);
          return;
        }
        if (paramInt2 == -83)
        {
          h.a(this, a.j.setting_unbind_qq_err_has_unbind, a.j.app_tip, null);
          return;
        }
        if (paramInt2 == -84)
        {
          h.a(this, a.j.setting_unbind_qq_err_hasbinded, a.j.app_tip, null);
          return;
        }
        if (paramInt2 == -85)
        {
          h.a(this, a.j.setting_unbind_qq_err_bindedbyother, a.j.app_tip, null);
          return;
        }
      } while (paramInt2 != -86);
      h.a(this, a.j.setting_unbind_qq_err_qmail, a.j.app_tip, null);
      return;
    }
    if (paramInt2 == 0)
    {
      D(this, new Intent(this, StartUnbindQQ.class));
      return;
    }
    h.a(this.mController.tml, getString(a.j.settings_unbind_tips_set_user_password), null, getString(a.j.settings_unbind_tips_unbind_btn), getString(a.j.settings_unbind_tips_cancel_btn), true, new BindQQUI.10(this), new BindQQUI.11(this));
  }
  
  protected final int getLayoutId()
  {
    return a.g.bindqq;
  }
  
  protected final void initView()
  {
    long l = new com.tencent.mm.a.o(bi.f((Integer)g.Ei().DT().get(9, null))).longValue();
    Object localObject;
    if (l == 0L)
    {
      setMMTitle(a.j.bind_qq_start_title);
      localObject = (TextView)findViewById(a.f.setting_bind_qq_hint);
      ((TextView)localObject).setVisibility(8);
      ((TextView)localObject).setText(a.j.bind_qq_start_hint);
      ((TextView)findViewById(a.f.setting_bind_qq_qq)).setVisibility(8);
      localObject = (Button)findViewById(a.f.bind_qq_start_btn);
      ((Button)localObject).setVisibility(0);
      ((Button)localObject).setText(a.j.bind_qq_start_btn);
      ((Button)localObject).setOnClickListener(new BindQQUI.5(this));
      removeOptionMenu(1);
    }
    while (this.type == 1)
    {
      addTextOptionMenu(0, getString(a.j.app_ignore_it), new BindQQUI.1(this));
      return;
      setMMTitle(a.j.bind_qq_finish_title);
      localObject = (TextView)findViewById(a.f.setting_bind_qq_hint);
      ((TextView)localObject).setVisibility(8);
      ((TextView)localObject).setText(a.j.bind_qq_finish_hint);
      localObject = (TextView)findViewById(a.f.setting_bind_qq_qq);
      ((TextView)localObject).setVisibility(0);
      ((TextView)localObject).setText(getString(a.j.bind_qq_finish_textview_hint) + l);
      localObject = (Button)findViewById(a.f.bind_qq_start_btn);
      ((Button)localObject).setVisibility(8);
      ((Button)localObject).setText(a.j.hardcode_plugin_qqfriend_nick);
      ((Button)localObject).setOnClickListener(new BindQQUI.6(this));
      addIconOptionMenu(1, a.e.mm_title_btn_menu, new BindQQUI.7(this));
    }
    setBackBtn(new BindQQUI.4(this));
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindQQUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindQQUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again qq");
    paramIntent = new y(y.eKP);
    g.DF().a(paramIntent, 0);
    getString(a.j.app_tip);
    this.tipDialog = h.a(this, getString(a.j.app_loading), true, new BindQQUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("bindqq_regbymobile", 0);
    g.DF().a(254, this);
    g.DF().a(255, this);
  }
  
  public void onDestroy()
  {
    g.DF().b(254, this);
    g.DF().b(255, this);
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindQQUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */