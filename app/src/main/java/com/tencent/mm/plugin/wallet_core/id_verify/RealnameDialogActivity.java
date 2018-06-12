package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class RealnameDialogActivity
  extends WalletBaseUI
{
  private RealnameGuideHelper kWS;
  private int type = 1;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if ((paramBundle != null) && (paramBundle.hasExtra("key_realname_guide_helper")))
    {
      this.kWS = ((RealnameGuideHelper)paramBundle.getParcelableExtra("key_realname_guide_helper"));
      paramBundle = new Bundle();
      paramBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
      paramBundle.putString("realname_verify_process_jump_activity", ".id_verify.RealnameDialogActivity");
      paramBundle.putBoolean("process_finish_stay_orgpage", false);
      boolean bool1 = this.kWS.a(this, paramBundle, new RealnameDialogActivity.1(this), true);
      boolean bool2 = this.kWS.a(this, paramBundle, new RealnameDialogActivity.2(this));
      if ((!bool1) && (!bool2)) {
        finish();
      }
      return;
    }
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/RealnameDialogActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */