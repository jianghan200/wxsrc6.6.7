package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.plugin.luckymoney.appbrand.a.i;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.alo;
import com.tencent.mm.protocal.c.ayk;
import com.tencent.mm.protocal.c.bee;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.e;
import java.util.LinkedList;
import java.util.List;

public class WxaLuckyMoneyDetailUI
  extends WxaLuckyMoneyBaseUI
  implements b
{
  private View Iq;
  private TextView hVS;
  private TextView hXT;
  private TextView kLF;
  private final a kLL = new d();
  private Intent kLM = null;
  private ListView kLN;
  private ImageView kLO;
  private TextView kLP;
  private ImageView kLQ;
  private View kLR;
  private View kLS;
  private c kLT;
  private AbsListView.OnScrollListener kLU = new WxaLuckyMoneyDetailUI.1(this);
  private TextView klp;
  private p tipDialog = null;
  
  private void a(i parami)
  {
    ActionBarActivity localActionBarActivity = this.mController.tml;
    o.a(this.kLO, parami.kLc, parami.username);
    o.a(localActionBarActivity, this.kLP, parami.nickname);
    o.a(localActionBarActivity, this.klp, parami.kLf);
    if (parami.kLe == 1)
    {
      this.kLQ.setVisibility(0);
      this.kLQ.setImageResource(a.e.lucky_money_group_icon);
      if (parami.kLd != 2) {
        break label196;
      }
      this.kLF.setText(e.A(parami.cfh / 100.0D));
      this.kLT.kLB = false;
      this.kLR.setVisibility(0);
      label116:
      if (bi.oW(parami.kLg)) {
        break label208;
      }
      this.kLS.setVisibility(0);
      this.hXT.setText(parami.kLg);
      this.hXT.setTextColor(getResources().getColor(a.c.lucky_money_operation_text_normal_color));
    }
    for (;;)
    {
      if (bi.oW(parami.kLh)) {
        break label220;
      }
      this.hVS.setText(parami.kLh);
      return;
      this.kLQ.setVisibility(8);
      break;
      label196:
      this.kLR.setVisibility(8);
      break label116;
      label208:
      this.kLS.setVisibility(8);
    }
    label220:
    this.hVS.setText(null);
  }
  
  public final void Ga(String paramString)
  {
    h.bA(this, paramString);
  }
  
  public final void P(Intent paramIntent)
  {
    this.kLM = paramIntent;
  }
  
  public final void a(ayk paramayk)
  {
    if (paramayk == null)
    {
      localObject = null;
      a((i)localObject);
      int i = paramayk.sbn;
      localObject = paramayk.sbi;
      bu(paramayk.sbi);
      return;
    }
    Object localObject = new i();
    ((i)localObject).username = paramayk.sbj;
    ((i)localObject).kLc = paramayk.sbl;
    ((i)localObject).nickname = paramayk.sbk;
    ((i)localObject).cfh = paramayk.cfh;
    ((i)localObject).kLg = paramayk.kLg;
    ((i)localObject).kLh = paramayk.kLh;
    if (paramayk.sbn == 0) {}
    for (boolean bool = false;; bool = true)
    {
      ((i)localObject).kLi = bool;
      ((i)localObject).kLe = paramayk.kLe;
      ((i)localObject).kLd = paramayk.kLd;
      ((i)localObject).kLf = paramayk.kLf;
      break;
    }
  }
  
  public final void a(bee parambee)
  {
    if (parambee == null)
    {
      localObject = null;
      a((i)localObject);
      int i = parambee.sbn;
      localObject = parambee.sbi;
      bu(parambee.sbi);
      return;
    }
    Object localObject = new i();
    ((i)localObject).username = parambee.sbj;
    ((i)localObject).kLc = parambee.sbl;
    ((i)localObject).nickname = parambee.sbk;
    ((i)localObject).cfh = parambee.cfh;
    ((i)localObject).kLg = parambee.kLg;
    ((i)localObject).kLh = parambee.kLh;
    if (parambee.sbn == 0) {}
    for (boolean bool = false;; bool = true)
    {
      ((i)localObject).kLi = bool;
      ((i)localObject).kLe = parambee.kLe;
      ((i)localObject).kLd = parambee.kLd;
      ((i)localObject).kLf = parambee.kLf;
      break;
    }
  }
  
  public final MMActivity baA()
  {
    return this;
  }
  
  public final void baB()
  {
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
  }
  
  public final void bu(List<alo> paramList)
  {
    c localc = this.kLT;
    if (paramList == null) {}
    for (localc.kLz = new LinkedList();; localc.kLz = paramList)
    {
      localc.notifyDataSetChanged();
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_detail_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.lucky_money_detail);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if (WxaLuckyMoneyDetailUI.c(WxaLuckyMoneyDetailUI.this) != null) {
          WxaLuckyMoneyDetailUI.this.setResult(0, WxaLuckyMoneyDetailUI.c(WxaLuckyMoneyDetailUI.this));
        }
        for (;;)
        {
          WxaLuckyMoneyDetailUI.this.finish();
          return true;
          WxaLuckyMoneyDetailUI.this.setResult(-1, null);
        }
      }
    });
    this.kLN = ((ListView)findViewById(a.f.lucky_money_detail_record_list));
    this.kLT = new c(this.mController.tml);
    this.Iq = LayoutInflater.from(this).inflate(a.g.lucky_money_detail_header, null);
    this.kLN.addHeaderView(this.Iq);
    this.kLN.setAdapter(this.kLT);
    this.kLT.kLB = false;
    this.kLN.setOnScrollListener(this.kLU);
    this.kLO = ((ImageView)this.Iq.findViewById(a.f.lucky_money_detail_sender_avatar));
    this.kLP = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_whose));
    this.kLQ = ((ImageView)this.Iq.findViewById(a.f.lucky_money_detail_group_icon));
    this.klp = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_wishing));
    this.kLR = this.Iq.findViewById(a.f.lucky_money_detail_amount_area);
    this.kLF = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_amount));
    this.kLS = this.Iq.findViewById(a.f.lucky_money_detail_layout);
    this.hXT = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_tips));
    this.hVS = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_desc));
    this.tipDialog = h.a(this.mController.tml, getString(a.i.loading_tips), true, new WxaLuckyMoneyDetailUI.3(this));
    this.tipDialog.show();
  }
  
  public void onBackPressed()
  {
    if (this.kLM != null) {
      setResult(0, this.kLM);
    }
    for (;;)
    {
      finish();
      return;
      setResult(-1, null);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    this.kLL.a(this, getIntent());
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    boolean bool = super.onCreatePanelMenu(paramInt, paramMenu);
    paramMenu = (TextView)findViewById(a.f.action_option_text);
    if (paramMenu != null) {
      paramMenu.setTextColor(getResources().getColor(a.c.lucky_money_goldstyle_envelop_primary_text_color));
    }
    return bool;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */