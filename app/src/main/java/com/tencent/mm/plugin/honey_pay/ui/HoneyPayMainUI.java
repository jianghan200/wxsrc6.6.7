package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.honey_pay.a.a;
import com.tencent.mm.plugin.honey_pay.a.b;
import com.tencent.mm.plugin.honey_pay.a.f;
import com.tencent.mm.plugin.wallet_core.ui.m.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.baq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;

public class HoneyPayMainUI
  extends HoneyPayBaseUI
{
  private TextView klA;
  private ArrayList<HoneyPayCardLayout> klB = new ArrayList();
  private LinearLayout klv;
  private ImageView klw;
  private RelativeLayout klx;
  private Button kly;
  private LinearLayout klz;
  
  private void M(Intent paramIntent)
  {
    boolean bool = paramIntent.getBooleanExtra("key_create_succ", false);
    String str = paramIntent.getStringExtra("key_card_no");
    paramIntent = paramIntent.getStringExtra("key_card_type");
    x.i(this.TAG, "create succ: %s", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      a(str, true, paramIntent);
    }
  }
  
  private void a(String paramString1, boolean paramBoolean, String paramString2)
  {
    x.i(this.TAG, "go to card manager: %s", new Object[] { paramString1 });
    Intent localIntent = new Intent(this, HoneyPayCardManagerUI.class);
    localIntent.putExtra("key_card_no", paramString1);
    localIntent.putExtra("key_scene", 0);
    localIntent.putExtra("key_is_create", paramBoolean);
    localIntent.putExtra("key_card_type", paramString2);
    startActivityForResult(localIntent, 3);
  }
  
  private void fJ(boolean paramBoolean)
  {
    x.i(this.TAG, "get payer list");
    f localf = new f();
    localf.m(this);
    a(localf, paramBoolean, false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof f))
    {
      paramString = (f)paraml;
      paramString.a(new HoneyPayMainUI.9(this, paramString)).b(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.e(875L, 1L, 1L);
        }
      }).c(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.e(875L, 1L, 1L);
        }
      });
    }
    for (;;)
    {
      return true;
      if ((paraml instanceof a))
      {
        paramString = (a)paraml;
        paramString.a(new HoneyPayMainUI.12(this, paramString)).b(new HoneyPayMainUI.11(this, paramString)).c(new HoneyPayMainUI.10(this));
      }
      else if ((paraml instanceof b))
      {
        paramString = (b)paraml;
        paramString.a(new HoneyPayMainUI.3(this, paramString)).b(new HoneyPayMainUI.2(this)).c(new HoneyPayMainUI.13(this));
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.honey_pay_main_ui;
  }
  
  protected final void initView()
  {
    this.klz = ((LinearLayout)findViewById(a.f.hpmu_content_layout));
    this.klx = ((RelativeLayout)findViewById(a.f.hpou_empty_header_layout));
    this.klw = ((ImageView)findViewById(a.f.hpou_empty_header_iv));
    this.kly = ((Button)findViewById(a.f.hpou_empty_add_friend_btn));
    this.klA = ((TextView)findViewById(a.f.hpou_empty_header_tv));
    this.klv = ((LinearLayout)findViewById(a.f.hpou_add_friend_layout));
    this.klv.setOnClickListener(new HoneyPayMainUI.1(this));
    this.kly.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        x.i(HoneyPayMainUI.this.TAG, "click empty header add friend");
        HoneyPayMainUI.a(HoneyPayMainUI.this);
      }
    });
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 3) {
      fJ(false);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(2725);
    jr(2618);
    jr(2926);
    M(getIntent());
    initView();
    fJ(true);
    setMMTitle(a.i.honey_pay_main_title);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2725);
    js(2618);
    js(2926);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.i(this.TAG, "on new intent");
    M(paramIntent);
    super.onNewIntent(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */