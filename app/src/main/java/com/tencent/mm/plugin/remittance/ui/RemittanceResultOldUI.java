package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.remittance.a.b;
import com.tencent.mm.plugin.remittance.model.ab;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class RemittanceResultOldUI
  extends RemittanceResultUI
{
  private Orders mCZ;
  private String mDa;
  private boolean mDc;
  private int myU;
  
  private void brF()
  {
    if (this.sy.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.sy.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
        localBundle.putString("realname_verify_process_jump_plugin", "remittance");
        localRealnameGuideHelper.b(this, localBundle, new RemittanceResultOldUI.2(this));
        this.sy.remove("key_realname_guide_helper");
      }
      return;
    }
    brG();
  }
  
  private void brG()
  {
    cDK().b(this, this.sy);
    new ag().postDelayed(new Runnable()
    {
      public final void run()
      {
        if ((RemittanceResultOldUI.c(RemittanceResultOldUI.this) == 33) || (RemittanceResultOldUI.c(RemittanceResultOldUI.this) == 32))
        {
          RemittanceResultOldUI.this.finish();
          return;
        }
        if ((!bi.oW(RemittanceResultOldUI.d(RemittanceResultOldUI.this))) && (!RemittanceResultOldUI.e(RemittanceResultOldUI.this)))
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("Chat_User", RemittanceResultOldUI.d(RemittanceResultOldUI.this));
          localIntent.putExtra("finish_direct", false);
          d.e(RemittanceResultOldUI.this, ".ui.chatting.ChattingUI", localIntent);
          return;
        }
        RemittanceResultOldUI.this.finish();
      }
    }, 100L);
  }
  
  protected final boolean brH()
  {
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.remittance_result_ui;
  }
  
  protected final void initView()
  {
    int k = 1;
    boolean bool = false;
    setMMTitle(getString(a.i.remittance_result_title));
    setBackBtn(null);
    showHomeBtn(false);
    enableBackMenu(false);
    Object localObject1 = (TextView)findViewById(a.f.remittance_result_fee);
    if (this.mCZ != null) {
      ((TextView)localObject1).setText(com.tencent.mm.wallet_core.ui.e.e(this.mCZ.mBj, this.mCZ.lNV));
    }
    Object localObject3 = (PayInfo)this.sy.getParcelable("key_pay_info");
    if (localObject3 == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RemittanceResultOldUI", "payInfo is null!!!");
      finish();
      return;
    }
    localObject1 = "";
    if (((PayInfo)localObject3).qUL != null)
    {
      this.mDc = ((PayInfo)localObject3).qUL.getBoolean("extinfo_key_4");
      localObject1 = ((PayInfo)localObject3).qUL.getString("extinfo_key_1");
    }
    int i = ((PayInfo)localObject3).bVY;
    this.myU = i;
    this.mDa = ((String)localObject1);
    Object localObject2 = com.tencent.mm.wallet_core.ui.e.gT((String)localObject1);
    if (i == 31)
    {
      localObject1 = (TextView)findViewById(a.f.remittance_result_receiver_desc);
      localObject2 = getString(a.i.remittance_result_receiver_desc, new Object[] { localObject2 });
      if (!bi.oW((String)localObject2))
      {
        ((TextView)localObject1).setText(j.a(this, (CharSequence)localObject2, ((TextView)localObject1).getTextSize()));
        ((TextView)localObject1).setVisibility(0);
      }
      for (;;)
      {
        findViewById(a.f.remittance_result_f2f_area).setVisibility(8);
        if (this.mCZ.mxE > 0.0D)
        {
          localObject1 = getResources().getString(a.i.remittance_result_charge_info, new Object[] { com.tencent.mm.wallet_core.ui.e.e(this.mCZ.mxE, this.mCZ.lNV) });
          ((TextView)findViewById(a.f.charge_fee)).setText((CharSequence)localObject1);
          findViewById(a.f.charge_fee_container).setVisibility(0);
        }
        label317:
        ((Button)findViewById(a.f.remittance_result_next_btn)).setOnClickListener(new RemittanceResultOldUI.1(this));
        g.Ek();
        localObject1 = g.Ei().DT().get(aa.a.sQv, Boolean.valueOf(false));
        if (localObject1 != null) {
          bool = ((Boolean)localObject1).booleanValue();
        }
        if (!bool) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultOldUI", "has show the finger print auth guide!");
        return;
        ((TextView)localObject1).setVisibility(8);
      }
    }
    localObject1 = "";
    if (((PayInfo)localObject3).qUL != null) {
      localObject1 = ((PayInfo)localObject3).qUL.getString("extinfo_key_2");
    }
    if ((i != 32) && (i != 33)) {
      if (!bi.oW((String)localObject1))
      {
        localObject1 = com.tencent.mm.wallet_core.ui.e.abZ((String)localObject1);
        localObject1 = (String)localObject2 + "（" + (String)localObject1 + "）";
      }
    }
    for (;;)
    {
      label485:
      localObject2 = (TextView)findViewById(a.f.remittance_result_receiver_desc);
      label541:
      TextView localTextView;
      String str1;
      if (!bi.oW((String)localObject1))
      {
        ((TextView)localObject2).setText(j.a(this, getString(a.i.remittance_result_payer_desc, new Object[] { localObject1 }), ((TextView)localObject2).getTextSize()));
        ((TextView)localObject2).setVisibility(0);
        if ((i != 33) && (i != 32)) {
          break label863;
        }
        localObject1 = findViewById(a.f.remittance_result_f2f_recv_desc_area);
        localObject2 = (TextView)findViewById(a.f.remittance_result_f2f_recv_desc_title);
        localTextView = (TextView)findViewById(a.f.remittance_result_f2f_recv_desc);
        str1 = ((PayInfo)localObject3).qUL.getString("extinfo_key_3");
        String str2 = ((PayInfo)localObject3).qUL.getString("extinfo_key_8");
        if (bi.oW(str1)) {
          break label839;
        }
        localTextView.setText(j.a(this, str1, localTextView.getTextSize()));
        ((View)localObject1).setVisibility(0);
        if (bi.oW(str2)) {
          break label1016;
        }
        ((TextView)localObject2).setText(str2);
        i = 1;
      }
      for (;;)
      {
        label659:
        localObject1 = findViewById(a.f.remittance_result_f2f_payer_desc_area);
        localObject2 = (TextView)findViewById(a.f.remittance_result_f2f_payer_desc_title);
        localTextView = (TextView)findViewById(a.f.remittance_result_f2f_payer_desc);
        str1 = ((PayInfo)localObject3).qUL.getString("extinfo_key_6");
        localObject3 = ((PayInfo)localObject3).qUL.getString("extinfo_key_7");
        if (!bi.oW((String)localObject3))
        {
          localTextView.setText(j.a(this, (CharSequence)localObject3, localTextView.getTextSize()));
          localTextView.setVisibility(0);
          j = k;
          if (!bi.oW(str1)) {
            ((TextView)localObject2).setText(j.a(this, str1, ((TextView)localObject2).getTextSize()));
          }
        }
        for (int j = k;; j = 0)
        {
          if ((i != 0) || (j != 0)) {
            break label861;
          }
          findViewById(a.f.remittance_result_f2f_area).setVisibility(8);
          break;
          localObject1 = (String)localObject2 + getString(a.i.remittance_without_realname_title);
          break label485;
          ((TextView)localObject2).setVisibility(8);
          break label541;
          label839:
          ((View)localObject1).setVisibility(8);
          i = 0;
          break label659;
          ((View)localObject1).setVisibility(8);
        }
        label861:
        break label317;
        label863:
        if ((i != 5) || (this.mCZ.ppf == null) || (this.mCZ.ppf.get(0) == null) || (TextUtils.isEmpty(((Orders.Commodity)this.mCZ.ppf.get(0)).lNK))) {
          break label317;
        }
        ((TextView)localObject2).setText(((Orders.Commodity)this.mCZ.ppf.get(0)).lNK);
        break label317;
        localObject2 = com.tencent.mm.wallet_core.a.af(this);
        localObject1 = new Bundle();
        if (localObject2 != null) {
          localObject1 = ((c)localObject2).jfZ;
        }
        if (TextUtils.isEmpty(((Bundle)localObject1).getString("key_pwd1")))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultOldUI", "pwd is empty, not show the finger print auth guide!");
          return;
        }
        if (localObject2 == null) {
          break;
        }
        ((c)localObject2).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", (Bundle)localObject1);
        return;
        label1016:
        i = 1;
      }
      localObject1 = localObject2;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
    initView();
    if (this.myU == 31)
    {
      paramBundle = "";
      if (this.mCZ.ppf.size() > 0) {
        paramBundle = ((Orders.Commodity)this.mCZ.ppf.get(0)).bOe;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceResultOldUI", "transId: %s", new Object[] { paramBundle });
      b.bqQ().bqT().en(paramBundle, this.mDa);
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      brF();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */