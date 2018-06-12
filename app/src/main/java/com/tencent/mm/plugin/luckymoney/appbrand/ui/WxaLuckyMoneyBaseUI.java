package com.tencent.mm.plugin.luckymoney.appbrand.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyCompleteUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI;
import com.tencent.mm.plugin.luckymoney.ui.j;
import com.tencent.mm.plugin.luckymoney.ui.j.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public abstract class WxaLuckyMoneyBaseUI
  extends MMActivity
{
  private c kLj = null;
  private int kLk = 4095;
  private final SparseArray<d.a> kLl = new SparseArray();
  private final Class[][] kLm;
  
  public WxaLuckyMoneyBaseUI()
  {
    Class[] arrayOfClass = { com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.b.class, WxaLuckyMoneyDetailUI.class };
    this.kLm = new Class[][] { { com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.b.class, WxaLuckyMoneyReceiveUI.class }, { com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.c.class, WxaLuckyMoneyPrepareUI.class }, arrayOfClass, { com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.b.class, WxaLuckyMoneyCompleteUI.class } };
  }
  
  private Class<? extends MMActivity> D(Class paramClass)
  {
    Class<? extends MMActivity> localClass = null;
    Class[][] arrayOfClass = this.kLm;
    int j = arrayOfClass.length;
    int i = 0;
    while (i < j)
    {
      Class[] arrayOfClass1 = arrayOfClass[i];
      if (arrayOfClass1[0] == paramClass) {
        localClass = arrayOfClass1[1];
      }
      i += 1;
    }
    return localClass;
  }
  
  public final void a(Class paramClass, Intent paramIntent, d.a parama)
  {
    if (getMainLooper().getThread() != Thread.currentThread())
    {
      runOnUiThread(new WxaLuckyMoneyBaseUI.1(this, paramClass, paramIntent, parama));
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    paramIntent = D(paramClass);
    if (paramIntent == null) {
      throw new IllegalStateException("proceed to ui = [" + paramClass.getName() + "], but Target is null");
    }
    localIntent.setClass(this.mController.tml, paramIntent);
    if (parama == null)
    {
      startActivity(localIntent);
      return;
    }
    int i = this.kLk;
    this.kLk = (i + 1);
    startActivityForResult(localIntent, i);
    this.kLl.put(i, parama);
  }
  
  public final void b(int paramInt, Intent paramIntent)
  {
    setResult(paramInt, paramIntent);
    finish();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    d.a locala = (d.a)this.kLl.get(paramInt1);
    if (locala != null)
    {
      x.i("MicroMsg.HjLuckyMoneyBaseUI", "damon warns you, requestCode == [%d], I used it, and skip. check your code if needed!!!!", new Object[] { Integer.valueOf(paramInt1) });
      locala.c(paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kLj = new c(this);
    this.kLj.kXx = 1;
    paramBundle = this.kLj;
    Object localObject1 = paramBundle.fcq;
    int i = paramBundle.kXx;
    j.a locala = new j.a();
    localObject1 = ((Context)localObject1).getResources();
    switch (i)
    {
    default: 
      locala.kXz = ((Resources)localObject1).getDrawable(a.e.lucky_money_actionbar_bg);
      locala.gND = -1;
      locala.kXB = ((Resources)localObject1).getColor(a.c.lucky_money_subtitle_color);
    }
    for (locala.kXD = ((Resources)localObject1).getColor(a.c.lucky_money_base_status_bar_color);; locala.kXD = ((Resources)localObject1).getColor(a.c.lucky_money_goldstyle_status_bar_color))
    {
      if (paramBundle.fcq.getSupportActionBar() != null)
      {
        if (locala.kXz != null) {
          paramBundle.fcq.getSupportActionBar().setBackgroundDrawable(locala.kXz);
        }
        localObject1 = paramBundle.fcq.getSupportActionBar().getCustomView();
        if (localObject1 != null)
        {
          Object localObject2 = ((View)localObject1).findViewById(a.f.divider);
          if ((localObject2 != null) && (locala.gND != 0)) {
            ((View)localObject2).setBackgroundColor(locala.gND);
          }
          localObject2 = (TextView)((View)localObject1).findViewById(16908308);
          if ((localObject2 != null) && (locala.kXA != 0)) {
            ((TextView)localObject2).setTextColor(locala.kXA);
          }
          localObject2 = (TextView)((View)localObject1).findViewById(16908309);
          if ((localObject2 != null) && (locala.kXB != 0)) {
            ((TextView)localObject2).setTextColor(locala.kXB);
          }
          localObject1 = (ImageView)((View)localObject1).findViewById(a.f.actionbar_up_indicator_btn);
          if ((localObject1 != null) && (locala.kXC != 0)) {
            ((ImageView)localObject1).setImageResource(locala.kXC);
          }
        }
        if (locala.kXD != 0)
        {
          i = locala.kXD;
          if (j.bbD())
          {
            paramBundle = paramBundle.fcq.getWindow();
            paramBundle.addFlags(Integer.MIN_VALUE);
            paramBundle.setStatusBarColor(i);
          }
        }
      }
      return;
      locala.kXz = new ColorDrawable(((Resources)localObject1).getColor(a.c.lucky_money_goldstyle_actionbar_bg_color));
      locala.gND = ((Resources)localObject1).getColor(a.c.lucky_money_goldstyle_actionbar_primary_text_color);
      locala.kXA = ((Resources)localObject1).getColor(a.c.lucky_money_goldstyle_envelop_primary_text_color);
      locala.kXB = ((Resources)localObject1).getColor(a.c.lucky_money_goldstyle_envelop_primary_text_color);
      locala.kXC = a.e.lucky_money_back_btn;
    }
  }
  
  public void onDestroy()
  {
    this.kLj = null;
    this.kLl.clear();
    super.onDestroy();
  }
  
  public final void p(Drawable paramDrawable)
  {
    this.kLj.p(paramDrawable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */