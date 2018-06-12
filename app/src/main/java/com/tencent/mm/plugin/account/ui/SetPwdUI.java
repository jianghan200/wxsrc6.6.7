package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.platformtools.a.a;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bmh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;

public abstract class SetPwdUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  protected ProgressDialog eHw = null;
  protected String eWT;
  protected String eWU;
  public boolean eWV = true;
  
  protected abstract com.tencent.mm.ab.l YR();
  
  protected abstract String YS();
  
  protected abstract String YT();
  
  protected int YU()
  {
    return 383;
  }
  
  protected void Za()
  {
    Zo();
  }
  
  public boolean Zb()
  {
    return false;
  }
  
  protected final void Zo()
  {
    this.eWT = YS();
    this.eWU = YT();
    if (bi.oW(this.eWT)) {}
    do
    {
      return;
      if (!this.eWT.equals(this.eWU))
      {
        jo(a.a.evo);
        return;
      }
      if (this.eWT.length() > 16)
      {
        jo(a.a.evp);
        return;
      }
      if (bi.WC(this.eWT))
      {
        com.tencent.mm.ui.base.h.i(this, a.j.regbyfacebook_reg_setpwd_alert_using_chinese, a.j.regbymobile_reg_setpwd_alert_title);
        return;
      }
      if (!bi.WH(this.eWT))
      {
        if ((this.eWT.length() >= 8) && (this.eWT.length() < 16))
        {
          jo(a.a.evr);
          return;
        }
        jo(a.a.evq);
        return;
      }
      YC();
      final com.tencent.mm.ab.l locall = YR();
      g.DF().a(locall, 0);
      getString(a.j.app_tip);
      this.eHw = a(this, getString(a.j.reg_processing), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          g.DF().c(locall);
        }
      });
    } while ((!Zb()) || (this.eWV));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 0");
    com.tencent.mm.plugin.report.service.h.mEJ.h(11868, new Object[] { Integer.valueOf(0) });
  }
  
  protected ProgressDialog a(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return com.tencent.mm.ui.base.h.a(paramContext, paramString, true, paramOnCancelListener);
  }
  
  public void a(final int paramInt1, final int paramInt2, final String paramString, com.tencent.mm.ab.l paraml)
  {
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (paraml.getType() != YU()) {}
    label286:
    do
    {
      do
      {
        return;
        if (paraml.getType() != 383) {
          break;
        }
      } while ((paramInt1 != 0) || (paramInt2 != 0));
      String str;
      if (bi.oW((String)g.Ei().DT().get(6, null)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SetPwdUI", "has not bind mobile");
        str = getString(a.j.no_mobile_setpwd_success_tip);
        paraml = (y)paraml;
        if ((paraml.diG == null) || (paraml.diG.dIE.dIL == null)) {
          break label286;
        }
      }
      for (paraml = (bmh)paraml.diG.dIE.dIL;; paraml = null)
      {
        if ((paraml != null) && (paraml.res != null))
        {
          paraml = paraml.res.siK.toByteArray();
          SharedPreferences.Editor localEditor = ad.getContext().getSharedPreferences("auth_info_key_prefs", 4).edit();
          localEditor.putBoolean("key_auth_info_prefs_created", true);
          localEditor.putInt("key_auth_update_version", d.qVN);
          localEditor.putString("_auth_key", bi.bE(paraml));
          g.Eg();
          localEditor.putInt("_auth_uin", com.tencent.mm.kernel.a.Df());
          localEditor.commit();
        }
        com.tencent.mm.ui.base.h.a(this, str, "", false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            SetPwdUI.this.setResult(-1);
            if (SetPwdUI.this.f(paramInt1, paramInt2, paramString)) {}
          }
        });
        return;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SetPwdUI", "has bind mobile");
        str = getString(a.j.bind_mobile_setpwd_success_tip);
        break;
      }
    } while (f(paramInt1, paramInt2, paramString));
    Toast.makeText(this, getString(a.j.fmt_set_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final boolean e(int paramInt1, int paramInt2, String paramString)
  {
    return com.tencent.mm.plugin.account.a.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString);
  }
  
  protected abstract boolean f(int paramInt1, int paramInt2, String paramString);
  
  protected abstract void jo(int paramInt);
  
  public void onBackPressed()
  {
    if (this.eWV)
    {
      if (Zb())
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
        com.tencent.mm.plugin.report.service.h.mEJ.h(11868, new Object[] { Integer.valueOf(1) });
      }
      super.onBackPressed();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    g.DF().a(YU(), this);
    super.onCreate(paramBundle);
    a(0, getString(a.j.app_finish), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SetPwdUI.this.Za();
        return true;
      }
    }, s.b.tmX);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        paramAnonymousMenuItem = SetPwdUI.this;
        if ((paramAnonymousMenuItem.Zb()) && (paramAnonymousMenuItem.eWV))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
          com.tencent.mm.plugin.report.service.h.mEJ.h(11868, new Object[] { Integer.valueOf(1) });
        }
        paramAnonymousMenuItem.YC();
        paramAnonymousMenuItem.setResult(0);
        paramAnonymousMenuItem.finish();
        return true;
      }
    });
  }
  
  public void onDestroy()
  {
    g.DF().b(YU(), this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/SetPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */