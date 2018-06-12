package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.tencent.mm.plugin.aa.a.c.b.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.c;

public class AAQueryListUI
  extends BaseAAPresenterActivity
{
  private com.tencent.mm.plugin.aa.a.c.b eBU = (com.tencent.mm.plugin.aa.a.c.b)t(com.tencent.mm.plugin.aa.a.c.b.class);
  private ListView eBV;
  private b eBW;
  private Dialog eBX;
  private boolean eBY = false;
  private boolean eBZ = false;
  private View eCa;
  private AAQueryListH5UrlFooterView eCb;
  private String eCc;
  private int mode = 1;
  
  private void d(boolean paramBoolean, int paramInt)
  {
    if (this.eBY)
    {
      x.i("MicroMsg.AAQueryListUI", "getNextPage, loading");
      return;
    }
    if (paramBoolean)
    {
      this.eBZ = false;
      this.eBV.removeFooterView(this.eCb);
    }
    this.eBY = true;
    b.a locala = this.eBU.eBm;
    com.tencent.mm.vending.g.g.v(Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt)).c(locala).f(new AAQueryListUI.6(this, paramBoolean)).a(new AAQueryListUI.5(this));
  }
  
  protected final int getLayoutId()
  {
    return a.g.aa_query_list_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      boolean bool = paramIntent.getBooleanExtra("close_aa", false);
      int i = paramIntent.getIntExtra("item_position", 0);
      int j = paramIntent.getIntExtra("item_offset", 0);
      if (bool)
      {
        this.eBV.setSelectionFromTop(i, j);
        d(true, this.mode);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new AAQueryListUI.1(this));
    setMMTitle(a.i.aa_record_list_launch_title);
    addIconOptionMenu(0, a.e.mm_title_btn_menu, new AAQueryListUI.4(this));
    this.eBV = ((ListView)findViewById(a.f.aa_query_listview));
    this.eBV.setOnScrollListener(new AAQueryListUI.2(this));
    this.eBV.setOnItemClickListener(new AAQueryListUI.3(this));
    this.eCa = new AAQueryListLoadingMoreView(this);
    this.eCb = new AAQueryListH5UrlFooterView(this);
    this.eBX = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
    this.eBW = new b(this, this.mode);
    this.eBV.setAdapter(this.eBW);
    this.eBV.setVisibility(4);
    d(false, this.mode);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/AAQueryListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */