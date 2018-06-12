package com.tencent.mm.plugin.wallet_core.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class b
  extends a
{
  public com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    y(new Object[] { "start", paramActivity, paramBundle });
    x.d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
    if (paramBundle != null)
    {
      com.tencent.mm.wallet_core.c.q.fu(6, paramBundle.getInt("key_bind_scene"));
      com.tencent.mm.wallet_core.c.p.GZ(paramBundle.getInt("key_bind_scene"));
    }
    while (o.bOW().bPs())
    {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      return this;
      com.tencent.mm.wallet_core.c.q.fu(6, 0);
      com.tencent.mm.wallet_core.c.p.GZ(0);
    }
    if (paramBundle != null) {
      com.tencent.mm.plugin.wallet_core.e.c.ea(paramBundle.getInt("key_bind_scene", 0), 1);
    }
    if ((paramBundle != null) && (paramBundle.getBoolean("key_is_import_bind", false)))
    {
      c(paramActivity, WalletCardImportUI.class, paramBundle);
      return this;
    }
    return super.a(paramActivity, paramBundle);
  }
  
  public g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new b.1(this, paramMMActivity, parami);
    }
    if (((paramMMActivity instanceof WalletCardElementUI)) || ((paramMMActivity instanceof WalletCardImportUI))) {
      return new b.2(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI)) {
      new g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousl instanceof com.tencent.mm.plugin.wallet_core.b.a.a))
            {
              x.i("MicroMsg.BindCardProcess", "verify code success!");
              paramAnonymousString = (com.tencent.mm.plugin.wallet_core.b.a.a)paramAnonymousl;
              b.f(b.this).putString("kreq_token", paramAnonymousString.token);
              return true;
            }
            if (!(paramAnonymousl instanceof com.tencent.mm.plugin.wallet_core.c.q)) {
              break label99;
            }
            b.this.a(this.uXK);
            if (((com.tencent.mm.plugin.wallet_core.c.q)paramAnonymousl).piW != null) {
              b.g(b.this).putParcelable("key_bindcard_value_result", ((com.tencent.mm.plugin.wallet_core.c.q)paramAnonymousl).piW);
            }
          }
          label99:
          while (!(paramAnonymousl instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.h)) {
            return false;
          }
          return true;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          b.this.y(new Object[] { "WalletVerifyCodeUI onNext", paramAnonymousVarArgs });
          x.i("MicroMsg.BindCardProcess", "onNext, do bind verify!");
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.p)paramAnonymousVarArgs[1];
          if (o.bOW().bPs()) {}
          for (paramAnonymousVarArgs.flag = "2"; "realname_verify_process".equals(b.this.aNK()); paramAnonymousVarArgs.flag = "1")
          {
            this.uXK.a(new com.tencent.mm.plugin.wallet_core.c.q(paramAnonymousVarArgs, b.this.jfZ.getInt("entry_scene", -1)), true, 1);
            return true;
          }
          this.uXK.a(new com.tencent.mm.plugin.wallet_core.c.q(paramAnonymousVarArgs), true, 1);
          return true;
        }
      };
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      return new b.4(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    y(new Object[] { "forward", paramActivity, Integer.valueOf(paramInt), paramBundle });
    x.i("MicroMsg.BindCardProcess", "forward Process : BindCardProcess");
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      if (paramBundle.getBoolean("key_is_import_bind", false))
      {
        c(paramActivity, WalletCardImportUI.class, paramBundle);
        return;
      }
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      return;
    }
    if (((paramActivity instanceof WalletCardElementUI)) || ((paramActivity instanceof WalletCardImportUI)))
    {
      if (!bQH())
      {
        x.i("MicroMsg.BindCardProcess", "is domestic bankcard! need verify code!");
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        return;
      }
      if (!o.bOW().bPs())
      {
        x.i("MicroMsg.BindCardProcess", "wallet is not register, start WalletSetPasswordUI!");
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        return;
      }
      x.i("MicroMsg.BindCardProcess", "bind bank card success!!");
      paramBundle.putBoolean("intent_bind_end", true);
      com.tencent.mm.ui.base.h.bA(paramActivity, paramActivity.getString(a.i.wallet_bank_card_bind_success_tips));
      b(paramActivity, paramBundle);
      return;
    }
    BindCardOrder localBindCardOrder;
    String str1;
    String str2;
    String str3;
    int i;
    if (((paramActivity instanceof WalletVerifyCodeUI)) && (o.bOW().bPs()))
    {
      x.i("MicroMsg.BindCardProcess", "end process after verify!");
      paramInt = this.jfZ.getInt("key_bind_scene", -1);
      localBindCardOrder = (BindCardOrder)this.jfZ.getParcelable("key_bindcard_value_result");
      if ((localBindCardOrder != null) && (paramInt == 15))
      {
        str1 = this.jfZ.getString("key_bind_card_type");
        str2 = this.jfZ.getString("key_bind_card_show1");
        str3 = this.jfZ.getString("key_bind_card_show2");
        paramInt = this.jfZ.getInt("key_bind_scene");
        i = this.jfZ.getInt("realname_scene");
        x.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", new Object[] { str1, str2, Integer.valueOf(paramInt), Integer.valueOf(i) });
        localBindCardOrder.lMV = str1;
        localBindCardOrder.pmH = str2;
        localBindCardOrder.pmI = str3;
        localBindCardOrder.pmK = paramInt;
        localBindCardOrder.pmL = i;
        c(paramActivity, WalletBindCardResultUI.class, paramBundle);
        return;
      }
      b(paramActivity, paramBundle);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      x.i("MicroMsg.BindCardProcess", "end process after confirm pwd!");
      com.tencent.mm.plugin.wallet_core.e.c.ea(this.jfZ.getInt("key_bind_scene", 0), 7);
      paramBundle.putBoolean("intent_bind_end", true);
      com.tencent.mm.ui.base.h.bA(paramActivity, paramActivity.getString(a.i.wallet_bank_card_bind_success_tips));
      localBindCardOrder = (BindCardOrder)this.jfZ.getParcelable("key_bindcard_value_result");
      paramInt = this.jfZ.getInt("key_bind_scene", -1);
      if ((localBindCardOrder != null) && (paramInt == 15))
      {
        str1 = this.jfZ.getString("key_bind_card_type");
        str2 = this.jfZ.getString("key_bind_card_show1");
        str3 = this.jfZ.getString("key_bind_card_show2");
        paramInt = this.jfZ.getInt("key_bind_scene");
        i = this.jfZ.getInt("realname_scene");
        x.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", new Object[] { str1, str2, Integer.valueOf(paramInt), Integer.valueOf(i) });
        localBindCardOrder.lMV = str1;
        localBindCardOrder.pmH = str2;
        localBindCardOrder.pmI = str3;
        localBindCardOrder.pmK = paramInt;
        localBindCardOrder.pmL = i;
        c(paramActivity, WalletBindCardResultUI.class, paramBundle);
        return;
      }
      b(paramActivity, paramBundle);
      return;
    }
    if ((paramActivity instanceof WalletBindCardResultUI))
    {
      b(paramActivity, paramBundle);
      return;
    }
    x.i("MicroMsg.BindCardProcess", "super forward!");
    super.a(paramActivity, 0, paramBundle);
  }
  
  public final void a(i parami)
  {
    x.d("MicroMsg.BindCardProcess", "do set user exinfo");
    parami.a(new com.tencent.mm.plugin.wallet_core.id_verify.model.h(this.jfZ.getString("key_country_code", ""), this.jfZ.getString("key_province_code", ""), this.jfZ.getString("key_city_code", ""), (Profession)this.jfZ.getParcelable("key_profession")), false, 1);
  }
  
  public String aNK()
  {
    return "BindCardProcess";
  }
  
  public void b(Activity paramActivity, Bundle paramBundle)
  {
    y(new Object[] { "end", paramActivity, paramBundle });
    x.i("MicroMsg.BindCardProcess", "end Process : BindCardProcess");
    com.tencent.mm.wallet_core.c.p.cDe();
    cCV();
    if ((paramBundle != null) && (paramBundle.getBoolean("key_need_bind_response", false)))
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      a(paramActivity, "wallet", ".bind.ui.WalletBindUI", -1, localIntent, false);
      return;
    }
    e(paramActivity, "mall", ".ui.MallIndexUI");
  }
  
  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    if (o.bOW().bPs())
    {
      if (((paramActivity instanceof WalletCardElementUI)) && (bQH())) {}
      while ((paramActivity instanceof WalletVerifyCodeUI)) {
        return true;
      }
      return false;
    }
    return paramActivity instanceof WalletPwdConfirmUI;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */