package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.w;
import com.tencent.mm.model.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

@com.tencent.mm.ui.base.a(3)
public class AccountDeletedAlphaAlertUI
  extends MMActivity
{
  private static AccountDeletedAlphaAlertUI uva = null;
  
  public static AccountDeletedAlphaAlertUI czr()
  {
    return uva;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    uva = this;
    paramBundle = new w();
    com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
    au.hold();
    paramBundle = com.tencent.mm.h.a.eV(getIntent().getStringExtra("errmsg"));
    if (paramBundle != null)
    {
      paramBundle.a(this, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AccountDeletedAlphaAlertUI.a(AccountDeletedAlphaAlertUI.this);
        }
      }, null);
      return;
    }
    h.a(this, getString(R.l.main_err_account_delete), null, false, new AccountDeletedAlphaAlertUI.2(this));
  }
  
  public void onDestroy()
  {
    if (equals(uva)) {
      uva = null;
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/tools/AccountDeletedAlphaAlertUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */