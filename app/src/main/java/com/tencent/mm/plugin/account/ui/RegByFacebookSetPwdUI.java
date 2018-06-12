package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.ak;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;

public class RegByFacebookSetPwdUI
  extends SetPwdUI
{
  protected final l YR()
  {
    return new ak(this.eWT);
  }
  
  protected final String YS()
  {
    return ((EditText)findViewById(a.f.regbyfacebookreg_pass_et)).getText().toString();
  }
  
  protected final String YT()
  {
    return ((EditText)findViewById(a.f.regbyfacebookreg_pass_again_et)).getText().toString();
  }
  
  protected final int YU()
  {
    return 382;
  }
  
  protected final ProgressDialog a(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return h.a(paramContext, getString(a.j.regbyfacebook_reg_setpwd_exiting), true, paramOnCancelListener);
  }
  
  protected final boolean f(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      g.Ei().DT().set(57, Integer.valueOf(0));
      paramString = (String)g.Ei().DT().get(5, null);
      h.a(this, getString(a.j.regbyfacebook_reg_setpwd_success, new Object[] { paramString }), getString(a.j.regbyfacebook_reg_setpwd_alert_title), new RegByFacebookSetPwdUI.1(this));
      return true;
    }
    return e(paramInt1, paramInt2, paramString);
  }
  
  protected final int getLayoutId()
  {
    return a.g.regbyfacebooksetpwd_reg;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.regbyfacebook_reg_setpwd_title);
  }
  
  protected final void jo(int paramInt)
  {
    switch (RegByFacebookSetPwdUI.2.evn[(paramInt - 1)])
    {
    default: 
      return;
    case 1: 
      h.i(this, a.j.regbyfacebook_reg_setpwd_alert_diff, a.j.regbyfacebook_reg_setpwd_alert_title);
      return;
    case 2: 
      h.i(this, a.j.regbyfacebook_reg_setpwd_alert_more_byte, a.j.regbyfacebook_reg_setpwd_alert_title);
      return;
    case 3: 
      h.i(this, a.j.verify_password_all_num_tip, a.j.app_err_reg_title);
      return;
    }
    h.i(this, a.j.verify_password_tip, a.j.app_err_reg_title);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.regbyfacebook_reg_setpwd_title);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByFacebookSetPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */