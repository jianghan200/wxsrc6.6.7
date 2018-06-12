package com.tencent.mm.plugin.remittance.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.remittance.a.b;
import com.tencent.mm.plugin.remittance.model.ab;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.lr;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class RemittanceResultNewUI
  extends RemittanceResultUI
{
  private d.a.a.c mAh;
  private WalletSuccPageAwardWidget mAi;
  private Orders mCZ;
  private String mDa;
  private boolean mDc;
  private TextView mDd;
  private ViewGroup mDe;
  private TextView mDf;
  private WalletTextView mDg;
  private ViewGroup mDh;
  private ViewGroup mDi;
  private ViewGroup mDj;
  private TextView mDk;
  private TextView mDl;
  private WalletTextView mDm;
  private lr mDn;
  private Button mDo;
  private PayInfo mpb;
  private int myU;
  
  private void brE()
  {
    boolean bool = true;
    if (this.mCZ != null) {
      if (this.mCZ.mxE <= 0.0D) {
        break label165;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "need set charge fee: %s", new Object[] { Boolean.valueOf(bool) });
      if (this.mCZ.mxE > 0.0D)
      {
        String str1 = getString(a.i.remittance_result_charge_fee_wording);
        String str2 = com.tencent.mm.wallet_core.ui.e.e(this.mCZ.mxE, this.mCZ.lNV);
        ViewGroup localViewGroup = (ViewGroup)getLayoutInflater().inflate(a.g.f2f_transfer_detail_item, this.mDi, false);
        TextView localTextView1 = (TextView)localViewGroup.findViewById(a.f.title_tv);
        ImageView localImageView = (ImageView)localViewGroup.findViewById(a.f.avatar_iv);
        TextView localTextView2 = (TextView)localViewGroup.findViewById(a.f.desc_tv);
        localTextView1.setText(str1);
        localImageView.setVisibility(8);
        localTextView2.setText(str2);
        this.mDi.addView(localViewGroup);
      }
      return;
      label165:
      bool = false;
    }
  }
  
  private void brF()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "endRemittance");
    if (this.sy.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.sy.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
        localBundle.putString("realname_verify_process_jump_plugin", "remittance");
        localRealnameGuideHelper.b(this, localBundle, new RemittanceResultNewUI.2(this));
        localRealnameGuideHelper.a(this, localBundle, new RemittanceResultNewUI.3(this));
        this.sy.remove("key_realname_guide_helper");
      }
      return;
    }
    brG();
  }
  
  private void brG()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
    cDK().b(this, this.sy);
    new ag().postDelayed(new RemittanceResultNewUI.4(this), 100L);
  }
  
  protected final boolean brH()
  {
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (WalletSuccPageAwardWidget.a(this.mAh)) {
      return this.mAi.d(paramInt1, paramInt2, paramString, paraml);
    }
    return super.d(paramInt1, paramInt2, paramString, paraml);
  }
  
  protected final int getLayoutId()
  {
    return a.g.remittance_result_new_ui;
  }
  
  protected final void initView()
  {
    boolean bool2 = false;
    setBackBtn(null);
    showHomeBtn(false);
    enableBackMenu(false);
    this.mDd = ((TextView)findViewById(a.f.pay_succ_wording_tv));
    this.mDe = ((ViewGroup)findViewById(a.f.f2f_transfer_result_money_layout));
    this.mDf = ((TextView)findViewById(a.f.f2f_money_unit_tv));
    this.mDg = ((WalletTextView)findViewById(a.f.f2f_money_amount_tv));
    this.mDh = ((ViewGroup)findViewById(a.f.f2f_transfer_detail_layout));
    this.mDi = ((ViewGroup)findViewById(a.f.f2f_transfer_detail_list_layout));
    this.mDj = ((ViewGroup)findViewById(a.f.normal_transfer_result_money_layout));
    this.mDk = ((TextView)findViewById(a.f.normal_transfer_desc_tv));
    this.mDl = ((TextView)findViewById(a.f.normal_money_unit_tv));
    this.mDm = ((WalletTextView)findViewById(a.f.normal_money_amount_tv));
    this.mDo = ((Button)findViewById(a.f.transfer_finish_button));
    this.mDo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        RemittanceResultNewUI.a(RemittanceResultNewUI.this);
      }
    });
    this.mAi = ((WalletSuccPageAwardWidget)findViewById(a.f.award_widget));
    Object localObject1 = com.tencent.mm.wallet_core.ui.e.gT(this.mDa);
    if ((this.myU == 31) || (this.myU == 5))
    {
      this.mDl.setText(com.tencent.mm.wallet_core.ui.e.abW(this.mCZ.lNV));
      this.mDm.setText(com.tencent.mm.wallet_core.ui.e.A(this.mCZ.mBj));
      if (this.myU == 31)
      {
        localObject1 = getString(a.i.remittance_result_receiver_desc, new Object[] { localObject1 });
        if (!bi.oW((String)localObject1)) {
          this.mDk.setText(j.a(this, (CharSequence)localObject1, this.mDk.getTextSize()));
        }
        for (;;)
        {
          this.mDj.setVisibility(0);
          if (this.mCZ.mxE > 0.0D)
          {
            brE();
            ((ViewGroup.MarginLayoutParams)this.mDh.getLayoutParams()).topMargin = com.tencent.mm.bp.a.fromDPToPix(this, 20);
            this.mDh.setVisibility(0);
            this.mDi.setVisibility(0);
          }
          g.Ek();
          localObject1 = g.Ei().DT().get(aa.a.sQv, Boolean.valueOf(false));
          bool1 = bool2;
          if (localObject1 != null) {
            bool1 = ((Boolean)localObject1).booleanValue();
          }
          if (!bool1) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "has show the finger print auth guide!");
          label424:
          return;
          this.mDk.setVisibility(8);
        }
      }
      if ((this.mpb.qUL == null) || (!this.mpb.qUL.getBoolean("extinfo_key_10"))) {
        break label1822;
      }
    }
    label1815:
    label1822:
    for (boolean bool1 = true;; bool1 = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "isEmojiReward: %s", new Object[] { Boolean.valueOf(bool1) });
      if (bool1)
      {
        this.mDk.setText(getString(a.i.remittance_emoji_reward_desc));
        break;
      }
      if ((this.mCZ.ppf == null) || (this.mCZ.ppf.get(0) == null) || (TextUtils.isEmpty(((Orders.Commodity)this.mCZ.ppf.get(0)).lNK))) {
        break;
      }
      this.mDk.setText(((Orders.Commodity)this.mCZ.ppf.get(0)).lNK);
      break;
      localObject1 = this.sy.getByteArray("key_succpage_resp");
      if (localObject1 != null) {
        this.mDn = new lr();
      }
      for (;;)
      {
        try
        {
          this.mDn.aG((byte[])localObject1);
          this.mAh = this.mDn.pqb;
          localObject4 = com.tencent.mm.wallet_core.ui.e.gT(this.mDa);
          this.mDf.setText(com.tencent.mm.wallet_core.ui.e.abW(this.mCZ.lNV));
          this.mDg.setText(com.tencent.mm.wallet_core.ui.e.A(this.mCZ.mBj));
          this.mDi.removeAllViews();
          if ((this.myU == 32) || (this.myU == 33) || (this.myU == 48))
          {
            localObject1 = "";
            if (this.mpb.qUL != null) {
              localObject1 = this.mpb.qUL.getString("extinfo_key_2");
            }
            localObject3 = localObject4;
            if (localObject4 != null)
            {
              localObject3 = localObject4;
              if (((String)localObject4).length() > 10) {
                localObject3 = ((String)localObject4).substring(0, 10) + "...";
              }
            }
            if (bi.oW((String)localObject1)) {
              break label1815;
            }
            if (bi.oW((String)localObject3)) {
              continue;
            }
            localObject1 = com.tencent.mm.wallet_core.ui.e.abZ((String)localObject1);
            localObject1 = (String)localObject3 + "(" + (String)localObject1 + ")";
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "setF2FNameView");
            localObject3 = (ViewGroup)getLayoutInflater().inflate(a.g.f2f_transfer_new_detail_item, this.mDi, false);
            localObject4 = (ImageView)((ViewGroup)localObject3).findViewById(a.f.remittance_busi_logo);
            localObject5 = (TextView)((ViewGroup)localObject3).findViewById(a.f.rbru_rcvr_tv);
            a.b.a((ImageView)localObject4, this.mDa, 0.06F, false);
            ((TextView)localObject5).setText((CharSequence)localObject1);
            this.mDi.addView((View)localObject3);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "setF2FReceiverRemarkView");
            localObject4 = this.mpb.qUL.getString("extinfo_key_3");
            localObject5 = this.mpb.qUL.getString("extinfo_key_8");
            ViewGroup localViewGroup;
            TextView localTextView2;
            if (!bi.oW((String)localObject4))
            {
              localViewGroup = (ViewGroup)getLayoutInflater().inflate(a.g.f2f_transfer_detail_item_2, this.mDi, false);
              localTextView1 = (TextView)localViewGroup.findViewById(a.f.title_tv);
              localTextView2 = (TextView)localViewGroup.findViewById(a.f.desc_tv);
              if (bi.oW((String)localObject5)) {
                continue;
              }
              localTextView1.setText((CharSequence)localObject5);
              localTextView2.setText((CharSequence)localObject4);
              this.mDi.addView(localViewGroup);
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "setF2FPayerRemarkView");
            localObject4 = this.mpb.qUL.getString("extinfo_key_6");
            localObject5 = this.mpb.qUL.getString("extinfo_key_7");
            if (!bi.oW((String)localObject5))
            {
              localViewGroup = (ViewGroup)getLayoutInflater().inflate(a.g.f2f_transfer_detail_item_2, this.mDi, false);
              localTextView1 = (TextView)localViewGroup.findViewById(a.f.title_tv);
              localTextView2 = (TextView)localViewGroup.findViewById(a.f.desc_tv);
              if (bi.oW((String)localObject4)) {
                continue;
              }
              localTextView1.setText((CharSequence)localObject4);
              localTextView2.setText((CharSequence)localObject5);
              this.mDi.addView(localViewGroup);
            }
            brE();
            this.mDh.setVisibility(0);
            this.mDi.setVisibility(0);
            if (!WalletSuccPageAwardWidget.a(this.mAh)) {
              continue;
            }
            localObject1 = "";
            if (this.mCZ.ppf.size() > 0) {
              localObject1 = ((Orders.Commodity)this.mCZ.ppf.get(0)).bOe;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "transId: %s", new Object[] { localObject1 });
            this.mAi.a(this, this.mAh, (String)localObject1, true, (ImageView)findViewById(a.f.background));
            this.mAi.init();
            this.mAi.setVisibility(0);
            if (localObject3 != null)
            {
              localObject1 = ((ViewGroup)localObject3).findViewById(a.f.rbru_rcvr_tv_v2_layout);
              if ((localObject1 != null) && (((View)localObject1).getVisibility() == 8))
              {
                localObject1 = findViewById(a.f.split_line);
                if (localObject1 != null) {
                  ((View)localObject1).setVisibility(8);
                }
              }
            }
          }
          this.mDe.setVisibility(0);
        }
        catch (Exception localException)
        {
          TextView localTextView1;
          this.mDn = null;
          this.mAh = null;
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RemittanceResultNewUI", localException, "parse f2FPaySucPageResp error: %s", new Object[] { localException.getMessage() });
          continue;
          continue;
          localTextView1.setText(getString(a.i.collect_create_qrcode_receiver_msg_title));
          continue;
          localTextView1.setText(getString(a.i.collect_create_qrcode_payer_msg_title));
          continue;
          this.mAi.setVisibility(8);
          if (this.mDi.getChildCount() != 1) {
            continue;
          }
          Object localObject4 = (LinearLayout.LayoutParams)this.mDh.getLayoutParams();
          ((LinearLayout.LayoutParams)localObject4).topMargin = BackwardSupportUtil.b.b(this, 78.0F);
          this.mDh.setLayoutParams((ViewGroup.LayoutParams)localObject4);
          localObject4 = ((ViewGroup)localObject3).findViewById(a.f.remittance_layout_line2);
          Object localObject5 = (LinearLayout.LayoutParams)((View)localObject4).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject5).topMargin = BackwardSupportUtil.b.b(this, 24.0F);
          ((LinearLayout.LayoutParams)localObject5).bottomMargin = 0;
          ((View)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject5);
          localObject4 = (ImageView)((ViewGroup)localObject3).findViewById(a.f.remittance_busi_logo);
          ((TextView)((ViewGroup)localObject3).findViewById(a.f.rbru_rcvr_tv)).setVisibility(8);
          findViewById(a.f.rbru_rcvr_tv_v2_layout).setVisibility(0);
          ((TextView)findViewById(a.f.rbru_rcvr_tv_v2)).setText(localException);
          localObject2 = (LinearLayout.LayoutParams)((ImageView)localObject4).getLayoutParams();
          int i = BackwardSupportUtil.b.b(this, 52.0F);
          ((LinearLayout.LayoutParams)localObject2).width = i;
          ((LinearLayout.LayoutParams)localObject2).height = i;
          ((ImageView)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject2);
          this.mDg.setTextSize(1, 42.0F);
          this.mDf.setTextSize(1, 42.0F);
          ((TextView)findViewById(a.f.rec_name_tip)).setTextSize(1, 16.0F);
          localObject2 = (ImageView)findViewById(a.f.wxpay_succes_page_logo_iv);
          localObject3 = (LinearLayout.LayoutParams)((ImageView)localObject2).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject3).width = BackwardSupportUtil.b.b(this, 26.0F);
          ((LinearLayout.LayoutParams)localObject3).height = BackwardSupportUtil.b.b(this, 22.0F);
          ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
          localObject2 = findViewById(a.f.split_line);
          if (localObject2 == null) {
            continue;
          }
          ((View)localObject2).setVisibility(8);
          continue;
        }
        Object localObject3 = com.tencent.mm.wallet_core.a.af(this);
        Object localObject2 = new Bundle();
        if (localObject3 != null) {
          localObject2 = ((com.tencent.mm.wallet_core.c)localObject3).jfZ;
        }
        if (TextUtils.isEmpty(((Bundle)localObject2).getString("key_pwd1")))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "pwd is empty, not show the finger print auth guide!");
          return;
        }
        if (localObject3 == null) {
          break label424;
        }
        ((com.tencent.mm.wallet_core.c)localObject3).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", (Bundle)localObject2);
        return;
        localObject2 = localObject3;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (d.fR(21))
    {
      if (d.fR(23))
      {
        getWindow().setStatusBarColor(-1);
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    else
    {
      if (getSupportActionBar() != null) {
        getSupportActionBar().hide();
      }
      this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
      this.mpb = ((PayInfo)this.sy.getParcelable("key_pay_info"));
      if (this.mpb != null) {
        break label126;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RemittanceResultNewUI", "payInfo is null!!!");
      finish();
    }
    label126:
    do
    {
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
      String str = "";
      paramBundle = "";
      if (this.mpb.qUL != null)
      {
        this.mDc = this.mpb.qUL.getBoolean("extinfo_key_4");
        str = this.mpb.qUL.getString("extinfo_key_1");
        paramBundle = this.mpb.qUL.getString("extinfo_key_16");
      }
      int i = this.mpb.bVY;
      this.myU = i;
      this.mDa = str;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "payScene: %s", new Object[] { Integer.valueOf(i) });
      initView();
    } while (this.myU != 31);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultNewUI", "transId: %s", new Object[] { paramBundle });
    b.bqQ().bqT().en(paramBundle, this.mDa);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (WalletSuccPageAwardWidget.a(this.mAh)) {
      this.mAi.onDestroy();
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      brF();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    if (WalletSuccPageAwardWidget.a(this.mAh)) {
      this.mAi.onResume();
    }
  }
  
  public final void ux(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceResultNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */