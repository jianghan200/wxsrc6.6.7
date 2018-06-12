package com.tencent.mm.plugin.wallet.balance.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletBalanceResultUI
  extends WalletBaseUI
{
  protected Button eWk;
  protected TextView kLE;
  public Orders mCZ;
  public TextView muz;
  protected TextView onV;
  public TextView paF;
  protected TextView paG;
  public CheckBox paH;
  public Bankcard paI;
  
  private void bMY()
  {
    if ((this.paH.getVisibility() == 0) && (this.paH.isChecked()))
    {
      int i = this.sy.getInt("key_pay_flag", 0);
      String str1 = this.sy.getString("key_pwd1");
      String str2 = this.sy.getString("key_verify_code");
      PayInfo localPayInfo = (PayInfo)this.sy.getParcelable("key_pay_info");
      a(new com.tencent.mm.plugin.wallet.balance.a.a(i, str1, str2, localPayInfo.bOd, localPayInfo.bVY), true, true);
      return;
    }
    bMZ();
  }
  
  public void aL()
  {
    Object localObject;
    if (this.mCZ != null)
    {
      this.paF.setText(e.e(this.mCZ.mBj, this.mCZ.lNV));
      if ((this.mCZ.ppf != null) && (this.mCZ.ppf.size() > 0))
      {
        localObject = (Orders.Commodity)this.mCZ.ppf.get(0);
        if (bi.oW(((Orders.Commodity)localObject).ppy)) {
          break label200;
        }
        this.muz.setText(((Orders.Commodity)localObject).lNT + " " + getString(a.i.wallet_pay_bankcard_tail) + ((Orders.Commodity)localObject).ppy);
      }
    }
    for (;;)
    {
      if ((cDK() instanceof b))
      {
        if (this.mCZ.mxE <= 0.0D) {
          break;
        }
        findViewById(a.f.wallet_balance_result_fetch_fee_title).setVisibility(0);
        localObject = (TextView)findViewById(a.f.wallet_balance_result_fetch_fee);
        ((TextView)localObject).setText(e.e(this.mCZ.mxE, this.mCZ.lNV));
        ((TextView)localObject).setVisibility(0);
      }
      return;
      label200:
      this.muz.setText(((Orders.Commodity)localObject).lNT);
    }
    x.i("MicroMsg.WalletBalanceResultUI", "fetch_fee is 0");
  }
  
  public final void bMZ()
  {
    if (!cDL().m(new Object[] { this.mCZ })) {
      super.bMZ();
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof com.tencent.mm.plugin.wallet.balance.a.a)))
    {
      p.bNp();
      p.bNq().prH = bi.VE();
      paramString = new sz();
      paramString.cdR.scene = 15;
      paramString.bJX = new Runnable()
      {
        public final void run()
        {
          x.i("MicroMsg.WalletBalanceResultUI", "update user info succ, end process");
        }
      };
      com.tencent.mm.sdk.b.a.sFg.m(paramString);
      bMZ();
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_balance_result_ui;
  }
  
  public void initView()
  {
    setMMTitle((String)cDL().ui(0));
    this.onV = ((TextView)findViewById(a.f.wallet_balance_result_desc));
    this.onV.setText(cDL().ui(1));
    this.paG = ((TextView)findViewById(a.f.wallet_balance_result_time_title));
    this.kLE = ((TextView)findViewById(a.f.wallet_balance_result_time));
    Object localObject = cDL().ui(2);
    if (!bi.K((CharSequence)localObject))
    {
      this.paG.setVisibility(0);
      this.kLE.setVisibility(0);
      this.kLE.setText((CharSequence)localObject);
      localObject = (ImageView)findViewById(a.f.wallet_balance_result_logo);
      int i = this.sy.getInt("key_balance_result_logo", -1);
      if (i <= 0) {
        break label312;
      }
      ((ImageView)localObject).setImageResource(i);
      label144:
      this.muz = ((TextView)findViewById(a.f.wallet_balance_result_bankcard));
      this.paF = ((TextView)findViewById(a.f.wallet_balance_result_total_fee));
      localObject = (TextView)findViewById(a.f.wallet_balance_result_total_fee_title);
      if ((cDK() instanceof b)) {
        ((TextView)localObject).setText(getString(a.i.wallet_balance_result_total_fee_fetch));
      }
      this.paH = ((CheckBox)findViewById(a.f.bind_cb));
      this.paI = ((Bankcard)this.sy.getParcelable("key_bankcard"));
      if (this.paI == null) {
        break label322;
      }
      this.paH.setVisibility(8);
    }
    for (;;)
    {
      this.eWk = ((Button)findViewById(a.f.next_btn));
      this.eWk.setOnClickListener(new WalletBalanceResultUI.1(this));
      showHomeBtn(false);
      enableBackMenu(false);
      return;
      this.paG.setVisibility(8);
      this.kLE.setVisibility(8);
      break;
      label312:
      ((ImageView)localObject).setImageResource(a.h.remittance_received);
      break label144;
      label322:
      this.paH.setVisibility(0);
    }
  }
  
  public void onBackPressed() {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
    initView();
    aL();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */