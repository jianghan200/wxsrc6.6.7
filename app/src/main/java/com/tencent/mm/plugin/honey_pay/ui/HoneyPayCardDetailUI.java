package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.alp;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

public class HoneyPayCardDetailUI
  extends HoneyPayBaseUI
{
  private int fdx;
  private ImageView hVP;
  private String kkc;
  private TextView kkg;
  private TextView kkh;
  private TextView kki;
  private TextView kkj;
  private TextView kkk;
  private TextView kkl;
  private RelativeLayout kkm;
  private CdnImageView kkn;
  private TextView kko;
  private Button kkp;
  private bdk kkq;
  private alp kkr;
  
  private void aWe()
  {
    if (this.kkq.rIz == null) {}
    amp localamp;
    do
    {
      do
      {
        return;
        localamp = this.kkq.rIz;
        setMMTitle(localamp.hwg);
        this.kkg.setText(localamp.rPr);
        i = localamp.state;
        if (i != 2) {
          break;
        }
        this.hVP.setImageResource(a.e.wallet_success);
        if (!bi.oW(localamp.rPn))
        {
          localamp.rPn = c.dn(localamp.rPn, this.kkq.rIz.qYy);
          this.kkh.setText(j.a(this, localamp.rPn, (int)this.kkh.getTextSize(), null));
        }
        findViewById(a.f.hpcd_divider_view).setVisibility(8);
        findViewById(a.f.hpcd_first_date_layout).setVisibility(8);
        findViewById(a.f.hpcd_second_date_layout).setVisibility(8);
      } while (this.kkr == null);
      this.kkm.setVisibility(0);
      this.kkn.setUrl(this.kkr.bWP);
      this.kko.setText(this.kkr.rOe);
      this.kkp.setText(this.kkr.rOd);
      this.kkp.setOnClickListener(new HoneyPayCardDetailUI.4(this));
      return;
      if (i == 3)
      {
        this.hVP.setImageResource(a.h.remittance_timed_out);
        if (!bi.oW(localamp.rPn)) {
          this.kkh.setText(localamp.rPn);
        }
        this.kki.setText(a.i.honey_pay_receive_date_title_text);
        this.kkj.setText(a.i.honey_pay_return_date_title_text);
        this.kkk.setText(c.dL(this.kkq.rIz.create_time));
        this.kkl.setText(c.dL(this.kkq.rIz.huK));
        return;
      }
    } while (i != 4);
    this.hVP.setImageResource(a.h.remittance_timed_out);
    int i = this.kkq.rIz.rPq;
    if (!bi.oW(localamp.rPn)) {
      this.kkh.setText(j.c(this, localamp.rPn, (int)this.kkh.getTextSize()));
    }
    this.kki.setText(a.i.honey_pay_release_date_title_text);
    this.kkk.setText(c.dL(this.kkq.rIz.rPp));
    findViewById(a.f.hpcd_second_date_layout).setVisibility(8);
  }
  
  private void aWf()
  {
    com.tencent.mm.plugin.honey_pay.a.m localm = new com.tencent.mm.plugin.honey_pay.a.m(this.kkc);
    localm.m(this);
    a(localm, true, false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.honey_pay.a.m))
    {
      paramString = (com.tencent.mm.plugin.honey_pay.a.m)paraml;
      paramString.a(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          HoneyPayCardDetailUI.a(HoneyPayCardDetailUI.this, paramString.kjN);
          HoneyPayCardDetailUI.a(HoneyPayCardDetailUI.this);
        }
      }).b(new HoneyPayCardDetailUI.2(this)).c(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl) {}
      });
    }
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.honey_pay_card_detail_ui;
  }
  
  protected final void initView()
  {
    this.hVP = ((ImageView)findViewById(a.f.hpcd_top_image_iv));
    this.kkg = ((TextView)findViewById(a.f.hpcd_state_tv));
    this.kkh = ((TextView)findViewById(a.f.hpcd_state_tip_tv));
    this.kkk = ((TextView)findViewById(a.f.hpcd_first_date_tv));
    this.kkl = ((TextView)findViewById(a.f.hpcd_second_date_tv));
    this.kki = ((TextView)findViewById(a.f.hpcd_first_date_title_tv));
    this.kkj = ((TextView)findViewById(a.f.hpcd_second_date_title_tv));
    this.kkm = ((RelativeLayout)findViewById(a.f.hpcd_oper_layout));
    this.kkn = ((CdnImageView)findViewById(a.f.hpcd_oper_icon_iv));
    this.kko = ((TextView)findViewById(a.f.hpcd_oper_desc_tv));
    this.kkp = ((Button)findViewById(a.f.hpcd_oper_btn));
    this.kkh.setClickable(true);
    this.kkh.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.kjV = a.c.honey_pay_grey_bg_2;
    super.onCreate(paramBundle);
    jr(2613);
    this.fdx = getIntent().getIntExtra("key_scene", 0);
    this.kkc = getIntent().getStringExtra("key_card_no");
    initView();
    if (this.fdx == 0)
    {
      aWf();
      return;
    }
    paramBundle = getIntent().getByteArrayExtra("key_qry_response");
    try
    {
      this.kkq = new bdk();
      this.kkq.aG(paramBundle);
      aWe();
      return;
    }
    catch (IOException paramBundle)
    {
      x.printErrStackTrace(this.TAG, paramBundle, "", new Object[0]);
      aWf();
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2613);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */