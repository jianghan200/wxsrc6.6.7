package com.tencent.mm.plugin.wallet_core.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.e;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.fd;
import com.tencent.mm.protocal.c.qk;
import com.tencent.mm.protocal.c.zw;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Collections;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletSwitchVerifyPhoneUI
  extends WalletBaseUI
{
  private SwitchPhoneItemGroupView pyt;
  private List<fd> pyu;
  public boolean pyv = false;
  
  private void bNt()
  {
    x.i("MicroMsg.WalletSwitchVerifyPhoneUI", "directToNext()");
    Authen localAuthen = (Authen)this.sy.getParcelable("key_authen");
    Bankcard localBankcard = (Bankcard)this.sy.getParcelable("key_bankcard");
    ElementQuery localElementQuery = o.bPe().OW(localBankcard.field_bankcardType);
    this.sy.putParcelable("elemt_query", localElementQuery);
    localAuthen.lMV = localBankcard.field_bankcardType;
    localAuthen.lMW = localBankcard.field_bindSerial;
    localBankcard.field_bankPhone = localElementQuery.pnw;
    this.sy.putBoolean("key_balance_change_phone_need_confirm_phone", true);
    this.sy.putBoolean("key_is_changing_balance_phone_num", true);
    this.sy.putInt("key_err_code", 418);
    com.tencent.mm.wallet_core.a.j(this, this.sy);
  }
  
  protected final boolean bND()
  {
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof e))
      {
        paramString = (e)paraml;
        this.pyu = ((e)paraml).pja.rFB;
        Collections.sort(this.pyu, new WalletSwitchVerifyPhoneUI.2(this));
        if (paramString.pja.rFC != null)
        {
          paramString = paramString.pja.rFC;
          this.sy.putString("key_true_name", paramString.plj);
          this.sy.putString("key_cre_name", paramString.ruP);
          this.sy.putString("key_cre_type", paramString.pqP);
        }
        if ((this.pyu == null) || (this.pyu.isEmpty()))
        {
          x.i("MicroMsg.WalletSwitchVerifyPhoneUI", "empty mobile info");
          return true;
        }
        paramInt1 = this.pyu.size() - 1;
        label149:
        if (paramInt1 >= 0)
        {
          paraml = (fd)this.pyu.get(paramInt1);
          if (!paraml.rfW.equals("cft")) {
            break label441;
          }
          SwitchPhoneItemView localSwitchPhoneItemView = new SwitchPhoneItemView(this.mController.tml);
          if (!paraml.rfX.equals("1")) {
            break label304;
          }
          paramString = getString(a.i.wallet_switch_phone_debit_card);
          label219:
          paramString = getString(a.i.wallet_switch_phone_card_hint, new Object[] { paraml.knE, paramString, paraml.rfY });
          if (!this.pyv) {
            break label315;
          }
          paramString = new SpannableString(paramString);
          label267:
          localSwitchPhoneItemView.setTag(Integer.valueOf(paramInt1));
          localSwitchPhoneItemView.a(paraml.pjw, paramString);
          this.pyt.a(localSwitchPhoneItemView, 0);
        }
        for (;;)
        {
          paramInt1 -= 1;
          break label149;
          break;
          label304:
          paramString = getString(a.i.wallet_switch_phone_credit_card);
          break label219;
          label315:
          String str1 = getString(a.i.wallet_switch_phone_update);
          h localh = new h(this);
          String str2 = paramString + "，";
          localh.pN = getResources().getColor(a.c.blue_text_color);
          paramString = new SpannableString(str2 + str1);
          paramString.setSpan(localh, str2.length(), str2.length() + str1.length(), 33);
          localh.pvm = new WalletSwitchVerifyPhoneUI.3(this, paraml);
          break label267;
          label441:
          paramString = new SwitchPhoneItemView(this.mController.tml);
          paramString.setTag(Integer.valueOf(paramInt1));
          paramString.a(paraml.pjw, getString(a.i.wallet_switch_phone_wx_bind_phone));
          this.pyt.a(paramString, 0);
        }
      }
      if ((paraml instanceof t)) {
        bNt();
      }
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_switch_verify_phone_ui;
  }
  
  protected final void initView()
  {
    this.pyt = ((SwitchPhoneItemGroupView)findViewById(a.f.phone_number_container));
    this.pyt.setOnItemSelectListener(new WalletSwitchVerifyPhoneUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    overridePendingTransition(a.a.push_up_in, a.a.anim_not_change);
    super.onCreate(paramBundle);
    setMMTitle(getString(a.i.wallet_switch_phone_title_1));
    initView();
    this.pyv = this.sy.getBoolean("key_block_bind_new_card", false);
    if (!this.pyv)
    {
      paramBundle = new SwitchPhoneItemView(this.mController.tml);
      paramBundle.setTag(Integer.valueOf(-1));
      paramBundle.a(getString(a.i.wallet_switch_phone_bind_new_card), null);
      this.pyt.a(paramBundle, -1);
    }
    if ((cDK() != null) && (cDK().aNK() == "PayProcess") && (this.sy.getInt("key_can_verify_tail", 0) == 1))
    {
      x.i("MicroMsg.WalletSwitchVerifyPhoneUI", "show verify id card item");
      paramBundle = getString(a.i.wallet_idcard_item_text);
      SwitchPhoneItemView localSwitchPhoneItemView = new SwitchPhoneItemView(this.mController.tml, a.g.wallet_switch_verify_phone_idcard_item);
      localSwitchPhoneItemView.setTag(Integer.valueOf(-2));
      localSwitchPhoneItemView.a(paramBundle, null);
      this.pyt.a(localSwitchPhoneItemView, -1);
    }
    jr(1667);
    jr(461);
    jr(1505);
    a(new e(bNs()), true, true);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1667);
    js(461);
    js(1505);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletSwitchVerifyPhoneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */