package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.honey_pay.a.m;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class HoneyPayProxyUI
  extends HoneyPayBaseUI
{
  private String kkc;
  private boolean klL;
  
  protected final void aWd() {}
  
  protected final boolean aWj()
  {
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.honey_pay.a.l))
    {
      paramString = (com.tencent.mm.plugin.honey_pay.a.l)paraml;
      paramString.a(new HoneyPayProxyUI.3(this, paramString)).b(new HoneyPayProxyUI.2(this)).c(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ab.l paramAnonymousl) {}
      });
    }
    for (;;)
    {
      return true;
      if ((paraml instanceof m))
      {
        paramString = (m)paraml;
        paramString.a(new h.a()
        {
          public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ab.l paramAnonymousl)
          {
            x.i(HoneyPayProxyUI.this.TAG, "state: %s", new Object[] { Integer.valueOf(paramString.kjN.rIz.state) });
            if (paramString.kjN.rIz.state == 1) {
              HoneyPayProxyUI.a(HoneyPayProxyUI.this, paramString.kjN);
            }
            for (;;)
            {
              HoneyPayProxyUI.this.finish();
              return;
              HoneyPayProxyUI.b(HoneyPayProxyUI.this, paramString.kjN);
            }
          }
        }).b(new HoneyPayProxyUI.5(this)).c(new HoneyPayProxyUI.4(this));
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(2876);
    jr(2613);
    this.klL = getIntent().getBooleanExtra("key_is_payer", false);
    this.kkc = getIntent().getStringExtra("key_card_no");
    x.i(this.TAG, "is payer: %s", new Object[] { Boolean.valueOf(this.klL) });
    if (this.klL)
    {
      x.i(this.TAG, "do qry payer detail");
      paramBundle = new com.tencent.mm.plugin.honey_pay.a.l(this.kkc);
      paramBundle.m(this);
      a(paramBundle, true, false);
      return;
    }
    paramBundle = new m(this.kkc);
    paramBundle.m(this);
    a(paramBundle, true, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2876);
    js(2613);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */