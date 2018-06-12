package com.tencent.mm.plugin.sns.lucky.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.LinkedList;
import java.util.List;

public class SnsLuckyMoneyDetailUI
  extends LuckyMoneyBaseUI
{
  private ListView kLN;
  AbsListView.OnScrollListener kLU = new SnsLuckyMoneyDetailUI.1(this);
  private final int kVm = 750;
  private final int kVn = 240;
  private b nmf;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getLayoutId()
  {
    return a.g.snslucky_money_detail_ui;
  }
  
  protected final void initView()
  {
    getResources().getDrawable(a.e.lucky_money_actionbar_bg);
    setMMTitle(a.i.sns_lucky_detail_ui_title);
    setBackBtn(new SnsLuckyMoneyDetailUI.2(this));
    this.kLN = ((ListView)findViewById(a.f.lucky_money_detail_record_list));
    this.nmf = new b(this.mController.tml);
    this.kLN.setAdapter(this.nmf);
    this.kLN.setOnScrollListener(this.kLU);
    this.kLN.setOnItemClickListener(new SnsLuckyMoneyDetailUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    paramBundle = a.FZ(getIntent().getStringExtra("key_feedid"));
    if ((paramBundle == null) || (paramBundle.size() == 0))
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        int i = getResources().getColor(a.c.sns_lucky_detail_ui_status_bar_color);
        getWindow().setStatusBarColor(i);
      }
      setMMSubTitle(null);
      return;
    }
    b localb = this.nmf;
    if (paramBundle == null) {
      new LinkedList();
    }
    for (;;)
    {
      localb.notifyDataSetChanged();
      break;
      localb.kLz = paramBundle;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */