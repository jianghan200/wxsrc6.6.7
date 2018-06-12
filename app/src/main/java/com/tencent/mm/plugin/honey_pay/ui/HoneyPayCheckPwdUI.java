package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.honey_pay.a.c;
import com.tencent.mm.plugin.honey_pay.a.d;
import com.tencent.mm.plugin.honey_pay.a.g;
import com.tencent.mm.plugin.honey_pay.a.n;
import com.tencent.mm.plugin.wallet_core.c.w;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.afg;
import com.tencent.mm.protocal.c.btd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.a;
import java.io.IOException;

public class HoneyPayCheckPwdUI
  extends HoneyPayBaseUI
{
  private int fdx;
  private TextView gsY;
  private String gtX;
  private TextView hVS;
  private EditHintPasswdView kkY;
  private String kkZ;
  private String kkc;
  private btd kkd;
  private String kla;
  private long klb;
  private int klc;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.HoneyPayCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paraml instanceof w))
    {
      paraml = (w)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        if (this.fdx == 1)
        {
          paramString = paraml.pjE;
          x.i("MicroMsg.HoneyPayCheckPwdUI", "do give card");
          aBy();
          paramString = new c(paramString, this.klb, this.gtX, this.kkZ, this.klc, this.kla);
          paramString.m(this);
          a(paramString, false, false);
        }
      }
    }
    do
    {
      do
      {
        do
        {
          return true;
          if (this.fdx == 2)
          {
            paramString = paraml.pjE;
            x.i("MicroMsg.HoneyPayCheckPwdUI", "do modify quota");
            aBy();
            paramString = new com.tencent.mm.plugin.honey_pay.a.h(this.klb, paramString, this.kkc);
            paramString.m(this);
            a(paramString, false, false);
            return true;
          }
        } while (this.fdx != 3);
        paramString = paraml.pjE;
        x.i("MicroMsg.HoneyPayCheckPwdUI", "do unbind: %s", new Object[] { this.kkc });
        aBy();
        paramString = new n(this.kkc, paramString);
        paramString.m(this);
        a(paramString, false, false);
        return true;
        if (this.kkY != null) {
          this.kkY.bqn();
        }
        bfe();
      } while ((paraml.uXo) || (bi.oW(paramString)));
      x.i("MicroMsg.HoneyPayCheckPwdUI", "show normal error msg");
      com.tencent.mm.ui.base.h.a(this.mController.tml, paramString, null, false, new HoneyPayCheckPwdUI.10(this));
      return true;
      if ((paraml instanceof c))
      {
        paramString = (c)paraml;
        bfe();
        paramString.a(new HoneyPayCheckPwdUI.13(this, paramString)).b(new HoneyPayCheckPwdUI.12(this)).c(new HoneyPayCheckPwdUI.11(this));
        return true;
      }
      if ((paraml instanceof com.tencent.mm.plugin.honey_pay.a.h))
      {
        bfe();
        paramString = (com.tencent.mm.plugin.honey_pay.a.h)paraml;
        paramString.a(new HoneyPayCheckPwdUI.16(this, paramString)).b(new h.a()
        {
          public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
          {
            if (HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this) != null) {
              HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this).bqn();
            }
            com.tencent.mm.plugin.report.service.h.mEJ.e(875L, 9L, 1L);
          }
        }).c(new HoneyPayCheckPwdUI.14(this));
        return true;
      }
      if ((paraml instanceof d))
      {
        paramString = (d)paraml;
        paramString.a(new HoneyPayCheckPwdUI.3(this, paramString)).b(new HoneyPayCheckPwdUI.2(this, paramString)).c(new HoneyPayCheckPwdUI.17(this));
        return true;
      }
      if ((paraml instanceof g))
      {
        paramString = (g)paraml;
        this.kkd = paramString.kjG.rHg;
        paramString.a(new HoneyPayCheckPwdUI.6(this)).b(new HoneyPayCheckPwdUI.5(this)).c(new HoneyPayCheckPwdUI.4(this));
        return true;
      }
    } while (!(paraml instanceof n));
    bfe();
    ((n)paraml).a(new h.a()
    {
      public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
      {
        HoneyPayCheckPwdUI.this.setResult(-1);
        HoneyPayCheckPwdUI.this.finish();
        com.tencent.mm.plugin.report.service.h.mEJ.e(875L, 6L, 1L);
      }
    }).b(new HoneyPayCheckPwdUI.8(this)).c(new HoneyPayCheckPwdUI.7(this));
    return true;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.honey_pay_check_pwd_ui;
  }
  
  protected final void initView()
  {
    this.kkY = ((EditHintPasswdView)findViewById(a.f.input_et));
    a.a(this.kkY);
    this.kkY.setOnInputValidListener(new HoneyPayCheckPwdUI.1(this));
    d(this.kkY, 0, false);
    this.gsY = ((TextView)findViewById(a.f.wallet_pwd_title));
    this.hVS = ((TextView)findViewById(a.f.wallet_pwd_content_1));
    if (this.fdx == 1) {
      this.gsY.setText(a.i.honey_pay_check_pwd_create_desc_text);
    }
    for (;;)
    {
      this.hVS.setText(a.i.honey_pay_check_pwd_title_text);
      return;
      if (this.fdx == 2) {
        this.gsY.setText(a.i.honey_pay_check_pwd_modify_desc_text);
      } else {
        this.gsY.setText(a.i.honey_pay_check_pwd_unbind_desc_text);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.gtX = getIntent().getStringExtra("key_username");
    this.kkZ = getIntent().getStringExtra("key_take_message");
    this.klb = getIntent().getLongExtra("key_credit_line", 0L);
    this.fdx = getIntent().getIntExtra("key_scene", 0);
    this.kkc = getIntent().getStringExtra("key_card_no");
    this.kla = getIntent().getStringExtra("key_wishing");
    if (this.fdx == 1)
    {
      this.klc = getIntent().getIntExtra("key_cardtype", 0);
      if (this.klc == 0)
      {
        x.w("MicroMsg.HoneyPayCheckPwdUI", "error card type: %s", new Object[] { Integer.valueOf(this.klc) });
        finish();
      }
    }
    if (this.fdx == 3) {
      paramBundle = new btd();
    }
    try
    {
      byte[] arrayOfByte = getIntent().getByteArrayExtra("key_toke_mess");
      if ((arrayOfByte == null) || (arrayOfByte.length == 0))
      {
        x.w("MicroMsg.HoneyPayCheckPwdUI", "toke mess is null when unbind !!!");
        finish();
      }
      paramBundle.aG(arrayOfByte);
      this.kkd = paramBundle;
    }
    catch (IOException paramBundle)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.HoneyPayCheckPwdUI", paramBundle, "", new Object[0]);
        finish();
      }
    }
    setMMTitle("");
    jr(2662);
    jr(2865);
    jr(2630);
    jr(2815);
    jr(2659);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2662);
    js(2865);
    js(2630);
    js(2815);
    js(2659);
  }
  
  public final void rj(int paramInt)
  {
    super.rj(paramInt);
    if (this.kkY != null) {
      this.kkY.bqn();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */