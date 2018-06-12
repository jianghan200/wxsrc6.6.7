package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.q;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.plugin.luckymoney.b.ag;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.plugin.normsg.a.b;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.io.IOException;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyReceiveUI
  extends LuckyMoneyBaseUI
{
  private TextView hXT;
  private long hmf = 0L;
  private String jNl;
  private ImageView kLO;
  private TextView kMF;
  Button kMG;
  private View kMH;
  private ImageView kMI;
  private TextView kMJ;
  private View kMK;
  private ImageView kOI;
  ag kRG;
  private String kUn;
  private String kUp;
  private y kXq = null;
  private TextView klp;
  private int maxSize = 0;
  private int textSize = 0;
  private p tipDialog = null;
  
  private int bbC()
  {
    if (q.GF().equals(this.jNl)) {
      return 1;
    }
    return 0;
  }
  
  private static int sn(int paramInt)
  {
    if (paramInt == 1) {
      return 1;
    }
    if (paramInt == 0) {
      return 2;
    }
    return 0;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof ag))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.kRG = ((ag)paraml);
        com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(5), Integer.valueOf(sn(this.kRG.kPI)), Integer.valueOf(bbC()), Integer.valueOf(0), Integer.valueOf(1) });
        paramString = new y();
        paramString.field_mNativeUrl = this.kUp;
        paramString.field_hbType = this.kRG.kPI;
        paramString.field_hbStatus = this.kRG.ceS;
        paramString.field_receiveStatus = this.kRG.ceT;
        com.tencent.mm.plugin.wallet_core.model.o.bOT().a(paramString);
        if (this.kRG.ceT == 2)
        {
          b(new com.tencent.mm.plugin.luckymoney.b.w(this.kUn, 11, 0, this.kUp, "v1.0"), false);
          return true;
        }
        if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
          this.tipDialog.hide();
        }
        com.tencent.mm.plugin.luckymoney.b.o.a(this.kLO, this.kRG.kPM, this.kRG.kQg);
        com.tencent.mm.plugin.luckymoney.b.o.a(this.mController.tml, this.kMF, this.kRG.kRy);
        boolean bool;
        if ((this.kRG.ceT != 1) && (this.kRG.ceS != 4) && (this.kRG.ceS != 5) && (this.kRG.ceS != 1))
        {
          if (!bi.oW(this.kRG.kPJ))
          {
            this.hXT.setText(this.kRG.kPJ);
            this.hXT.setVisibility(0);
          }
          if (!bi.oW(this.kRG.kLf))
          {
            com.tencent.mm.plugin.luckymoney.b.o.a(this.mController.tml, this.klp, this.kRG.kLf);
            this.klp.setVisibility(0);
          }
          this.kMG.setOnClickListener(new LuckyMoneyReceiveUI.3(this));
          bool = false;
          if ((!q.GF().equals(this.jNl)) && ((this.kRG.kPI != 1) || (!bool))) {
            break label748;
          }
          if (this.kRG.kPI == 1) {
            this.kMJ.setText(a.i.lucky_money_detail_luck);
          }
          this.kMH.setVisibility(0);
          this.kMH.setOnClickListener(new LuckyMoneyReceiveUI.4(this, bool));
          this.kMI.setVisibility(8);
        }
        for (;;)
        {
          com.tencent.mm.plugin.luckymoney.b.o.a(this.kMK, null);
          this.mController.contentView.setVisibility(0);
          if ((this.kRG.ceS != 5) || (paramString.field_receiveAmount <= 0L)) {
            break;
          }
          this.kMI.setVisibility(8);
          this.kMH.setVisibility(0);
          this.hXT.setVisibility(0);
          this.hXT.setText(a.i.lucky_money_send_for_you);
          this.klp.setVisibility(8);
          findViewById(a.f.lucky_money_receive_money).setVisibility(0);
          ((WalletTextView)findViewById(a.f.lucky_money_detail_amount)).setText(com.tencent.mm.wallet_core.ui.e.A(paramString.field_receiveAmount / 100.0D));
          this.kMH.setOnClickListener(new LuckyMoneyReceiveUI.5(this));
          return true;
          this.kMG.setBackgroundResource(a.e.lucky_money_receive_open_disabled_btn);
          this.kMG.setText(a.i.lucky_money_open);
          this.kMG.setOnClickListener(null);
          this.kMG.setVisibility(8);
          if (!bi.oW(this.kRG.kNj))
          {
            this.hXT.setText(this.kRG.kNj);
            this.hXT.setVisibility(0);
          }
          for (;;)
          {
            this.klp.setText(this.kRG.kPJ);
            paraml = (RelativeLayout.LayoutParams)this.kMH.getLayoutParams();
            paraml.bottomMargin = BackwardSupportUtil.b.b(this.mController.tml, 30.0F);
            this.kMH.setLayoutParams(paraml);
            bool = true;
            break;
            this.hXT.setVisibility(8);
          }
          label748:
          this.kMH.setVisibility(8);
          this.kMI.setVisibility(0);
        }
      }
      if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
        this.tipDialog.hide();
      }
      return false;
    }
    if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.ad))
    {
      com.tencent.mm.plugin.luckymoney.b.o.c(this.kMG);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paraml = (com.tencent.mm.plugin.luckymoney.b.ad)paraml;
        paramString = paraml.kQP;
        Object localObject;
        if (paramString.ceT == 2)
        {
          localObject = new Intent();
          ((Intent)localObject).setClass(this.mController.tml, LuckyMoneyDetailUI.class);
          try
          {
            ((Intent)localObject).putExtra("key_detail_info", paraml.kQP.toByteArray());
            ((Intent)localObject).putExtra("key_jump_from", 2);
            ((Intent)localObject).putExtra("key_native_url", paraml.ceR);
            ((Intent)localObject).putExtra("key_sendid", paraml.kLZ);
            if (com.tencent.mm.k.g.AT().getInt("PlayCoinSound", 0) > 0) {
              ((Intent)localObject).putExtra("play_sound", true);
            }
            if (paraml.kMP != null) {
              ((Intent)localObject).putExtra("key_realname_guide_helper", paraml.kMP);
            }
            startActivity((Intent)localObject);
            paraml = new y();
            paraml.field_mNativeUrl = this.kUp;
            paraml.field_hbType = paramString.kPI;
            paraml.field_receiveAmount = paramString.cfh;
            paraml.field_receiveTime = System.currentTimeMillis();
            paraml.field_hbStatus = paramString.ceS;
            paraml.field_receiveStatus = paramString.ceT;
            if (paraml.field_receiveAmount > 0L) {
              com.tencent.mm.plugin.wallet_core.model.o.bOT().a(paraml);
            }
            finish();
            return true;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              x.w("MicroMsg.LuckyMoneyReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + localIOException.getLocalizedMessage());
            }
          }
        }
        this.kMG.setBackgroundResource(a.e.lucky_money_receive_open_disabled_btn);
        this.kMG.setText(a.i.lucky_money_open);
        this.kMG.setOnClickListener(null);
        this.kMG.setVisibility(8);
        if (!bi.oW(paramString.kNj))
        {
          this.hXT.setText(paramString.kNj);
          this.hXT.setVisibility(0);
        }
        for (;;)
        {
          this.klp.setText(paramString.kPJ);
          localObject = (RelativeLayout.LayoutParams)this.kMH.getLayoutParams();
          ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.b(this.mController.tml, 30.0F);
          this.kMH.setLayoutParams((ViewGroup.LayoutParams)localObject);
          if ((!q.GF().equals(this.jNl)) && (paramString.kPI != 1)) {
            break;
          }
          this.kMH.setVisibility(0);
          this.kMH.setOnClickListener(new LuckyMoneyReceiveUI.6(this, paraml));
          this.kMI.setVisibility(8);
          return true;
          this.hXT.setVisibility(8);
        }
        this.kMH.setVisibility(8);
        this.kMI.setVisibility(0);
        return true;
      }
      if (paramInt2 == 416)
      {
        if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
          this.tipDialog.hide();
        }
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyReceiveUI");
        paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
        this.kMG.setBackgroundResource(a.e.festival_lucky_money_open_btn);
        new LuckyMoneyReceiveUI.7(this);
        return com.tencent.mm.plugin.luckymoney.b.o.a(this, paramInt2, paraml, paramString, false, 1003);
      }
    }
    else if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.w))
    {
      if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
        this.tipDialog.hide();
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paraml = (com.tencent.mm.plugin.luckymoney.b.w)paraml;
        paramString = new Intent();
        paramString.setClass(this.mController.tml, LuckyMoneyDetailUI.class);
        try
        {
          paramString.putExtra("key_detail_info", paraml.kQP.toByteArray());
          paramString.putExtra("key_jump_from", 2);
          paramString.putExtra("key_native_url", this.kUp);
          paramString.putExtra("key_sendid", this.kUn);
          startActivity(paramString);
          finish();
          return true;
        }
        catch (IOException paraml)
        {
          for (;;)
          {
            x.w("MicroMsg.LuckyMoneyReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paraml.getLocalizedMessage());
          }
        }
      }
      com.tencent.mm.ui.base.h.bA(this, paramString);
      finish();
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_receive_ui;
  }
  
  protected final void initView()
  {
    this.kMK = findViewById(a.f.lucky_money_receive_ll);
    this.kLO = ((ImageView)findViewById(a.f.lucky_money_receive_sender_avatar));
    this.kMF = ((TextView)findViewById(a.f.lucky_money_receive_sender_nickname));
    this.hXT = ((TextView)findViewById(a.f.lucky_money_receive_tips));
    this.klp = ((TextView)findViewById(a.f.lucky_money_receive_wishing));
    this.kMG = ((Button)findViewById(a.f.lucky_money_recieve_open));
    this.kMJ = ((TextView)findViewById(a.f.lucky_money_recieve_check_detail));
    this.kMH = findViewById(a.f.lucky_money_recieve_check_detail_ll);
    this.kMI = ((ImageView)findViewById(a.f.lucky_money_bottom_decoration));
    this.kOI = ((ImageView)findViewById(a.f.lucky_money_recieve_close_btn));
    this.kOI.setOnClickListener(new LuckyMoneyReceiveUI.1(this));
    this.maxSize = ((int)(com.tencent.mm.bp.a.ae(this.mController.tml, a.d.lucky_money_goldstyle_envelop_wishing_textsize) * 1.375F));
    this.textSize = com.tencent.mm.bp.a.ad(this.mController.tml, a.d.lucky_money_goldstyle_envelop_wishing_textsize);
    if (this.textSize > this.maxSize) {}
    for (int i = this.maxSize;; i = this.textSize)
    {
      this.textSize = i;
      this.klp.setTextSize(0, this.textSize);
      this.mController.contentView.setVisibility(8);
      this.tipDialog = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.i.loading_tips), true, new LuckyMoneyReceiveUI.2(this));
      if (this.kMG != null)
      {
        b.lFJ.uc(this.kMG.getId());
        String str = com.tencent.mm.sdk.platformtools.w.d(com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.chY(), 0));
        if ((str == null) || (str.length() <= 0) || ((!str.equals("zh_CN")) && (!str.equals("zh_TW")) && (!str.equals("zh_HK")))) {
          break;
        }
      }
      return;
    }
    this.kMG.setBackgroundResource(a.e.lucky_money_send_btn);
    this.kMG.setText(a.i.lucky_money_open_title);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kUp = getIntent().getStringExtra("key_native_url");
    x.i("MicroMsg.LuckyMoneyReceiveUI", "nativeUrl= " + bi.oV(this.kUp));
    initView();
    paramBundle = Uri.parse(bi.oV(this.kUp));
    try
    {
      this.kUn = paramBundle.getQueryParameter("sendid");
      this.kXq = com.tencent.mm.plugin.wallet_core.model.o.bOT().Pk(this.kUp);
      if ((this.kXq != null) && (this.kXq.field_receiveAmount > 0L) && (bi.bH(this.kXq.field_receiveTime) < 86400000L))
      {
        x.i("MicroMsg.LuckyMoneyReceiveUI", "use cache this item %s %s", new Object[] { Long.valueOf(this.kXq.field_receiveTime), bi.oV(this.kUp) });
        paramBundle = new Intent();
        paramBundle.setClass(this.mController.tml, LuckyMoneyDetailUI.class);
        paramBundle.putExtra("key_native_url", this.kXq.field_mNativeUrl);
        paramBundle.putExtra("key_sendid", this.kUn);
        startActivity(paramBundle);
        finish();
      }
      do
      {
        return;
        if (bi.oW(this.kUn)) {
          break;
        }
        int i = bi.getInt(paramBundle.getQueryParameter("channelid"), 1);
        this.jNl = paramBundle.getQueryParameter("sendusername");
        b(new ag(i, this.kUn, this.kUp, getIntent().getIntExtra("key_way", 0), "v1.0"), false);
      } while (this.tipDialog == null);
      this.tipDialog.show();
      return;
      finish();
      x.w("MicroMsg.LuckyMoneyReceiveUI", "sendid null & finish");
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    d.h("LuckyMoneyReceiveUI", this.hmf, bi.VE());
  }
  
  protected void onResume()
  {
    super.onResume();
    this.hmf = bi.VE();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */