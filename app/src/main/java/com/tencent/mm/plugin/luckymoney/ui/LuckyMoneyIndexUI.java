package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.plugin.luckymoney.b.d;
import com.tencent.mm.plugin.luckymoney.b.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.s.b;

public class LuckyMoneyIndexUI
  extends LuckyMoneyBaseUI
{
  private int kTw;
  private LinearLayout kVp;
  private LinearLayout kVq;
  private LinearLayout kVr;
  
  private void bbu()
  {
    a.bat();
    d locald = a.bau().baS();
    if (locald == null) {
      return;
    }
    ImageView localImageView = (ImageView)findViewById(a.f.lucky_money_index_top_decoration);
    if ((locald.kPG & 0x1) == 1)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyIndexUI", "initView: topBg use money bg");
      localImageView.setImageResource(a.e.lucky_money_index_top_decoration);
      return;
    }
    localImageView.setImageResource(a.e.lucky_money_index_topbg_temporary);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.x))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.luckymoney.b.x)paraml;
        paraml = new g.c();
        paraml.textColor = getResources().getColor(a.c.lucky_money_index_operation_text_color);
        paraml.kWN = 101;
        g.a(this, this.kVp, paramString.kQa, paraml, "Text");
        paraml = new g.c();
        paraml.textColor = getResources().getColor(a.c.lucky_money_index_operation_text_color);
        paraml.kWN = 100;
        g.a(this, this.kVq, paramString.kRi, paraml, "Text");
        paraml = new g.c();
        paraml.kWN = 102;
        g.a(this, this.kVr, paramString.kRg, paraml, "Pic");
        bbu();
      }
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_index_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.lucky_money_title);
    setBackBtn(new LuckyMoneyIndexUI.1(this));
    this.kVp = ((LinearLayout)findViewById(a.f.lucky_money_index_tail_opertaion));
    this.kVq = ((LinearLayout)findViewById(a.f.lucky_money_index_middle_opertaion));
    this.kVr = ((LinearLayout)findViewById(a.f.lucky_money_index_banner_opertaion));
    ((Button)findViewById(a.f.lucky_money_index_normal)).setOnClickListener(new LuckyMoneyIndexUI.2(this));
    ((Button)findViewById(a.f.lucky_money_index_group)).setOnClickListener(new LuckyMoneyIndexUI.3(this));
    a(0, getString(a.i.lucky_money_mine_title), new LuckyMoneyIndexUI.4(this), s.b.tne);
    bbu();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((b)com.tencent.mm.kernel.g.l(b.class)).a(this, null);
    initView();
    b(new com.tencent.mm.plugin.luckymoney.b.x("v1.0", (byte)0), false);
    this.kTw = getIntent().getIntExtra("pay_channel", -1);
    h.mEJ.h(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
  }
  
  protected void onResume()
  {
    super.onResume();
    b localb = (b)com.tencent.mm.kernel.g.l(b.class);
    localb.a(this, localb.bRo(), null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */