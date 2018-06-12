package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.g.a.sy.b;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.b.a;
import com.tencent.mm.plugin.wallet_core.ui.i;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletBalanceFetchUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private String bOd = null;
  private final int eCE = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 270);
  private Button eWk;
  private View hyK;
  private double myQ;
  private ArrayList<Bankcard> oZG;
  private Bankcard oZH;
  private String oZI;
  private WalletFormView oZJ;
  private LinearLayout oZK;
  private View oZL;
  private TextView oZM;
  private TextView oZN;
  private TextView oZO;
  private TextView oZP;
  private TextView oZQ;
  private int oZR = 0;
  private int oZS = 0;
  private int oZT = 0;
  private double oZU = 0.0D;
  private int oZV = -1;
  private int oZW = 0;
  private DecimalFormat oZX = new DecimalFormat("0.00");
  private boolean oZY = false;
  private boolean oZZ = false;
  private boolean paa = false;
  private boolean pab = false;
  private boolean pac = false;
  
  private void a(com.tencent.mm.plugin.wallet.balance.a.b paramb)
  {
    if (!bi.oW(this.bOd))
    {
      Object localObject = new PayInfo();
      ((PayInfo)localObject).bOd = this.bOd;
      ((PayInfo)localObject).bVY = 21;
      this.sy.putParcelable("key_pay_info", (Parcelable)localObject);
      localObject = new Orders();
      ((Orders)localObject).mBj = (paramb.mxP - paramb.mxE);
      ((Orders)localObject).poO = (paramb.mxP - paramb.mxE);
      ((Orders)localObject).ppf.add(new Orders.Commodity());
      ((Orders)localObject).mxE = paramb.mxE;
      this.sy.putParcelable("key_orders", (Parcelable)localObject);
      this.sy.putParcelable("key_bankcard", this.oZH);
      if (cDK() == null)
      {
        com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.b.class, this.sy, null);
        return;
      }
      cDL().m(new Object[] { this.sy });
      return;
    }
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.WalletBalanceFetchUI", "hy: req key is null. abandon");
  }
  
  private void aL()
  {
    ImageView localImageView;
    final Object localObject;
    if (this.oZJ.getTitleTv() != null)
    {
      this.oZJ.getTitleTv().setText(String.format(getString(a.i.remittance_fee_tips), new Object[] { com.tencent.mm.wallet_core.c.v.cDm() }));
      localImageView = (ImageView)this.oZK.findViewById(a.f.bankcard_logo_iv);
      if (this.oZH == null) {
        break label495;
      }
      localObject = "";
      com.tencent.mm.plugin.wallet_core.model.e locale = com.tencent.mm.plugin.wallet_core.d.b.h(this, this.oZH.field_bankcardType, this.oZH.bOr());
      if (locale != null) {
        localObject = locale.lCU;
      }
      localImageView.setImageBitmap(null);
      if (!this.oZH.bOs()) {
        break label404;
      }
      localImageView.setBackgroundResource(a.e.wallet_balance_manager_logo_small);
      label115:
      ((TextView)this.oZK.findViewById(a.f.balance_bankcard_tv)).setText(getString(a.i.wallet_balance_save_bankcard_tips, new Object[] { this.oZH.field_bankName, this.oZH.field_bankcardTail }));
      ((TextView)this.oZK.findViewById(a.f.balance_bankcard_tv)).setVisibility(0);
      if (!bi.oW(this.oZH.field_fetchArriveTimeWording))
      {
        ((TextView)this.oZK.findViewById(a.f.hint_1)).setText(this.oZH.field_fetchArriveTimeWording);
        ((TextView)this.oZK.findViewById(a.f.hint_1)).setVisibility(0);
        if (this.oZH.field_is_hightlight_pre_arrive_time_wording != 1) {
          break label470;
        }
        ((TextView)this.oZK.findViewById(a.f.hint_1)).setTextColor(Color.parseColor("#FA962A"));
      }
      label265:
      this.oZO.setText("");
      this.oZO.setVisibility(8);
      label284:
      p.bNp();
      localObject = p.bNq().paw.plZ;
      if (bi.oW((String)localObject)) {
        break label586;
      }
      this.oZN.setVisibility(0);
      this.oZN.setText((CharSequence)localObject);
    }
    for (;;)
    {
      bMS();
      p.bNp();
      localObject = p.bNq().prE;
      this.mController.removeAllOptionMenu();
      if ((localObject != null) && (((com.tencent.mm.plugin.wallet_core.model.b)localObject).plE != null) && (((com.tencent.mm.plugin.wallet_core.model.b)localObject).plE.plG != null) && (((com.tencent.mm.plugin.wallet_core.model.b)localObject).plE.plG.length > 0)) {
        addIconOptionMenu(0, a.h.actionbar_icon_dark_more, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            paramAnonymousMenuItem = new com.tencent.mm.ui.widget.a.d(WalletBalanceFetchUI.this.mController.tml, 1, false);
            paramAnonymousMenuItem.ofp = new WalletBalanceFetchUI.17.1(this);
            paramAnonymousMenuItem.ofq = new WalletBalanceFetchUI.17.2(this);
            paramAnonymousMenuItem.bXO();
            return true;
          }
        });
      }
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "mTotalFeeEHV.getTitleTv() is null");
      break;
      label404:
      localObject = com.tencent.mm.platformtools.y.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject));
      com.tencent.mm.platformtools.y.a(new WalletBalanceFetchUI.16(this, localImageView));
      if ((localObject == null) || (localObject == null)) {
        break label115;
      }
      localImageView.setImageBitmap(com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject, getResources().getDimensionPixelOffset(a.d.wallet_offline_bank_logo_width), getResources().getDimensionPixelOffset(a.d.wallet_offline_bank_logo_width), true, false));
      break label115;
      label470:
      ((TextView)this.oZK.findViewById(a.f.hint_1)).setTextColor(Color.parseColor("#B2B2B2"));
      break label265;
      label495:
      localImageView.setImageBitmap(null);
      ((TextView)this.oZK.findViewById(a.f.balance_bankcard_tv)).setText(this.oZI);
      ((TextView)this.oZK.findViewById(a.f.hint_1)).setText("");
      ((TextView)this.oZK.findViewById(a.f.hint_1)).setVisibility(8);
      ((ImageView)this.oZK.findViewById(a.f.bankcard_logo_iv)).setImageBitmap(null);
      this.oZO.setVisibility(8);
      break label284;
      label586:
      this.oZN.setVisibility(8);
    }
  }
  
  private void ad(Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_bind_end", false))) {}
    for (boolean bool = true;; bool = false)
    {
      this.oZY = bool;
      if (this.oZY)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card success");
        PayInfo localPayInfo = (PayInfo)this.sy.get("key_pay_info");
        paramIntent = localPayInfo;
        if (localPayInfo == null)
        {
          paramIntent = new PayInfo();
          paramIntent.bOd = this.bOd;
          paramIntent.bVY = 21;
        }
        if (!com.tencent.mm.plugin.wallet.b.a.bOi()) {
          break;
        }
        a(new com.tencent.mm.plugin.wallet_core.c.v(paramIntent.bOd), true, false);
      }
      return;
    }
    a(new com.tencent.mm.plugin.wallet_core.c.y(paramIntent.bOd, 4), true, false);
  }
  
  private boolean b(com.tencent.mm.plugin.wallet.balance.a.b paramb)
  {
    boolean bool1;
    if (!this.oZZ) {
      if (paramb.oYz)
      {
        this.oZZ = true;
        h.a(this, false, paramb.oYA, "", getString(a.i.app_ok), getString(a.i.app_cancel), new WalletBalanceFetchUI.2(this, paramb), new WalletBalanceFetchUI.3(this));
        bool1 = true;
      }
    }
    for (;;)
    {
      boolean bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.paa)
        {
          com.tencent.mm.plugin.wallet_core.model.b localb = paramb.oYB;
          if ((localb == null) || ((TextUtils.isEmpty(localb.plA)) && ((localb.plB == null) || (localb.plB.size() <= 0)))) {
            break label235;
          }
          this.paa = true;
          i.a(this, localb, false, new WalletBalanceFetchUI.4(this, paramb), new WalletBalanceFetchUI.5(this));
          bool2 = true;
        }
      }
      for (;;)
      {
        if ((!bool2) && (!this.pab))
        {
          paramb = paramb.oYC;
          if ((paramb != null) && ((!TextUtils.isEmpty(paramb.plA)) || ((paramb.plB != null) && (paramb.plB.size() > 0))))
          {
            this.pab = true;
            i.a(this, paramb, true, new WalletBalanceFetchUI.6(this), new WalletBalanceFetchUI.7(this));
            return true;
            bool1 = false;
            break;
            label235:
            bool2 = false;
            continue;
          }
          return false;
        }
      }
      return bool2;
      bool1 = false;
    }
  }
  
  private void bMS()
  {
    this.myQ = bi.getDouble(this.oZJ.getText(), 0.0D);
    double d;
    StringBuilder localStringBuilder;
    if (this.myQ > 0.0D)
    {
      this.eWk.setEnabled(true);
      d = this.myQ;
      p.bNp();
      if ((d != p.bNq().paw.plX) && (this.oZH != null))
      {
        d = this.myQ;
        p.bNp();
        if (d != p.bNq().paw.plX - this.oZH.field_full_fetch_charge_fee) {
          this.oZW = 0;
        }
      }
      localStringBuilder = new StringBuilder();
      d = this.myQ;
      p.bNp();
      if (d <= p.bNq().paw.plV) {
        break label193;
      }
      this.oZQ.setVisibility(8);
      this.oZP.setTextColor(getResources().getColor(a.c.red));
      localStringBuilder.append(getString(a.i.wallet_balance_input_amount_exceed_balance_tips));
    }
    for (;;)
    {
      this.oZP.setText(localStringBuilder.toString());
      return;
      this.eWk.setEnabled(false);
      break;
      label193:
      Object localObject;
      if ((this.oZH != null) && (this.oZR != 0) && ((this.oZR != 1) || (this.oZH.field_fetch_charge_rate > 0.0D)) && ((this.oZR != 1) || (this.oZH.field_fetch_charge_rate <= 0.0D) || (this.oZS != 0)))
      {
        d = this.oZU;
        p.bNp();
        if (d < p.bNq().paw.plX) {}
      }
      else
      {
        this.oZQ.setVisibility(0);
        this.oZP.setTextColor(getResources().getColor(a.c.hint_text_color));
        p.bNp();
        localObject = p.bNq().paw.pma;
        if (!bi.oW((String)localObject)) {
          localStringBuilder.append((String)localObject);
        }
        for (;;)
        {
          localStringBuilder.append("，");
          break;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          p.bNp();
          d = p.bNq().paw.plX;
          localStringBuilder.append(getString(a.i.wallet_balance_fetch_fetch_fee, new Object[] { com.tencent.mm.wallet_core.ui.e.e(d, "CNY") }));
        }
      }
      if ((this.oZR == 1) && (this.oZH.field_fetch_charge_rate > 0.0D) && (this.oZS == 1) && ((this.myQ <= 0.0D) || (!this.oZJ.ZF())))
      {
        this.oZQ.setVisibility(0);
        this.oZP.setTextColor(getResources().getColor(a.c.hint_text_color));
        p.bNp();
        localObject = p.bNq().paw.pma;
        if (!bi.oW((String)localObject)) {
          localStringBuilder.append((String)localObject);
        }
        for (;;)
        {
          localStringBuilder.append("，");
          break;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          p.bNp();
          d = p.bNq().paw.plX;
          localStringBuilder.append(getString(a.i.wallet_balance_fetch_fetch_fee, new Object[] { com.tencent.mm.wallet_core.ui.e.e(d, "CNY") }));
        }
      }
      if ((this.oZR == 1) && (this.oZH.field_fetch_charge_rate > 0.0D) && (this.oZS == 1))
      {
        this.oZQ.setVisibility(8);
        this.oZP.setTextColor(getResources().getColor(a.c.hint_text_color));
        d = this.myQ;
        p.bNp();
        if ((d == p.bNq().paw.plX - this.oZH.field_full_fetch_charge_fee) && (this.oZH.field_full_fetch_charge_fee > 0.0D))
        {
          localStringBuilder.append(getString(a.i.wallet_balance_additional_deduction_fee_tips_1, new Object[] { com.tencent.mm.wallet_core.ui.e.e(this.oZH.field_full_fetch_charge_fee, "CNY"), this.oZH.field_fetch_charge_rate * 100.0D + "%" }));
        }
        else
        {
          int i = a.i.wallet_balance_additional_deduction_fee_tips_1;
          d = this.myQ;
          p.bNp();
          localObject = p.bNq();
          localStringBuilder.append(getString(i, new Object[] { com.tencent.mm.wallet_core.ui.e.e(Math.max(Math.round((d - ((ag)localObject).prE.mxI) * this.oZH.field_fetch_charge_rate * 100.0D) / 100.0D, ((ag)localObject).prE.oZU), "CNY"), this.oZH.field_fetch_charge_rate * 100.0D + "%" }));
        }
      }
    }
  }
  
  private void bMT()
  {
    this.oZZ = false;
    this.paa = false;
    this.pab = false;
    this.pac = false;
  }
  
  private void bMU()
  {
    Object localObject = com.tencent.mm.plugin.wallet_core.model.g.bOA();
    if (((com.tencent.mm.plugin.wallet_core.model.g)localObject).aKp())
    {
      h.b(this, ((com.tencent.mm.plugin.wallet_core.model.g)localObject).lMX, getString(a.i.app_tip), true);
      return;
    }
    Bundle localBundle = new Bundle();
    PayInfo localPayInfo = (PayInfo)this.sy.get("key_pay_info");
    localObject = localPayInfo;
    if (localPayInfo == null)
    {
      localObject = new PayInfo();
      ((PayInfo)localObject).bOd = this.bOd;
      ((PayInfo)localObject).bVY = 21;
    }
    if (localObject != null) {
      localBundle.putParcelable("key_pay_info", (Parcelable)localObject);
    }
    localBundle.putInt("key_scene", 21);
    localBundle.putInt("key_bind_scene", 0);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putInt("key_bind_scene", 0);
    localBundle.putBoolean("key_is_bind_bankcard", true);
    localBundle.putInt("from_bind_ui", com.tencent.mm.plugin.wallet.balance.a.oYx);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.a.class, localBundle, null);
  }
  
  private void bra()
  {
    p.bNp();
    ag localag = p.bNq();
    Object localObject2;
    int i;
    if (this.oZY)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "is from new bind bankcard");
      localObject1 = new ArrayList();
      localObject2 = new ArrayList();
      if ((this.oZG != null) && (this.oZG.size() > 0)) {
        ((ArrayList)localObject1).addAll(this.oZG);
      }
      this.oZG = localag.bPF();
      if ((this.oZG != null) && (this.oZG.size() > 0)) {
        ((ArrayList)localObject2).addAll(this.oZG);
      }
      if ((((ArrayList)localObject1).size() <= 0) || (((ArrayList)localObject2).size() <= 0)) {
        break label510;
      }
      ArrayList localArrayList = new ArrayList();
      i = 0;
      while (i < ((ArrayList)localObject1).size())
      {
        Bankcard localBankcard1 = (Bankcard)((ArrayList)localObject1).get(i);
        int j = 0;
        while (j < ((ArrayList)localObject2).size())
        {
          Bankcard localBankcard2 = (Bankcard)((ArrayList)localObject2).get(j);
          if ((localBankcard1 != null) && (localBankcard2 != null) && (localBankcard1.field_bindSerial.equals(localBankcard2.field_bindSerial))) {
            localArrayList.add(localBankcard2);
          }
          j += 1;
        }
        i += 1;
      }
      if (localArrayList.size() > 0) {
        ((ArrayList)localObject2).removeAll(localArrayList);
      }
      if (((ArrayList)localObject2).size() <= 0) {
        break label510;
      }
    }
    label340:
    label496:
    label510:
    for (Object localObject1 = (Bankcard)((ArrayList)localObject2).get(0);; localObject1 = null)
    {
      if (localObject1 == null) {
        localObject1 = localag.a(this.oZG, null, false, true);
      }
      for (;;)
      {
        i = 0;
        if ((this.oZG != null) && (i < this.oZG.size()))
        {
          localObject2 = (Bankcard)this.oZG.get(i);
          if ((localObject1 != null) && (localObject2 != null) && (((Bankcard)localObject1).field_bindSerial.equals(((Bankcard)localObject2).field_bindSerial))) {
            this.oZV = i;
          }
        }
        else
        {
          this.oZH = ((Bankcard)localObject1);
          this.oZY = false;
          if (localag.prE == null) {
            break label496;
          }
          this.oZR = localag.prE.oZR;
          this.oZS = localag.prE.oZS;
          this.oZU = localag.prE.oZU;
          this.oZT = localag.prE.oZT;
        }
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "is_show_charge:" + this.oZR + " is_cal_charge:" + this.oZS + " min_charge_fee:" + this.oZU + " is_full_fetch_direct:" + this.oZT);
          return;
          i += 1;
          break;
          this.oZG = localag.bPF();
          this.oZH = localag.a(this.oZG, null, false, true);
          break label340;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletBalanceFetchUI", "BalanceFetchInfo is null");
        }
      }
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof com.tencent.mm.plugin.wallet.balance.a.b))
      {
        paramString = (com.tencent.mm.plugin.wallet.balance.a.b)paraml;
        this.oZZ = false;
        if (!this.pac) {
          this.paa = false;
        }
        this.pab = false;
        this.pac = false;
        if ("1".equals(paramString.ced))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "need realname verify");
          paraml = new Bundle();
          paraml.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceFetchUI");
          paraml.putString("realname_verify_process_jump_plugin", "wallet");
          str = paramString.cee;
          str = paramString.cef;
          str = paramString.ceg;
          bbR();
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paraml, 0);
          if (!bool) {
            break label222;
          }
        }
      }
    }
    label222:
    while (!(paraml instanceof com.tencent.mm.plugin.wallet.balance.a.b))
    {
      boolean bool;
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              String str;
              return false;
              if ("2".equals(paramString.ced))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "need upload credit");
                bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString.cee, paramString.ceh, paramString.cef, paramString.ceg, bbR(), null);
              }
              else
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "realnameGuideFlag =  " + paramString.ced);
                bool = false;
              }
            }
            u.j(21, paramString.bQa, paramInt2);
          } while (b(paramString));
          this.bOd = paramString.bQa;
          a(paramString);
          return false;
        } while (!(paraml instanceof com.tencent.mm.plugin.wallet_core.c.y));
        bra();
        aL();
        if (this.oZR != 0)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "showRemainFeeTip is_show_charge =" + this.oZR);
          return false;
        }
        com.tencent.mm.kernel.g.Ek();
        bool = ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sSX, Boolean.valueOf(false))).booleanValue();
        p.bNp();
        paramString = p.bNq().prE;
      } while ((paramString == null) || (bool));
      double d = paramString.mxI;
      h.a(this, getString(a.i.wallet_pay_fetch_tip_dialog_content, new Object[] { com.tencent.mm.wallet_core.ui.e.B(d) }), getString(a.i.wallet_pay_fetch_tip_dialog_title), getString(a.i.wallet_i_know_it), getString(a.i.wallet_pay_fetch_to_read_charge_rule), new WalletBalanceFetchUI.8(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", WalletBalanceFetchUI.this.getString(a.i.wallet_fetch_charge_rule_doc));
          localIntent.putExtra("showShare", false);
          com.tencent.mm.bg.d.b(WalletBalanceFetchUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
          paramAnonymousDialogInterface.dismiss();
        }
      }, a.c.wechat_green);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sSX, Boolean.valueOf(true));
      return false;
    }
    u.j(21, "", paramInt2);
    bMT();
    return false;
  }
  
  public final void fE(boolean paramBoolean)
  {
    this.oZJ.dX(null);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_balance_fetch_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.wallet_balance_fetch_title);
    this.hyK = findViewById(a.f.fetch_root_view);
    this.oZK = ((LinearLayout)findViewById(a.f.balance_bankcard_layout));
    final Object localObject = new WalletBalanceFetchUI.1(this);
    this.oZL = findViewById(a.f.balance_bankcard_layout);
    this.oZL.setOnClickListener((View.OnClickListener)localObject);
    this.oZK.setOnClickListener((View.OnClickListener)localObject);
    this.oZJ = ((WalletFormView)findViewById(a.f.balance_fee));
    d(this.oZJ, 2, false);
    com.tencent.mm.wallet_core.ui.formview.a.f(this.oZJ);
    this.oZJ.setOnInputValidChangeListener(this);
    this.eWk = ((Button)findViewById(a.f.next_btn));
    this.eWk.setOnClickListener(new WalletBalanceFetchUI.11(this));
    this.eWk.setEnabled(false);
    this.oZM = ((TextView)findViewById(a.f.wallet_balance_manager_banner));
    this.oZN = ((TextView)findViewById(a.f.balance_fetch_max_tv));
    this.oZO = ((TextView)findViewById(a.f.balance_fetch_arrive_time));
    this.oZP = ((TextView)findViewById(a.f.fetch_desc_tips_tv));
    this.oZQ = ((TextView)findViewById(a.f.fetch_all_tv));
    this.oZQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        WalletBalanceFetchUI.e(WalletBalanceFetchUI.this);
      }
    });
    this.oZJ.a(new WalletBalanceFetchUI.13(this));
    this.kTx = new WalletBalanceFetchUI.14(this);
    localObject = new sy();
    ((sy)localObject).cdO.buF = "3";
    ((sy)localObject).bJX = new Runnable()
    {
      public final void run()
      {
        if (!bi.oW(localObject.cdP.cdQ))
        {
          com.tencent.mm.wallet_core.ui.e.a(WalletBalanceFetchUI.i(WalletBalanceFetchUI.this), localObject.cdP.cdQ, localObject.cdP.content, localObject.cdP.url);
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "no bulletin data");
      }
    };
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        paramInt1 = paramIntent.getIntExtra("key_select_index", -1);
        paramInt2 = this.oZV;
        this.oZV = paramInt1;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult select bankcard index is " + paramInt1);
        if ((this.oZG == null) || (paramInt1 < 0) || (paramInt1 >= this.oZG.size())) {
          if ((this.oZG == null) || (paramInt1 < 0) || (paramInt1 > this.oZG.size()))
          {
            this.oZH = null;
            bMU();
          }
        }
        for (;;)
        {
          aL();
          return;
          this.oZV = paramInt2;
          break;
          this.oZH = ((Bankcard)this.oZG.get(paramInt1));
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult cancel select");
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ad(getIntent());
    bra();
    this.oZI = getString(a.i.wallet_balance_save_bind_new_card_to_fetch);
    initView();
    aL();
    q.fu(4, 0);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    bMT();
    ad(paramIntent);
  }
  
  public void onResume()
  {
    bMT();
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */