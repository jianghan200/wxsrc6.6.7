package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.g.a.sy.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.remittance.model.v;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class RemittanceUI
  extends RemittanceBaseUI
{
  public void a(String paramString1, String paramString2, String paramString3, fo paramfo)
  {
    if (this.myP != null) {
      this.myP.i(3, new Object[] { Integer.valueOf(this.myU), Double.valueOf(this.myQ) });
    }
    int i = getIntent().getIntExtra("pay_channel", -1);
    String str = "";
    Object localObject = str;
    if (!bi.G(new String[0]))
    {
      g.Ek();
      localObject = ((i)g.l(i.class)).FR().Ye(this.cYO);
      if (localObject != null) {
        localObject = ((ab)localObject).BL();
      }
    }
    else
    {
      if (!bi.oW(paramString3)) {
        break label240;
      }
    }
    label240:
    for (this.mzs = true;; this.mzs = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceUI", "doSceneGenRemittance, channel: %s", new Object[] { Integer.valueOf(i) });
      paramString1 = new v(this.myQ, "1", this.cYO, this.mzk, this.myU, this.fdx, paramString1, paramString2, this.myV, i, this.mzp, paramString3, this.myR, (String)localObject, this.mzk, paramfo);
      paramString1.dox = "RemittanceProcess";
      a(paramString1, true, true);
      return;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RemittanceUI", "can not found contact for user::" + this.cYO);
      localObject = str;
      break;
    }
  }
  
  public final void brm()
  {
    if (brv())
    {
      g.Ek();
      this.mzl = ((String)g.Ei().DT().get(aa.a.sVi, ""));
      g.Ek();
      this.mzm = ((String)g.Ei().DT().get(aa.a.sVm, ""));
      g.Ek();
      this.mzn = ((Integer)g.Ei().DT().get(aa.a.sVn, Integer.valueOf(0))).intValue();
      if ((!bi.oW(this.mzl)) && (!bi.oW(this.mzm))) {
        break label138;
      }
      ae.a(true, null);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RemittanceUI", "do before transfer");
      a(new com.tencent.mm.plugin.remittance.model.e(this.cYO), false, false);
      return;
      label138:
      ae.a(false, null);
    }
  }
  
  public final void brp()
  {
    com.tencent.mm.ui.base.s.makeText(this.mController.tml, a.i.remittance_amount_lowest_limit, 0).show();
  }
  
  public final void brs()
  {
    final sy localsy = new sy();
    localsy.cdO.buF = "7";
    localsy.bJX = new Runnable()
    {
      public final void run()
      {
        if (!bi.oW(localsy.cdP.cdQ))
        {
          com.tencent.mm.wallet_core.ui.e.a((TextView)RemittanceUI.this.findViewById(a.f.banner_tips), localsy.cdP.cdQ, localsy.cdP.content, localsy.cdP.url);
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceUI", "no bulletin data");
      }
    };
    com.tencent.mm.sdk.b.a.sFg.m(localsy);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.remittance.model.e))
    {
      paramString = (com.tencent.mm.plugin.remittance.model.e)paraml;
      paramString.a(new RemittanceUI.3(this, paramString)).b(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RemittanceUI", "before transfer: %s, %s, %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        }
      }).c(new RemittanceUI.1(this, paramString));
      return true;
    }
    return super.d(paramInt1, paramInt2, paramString, paraml);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.mEJ.h(15386, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    jr(2783);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2783);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */