package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.bk.b;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.remittance.model.BusiRemittanceResp;
import com.tencent.mm.plugin.remittance.model.f;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.ch;
import com.tencent.mm.protocal.c.jb;
import com.tencent.mm.protocal.c.jk;
import com.tencent.mm.protocal.c.kd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import d.a.a.c;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class RemittanceBusiResultUI
  extends WalletBaseUI
{
  private TextView gsY;
  private int kTw;
  private Button klJ;
  private String lJJ;
  private String mAa;
  private b mAb;
  private boolean mAc = false;
  private String mAd;
  private BusiRemittanceResp mAe;
  private ch mAf = new ch();
  private int mAg;
  private c mAh;
  private WalletSuccPageAwardWidget mAi;
  private CdnImageView mAj;
  private TextView mAk;
  private View mAl;
  private TextView mAm;
  private ViewGroup mAn;
  private ViewGroup mAo;
  private ViewGroup mAp;
  private TextView mAq;
  private int mwN;
  private String mwO;
  private String myR;
  private TextView mzG;
  private TextView mzH;
  private TextView mzI;
  private CdnImageView mzJ;
  private TextView mzK;
  private TextView mzL;
  private Button mzM;
  private ViewGroup mzN;
  private ViewGroup mzO;
  private ViewGroup mzP;
  private View mzQ;
  private String mzR;
  private String mzS;
  private String mzT;
  private double mzU;
  private String mzV;
  private String mzW;
  private String mzX;
  private int mzY;
  private String mzZ;
  private String mzp;
  
  private static boolean cu(View paramView)
  {
    return (paramView == null) || (paramView.getVisibility() == 8);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    Object localObject1;
    if ((paraml instanceof com.tencent.mm.plugin.remittance.model.j))
    {
      localObject1 = (com.tencent.mm.plugin.remittance.model.j)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        if (((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.hwV == 0)
        {
          x.i("MicroMsg.RemittanceBusiResultUI", "exposure info: %s", new Object[] { ((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.pqb });
          this.mAh = ((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.pqb;
          Object localObject2;
          if (WalletSuccPageAwardWidget.a(this.mAh))
          {
            x.i("MicroMsg.RemittanceBusiResultUI", "setAwardWidget, mTransId: %s", new Object[] { this.lJJ });
            this.mAi.a(this, this.mAh, this.lJJ, true, (ImageView)findViewById(a.f.background));
            this.mAi.init();
            this.mAi.setVisibility(0);
            localObject2 = (ImageView)findViewById(a.f.background);
            ((ImageView)localObject2).post(new RemittanceBusiResultUI.2(this, (ImageView)localObject2));
            this.mAi.post(new RemittanceBusiResultUI.3(this));
            this.mAo.setVisibility(8);
            this.mAn.setVisibility(8);
            this.mAp.setVisibility(8);
            if (((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.rlc != 1) {
              break label504;
            }
            this.mAl.setVisibility(0);
            this.mAm.setVisibility(0);
            this.mAm.setText(e.B(((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.rkZ / 100.0D));
            label260:
            if ((localObject1 == null) || (((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm == null) || (((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.rla.size() <= 0)) {
              break label603;
            }
            localObject2 = ((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.rla;
            if (localObject2 == null) {
              break label525;
            }
          }
          label504:
          label525:
          for (int i = ((List)localObject2).size();; i = 0)
          {
            x.i("MicroMsg.RemittanceBusiResultUI", "discountInfoList: %s, size: %s received_amount: %s", new Object[] { localObject2, Integer.valueOf(i), Long.valueOf(((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.rkZ) });
            if ((localObject2 == null) || (((List)localObject2).size() <= 0)) {
              break label547;
            }
            this.mAo.removeAllViews();
            i = 0;
            while (i < ((List)localObject2).size())
            {
              String str = (String)((List)localObject2).get(i);
              TextView localTextView = new TextView(this.mController.tml);
              LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
              localLayoutParams.bottomMargin = com.tencent.mm.bp.a.fromDPToPix(this, 6);
              localTextView.setLayoutParams(localLayoutParams);
              localTextView.setTextSize(1, 12.0F);
              localTextView.setTextColor(Color.parseColor("#FA962A"));
              localTextView.setText(str);
              this.mAo.addView(localTextView);
              i += 1;
            }
            this.mAi.setVisibility(8);
            break;
            this.mAl.setVisibility(8);
            this.mAm.setVisibility(8);
            break label260;
          }
          this.mAo.setVisibility(0);
          this.mAn.setVisibility(0);
          label547:
          if (((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.rkZ > 0L)
          {
            this.mAq.setText(e.B(((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.rkZ / 100.0D));
            this.mAq.getPaint().setFlags(16);
            this.mAp.setVisibility(0);
          }
        }
      }
    }
    label603:
    boolean bool;
    for (;;)
    {
      bool = false;
      if (this.mAh != null) {
        bool = this.mAi.d(paramInt1, paramInt2, paramString, paraml);
      }
      if ((!cu(this.mzN)) || (!cu(this.mzO)) || (!cu(this.mAp)) || (!cu(this.mAn))) {
        break;
      }
      this.mzQ.setVisibility(8);
      return bool;
      x.e("MicroMsg.RemittanceBusiResultUI", "result response: %s, %s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.hwV), ((com.tencent.mm.plugin.remittance.model.j)localObject1).mxm.hwW });
      continue;
      x.e("MicroMsg.RemittanceBusiResultUI", "net error: %s", new Object[] { localObject1 });
      continue;
      if ((paraml instanceof f))
      {
        localObject1 = (f)paraml;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (((f)localObject1).mwZ.hwV == 0)
          {
            localObject1 = ((f)localObject1).mwZ.rks;
            if (localObject1 != null)
            {
              this.mzJ.setUrl(((kd)localObject1).bWP);
              this.mzK.setText(((kd)localObject1).title);
              this.mzL.setText(((kd)localObject1).poH);
              this.mzM.setText(((kd)localObject1).pwk);
              this.mzM.setOnClickListener(new RemittanceBusiResultUI.4(this, (kd)localObject1));
              this.mzM.setBackgroundResource(a.e.remittance_busi_app_disable_bg);
              this.mzM.setTextColor(getResources().getColor(a.c.white_text_color_disabled));
              this.mzP.setVisibility(0);
            }
            else
            {
              x.i("MicroMsg.RemittanceBusiResultUI", "app info is null");
              this.mzP.setVisibility(8);
            }
          }
          else
          {
            x.e("MicroMsg.RemittanceBusiResultUI", "qry response: %s, %s", new Object[] { Integer.valueOf(((f)localObject1).mwZ.hwV), ((f)localObject1).mwZ.hwW });
            Toast.makeText(this, ((f)localObject1).mwZ.hwW, 1).show();
          }
        }
        else {
          x.e("MicroMsg.RemittanceBusiResultUI", "net error: %s", new Object[] { localObject1 });
        }
      }
    }
    this.mzQ.setVisibility(0);
    return bool;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  protected final int getLayoutId()
  {
    return a.g.remittance_busi_result_ui;
  }
  
  protected final void initView()
  {
    this.gsY = ((TextView)findViewById(a.f.rbru_title_tv));
    this.mzG = ((TextView)findViewById(a.f.rbru_money_tv));
    this.mzH = ((TextView)findViewById(a.f.rbru_rcv_desc_tv));
    this.mzI = ((TextView)findViewById(a.f.rbru_pay_desc_tv));
    this.mzN = ((LinearLayout)findViewById(a.f.rbru_rcv_desc_layout));
    this.mzO = ((LinearLayout)findViewById(a.f.rbru_pay_desc_layout));
    this.mzJ = ((CdnImageView)findViewById(a.f.rbru_app_logo_iv));
    this.mzK = ((TextView)findViewById(a.f.rbru_app_title_tv));
    this.mzL = ((TextView)findViewById(a.f.rbru_app_subtitle_tv));
    this.mzM = ((Button)findViewById(a.f.rbru_app_btn));
    this.mzP = ((ViewGroup)findViewById(a.f.rbru_app_layout));
    this.klJ = ((Button)findViewById(a.f.rbru_finish_btn));
    this.mzQ = findViewById(a.f.single_line_view);
    this.mzG.setText(e.A(this.mzU));
    String str2;
    String str1;
    if (!bi.oW(this.myR))
    {
      str2 = e.dx(this.myR, 6);
      str1 = str2;
      if (bi.oW(this.mAd)) {
        break label631;
      }
      str1 = getString(a.i.remittance_collect_block, new Object[] { str2, this.mAd });
    }
    label277:
    label306:
    label583:
    label595:
    label631:
    for (;;)
    {
      if (!bi.oW(this.mzR))
      {
        this.mzH.setText(this.mzR);
        this.mzN.setVisibility(0);
        if (bi.oW(this.mzS)) {
          break label583;
        }
        this.mzI.setText(this.mzS);
        this.mzO.setVisibility(0);
        this.klJ.setOnClickListener(new RemittanceBusiResultUI.1(this));
        this.mAi = ((WalletSuccPageAwardWidget)findViewById(a.f.award_widget));
        this.mAn = ((ViewGroup)findViewById(a.f.discount_info_list_layout));
        this.mAo = ((ViewGroup)findViewById(a.f.discount_desc_list_layout));
        this.mAp = ((ViewGroup)findViewById(a.f.original_feeinfo_layout));
        this.mAq = ((TextView)findViewById(a.f.origin_fee_tv));
        this.mAj = ((CdnImageView)findViewById(a.f.remittance_busi_logo));
        this.mAk = ((TextView)findViewById(a.f.rbru_rcvr_tv));
        this.mAl = findViewById(a.f.layout_money_really);
        this.mAm = ((TextView)findViewById(a.f.rbru_rcvr_money_tv));
        this.mAk.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this, str1));
        this.mAj.setVisibility(0);
        if (bi.oW(this.mwO)) {
          break label595;
        }
        if (this.mAg == 1) {
          this.mAj.setRoundCorner(true);
        }
        this.mAj.setUrl(this.mwO);
      }
      for (;;)
      {
        this.mAl.setVisibility(8);
        this.mAm.setVisibility(8);
        return;
        str2 = e.dx(e.gT(this.mzT), 6);
        str1 = str2;
        if (bi.oW(this.mAd)) {
          break label631;
        }
        str1 = getString(a.i.remittance_collect_block, new Object[] { str2, this.mAd });
        break;
        this.mzN.setVisibility(8);
        break label277;
        this.mzO.setVisibility(8);
        break label306;
        if (this.mAg == 1) {
          a.b.n(this.mAj, this.mzT);
        } else {
          a.b.a(this.mAj, this.mzT);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1537);
    jr(1680);
    jr(2504);
    if (d.fR(21))
    {
      if (!d.fR(23)) {
        break label425;
      }
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      if (getSupportActionBar() != null) {
        getSupportActionBar().hide();
      }
      setBackBtn(null);
      showHomeBtn(false);
      enableBackMenu(false);
      this.myR = getIntent().getStringExtra("key_mch_name");
      this.mAe = ((BusiRemittanceResp)getIntent().getParcelableExtra("BusiRemittanceResp"));
      this.mzU = getIntent().getDoubleExtra("key_money", 0.0D);
      this.mzT = getIntent().getStringExtra("key_rcver_name");
      this.mAd = getIntent().getStringExtra("key_rcver_true_name");
      this.mzR = getIntent().getStringExtra("key_rcv_desc");
      this.mzS = getIntent().getStringExtra("key_pay_desc");
      this.mzV = getIntent().getStringExtra("key_f2f_id");
      this.lJJ = getIntent().getStringExtra("key_trans_id");
      this.mzp = getIntent().getStringExtra("key_rcvr_open_id");
      this.mAa = getIntent().getStringExtra("key_check_sign");
      this.mzW = getIntent().getStringExtra("key_pay_desc");
      this.mzX = getIntent().getStringExtra("key_rcv_desc");
      this.mzY = getIntent().getIntExtra("key_scan_sceen", 0);
      this.kTw = getIntent().getIntExtra("key_channel", 0);
      this.mzZ = getIntent().getStringExtra("key_succ_page_extend");
      paramBundle = getIntent().getByteArrayExtra("AfterPlaceOrderCommReq");
      try
      {
        this.mAf.aG(paramBundle);
        this.mAg = getIntent().getIntExtra("key_succ_show_avatar_type", 0);
        this.mwN = getIntent().getIntExtra("key_succ_show_avatar_show", 0);
        this.mwO = getIntent().getStringExtra("key_succ_show_avatar_url");
        this.mAc = false;
        x.i("MicroMsg.RemittanceBusiResultUI", "fetch data");
        a(new com.tencent.mm.plugin.remittance.model.j(this.mAf, this.mzZ), true, true);
        initView();
        return;
        label425:
        getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.RemittanceBusiResultUI", paramBundle, "", new Object[0]);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1537);
    js(1680);
    js(2504);
    if (this.mAh != null) {
      this.mAi.onDestroy();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.mAc)
    {
      x.i("MicroMsg.RemittanceBusiResultUI", "do act qry");
      int i = (int)Math.round(this.mzU * 100.0D);
      a(new f(this.mzV, this.lJJ, this.mzp, i, this.mAb, this.mAa), false, false);
      this.mAc = false;
    }
    if (this.mAh != null) {
      this.mAi.onResume();
    }
  }
  
  public final void ux(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */