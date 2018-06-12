package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.friend.a.aj;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.plugin.account.model.d;
import com.tencent.mm.plugin.setting.a.c;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.protocal.c.or;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;

public class SettingsModifyEmailAddrUI
  extends MMActivity
  implements com.tencent.mm.ab.e, m.b
{
  private String eFZ = null;
  private String eGa = null;
  private ProgressDialog eHw;
  private EditText mSI;
  private String mSJ;
  private String mSK;
  private TextView mSL;
  private TextView mSM;
  private boolean mSN;
  private boolean mSO;
  private boolean mSP;
  
  private void btJ()
  {
    if (this.mSN)
    {
      this.mSL.setVisibility(0);
      this.mSL.setText(getString(a.i.settings_unbind));
      this.mSM.setText(getString(a.i.settings_modify_email_addr_warning));
      this.mSM.setTextColor(getResources().getColor(a.c.account_info_email_warn_color));
      this.mSI.setEnabled(false);
      this.mSI.setFilters(new InputFilter[] { new SettingsModifyEmailAddrUI.12(this) });
      this.mSL.setOnClickListener(new SettingsModifyEmailAddrUI.22(this));
      hideVKB(this.mSI);
      return;
    }
    if (!bi.oW(this.mSJ))
    {
      this.mSL.setVisibility(0);
      this.mSL.setText(getString(a.i.setting_resend_verifyemail));
      this.mSM.setText(getString(a.i.setting_email_not_verify_tip));
      this.mSM.setTextColor(getResources().getColor(a.c.red));
      this.mSI.setEnabled(false);
      this.mSI.setFilters(new InputFilter[] { new SettingsModifyEmailAddrUI.23(this) });
      this.mSL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          paramAnonymousView = new aj((String)g.Ei().DT().get(2, null));
          g.DF().a(paramAnonymousView, 0);
          SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
          ActionBarActivity localActionBarActivity = SettingsModifyEmailAddrUI.this.mController.tml;
          SettingsModifyEmailAddrUI.this.getString(a.i.app_tip);
          SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI, h.a(localActionBarActivity, SettingsModifyEmailAddrUI.this.getString(a.i.settings_confirm_email_tip), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              g.DF().c(paramAnonymousView);
            }
          }));
          SettingsModifyEmailAddrUI.this.YC();
        }
      });
      addTextOptionMenu(0, getString(a.i.app_edit), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          SettingsModifyEmailAddrUI.b(SettingsModifyEmailAddrUI.this);
          return true;
        }
      });
      hideVKB(this.mSI);
      return;
    }
    btK();
  }
  
  private void btK()
  {
    this.mSL.setVisibility(8);
    this.mSL.setText(getString(a.i.settings_unbind));
    this.mSM.setText(getString(a.i.settings_modify_email_addr_warning));
    this.mSM.setTextColor(getResources().getColor(a.c.account_info_email_warn_color));
    this.mSI.setEnabled(true);
    this.mSI.setFilters(new InputFilter[] { new SettingsModifyEmailAddrUI.26(this) });
    addTextOptionMenu(0, getString(a.i.app_save), new SettingsModifyEmailAddrUI.27(this));
  }
  
  private void goBack()
  {
    YC();
    finish();
    if (this.mSP)
    {
      setResult(-1);
      return;
    }
    setResult(0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MiroMsg.SettingsModifyEmailAddrUI", "onSceneEnd: sceneType = " + paraml.getType() + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (b.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (paraml.getType() != 254) {
                break;
              }
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                this.eGa = ((y)paraml).XM().rsV;
                this.eFZ = ((y)paraml).XL();
                if (!bi.oW(this.eGa))
                {
                  paramString = new d(d.eNY, this.mSI.getText().toString().trim());
                  g.DF().a(paramString, 0);
                  return;
                }
                paramString = new r(2);
                g.DF().a(paramString, 0);
                return;
              }
              if (this.eHw != null)
              {
                this.eHw.dismiss();
                this.eHw = null;
              }
              if (paramInt2 == -3)
              {
                com.tencent.mm.sdk.platformtools.x.d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
                h.a(this.mController.tml, getString(a.i.settings_unbind_tips_set_user_password), null, getString(a.i.settings_unbind_tips_unbind_btn), getString(a.i.settings_unbind_tips_cancel_btn), true, new SettingsModifyEmailAddrUI.28(this), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
                });
                return;
              }
              if (paramInt2 == -82)
              {
                h.a(this, a.i.setting_unbind_qq_err_one_left, a.i.app_tip, new SettingsModifyEmailAddrUI.3(this));
                return;
              }
              if (paramInt2 == -83)
              {
                h.a(this, a.i.setting_unbind_qq_err_has_unbind, a.i.app_tip, new SettingsModifyEmailAddrUI.4(this));
                return;
              }
              if (paramInt2 == -84)
              {
                h.a(this, a.i.setting_unbind_qq_err_hasbinded, a.i.app_tip, new SettingsModifyEmailAddrUI.5(this));
                return;
              }
            } while (paramInt2 != -85);
            h.a(this, a.i.setting_unbind_email_err_bindedbyother, a.i.app_tip, new SettingsModifyEmailAddrUI.6(this));
            return;
            if (paraml.getType() != 256) {
              break;
            }
            b.ezo.vl();
            if (((d)paraml).Oh() == d.eNX)
            {
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                h.a(this.mController.tml, a.i.settings_confirm_email_success_tip, a.i.app_tip, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
                });
                return;
              }
              if (this.eHw != null)
              {
                this.eHw.dismiss();
                this.eHw = null;
              }
              if (paramInt2 == -82)
              {
                h.a(this, a.i.setting_unbind_qq_err_one_left, a.i.app_tip, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
                });
                return;
              }
              if (paramInt2 == -83)
              {
                h.a(this, a.i.setting_unbind_qq_err_has_unbind, a.i.app_tip, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
                });
                return;
              }
              if (paramInt2 == -84)
              {
                h.a(this, a.i.setting_unbind_qq_err_hasbinded, a.i.app_tip, new SettingsModifyEmailAddrUI.10(this));
                return;
              }
              if (paramInt2 == -85)
              {
                h.a(this, a.i.setting_unbind_email_err_bindedbyother, a.i.app_tip, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
                });
                return;
              }
              if (paramInt2 == -86)
              {
                h.a(this, a.i.setting_unbind_qq_err_qmail, a.i.app_tip, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
                });
                return;
              }
              h.a(this.mController.tml, getString(a.i.settings_confirm_email_fail_tip, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(a.i.app_tip), new SettingsModifyEmailAddrUI.14(this));
              return;
            }
          } while (((d)paraml).Oh() != d.eNY);
          if (this.eHw != null)
          {
            this.eHw.dismiss();
            this.eHw = null;
          }
        } while ((paramInt1 != 0) || (paramInt2 != 0));
        paramInt1 = ((Integer)g.Ei().DT().get(7, null)).intValue();
        g.Ei().DT().set(7, Integer.valueOf(paramInt1 | 0x2));
        if (!bi.oW(this.eGa))
        {
          h.a(this.mController.tml, this.eGa, "", getString(a.i.app_i_known), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
          });
          return;
        }
        h.a(this.mController.tml, a.i.setting_unbind_email_succ, a.i.app_tip, new SettingsModifyEmailAddrUI.16(this));
        return;
      } while (paraml.getType() == 138);
      if (paraml.getType() == 108)
      {
        if (this.eHw != null)
        {
          this.eHw.dismiss();
          this.eHw = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          h.a(this.mController.tml, a.i.settings_confirm_email_success_tip, a.i.app_tip, new SettingsModifyEmailAddrUI.17(this));
          return;
        }
        h.a(this.mController.tml, getString(a.i.settings_confirm_email_fail_tip, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(a.i.app_tip), new SettingsModifyEmailAddrUI.18(this));
        return;
      }
    } while (paraml.getType() != 255);
    if (paramInt2 == 0)
    {
      paramString = new d(d.eNY, this.mSI.getText().toString().trim());
      g.DF().a(paramString, 0);
      return;
    }
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    h.a(this.mController.tml, getString(a.i.settings_unbind_tips_set_user_password), null, getString(a.i.settings_unbind_tips_unbind_btn), getString(a.i.settings_unbind_tips_cancel_btn), true, new SettingsModifyEmailAddrUI.19(this), new SettingsModifyEmailAddrUI.20(this));
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    if ((paramm != g.Ei().DT()) || (i <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      return;
    }
    paramm = (Integer)g.Ei().DT().get(7, null);
    this.mSJ = ((String)g.Ei().DT().get(5, null));
    if ((paramm != null) && ((paramm.intValue() & 0x2) != 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.mSN = bool;
      this.mSP = this.mSN;
      if (!this.mSO) {
        break;
      }
      btJ();
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.settings_modify_email_addr;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_modify_email_addr);
    this.mSI = ((EditText)findViewById(a.f.settings_modify_email_new_email_et));
    this.mSL = ((TextView)findViewById(a.f.unbind_btn));
    this.mSM = ((TextView)findViewById(a.f.modify_email_warning_tv));
    this.mSJ = ((String)g.Ei().DT().get(5, null));
    this.mSI.setText(this.mSJ);
    Integer localInteger = (Integer)g.Ei().DT().get(7, null);
    if ((localInteger != null) && ((localInteger.intValue() & 0x2) != 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.mSN = bool;
      setBackBtn(new SettingsModifyEmailAddrUI.1(this));
      this.mSO = true;
      btJ();
      return;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.x.d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    com.tencent.mm.sdk.platformtools.x.i("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.mSJ + " newEmail: " + this.mSK);
    paramIntent = new y(y.eKS);
    g.DF().a(paramIntent, 0);
    getString(a.i.app_tip);
    this.eHw = h.a(this, getString(a.i.settings_loading), true, new SettingsModifyEmailAddrUI.21(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    g.DF().a(138, this);
    g.DF().a(254, this);
    g.DF().a(256, this);
    g.DF().a(108, this);
    g.DF().a(255, this);
    g.Ei().DT().a(this);
  }
  
  public void onDestroy()
  {
    g.DF().b(138, this);
    g.DF().b(254, this);
    g.DF().b(256, this);
    g.DF().b(108, this);
    g.DF().b(255, this);
    g.Ei().DT().b(this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */