package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxcredit.a.d;
import com.tencent.mm.plugin.wxcredit.a.j;
import com.tencent.mm.plugin.wxcredit.a.k;
import com.tencent.mm.plugin.wxcredit.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;

@com.tencent.mm.ui.base.a(3)
public class WalletWXCreditDetailUI
  extends WalletPreferenceUI
{
  private f eOE;
  private boolean hasInit = false;
  private View.OnClickListener mVS = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.getId() == a.f.wallet_wxcredit_detail_username_tv) {
        if (WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this) != null) {
          com.tencent.mm.wallet_core.ui.e.ac(WalletWXCreditDetailUI.this, WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this).qwG.username);
        }
      }
      while ((paramAnonymousView.getId() != a.f.wallet_wxcredit_detail_help_tv) || (WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this) == null)) {
        return;
      }
      com.tencent.mm.wallet_core.ui.e.l(WalletWXCreditDetailUI.this, WalletWXCreditDetailUI.b(WalletWXCreditDetailUI.this).qwF, false);
    }
  };
  private Bankcard pdJ;
  private com.tencent.mm.wallet_core.c qxn;
  private k qxo;
  
  private void aL()
  {
    if (!this.hasInit) {
      initView();
    }
    Object localObject1;
    Object localObject2;
    if (this.qxo != null)
    {
      localObject1 = (WalletWXCreditDetailHeaderPreference)this.eOE.ZZ("wallet_wxcredit_header");
      double d = this.qxo.qws;
      ((WalletWXCreditDetailHeaderPreference)localObject1).eBQ.setText(com.tencent.mm.wallet_core.ui.e.B(d));
      localObject2 = this.pdJ.field_bankName;
      String str = this.qxo.qwE;
      ((WalletWXCreditDetailHeaderPreference)localObject1).qxm.setText(((Preference)localObject1).mContext.getString(a.i.wallet_wxcredit_update_tips, new Object[] { str, localObject2 }));
    }
    boolean bool;
    if (this.qxo != null)
    {
      this.eOE.ZZ("wallet_wxcredit_total_amount").setTitle(getString(a.i.wallet_wxcredit_detail_total_amount, new Object[] { com.tencent.mm.wallet_core.ui.e.B(this.qxo.qwm) }));
      localObject1 = this.eOE;
      if (this.qxo.qwx) {
        break label368;
      }
      bool = true;
      ((f)localObject1).bw("wallet_wxcredit_change_amount", bool);
      localObject1 = this.eOE.ZZ("wallet_wxcredit_bill");
      if (this.qxo.qwt != 0.0D) {
        ((Preference)localObject1).setSummary(com.tencent.mm.wallet_core.ui.e.B(this.qxo.qwt));
      }
      localObject1 = this.eOE.ZZ("wallet_wxcredit_repayment");
      localObject2 = this.eOE.ZZ("wallet_wxcredit_repayment_tips");
      if (this.qxo.qwv <= 0.0D) {
        break label373;
      }
      ((Preference)localObject1).setSummary(com.tencent.mm.wallet_core.ui.e.B(this.qxo.qwv));
      ((Preference)localObject2).setTitle(getString(a.i.wallet_wxcredit_repayment_tips, new Object[] { this.qxo.qwA }));
      this.eOE.bw("wallet_wxcredit_repayment_tips", false);
    }
    for (;;)
    {
      if (this.pdJ != null) {
        this.eOE.ZZ("wallet_wxcredit_bank_name").setTitle(this.pdJ.field_bankName);
      }
      ((WalletWXCreditDetailFooterPreference)this.eOE.ZZ("wallet_wxcredit_footer")).mVS = this.mVS;
      this.eOE.notifyDataSetChanged();
      return;
      label368:
      bool = false;
      break;
      label373:
      this.eOE.bw("wallet_wxcredit_repayment_tips", true);
    }
  }
  
  private boolean cbc()
  {
    if (this.pdJ == null) {
      return false;
    }
    if (this.pdJ.field_bankcardState == 0) {
      return true;
    }
    int i = this.pdJ.field_wxcreditState;
    if (this.qxo != null) {
      i = this.qxo.qwr;
    }
    switch (i)
    {
    case 2: 
    default: 
      return true;
    case 1: 
      long l = bi.bG(o.bOW().prJ);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WalletUserInfoManger", "pass time " + l);
      if (l > 300L) {}
      for (i = 1; i != 0; i = 0) {
        return true;
      }
    case 3: 
      h.a(this, a.i.wallet_wxcredit_detail_review_fail, -1, false, new WalletWXCreditDetailUI.1(this));
      return false;
    case 5: 
      this.qxn.jfZ.putBoolean("key_can_unbind", false);
    }
    if (this.qxo != null)
    {
      this.qxn.jfZ.putString("key_repayment_url", this.qxo.qwz);
      this.qxn.a(this, 1, this.qxn.jfZ);
      return false;
    }
    return true;
  }
  
  public final int Ys()
  {
    return a.l.wallet_wxcredit_detail_pref;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    paramf = paramPreference.mKey;
    boolean bool1;
    if ("wallet_wxcredit_change_amount".equals(paramf))
    {
      paramf = new Bundle();
      paramf.putParcelable("key_bankcard", this.pdJ);
      com.tencent.mm.wallet_core.a.a(this, b.class, paramf);
      bool1 = true;
    }
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
              do
              {
                return bool1;
                if (!"wallet_wxcredit_bill".equals(paramf)) {
                  break;
                }
                bool1 = bool2;
              } while (this.qxo == null);
              paramf = new Bundle();
              paramf.putString("key_url", this.qxo.qwD);
              com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wxcredit.c.class, paramf);
              return false;
              if (!"wallet_wxcredit_card_info".equals(paramf)) {
                break;
              }
              bool1 = bool2;
            } while (this.qxo == null);
            paramf = new Bundle();
            paramf.putString("key_url", this.qxo.qwB);
            com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wxcredit.c.class, paramf);
            return false;
            if (!"wallet_wxcredit_right".equals(paramf)) {
              break;
            }
            bool1 = bool2;
          } while (this.qxo == null);
          com.tencent.mm.wallet_core.ui.e.l(this, this.qxo.qwC, false);
          return false;
          if (!"wallet_wxcredit_repayment".equals(paramf)) {
            break;
          }
          bool1 = bool2;
        } while (this.qxo == null);
        com.tencent.mm.wallet_core.ui.e.l(this, this.qxo.qwz, false);
        return false;
        bool1 = bool2;
      } while (!"wallet_wxcredit_bank_name".equals(paramf));
      bool1 = bool2;
    } while (this.qxo == null);
    com.tencent.mm.wallet_core.ui.e.ab(this, this.qxo.qwG.username);
    return false;
  }
  
  public final boolean h(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof d))
      {
        o.bOW().prJ = (System.currentTimeMillis() / 1000L);
        this.qxo = ((d)paraml).qwn;
        if ((this.qxo != null) && (this.qxo.qwr == 2))
        {
          com.tencent.mm.kernel.g.Ek();
          if (((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(196658, Boolean.valueOf(false))).booleanValue())
          {
            paramString = com.tencent.mm.wallet_core.a.af(this);
            paraml = paramString.jfZ;
            paraml.putDouble("key_total_amount", this.qxo.qwm);
            paraml.putBoolean("key_can_upgrade_amount", this.qxo.qwx);
            paramString.a(this, WalletWXCreditOpenNotifyUI.class, paraml, 1);
          }
        }
        for (;;)
        {
          return true;
          if (cbc())
          {
            ux(0);
            aL();
          }
        }
      }
      if (!(paraml instanceof com.tencent.mm.plugin.wxcredit.a.i)) {
        break label187;
      }
      cDP().a(new y(), true, 1);
    }
    for (;;)
    {
      return false;
      label187:
      if ((paraml instanceof y)) {
        finish();
      }
    }
  }
  
  protected final void initView()
  {
    this.hasInit = true;
    setMMTitle(a.i.wallet_wxcredit_detail_title);
    this.eOE = this.tCL;
    setBackBtn(new WalletWXCreditDetailUI.2(this));
    addIconOptionMenu(0, a.e.mm_title_btn_menu, new WalletWXCreditDetailUI.4(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ux(0);
    aL();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cDP().jr(621);
    cDP().jr(600);
    ux(4);
    this.qxn = com.tencent.mm.wallet_core.a.af(this);
    if (this.pdJ == null) {
      this.pdJ = ((Bankcard)this.qxn.jfZ.getParcelable("key_bankcard"));
    }
    if (cbc())
    {
      if (this.uYP == null)
      {
        if (this.uYN == null) {
          this.uYN = com.tencent.mm.wallet_core.a.af(this);
        }
        this.uYP = this.uYN.a(this, this.uYO);
      }
      if (!this.uYP.r(new Object[] { this.pdJ }))
      {
        ux(0);
        initView();
      }
    }
  }
  
  protected void onDestroy()
  {
    cDP().js(621);
    cDP().js(600);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */