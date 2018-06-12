package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.order.c.a;
import com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI;
import com.tencent.mm.plugin.wallet_payu.remittance.a.b;
import com.tencent.mm.plugin.wallet_payu.remittance.a.c;
import com.tencent.mm.plugin.wallet_payu.remittance.a.f;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class PayURemittanceDetailUI
  extends RemittanceDetailUI
{
  private int lOn;
  private int lOo;
  private int mCb;
  private String mDa;
  private String pFZ;
  private String pGa;
  private int pGb;
  private int pGc;
  
  protected final void X(Intent paramIntent)
  {
    d.b(this, "wallet_payu", ".remittance.ui.PayURemittanceResendMsgUI", paramIntent);
  }
  
  protected final void brB()
  {
    a(new c(this.mzr, this.mCb, this.pFZ, this.mBX), true, true);
  }
  
  protected final void brC()
  {
    a(new b(this.mzr, this.mCb, this.pFZ, this.mBX), true, true);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof f))
    {
      paramString = (f)paraml;
      Object localObject1;
      Object localObject2;
      a locala;
      boolean bool2;
      if (paramString.bNI == 0) {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if ((this.mBV == 1) && (!getIntent().getBooleanExtra("is_sender", false)))
          {
            this.mBO.setImageResource(a.e.wallet_subject_receiving);
            this.mBP.setText(a.i.remittance_detail_result_wait_receiver);
            this.mBQ.setText(com.tencent.mm.wallet_core.ui.e.e(paramString.hUL, paramString.lNV));
            this.mBR.setVisibility(0);
            this.mBR.setOnClickListener(new PayURemittanceDetailUI.6(this));
            paraml = getString(a.i.remittance_detail_reveiver_tips_payu, new Object[] { Integer.valueOf(this.mBZ) });
            localObject1 = getString(a.i.remittance_detail_refuse_action);
            localObject2 = new SpannableString(paraml + (String)localObject1);
            locala = new a(this);
            locala.lQF = new PayURemittanceDetailUI.7(this);
            ((SpannableString)localObject2).setSpan(locala, paraml.length(), paraml.length() + ((String)localObject1).length(), 33);
            this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
            this.kUA.setText((CharSequence)localObject2);
            this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(paramString.myr) }));
            this.mBS.setVisibility(0);
            this.mBT.setVisibility(8);
          }
          bool2 = true;
        }
      }
      boolean bool1;
      do
      {
        return bool2;
        vr(0);
        return true;
        bool2 = false;
        bool1 = bool2;
        if (paramInt1 == 0)
        {
          bool1 = bool2;
          if (paramInt2 == 0)
          {
            this.pGb = paramString.status;
            this.pGc = paramString.myr;
            this.lOo = paramString.pFV;
            this.lOn = paramString.pFW;
            this.mCb = ((int)(paramString.hUL * 100.0D));
            this.pFZ = paramString.lNV;
            bool1 = true;
            paraml = q.GF();
            bool2 = this.mDa.equals(paraml);
            this.mBR.setVisibility(8);
            this.mBQ.setText(com.tencent.mm.wallet_core.ui.e.e(this.mCb / 100.0D, this.pFZ));
            paramInt1 = this.pGb;
          }
        }
        switch (paramInt1)
        {
        default: 
          finish();
          bool2 = bool1;
        }
      } while (paramString.bWA != 1);
      g.Ek();
      if (((String)g.Ei().DT().get(327729, "0")).equals("0"))
      {
        h.a(this.mController.tml, a.i.chatting_item_appmsg_remittance_collect_tips_payu, a.i.wallet_remittance_collect_tips, new PayURemittanceDetailUI.8(this));
        g.Ek();
        g.Ei().DT().set(327729, "1");
        return bool1;
        if (!bool2)
        {
          paraml = getString(a.i.remittance_detail_result_wait_sender, new Object[] { aM(this.mDa, true) });
          this.mBP.setText(j.a(this, paraml, this.mBP.getTextSize()));
          paraml = getString(a.i.remittance_detail_sender_tips_payu, new Object[] { Integer.valueOf(this.mBZ) });
          localObject1 = getString(a.i.remittance_resend_transfer_msg);
          localObject2 = new SpannableString(paraml + (String)localObject1);
          locala = new a(this);
          locala.lQF = new PayURemittanceDetailUI.1(this);
          ((SpannableString)localObject2).setSpan(locala, paraml.length(), paraml.length() + ((String)localObject1).length(), 33);
          this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
          this.kUA.setText((CharSequence)localObject2);
        }
        for (;;)
        {
          this.mBO.setImageResource(a.e.wallet_subject_receiving);
          this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(this.lOo) }));
          this.mBS.setVisibility(0);
          this.mBT.setVisibility(8);
          bool1 = true;
          break;
          this.mBO.setImageResource(a.e.wallet_subject_receiving);
          this.mBR.setVisibility(0);
          this.mBR.setOnClickListener(new PayURemittanceDetailUI.2(this));
          paraml = getString(a.i.remittance_detail_reveiver_tips_payu, new Object[] { Integer.valueOf(this.mBZ) });
          localObject1 = getString(a.i.remittance_detail_refuse_action);
          localObject2 = new SpannableString(paraml + (String)localObject1);
          locala = new a(this);
          locala.lQF = new PayURemittanceDetailUI.3(this);
          ((SpannableString)localObject2).setSpan(locala, paraml.length(), paraml.length() + ((String)localObject1).length(), 33);
          this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
          this.kUA.setText((CharSequence)localObject2);
        }
        this.mBO.setImageResource(a.h.remittance_received);
        if (bool2)
        {
          this.mBP.setText(a.i.remittance_detail_result_collected);
          paraml = getString(a.i.remittance_detail_check_ballance);
          localObject1 = new SpannableString(paraml);
          localObject2 = new a(this);
          ((a)localObject2).lQF = new PayURemittanceDetailUI.4(this);
          ((SpannableString)localObject1).setSpan(localObject2, 0, paraml.length(), 33);
          this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
          this.kUA.setText((CharSequence)localObject1);
          this.kUA.setVisibility(0);
        }
        for (;;)
        {
          this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(this.pGc) }));
          this.mBS.setVisibility(0);
          this.mBT.setText(getString(a.i.remittance_detail_receive_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(this.lOn) }));
          this.mBT.setVisibility(0);
          bool1 = true;
          break;
          paraml = aM(this.mDa, true) + " " + getString(a.i.remittance_detail_result_collected);
          this.mBP.setText(j.a(this, paraml, this.mBP.getTextSize()));
          this.kUA.setVisibility(8);
        }
        if ((paramInt1 == 2003) && (!bool2))
        {
          this.mBO.setImageResource(a.h.remittance_timed_out);
          this.mBP.setText(a.i.remittance_detail_result_timeout_refunded);
          label1243:
          if (bool2) {
            break label1532;
          }
          paraml = getString(a.i.remittance_detail_refund_to_ballance);
          localObject1 = getString(a.i.remittance_detail_check_ballance);
          localObject2 = new SpannableString(paraml + (String)localObject1);
          locala = new a(this);
          locala.lQF = new PayURemittanceDetailUI.5(this);
          ((SpannableString)localObject2).setSpan(locala, paraml.length(), paraml.length() + ((String)localObject1).length(), 33);
          this.kUA.setMovementMethod(LinkMovementMethod.getInstance());
          this.kUA.setText((CharSequence)localObject2);
        }
        for (;;)
        {
          this.kUA.setVisibility(0);
          this.mBS.setText(getString(a.i.remittance_detail_transfer_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(this.pGc) }));
          this.mBS.setVisibility(0);
          this.mBT.setText(getString(a.i.remittance_detail_refund_time, new Object[] { com.tencent.mm.wallet_core.ui.e.hb(this.lOo) }));
          this.mBT.setVisibility(0);
          bool1 = true;
          break;
          this.mBO.setImageResource(a.h.remittance_refunded);
          if (bool2)
          {
            this.mBP.setText(a.i.remittance_detail_result_refunded);
            break label1243;
          }
          paraml = aM(this.mDa, true) + getString(a.i.remittance_detail_result_refunded);
          this.mBP.setText(j.a(this, paraml, this.mBP.getTextSize()));
          break label1243;
          label1532:
          this.kUA.setText("");
        }
      }
      h.bA(this.mController.tml, getString(a.i.remittance_detail_msg_collect_suc));
      return bool1;
    }
    if (((paraml instanceof c)) || ((paraml instanceof b)))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((paraml instanceof c)) {
          vr(1);
        }
        for (;;)
        {
          return true;
          aA(0, getString(a.i.remittance_detail_msg_refuse_suc));
        }
      }
      aA(paramInt2, paramString);
      return true;
    }
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mCb = getIntent().getIntExtra("total_fee", 0);
    this.pFZ = getIntent().getStringExtra("fee_type");
    if (getIntent().getBooleanExtra("is_sender", false))
    {
      this.pGa = q.GF();
      this.mDa = this.mBX;
      return;
    }
    this.pGa = this.mBX;
    this.mDa = q.GF();
  }
  
  protected final void vq(int paramInt)
  {
    a(new f(this.mzr, this.mBX, this.mBU), true, false);
  }
  
  protected final void vr(int paramInt)
  {
    a(new f(this.mzr, this.mBX, this.mBU, paramInt), true, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/ui/PayURemittanceDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */