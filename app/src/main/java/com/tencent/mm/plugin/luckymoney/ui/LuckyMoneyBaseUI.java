package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.luckymoney.b.j;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.d.f;

public abstract class LuckyMoneyBaseUI
  extends MMActivity
  implements f
{
  public j kUg = null;
  
  public static void bbo() {}
  
  public final void b(int paramInt1, int paramInt2, String paramString, l paraml, boolean paramBoolean)
  {
    if ((!d(paramInt1, paramInt2, paramString, paraml)) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      h.bA(this, paramString);
      finish();
    }
  }
  
  public final void b(l paraml, boolean paramBoolean)
  {
    this.kUg.b(paraml, paramBoolean);
  }
  
  public final void bbp()
  {
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().show();
      lF(getResources().getColor(a.c.lucky_money_goldstyle_actionbar_bg_color));
    }
  }
  
  public final void bbq()
  {
    if (getSupportActionBar() != null) {
      getSupportActionBar().hide();
    }
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, l paraml);
  
  public final void jr(int paramInt)
  {
    this.kUg.jr(paramInt);
  }
  
  public final void js(int paramInt)
  {
    this.kUg.js(paramInt);
  }
  
  public final void l(l paraml)
  {
    this.kUg.b(paraml, true);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kUg = new j(this, this);
    this.kUg.jr(1554);
    this.kUg.jr(1575);
    this.kUg.jr(1668);
    this.kUg.jr(1581);
    this.kUg.jr(1685);
    this.kUg.jr(1585);
    this.kUg.jr(1514);
    this.kUg.jr(1682);
    this.kUg.jr(1612);
    this.kUg.jr(1643);
    this.kUg.jr(1558);
    lF(getResources().getColor(a.c.lucky_money_goldstyle_actionbar_bg_color));
    DN(getResources().getColor(a.c.lucky_money_goldstyle_envelop_primary_text_color));
    getLayoutId();
  }
  
  public void onDestroy()
  {
    this.kUg.js(1554);
    this.kUg.js(1575);
    this.kUg.js(1668);
    this.kUg.js(1581);
    this.kUg.js(1685);
    this.kUg.js(1585);
    this.kUg.js(1514);
    this.kUg.js(1682);
    this.kUg.js(1612);
    this.kUg.js(1643);
    this.kUg.js(1558);
    super.onDestroy();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.kUg.baU()) {
        this.kUg.baT();
      }
      if ((this.mController.contentView.getVisibility() == 8) || (this.mController.contentView.getVisibility() == 4)) {
        finish();
      }
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */