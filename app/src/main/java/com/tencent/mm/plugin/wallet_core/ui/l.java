package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.c.ac;
import com.tencent.mm.plugin.wallet_core.c.s;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class l
  extends c
{
  private String eTo;
  private String pjx;
  private int scene;
  private String token;
  
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.i("MicroMsg.WalletJSApiVerifyCodeProcess", "start WalletJSApiVerifyCodeProcess");
    this.pjx = paramBundle.getString("key_relation_key");
    this.eTo = paramBundle.getString("key_pwd1");
    this.token = paramBundle.getString("key_jsapi_token");
    this.scene = paramBundle.getInt("key_verify_scene");
    c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
    return this;
  }
  
  public final g a(final MMActivity paramMMActivity, final i parami)
  {
    new g(paramMMActivity, parami)
    {
      public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ab.l paramAnonymousl)
      {
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          if ((paramAnonymousl instanceof ac))
          {
            x.i("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms succ");
            paramAnonymousString = (ac)paramAnonymousl;
            paramAnonymousl = l.this.jfZ;
            paramAnonymousl.putString("key_jsapi_token", paramAnonymousString.pjE);
            l.this.b(paramMMActivity, paramAnonymousl);
          }
          while ((paramAnonymousl instanceof s)) {
            return true;
          }
          return false;
        }
        if ((paramAnonymousl instanceof ac)) {
          x.e("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms fail,errType=" + paramAnonymousInt1 + ",errCode=" + paramAnonymousInt2 + ",errMsg=" + paramAnonymousString);
        }
        return false;
      }
      
      public final boolean m(Object... paramAnonymousVarArgs)
      {
        if (paramAnonymousVarArgs.length == 2)
        {
          paramAnonymousVarArgs = (p)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.token = l.a(l.this);
          x.i("MicroMsg.WalletJSApiVerifyCodeProcess", "do NetSceneTenpayVerifySmsByPasswd");
          paramAnonymousVarArgs = new ac(paramAnonymousVarArgs, l.b(l.this));
          parami.a(paramAnonymousVarArgs, true, 1);
          return true;
        }
        x.e("MicroMsg.WalletJSApiVerifyCodeProcess", "arguments is error");
        return false;
      }
      
      public final boolean s(Object... paramAnonymousVarArgs)
      {
        x.i("MicroMsg.WalletJSApiVerifyCodeProcess", "resend sms");
        paramAnonymousVarArgs = new s(l.c(l.this), l.a(l.this), '\000');
        parami.a(paramAnonymousVarArgs, true, 1);
        return true;
      }
      
      public final CharSequence ui(int paramAnonymousInt)
      {
        return String.format(paramMMActivity.getResources().getString(a.i.wallet_verify_code_hint), new Object[] { l.this.jfZ.getString("key_mobile") });
      }
    };
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle) {}
  
  public final String aNK()
  {
    return null;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    x.i("MicroMsg.WalletJSApiVerifyCodeProcess", "end WalletJSApiVerifyCodeProcess");
    if (this.scene == 8)
    {
      a(paramActivity, "wallet", ".pay.ui.WalletLoanRepaymentUI", -1, null, false);
      return;
    }
    a(paramActivity, WalletCheckPwdUI.class, -1, null, false);
  }
  
  public final void c(Activity paramActivity, int paramInt) {}
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */