package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.io;
import com.tencent.mm.g.a.io.a;
import com.tencent.mm.plugin.wallet_core.c.m;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.n.a;
import com.tencent.mm.plugin.wallet_core.model.n.b;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;

@com.tencent.mm.ui.base.a(3)
public class WalletBindCardResultUI
  extends WalletBaseUI
{
  private com.tencent.mm.sdk.b.c lLY = new WalletBindCardResultUI.1(this);
  private String lPn = null;
  private String mBW;
  private PayInfo mCn;
  private TextView mDd;
  private int poM;
  private BindCardOrder ptc;
  private boolean ptd = false;
  private String pte;
  private String ptf;
  private n.b ptg;
  private WalletOrderInfoNewUI.b pth;
  private HashMap<String, WalletOrderInfoNewUI.a> pti = new HashMap();
  private String ptj;
  private BindCardOrder ptk = null;
  private String ptl = "-1";
  private Button ptm;
  private ImageView ptn;
  private ViewGroup pto;
  private CdnImageView ptp;
  private TextView ptq;
  private TextView ptr;
  private View pts;
  private Button ptt;
  private ViewGroup ptu;
  private boolean ptv = false;
  private boolean ptw = false;
  private boolean ptx = false;
  private com.tencent.mm.wallet_core.c pty;
  
  private void Ps(String paramString)
  {
    bQb();
    e.l(this, paramString, false);
  }
  
  private void bPY()
  {
    this.ptu.setVisibility(0);
  }
  
  private void bPZ()
  {
    this.mDd.setText(this.ptc.pmG);
  }
  
  private void bQa()
  {
    int i = 1;
    this.pto.setVisibility(4);
    this.ptw = false;
    this.ptv = false;
    if (this.ptc != null) {
      if (this.ptc.pmM != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBindCardResultUI", "activityPromotions: %s", new Object[] { this.ptk });
        if ((this.ptc == null) || ((!this.ptc.bOy()) && (!this.ptc.bOz())) || (this.ptc.pmM.pji <= 0L) || (bi.oW(this.ptc.pmN.poG))) {
          break label842;
        }
        this.ptk = this.ptc;
        this.pts.setVisibility(8);
        this.ptp.setRoundCorner(true);
        this.ptt.setEnabled(true);
        this.ptt.setBackgroundResource(a.e.btn_solid_green);
        this.ptr.setCompoundDrawables(null, null, null, null);
        localObject = (WalletOrderInfoNewUI.a)this.pti.get(this.ptk.pmM.pji);
        if (localObject == null) {
          break label629;
        }
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).bWP)) {
          this.ptp.setUrl(((WalletOrderInfoNewUI.a)localObject).bWP);
        }
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).bSc)) {
          this.ptq.setText(((WalletOrderInfoNewUI.a)localObject).bSc);
        }
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).pwk))
        {
          this.ptt.setText(((WalletOrderInfoNewUI.a)localObject).pwk);
          this.ptt.setBackgroundResource(a.e.wallet_order_info_solid_green_disabled);
        }
        localLayoutParams = (RelativeLayout.LayoutParams)this.ptr.getLayoutParams();
        if ((localObject == null) || (bi.oW(((WalletOrderInfoNewUI.a)localObject).title))) {
          break label683;
        }
        this.ptr.setText(((WalletOrderInfoNewUI.a)localObject).title);
        localLayoutParams.addRule(15, 0);
        this.ptr.setLayoutParams(localLayoutParams);
        this.ptt.setVisibility(0);
        this.ptt.setOnClickListener(new WalletBindCardResultUI.3(this));
        if (this.ptk.pmM.poB != 1L) {
          this.pto.setOnClickListener(new WalletBindCardResultUI.4(this));
        }
        localObject = this.ptl;
        switch (((String)localObject).hashCode())
        {
        default: 
          i = -1;
          switch (i)
          {
          default: 
            localObject = this.ptq.getText();
            if ((!bi.K((CharSequence)localObject)) && (((CharSequence)localObject).length() > 9))
            {
              this.ptq.setText(((CharSequence)localObject).subSequence(0, 9));
              this.ptq.append("...");
            }
            localObject = (ViewGroup.MarginLayoutParams)this.pto.getLayoutParams();
            ((ViewGroup.MarginLayoutParams)localObject).topMargin = com.tencent.mm.bp.a.fromDPToPix(this, 50);
            this.pto.setLayoutParams((ViewGroup.LayoutParams)localObject);
            this.pto.setVisibility(0);
          }
          break;
        }
      }
    }
    label561:
    label629:
    label683:
    label842:
    while ((this.ptc.pmO == null) || (bi.oW(this.ptc.pmO.paD))) {
      for (;;)
      {
        RelativeLayout.LayoutParams localLayoutParams;
        if (this.ptq.getVisibility() == 0) {
          this.ptq.post(new WalletBindCardResultUI.6(this));
        }
        if (this.pto.getVisibility() == 8)
        {
          localObject = (ViewGroup.MarginLayoutParams)this.ptn.getLayoutParams();
          ((ViewGroup.MarginLayoutParams)localObject).topMargin = com.tencent.mm.bp.a.fromDPToPix(this, 91);
          this.ptn.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        return;
        this.ptp.setUrl(this.ptc.pmN.lRX);
        this.ptq.setText(this.ptc.pmN.name);
        this.ptt.setText(this.ptc.pmN.poG);
        continue;
        if (!bi.oW(this.ptc.pmN.title))
        {
          this.ptr.setText(this.ptc.pmN.title);
          localLayoutParams.addRule(15, 0);
        }
        else
        {
          this.ptr.setVisibility(8);
          localLayoutParams.addRule(15, -1);
          continue;
          if (((String)localObject).equals("0"))
          {
            i = 0;
            continue;
            if (((String)localObject).equals("-1"))
            {
              continue;
              if (((String)localObject).equals("3"))
              {
                i = 2;
                continue;
                if (((String)localObject).equals("4"))
                {
                  i = 3;
                  continue;
                  if (((String)localObject).equals("2"))
                  {
                    i = 4;
                    continue;
                    if (((String)localObject).equals("1"))
                    {
                      i = 5;
                      continue;
                      this.ptt.setEnabled(false);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    Object localObject = this.ptc;
    if ((((BindCardOrder)localObject).jumpType == BindCardOrder.pmC) && (((BindCardOrder)localObject).pmO != null))
    {
      i = 1;
      label892:
      if (i == 0) {
        break label1352;
      }
      this.pte = this.ptc.pmO.paD;
      this.ptf = this.ptc.pmO.paE;
      this.poM = this.ptc.pmO.poM;
      this.ptg = this.ptc.pmO;
      this.ptp.setUrl(this.ptc.pmO.poJ);
      this.ptq.setText(this.ptc.pmO.poK);
      this.ptr.setText(getString(a.i.wallet_app_brand_entrance));
      this.ptr.setVisibility(0);
      this.ptp.setRoundCorner(true);
      this.ptt.setEnabled(true);
      this.ptt.setBackgroundResource(a.e.btn_solid_green);
      localObject = (RelativeLayout.LayoutParams)this.ptr.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject).addRule(15, 0);
      this.ptr.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if (this.ptc.pmM.pji <= 0L) {
        break label1354;
      }
      if (!bi.oW(this.ptc.pmO.poL))
      {
        this.ptt.setVisibility(0);
        this.ptt.setText(this.ptc.pmO.poL);
        this.pts.setVisibility(8);
      }
      localObject = (WalletOrderInfoNewUI.a)this.pti.get(this.ptc.pmM.pji);
      if (localObject != null)
      {
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).poJ)) {
          this.ptp.setUrl(((WalletOrderInfoNewUI.a)localObject).poJ);
        }
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).poK)) {
          this.ptq.setText(((WalletOrderInfoNewUI.a)localObject).poK);
        }
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).poL))
        {
          this.ptt.setText(((WalletOrderInfoNewUI.a)localObject).poL);
          this.ptt.setBackgroundResource(a.e.wallet_order_info_solid_green_disabled);
        }
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).paD)) {
          this.pte = ((WalletOrderInfoNewUI.a)localObject).paD;
        }
        if (!bi.oW(((WalletOrderInfoNewUI.a)localObject).paE)) {
          this.ptf = ((WalletOrderInfoNewUI.a)localObject).paE;
        }
      }
    }
    for (;;)
    {
      localObject = new WalletBindCardResultUI.5(this);
      this.pto.setOnClickListener((View.OnClickListener)localObject);
      this.ptt.setOnClickListener((View.OnClickListener)localObject);
      localObject = this.ptq.getText();
      if ((bi.K((CharSequence)localObject)) || (((CharSequence)localObject).length() <= 9)) {
        break;
      }
      this.ptq.setText(((CharSequence)localObject).subSequence(0, 9));
      this.ptq.append("...");
      break;
      i = 0;
      break label892;
      label1352:
      break label561;
      label1354:
      this.ptt.setVisibility(8);
      this.pts.setVisibility(8);
    }
  }
  
  private void bQb()
  {
    int i = 0;
    if (!this.ptd)
    {
      io localio = new io();
      localio.bRY.bRZ = 4;
      io.a locala = localio.bRY;
      if (this.sy.getBoolean("intent_pay_end", false)) {
        i = -1;
      }
      locala.bjW = i;
      com.tencent.mm.sdk.b.a.sFg.m(localio);
      this.ptd = true;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.x)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.c.x)paraml;
        paraml = new WalletOrderInfoNewUI.a(paramString.fFc);
        if (this.pth == null) {
          break label66;
        }
        this.pti.put(paramString.pjF, paraml);
        bQa();
        bPY();
      }
    }
    label66:
    while (!(paraml instanceof m)) {
      for (;;)
      {
        return false;
        if (this.ptv)
        {
          this.pti.put(paramString.pjF, paraml);
          bQa();
          bPY();
        }
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (m)paraml;
      paraml = paramString.pjp;
      if ((this.ptk != null) && (this.ptk.pmM.pji == paramString.pjr.pmM.pji))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBindCardResultUI", "activityAwardState: %s", new Object[] { this.ptk });
        this.ptl = paraml;
        bQa();
        bPY();
        if ((!bi.oW(paramString.hKX)) && (!"3".equals(paraml))) {
          this.ptt.setText(paramString.hKX);
        }
      }
      if ((!"-1".equals(paraml)) && (!"0".equals(paraml)) && (!bi.oW(paramString.pjq))) {
        com.tencent.mm.ui.base.h.b(this, paramString.pjq, "", true);
      }
      while (!"0".equals(paraml)) {
        return true;
      }
      if (!bi.oW(paramString.pjq)) {}
      for (paramString = paramString.pjq;; paramString = getString(a.i.wallet_pay_award_got))
      {
        Toast.makeText(this, paramString, 0).show();
        break;
      }
    }
    paraml = paramString;
    if (bi.oW(paramString)) {
      paraml = getString(a.i.wallet_unknown_err);
    }
    com.tencent.mm.ui.base.h.a(this, paraml, null, false, new WalletBindCardResultUI.8(this));
    return true;
  }
  
  public final void done()
  {
    Bundle localBundle = new Bundle();
    if (this.pty != null)
    {
      this.pty.a(this, 0, localBundle);
      return;
    }
    finish();
  }
  
  public final void gP(int paramInt)
  {
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.mEJ;
    if (this.ptc.pmM == null) {}
    for (String str = "";; str = bi.aG(this.ptc.pmM.pji, ""))
    {
      localh.h(14877, new Object[] { str, this.ptc.pmJ, Integer.valueOf(paramInt), this.ptc.lMV });
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_bind_card_result_ui;
  }
  
  protected final void initView()
  {
    if (getSupportActionBar() != null) {
      getSupportActionBar().hide();
    }
    this.ptn = ((ImageView)findViewById(a.f.wxpay_logo_iv));
    this.mDd = ((TextView)findViewById(a.f.pay_succ_wording));
    this.ptm = ((Button)findViewById(a.f.pay_finish_button));
    showHomeBtn(false);
    enableBackMenu(false);
    String str = getString(a.i.app_finish);
    if ((this.ptc != null) && (!bi.oW(this.ptc.pmF))) {
      this.ptm.setText(this.ptc.pmF);
    }
    for (;;)
    {
      this.ptm.setOnClickListener(new WalletBindCardResultUI.2(this));
      this.ptu = ((ViewGroup)findViewById(a.f.wallet_order_info_bottom_layout));
      this.pto = ((ViewGroup)findViewById(a.f.tinyapp_info_layout));
      this.ptp = ((CdnImageView)findViewById(a.f.tinyapp_logo_iv));
      this.ptp.setUseSdcardCache(true);
      this.ptq = ((TextView)findViewById(a.f.tinyapp_desc_tv));
      this.ptr = ((TextView)findViewById(a.f.tinyapp_name_tv));
      this.ptt = ((Button)findViewById(a.f.tinyapp_button));
      this.pts = findViewById(a.f.tinyapp_info_touch_mask);
      this.ptu.setVisibility(4);
      bPZ();
      bQa();
      bPY();
      if ((!bi.oW(this.ptc.pmH)) && (!bi.oW(this.ptc.pmI))) {
        ((TextView)findViewById(a.f.pay_succ_wording_tip)).setText(getString(a.i.wallet_bind_card_info_tip, new Object[] { this.ptc.pmH, this.ptc.pmI }));
      }
      return;
      this.ptm.setText(str);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBindCardResultUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBindCardResultUI", "do query pay arawrd");
      a(new com.tencent.mm.plugin.wallet_core.c.x(this.pth.pjF, this.pth.pwm, this.pth.pwn, this.pth.pwo, this.pth.pqh, this.pth.pwp, this.ptc.lMV, this.ptc.pmJ, this.ptc.pmK, this.ptc.pmK), true, true);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (d.fR(21))
    {
      if (!d.fR(23)) {
        break label164;
      }
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      ux(4);
      com.tencent.mm.wallet_core.a.af(this);
      this.mCn = ((PayInfo)this.sy.getParcelable("key_pay_info"));
      this.sy.getInt("key_pay_type", -1);
      BindCardOrder localBindCardOrder = (BindCardOrder)this.sy.getParcelable("key_bindcard_value_result");
      paramBundle = localBindCardOrder;
      if (localBindCardOrder == null) {
        paramBundle = new BindCardOrder();
      }
      this.ptc = paramBundle;
      ux(0);
      initView();
      this.pty = cDK();
      bPZ();
      gP(1);
      jr(1979);
      com.tencent.mm.sdk.b.a.sFg.b(this.lLY);
      this.ptx = true;
      return;
      label164:
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.i.wallet_order_info_phone), getResources().getStringArray(a.b.wallet_phone_call), "", new h.c()
    {
      public final void ju(int paramAnonymousInt)
      {
        switch (paramAnonymousInt)
        {
        default: 
          return;
        }
        Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletBindCardResultUI.i(WalletBindCardResultUI.this)));
        localIntent.addFlags(268435456);
        WalletBindCardResultUI.this.startActivity(localIntent);
      }
    });
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.sFg.c(this.lLY);
    js(1979);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      done();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBindCardResultUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s", new Object[] { Boolean.valueOf(this.ptx), this.ptk, Boolean.valueOf(this.ptv), Boolean.valueOf(this.ptw), this.ptg });
    if (this.ptx) {
      this.ptx = false;
    }
    do
    {
      return;
      if ((this.ptk != null) && (this.ptw))
      {
        a(new com.tencent.mm.plugin.wallet_core.c.x(this.ptk.pmM.pji, this.ptk.pmM.poC, this.ptk.pmM.poD, this.ptk.pmM.poE, this.ptk.pmM.poB, this.ptk.pmM.poF, this.ptc.lMV, this.ptc.pmJ, this.ptc.pmK, this.ptc.pmK), true, true);
        return;
      }
    } while ((!this.ptv) || (this.ptg == null));
    a(new com.tencent.mm.plugin.wallet_core.c.x(this.ptc.pmM.pji, this.ptc.pmM.poC, this.ptc.pmM.poD, this.ptc.pmM.poE, this.ptc.pmM.poF, this.ptc.pmM.poB, this.ptc.lMV, this.ptc.pmJ, this.ptc.pmK, this.ptc.pmK), true, true);
  }
  
  public final void ux(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */