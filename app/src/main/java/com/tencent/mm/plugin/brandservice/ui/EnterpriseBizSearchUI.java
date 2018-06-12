package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import com.tencent.mm.modelvoiceaddr.ui.b;
import com.tencent.mm.modelvoiceaddr.ui.b.a;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.tools.o;

@a(3)
public class EnterpriseBizSearchUI
  extends MMActivity
  implements b.a, EnterpriseBizContactListView.b
{
  private String hpJ;
  private b hpe;
  private EnterpriseBizContactListView hpj;
  
  public final void Uq()
  {
    YC();
  }
  
  public final void Ur() {}
  
  public final void WW()
  {
    finish();
  }
  
  public final void WX() {}
  
  public final void WY() {}
  
  public final void WZ() {}
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt) {}
  
  public final boolean auW()
  {
    YC();
    return false;
  }
  
  protected final int getLayoutId()
  {
    return b.e.enterprise_biz_search;
  }
  
  protected final void initView()
  {
    if (bi.oW(this.hpJ))
    {
      this.hpJ = getIntent().getStringExtra("enterprise_biz_name");
      if (bi.oW(this.hpJ)) {
        finish();
      }
    }
    this.hpj = ((EnterpriseBizContactListView)findViewById(b.d.sort_and_search_view));
    this.hpj.setFatherBizName(this.hpJ);
    this.hpj.setExcludeBizChat(true);
    this.hpj.refresh();
    this.hpj.setMode(1);
    this.hpj.auX();
    this.hpj.cso();
    this.hpj.lP(false);
    this.hpj.setOnTouchListener(this);
    ((TextView)this.hpj.getNoResultView()).setText(b.h.enterprise_search_no_result);
    this.hpe = new b();
    this.hpe.mv(true);
    this.hpe.a(this);
    this.hpe.erG = false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.hpe.a(this, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.hpj != null) {
      EnterpriseBizContactListView.release();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    this.hpe.cancel();
    this.hpe.clearFocus();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.hpe.a(this, paramMenu);
    return true;
  }
  
  public final boolean pj(String paramString)
  {
    YC();
    return true;
  }
  
  public final void pk(String paramString)
  {
    x.i("MicroMsg.EnterpriseBizSearchUI", "search biz, key word : %s", new Object[] { paramString });
    this.hpj.aac(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/EnterpriseBizSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */