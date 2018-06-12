package com.tencent.mm.plugin.wallet.bind.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

public class WalletBankcardDetailUI
  extends WalletBaseUI
{
  public Bankcard paI;
  protected TextView pcR;
  private TextView pcS;
  private View pcT;
  protected LinearLayout pcU;
  protected LinearLayout pcV;
  protected LinearLayout pcW;
  
  private void jj(boolean paramBoolean)
  {
    if ((!q.GS()) && (!paramBoolean) && (!((com.tencent.mm.plugin.walletlock.a.b)g.l(com.tencent.mm.plugin.walletlock.a.b.class)).bRp()))
    {
      e.He(0);
      h.a(this, a.i.wallet_bankcard_detail_unbind_dialog_tip, -1, a.i.wallet_bankcard_detail_unbind_dialog_open_gesture, a.i.wallet_bankcard_detail_unbind_dialog_unbind_btn, true, new WalletBankcardDetailUI.6(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          WalletBankcardDetailUI.b(WalletBankcardDetailUI.this);
          e.He(2);
        }
      });
      return;
    }
    this.sy.putBoolean("offline_pay", false);
    com.tencent.mm.wallet_core.a.j(this, this.sy);
  }
  
  public final void bNg()
  {
    this.pcU.setVisibility(0);
    this.pcV.setVisibility(8);
    ((TextView)findViewById(a.f.wallet_bankcard_detail_expired_bankphone)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        WalletBankcardDetailUI.this.showDialog(0);
      }
    });
    ((TextView)findViewById(a.f.wallet_bankcard_detail_unbind)).setOnClickListener(new WalletBankcardDetailUI.4(this));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof com.tencent.mm.plugin.wallet.bind.a.b)) {
        if (this.pcR != null) {
          this.pcR.setVisibility(0);
        }
      }
    }
    while (!(paraml instanceof com.tencent.mm.plugin.wallet.bind.a.a))
    {
      do
      {
        return false;
      } while (!(paraml instanceof com.tencent.mm.plugin.wallet.bind.a.a));
      paramString = (com.tencent.mm.plugin.wallet.bind.a.a)paraml;
      x.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo succ and level = " + paramString.pcr);
      switch (paramString.pcr)
      {
      default: 
        jj(false);
        return false;
      }
      paramInt1 = paramString.pcr;
      h.a(this, paramString.pcs, null, false, new WalletBankcardDetailUI.9(this, paramInt1));
      return false;
    }
    x.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo error");
    jj(false);
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_bankcard_detail;
  }
  
  protected final void initView()
  {
    this.paI = ((Bankcard)this.sy.getParcelable("key_bankcard"));
    if (this.paI == null) {
      return;
    }
    this.pcU = ((LinearLayout)findViewById(a.f.wallet_bankcard_detail_expired));
    this.pcV = ((LinearLayout)findViewById(a.f.wallet_bankcard_detail_ll));
    this.pcW = ((LinearLayout)findViewById(a.f.wallet_bankcard_detail_international_ll));
    this.pcS = ((TextView)findViewById(a.f.wallet_bankcard_detail_finance));
    this.pcT = findViewById(a.f.wallet_bankcard_detail_repay_layout);
    this.pcT.setOnClickListener(new WalletBankcardDetailUI.1(this));
    if (1 == this.paI.field_bankcardState)
    {
      bNg();
      return;
    }
    String str;
    if (this.paI.bOv())
    {
      ji(true);
      this.pcR = ((TextView)findViewById(a.f.wallet_bankcard_detail_default));
      p.bNp();
      p.bNq();
      str = this.paI.field_bindSerial;
      this.pcR.setVisibility(8);
    }
    for (;;)
    {
      addIconOptionMenu(0, a.e.mm_title_btn_menu, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          p.bNp();
          paramAnonymousMenuItem = p.bNq().bPD();
          if ((paramAnonymousMenuItem != null) && (paramAnonymousMenuItem.size() > 1))
          {
            p.bNp();
            p.bNq();
            paramAnonymousMenuItem = WalletBankcardDetailUI.this.paI.field_bindSerial;
          }
          paramAnonymousMenuItem = new ArrayList();
          h.a(WalletBankcardDetailUI.this, null, (String[])paramAnonymousMenuItem.toArray(new String[paramAnonymousMenuItem.size()]), WalletBankcardDetailUI.this.getString(a.i.wallet_index_ui_unbind_bankcard), false, new WalletBankcardDetailUI.5.1(this));
          return true;
        }
      });
      return;
      ji(false);
      this.pcR = ((TextView)findViewById(a.f.wallet_bankcard_detail_international_default));
      p.bNp();
      p.bNq();
      str = this.paI.field_bindSerial;
      this.pcR.setVisibility(8);
    }
  }
  
  public final void ji(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.pcU.setVisibility(8);
      this.pcV.setVisibility(0);
      ((TextView)findViewById(a.f.wallet_bankcard_detail_bankphone)).setOnClickListener(new WalletBankcardDetailUI.2(this));
      TextView localTextView1 = (TextView)findViewById(a.f.wallet_bankcard_detail_per_order_kind);
      TextView localTextView2 = (TextView)findViewById(a.f.wallet_bankcard_detail_per_order_virtual);
      TextView localTextView3 = (TextView)findViewById(a.f.wallet_bankcard_detail_per_day_kind);
      TextView localTextView4 = (TextView)findViewById(a.f.wallet_bankcard_detail_per_day_virtual);
      localTextView1.setText(e.e(this.paI.field_onceQuotaKind, null));
      localTextView2.setText(e.e(this.paI.field_onceQuotaVirtual, null));
      localTextView3.setText(e.e(this.paI.field_dayQuotaKind, null));
      localTextView4.setText(e.e(this.paI.field_dayQuotaVirtual, null));
      if (!bi.oW(this.paI.field_repay_url))
      {
        this.pcS.setVisibility(0);
        this.pcT.setVisibility(0);
      }
      return;
    }
    this.pcU.setVisibility(8);
    this.pcV.setVisibility(8);
    this.pcW.setVisibility(0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(621);
    setMMTitle(a.i.wallet_bankcard_detail_title);
    initView();
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    return h.a(this.mController.tml, getString(a.i.wallet_bankcard_detail_bankphone_tips), getResources().getStringArray(a.b.wallet_phone_call), "", new WalletBankcardDetailUI.8(this));
  }
  
  public void onDestroy()
  {
    js(621);
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */