package com.tencent.mm.plugin.wallet_payu.order.ui;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_payu.order.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.azz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class PayUMallOrderDetailUI
  extends WalletBaseUI
{
  private TextView glY;
  private TextView kLE;
  private String lJJ = "";
  private TextView mzG;
  private azz pEZ;
  private LinearLayout pFa;
  private LinearLayout pFb;
  private LinearLayout pFc;
  private LinearLayout pFd;
  private LinearLayout pFe;
  private LinearLayout pFf;
  private LinearLayout pFg;
  private TextView pFh;
  private TextView pFi;
  private TextView pFj;
  private TextView pFk;
  
  private void bRm()
  {
    if (this.pEZ == null) {
      return;
    }
    if (!bi.oW(this.pEZ.lOE))
    {
      this.pFa.setVisibility(0);
      this.pFh.setText(this.pEZ.lOE);
      label43:
      if (bi.oW(this.pEZ.lOO)) {
        break label291;
      }
      this.pFb.setVisibility(0);
      this.pFi.setText(this.pEZ.lOO);
      label78:
      if (bi.oW(this.pEZ.lOG)) {
        break label303;
      }
      this.pFc.setVisibility(0);
      this.pFj.setText(this.pEZ.lOG);
      label113:
      if (bi.oW(this.pEZ.lOK)) {
        break label315;
      }
      this.pFd.setVisibility(0);
      this.mzG.setText(e.e(this.pEZ.scI / 100.0D, this.pEZ.lOK));
      label163:
      if (this.pEZ.lOH < 0) {
        break label327;
      }
      this.pFe.setVisibility(0);
      this.kLE.setText(e.hb(this.pEZ.lOH));
      label198:
      if (bi.oW(this.pEZ.lOI)) {
        break label339;
      }
      this.pFf.setVisibility(0);
      this.glY.setText(this.pEZ.lOI);
    }
    for (;;)
    {
      switch (this.pEZ.lOM)
      {
      case 4: 
      default: 
        this.pFk.setText(a.i.wallet_payu_detail_type_reserve);
        return;
        this.pFa.setVisibility(8);
        break label43;
        label291:
        this.pFb.setVisibility(8);
        break label78;
        label303:
        this.pFc.setVisibility(8);
        break label113;
        label315:
        this.pFd.setVisibility(8);
        break label163;
        label327:
        this.pFe.setVisibility(8);
        break label198;
        label339:
        this.pFf.setVisibility(8);
      }
    }
    this.pFk.setText(a.i.wallet_balance_manager_save);
    return;
    this.pFk.setText(a.i.wallet_index_ui_transfer);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof c))
      {
        this.pEZ = ((c)paraml).pEY;
        bRm();
      }
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.payu_mall_order_info_detail;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1520);
    this.lJJ = this.sy.getString("key_trans_id");
    if (bi.oW(this.lJJ))
    {
      x.e("MicroMsg.PayUMallOrderDetailUI", "hy: trans id is null");
      finish();
    }
    a(new c(this.lJJ), true, true);
    this.pFa = ((LinearLayout)findViewById(a.f.detail_transid));
    this.pFb = ((LinearLayout)findViewById(a.f.detail_appname));
    this.pFc = ((LinearLayout)findViewById(a.f.detail_goodsname));
    this.pFd = ((LinearLayout)findViewById(a.f.detail_moneyspent));
    this.pFe = ((LinearLayout)findViewById(a.f.detail_time));
    this.pFf = ((LinearLayout)findViewById(a.f.detail_status));
    this.pFg = ((LinearLayout)findViewById(a.f.detail_type));
    this.pFh = ((TextView)findViewById(a.f.detail_transid_tv));
    this.pFi = ((TextView)findViewById(a.f.detail_appname_tv));
    this.pFj = ((TextView)findViewById(a.f.detail_goodsname_tv));
    this.mzG = ((TextView)findViewById(a.f.detail_moneyspent_tv));
    this.kLE = ((TextView)findViewById(a.f.detail_time_tv));
    this.glY = ((TextView)findViewById(a.f.detail_status_tv));
    this.pFk = ((TextView)findViewById(a.f.detail_type_tv));
    bRm();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1520);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */