package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.remittance.bankcard.a.c;
import com.tencent.mm.plugin.remittance.bankcard.a.n;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class BankRemitMoneyInputUI
  extends BankRemitBaseUI
{
  private String cZG;
  private final int eCE = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 270);
  private Button eWk;
  private ScrollView klj;
  private CdnImageView mux;
  private TextView muz;
  private String mvC;
  private TextView mvQ;
  private WalletFormView mvR;
  private LinearLayout mvS;
  private TextView mvT;
  private TextView mvU;
  private TextView mvV;
  private TextView mvW;
  private BankcardElemParcel mvX;
  private String mvY;
  private String mvZ;
  private String mwa;
  private String mwb;
  private String mwc;
  private int mwd;
  private int mwe;
  private com.tencent.mm.plugin.wallet_core.ui.m mwf;
  private long mwg;
  private int mwh;
  private int mwi;
  
  private void bqY()
  {
    if ((bi.getDouble(this.mvR.getText(), 0.0D) > 0.0D) && (!bi.oW(this.mvZ)) && (!bi.oW(this.mwa)) && (!bi.oW(this.mwc)) && (!bi.oW(this.mwb)))
    {
      this.eWk.setEnabled(true);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitMoneyInputUI", "disable btn: money: %s, seqNo: %s, tail: %s, bankType: %s, encrypt: %s", new Object[] { this.mvR.getText(), Boolean.valueOf(bi.oW(this.mvZ)), Boolean.valueOf(bi.oW(this.mwa)), Boolean.valueOf(bi.oW(this.mwc)), Boolean.valueOf(bi.oW(this.mwb)) });
    this.eWk.setEnabled(false);
  }
  
  private void brb()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (!bi.oW(this.cZG))
    {
      localSpannableStringBuilder.append(j.a(this.mController.tml, this.cZG));
      localSpannableStringBuilder.append(getString(a.i.bank_remit_remittance_desc_modify_text));
      localSpannableStringBuilder.setSpan(this.mwf, this.cZG.length(), localSpannableStringBuilder.length(), 34);
    }
    for (;;)
    {
      this.mvW.setText(localSpannableStringBuilder);
      return;
      localSpannableStringBuilder.append(getString(a.i.bank_remit_remittance_desc_text));
      localSpannableStringBuilder.setSpan(this.mwf, 0, localSpannableStringBuilder.length(), 18);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paraml instanceof n))
    {
      paramString = (n)paraml;
      paramString.a(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitMoneyInputUI", "reqKey: %s, billId: %s", new Object[] { paramString.muf.kRq, paramString.muf.rlf });
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BankRemitMoneyInputUI", "name: %s, bank: %s", new Object[] { paramString.muf.muC, paramString.muf.knE });
          BankRemitMoneyInputUI.b(BankRemitMoneyInputUI.this, paramString.muf.rlf);
          if (!BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this, paramString)) {
            BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this, paramString.muf.kRq, paramString.muf.muC, paramString.muf.knE, paramString.muf.muB);
          }
        }
      }).b(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BankRemitMoneyInputUI", "request order error: %s, %s", new Object[] { Integer.valueOf(paramString.muf.hUm), paramString.muf.hUn });
          BankRemitMoneyInputUI.a(BankRemitMoneyInputUI.this, paramString);
        }
      }).c(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BankRemitMoneyInputUI", "net error: %s", new Object[] { paramAnonymousl });
        }
      });
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.bank_remit_money_input_ui;
  }
  
  protected final void initView()
  {
    this.klj = ((ScrollView)findViewById(a.f.root_view));
    this.mux = ((CdnImageView)findViewById(a.f.brmi_bank_logo_iv));
    this.muz = ((TextView)findViewById(a.f.brmi_bank_name_tv));
    this.mvQ = ((TextView)findViewById(a.f.brmi_payee_tv));
    this.mvR = ((WalletFormView)findViewById(a.f.brmi_bank_money_input_tv));
    this.mvS = ((LinearLayout)findViewById(a.f.brmi_fee_rate_layout));
    this.mvT = ((TextView)this.mvS.findViewById(a.f.brmi_fee_rate_title_tv));
    this.mvU = ((TextView)this.mvS.findViewById(a.f.brmi_fee_tv));
    this.mvV = ((TextView)this.mvS.findViewById(a.f.brmi_total_money_tv));
    this.mvW = ((TextView)this.mvS.findViewById(a.f.brmi_remit_desc_tv));
    this.eWk = ((Button)findViewById(a.f.brmi_next_btn));
    String str = com.tencent.mm.plugin.remittance.bankcard.model.a.el(new StringBuilder().append(this.mvX.muh).toString(), "100") + "%";
    this.mvT.setText(getString(a.i.bank_remit_fee_rate_text, new Object[] { str }));
    this.mux.setUrl(this.mvX.mug);
    this.muz.setText(getString(a.i.bank_remit_select_payee_name_with_remark, new Object[] { this.mvX.knE, this.mwa }));
    this.mvQ.setText(this.mvY);
    this.mvR.setTitleText(v.cDm());
    d(this.mvR, 2, false);
    this.mvR.a(new BankRemitMoneyInputUI.1(this));
    this.mvW.setClickable(true);
    this.mvW.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
    this.mwf = new com.tencent.mm.plugin.wallet_core.ui.m(new BankRemitMoneyInputUI.8(this));
    brb();
    this.eWk.setOnClickListener(new BankRemitMoneyInputUI.3(this));
    bqY();
    this.kTx = new com.tencent.mm.wallet_core.ui.a()
    {
      public final void fI(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
        {
          BankRemitMoneyInputUI.f(BankRemitMoneyInputUI.this);
          return;
        }
        BankRemitMoneyInputUI.g(BankRemitMoneyInputUI.this).scrollTo(0, 0);
      }
    };
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitMoneyInputUI", "goto detail");
        Object localObject = new Intent(this.mController.tml, BankRemitDetailUI.class);
        ((Intent)localObject).putExtra("key_transfer_bill_id", this.mvC);
        ((Intent)localObject).putExtra("key_enter_scene", 0);
        startActivityForResult((Intent)localObject, 2);
        localObject = "";
        if (paramIntent != null) {
          localObject = paramIntent.getStringExtra("key_trans_id");
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", new Object[] { this.mvC, localObject });
        a(new c(this.mvC, (String)localObject), false, false);
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitMoneyInputUI", "pay failed: %d", new Object[] { Integer.valueOf(paramInt2) });
      return;
    }
    if (paramInt1 == 2)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BankRemitMoneyInputUI", "return from detail");
      paramIntent = new Intent();
      paramIntent.addFlags(67108864);
      d.b(this.mController.tml, "offline", ".ui.WalletOfflineCoinPurseUI", paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cqh();
    jr(1380);
    int j = ((Integer)g.Ei().DT().get(aa.a.sZi, Integer.valueOf(10))).intValue();
    int i = j;
    if (j < 0) {
      i = 10;
    }
    this.mwh = i;
    j = ((Integer)g.Ei().DT().get(aa.a.sZj, Integer.valueOf(5000000))).intValue();
    i = j;
    if (j <= 0) {
      i = 5000000;
    }
    this.mwi = i;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitMoneyInputUI", "minFee: %s, maxAmount: %s", new Object[] { Integer.valueOf(this.mwh), Integer.valueOf(this.mwi) });
    this.mvX = ((BankcardElemParcel)getIntent().getParcelableExtra("key_bank_card_elem_parcel"));
    this.mvY = getIntent().getStringExtra("key_payee_name");
    this.mvZ = getIntent().getStringExtra("key_bank_card_seqno");
    this.mwa = getIntent().getStringExtra("key_bank_card_tailno");
    this.mwb = getIntent().getStringExtra("key_encrypt_data");
    this.mwd = getIntent().getIntExtra("key_enter_time_scene", 0);
    this.mwe = getIntent().getIntExtra("key_input_type", 0);
    if (this.mvX == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BankRemitMoneyInputUI", "bankcard elem is null");
      this.mvX = new BankcardElemParcel();
    }
    this.mwc = this.mvX.lMV;
    initView();
    setMMTitle(a.i.bank_remit_title);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1380);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitMoneyInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */