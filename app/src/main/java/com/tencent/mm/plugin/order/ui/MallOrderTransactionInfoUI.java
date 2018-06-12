package com.tencent.mm.plugin.order.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.plugin.order.ui.a.b;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;
import com.tencent.mm.wallet_core.ui.c;
import java.util.List;

public class MallOrderTransactionInfoUI
  extends WalletPreferenceUI
{
  protected f gua;
  private int lQa;
  private MallTransactionObject lQb = null;
  private c lQc;
  
  private Bundle bmD()
  {
    Bundle localBundle2 = com.tencent.mm.wallet_core.a.ae(this);
    Bundle localBundle1 = localBundle2;
    if (localBundle2 == null) {
      localBundle1 = new Bundle();
    }
    return localBundle1;
  }
  
  public final int Ys()
  {
    return a.l.mall_order_preference;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.mall_order_ui;
  }
  
  public final boolean h(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt1 == 0)
    {
      bool1 = bool2;
      if (paramInt2 == 0)
      {
        if ((paraml instanceof com.tencent.mm.plugin.order.model.h))
        {
          paramString = ((com.tencent.mm.plugin.order.model.h)paraml).lOC;
          if (paramString != null)
          {
            this.lQb = paramString.lNr;
            this.gua.removeAll();
            ActionBarActivity localActionBarActivity = this.mController.tml;
            f localf = this.gua;
            MallTransactionObject localMallTransactionObject = this.lQb;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = this.lQc;
            if (localMallTransactionObject == null)
            {
              paramString = null;
              if (paramString != null)
              {
                paramInt1 = 0;
                while (paramInt1 < paramString.size())
                {
                  paraml = (Preference)paramString.get(paramInt1);
                  this.gua.a(paraml);
                  paramInt1 += 1;
                }
              }
            }
            else
            {
              switch (localMallTransactionObject.lNG)
              {
              default: 
                paraml = new com.tencent.mm.plugin.order.ui.a.a();
                paramString = paraml;
                if ((arrayOfObject[0] instanceof c)) {
                  ((com.tencent.mm.plugin.order.ui.a.a)paraml).lQc = ((c)arrayOfObject[0]);
                }
                break;
              }
              for (paramString = paraml;; paramString = new b())
              {
                paramString = paramString.a(localActionBarActivity, localf, localMallTransactionObject);
                break;
              }
            }
            this.gua.notifyDataSetChanged();
          }
        }
        bool1 = true;
      }
    }
    return bool1;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.mall_order_detail_ui_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        MallOrderTransactionInfoUI.this.finish();
        return false;
      }
    });
    this.gua = this.tCL;
    this.lQc = new c(this);
    this.lQc.init();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.wallet_core.a.af(this);
    String str;
    if ((paramBundle != null) && ((paramBundle instanceof com.tencent.mm.plugin.order.a.a)))
    {
      str = bmD().getString("key_trans_id");
      paramBundle = bmD().getString("bill_id");
    }
    for (;;)
    {
      if (bi.oW(str))
      {
        x.w("MicroMsg.mmui.MMPreference", "mOrders info is Illegal!");
        com.tencent.mm.ui.base.h.a(this.mController.tml, a.i.wallet_order_info_err, 0, new MallOrderTransactionInfoUI.1(this));
      }
      this.lQa = bmD().getInt("key_pay_type");
      initView();
      cDP().a(new com.tencent.mm.plugin.order.model.h(str, paramBundle), true, 1);
      return;
      if ((getIntent().getIntExtra("scene", 0) == 1) || (getIntent().getIntExtra("scene", 0) == 2))
      {
        str = getIntent().getStringExtra("trans_id");
        paramBundle = getIntent().getStringExtra("bill_id");
      }
      else
      {
        paramBundle = null;
        str = null;
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.lQc != null) {
      this.lQc.release();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/order/ui/MallOrderTransactionInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */