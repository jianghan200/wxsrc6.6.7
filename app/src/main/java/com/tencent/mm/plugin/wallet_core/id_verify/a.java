package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a
  extends b
{
  private int bjW = 0;
  private boolean hxu = false;
  private String mActivityName = null;
  private int mMode;
  private String pjT = null;
  private boolean pjU = false;
  private int pjV = -1;
  
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return a.i.wallet_input_realname_finish_confirm;
  }
  
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    y(new Object[] { "start", paramActivity, paramBundle });
    if (this.jfZ == null) {
      this.jfZ = new Bundle();
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = this.jfZ;
    }
    if (localBundle != null)
    {
      this.mMode = localBundle.getInt("real_name_verify_mode", 0);
      label69:
      this.pjV = this.mMode;
      localBundle.putBoolean("key_is_realname_verify_process", true);
      this.pjT = localBundle.getString("realname_verify_process_jump_plugin", "");
      this.mActivityName = localBundle.getString("realname_verify_process_jump_activity", "");
      if (localBundle.getInt("realname_verify_process_allow_idverify", 0) != 1) {
        break label206;
      }
    }
    label206:
    for (boolean bool = true;; bool = false)
    {
      this.pjU = bool;
      x.i("MicroMsg.RealNameVerifyProcess", "mAllowIdVerify is  mAllowIdVerify: %s,mPluginName %s, mActivityName %s ", new Object[] { Boolean.valueOf(this.pjU), this.pjT, this.mActivityName });
      switch (this.mMode)
      {
      default: 
        return this;
        this.mMode = 0;
        break label69;
      }
    }
    localBundle.putBoolean("key_need_bind_response", true);
    p.GZ(10);
    super.a(paramActivity, localBundle);
    return this;
    p.GZ(10);
    c(paramActivity, SwitchRealnameVerifyModeUI.class, localBundle);
    return this;
    c(paramActivity, WalletRealNameVerifyUI.class, localBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      if (this.mMode == 2) {
        return new a.2(this, paramMMActivity, parami);
      }
      return super.a(paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletRealNameVerifyUI)) {
      return new a.3(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    y(new Object[] { "forward", paramActivity, "actionCode:" + paramInt, paramBundle });
    int i = this.jfZ.getInt("real_name_verify_mode", this.mMode);
    if (this.mMode != i) {
      this.mMode = i;
    }
    if (this.mMode == 2)
    {
      if ((paramActivity instanceof WalletRealNameVerifyUI)) {
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
      }
      do
      {
        return;
        if ((paramActivity instanceof WalletSetPasswordUI))
        {
          c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
          return;
        }
      } while (((paramActivity instanceof WalletPwdConfirmUI)) || (!(paramActivity instanceof SwitchRealnameVerifyModeUI)));
      c(paramActivity, WalletRealNameVerifyUI.class, paramBundle);
      this.mMode = 2;
      return;
    }
    if (this.mMode == 1)
    {
      if ((paramActivity instanceof SwitchRealnameVerifyModeUI))
      {
        if (o.bOW().bPs())
        {
          c(paramActivity, WalletCheckPwdUI.class, paramBundle);
          return;
        }
        c(paramActivity, WalletBankcardIdUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletCheckPwdUI))
      {
        c(paramActivity, WalletBankcardIdUI.class, paramBundle);
        return;
      }
      super.a(paramActivity, paramInt, paramBundle);
      return;
    }
    if ((paramActivity instanceof WalletRealNameVerifyUI))
    {
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      this.mMode = 1;
      return;
    }
    super.a(paramActivity, paramInt, paramBundle);
  }
  
  public final String aNK()
  {
    return "realname_verify_process";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    y(new Object[] { "end", paramActivity, paramBundle });
    p.cDe();
    if (paramBundle == null) {
      paramBundle = this.jfZ;
    }
    for (;;)
    {
      Object localObject = paramBundle;
      if (paramBundle == null) {
        localObject = new Bundle();
      }
      if (this.mMode == 1)
      {
        cCV();
        if (((Bundle)localObject).getBoolean("intent_bind_end", false))
        {
          this.bjW = -1;
          if (((Bundle)localObject).containsKey("intent_bind_end")) {
            ((Bundle)localObject).remove("intent_bind_end");
          }
          if (((Bundle)localObject).containsKey("key_is_bind_reg_process")) {
            ((Bundle)localObject).remove("key_is_bind_reg_process");
          }
          ((Bundle)localObject).putInt("realname_verify_process_ret", this.bjW);
          paramBundle = new Intent();
          paramBundle.putExtras((Bundle)localObject);
          if (this.bjW == -1) {
            Toast.makeText(paramActivity, paramActivity.getString(a.i.realname_verify_succ), 0).show();
          }
          localObject = new sz();
          if (this.bjW != -1) {
            break label241;
          }
          ((sz)localObject).cdR.scene = 17;
        }
      }
      for (;;)
      {
        ((sz)localObject).bJX = new a.1(this, (sz)localObject, paramBundle, paramActivity);
        ((sz)localObject).bJX.run();
        return;
        this.bjW = 0;
        break;
        if (((Bundle)localObject).containsKey("realname_verify_process_ret"))
        {
          this.bjW = ((Bundle)localObject).getInt("realname_verify_process_ret", -1);
          break;
        }
        this.bjW = 0;
        break;
        label241:
        if (this.bjW == 0) {
          ((sz)localObject).cdR.scene = 18;
        } else {
          ((sz)localObject).cdR.scene = 0;
        }
      }
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    y(new Object[] { "back", paramActivity, Integer.valueOf(paramInt) });
    p.cDe();
    if ((paramActivity instanceof SwitchRealnameVerifyModeUI)) {
      if (paramInt == 0) {
        b(paramActivity, this.jfZ);
      }
    }
    for (;;)
    {
      if ((paramActivity instanceof WalletPwdConfirmUI)) {
        a(paramActivity, WalletSetPasswordUI.class, paramInt);
      }
      return;
      if (((paramActivity instanceof WalletRealNameVerifyUI)) || ((paramActivity instanceof WalletBankcardIdUI)))
      {
        if (this.pjV != 0) {
          b(paramActivity, this.jfZ);
        }
      }
      else if ((paramActivity instanceof WalletCheckPwdUI)) {
        b(paramActivity, this.jfZ);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */