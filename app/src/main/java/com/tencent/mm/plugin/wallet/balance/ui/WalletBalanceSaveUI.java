package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.c.ab;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.model.g;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletBalanceSaveUI
  extends WalletBaseUI
{
  private final int eCE = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 270);
  protected Button eWk;
  protected WalletFormView hXD;
  private View hyK;
  private HashMap<String, Integer> lMb = new HashMap();
  public double myQ;
  private ArrayList<Bankcard> oZG;
  protected Bankcard oZH;
  private String oZI;
  public LinearLayout oZK;
  
  private void aL()
  {
    final ImageView localImageView;
    Object localObject;
    if (this.oZK != null)
    {
      if (this.oZH == null) {
        break label282;
      }
      localImageView = (ImageView)this.oZK.findViewById(a.f.bankcard_logo_iv);
      localObject = "";
      e locale = b.h(this, this.oZH.field_bankcardType, this.oZH.bOr());
      if (locale != null) {
        localObject = locale.lCU;
      }
      localImageView.setImageBitmap(null);
      if (!this.oZH.bOs()) {
        break label188;
      }
      localImageView.setBackgroundResource(a.e.wallet_balance_manager_logo_small);
    }
    for (;;)
    {
      ((TextView)this.oZK.findViewById(a.f.balance_bankcard_tv)).setText(getString(a.i.wallet_balance_save_bankcard_tips, new Object[] { this.oZH.field_bankName, this.oZH.field_bankcardTail }));
      ((TextView)this.oZK.findViewById(a.f.wallet_title)).setText(this.oZH.field_bankcardTypeName);
      if (bi.oW(this.oZH.field_avail_save_wording)) {
        break;
      }
      ((TextView)this.oZK.findViewById(a.f.hint_1)).setText(this.oZH.field_avail_save_wording);
      return;
      label188:
      localObject = com.tencent.mm.platformtools.y.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject));
      com.tencent.mm.platformtools.y.a(new y.a()
      {
        public final void m(String paramAnonymousString, Bitmap paramAnonymousBitmap)
        {
          ah.A(new WalletBalanceSaveUI.7.1(this, paramAnonymousBitmap));
        }
      });
      if ((localObject != null) && (localObject != null)) {
        localImageView.setImageBitmap(com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject, getResources().getDimensionPixelOffset(a.d.wallet_offline_bank_logo_width), getResources().getDimensionPixelOffset(a.d.wallet_offline_bank_logo_width), true, false));
      }
    }
    x.i("MicroMsg.WalletBalanceSaveUI", "hy: wording's missing. use default");
    ((TextView)this.oZK.findViewById(a.f.hint_1)).setText("");
    return;
    label282:
    ((TextView)this.oZK.findViewById(a.f.balance_bankcard_tv)).setText(this.oZI);
    ((TextView)this.oZK.findViewById(a.f.hint_1)).setText("");
    ((ImageView)this.oZK.findViewById(a.f.bankcard_logo_iv)).setImageBitmap(null);
    ((TextView)this.oZK.findViewById(a.f.wallet_title)).setText(getString(a.i.wallet_balance_save_bankcard_default_tips));
  }
  
  private void bra()
  {
    p.bNp();
    Object localObject = p.bNq();
    this.oZG = ((ag)localObject).bPF();
    this.oZH = ((ag)localObject).a(this.oZG, null, false, true);
    int i;
    if ((this.oZH != null) && (bi.oW(this.oZH.field_forbidWord)))
    {
      this.oZH = null;
      i = 0;
    }
    for (;;)
    {
      if (i < this.oZG.size())
      {
        if ((this.oZG.get(i) != null) && (bi.oW(((Bankcard)this.oZG.get(i)).field_forbidWord))) {
          this.oZH = ((Bankcard)this.oZG.get(i));
        }
      }
      else
      {
        if ((this.oZH != null) && (!bi.oW(this.oZH.field_forbidWord))) {
          this.oZH = null;
        }
        localObject = this.oZG;
        if (localObject == null) {
          break;
        }
        i = 0;
        while (i < ((ArrayList)localObject).size())
        {
          x.v("MicroMsg.WalletBalanceSaveUI", "pos %s word %s", new Object[] { Integer.valueOf(i), ((Bankcard)((ArrayList)localObject).get(i)).field_forbidWord });
          i += 1;
        }
      }
      i += 1;
    }
  }
  
  public void bNa()
  {
    if (this.oZH != null)
    {
      a(new com.tencent.mm.plugin.wallet.balance.a.c(this.myQ, "CNY", this.oZH.field_bindSerial, this.oZH.field_bankcardType), true, true);
      return;
    }
    g localg = g.bOA();
    if (localg.aKp())
    {
      com.tencent.mm.ui.base.h.b(this, localg.lMX, getString(a.i.app_tip), true);
      return;
    }
    a(new com.tencent.mm.plugin.wallet.balance.a.c(this.myQ, "CNY", "", ""), true, true);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof com.tencent.mm.plugin.wallet.balance.a.c))
      {
        localObject = (com.tencent.mm.plugin.wallet.balance.a.c)paraml;
        if ("1".equals(((com.tencent.mm.plugin.wallet.balance.a.c)localObject).ced))
        {
          x.i("MicroMsg.WalletBalanceSaveUI", "need realname verify");
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceSaveUI");
          paramString.putString("realname_verify_process_jump_plugin", "wallet");
          str = ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).cee;
          str = ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).cef;
          localObject = ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).ceg;
          bbR();
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString, 0);
          if (!bool) {
            break label205;
          }
        }
      }
    }
    label205:
    while (!(paraml instanceof com.tencent.mm.plugin.wallet.balance.a.c))
    {
      do
      {
        for (;;)
        {
          Object localObject;
          String str;
          boolean bool;
          return false;
          if ("2".equals(((com.tencent.mm.plugin.wallet.balance.a.c)localObject).ced))
          {
            x.i("MicroMsg.WalletBalanceSaveUI", "need upload credit");
            bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).cee, ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).ceh, ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).cef, ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).ceg, bbR(), null);
          }
          else
          {
            x.i("MicroMsg.WalletBalanceSaveUI", "realnameGuideFlag =  " + ((com.tencent.mm.plugin.wallet.balance.a.c)localObject).ced);
            bool = false;
          }
        }
        paraml = ((com.tencent.mm.plugin.wallet.balance.a.c)paraml).bQa;
        u.j(11, paraml, paramInt2);
        if (com.tencent.mm.plugin.wallet.b.a.bOi())
        {
          if (this.oZH == null) {}
          for (paramString = "";; paramString = this.oZH.field_bindSerial)
          {
            double d = this.myQ;
            if (bi.oW(paraml)) {
              break;
            }
            paraml = com.tencent.mm.pluginsdk.wallet.h.I(paraml, "", 11);
            paraml.qUS = d;
            com.tencent.mm.pluginsdk.wallet.h.a(this, true, paramString, paraml, 1);
            return false;
          }
        }
        if (this.oZH == null) {}
        for (paramString = "";; paramString = this.oZH.field_bindSerial)
        {
          com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, paraml, "", 11, 1);
          return false;
        }
      } while (!(paraml instanceof com.tencent.mm.plugin.wallet_core.c.y));
      bra();
      aL();
      return false;
    }
    u.j(11, "", paramInt2);
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_balance_save_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.wallet_balance_save_title);
    this.hyK = findViewById(a.f.save_root_view);
    this.hXD = ((WalletFormView)findViewById(a.f.money_ev));
    com.tencent.mm.wallet_core.ui.formview.a.f(this.hXD);
    this.hXD.getTitleTv().setText(v.cDm());
    d(this.hXD, 2, false);
    this.eWk = ((Button)findViewById(a.f.next_btn));
    this.eWk.setOnClickListener(new WalletBalanceSaveUI.1(this));
    this.oZK = ((LinearLayout)findViewById(a.f.balance_bankcard_layout));
    if (this.oZK != null) {
      this.oZK.setOnClickListener(new WalletBalanceSaveUI.2(this));
    }
    this.kTx = new WalletBalanceSaveUI.3(this);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!com.tencent.mm.model.q.GS())
    {
      if (!com.tencent.mm.plugin.wallet.b.a.bOi()) {
        break label59;
      }
      a(new ab(), false, false);
    }
    for (;;)
    {
      bra();
      this.oZI = getString(a.i.wallet_balance_save_bind_new_card_to_save);
      initView();
      aL();
      com.tencent.mm.wallet_core.c.q.fu(3, 0);
      return;
      label59:
      a(new com.tencent.mm.plugin.wallet_core.c.y(null, 3), false, false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */