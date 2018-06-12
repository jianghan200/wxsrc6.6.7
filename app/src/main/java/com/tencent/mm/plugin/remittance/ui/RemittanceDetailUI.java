package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.plugin.remittance.model.u;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class RemittanceDetailUI
  extends WalletBaseUI
{
  public TextView kUA = null;
  private String lOk;
  private String lOr;
  public ImageView mBO = null;
  public TextView mBP = null;
  public TextView mBQ = null;
  public Button mBR = null;
  public TextView mBS = null;
  public TextView mBT = null;
  public int mBU;
  public int mBV;
  public String mBW = null;
  public String mBX = null;
  protected String mBY = null;
  public int mBZ = 3;
  protected boolean mCa = false;
  protected int mCb;
  private int mCc;
  private u mCd;
  private c<ne> mCe = new RemittanceDetailUI.1(this);
  private String mzm = null;
  private int mzn;
  public String mzr = null;
  
  public static String aM(String paramString, boolean paramBoolean)
  {
    String str = com.tencent.mm.wallet_core.ui.e.gT(paramString);
    if (str == null) {
      paramString = "";
    }
    do
    {
      do
      {
        return paramString;
        paramString = str;
      } while (str.length() <= 10);
      paramString = str;
    } while (!paramBoolean);
    return str.substring(0, 8) + "...";
  }
  
  private void brq()
  {
    if ((this.mCc != 0) && (this.mzn == 1) && (!bi.oW(this.mzm)))
    {
      addIconOptionMenu(0, a.e.wallet_qanda_icon, new RemittanceDetailUI.8(this));
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceDetailUI", "flag: %d, descUrl empty: %B", new Object[] { Integer.valueOf(this.mCc), Boolean.valueOf(bi.oW(this.mzm)) });
    this.mController.removeAllOptionMenu();
  }
  
  public void X(Intent paramIntent)
  {
    d.b(this, "remittance", ".ui.RemittanceResendMsgUI", paramIntent);
  }
  
  public final void aA(int paramInt, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("result_msg", paramString);
    setResult(paramInt, localIntent);
    finish();
  }
  
  public void brB()
  {
    u localu = new u(this.mBW, this.mzr, this.mCb, "confirm", this.mBX, this.mBU);
    localu.dox = "RemittanceProcess";
    a(localu, true, true);
  }
  
  public void brC()
  {
    u localu = new u(this.mBW, this.mzr, this.mCb, "refuse", this.mBX, this.mBU);
    localu.dox = "RemittanceProcess";
    a(localu, true, true);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.remittance.model.x))
    {
      final com.tencent.mm.plugin.remittance.model.x localx = (com.tencent.mm.plugin.remittance.model.x)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        boolean bool;
        Object localObject;
        if (localx != null)
        {
          if (localx.klL)
          {
            this.lOr = q.GF();
            this.lOk = this.mBX;
            bool = q.GF().equals(this.lOk);
            this.mBR.setVisibility(8);
            this.mBQ.setText(com.tencent.mm.wallet_core.ui.e.e(localx.hUL, localx.lNV));
            paraml = localx.myv;
            paramString = paraml;
            if (!bi.oW(paraml))
            {
              paramString = paraml;
              if (paraml.contains("%s")) {
                paramString = paraml.trim().replace("%s", aM(this.lOk, true));
              }
            }
            paraml = localx.myw;
            localObject = new Bundle();
            ((Bundle)localObject).putString("transaction_id", this.mBW);
            ((Bundle)localObject).putString("receiver_name", this.lOk);
            ((Bundle)localObject).putString("transfer_id", this.mzr);
            ((Bundle)localObject).putInt("total_fee", this.mCb);
            ((Bundle)localObject).putString("sender_name", this.mBX);
            ((Bundle)localObject).putInt("invalid_time", this.mBU);
            this.kUA.setClickable(true);
            this.mBP.setClickable(true);
            paramInt1 = localx.status;
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RemittanceDetailUI", "status: %d", new Object[] { Integer.valueOf(paramInt1) });
          }
        }
        else {
          switch (paramInt1)
          {
          default: 
            finish();
            label316:
            if (!bi.oW(localx.myy)) {
              com.tencent.mm.wallet_core.ui.e.a((TextView)findViewById(a.f.banner_tips), "7", localx.myy, localx.myz);
            }
            this.mCc = localx.myx;
            g.Ek();
            this.mzm = ((String)g.Ei().DT().get(aa.a.sVm, ""));
            g.Ek();
            this.mzn = ((Integer)g.Ei().DT().get(aa.a.sVn, Integer.valueOf(0))).intValue();
            if (bi.oW(this.mzm))
            {
              ae.a(true, this.uYO);
              label436:
              brq();
              if (localx.lOD == 1)
              {
                g.Ek();
                if (!((String)g.Ei().DT().get(327729, "0")).equals("0")) {
                  break label3103;
                }
                paramString = this.mController.tml;
                if (!q.GS()) {
                  break label3096;
                }
                paramInt1 = a.i.chatting_item_appmsg_remittance_collect_tips_payu;
                label498:
                com.tencent.mm.ui.base.h.a(paramString, paramInt1, a.i.wallet_remittance_collect_title, new RemittanceDetailUI.9(this));
                g.Ek();
                g.Ei().DT().set(327729, "1");
              }
            }
            break;
          }
        }
        for (;;)
        {
          return true;
          this.lOr = this.mBX;
          this.lOk = q.GF();
          break;
          if (!bool) {
            if ((!bi.oW(paramString)) && (!bi.oW(paraml)))
            {
              this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
              this.kUA.setText(j.a(this, paraml, (int)this.kUA.getTextSize(), localObject));
              this.mBP.setOnTouchListener(new m());
              this.kUA.setOnTouchListener(new m());
            }
          }
          com.tencent.mm.plugin.order.c.a locala;
          for (;;)
          {
            this.mBO.setImageResource(a.h.remittance_wait);
            this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myr) }));
            this.mBS.setVisibility(0);
            this.mBT.setVisibility(8);
            break;
            paramString = getString(a.i.remittance_detail_result_wait_sender, new Object[] { aM(this.lOk, true) });
            this.mBP.setText(j.a(this, paramString, this.mBP.getTextSize()));
            paramString = getString(a.i.remittance_detail_sender_tips, new Object[] { Integer.valueOf(this.mBZ) });
            paraml = getString(a.i.remittance_resend_transfer_msg);
            localObject = new SpannableString(paramString + paraml);
            locala = new com.tencent.mm.plugin.order.c.a(this);
            locala.lQF = new RemittanceDetailUI.2(this);
            ((SpannableString)localObject).setSpan(locala, paramString.length(), paramString.length() + paraml.length(), 33);
            this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
            this.kUA.setText((CharSequence)localObject);
            continue;
            this.mBO.setImageResource(a.h.remittance_wait);
            this.mBR.setVisibility(0);
            this.mBR.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                o.bOR();
                paramAnonymousView = RemittanceDetailUI.this;
                i locali = RemittanceDetailUI.c(RemittanceDetailUI.this);
                new RemittanceDetailUI.3.1(this);
                if (!o.a(paramAnonymousView, locali)) {
                  RemittanceDetailUI.this.brB();
                }
              }
            });
            if ((bi.oW(paramString)) || (bi.oW(paraml))) {
              break label999;
            }
            this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
            this.kUA.setText(j.a(this, paraml, (int)this.kUA.getTextSize(), localObject));
            this.mBP.setOnTouchListener(new m());
            this.kUA.setOnTouchListener(new m());
          }
          label999:
          this.mBP.setText(a.i.remittance_detail_result_wait_receiver);
          if (localx.myx != 0) {
            if (!bi.oW(localx.myw)) {
              paramString = localx.myw;
            }
          }
          for (;;)
          {
            paraml = getString(a.i.remittance_detail_refuse_action);
            localObject = new SpannableString(paramString + paraml);
            locala = new com.tencent.mm.plugin.order.c.a(this);
            locala.lQF = new a.a()
            {
              public final void onClick(View paramAnonymousView)
              {
                com.tencent.mm.ui.base.h.a(RemittanceDetailUI.this, RemittanceDetailUI.this.getString(a.i.remittance_detail_refund_tips, new Object[] { RemittanceDetailUI.aM(localx.myt, false) }), RemittanceDetailUI.this.getString(a.i.app_remind), RemittanceDetailUI.this.getString(a.i.remittance_detail_refuse_btn_text), RemittanceDetailUI.this.getString(a.i.app_cancel), new RemittanceDetailUI.4.1(this), new RemittanceDetailUI.4.2(this));
              }
            };
            ((SpannableString)localObject).setSpan(locala, paramString.length(), paramString.length() + paraml.length(), 33);
            this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
            this.kUA.setText((CharSequence)localObject);
            break;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceDetailUI", "use hardcode wording");
            if (localx.myx == 1) {}
            for (paramString = "24";; paramString = "2")
            {
              paramString = getString(a.i.remittance_detail_reveiver_tips1, new Object[] { paramString });
              paraml = getString(a.i.remittance_detail_reveiver_tips2, new Object[] { Integer.valueOf(this.mBZ) });
              paramString = paramString + paraml;
              break;
            }
            paramString = getString(a.i.remittance_detail_reveiver_tips2, new Object[] { Integer.valueOf(this.mBZ) });
          }
          this.mBO.setImageResource(a.h.remittance_received);
          if ((!bi.oW(paramString)) && (!bi.oW(paraml)))
          {
            this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
            this.kUA.setText(j.a(this, paraml, (int)this.kUA.getTextSize(), localObject));
            this.mBP.setOnTouchListener(new m());
            this.kUA.setOnTouchListener(new m());
          }
          for (;;)
          {
            this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myr) }));
            this.mBS.setVisibility(0);
            this.mBT.setText(getString(a.i.remittance_detail_receive_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myu) }));
            this.mBT.setVisibility(0);
            break;
            if (bool)
            {
              this.mBP.setText(a.i.remittance_detail_result_collected);
              paramString = new SpannableStringBuilder(getString(a.i.remittance_detail_check_ballance));
              paraml = new com.tencent.mm.plugin.order.c.a(this);
              paraml.lQF = new a.a()
              {
                public final void onClick(View paramAnonymousView)
                {
                  com.tencent.mm.pluginsdk.wallet.h.ab(RemittanceDetailUI.this, 0);
                }
              };
              paramString.setSpan(paraml, 0, paramString.length(), 18);
              this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
              this.kUA.setText(paramString);
              this.kUA.setVisibility(0);
            }
            else
            {
              paramString = aM(this.lOk, true) + getString(a.i.remittance_detail_result_collected);
              this.mBP.setText(j.a(this, paramString, this.mBP.getTextSize()));
              this.kUA.setText(a.i.remittance_detail_sender_success_tips);
              this.kUA.setVisibility(0);
            }
          }
          if ((paramInt1 == 2003) && (!bool))
          {
            this.mBO.setImageResource(a.h.remittance_timed_out);
            if (!bi.oW(paramString))
            {
              this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
              this.mBP.setOnTouchListener(new m());
              label1663:
              if (bool) {
                break label2145;
              }
              if (bi.oW(paraml)) {
                break label1939;
              }
              this.kUA.setText(j.a(this, paraml, (int)this.kUA.getTextSize(), localObject));
              this.kUA.setOnTouchListener(new m());
              label1713:
              this.kUA.setVisibility(0);
            }
          }
          for (;;)
          {
            this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myr) }));
            this.mBS.setVisibility(0);
            this.mBT.setText(getString(a.i.remittance_detail_refund_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myu) }));
            this.mBT.setVisibility(0);
            break;
            this.mBP.setText(a.i.remittance_detail_result_timeout_refunded);
            break label1663;
            this.mBO.setImageResource(a.h.remittance_refunded);
            if (!bi.oW(paramString))
            {
              this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
              this.mBP.setOnTouchListener(new m());
              break label1663;
            }
            if (bool)
            {
              this.mBP.setText(a.i.remittance_detail_result_refunded);
              break label1663;
            }
            paramString = aM(this.lOk, true) + getString(a.i.remittance_detail_result_refunded);
            this.mBP.setText(j.a(this, paramString, this.mBP.getTextSize()));
            break label1663;
            label1939:
            if (("CFT".equals(localx.lOt)) || ("LQT".equals(localx.lOt)))
            {
              bool = "LQT".equals(localx.lOt);
              if (bool)
              {
                paramString = getString(a.i.remittance_detail_refund_to_lqt);
                label1993:
                if (!bool) {
                  break label2120;
                }
              }
              label2120:
              for (paraml = getString(a.i.remittance_detail_check_lqt);; paraml = getString(a.i.remittance_detail_check_ballance))
              {
                localObject = new SpannableString(paramString + paraml);
                locala = new com.tencent.mm.plugin.order.c.a(this);
                locala.lQF = new RemittanceDetailUI.6(this, bool);
                paramInt1 = paramString.length();
                paramInt2 = paramString.length();
                ((SpannableString)localObject).setSpan(locala, paramInt1, paraml.length() + paramInt2, 33);
                this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
                this.kUA.setText((CharSequence)localObject);
                break;
                paramString = getString(a.i.remittance_detail_refund_to_ballance);
                break label1993;
              }
            }
            this.kUA.setText(a.i.remittance_detail_refund_to_bankcard);
            break label1713;
            label2145:
            this.kUA.setVisibility(8);
          }
          if (bool)
          {
            this.mBO.setImageResource(a.h.remittance_wait);
            if ((!bi.oW(paramString)) && (!bi.oW(paraml)))
            {
              this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
              this.kUA.setText(j.a(this, paraml, (int)this.kUA.getTextSize(), localObject));
              this.mBP.setOnTouchListener(new m());
              this.kUA.setOnTouchListener(new m());
            }
          }
          for (;;)
          {
            this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myr) }));
            this.mBS.setVisibility(0);
            this.mBT.setText(getString(a.i.remittance_detail_receive_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myu) }));
            this.mBT.setVisibility(0);
            break;
            if (!bi.oW(localx.myv)) {
              this.mBP.setText(localx.myv);
            }
            for (;;)
            {
              if (bi.oW(localx.myw)) {
                break label2399;
              }
              this.kUA.setText(localx.myw);
              break;
              this.mBP.setText(a.i.remittance_detail_result_receiver_waited);
            }
            label2399:
            this.kUA.setText(a.i.remittance_detail_receiver_wait_tips);
            continue;
            this.mBO.setImageResource(a.h.remittance_wait);
            if ((!bi.oW(paramString)) && (!bi.oW(paraml)))
            {
              this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
              this.kUA.setText(j.a(this, paraml, (int)this.kUA.getTextSize(), localObject));
              this.mBP.setOnTouchListener(new m());
              this.kUA.setOnTouchListener(new m());
            }
            else
            {
              if (!bi.oW(localx.myv)) {}
              for (;;)
              {
                try
                {
                  this.mBP.setText(String.format(localx.myv, new Object[] { aM(this.lOk, true) }));
                  if (bi.oW(localx.myw)) {
                    break label2625;
                  }
                  this.kUA.setText(localx.myw);
                }
                catch (Exception paramString)
                {
                  com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RemittanceDetailUI", paramString, "", new Object[0]);
                }
                this.mBP.setText(getString(a.i.remittance_detail_result_sender_waited, new Object[] { aM(this.lOk, true) }));
              }
              label2625:
              this.kUA.setText("");
            }
          }
          this.mBO.setImageResource(a.h.remittance_cancle);
          if ((!bi.oW(paramString)) && (!bi.oW(paraml)))
          {
            this.mBP.setText(j.a(this, paramString, (int)this.mBP.getTextSize(), localObject));
            this.kUA.setText(j.a(this, paraml, (int)this.kUA.getTextSize(), localObject));
            this.mBP.setOnTouchListener(new m());
            this.kUA.setOnTouchListener(new m());
          }
          for (;;)
          {
            this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myr) }));
            this.mBS.setVisibility(0);
            if (localx.myu <= 0) {
              break label3072;
            }
            this.mBT.setText(getString(a.i.remittance_detail_cancel_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(localx.myu) }));
            this.mBT.setVisibility(0);
            break;
            if (!bi.oW(localx.myv))
            {
              this.mBP.setText(localx.myv);
              label2843:
              if (bi.oW(localx.myw)) {
                break label3041;
              }
              if ((!"CFT".equals(localx.lOt)) && (!"LQT".equals(localx.lOt))) {
                break label3026;
              }
              bool = "LQT".equals(localx.lOt);
              paraml = localx.myw;
              if (!bool) {
                break label3015;
              }
            }
            label3015:
            for (paramString = getString(a.i.remittance_detail_check_lqt);; paramString = getString(a.i.remittance_detail_check_ballance))
            {
              localObject = new SpannableStringBuilder();
              ((SpannableStringBuilder)localObject).append(paraml);
              ((SpannableStringBuilder)localObject).append(paramString);
              paramString = new com.tencent.mm.plugin.order.c.a(this);
              paramString.lQF = new RemittanceDetailUI.7(this, bool);
              ((SpannableStringBuilder)localObject).setSpan(paramString, paraml.length(), ((SpannableStringBuilder)localObject).length(), 18);
              this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
              this.kUA.setText((CharSequence)localObject);
              break;
              this.mBP.setText(a.i.remittance_detail_result_canceled);
              break label2843;
            }
            label3026:
            this.kUA.setText(localx.myw);
            continue;
            label3041:
            if (bool) {
              this.kUA.setText(a.i.remittance_detail_receiver_cancel_tips);
            } else {
              this.kUA.setText(a.i.remittance_detail_sender_cancel_tips);
            }
          }
          label3072:
          this.mBT.setVisibility(8);
          break label316;
          ae.a(false, this.uYO);
          break label436;
          label3096:
          paramInt1 = a.i.wallet_remittance_collect_tips;
          break label498;
          label3103:
          if (this.mCc == 0) {
            com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(a.i.remittance_detail_msg_collect_suc));
          }
        }
      }
    }
    else
    {
      if ((paraml instanceof u))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.mCd = ((u)paraml);
          if ("confirm".equals(this.mCd.mxA)) {
            vq(1);
          }
          for (;;)
          {
            return true;
            aA(0, getString(a.i.remittance_detail_msg_refuse_suc));
          }
        }
        if (paramInt2 == 416)
        {
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_plugin", "remittance");
          paramString.putString("realname_verify_process_jump_activity", ".ui.RemittanceDetailUI");
          return com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramInt2, paraml, paramString, 1008);
        }
        aA(paramInt2, paramString);
        return true;
      }
      if ((paraml instanceof ae))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.mzm = ((ae)paraml).pjN;
          this.mzn = ((ae)paraml).pjO;
          brq();
        }
        for (;;)
        {
          return true;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceDetailUI", "net error");
        }
      }
    }
    return (paraml instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.e);
  }
  
  public void finish()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("realname_verify_process_jump_plugin", "remittance");
    localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceDetailUI");
    if ((this.mCd != null) && (com.tencent.mm.plugin.wallet_core.id_verify.util.a.b(this, this.mCd, localBundle, true, 1008)))
    {
      this.mCd = null;
      return;
    }
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return a.g.remittance_detail_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.remittance_result_title);
    this.mBO = ((ImageView)findViewById(a.f.remittance_detail_desc_icon));
    this.mBP = ((TextView)findViewById(a.f.remittance_detail_result_desc));
    this.mBQ = ((TextView)findViewById(a.f.remittance_detail_fee));
    this.mBR = ((Button)findViewById(a.f.remittance_detail_collect_btn));
    this.kUA = ((TextView)findViewById(a.f.remittance_detail_main_desc));
    this.mBS = ((TextView)findViewById(a.f.remittance_detail_time_desc_one));
    this.mBT = ((TextView)findViewById(a.f.remittance_detail_time_desc_two));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mBU = getIntent().getIntExtra("invalid_time", 0);
    this.mBV = getIntent().getIntExtra("appmsg_type", 0);
    this.mBW = getIntent().getStringExtra("transaction_id");
    this.mBY = getIntent().getStringExtra("bill_id");
    this.mzr = getIntent().getStringExtra("transfer_id");
    this.mBX = getIntent().getStringExtra("sender_name");
    this.mBZ = getIntent().getIntExtra("effective_date", 3);
    this.mCa = getIntent().getBooleanExtra("is_sender", false);
    this.mCb = getIntent().getIntExtra("total_fee", 0);
    initView();
    vq(0);
    getIntent();
    com.tencent.mm.sdk.b.a.sFg.b(this.mCe);
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.mCe);
    super.onDestroy();
  }
  
  public void vq(int paramInt)
  {
    a(new com.tencent.mm.plugin.remittance.model.x(paramInt, this.mBW, this.mzr, this.mBU), true, false);
  }
  
  public void vr(int paramInt)
  {
    if (!getIntent().getBooleanExtra("is_sender", false)) {}
    for (com.tencent.mm.plugin.order.model.h localh = new com.tencent.mm.plugin.order.model.h(this.mzr, this.mBY, paramInt);; localh = new com.tencent.mm.plugin.order.model.h(this.mBW, this.mBY, paramInt))
    {
      localh.dox = "RemittanceProcess";
      a(localh, true, true);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */