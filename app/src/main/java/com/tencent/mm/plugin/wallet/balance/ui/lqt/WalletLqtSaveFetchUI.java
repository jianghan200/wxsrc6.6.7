package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.wallet.balance.a.a.i;
import com.tencent.mm.plugin.wallet.balance.a.a.n;
import com.tencent.mm.plugin.wallet.balance.a.a.n.c;
import com.tencent.mm.plugin.wallet.balance.a.a.o;
import com.tencent.mm.plugin.wallet.balance.a.a.o.6;
import com.tencent.mm.plugin.wallet.balance.a.a.o.7;
import com.tencent.mm.plugin.wallet.balance.a.a.o.8;
import com.tencent.mm.plugin.wallet.balance.a.a.o.9;
import com.tencent.mm.plugin.wallet.balance.a.a.p.d;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ab;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.arq;
import com.tencent.mm.protocal.c.awx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletLqtSaveFetchUI
  extends WalletLqtBasePresenterUI
{
  private int accountType;
  private Dialog eBX;
  private HashMap<String, Integer> lMb = new HashMap();
  private int mode;
  private Bankcard oZH;
  private com.tencent.mm.plugin.wallet.balance.a.a.m oZk = (com.tencent.mm.plugin.wallet.balance.a.a.m)w(com.tencent.mm.plugin.wallet.balance.a.a.m.class);
  private n oZl = (n)t(n.class);
  private o pbE = new o(this.oZk, this.oZl, this);
  private com.tencent.mm.plugin.wallet.balance.a.a.p pbF = new com.tencent.mm.plugin.wallet.balance.a.a.p(this.pbE);
  private ViewGroup pbG;
  private WalletFormView pbH;
  private TextView pbI;
  private TextView pbJ;
  private Button pbK;
  private ImageView pbL;
  private TextView pbM;
  private TextView pbN;
  private ViewGroup pbO;
  private TextView pbP;
  private CheckBox pbQ;
  private TextView pbR;
  private TextView pbS;
  private TextView pbT;
  private CharSequence pbU;
  private Bankcard pbV;
  private int pbW;
  private String pbX;
  private String pbY;
  private long pbZ = -1L;
  private String pca;
  private boolean pcb = false;
  
  private void bNb()
  {
    Object localObject1 = i.oYM;
    boolean bool;
    Object localObject2;
    if (this.mode == 1)
    {
      bool = true;
      localObject2 = ((i)localObject1).jc(bool);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((List)localObject2).size() != 0) {}
      }
      else
      {
        com.tencent.mm.plugin.wallet.a.p.bNp();
        localObject1 = com.tencent.mm.plugin.wallet.a.p.bNq().bPG();
      }
      localObject2 = new LinkedList();
      if (localObject1 != null) {
        localObject1 = ((List)localObject1).iterator();
      }
    }
    else
    {
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          break label195;
        }
        Bankcard localBankcard = (Bankcard)((Iterator)localObject1).next();
        if (localBankcard.bOs())
        {
          com.tencent.mm.plugin.wallet.a.p.bNp();
          if (!com.tencent.mm.plugin.wallet.a.p.bNq().bPp())
          {
            ((List)localObject2).add(localBankcard);
            continue;
            bool = false;
            break;
          }
        }
        if ((this.mode == 1) && (localBankcard.field_support_lqt_turn_in == 1)) {
          ((List)localObject2).add(localBankcard);
        }
        if ((this.mode == 2) && (localBankcard.field_support_lqt_turn_out == 1)) {
          ((List)localObject2).add(localBankcard);
        }
      }
    }
    label195:
    localObject1 = i.oYM;
    if (this.mode == 1)
    {
      bool = true;
      this.oZH = ((i)localObject1).jb(bool);
      if (this.oZH == null)
      {
        com.tencent.mm.plugin.wallet.a.p.bNp();
        this.oZH = com.tencent.mm.plugin.wallet.a.p.bNq().paw;
      }
      if (this.oZH == null) {
        break label362;
      }
    }
    int i;
    label362:
    for (localObject1 = this.oZH.field_bindSerial;; localObject1 = "")
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLqtSaveFetchUI", "defaultBankcard: %s, save mCurrentSerial: %s", new Object[] { localObject1, this.pca });
      if (bi.oW(this.pca)) {
        break label369;
      }
      i = 0;
      while (i < ((List)localObject2).size())
      {
        localObject1 = (Bankcard)((List)localObject2).get(i);
        if ((!bi.oW(((Bankcard)localObject1).field_bindSerial)) && (this.pca.equals(((Bankcard)localObject1).field_bindSerial))) {
          this.oZH = ((Bankcard)localObject1);
        }
        i += 1;
      }
      bool = false;
      break;
    }
    label369:
    if (this.oZH.bOs())
    {
      this.pbJ.setText(this.oZH.field_desc);
      this.pbJ.setText(this.oZH.field_desc);
      this.pbJ.setVisibility(0);
      this.pbL.setTag(this.oZH.field_bindSerial);
      if (this.pbL != null)
      {
        localObject1 = "";
        localObject2 = com.tencent.mm.plugin.wallet_core.d.b.h(this, this.oZH.field_bankcardType, this.oZH.bOr());
        if (localObject2 != null) {
          localObject1 = ((com.tencent.mm.plugin.wallet_core.model.e)localObject2).lCU;
        }
        this.pbL.setImageBitmap(null);
        if (!this.oZH.bOs()) {
          break label924;
        }
        this.pbL.setBackgroundResource(a.e.wallet_balance_manager_logo_small);
      }
      label500:
      this.pbR.setVisibility(8);
      this.pbS.setVisibility(8);
      if (this.mode != 2) {
        break label1091;
      }
      if ((this.oZH.bOs()) || (bi.oW(this.oZH.field_avail_save_wording))) {
        break label1001;
      }
      this.pbR.setText(this.oZH.field_avail_save_wording);
      this.pbR.setVisibility(0);
      label571:
      if (!bi.oW(this.oZH.field_fetchArriveTimeWording))
      {
        this.pbS.setText(this.oZH.field_fetchArriveTimeWording);
        this.pbS.setVisibility(0);
      }
      label606:
      if (this.mode != 1) {
        break label1159;
      }
      setMMTitle(getString(a.i.wallet_lqt_save_wording));
      localObject1 = getIntent().getStringArrayListExtra("lqt_protocol_list");
      bool = getIntent().getBooleanExtra("lqt_is_show_protocol", false);
      if ((localObject1 == null) || (((ArrayList)localObject1).size() <= 0) || (!bool)) {
        break label1147;
      }
      this.pbO.setVisibility(0);
      this.pbQ.setChecked(getIntent().getBooleanExtra("lqt_is_agree_protocol", false));
      this.pbO.setOnClickListener(new WalletLqtSaveFetchUI.3(this));
      this.pbQ.setOnCheckedChangeListener(new WalletLqtSaveFetchUI.4(this));
      localObject2 = getString(a.i.wallet_lqt_protocol_agree_prefix);
      i = ((String)localObject2).length();
      localObject2 = new SpannableString((String)localObject2 + getString(a.i.wallet_lqt_protocol_agree_suffix));
      ((SpannableString)localObject2).setSpan(new a(new WalletLqtSaveFetchUI.5(this, (ArrayList)localObject1)), i, ((SpannableString)localObject2).length(), 17);
      this.pbP.setText((CharSequence)localObject2);
      this.pbP.setClickable(true);
      this.pbP.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m());
      label832:
      if (this.mode == 1)
      {
        if ((this.oZH == null) || (!this.oZH.bOs())) {
          break label1656;
        }
        this.pbM.setText(this.pbU);
      }
    }
    for (;;)
    {
      this.pbH.setText(this.pbH.getText());
      return;
      this.pbJ.setText(getString(a.i.wallet_balance_save_bankcard_tips, new Object[] { this.oZH.field_bankName, this.oZH.field_bankcardTail }));
      break;
      label924:
      localObject1 = com.tencent.mm.platformtools.y.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject1));
      com.tencent.mm.platformtools.y.a(new WalletLqtSaveFetchUI.12(this));
      if ((localObject1 == null) || (localObject1 == null)) {
        break label500;
      }
      localObject1 = com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject1, getResources().getDimensionPixelOffset(a.d.wallet_offline_bank_logo_width), getResources().getDimensionPixelOffset(a.d.wallet_offline_bank_logo_width), true, false);
      this.pbL.setImageBitmap((Bitmap)localObject1);
      break label500;
      label1001:
      if (!this.oZH.bOs()) {
        break label571;
      }
      localObject1 = i.oYM;
      if (this.mode == 1)
      {
        bool = true;
        label1026:
        if (bi.oW(((i)localObject1).jd(bool))) {
          break label1084;
        }
        localObject1 = this.pbR;
        localObject2 = i.oYM;
        if (this.mode != 1) {
          break label1086;
        }
      }
      label1084:
      label1086:
      for (bool = true;; bool = false)
      {
        ((TextView)localObject1).setText(((i)localObject2).jd(bool));
        this.pbR.setVisibility(0);
        break;
        bool = false;
        break label1026;
        break;
      }
      label1091:
      if ((this.mode != 1) || (this.oZH.bOs()) || (bi.oW(this.oZH.field_avail_save_wording))) {
        break label606;
      }
      this.pbR.setText(this.oZH.field_avail_save_wording);
      this.pbR.setVisibility(0);
      break label606;
      label1147:
      this.pbO.setVisibility(8);
      break label832;
      label1159:
      if (this.mode != 2) {
        break label832;
      }
      findViewById(a.f.wallet_info_tip).setVisibility(8);
      this.pbO.setVisibility(8);
      setMMTitle(getString(a.i.wallet_lqt_fetch_wording_title));
      this.pbN.setVisibility(8);
      localObject1 = com.tencent.mm.plugin.wallet.balance.a.a.l.bMQ();
      int j;
      if ((this.oZH != null) && (this.oZH.bOs()))
      {
        i = getIntent().getIntExtra("lqt_balance", 0);
        if (af.eyi) {
          i = 100;
        }
        if (i <= 0) {
          break label832;
        }
        localObject1 = getString(a.i.wallet_lqt_fetch_remain_wording_1, new Object[] { Double.valueOf(eY(String.valueOf(i), "100")) });
        j = ((String)localObject1).length();
        localObject1 = new SpannableString((String)localObject1 + getString(a.i.wallet_lqt_fetch_remain_wording_2));
        ((SpannableString)localObject1).setSpan(new a(new WalletLqtSaveFetchUI.9(this, i)), j, ((SpannableString)localObject1).length(), 18);
        this.pbU = ((CharSequence)localObject1);
        this.pbM.setText((CharSequence)localObject1);
        break label832;
      }
      if (((com.tencent.mm.plugin.wallet.balance.a.a.l)localObject1).oZa == null) {}
      for (i = 0;; i = ((com.tencent.mm.plugin.wallet.balance.a.a.l)localObject1).oZa.rZW)
      {
        if (af.eyi) {
          i = 100;
        }
        localObject2 = getString(a.i.wallet_lqt_fetch_remain_wording_1_2, new Object[] { Double.valueOf(eY(String.valueOf(i), "100")) });
        j = ((String)localObject2).length();
        localObject2 = new SpannableString((String)localObject2 + getString(a.i.wallet_lqt_fetch_remain_wording_2));
        ((SpannableString)localObject2).setSpan(new a(new WalletLqtSaveFetchUI.10(this, i)), j, ((SpannableString)localObject2).length(), 18);
        this.pbU = ((CharSequence)localObject2);
        this.pbM.setText((CharSequence)localObject2);
        if ((((com.tencent.mm.plugin.wallet.balance.a.a.l)localObject1).oZa != null) && ((((com.tencent.mm.plugin.wallet.balance.a.a.l)localObject1).oZa.rZX > 0) || (af.eyi)))
        {
          i = ((com.tencent.mm.plugin.wallet.balance.a.a.l)localObject1).oZa.rZX;
          this.pbN.setVisibility(0);
          this.pbN.setText(getString(a.i.wallet_lqt_fetch_remain_real_wording, new Object[] { Double.valueOf(eY(String.valueOf(i), "100")) }));
        }
        localObject1 = ((com.tencent.mm.plugin.wallet.balance.a.a.l)localObject1).oZa;
        if ((localObject1 == null) || (((awx)localObject1).rZY == null) || (((awx)localObject1).rZY.size() <= 0)) {
          break;
        }
        findViewById(a.f.wallet_info_tip).setVisibility(0);
        findViewById(a.f.wallet_info_tip).setOnClickListener(new WalletLqtSaveFetchUI.11(this, (awx)localObject1));
        break;
      }
      label1656:
      this.pbM.setText("");
    }
  }
  
  private List<Bankcard> bNc()
  {
    Object localObject1 = i.oYM;
    boolean bool;
    Object localObject2;
    if (this.mode == 1)
    {
      bool = true;
      localObject2 = ((i)localObject1).jc(bool);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((List)localObject2).size() != 0) {}
      }
      else
      {
        com.tencent.mm.plugin.wallet.a.p.bNp();
        localObject1 = com.tencent.mm.plugin.wallet.a.p.bNq().bPG();
      }
      localObject2 = new LinkedList();
      if (localObject1 != null) {
        localObject1 = ((List)localObject1).iterator();
      }
    }
    else
    {
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          return localObject2;
        }
        Bankcard localBankcard = (Bankcard)((Iterator)localObject1).next();
        if (localBankcard.bOs())
        {
          com.tencent.mm.plugin.wallet.a.p.bNp();
          if (!com.tencent.mm.plugin.wallet.a.p.bNq().bPp())
          {
            ((List)localObject2).add(localBankcard);
            continue;
            bool = false;
            break;
          }
        }
        if ((this.mode == 1) && ((localBankcard.field_support_lqt_turn_in == 1) || (localBankcard.bOs()))) {
          ((List)localObject2).add(localBankcard);
        }
        if ((this.mode == 2) && ((localBankcard.field_support_lqt_turn_out == 1) || (localBankcard.bOs()))) {
          ((List)localObject2).add(localBankcard);
        }
      }
    }
    return (List<Bankcard>)localObject2;
  }
  
  private static double eY(String paramString1, String paramString2)
  {
    try
    {
      if (bi.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim()) {
        return new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), 5, 2).doubleValue();
      }
      return 0.0D;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
    }
  }
  
  private static int eZ(String paramString1, String paramString2)
  {
    try
    {
      double d1 = bi.getDouble(paramString1, 0.0D);
      double d2 = bi.getDouble(paramString2, 0.0D);
      if (d1 == 0.0D) {
        paramString1 = "0";
      }
      paramString1 = new BigDecimal(paramString1);
      if (d2 == 0.0D) {
        paramString2 = "0";
      }
      int i = paramString1.multiply(new BigDecimal(paramString2)).intValue();
      return i;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
    }
    return 0;
  }
  
  private void jg(boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.pbK.setEnabled(false);
    }
    do
    {
      return;
      if (this.pbO.getVisibility() == 0)
      {
        if ((this.pbQ.isChecked()) && (this.pcb))
        {
          this.pbK.setEnabled(true);
          return;
        }
        this.pbK.setEnabled(false);
        return;
      }
    } while (!this.pcb);
    this.pbK.setEnabled(true);
  }
  
  public final void Kk(String paramString)
  {
    Toast.makeText(this, paramString, 1).show();
  }
  
  public final void bNd()
  {
    if (this.eBX != null) {
      this.eBX.dismiss();
    }
  }
  
  public final void bNe()
  {
    boolean bool2 = false;
    boolean bool1;
    if (this.mode == 1)
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZw, this.pca);
      localObject = i.oYM;
      if (this.mode != 1) {
        break label148;
      }
      bool1 = true;
      label44:
      ((i)localObject).jf(bool1);
      if (!bool1) {
        break label153;
      }
    }
    label148:
    label153:
    for (Object localObject = ((i)localObject).oYG;; localObject = ((i)localObject).oYH)
    {
      bool1 = bool2;
      if (localObject != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LqtBindQueryInfoCache", "isReqAgainAfterDeal: %s", new Object[] { Boolean.valueOf(((arq)localObject).rTV) });
        bool1 = ((arq)localObject).rTV;
      }
      if (bool1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLqtSaveFetchUI", "saveOrfetchDone, req again after deal");
        this.pbF.oZy.dX(this.mode, this.accountType);
      }
      return;
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZx, this.pca);
      break;
      bool1 = false;
      break label44;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    o localo = this.pbE;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LqtSaveFetchLogic", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.y))
    {
      com.tencent.mm.plugin.wallet.a.p.bNp();
      localo.oZr = com.tencent.mm.plugin.wallet.a.p.bNq().paw;
      if (localo.eAc != null)
      {
        localo.eAc.v(new Object[] { paraml });
        localo.eAc.resume();
      }
    }
    return super.d(paramInt1, paramInt2, paramString, paraml);
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_lqt_save_ui;
  }
  
  public final void jh(boolean paramBoolean)
  {
    if ((this.eBX == null) || (!this.eBX.isShowing()))
    {
      if (paramBoolean) {
        this.eBX = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
      }
    }
    else {
      return;
    }
    this.eBX = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    o localo = this.pbE;
    if ((paramInt1 == o.oZi) && (paramInt2 == -1))
    {
      paramIntent = (Orders)paramIntent.getParcelableExtra("key_orders");
      if ((paramIntent != null) && (paramIntent.ppf != null) && (paramIntent.ppf.size() > 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LqtSaveFetchLogic", "onActivityResult, doQueryPurchaseResult, accountType: %s", new Object[] { Integer.valueOf(localo.accountType) });
        localo.bOe = ((Orders.Commodity)paramIntent.ppf.get(0)).bOe;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult");
        localo.oZm.jh(false);
        paramIntent = localo.oZl.oZe;
        com.tencent.mm.vending.g.g.a(localo.oZn, localo.bOe, Integer.valueOf(localo.oZo), Integer.valueOf(localo.accountType)).c(paramIntent).f(new o.7(localo)).a(new o.6(localo));
      }
    }
    while ((paramInt1 != o.oZj) || (paramInt2 != -1)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("lqt_fetch_enc_pwd");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LqtSaveFetchLogic", "onActivityResult, doRedeemFund, accountType: %s", new Object[] { Integer.valueOf(localo.accountType) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LqtSaveFetchLogic", "doRedeemFund");
    localo.oZm.jh(true);
    n.c localc = localo.oZl.oZf;
    com.tencent.mm.vending.g.g.a(Integer.valueOf(localo.oZp), paramIntent, localo.oZq, Integer.valueOf(localo.accountType)).c(localc).f(new o.9(localo)).a(new o.8(localo));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLqtSaveFetchUI", "WalletLqtSaveFetchUI onCreate");
    this.pbH = ((WalletFormView)findViewById(a.f.lqt_save_form));
    this.pbK = ((Button)findViewById(a.f.next_btn));
    this.pbL = ((ImageView)findViewById(a.f.bankcard_logo_iv));
    this.pbM = ((TextView)findViewById(a.f.lqt_save_balance_hint));
    this.pbN = ((TextView)findViewById(a.f.lqt_save_balance_hint2));
    this.pbI = ((TextView)findViewById(a.f.lqt_save_hint));
    this.pbJ = ((TextView)findViewById(a.f.lqt_balance_bankcard));
    this.pbT = ((TextView)findViewById(a.f.wallet_title));
    this.pbO = ((ViewGroup)findViewById(a.f.lqt_save_protocal_layout));
    this.pbP = ((TextView)findViewById(a.f.lqt_save_protocol_link_tv));
    this.pbQ = ((CheckBox)findViewById(a.f.lqt_save_protocol_agree_checkbox));
    this.pbG = ((ViewGroup)findViewById(a.f.main_content));
    this.pbR = ((TextView)findViewById(a.f.hint_1));
    this.pbS = ((TextView)findViewById(a.f.hint_2));
    this.mode = getIntent().getIntExtra("lqt_save_fetch_mode", 1);
    this.pbW = getIntent().getIntExtra("lqt_max_redeem_amount", -1);
    this.pbX = getIntent().getStringExtra("lqt_redeem_invalid_amount_hint");
    this.pbY = getIntent().getStringExtra("lqt_profile_wording");
    this.accountType = getIntent().getIntExtra("lqt_account_type", 0);
    if (this.mode == 1)
    {
      com.tencent.mm.kernel.g.Ek();
      this.pca = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZw, ""));
      if (bi.oW(this.pca))
      {
        com.tencent.mm.kernel.g.Ek();
        this.pca = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZv, ""));
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLqtSaveFetchUI", "onCreate, accountType: %s, mode: %s, mCurrentSerial: %s", new Object[] { Integer.valueOf(this.accountType), Integer.valueOf(this.mode), this.pca });
      a(this.pbH, 2, false, false, false);
      if (this.mode != 1) {
        break label841;
      }
      this.pbI.setText(getString(a.i.wallet_lqt_save_amount_hint));
      this.pbK.setText(a.i.wallet_lqt_save_wording);
      this.pbT.setText(getString(a.i.wallet_lqt_save_hint_bank_card_wording));
      label449:
      this.pbH.a(new WalletLqtSaveFetchUI.6(this));
      this.pbK.setOnClickListener(new WalletLqtSaveFetchUI.7(this));
      if (!bi.oW(this.pbY))
      {
        paramBundle = (TextView)findViewById(a.f.lqt_profile_wording);
        paramBundle.setText(this.pbY);
        paramBundle.setVisibility(0);
      }
      this.pbM.setText("");
      this.pbM.setClickable(true);
      this.pbM.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
      jg(false);
      if (this.mode == 1) {
        this.pbG.setVisibility(4);
      }
      if (this.pbJ.findViewById(a.f.wallet_tips_msg) != null) {
        this.pbJ.findViewById(a.f.wallet_tips_msg).setVisibility(8);
      }
      paramBundle = new WalletLqtSaveFetchUI.1(this);
      this.pbJ.setOnClickListener(paramBundle);
      if (findViewById(a.f.change_bankcard_layout) != null) {
        findViewById(a.f.change_bankcard_layout).setOnClickListener(paramBundle);
      }
      if (this.mode == 1)
      {
        paramBundle = i.oYM;
        paramBundle.jf(true);
        paramBundle = paramBundle.oYG;
        if (paramBundle == null) {
          break label890;
        }
      }
    }
    label841:
    label890:
    for (paramBundle = ab.a(paramBundle.rTT);; paramBundle = null)
    {
      this.pbV = paramBundle;
      if (this.pbV == null)
      {
        com.tencent.mm.plugin.wallet.a.p.bNp();
        this.pbV = com.tencent.mm.plugin.wallet.a.p.bNq().paw;
      }
      if (this.pbV != null)
      {
        paramBundle = getString(a.i.wallet_lqt_balance_remain_wording_1, new Object[] { Double.valueOf(this.pbV.plV) });
        int i = paramBundle.length();
        paramBundle = new SpannableString(paramBundle + getString(a.i.wallet_lqt_balance_remain_wording_2));
        paramBundle.setSpan(new a(new WalletLqtSaveFetchUI.8(this)), i, paramBundle.length(), 18);
        this.pbU = paramBundle;
        this.pbM.setText(paramBundle);
      }
      this.pbG.setVisibility(0);
      bNb();
      return;
      com.tencent.mm.kernel.g.Ek();
      this.pca = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZx, ""));
      break;
      if (this.mode != 2) {
        break label449;
      }
      this.pbI.setText(getString(a.i.wallet_lqt_fetch_amount_hint));
      this.pbK.setText(a.i.wallet_lqt_fetch_wording);
      this.pbT.setText(getString(a.i.wallet_lqt_fetch_hint_bank_card_wording));
      break label449;
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.pbE = null;
    this.pbF = null;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLqtSaveFetchUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    paramIntent = bNc();
    if (this.mode == 1) {
      this.pbF.oZy.dX(this.mode, this.accountType).f(new WalletLqtSaveFetchUI.15(this, paramIntent));
    }
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */